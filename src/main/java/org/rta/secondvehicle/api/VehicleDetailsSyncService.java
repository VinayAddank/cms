package org.rta.secondvehicle.api;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.rta.secondvehicle.api.model.CmsSyncingRequestModel;

/**
 * @Author sohan.maurya created on Oct 5, 2016.
 */
public interface VehicleDetailsSyncService {

    public String syncVehicleDetailsInfo(String environment, CmsSyncingRequestModel model) throws RemoteException, ServiceException;

}
