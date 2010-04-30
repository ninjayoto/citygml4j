package org.citygml4j.builder.jaxb.unmarshal.citygml.vegetation;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.citygml4j.builder.jaxb.unmarshal.JAXBUnmarshaller;
import org.citygml4j.builder.jaxb.unmarshal.citygml.CityGMLUnmarshaller;
import org.citygml4j.impl.citygml.vegetation.PlantCoverImpl;
import org.citygml4j.impl.citygml.vegetation.SolitaryVegetationObjectImpl;
import org.citygml4j.jaxb.citygml._0_4.PlantCoverType;
import org.citygml4j.jaxb.citygml._0_4.SolitaryVegetationObjectType;
import org.citygml4j.jaxb.citygml._0_4._VegetationObjectType;
import org.citygml4j.model.citygml.CityGML;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.vegetation.PlantCover;
import org.citygml4j.model.citygml.vegetation.SolitaryVegetationObject;
import org.citygml4j.model.citygml.vegetation.VegetationObject;
import org.citygml4j.model.module.citygml.VegetationModule;
import org.citygml4j.xml.io.reader.MissingADESchemaException;

public class Vegetation040Unmarshaller {
	private final VegetationModule module = VegetationModule.v0_4_0;
	private final JAXBUnmarshaller jaxb;
	private final CityGMLUnmarshaller citygml;

	public Vegetation040Unmarshaller(CityGMLUnmarshaller citygml) {
		this.citygml = citygml;
		jaxb = citygml.getJAXBUnmarshaller();
	}

	public CityGML unmarshal(JAXBElement<?> src) throws MissingADESchemaException {
		return unmarshal(src.getValue());
	}

	public CityGML unmarshal(Object src) throws MissingADESchemaException {
		if (src instanceof JAXBElement<?>)
			return unmarshal((JAXBElement<?>)src);

		CityGML dest = null;

		if (src instanceof PlantCoverType)
			dest = unmarshalPlantCover((PlantCoverType)src);
		else if (src instanceof SolitaryVegetationObjectType)
			dest = unmarshalSolitaryVegetationObject((SolitaryVegetationObjectType)src);

		return dest;
	}

	public void unmarshalVegetationObject(_VegetationObjectType src, VegetationObject dest) throws MissingADESchemaException {
		citygml.getCore040Unmarshaller().unmarshalCityObject(src, dest);
	}

