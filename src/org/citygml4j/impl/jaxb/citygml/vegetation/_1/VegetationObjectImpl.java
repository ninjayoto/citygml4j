package org.citygml4j.impl.jaxb.citygml.vegetation._1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.impl.jaxb.citygml.core._1.CityObjectImpl;
import org.citygml4j.jaxb.citygml.veg._1.AbstractVegetationObjectType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.vegetation.VegetationModule;
import org.citygml4j.model.citygml.vegetation.VegetationObject;

public abstract class VegetationObjectImpl extends CityObjectImpl implements VegetationObject {
	private AbstractVegetationObjectType vegetationObjectType;

	public VegetationObjectImpl(AbstractVegetationObjectType vegetationObjectType) {
		super(vegetationObjectType);
		this.vegetationObjectType = vegetationObjectType;
	}

	@Override
	public AbstractVegetationObjectType getJAXBObject() {
		return vegetationObjectType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.VEGETATIONOBJECT;
	}

	@Override
	public final CityGMLModule getCityGMLModule() {
		return VegetationModule.v1_0_0;
	}

	@Override
	public void addGenericApplicationPropertyOfVegetationObject(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			vegetationObjectType.get_GenericApplicationPropertyOfVegetationObject().add(jaxbElem);
	}

	@Override
	public List<ADEComponent> getGenericApplicationPropertyOfVegetationObject() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();
		List<JAXBElement<?>> elemList = vegetationObjectType.get_GenericApplicationPropertyOfVegetationObject();

		for (JAXBElement<?> elem : elemList) {
			if (elem.getValue() != null) {
				ADEComponent ade = ModelMapper.ADE.toADEComponent(elem.getValue(), elem.getName());
				if (ade != null)
					adeList.add(ade);
			}
		}

		return adeList;
	}

	@Override
	public void setGenericApplicationPropertyOfVegetationObject(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			vegetationObjectType.unset_GenericApplicationPropertyOfVegetationObject();
			vegetationObjectType.get_GenericApplicationPropertyOfVegetationObject().addAll(elemList);
		}
	}

	@Override
	public boolean isSetGenericApplicationPropertyOfVegetationObject() {
		return vegetationObjectType.isSet_GenericApplicationPropertyOfVegetationObject();
	}

	@Override
	public void unsetGenericApplicationPropertyOfVegetationObject() {
		vegetationObjectType.unset_GenericApplicationPropertyOfVegetationObject();
	}
	
	@Override
	public boolean unsetGenericApplicationPropertyOfVegetationObject(ADEComponent adeObject) {
		if (vegetationObjectType.isSet_GenericApplicationPropertyOfVegetationObject()) {
			Iterator<JAXBElement<?>> iter = vegetationObjectType.get_GenericApplicationPropertyOfVegetationObject().iterator();
			while (iter.hasNext()) {
				JAXBElement<?> elem = iter.next();
				if (elem.getValue() != null && elem.getValue().equals(adeObject.getJAXBObject())) {
					iter.remove();
					return true;
				}
			}				
		}

		return false;
	}
	
}
