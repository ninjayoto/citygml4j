package org.citygml4j.model.citygml.building;

import java.util.List;

import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.core.CityObject;
import org.citygml4j.model.citygml.core.ImplicitRepresentationProperty;
import org.citygml4j.model.gml.GeometryProperty;

public interface BuildingFurniture extends CityObject {
	public String getClazz();
	public List<String> getFunction();
	public List<String> getUsage();
	public GeometryProperty getLod4Geometry();
	public ImplicitRepresentationProperty getLoD4ImplicitRepresentation();
	public List<ADEComponent> getGenericApplicationPropertyOfBuildingFurniture();
	public boolean isSetClazz();
	public boolean isSetFunction();
	public boolean isSetUsage();
	public boolean isSetLod4Geometry();
	public boolean isSetLoD4ImplicitRepresentation();
	public boolean isSetGenericApplicationPropertyOfBuildingFurniture();
	
	public void setClazz(String clazz);
	public void setFunction(List<String> function);
	public void addFunction(String function);
	public void setUsage(List<String> usage);
	public void addUsage(String usage);
	public void setLod4Geometry(GeometryProperty lod4Geometry);
	public void setLoD4ImplicitRepresentation(ImplicitRepresentationProperty lod4ImplicitRepresentation);	
	public void addGenericApplicationPropertyOfBuildingFurniture(ADEComponent adeObject);
	public void setGenericApplicationPropertyOfBuildingFurniture(List<ADEComponent> adeObject);
	public void unsetClazz();
	public void unsetFunction();
	public boolean unsetFunction(String function);
	public void unsetUsage();
	public boolean unsetUsage(String usage);
	public void unsetLod4Geometry();
	public void unsetLoD4ImplicitRepresentation();
	public void unsetGenericApplicationPropertyOfBuildingFurniture();
	public boolean unsetGenericApplicationPropertyOfBuildingFurniture(ADEComponent adeObject);
}
