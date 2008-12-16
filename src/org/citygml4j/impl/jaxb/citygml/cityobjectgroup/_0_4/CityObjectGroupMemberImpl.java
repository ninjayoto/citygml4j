package org.citygml4j.impl.jaxb.citygml.cityobjectgroup._0_4;

import javax.xml.bind.JAXBElement;

import org.citygml4j.impl.jaxb.ModelMapper;
import org.citygml4j.impl.jaxb.gml._3_1_1.AssociationImpl;
import org.citygml4j.jaxb.citygml._0_4.CityObjectGroupMemberType;
import org.citygml4j.jaxb.citygml._0_4._CityObjectType;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.cityobjectgroup.CityObjectGroupMember;
import org.citygml4j.model.citygml.cityobjectgroup.CityObjectGroupModule;
import org.citygml4j.model.citygml.core.CityObject;

public class CityObjectGroupMemberImpl extends AssociationImpl<CityObject> implements CityObjectGroupMember {
	CityObjectGroupMemberType cityObjectGroupMemberType;
	
	public CityObjectGroupMemberImpl() {
		this(new CityObjectGroupMemberType());
	}
	
	public CityObjectGroupMemberImpl(CityObjectGroupMemberType cityObjectGroupMemberType) {
		super(cityObjectGroupMemberType);
		this.cityObjectGroupMemberType = cityObjectGroupMemberType;
	}
	
	@Override
	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.CITYOBJECTGROUPMEMBER;
	}

	@Override
	public final CityGMLModule getCityGMLModule() {
		return CityObjectGroupModule.v0_4_0;
	}
	
	@Override
	public CityObjectGroupMemberType getJAXBObject() {
		return cityObjectGroupMemberType;
	}

	@Override
	public String getGroupRole() {
		return cityObjectGroupMemberType.getGroupRole();
	}

	@Override
	public void setGroupRole(String groupRole) {
		cityObjectGroupMemberType.setGroupRole(groupRole);
	}

	@SuppressWarnings("unchecked")
	@Override
	public CityObject getObject() {
		CityObject cityObject = null;
		
		if (cityObjectGroupMemberType.isSet_Object()) {
			JAXBElement<?> jaxbElem = cityObjectGroupMemberType.get_Object();
			
			// we only allow a relation pointing to a _CityObject
			if (jaxbElem.getValue() != null && jaxbElem.getValue() instanceof _CityObjectType)
				cityObject = ModelMapper.CITYOBJECT_0_4.toCityGML((JAXBElement<? extends _CityObjectType>)jaxbElem);
		}

		return cityObject;
	}

	@Override
	public void setObject(CityObject object) {
		JAXBElement<?> cityObjectElem = ModelMapper.CITYOBJECT_0_4.toJAXB(object);		
		if (cityObjectElem != null)
			cityObjectGroupMemberType.set_Object(cityObjectElem);
	}

	@Override
	public boolean isSetGroupRole() {
		return cityObjectGroupMemberType.isSetGroupRole();
	}

	@Override
	public void unsetGroupRole() {
		cityObjectGroupMemberType.setGroupRole(null);
	}

}
