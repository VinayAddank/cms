package org.rta.secondvehicle.api.model;

import java.io.Serializable;

/**
 * AadharResponseModel provides details for aadhar response
 * 
 * @author Sriram
 *
 */
public class NewDataSetResponseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResponseType responseType;
	private String responseDesc;
	private NewDataSet newDataSet;

	public NewDataSet getNewDataSet() {
		return newDataSet;
	}

	public void setNewDataSet(NewDataSet newDataSet) {
		this.newDataSet = newDataSet;
	}


	public ResponseType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}

	public NewDataSetResponseModel(ResponseType responseType, String errorDesc, NewDataSet newDataSet) {
		this.responseType = responseType;
		this.responseDesc = errorDesc;
		this.newDataSet = newDataSet;
	}

	public String getErrorDesc() {
		return responseDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.responseDesc = errorDesc;
	}

}
