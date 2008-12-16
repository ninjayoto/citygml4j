package org.citygml4j.model.citygml.building;

import java.util.List;

import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.core.CityObject;
import org.citygml4j.model.gml.GeometryProperty;

public interface BuildingInstallation extends CityObject {
	public String getClazz();
	public List<String> getFunction();
	public List<String> getUsage();
	public GeometryProperty getLod2Geometry();
	public GeometryProperty getLod3Geometry();
	public GeometryProperty getLod4Geometry();
	public List<ADEComponent> getGenericApplicationPropertyOfBuildingInstallation();
	public boolean isSetClazz();
	public boolean isSetFunction();
	public boolean isSetUsage();
	public boolean isSetLod2Geometry();
	public boolean isSetLod3Geometry();
	public boolean isSetLod4Geometry();
	public boolean isSetGenericApplicationPropertyOfBuildingInstallation();
	
	public void setClazz(String clazz);
	public void setFunction(List<String> function);
	public void addFunction(String function);
	public void setUsage(List<String> usage);
	public void addUsage(String usage);
	public void setLod2Geometry(GeometryProperty lod2Geometry);
	public void setLod3Geometry(GeometryProperty lod3Geometry);
	public void setLod4Geometry(GeometryProperty lod4Geometry);	
	public void addGenericApplicationPropertyOfBuildingInstallation(ADEComponent adeObject);
	public void setGenericApplicationPropertyOfBuildingInstallation(List<ADEComponent> adeObject);
	public void unsetClazz();
	public void unsetFunction();
	public boolean unsetFunction(String function);
	public void unsetUsage();
	public boolean unsetUsage(String usage);
	public void unsetLod2Geometry();
	public void unsetLod3Geometry();
	public void unsetLod4Geometry();
	public void unsetGenericApplicationPropertyOfBuildingInstallation();
	public boolean unsetGenericApplicationPropertyOfBuildingInstallation(ADEComponent adeObject);
}
