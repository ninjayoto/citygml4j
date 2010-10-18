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
package org.citygml4j.impl.gml.coverage;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.common.base.ModelObject;
import org.citygml4j.model.common.base.ModelType;
import org.citygml4j.model.gml.GMLClass;
import org.citygml4j.model.gml.basicTypes.Coordinates;
import org.citygml4j.model.gml.basicTypes.DoubleOrNullList;
import org.citygml4j.model.gml.coverage.DataBlock;
import org.citygml4j.model.gml.coverage.RangeParameters;

public class DataBlockImpl implements DataBlock {
	private RangeParameters rangeParameters;
	private Coordinates tupleList;
	private DoubleOrNullList doubleOrNullTupleList;
	private ModelObject parent;

	public ModelType getModelType() {
		return ModelType.GML;
	}
	
	public GMLClass getGMLClass() {
		return GMLClass.DATA_BLOCK;
	}

	public RangeParameters getRangeParameters() {
		return rangeParameters;
	}

	public Coordinates getTupleList() {
		return tupleList;
	}

	public DoubleOrNullList getDoubleOrNullTupleList() {
		return doubleOrNullTupleList;
	}

	public boolean isSetRangeParameters() {
		return rangeParameters != null;
	}

	public boolean isSetTupleList() {
		return tupleList != null;
	}

	public boolean isSetDoubleOrNullTupleList() {
		return doubleOrNullTupleList != null;
	}

	public void setRangeParameters(RangeParameters rangeParameters) {
		if (rangeParameters != null)
			rangeParameters.setParent(this);
		
		this.rangeParameters = rangeParameters;
	}

	public void setTupleList(Coordinates tupleList) {
		if (tupleList != null)
			tupleList.setParent(this);
		
		this.tupleList = tupleList;
		
		unsetDoubleOrNullTupleList();
	}

	public void setDoubleOrNullTupleList(DoubleOrNullList doubleOrNullTupleList) {
		if (doubleOrNullTupleList != null)
			doubleOrNullTupleList.setParent(this);
		
		this.doubleOrNullTupleList = doubleOrNullTupleList;
		
		unsetTupleList();
	}

	public void unsetRangeParameters() {
		if (isSetRangeParameters())
			rangeParameters.unsetParent();
		
		rangeParameters = null;
	}

	public void unsetTupleList() {
		if (isSetTupleList())
			tupleList.unsetParent();
		
		tupleList = null;
	}

	public void unsetDoubleOrNullTupleList() {
		if (isSetDoubleOrNullTupleList())
			doubleOrNullTupleList.unsetParent();
		
		doubleOrNullTupleList = null;
	}
	
	public ModelObject getParent() {
		return parent;
	}

	public boolean isSetParent() {
		return parent != null;
	}

	public void setParent(ModelObject parent) {
		this.parent = parent;
	}

	public void unsetParent() {
		parent = null;
	}
	
	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		DataBlock copy = (target == null) ? new DataBlockImpl() : (DataBlock)target;
		
		if (isSetRangeParameters()) {
			copy.setRangeParameters((RangeParameters)copyBuilder.copy(rangeParameters));
			if (copy.getRangeParameters() == rangeParameters)
				rangeParameters.setParent(this);
		}
		
		if (isSetTupleList()) {
			copy.setTupleList((Coordinates)copyBuilder.copy(tupleList));
			if (copy.getTupleList() == tupleList)
				tupleList.setParent(this);
		}
		
		if (isSetDoubleOrNullTupleList()) {
			copy.setDoubleOrNullTupleList((DoubleOrNullList)copyBuilder.copy(doubleOrNullTupleList));
			if (copy.getDoubleOrNullTupleList() == doubleOrNullTupleList)
				doubleOrNullTupleList.setParent(this);
		}
		
		copy.unsetParent();
		
		return copy;
	}

	public Object copy(CopyBuilder copyBuilder) {
		return copyTo(new DataBlockImpl(), copyBuilder);
	}

}