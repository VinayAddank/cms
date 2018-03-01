<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="GetsecondvehiclecheckforotsiDealer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="strFName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="strFHName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="strLName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="strDOB" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetsecondvehiclecheckforotsiDealerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetsecondvehiclecheckforotsiDealerResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetsecondvehiclecheckforotsiDealerSoapIn">
    <wsdl:part name="parameters" element="tns:GetsecondvehiclecheckforotsiDealer" />
  </wsdl:message>
  <wsdl:message name="GetsecondvehiclecheckforotsiDealerSoapOut">
    <wsdl:part name="parameters" element="tns:GetsecondvehiclecheckforotsiDealerResponse" />
  </wsdl:message>
  <wsdl:portType name="SecondvehiclecheckSoap">
    <wsdl:operation name="GetsecondvehiclecheckforotsiDealer">
      <wsdl:input message="tns:GetsecondvehiclecheckforotsiDealerSoapIn" />
      <wsdl:output message="tns:GetsecondvehiclecheckforotsiDealerSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="SecondvehiclecheckSoap" type="tns:SecondvehiclecheckSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetsecondvehiclecheckforotsiDealer">
      <soap:operation soapAction="http://tempuri.org/GetsecondvehiclecheckforotsiDealer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="SecondvehiclecheckSoap12" type="tns:SecondvehiclecheckSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetsecondvehiclecheckforotsiDealer">
      <soap12:operation soapAction="http://tempuri.org/GetsecondvehiclecheckforotsiDealer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="Secondvehiclecheck">
    <wsdl:port name="SecondvehiclecheckSoap" binding="tns:SecondvehiclecheckSoap">
      <soap:address location="http://202.65.142.140/OTSI2VEHCHK/Secondvehiclecheck.asmx" />
    </wsdl:port>
    <wsdl:port name="SecondvehiclecheckSoap12" binding="tns:SecondvehiclecheckSoap12">
      <soap12:address location="http://202.65.142.140/OTSI2VEHCHK/Secondvehiclecheck.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>