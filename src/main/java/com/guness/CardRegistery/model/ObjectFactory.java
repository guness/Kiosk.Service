
package com.guness.CardRegistery.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.guness.CardRegistery.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _CardData_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "CardData");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _CardServiceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "CardServiceResponse");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ValidateCardDataServiceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", "ValidateCardDataServiceRequest");
    private final static QName _ApiEx_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ApiEx");
    private final static QName _ValidateCardServiceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "ValidateCardServiceResponse");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _RetrieveCardByAccountServiceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", "RetrieveCardByAccountServiceRequest");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ApiResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ApiResponse");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ApiContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Common", "ApiContext");
    private final static QName _CustomerData_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer", "CustomerData");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ApiServiceRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Common", "ApiServiceRequest");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfApiEx_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ArrayOfApiEx");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _BankData_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank", "BankData");
    private final static QName _ApiExUI_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "UI");
    private final static QName _ApiExDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "Details");
    private final static QName _CardServiceResponseCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Card");
    private final static QName _CardServiceResponseCustomer_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Customer");
    private final static QName _CardServiceResponseBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Bank");
    private final static QName _BankDataPrefix_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank", "Prefix");
    private final static QName _BankDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank", "Name");
    private final static QName _RetrieveCardDataResponseRetrieveCardDataResult_QNAME = new QName("http://tempuri.org/", "RetrieveCardDataResult");
    private final static QName _RetrieveCardDataRequest_QNAME = new QName("http://tempuri.org/", "request");
    private final static QName _CustomerDataFirstname_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer", "Firstname");
    private final static QName _CustomerDataLastname_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer", "Lastname");
    private final static QName _ValidateCardDataResponseValidateCardDataResult_QNAME = new QName("http://tempuri.org/", "ValidateCardDataResult");
    private final static QName _ApiResponseExceptionData_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", "ExceptionData");
    private final static QName _ValidateCardDataServiceRequestNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", "Number");
    private final static QName _ValidateCardDataServiceRequestSecret_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", "Secret");
    private final static QName _RetrieveCardByAccountServiceRequestAccountNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", "AccountNumber");
    private final static QName _CardDataNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Number");
    private final static QName _CardDataSecret_QNAME = new QName("http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", "Secret");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.guness.CardRegistery.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveCardDataResponse }
     * 
     */
    public RetrieveCardDataResponse createRetrieveCardDataResponse() {
        return new RetrieveCardDataResponse();
    }

    /**
     * Create an instance of {@link CardServiceResponse }
     * 
     */
    public CardServiceResponse createCardServiceResponse() {
        return new CardServiceResponse();
    }

    /**
     * Create an instance of {@link ValidateCardData }
     * 
     */
    public ValidateCardData createValidateCardData() {
        return new ValidateCardData();
    }

    /**
     * Create an instance of {@link ValidateCardDataServiceRequest }
     * 
     */
    public ValidateCardDataServiceRequest createValidateCardDataServiceRequest() {
        return new ValidateCardDataServiceRequest();
    }

    /**
     * Create an instance of {@link RetrieveCardData }
     * 
     */
    public RetrieveCardData createRetrieveCardData() {
        return new RetrieveCardData();
    }

    /**
     * Create an instance of {@link RetrieveCardByAccountServiceRequest }
     * 
     */
    public RetrieveCardByAccountServiceRequest createRetrieveCardByAccountServiceRequest() {
        return new RetrieveCardByAccountServiceRequest();
    }

    /**
     * Create an instance of {@link ValidateCardDataResponse }
     * 
     */
    public ValidateCardDataResponse createValidateCardDataResponse() {
        return new ValidateCardDataResponse();
    }

    /**
     * Create an instance of {@link ValidateCardServiceResponse }
     * 
     */
    public ValidateCardServiceResponse createValidateCardServiceResponse() {
        return new ValidateCardServiceResponse();
    }

    /**
     * Create an instance of {@link ApiServiceRequest }
     * 
     */
    public ApiServiceRequest createApiServiceRequest() {
        return new ApiServiceRequest();
    }

    /**
     * Create an instance of {@link ApiContext }
     * 
     */
    public ApiContext createApiContext() {
        return new ApiContext();
    }

    /**
     * Create an instance of {@link CardData }
     * 
     */
    public CardData createCardData() {
        return new CardData();
    }

    /**
     * Create an instance of {@link BankData }
     * 
     */
    public BankData createBankData() {
        return new BankData();
    }

    /**
     * Create an instance of {@link CustomerData }
     * 
     */
    public CustomerData createCustomerData() {
        return new CustomerData();
    }

    /**
     * Create an instance of {@link ApiEx }
     * 
     */
    public ApiEx createApiEx() {
        return new ApiEx();
    }

    /**
     * Create an instance of {@link ArrayOfApiEx }
     * 
     */
    public ArrayOfApiEx createArrayOfApiEx() {
        return new ArrayOfApiEx();
    }

    /**
     * Create an instance of {@link ApiResponse }
     * 
     */
    public ApiResponse createApiResponse() {
        return new ApiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "CardData")
    public JAXBElement<CardData> createCardData(CardData value) {
        return new JAXBElement<CardData>(_CardData_QNAME, CardData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "CardServiceResponse")
    public JAXBElement<CardServiceResponse> createCardServiceResponse(CardServiceResponse value) {
        return new JAXBElement<CardServiceResponse>(_CardServiceResponse_QNAME, CardServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCardDataServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", name = "ValidateCardDataServiceRequest")
    public JAXBElement<ValidateCardDataServiceRequest> createValidateCardDataServiceRequest(ValidateCardDataServiceRequest value) {
        return new JAXBElement<ValidateCardDataServiceRequest>(_ValidateCardDataServiceRequest_QNAME, ValidateCardDataServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", name = "ApiEx")
    public JAXBElement<ApiEx> createApiEx(ApiEx value) {
        return new JAXBElement<ApiEx>(_ApiEx_QNAME, ApiEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCardServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "ValidateCardServiceResponse")
    public JAXBElement<ValidateCardServiceResponse> createValidateCardServiceResponse(ValidateCardServiceResponse value) {
        return new JAXBElement<ValidateCardServiceResponse>(_ValidateCardServiceResponse_QNAME, ValidateCardServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCardByAccountServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", name = "RetrieveCardByAccountServiceRequest")
    public JAXBElement<RetrieveCardByAccountServiceRequest> createRetrieveCardByAccountServiceRequest(RetrieveCardByAccountServiceRequest value) {
        return new JAXBElement<RetrieveCardByAccountServiceRequest>(_RetrieveCardByAccountServiceRequest_QNAME, RetrieveCardByAccountServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", name = "ApiResponse")
    public JAXBElement<ApiResponse> createApiResponse(ApiResponse value) {
        return new JAXBElement<ApiResponse>(_ApiResponse_QNAME, ApiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Common", name = "ApiContext")
    public JAXBElement<ApiContext> createApiContext(ApiContext value) {
        return new JAXBElement<ApiContext>(_ApiContext_QNAME, ApiContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer", name = "CustomerData")
    public JAXBElement<CustomerData> createCustomerData(CustomerData value) {
        return new JAXBElement<CustomerData>(_CustomerData_QNAME, CustomerData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Common", name = "ApiServiceRequest")
    public JAXBElement<ApiServiceRequest> createApiServiceRequest(ApiServiceRequest value) {
        return new JAXBElement<ApiServiceRequest>(_ApiServiceRequest_QNAME, ApiServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfApiEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", name = "ArrayOfApiEx")
    public JAXBElement<ArrayOfApiEx> createArrayOfApiEx(ArrayOfApiEx value) {
        return new JAXBElement<ArrayOfApiEx>(_ArrayOfApiEx_QNAME, ArrayOfApiEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank", name = "BankData")
    public JAXBElement<BankData> createBankData(BankData value) {
        return new JAXBElement<BankData>(_BankData_QNAME, BankData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", name = "UI", scope = ApiEx.class)
    public JAXBElement<String> createApiExUI(String value) {
        return new JAXBElement<String>(_ApiExUI_QNAME, String.class, ApiEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", name = "Details", scope = ApiEx.class)
    public JAXBElement<String> createApiExDetails(String value) {
        return new JAXBElement<String>(_ApiExDetails_QNAME, String.class, ApiEx.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "Card", scope = CardServiceResponse.class)
    public JAXBElement<CardData> createCardServiceResponseCard(CardData value) {
        return new JAXBElement<CardData>(_CardServiceResponseCard_QNAME, CardData.class, CardServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "Customer", scope = CardServiceResponse.class)
    public JAXBElement<CustomerData> createCardServiceResponseCustomer(CustomerData value) {
        return new JAXBElement<CustomerData>(_CardServiceResponseCustomer_QNAME, CustomerData.class, CardServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "Bank", scope = CardServiceResponse.class)
    public JAXBElement<BankData> createCardServiceResponseBank(BankData value) {
        return new JAXBElement<BankData>(_CardServiceResponseBank_QNAME, BankData.class, CardServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank", name = "Prefix", scope = BankData.class)
    public JAXBElement<String> createBankDataPrefix(String value) {
        return new JAXBElement<String>(_BankDataPrefix_QNAME, String.class, BankData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Bank", name = "Name", scope = BankData.class)
    public JAXBElement<String> createBankDataName(String value) {
        return new JAXBElement<String>(_BankDataName_QNAME, String.class, BankData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveCardDataResult", scope = RetrieveCardDataResponse.class)
    public JAXBElement<CardServiceResponse> createRetrieveCardDataResponseRetrieveCardDataResult(CardServiceResponse value) {
        return new JAXBElement<CardServiceResponse>(_RetrieveCardDataResponseRetrieveCardDataResult_QNAME, CardServiceResponse.class, RetrieveCardDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveCardByAccountServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = RetrieveCardData.class)
    public JAXBElement<RetrieveCardByAccountServiceRequest> createRetrieveCardDataRequest(RetrieveCardByAccountServiceRequest value) {
        return new JAXBElement<RetrieveCardByAccountServiceRequest>(_RetrieveCardDataRequest_QNAME, RetrieveCardByAccountServiceRequest.class, RetrieveCardData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer", name = "Firstname", scope = CustomerData.class)
    public JAXBElement<String> createCustomerDataFirstname(String value) {
        return new JAXBElement<String>(_CustomerDataFirstname_QNAME, String.class, CustomerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Customer", name = "Lastname", scope = CustomerData.class)
    public JAXBElement<String> createCustomerDataLastname(String value) {
        return new JAXBElement<String>(_CustomerDataLastname_QNAME, String.class, CustomerData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCardServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidateCardDataResult", scope = ValidateCardDataResponse.class)
    public JAXBElement<ValidateCardServiceResponse> createValidateCardDataResponseValidateCardDataResult(ValidateCardServiceResponse value) {
        return new JAXBElement<ValidateCardServiceResponse>(_ValidateCardDataResponseValidateCardDataResult_QNAME, ValidateCardServiceResponse.class, ValidateCardDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfApiEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", name = "ExceptionData", scope = ApiResponse.class)
    public JAXBElement<ArrayOfApiEx> createApiResponseExceptionData(ArrayOfApiEx value) {
        return new JAXBElement<ArrayOfApiEx>(_ApiResponseExceptionData_QNAME, ArrayOfApiEx.class, ApiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", name = "Number", scope = ValidateCardDataServiceRequest.class)
    public JAXBElement<String> createValidateCardDataServiceRequestNumber(String value) {
        return new JAXBElement<String>(_ValidateCardDataServiceRequestNumber_QNAME, String.class, ValidateCardDataServiceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", name = "Secret", scope = ValidateCardDataServiceRequest.class)
    public JAXBElement<String> createValidateCardDataServiceRequestSecret(String value) {
        return new JAXBElement<String>(_ValidateCardDataServiceRequestSecret_QNAME, String.class, ValidateCardDataServiceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "CardData", scope = ValidateCardServiceResponse.class)
    public JAXBElement<CardServiceResponse> createValidateCardServiceResponseCardData(CardServiceResponse value) {
        return new JAXBElement<CardServiceResponse>(_CardData_QNAME, CardServiceResponse.class, ValidateCardServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Request.Card", name = "AccountNumber", scope = RetrieveCardByAccountServiceRequest.class)
    public JAXBElement<String> createRetrieveCardByAccountServiceRequestAccountNumber(String value) {
        return new JAXBElement<String>(_RetrieveCardByAccountServiceRequestAccountNumber_QNAME, String.class, RetrieveCardByAccountServiceRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "Number", scope = CardData.class)
    public JAXBElement<String> createCardDataNumber(String value) {
        return new JAXBElement<String>(_CardDataNumber_QNAME, String.class, CardData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Card", name = "Secret", scope = CardData.class)
    public JAXBElement<String> createCardDataSecret(String value) {
        return new JAXBElement<String>(_CardDataSecret_QNAME, String.class, CardData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCardDataServiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = ValidateCardData.class)
    public JAXBElement<ValidateCardDataServiceRequest> createValidateCardDataRequest(ValidateCardDataServiceRequest value) {
        return new JAXBElement<ValidateCardDataServiceRequest>(_RetrieveCardDataRequest_QNAME, ValidateCardDataServiceRequest.class, ValidateCardData.class, value);
    }

}
