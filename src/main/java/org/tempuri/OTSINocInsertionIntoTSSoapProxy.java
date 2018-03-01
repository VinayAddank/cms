package org.tempuri;

public class OTSINocInsertionIntoTSSoapProxy implements org.tempuri.OTSINocInsertionIntoTSSoap {
  private String _endpoint = null;
  private org.tempuri.OTSINocInsertionIntoTSSoap oTSINocInsertionIntoTSSoap = null;
  
  public OTSINocInsertionIntoTSSoapProxy() {
    _initOTSINocInsertionIntoTSSoapProxy();
  }
  
  public OTSINocInsertionIntoTSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initOTSINocInsertionIntoTSSoapProxy();
  }
  
  private void _initOTSINocInsertionIntoTSSoapProxy() {
    try {
      oTSINocInsertionIntoTSSoap = (new org.tempuri.OTSINocInsertionIntoTSLocator()).getOTSINocInsertionIntoTSSoap();
      if (oTSINocInsertionIntoTSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)oTSINocInsertionIntoTSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)oTSINocInsertionIntoTSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (oTSINocInsertionIntoTSSoap != null)
      ((javax.xml.rpc.Stub)oTSINocInsertionIntoTSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OTSINocInsertionIntoTSSoap getOTSINocInsertionIntoTSSoap() {
    if (oTSINocInsertionIntoTSSoap == null)
      _initOTSINocInsertionIntoTSSoapProxy();
    return oTSINocInsertionIntoTSSoap;
  }
  
  public java.lang.String nocInsertionIntoTS(java.lang.String vehicleNumber, java.lang.String vehicleRegisteredDate, java.lang.String vehicleRegistrationValidUpto, java.lang.String vehicleIssuePlace, java.lang.String vehicleStatus, java.lang.String remarks, java.lang.String ownershipType, java.lang.String ownerFirstName, java.lang.String ownerMiddileName, java.lang.String ownerLastName, java.lang.String ownerAge, java.lang.String ownerFatherName, java.lang.String ownerPanNo, java.lang.String ownerVoterId, java.lang.String ownerMobileNo, java.lang.String ownerAddress1, java.lang.String ownerAddress2, java.lang.String ownerAddress3, java.lang.String ownerCity, java.lang.String ownerState, java.lang.String ownerPin, java.lang.String vehicleOldNo, java.lang.String previousRegisteredOfficeName, java.lang.String previousRegisteredOfficeState, java.lang.String governmentVehicle, java.lang.String reservedSpecialNo, java.lang.String vehicleIsRTC, java.lang.String insuranceNo, java.lang.String insuranceCompanyName, java.lang.String insuranceValidFrom, java.lang.String insuranceValidTo, java.lang.String makerName, java.lang.String makerClass, java.lang.String dealerName, java.lang.String dealerAddress1, java.lang.String dealerAddress2, java.lang.String dealerAddress3, java.lang.String dealerCity, java.lang.String dealerState, java.lang.String dealerAddressPinCode, java.lang.String vehicleClass, java.lang.String chassisNo, java.lang.String engineNo, java.lang.String vehicleType, java.lang.String bodyType, java.lang.String wheelBase, java.lang.String fuel, java.lang.String vehicleCC, java.lang.String cylenders, java.lang.String seatingCapacity, java.lang.String driverSeatingCapacity, java.lang.String standingCapacity, java.lang.String color, java.lang.String vehicleIsNewOld, java.lang.String manufactureMonthYear, java.lang.String horsePower, java.lang.String unleadenWeight, java.lang.String growssWeightCertificate, java.lang.String growssWeightRegistrationTime, java.lang.String fronAxelTyreSizes, java.lang.String rearAxelTyreSizes, java.lang.String otherAxelTyreSizes, java.lang.String tandomAxelTyreSizes, java.lang.String fronWeight, java.lang.String rearWeight, java.lang.String otherAxelWeight, java.lang.String tandomAxelWeight, java.lang.String axelType, java.lang.String length, java.lang.String width, java.lang.String height, java.lang.String hangingCapacity, java.lang.String taxExemption, java.lang.String taxPaidOfficeCode, java.lang.String taxPaidStateCode, java.lang.String taxPaymentPeriod, java.lang.String taxDemandAmount, java.lang.String taxPenaltyAmount, java.lang.String taxCollectedAmount, java.lang.String taxDemandDate, java.lang.String taxQuarterStartDate, java.lang.String taxValidUpto, java.lang.String hypothecationType, java.lang.String financerName, java.lang.String financeAggrementDate, java.lang.String financerAddress1, java.lang.String financerAddress2, java.lang.String financerAddress3, java.lang.String financerCity, java.lang.String financerState, java.lang.String financerPin, java.lang.String financerFaxNo, java.lang.String financerPhoneNO, java.lang.String financerEmailId, java.lang.String nocOfficeCode, java.lang.String APPLICATIONNO, java.lang.String fcNumber, java.lang.String fcIssuedBy, java.lang.String fcIssuedDate, java.lang.String fcValidFromDate, java.lang.String fcValidToDate, java.lang.String fcApprovedBy, java.lang.String fcChallanNo, java.lang.String permitNo, java.lang.String permitClass, java.lang.String permitType, java.lang.String permitIssueDate, java.lang.String permitValidFromDate, java.lang.String permitValidToDate, java.lang.String authorizationNo, java.lang.String authFromDate, java.lang.String authToDate, java.lang.String routeDescription, java.lang.String goodsDescription, java.lang.String permitLadenWeight, java.lang.String permitRouteType, java.lang.String oneDistrictPermit, java.lang.String twoDistrictPermit, java.lang.String transactionDate) throws java.rmi.RemoteException{
    if (oTSINocInsertionIntoTSSoap == null)
      _initOTSINocInsertionIntoTSSoapProxy();
    return oTSINocInsertionIntoTSSoap.nocInsertionIntoTS(vehicleNumber, vehicleRegisteredDate, vehicleRegistrationValidUpto, vehicleIssuePlace, vehicleStatus, remarks, ownershipType, ownerFirstName, ownerMiddileName, ownerLastName, ownerAge, ownerFatherName, ownerPanNo, ownerVoterId, ownerMobileNo, ownerAddress1, ownerAddress2, ownerAddress3, ownerCity, ownerState, ownerPin, vehicleOldNo, previousRegisteredOfficeName, previousRegisteredOfficeState, governmentVehicle, reservedSpecialNo, vehicleIsRTC, insuranceNo, insuranceCompanyName, insuranceValidFrom, insuranceValidTo, makerName, makerClass, dealerName, dealerAddress1, dealerAddress2, dealerAddress3, dealerCity, dealerState, dealerAddressPinCode, vehicleClass, chassisNo, engineNo, vehicleType, bodyType, wheelBase, fuel, vehicleCC, cylenders, seatingCapacity, driverSeatingCapacity, standingCapacity, color, vehicleIsNewOld, manufactureMonthYear, horsePower, unleadenWeight, growssWeightCertificate, growssWeightRegistrationTime, fronAxelTyreSizes, rearAxelTyreSizes, otherAxelTyreSizes, tandomAxelTyreSizes, fronWeight, rearWeight, otherAxelWeight, tandomAxelWeight, axelType, length, width, height, hangingCapacity, taxExemption, taxPaidOfficeCode, taxPaidStateCode, taxPaymentPeriod, taxDemandAmount, taxPenaltyAmount, taxCollectedAmount, taxDemandDate, taxQuarterStartDate, taxValidUpto, hypothecationType, financerName, financeAggrementDate, financerAddress1, financerAddress2, financerAddress3, financerCity, financerState, financerPin, financerFaxNo, financerPhoneNO, financerEmailId, nocOfficeCode, APPLICATIONNO, fcNumber, fcIssuedBy, fcIssuedDate, fcValidFromDate, fcValidToDate, fcApprovedBy, fcChallanNo, permitNo, permitClass, permitType, permitIssueDate, permitValidFromDate, permitValidToDate, authorizationNo, authFromDate, authToDate, routeDescription, goodsDescription, permitLadenWeight, permitRouteType, oneDistrictPermit, twoDistrictPermit, transactionDate);
  }
  
  
}