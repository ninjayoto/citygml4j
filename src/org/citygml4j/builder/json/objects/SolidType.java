package org.citygml4j.builder.json.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolidType extends AbstractSolidType {
	private final GeometryTypeName type = GeometryTypeName.SOLID;
	private List<List<List<List<Integer>>>> geometry = new ArrayList<>();
	private List<List<SemanticsType>> semantics;
	private Map<String, SolidMaterialObject> material;
	private Map<String, SolidTextureObject> texture;
	
	@Override
	public GeometryTypeName getType() {
		return type;
	}
	
	public void addShell(List<List<List<Integer>>> shell) {
		if (shell != null && shell.size() > 0)
			geometry.add(shell);
	}

	public List<List<List<List<Integer>>>> getShells() {
		return geometry;
	}

	public void setShells(List<List<List<List<Integer>>>> shells) {
		if (shells != null)
			geometry = shells;
	}
	
	public boolean isSetSemantics() {
		return semantics != null;
	}
	
	public void addSemantics(List<SemanticsType> semantics) {
		if (this.semantics == null)
			this.semantics = new ArrayList<>();
		
		this.semantics.add(semantics);
	}

	public List<List<SemanticsType>> getSemantics() {
		return semantics;
	}

	public void setSemantics(List<List<SemanticsType>> semantics) {
		this.semantics = semantics;
	}
	
	public boolean isSetMaterial() {
		return material != null;
	}
	
	public void addMaterial(SolidMaterialObject materialObject) {
		if (material == null)
			material = new HashMap<>();
		
		material.put(materialObject.getTheme(), materialObject);
	}
	
	public Map<String, SolidMaterialObject> getMaterial() {
		return material;
	}
	
	public SolidMaterialObject getMaterial(String theme) {
		return material != null ? material.get(theme) : null;
	}

	public void setMaterial(Map<String, SolidMaterialObject> material) {
		this.material = material;
	}
	
	public boolean isSetTexture() {
		return texture != null;
	}
	
	public void addTexture(SolidTextureObject textureObject) {
		if (texture == null)
			texture = new HashMap<>();
		
		texture.put(textureObject.getTheme(), textureObject);
	}
	
	public Map<String, SolidTextureObject> getTexture() {
		return texture;
	}
	
	public SolidTextureObject getTexture(String theme) {
		return texture != null ? texture.get(theme) : null;
	}

	public void setTexture(Map<String, SolidTextureObject> texture) {
		this.texture = texture;
	}
	
}
