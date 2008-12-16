package org.citygml4j.model.citygml.building;

import java.util.List;

import org.citygml4j.model.citygml.ade.ADEComponent;

public interface FloorSurface extends BoundarySurface {
	public List<ADEComponent> getGenericApplicationPropertyOfFloorSurface();
	public boolean isSetGenericApplicationPropertyOfFloorSurface();
	
	public void addGenericApplicationPropertyOfFloorSurface(ADEComponent adeObject);
	public void setGenericApplicationPropertyOfFloorSurface(List<ADEComponent> adeObject);
	public void unsetGenericApplicationPropertyOfFloorSurface();
	public boolean unsetGenericApplicationPropertyOfFloorSurface(ADEComponent adeObject);
}
