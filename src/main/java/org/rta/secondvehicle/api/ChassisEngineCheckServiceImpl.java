package org.rta.secondvehicle.api;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
import org.tempuri.EngineNoChassisNoCheckLocator;
import org.tempuri.EngineNoChassisNoCheckSoap;

public class ChassisEngineCheckServiceImpl implements ChassisEngineCheckService {

    private static final Logger LOGGER = Logger.getLogger(ChassisEngineCheckServiceImpl.class);

    private EngineNoChassisNoCheckLocator services = null;

    public ChassisEngineCheckServiceImpl() {
        services = new EngineNoChassisNoCheckLocator();
    }

    @Override
    public Boolean checkChassisEngineNo(String engineNo, String chassisNo) {
        Boolean found = false;
        LOGGER.info("<<<<<<<<< Fetching results based on chassis and engine noumber >>>>>>>>>>>>");
        try {
            EngineNoChassisNoCheckSoap stub = services.getEngineNoChassisNoCheckSoap();
            if (null != stub) {
                int str = Integer.parseInt(stub.checkEngineNoChassisNoOTSI(engineNo, chassisNo));
                if (str == 1) {
                    found = true;
                    LOGGER.info("<<<<<<<<<<<<<< Vehicle Found >>>>>>>>>>>>>>>>>");
                }
            }
        } catch (RemoteException | ServiceException | NumberFormatException e) {
            LOGGER.info("<<<<<<<<<<<<<< CMS service response error:" + e.getMessage());
        }
        LOGGER.info("<<<<<<<<<<<<<< Vehicle Search Result:" + found);
        return found;
    }

}
