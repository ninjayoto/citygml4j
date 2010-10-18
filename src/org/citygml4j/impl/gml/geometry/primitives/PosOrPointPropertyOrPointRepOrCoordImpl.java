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

import java.util.ArrayList;
import java.util.List;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.common.base.ModelType;
import org.citygml4j.model.gml.GMLClass;
import org.citygml4j.model.gml.geometry.primitives.Coord;
import org.citygml4j.model.gml.geometry.primitives.DirectPosition;
import org.citygml4j.model.gml.geometry.primitives.PointProperty;
import org.citygml4j.model.gml.geometry.primitives.PointRep;
import org.citygml4j.model.gml.geometry.primitives.PosOrPointPropertyOrPointRepOrCoord;

public class PosOrPointPropertyOrPointRepOrCoordImpl implements PosOrPointPropertyOrPointRepOrCoord {
	private DirectPosition pos;
	private PointProperty pointProperty;
	private PointRep pointRep;
	private Coord coord;
	private ModelObject parent;
	
	public PosOrPointPropertyOrPointRepOrCoordImpl() {
		
	}
	
	public PosOrPointPropertyOrPointRepOrCoordImpl(DirectPosition pos) {
		setPos(pos);
	}
	
	public PosOrPointPropertyOrPointRepOrCoordImpl(PointProperty pointProperty) {
		setPointProperty(pointProperty);
	}
	
	public PosOrPointPropertyOrPointRepOrCoordImpl(PointRep pointRep) {
		setPointRep(pointRep);
	}
	
	public PosOrPointPropertyOrPointRepOrCoordImpl(Coord coord) {
		setCoord(coord);
	}
	
	public PointProperty getPointProperty() {
		return pointProperty;
	}

	public PointRep getPointRep() {
		return pointRep;
	}

	public DirectPosition getPos() {
		return pos;
	}

	public Coord getCoord() {
		return coord;
	}

	public boolean isSetPointProperty() {
		return pointProperty != null;
	}

	public boolean isSetPointRep() {
		return pointRep != null;
	}

	public boolean isSetPos() {
		return pos != null;
	}

	public boolean isSetCoord() {
		return coord != null;
	}

	public void setPos(DirectPosition pos) {
		if (pos != null)
			pos.setParent(this);
		
		this.pos = pos;
		unsetPointProperty();
		unsetPointRep();
		unsetCoord();
	}

	public void setPointProperty(PointProperty pointProperty) {
		if (pointProperty != null)
			pointProperty.setParent(this);
		
		this.pointProperty = pointProperty;
		unsetPointRep();
		unsetPos();
		unsetCoord();
	}

	public void setPointRep(PointRep pointRep) {
		if (pointRep != null)
			pointRep.setParent(this);
		
		this.pointRep = pointRep;
		unsetPointProperty();
		unsetPos();
		unsetCoord();
	}

	public void setCoord(Coord coord) {
		if (coord != null)
			coord.setParent(this);
		
		this.coord = coord;
		unsetPointProperty();
		unsetPointRep();
		unsetPos();
	}

	public List<Double> toList3d() {
		List<Double> tmp = new ArrayList<Double>();

		if (isSetPos())
			tmp.addAll(pos.toList3d());
		else if (isSetPointProperty() && pointProperty.isSetPoint())
			tmp.addAll(pointProperty.getPoint().toList3d());
		else if (isSetPointRep() && pointRep.isSetPoint())
			tmp.addAll(pointRep.getPoint().toList3d());
		else if (isSetCoord())
			tmp.addAll(coord.toList3d());

		return tmp;
	}

	public void unsetPointProperty() {
		if (isSetPointProperty())
			pointProperty.unsetParent();
		
		pointProperty = null;
	}

	public void unsetPointRep() {
		if (isSetPointRep())
			pointRep.unsetParent();
		
		pointRep = null;
	}

	public void unsetPos() {
		if (isSetPos())
			pos.unsetParent();
		
		pos = null;
	}
	
	public void unsetCoord() {
		if (isSetCoord())
			coord.unsetParent();
		
		coord = null;
	}

	public ModelObject getParent() {
		return parent;
	}

	public void setParent(ModelObject parent) {
		this.parent = parent;
	}

	public boolean isSetParent() {
		return parent != null;
	}

	public void unsetParent() {
		parent = null;
	}
	
	public ModelType getModelType() {
		return ModelType.GML;
	}
	
	public GMLClass getGMLClass() {
		return GMLClass.POS_OR_POINT_PROPERTY_OR_POINT_REP_OR_COORD;
	}

	public Object copy(CopyBuilder copyBuilder) {
		return copyTo(new PosOrPointPropertyOrPointRepOrCoordImpl(), copyBuilder);
	}

	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		PosOrPointPropertyOrPointRepOrCoord copy = (target == null) ? new PosOrPointPropertyOrPointRepOrCoordImpl() : (PosOrPointPropertyOrPointRepOrCoord)target;
		
		if (isSetPointProperty()) {
			copy.setPointProperty((PointProperty)copyBuilder.copy(pointProperty));
			if (copy.getPointProperty() == pointProperty)
				pointProperty.setParent(this);
		}
		
		if (isSetPointRep()) {
			copy.setPointRep((PointRep)copyBuilder.copy(pointRep));
			if (copy.getPointRep() == pointRep)
				pointRep.setParent(this);
		}
		
		if (isSetPos()) {
			copy.setPos((DirectPosition)copyBuilder.copy(pos));
			if (copy.getPos() == pos)
				pos.setParent(this);
		}
		
		if (isSetCoord()) {
			copy.setCoord((Coord)copyBuilder.copy(coord));
			if (copy.getCoord() == coord)
				coord.setParent(this);
		}
		
		copy.unsetParent();
		
		return copy;
	}

}