	public void unmarshalPlantCover(PlantCoverType src, PlantCover dest) throws MissingADESchemaException {
		unmarshalVegetationObject(src, dest);

		if (src.isSetClazz())
			dest.setClazz(src.getClazz());

		if (src.isSetFunction())
			dest.setFunction(src.getFunction());

		if (src.isSetAverageHeight())
			dest.setAverageHeight(jaxb.getGMLUnmarshaller().unmarshalLength(src.getAverageHeight()));

		if (src.isSetLod1MultiSurface())
			dest.setLod1MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod1MultiSurface()));

		if (src.isSetLod2MultiSurface())
			dest.setLod2MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod2MultiSurface()));

		if (src.isSetLod3MultiSurface())
			dest.setLod3MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod3MultiSurface()));

		if (src.isSetLod4MultiSurface())
			dest.setLod4MultiSurface(jaxb.getGMLUnmarshaller().unmarshalMultiSurfaceProperty(src.getLod4MultiSurface()));

		if (src.isSetLod1MultiSolid())
			dest.setLod1MultiSolid(jaxb.getGMLUnmarshaller().unmarshalMultiSolidProperty(src.getLod1MultiSolid()));

		if (src.isSetLod2MultiSolid())
			dest.setLod2MultiSolid(jaxb.getGMLUnmarshaller().unmarshalMultiSolidProperty(src.getLod2MultiSolid()));

		if (src.isSetLod3MultiSolid())
			dest.setLod3MultiSolid(jaxb.getGMLUnmarshaller().unmarshalMultiSolidProperty(src.getLod3MultiSolid()));	
	}

	public PlantCover unmarshalPlantCover(PlantCoverType src) throws MissingADESchemaException {
		PlantCover dest = new PlantCoverImpl(module);
		unmarshalPlantCover(src, dest);

		return dest;
	}

	public void unmarshalSolitaryVegetationObject(SolitaryVegetationObjectType src, SolitaryVegetationObject dest) throws MissingADESchemaException {
		unmarshalVegetationObject(src, dest);

		if (src.isSetClazz())
			dest.setClazz(src.getClazz());

		if (src.isSetFunction())
			dest.setFunction(src.getFunction());

		if (src.isSetSpecies())
			dest.setSpecies(src.getSpecies());

		if (src.isSetHeight())
			dest.setHeight(jaxb.getGMLUnmarshaller().unmarshalLength(src.getHeight()));

		if (src.isSetTrunkDiameter())
			dest.setTrunkDiameter(jaxb.getGMLUnmarshaller().unmarshalLength(src.getTrunkDiameter()));

		if (src.isSetCrownDiameter())
			dest.setCrownDiameter(jaxb.getGMLUnmarshaller().unmarshalLength(src.getCrownDiameter()));

		if (src.isSetLod1Geometry())
			dest.setLod1Geometry(jaxb.getGMLUnmarshaller().unmarshalGeometryProperty(src.getLod1Geometry()));

		if (src.isSetLod2Geometry())
			dest.setLod2Geometry(jaxb.getGMLUnmarshaller().unmarshalGeometryProperty(src.getLod2Geometry()));

		if (src.isSetLod3Geometry())
			dest.setLod3Geometry(jaxb.getGMLUnmarshaller().unmarshalGeometryProperty(src.getLod3Geometry()));

		if (src.isSetLod4Geometry())
			dest.setLod4Geometry(jaxb.getGMLUnmarshaller().unmarshalGeometryProperty(src.getLod4Geometry()));

		if (src.isSetLod1ImplicitRepresentation())
			dest.setLod1ImplicitRepresentation(citygml.getCore040Unmarshaller().unmarshalImplicitRepresentationProperty(src.getLod1ImplicitRepresentation()));

		if (src.isSetLod2ImplicitRepresentation())
			dest.setLod2ImplicitRepresentation(citygml.getCore040Unmarshaller().unmarshalImplicitRepresentationProperty(src.getLod2ImplicitRepresentation()));

		if (src.isSetLod3ImplicitRepresentation())
			dest.setLod3ImplicitRepresentation(citygml.getCore040Unmarshaller().unmarshalImplicitRepresentationProperty(src.getLod3ImplicitRepresentation()));

		if (src.isSetLod4ImplicitRepresentation())
			dest.setLod4ImplicitRepresentation(citygml.getCore040Unmarshaller().unmarshalImplicitRepresentationProperty(src.getLod4ImplicitRepresentation()));
	}

	public SolitaryVegetationObject unmarshalSolitaryVegetationObject(SolitaryVegetationObjectType src) throws MissingADESchemaException {
		SolitaryVegetationObject dest = new SolitaryVegetationObjectImpl(module);
		unmarshalSolitaryVegetationObject(src, dest);

		return dest;
	}
	
	public boolean assignGenericProperty(ADEComponent genericProperty, QName substitutionGroup, CityGML dest) {
		String name = substitutionGroup.getLocalPart();
		boolean success = true;
		
		if (dest instanceof VegetationObject && name.equals("_GenericApplicationPropertyOfVegetationObject"))
			((VegetationObject)dest).addGenericApplicationPropertyOfVegetationObject(genericProperty);		
		else if (dest instanceof PlantCover && name.equals("_GenericApplicationPropertyOfPlantCover"))
			((PlantCover)dest).addGenericApplicationPropertyOfPlantCover(genericProperty);		
		else if (dest instanceof SolitaryVegetationObject && name.equals("_GenericApplicationPropertyOfSolitaryVegetationObject"))
			((SolitaryVegetationObject)dest).addGenericApplicationPropertyOfSolitaryVegetationObject(genericProperty);		
		else
			success = false;
		
		return success;
	}

}