/*
 * This file is part of citygml4j.
 * Copyright (c) 2007 - 2010
 * Institute for Geodesy and Geoinformation Science
 * Technische Universit�t Berlin, Germany
 * http://www.igg.tu-berlin.de/
 *
 * The citygml4j library is free software:
 * you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library. If not, see 
 * <http://www.gnu.org/licenses/>.
 */
package org.citygml4j.impl.gml.geometry.primitives;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.geometry.BoundingBox;
import org.citygml4j.model.common.visitor.GMLFunctor;
import org.citygml4j.model.common.visitor.GMLVisitor;
import org.citygml4j.model.common.visitor.GeometryFunctor;
import org.citygml4j.model.common.visitor.GeometryVisitor;
import org.citygml4j.model.gml.GMLClass;
import org.citygml4j.model.gml.geometry.primitives.OrientableSurface;
import org.citygml4j.model.gml.geometry.primitives.SurfaceProperty;

public class OrientableSurfaceImpl extends AbstractSurfaceImpl implements OrientableSurface {
	private SurfaceProperty baseSurface;
	private String orientation;

	public SurfaceProperty getBaseSurface() {
		return baseSurface;
	}

	public String getOrientation() {
		if (orientation == null)
			return "+";
		else
			return orientation;
	}

	public boolean isSetBaseSurface() {
		return baseSurface != null;
	}

	public boolean isSetOrientation() {
		return orientation != null;
	}

	public void setBaseSurface(SurfaceProperty baseSurface) {
		if (baseSurface != null)
			baseSurface.setParent(this);

		this.baseSurface = baseSurface;
	}

	public void setOrientation(String orientation) {
		if (orientation.equals("+") || orientation.equals("-"))
			this.orientation = orientation;
	}

	public void unsetBaseSurface() {
		if (isSetBaseSurface())
			baseSurface.unsetParent();
		
		baseSurface = null;
	}

	public void unsetOrientation() {
		orientation = null;
	}

	public BoundingBox calcBoundingBox() {
		BoundingBox bbox = new BoundingBox();
		
		if (isSetBaseSurface() && baseSurface.isSetSurface())
			bbox.update(baseSurface.getSurface().calcBoundingBox());
		
		if (bbox.getLowerCorner().isEqual(Double.MAX_VALUE) && 
				bbox.getUpperCorner().isEqual(-Double.MAX_VALUE))
			return null;
		else
			return bbox;
	}

	public GMLClass getGMLClass() {
		return GMLClass.ORIENTABLE_SURFACE;
	}

	public Object copy(CopyBuilder copyBuilder) {
		return copyTo(new OrientableSurfaceImpl(), copyBuilder);
	}

	@Override
	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		OrientableSurface copy = (target == null) ? new OrientableSurfaceImpl() : (OrientableSurface)target;
		super.copyTo(copy, copyBuilder);
		
		if (isSetBaseSurface()) {
			copy.setBaseSurface((SurfaceProperty)copyBuilder.copy(baseSurface));
			if (copy.getBaseSurface() == baseSurface)
				baseSurface.setParent(this);
		}
		
		if (isSetOrientation())
			copy.setOrientation(copyBuilder.copy(orientation));
		
		return copy;
	}
	
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
	}

	public <T> T accept(GeometryFunctor<T> visitor) {
		return visitor.apply(this);
	}
	
	public void accept(GMLVisitor visitor) {
		visitor.visit(this);
	}
	
	public <T> T accept(GMLFunctor<T> visitor) {
		return visitor.apply(this);
	}

}