package org.citygml4j.model.citygml.generics;

import org.citygml4j.model.citygml.CityGMLModule;
import org.citygml4j.model.citygml.CityGMLModuleType;
import org.citygml4j.model.citygml.CityGMLModuleVersion;

public enum GenericsModule implements CityGMLModule {
	v0_4_0{
		public String getNamespaceUri() { return "http://www.citygml.org/citygml/1/0/0"; }
		public String getNamespacePrefix() { return "citygml"; }
		public String getSchemaLocation() { return "http://www.citygml.org/citygml/0/4/0/CityGML.xsd"; }
		public CityGMLModuleVersion getModuleVersion() { return CityGMLModuleVersion.v0_4_0; }
	},
	v1_0_0 {
		public String getNamespaceUri() { return "http://www.opengis.net/citygml/generics/1.0"; }
		public String getNamespacePrefix() { return "gen"; }
		public String getSchemaLocation() { return "http://schemas.opengis.net/citygml/generics/1.0/generics.xsd"; }
		public CityGMLModuleVersion getModuleVersion() { return CityGMLModuleVersion.v1_0_0; }
	};
	
	@Override
	public abstract String getNamespaceUri();
	@Override
	public abstract String getNamespacePrefix();
	@Override
	public abstract String getSchemaLocation();
	@Override
	public abstract CityGMLModuleVersion getModuleVersion();
	
	@Override
	public CityGMLModuleType getModuleType() {
		return CityGMLModuleType.GENERICS;
	}
	
}
