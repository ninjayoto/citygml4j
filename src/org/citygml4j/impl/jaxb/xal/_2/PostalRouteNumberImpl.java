package org.citygml4j.impl.jaxb.xal._2;

import org.citygml4j.jaxb.xal.PostalRouteType;
import org.citygml4j.model.xal.PostalRouteNumber;
import org.citygml4j.model.xal.XALClass;

public class PostalRouteNumberImpl extends XALBaseImpl implements PostalRouteNumber {
	private PostalRouteType.PostalRouteNumber postalRouteNumber;
	
	public PostalRouteNumberImpl() {
		postalRouteNumber = new PostalRouteType.PostalRouteNumber();
	}
	
	public PostalRouteNumberImpl(PostalRouteType.PostalRouteNumber postalRouteNumber) {
		this.postalRouteNumber = postalRouteNumber;
	}
	
	@Override
	public PostalRouteType.PostalRouteNumber getJAXBObject() {
		return postalRouteNumber;
	}

	@Override
	public XALClass getXALClass() {
		return XALClass.POSTALROUTENUMBER;
	}

	@Override
	public String getContent() {
		return postalRouteNumber.getContent();
	}

	@Override
	public void setContent(String content) {
		postalRouteNumber.setContent(content);
	}

	@Override
	public String getCode() {
		return postalRouteNumber.getCode();
	}

	@Override
	public void setCode(String code) {
		postalRouteNumber.setCode(code);
	}

	@Override
	public boolean isSetContent() {
		return postalRouteNumber.isSetContent();
	}


	@Override
	public void unsetContent() {
		postalRouteNumber.setContent(null);
	}

	@Override
	public boolean isSetCode() {
		return postalRouteNumber.isSetCode();
	}

	@Override
	public void unsetCode() {
		postalRouteNumber.setCode(null);
	}
}
