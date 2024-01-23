package com.ingramcontent.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class XMLRequest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String xmlData;
	private java.lang.String xsdData;
	private java.lang.Boolean validXML;
	private java.lang.String errorMessage;

	public XMLRequest() {
	}

	public java.lang.String getXmlData() {
		return this.xmlData;
	}

	public void setXmlData(java.lang.String xmlData) {
		this.xmlData = xmlData;
	}

	public java.lang.String getXsdData() {
		return this.xsdData;
	}

	public void setXsdData(java.lang.String xsdData) {
		this.xsdData = xsdData;
	}

	public java.lang.Boolean getValidXML() {
		return this.validXML;
	}

	public void setValidXML(java.lang.Boolean validXML) {
		this.validXML = validXML;
	}

	public java.lang.String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(java.lang.String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public XMLRequest(java.lang.String xmlData, java.lang.String xsdData,
			java.lang.Boolean validXML, java.lang.String errorMessage) {
		this.xmlData = xmlData;
		this.xsdData = xsdData;
		this.validXML = validXML;
		this.errorMessage = errorMessage;
	}

}