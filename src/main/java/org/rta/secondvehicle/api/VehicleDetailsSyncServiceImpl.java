package org.rta.secondvehicle.api;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;
import org.rta.secondvehicle.api.model.CmsSyncingRequestModel;
import org.tempuri.OTSINocInsertionIntoTSLocator;
import org.tempuri.OtsiLiveDataSyncToCmsLocator;

/**
 * @Author sohan.maurya created on Oct 5, 2016.
 */
public class VehicleDetailsSyncServiceImpl implements VehicleDetailsSyncService {

    private static final Logger logger = Logger.getLogger(VehicleDetailsSyncServiceImpl.class);

    private OTSINocInsertionIntoTSLocator service = null;
    private OtsiLiveDataSyncToCmsLocator serviceLive = null;
    private static final String ENVIRONMENT = "PROD";

    public VehicleDetailsSyncServiceImpl() {
        service = new OTSINocInsertionIntoTSLocator();
        serviceLive = new OtsiLiveDataSyncToCmsLocator();
    }

	@Override
	public String syncVehicleDetailsInfo(String environment, CmsSyncingRequestModel model) throws RemoteException, ServiceException {
		
		 logger.info("-----syncVehicleDetailsInfo ::::::::: start");
	        if (ENVIRONMENT.equalsIgnoreCase(environment)) {																																																																																																																																																																																																																																																																																																																																																																																										
	            logger.info("-----prod ::::::::: start");
	            return serviceLive.getOtsiLiveDataSyncToCmsSoap().otsiLiveDataSyncToCMS(String.valueOf(model.getVehicleNumber()),
	                    String.valueOf(model.getVehicleRegisteredDate()), String.valueOf(model.getVehicleRegistrationValidUpto()),
	                    String.valueOf(model.getVehicleIssuePlace()), String.valueOf(model.getVehicleStatus()), String.valueOf(model.getRemarks()),
	                    String.valueOf(model.getOwnershipType()), String.valueOf(model.getOwnerFirstName()), String.valueOf(model.getOwnerMiddileName()),
	                    String.valueOf(model.getOwnerLastName()), String.valueOf(model.getOwnerAge()), String.valueOf(model.getOwnerFatherName()),
	                    String.valueOf(model.getOwnerPanNo()), String.valueOf(model.getOwnerVoterId()), String.valueOf(model.getOwnerMobileNo()),
	                    String.valueOf(model.getOwnerAddress1()), String.valueOf(model.getOwnerAddress2()), String.valueOf(model.getOwnerAddress3()),
	                    String.valueOf(model.getOwnerCity()), String.valueOf(model.getOwnerState()), String.valueOf(model.getOwnerPin()),
	                    String.valueOf(model.getVehicleOldNo()), String.valueOf(model.getPreviousRegisteredOfficeName()),
	                    String.valueOf(model.getPreviousRegisteredOfficeState()), String.valueOf(model.getGovernmentVehicle()),
	                    String.valueOf(model.getReservedSpecialNo()), String.valueOf(model.getVehicleIsRTC()), String.valueOf(model.getInsuranceNo()),
	                    String.valueOf(model.getInsuranceCompanyName()), String.valueOf(model.getInsuranceValidFrom()),
	                    String.valueOf(model.getInsuranceValidTo()), String.valueOf(model.getMakerName()), String.valueOf(model.getMakerClass()),
	                    String.valueOf(model.getDealerName()), String.valueOf(model.getDealerAddress1()), String.valueOf(model.getDealerAddress2()),
	                    String.valueOf(model.getDealerAddress3()), String.valueOf(model.getDealerCity()), String.valueOf(model.getDealerState()),
	                    String.valueOf(model.getDealerAddressPinCode()), String.valueOf(model.getVehicleClass()), String.valueOf(model.getChassisNo()),
	                    String.valueOf(model.getEngineNo()), String.valueOf(model.getVehicleType()), String.valueOf(model.getBodyType()),
	                    String.valueOf(model.getWheelBase()), String.valueOf(model.getFuel()), String.valueOf(model.getVehicleCC()),
	                    String.valueOf(model.getCylenders()), String.valueOf(model.getSeatingCapacity()), String.valueOf(model.getDriverSeatingCapacity()),
	                    String.valueOf(model.getStandingCapacity()), String.valueOf(model.getColor()), String.valueOf(model.getVehicleIsNewOld()),
	                    String.valueOf(model.getManufactureMonthYear()), String.valueOf(model.getHorsePower()), String.valueOf(model.getUnleadenWeight()),
	                    String.valueOf(model.getGrowssWeightCertificate()), String.valueOf(model.getGrowssWeightRegistrationTime()),
	                    String.valueOf(model.getFronAxelTyreSizes()), String.valueOf(model.getRearAxelTyreSizes()),
	                    String.valueOf(model.getOtherAxelTyreSizes()), String.valueOf(model.getTandomAxelTyreSizes()), String.valueOf(model.getFronWeight()),
	                    String.valueOf(model.getRearWeight()), String.valueOf(model.getOtherAxelWeight()), String.valueOf(model.getTandomAxelWeight()),
	                    String.valueOf(model.getAxelType()), String.valueOf(model.getLength()), String.valueOf(model.getWidth()), String.valueOf(model.getHeight()),
	                    String.valueOf(model.getHangingCapacity()), String.valueOf(model.getTaxExemption()), String.valueOf(model.getTaxPaidOfficeCode()),
	                    String.valueOf(model.getTaxPaidStateCode()), String.valueOf(model.getTaxPaymentPeriod()), String.valueOf(model.getTaxDemandAmount()),
	                    String.valueOf(model.getTaxPenaltyAmount()), String.valueOf(model.getTaxCollectedAmount()), String.valueOf(model.getTaxDemandDate()),
	                    String.valueOf(model.getTaxQuarterStartDate()), String.valueOf(model.getTaxValidUpto()),
	                    String.valueOf(model.getHypothecationType()), String.valueOf(model.getFinancerName()),
	                    String.valueOf(model.getFinanceAggrementDate()), String.valueOf(model.getFinancerAddress1()),
	                    String.valueOf(model.getFinancerAddress2()), String.valueOf(model.getFinancerAddress3()), String.valueOf(model.getFinancerCity()),
	                    String.valueOf(model.getFinancerState()), String.valueOf(model.getFinancerPin()), String.valueOf(model.getFinancerFaxNo()),
	                    String.valueOf(model.getFinancerPhoneNO()), String.valueOf(model.getFinancerEmailId()), String.valueOf(model.getNocOfficeCode()),
	                    String.valueOf(model.getApplicationNo()),
	                    String.valueOf(model.getFcNumber()),
                        String.valueOf(model.getFcIssuedBy()),
                        String.valueOf(model.getFcIssuedDate()),
                        String.valueOf(model.getFcValidFromDate()),
                        String.valueOf(model.getFcValidToDate()),
                        String.valueOf(model.getFcApprovedBy()),
                        String.valueOf(model.getFcChallanNo()),
                        String.valueOf(model.getPermitNo()),
                        String.valueOf(model.getPermitClass()),
                        String.valueOf(model.getPermitType()),
                        String.valueOf(model.getPermitIssueDate()),
                        String.valueOf(model.getPermitValidFromDate()),
                        String.valueOf(model.getPermitValidToDate()),
                        String.valueOf(model.getAuthorizationNo()),
                        String.valueOf(model.getAuthFromDate()),
                        String.valueOf(model.getAuthToDate()),
                        String.valueOf(model.getRouteDescription()),
                        String.valueOf(model.getGoodsDescription()),
                        String.valueOf(model.getPermitLadenWeight()),
                        String.valueOf(model.getPermitRouteType()),
                        String.valueOf(model.getOneDistrictPermit()),
                        String.valueOf(model.getTwoDistrictPermit()),
                        String.valueOf(model.getTransactionDate()));
	        } else {
	            return service.getOTSINocInsertionIntoTSSoap().nocInsertionIntoTS(String.valueOf(model.getVehicleNumber()),
	                    String.valueOf(model.getVehicleRegisteredDate()), String.valueOf(model.getVehicleRegistrationValidUpto()),
	                    String.valueOf(model.getVehicleIssuePlace()), String.valueOf(model.getVehicleStatus()), String.valueOf(model.getRemarks()),
	                    String.valueOf(model.getOwnershipType()), String.valueOf(model.getOwnerFirstName()), String.valueOf(model.getOwnerMiddileName()),
	                    String.valueOf(model.getOwnerLastName()), String.valueOf(model.getOwnerAge()), String.valueOf(model.getOwnerFatherName()),
	                    String.valueOf(model.getOwnerPanNo()), String.valueOf(model.getOwnerVoterId()), String.valueOf(model.getOwnerMobileNo()),
	                    String.valueOf(model.getOwnerAddress1()), String.valueOf(model.getOwnerAddress2()), String.valueOf(model.getOwnerAddress3()),
	                    String.valueOf(model.getOwnerCity()), String.valueOf(model.getOwnerState()), String.valueOf(model.getOwnerPin()),
	                    String.valueOf(model.getVehicleOldNo()), String.valueOf(model.getPreviousRegisteredOfficeName()),
	                    String.valueOf(model.getPreviousRegisteredOfficeState()), String.valueOf(model.getGovernmentVehicle()),
	                    String.valueOf(model.getReservedSpecialNo()), String.valueOf(model.getVehicleIsRTC()), String.valueOf(model.getInsuranceNo()),
	                    String.valueOf(model.getInsuranceCompanyName()), String.valueOf(model.getInsuranceValidFrom()),
	                    String.valueOf(model.getInsuranceValidTo()), String.valueOf(model.getMakerName()), String.valueOf(model.getMakerClass()),
	                    String.valueOf(model.getDealerName()), String.valueOf(model.getDealerAddress1()), String.valueOf(model.getDealerAddress2()),
	                    String.valueOf(model.getDealerAddress3()), String.valueOf(model.getDealerCity()), String.valueOf(model.getDealerState()),
	                    String.valueOf(model.getDealerAddressPinCode()), String.valueOf(model.getVehicleClass()), String.valueOf(model.getChassisNo()),
	                    String.valueOf(model.getEngineNo()), String.valueOf(model.getVehicleType()), String.valueOf(model.getBodyType()),
	                    String.valueOf(model.getWheelBase()), String.valueOf(model.getFuel()), String.valueOf(model.getVehicleCC()),
	                    String.valueOf(model.getCylenders()), String.valueOf(model.getSeatingCapacity()), String.valueOf(model.getDriverSeatingCapacity()),
	                    String.valueOf(model.getStandingCapacity()), String.valueOf(model.getColor()), String.valueOf(model.getVehicleIsNewOld()),
	                    String.valueOf(model.getManufactureMonthYear()), String.valueOf(model.getHorsePower()), String.valueOf(model.getUnleadenWeight()),
	                    String.valueOf(model.getGrowssWeightCertificate()), String.valueOf(model.getGrowssWeightRegistrationTime()),
	                    String.valueOf(model.getFronAxelTyreSizes()), String.valueOf(model.getRearAxelTyreSizes()),
	                    String.valueOf(model.getOtherAxelTyreSizes()), String.valueOf(model.getTandomAxelTyreSizes()), String.valueOf(model.getFronWeight()),
	                    String.valueOf(model.getRearWeight()), String.valueOf(model.getOtherAxelWeight()), String.valueOf(model.getTandomAxelWeight()),
	                    String.valueOf(model.getAxelType()), String.valueOf(model.getLength()), String.valueOf(model.getWidth()), String.valueOf(model.getHeight()),
	                    String.valueOf(model.getHangingCapacity()), String.valueOf(model.getTaxExemption()), String.valueOf(model.getTaxPaidOfficeCode()),
	                    String.valueOf(model.getTaxPaidStateCode()), String.valueOf(model.getTaxPaymentPeriod()), String.valueOf(model.getTaxDemandAmount()),
	                    String.valueOf(model.getTaxPenaltyAmount()), String.valueOf(model.getTaxCollectedAmount()), String.valueOf(model.getTaxDemandDate()),
	                    String.valueOf(model.getTaxQuarterStartDate()), String.valueOf(model.getTaxValidUpto()),
	                    String.valueOf(model.getHypothecationType()), String.valueOf(model.getFinancerName()),
	                    String.valueOf(model.getFinanceAggrementDate()), String.valueOf(model.getFinancerAddress1()),
	                    String.valueOf(model.getFinancerAddress2()), String.valueOf(model.getFinancerAddress3()), String.valueOf(model.getFinancerCity()),
	                    String.valueOf(model.getFinancerState()), String.valueOf(model.getFinancerPin()), String.valueOf(model.getFinancerFaxNo()),
	                    String.valueOf(model.getFinancerPhoneNO()), String.valueOf(model.getFinancerEmailId()), String.valueOf(model.getNocOfficeCode()),
	                    String.valueOf(model.getApplicationNo()),
	                    String.valueOf(model.getFcNumber()),
	                    String.valueOf(model.getFcIssuedBy()),
	                    String.valueOf(model.getFcIssuedDate()),
	                    String.valueOf(model.getFcValidFromDate()),
	                    String.valueOf(model.getFcValidToDate()),
	                    String.valueOf(model.getFcApprovedBy()),
	                    String.valueOf(model.getFcChallanNo()),
	                    String.valueOf(model.getPermitNo()),
	                    String.valueOf(model.getPermitClass()),
	                    String.valueOf(model.getPermitType()),
	                    String.valueOf(model.getPermitIssueDate()),
	                    String.valueOf(model.getPermitValidFromDate()),
	                    String.valueOf(model.getPermitValidToDate()),
	                    String.valueOf(model.getAuthorizationNo()),
	                    String.valueOf(model.getAuthFromDate()),
	                    String.valueOf(model.getAuthToDate()),
	                    String.valueOf(model.getRouteDescription()),
	                    String.valueOf(model.getGoodsDescription()),
	                    String.valueOf(model.getPermitLadenWeight()),
	                    String.valueOf(model.getPermitRouteType()),
	                    String.valueOf(model.getOneDistrictPermit()),
	                    String.valueOf(model.getTwoDistrictPermit()),
	                    String.valueOf(model.getTransactionDate()));
	        }
	}

}
