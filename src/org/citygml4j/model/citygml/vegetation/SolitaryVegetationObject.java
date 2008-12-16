package org.citygml4j.model.citygml.vegetation;

import java.util.List;

import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.core.ImplicitRepresentationProperty;
import org.citygml4j.model.gml.GeometryProperty;
import org.citygml4j.model.gml.Length;

public interface SolitaryVegetationObject extends VegetationObject {
	public String getClazz();
	public List<String> getFunction();
	public String getSpecies();
	public Length getHeight();
	public Length getTrunkDiameter();
	public Length getCrownDiameter();
	public GeometryProperty getLod1Geometry();
	public GeometryProperty getLod2Geometry();
	public GeometryProperty getLod3Geometry();
	public GeometryProperty getLod4Geometry();
	public ImplicitRepresentationProperty getLod1ImplicitRepresentation();
	public ImplicitRepresentationProperty getLod2ImplicitRepresentation();
	public ImplicitRepresentationProperty getLod3ImplicitRepresentation();
	public ImplicitRepresentationProperty getLod4ImplicitRepresentation();
	public List<ADEComponent> getGenericApplicationPropertyOfSolitaryVegetationObject();
	public boolean isSetClazz();
	public boolean isSetFunction();
	public boolean isSetSpecies();
	public boolean isSetHeight();
	public boolean isSetTrunkDiameter();
	public boolean isSetCrownDiameter();
	public boolean isSetLod1Geometry();
	public boolean isSetLod2Geometry();
	public boolean isSetLod3Geometry();
	public boolean isSetLod4Geometry();
	public boolean isSetLod1ImplicitRepresentation();
	public boolean isSetLod2ImplicitRepresentation();
	public boolean isSetLod3ImplicitRepresentation();
	public boolean isSetLod4ImplicitRepresentation();
	public boolean isSetGenericApplicationPropertyOfSolitaryVegetationObject();

	public void setClazz(String clazz);
	public void setFunction(List<String> function);
	public void addFunction(String function);
	public void setSpecies(String species);
	public void setHeight(Length height);
	public void setTrunkDiameter(Length trunkDiameter);
	public void setCrownDiameter(Length crownDiameter);
	public void setLod1Geometry(GeometryProperty lod1Geometry);
	public void setLod2Geometry(GeometryProperty lod2Geometry);
	public void setLod3Geometry(GeometryProperty lod3Geometry);
	public void setLod4Geometry(GeometryProperty lod4Geometry);
	public void setLod1ImplicitRepresentation(ImplicitRepresentationProperty lod1ImplicitRepresentation);
	public void setLod2ImplicitRepresentation(ImplicitRepresentationProperty lod2ImplicitRepresentation);
	public void setLod3ImplicitRepresentation(ImplicitRepresentationProperty lod3ImplicitRepresentation);
	public void setLod4ImplicitRepresentation(ImplicitRepresentationProperty lod4ImplicitRepresentation);	
	public void addGenericApplicationPropertyOfSolitaryVegetationObject(ADEComponent adeObject);
	public void setGenericApplicationPropertyOfSolitaryVegetationObject(List<ADEComponent> adeObject);
	public void unsetClazz();
	public void unsetFunction();
	public boolean unsetFunction(String function);
	public void unsetSpecies();
	public void unsetHeight();
	public void unsetTrunkDiameter();
	public void unsetCrownDiameter();
	public void unsetLod1Geometry();
	public void unsetLod2Geometry();
	public void unsetLod3Geometry();
	public void unsetLod4Geometry();
	public void unsetLod1ImplicitRepresentation();
	public void unsetLod2ImplicitRepresentation();
	public void unsetLod3ImplicitRepresentation();
	public void unsetLod4ImplicitRepresentation();
	public void unsetGenericApplicationPropertyOfSolitaryVegetationObject();
	public boolean unsetGenericApplicationPropertyOfSolitaryVegetationObject(ADEComponent adeObject);
}
