package org.citygml4j.model.xal;

public interface PremiseNumberRange extends XALBase {
	public PremiseNumberRangeFrom getPremiseNumberRangeFrom();
	public PremiseNumberRangeTo getPremiseNumberRangeTo();
	public String getRangeType();
	public String getIndicator();
	public String getSeparator();
	public String getType();
	public String getIndicatorOccurrence();
	public String getNumberRangeOccurrence();
	public boolean isSetPremiseNumberRangeFrom();
	public boolean isSetPremiseNumberRangeTo();
	public boolean isSetRangeType();
	public boolean isSetIndicator();
	public boolean isSetSeparator();
	public boolean isSetType();
	public boolean isSetIndicatorOccurrence();
	public boolean isSetNumberRangeOccurrence();
	
	public void setPremiseNumberRangeFrom(PremiseNumberRangeFrom premiseNumberRangeFrom);
	public void setPremiseNumberRangeTo(PremiseNumberRangeTo premiseNumberRangeTo);
	public void setRangeType(String rangeType);
	public void setIndicator(String indicator);
	public void setSeparator(String separator);
	public void setType(String type);
	public void setIndicatorOccurrence(String indicatorOccurence);
	public void setNumberRangeOccurrence(String numberRangeOccurence);
	public void unsetPremiseNumberRangeFrom();
	public void unsetPremiseNumberRangeTo();
	public void unsetRangeType();
	public void unsetIndicator();
	public void unsetSeparator();
	public void unsetType();
	public void unsetIndicatorOccurrence();
	public void unsetNumberRangeOccurrence();
}
