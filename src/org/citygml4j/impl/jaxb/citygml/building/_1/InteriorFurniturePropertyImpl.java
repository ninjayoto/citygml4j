package org.citygml4j.impl.jaxb.citygml.building._1;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.impl.jaxb.gml._3_1_1.AssociationImpl;
import org.citygml4j.jaxb.citygml.bldg._1.BuildingFurnitureType;
import org.citygml4j.jaxb.citygml.bldg._1.InteriorFurniturePropertyType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.building.BuildingFurniture;
import org.citygml4j.model.citygml.building.BuildingModule;
import org.citygml4j.model.citygml.building.InteriorFurnitureProperty;

public class InteriorFurniturePropertyImpl extends AssociationImpl<BuildingFurniture> implements InteriorFurnitureProperty {
	private InteriorFurniturePropertyType interiorFurniturePropertyType;

	public InteriorFurniturePropertyImpl() {
		this(new InteriorFurniturePropertyType());
	}

	public InteriorFurniturePropertyImpl(InteriorFurniturePropertyType interiorFurniturePropertyType) {
		super(interiorFurniturePropertyType);
		this.interiorFurniturePropertyType = interiorFurniturePropertyType;
	}

	@Override
	public InteriorFurniturePropertyType getJAXBObject() {
		return interiorFurniturePropertyType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.INTERIORFURNITUREPROPERTY;
	}
	
	@Override
	public final CityGMLModule getCityGMLModule() {
		return BuildingModule.v1_0_0;
	}

	@Override
	public BuildingFurniture getObject() {
		if (interiorFurniturePropertyType.isSet_Object()) {
			JAXBElement<?> interiorFurniture = interiorFurniturePropertyType.get_Object();
			
			if (interiorFurniture.getValue() != null) {
				Object elem = interiorFurniture.getValue();
				QName name = interiorFurniture.getName();
				
				if (elem instanceof BuildingFurnitureType)
					return ModelMapper.BLDG_1.toCityGML((BuildingFurnitureType)elem, name);
			}
		}

		return null;
	}

	@Override
	public void setObject(BuildingFurniture object) {
		JAXBElement<?> jaxbElem = ModelMapper.BLDG_1.toJAXB(object);
		interiorFurniturePropertyType.set_Object(jaxbElem);
	}

}
