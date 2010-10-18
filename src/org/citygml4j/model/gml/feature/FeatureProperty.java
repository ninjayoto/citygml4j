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
package org.citygml4j.model.gml.feature;

import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.gml.base.AssociationByRepOrRef;

public interface FeatureProperty<T extends AbstractFeature> extends AssociationByRepOrRef<T> {
	public T getFeature();
	public ADEComponent getGenericADEComponent();
	public boolean isSetFeature();
	public boolean isSetGenericADEComponent();
	
	public void setFeature(T feature);
	public void setGenericADEComponent(ADEComponent genericADEComponent);
	public void unsetFeature();
	public void unsetGenericADEComponent();
}