package org.citygml4j.impl.jaxb.citygml.building._0_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.jaxb.citygml._0_4.WindowType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.ade.ADEComponent;
import org.citygml4j.model.citygml.building.Window;

public class WindowImpl extends OpeningImpl implements Window {
	private WindowType windowType;

	public WindowImpl() {
		this(new WindowType());
	}

	public WindowImpl(WindowType windowType) {
		super(windowType);
		this.windowType = windowType;
	}

	@Override
	public WindowType getJAXBObject() {
		return windowType;
	}

	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.WINDOW;
	}

	@Override
	public void addGenericApplicationPropertyOfWindow(ADEComponent adeObject) {
		JAXBElement<?> jaxbElem = ModelMapper.ADE.toJAXB(adeObject);
		if (jaxbElem != null)
			windowType.get_GenericApplicationPropertyOfWindow().add(jaxbElem);
	}

	@Override
	public List<ADEComponent> getGenericApplicationPropertyOfWindow() {
		List<ADEComponent> adeList = new ArrayList<ADEComponent>();
		List<JAXBElement<?>> elemList = windowType.get_GenericApplicationPropertyOfWindow();

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
	public void setGenericApplicationPropertyOfWindow(List<ADEComponent> adeObject) {
		List<JAXBElement<?>> elemList = new ArrayList<JAXBElement<?>>();

		for (ADEComponent ade : adeObject) {
			JAXBElement<?> elem = ModelMapper.ADE.toJAXB(ade);
			if (elem != null)
				elemList.add(elem);
		}

		if (!elemList.isEmpty()) {
			windowType.unset_GenericApplicationPropertyOfWindow();
			windowType.get_GenericApplicationPropertyOfWindow().addAll(elemList);
		}
	}

	@Override
	public boolean isSetGenericApplicationPropertyOfWindow() {
		return windowType.isSet_GenericApplicationPropertyOfWindow();
	}

	@Override
	public void unsetGenericApplicationPropertyOfWindow() {
		windowType.unset_GenericApplicationPropertyOfWindow();
	}

	@Override
	public boolean unsetGenericApplicationPropertyOfWindow(ADEComponent adeObject) {
		if (windowType.isSet_GenericApplicationPropertyOfWindow()) {
			Iterator<JAXBElement<?>> iter = windowType.get_GenericApplicationPropertyOfWindow().iterator();
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
