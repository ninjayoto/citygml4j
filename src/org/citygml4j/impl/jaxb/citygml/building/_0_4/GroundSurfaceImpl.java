package org.citygml4j.impl.jaxb.citygml.building._0_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.jaxb.citygml._0_4.GroundSurfaceType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.building.GroundSurface;

public class GroundSurfaceImpl extends BoundarySurfaceImpl implements GroundSurface {
	private GroundSurfaceType groundSurfaceType;

	public GroundSurfaceImpl() {
		this(new GroundSurfaceType());
	}

	public GroundSurfaceImpl(GroundSurfaceType groundSurfaceType) {
		super(groundSurfaceType);
		this.groundSurfaceType = groundSurfaceType;
	}

	@Override
	public GroundSurfaceType getJAXBObject() {
		return groundSurfaceType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.GROUNDSURFACE;
	}

	@Override
	public void addGenericApplicationPropertyOfGroundSurface(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			groundSurfaceType.get_GenericApplicationPropertyOfGroundSurface().add(jaxbElem);
	}

	@Override
	public List<ADEComponent> getGenericApplicationPropertyOfGroundSurface() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();
		List<JAXBElement<?>> elemList = groundSurfaceType.get_GenericApplicationPropertyOfGroundSurface();

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
	public void setGenericApplicationPropertyOfGroundSurface(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			groundSurfaceType.unset_GenericApplicationPropertyOfGroundSurface();
			groundSurfaceType.get_GenericApplicationPropertyOfGroundSurface().addAll(elemList);
		}
	}

	@Override
	public boolean isSetGenericApplicationPropertyOfGroundSurface() {
		return groundSurfaceType.isSet_GenericApplicationPropertyOfGroundSurface();
	}

	@Override
	public void unsetGenericApplicationPropertyOfGroundSurface() {
		groundSurfaceType.unset_GenericApplicationPropertyOfGroundSurface();
	}

	@Override
	public boolean unsetGenericApplicationPropertyOfGroundSurface(ADEComponent adeObject) {
		if (groundSurfaceType.isSet_GenericApplicationPropertyOfGroundSurface()) {
			Iterator<JAXBElement<?>> iter = groundSurfaceType.get_GenericApplicationPropertyOfGroundSurface().iterator();
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
