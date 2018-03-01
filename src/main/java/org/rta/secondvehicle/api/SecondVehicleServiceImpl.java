package org.rta.secondvehicle.api;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.tempuri.Secondvehiclecheck;
import org.tempuri.SecondvehiclecheckSoap;

public class SecondVehicleServiceImpl implements SecondVehicleService {

	private static final Logger logger = Logger.getLogger(SecondVehicleServiceImpl.class);

	private SecondvehiclecheckSoap services = null;

	public SecondVehicleServiceImpl() {
		services = new Secondvehiclecheck().getSecondvehiclecheckSoap();

	}

	@Override
	public String GetsecondvehiclecheckforotsiDealer(String strFName, String strFHName,
			String strLName, String strDOB) throws FileNotFoundException, UnsupportedEncodingException, JAXBException {

		if (Objects.isNull(strFName) || Objects.isNull(strFHName) || Objects.isNull(strLName)
				|| Objects.isNull(strDOB)) {
			throw new IllegalArgumentException("strFName,strFHName,strLName,and strDOB can't be null");
		}
		return SecondVehicleServiceResponse(
				services.getsecondvehiclecheckforotsiDealer(strFName, strFHName, strLName, strDOB));

	}

	private String SecondVehicleServiceResponse(String responseString) throws JAXBException {

		try {
			if (Objects.isNull(responseString)) {
				return responseString;
			}

			return responseString;
		} catch (IllegalArgumentException e) {
			logger.debug(e.getMessage());
			return responseString;
		}
	}

    @SuppressWarnings("unused")
    private Unmarshaller getUnmarshaller(Class<?> clazz) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		return jaxbContext.createUnmarshaller();
	}

}
