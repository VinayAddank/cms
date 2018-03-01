package org.rta.secondvehicle.api;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBException;

/**
 * AadharService provides details for aadhar
 * 
 * @author Sriram
 *
 */
public interface SecondVehicleService {

	public String GetsecondvehiclecheckforotsiDealer(String strFName, String strFHName,
			String strLName, String strDOB) throws FileNotFoundException, UnsupportedEncodingException, JAXBException;

}
