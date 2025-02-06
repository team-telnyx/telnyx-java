/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PortoutDetails
 */
@JsonPropertyOrder({
  PortoutDetails.JSON_PROPERTY_ID,
  PortoutDetails.JSON_PROPERTY_RECORD_TYPE,
  PortoutDetails.JSON_PROPERTY_PHONE_NUMBERS,
  PortoutDetails.JSON_PROPERTY_AUTHORIZED_NAME,
  PortoutDetails.JSON_PROPERTY_CARRIER_NAME,
  PortoutDetails.JSON_PROPERTY_CURRENT_CARRIER,
  PortoutDetails.JSON_PROPERTY_END_USER_NAME,
  PortoutDetails.JSON_PROPERTY_CITY,
  PortoutDetails.JSON_PROPERTY_STATE,
  PortoutDetails.JSON_PROPERTY_ZIP,
  PortoutDetails.JSON_PROPERTY_LSR,
  PortoutDetails.JSON_PROPERTY_PON,
  PortoutDetails.JSON_PROPERTY_REASON,
  PortoutDetails.JSON_PROPERTY_REJECTION_CODE,
  PortoutDetails.JSON_PROPERTY_SERVICE_ADDRESS,
  PortoutDetails.JSON_PROPERTY_FOC_DATE,
  PortoutDetails.JSON_PROPERTY_REQUESTED_FOC_DATE,
  PortoutDetails.JSON_PROPERTY_SPID,
  PortoutDetails.JSON_PROPERTY_SUPPORT_KEY,
  PortoutDetails.JSON_PROPERTY_STATUS,
  PortoutDetails.JSON_PROPERTY_ALREADY_PORTED,
  PortoutDetails.JSON_PROPERTY_USER_ID,
  PortoutDetails.JSON_PROPERTY_VENDOR,
  PortoutDetails.JSON_PROPERTY_CREATED_AT,
  PortoutDetails.JSON_PROPERTY_INSERTED_AT,
  PortoutDetails.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PortoutDetails {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<String> phoneNumbers = null;

  public static final String JSON_PROPERTY_AUTHORIZED_NAME = "authorized_name";
  private String authorizedName;

  public static final String JSON_PROPERTY_CARRIER_NAME = "carrier_name";
  private String carrierName;

  public static final String JSON_PROPERTY_CURRENT_CARRIER = "current_carrier";
  private String currentCarrier;

  public static final String JSON_PROPERTY_END_USER_NAME = "end_user_name";
  private String endUserName;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_ZIP = "zip";
  private String zip;

  public static final String JSON_PROPERTY_LSR = "lsr";
  private List<URI> lsr = null;

  public static final String JSON_PROPERTY_PON = "pon";
  private String pon;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_REJECTION_CODE = "rejection_code";
  private Integer rejectionCode;

  public static final String JSON_PROPERTY_SERVICE_ADDRESS = "service_address";
  private String serviceAddress;

  public static final String JSON_PROPERTY_FOC_DATE = "foc_date";
  private String focDate;

  public static final String JSON_PROPERTY_REQUESTED_FOC_DATE = "requested_foc_date";
  private String requestedFocDate;

  public static final String JSON_PROPERTY_SPID = "spid";
  private String spid;

  public static final String JSON_PROPERTY_SUPPORT_KEY = "support_key";
  private String supportKey;

  /**
   * Status of portout request
   */
  public enum StatusEnum {
    PENDING(String.valueOf("pending")),
    
    AUTHORIZED(String.valueOf("authorized")),
    
    PORTED(String.valueOf("ported")),
    
    REJECTED(String.valueOf("rejected")),
    
    REJECTED_PENDING(String.valueOf("rejected-pending")),
    
    CANCELED(String.valueOf("canceled"));

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_ALREADY_PORTED = "already_ported";
  private Boolean alreadyPorted;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public static final String JSON_PROPERTY_VENDOR = "vendor";
  private UUID vendor;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_INSERTED_AT = "inserted_at";
  private String insertedAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public PortoutDetails() { 
  }

  @JsonCreator
  public PortoutDetails(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
  ) {
    this();
    this.recordType = recordType;
  }

  public PortoutDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "portout", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public PortoutDetails phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PortoutDetails addphoneNumbersItem(String phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Phone numbers associated with this portout
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"+35312345678\"]", value = "Phone numbers associated with this portout")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public PortoutDetails authorizedName(String authorizedName) {
    this.authorizedName = authorizedName;
    return this;
  }

   /**
   * Name of person authorizing the porting order
   * @return authorizedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "McPortersen", value = "Name of person authorizing the porting order")
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizedName() {
    return authorizedName;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZED_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizedName(String authorizedName) {
    this.authorizedName = authorizedName;
  }


  public PortoutDetails carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * Carrier the number will be ported out to
   * @return carrierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "Carrier the number will be ported out to")
  @JsonProperty(JSON_PROPERTY_CARRIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierName() {
    return carrierName;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public PortoutDetails currentCarrier(String currentCarrier) {
    this.currentCarrier = currentCarrier;
    return this;
  }

   /**
   * The current carrier
   * @return currentCarrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "telnyx", value = "The current carrier")
  @JsonProperty(JSON_PROPERTY_CURRENT_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentCarrier() {
    return currentCarrier;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentCarrier(String currentCarrier) {
    this.currentCarrier = currentCarrier;
  }


  public PortoutDetails endUserName(String endUserName) {
    this.endUserName = endUserName;
    return this;
  }

   /**
   * Person name or company name requesting the port
   * @return endUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "McPortersen", value = "Person name or company name requesting the port")
  @JsonProperty(JSON_PROPERTY_END_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndUserName() {
    return endUserName;
  }


  @JsonProperty(JSON_PROPERTY_END_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndUserName(String endUserName) {
    this.endUserName = endUserName;
  }


  public PortoutDetails city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City or municipality of billing address
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chicago", value = "City or municipality of billing address")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public PortoutDetails state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State, province, or similar of billing address
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IL", value = "State, province, or similar of billing address")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public PortoutDetails zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Postal Code of billing address
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000", value = "Postal Code of billing address")
  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZip() {
    return zip;
  }


  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZip(String zip) {
    this.zip = zip;
  }


  public PortoutDetails lsr(List<URI> lsr) {
    this.lsr = lsr;
    return this;
  }

  public PortoutDetails addlsrItem(URI lsrItem) {
    if (this.lsr == null) {
      this.lsr = new ArrayList<>();
    }
    this.lsr.add(lsrItem);
    return this;
  }

   /**
   * The Local Service Request
   * @return lsr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"https://example.com/files/lsr.pdf\"]", value = "The Local Service Request")
  @JsonProperty(JSON_PROPERTY_LSR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<URI> getLsr() {
    return lsr;
  }


  @JsonProperty(JSON_PROPERTY_LSR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLsr(List<URI> lsr) {
    this.lsr = lsr;
  }


  public PortoutDetails pon(String pon) {
    this.pon = pon;
    return this;
  }

   /**
   * Port order number assigned by the carrier the number will be ported out to
   * @return pon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000", value = "Port order number assigned by the carrier the number will be ported out to")
  @JsonProperty(JSON_PROPERTY_PON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPon() {
    return pon;
  }


  @JsonProperty(JSON_PROPERTY_PON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPon(String pon) {
    this.pon = pon;
  }


  public PortoutDetails reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason why the order is being rejected by the user. If the order is authorized, this field can be left null
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason why the order is being rejected by the user. If the order is authorized, this field can be left null")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public PortoutDetails rejectionCode(Integer rejectionCode) {
    this.rejectionCode = rejectionCode;
    return this;
  }

   /**
   * The rejection code for one of the valid rejections to reject a port out order
   * @return rejectionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1002", value = "The rejection code for one of the valid rejections to reject a port out order")
  @JsonProperty(JSON_PROPERTY_REJECTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRejectionCode() {
    return rejectionCode;
  }


  @JsonProperty(JSON_PROPERTY_REJECTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectionCode(Integer rejectionCode) {
    this.rejectionCode = rejectionCode;
  }


  public PortoutDetails serviceAddress(String serviceAddress) {
    this.serviceAddress = serviceAddress;
    return this;
  }

   /**
   * First line of billing address (street address)
   * @return serviceAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000 Example Street", value = "First line of billing address (street address)")
  @JsonProperty(JSON_PROPERTY_SERVICE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAddress() {
    return serviceAddress;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceAddress(String serviceAddress) {
    this.serviceAddress = serviceAddress;
  }


  public PortoutDetails focDate(String focDate) {
    this.focDate = focDate;
    return this;
  }

   /**
   * ISO 8601 formatted Date/Time of the FOC date
   * @return focDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted Date/Time of the FOC date")
  @JsonProperty(JSON_PROPERTY_FOC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFocDate() {
    return focDate;
  }


  @JsonProperty(JSON_PROPERTY_FOC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFocDate(String focDate) {
    this.focDate = focDate;
  }


  public PortoutDetails requestedFocDate(String requestedFocDate) {
    this.requestedFocDate = requestedFocDate;
    return this;
  }

   /**
   * ISO 8601 formatted Date/Time of the user requested FOC date
   * @return requestedFocDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted Date/Time of the user requested FOC date")
  @JsonProperty(JSON_PROPERTY_REQUESTED_FOC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestedFocDate() {
    return requestedFocDate;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED_FOC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedFocDate(String requestedFocDate) {
    this.requestedFocDate = requestedFocDate;
  }


  public PortoutDetails spid(String spid) {
    this.spid = spid;
    return this;
  }

   /**
   * New service provider spid
   * @return spid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "New service provider spid")
  @JsonProperty(JSON_PROPERTY_SPID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpid() {
    return spid;
  }


  @JsonProperty(JSON_PROPERTY_SPID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpid(String spid) {
    this.spid = spid;
  }


  public PortoutDetails supportKey(String supportKey) {
    this.supportKey = supportKey;
    return this;
  }

   /**
   * A key to reference this port out request when contacting Telnyx customer support
   * @return supportKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PO_764725", value = "A key to reference this port out request when contacting Telnyx customer support")
  @JsonProperty(JSON_PROPERTY_SUPPORT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSupportKey() {
    return supportKey;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportKey(String supportKey) {
    this.supportKey = supportKey;
  }


  public PortoutDetails status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of portout request
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rejected", value = "Status of portout request")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public PortoutDetails alreadyPorted(Boolean alreadyPorted) {
    this.alreadyPorted = alreadyPorted;
    return this;
  }

   /**
   * Is true when the number is already ported
   * @return alreadyPorted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Is true when the number is already ported")
  @JsonProperty(JSON_PROPERTY_ALREADY_PORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAlreadyPorted() {
    return alreadyPorted;
  }


  @JsonProperty(JSON_PROPERTY_ALREADY_PORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlreadyPorted(Boolean alreadyPorted) {
    this.alreadyPorted = alreadyPorted;
  }


  public PortoutDetails userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identifies the user (or organization) who requested the port out
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7865816a-ee85-4e50-b19e-52983dcc6d4a", value = "Identifies the user (or organization) who requested the port out")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public PortoutDetails vendor(UUID vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Telnyx partner providing network coverage
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0e66ed3b-37e6-4fed-93d6-a30ce2493661", value = "Telnyx partner providing network coverage")
  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getVendor() {
    return vendor;
  }


  @JsonProperty(JSON_PROPERTY_VENDOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVendor(UUID vendor) {
    this.vendor = vendor;
  }


  public PortoutDetails createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the portout was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date of when the portout was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PortoutDetails insertedAt(String insertedAt) {
    this.insertedAt = insertedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the portout was created
   * @return insertedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date of when the portout was created")
  @JsonProperty(JSON_PROPERTY_INSERTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsertedAt() {
    return insertedAt;
  }


  @JsonProperty(JSON_PROPERTY_INSERTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsertedAt(String insertedAt) {
    this.insertedAt = insertedAt;
  }


  public PortoutDetails updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the portout was last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date of when the portout was last updated")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this PortoutDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortoutDetails portoutDetails = (PortoutDetails) o;
    return Objects.equals(this.id, portoutDetails.id) &&
        Objects.equals(this.recordType, portoutDetails.recordType) &&
        Objects.equals(this.phoneNumbers, portoutDetails.phoneNumbers) &&
        Objects.equals(this.authorizedName, portoutDetails.authorizedName) &&
        Objects.equals(this.carrierName, portoutDetails.carrierName) &&
        Objects.equals(this.currentCarrier, portoutDetails.currentCarrier) &&
        Objects.equals(this.endUserName, portoutDetails.endUserName) &&
        Objects.equals(this.city, portoutDetails.city) &&
        Objects.equals(this.state, portoutDetails.state) &&
        Objects.equals(this.zip, portoutDetails.zip) &&
        Objects.equals(this.lsr, portoutDetails.lsr) &&
        Objects.equals(this.pon, portoutDetails.pon) &&
        Objects.equals(this.reason, portoutDetails.reason) &&
        Objects.equals(this.rejectionCode, portoutDetails.rejectionCode) &&
        Objects.equals(this.serviceAddress, portoutDetails.serviceAddress) &&
        Objects.equals(this.focDate, portoutDetails.focDate) &&
        Objects.equals(this.requestedFocDate, portoutDetails.requestedFocDate) &&
        Objects.equals(this.spid, portoutDetails.spid) &&
        Objects.equals(this.supportKey, portoutDetails.supportKey) &&
        Objects.equals(this.status, portoutDetails.status) &&
        Objects.equals(this.alreadyPorted, portoutDetails.alreadyPorted) &&
        Objects.equals(this.userId, portoutDetails.userId) &&
        Objects.equals(this.vendor, portoutDetails.vendor) &&
        Objects.equals(this.createdAt, portoutDetails.createdAt) &&
        Objects.equals(this.insertedAt, portoutDetails.insertedAt) &&
        Objects.equals(this.updatedAt, portoutDetails.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumbers, authorizedName, carrierName, currentCarrier, endUserName, city, state, zip, lsr, pon, reason, rejectionCode, serviceAddress, focDate, requestedFocDate, spid, supportKey, status, alreadyPorted, userId, vendor, createdAt, insertedAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortoutDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    authorizedName: ").append(toIndentedString(authorizedName)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    currentCarrier: ").append(toIndentedString(currentCarrier)).append("\n");
    sb.append("    endUserName: ").append(toIndentedString(endUserName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    lsr: ").append(toIndentedString(lsr)).append("\n");
    sb.append("    pon: ").append(toIndentedString(pon)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    rejectionCode: ").append(toIndentedString(rejectionCode)).append("\n");
    sb.append("    serviceAddress: ").append(toIndentedString(serviceAddress)).append("\n");
    sb.append("    focDate: ").append(toIndentedString(focDate)).append("\n");
    sb.append("    requestedFocDate: ").append(toIndentedString(requestedFocDate)).append("\n");
    sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
    sb.append("    supportKey: ").append(toIndentedString(supportKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    alreadyPorted: ").append(toIndentedString(alreadyPorted)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    insertedAt: ").append(toIndentedString(insertedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

