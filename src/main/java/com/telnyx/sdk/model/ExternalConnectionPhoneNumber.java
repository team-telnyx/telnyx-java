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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ExternalConnectionPhoneNumber
 */
@JsonPropertyOrder({
  ExternalConnectionPhoneNumber.JSON_PROPERTY_TICKET_ID,
  ExternalConnectionPhoneNumber.JSON_PROPERTY_TELEPHONE_NUMBER,
  ExternalConnectionPhoneNumber.JSON_PROPERTY_NUMBER_ID,
  ExternalConnectionPhoneNumber.JSON_PROPERTY_CIVIC_ADDRESS_ID,
  ExternalConnectionPhoneNumber.JSON_PROPERTY_LOCATION_ID,
  ExternalConnectionPhoneNumber.JSON_PROPERTY_DISPLAYED_COUNTRY_CODE,
  ExternalConnectionPhoneNumber.JSON_PROPERTY_ACQUIRED_CAPABILITIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ExternalConnectionPhoneNumber {
  public static final String JSON_PROPERTY_TICKET_ID = "ticket_id";
  private UUID ticketId;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephone_number";
  private String telephoneNumber;

  public static final String JSON_PROPERTY_NUMBER_ID = "number_id";
  private String numberId;

  public static final String JSON_PROPERTY_CIVIC_ADDRESS_ID = "civic_address_id";
  private UUID civicAddressId;

  public static final String JSON_PROPERTY_LOCATION_ID = "location_id";
  private UUID locationId;

  public static final String JSON_PROPERTY_DISPLAYED_COUNTRY_CODE = "displayed_country_code";
  private String displayedCountryCode;

  /**
   * The capabilities that are available for this phone number on Microsoft Teams.
   */
  public enum AcquiredCapabilitiesEnum {
    FIRST_PARTY_APP_ASSIGNMENT(String.valueOf("FirstPartyAppAssignment")),
    
    INBOUND_CALLING(String.valueOf("InboundCalling")),
    
    OFFICE365(String.valueOf("Office365")),
    
    OUTBOUND_CALLING(String.valueOf("OutboundCalling")),
    
    USER_ASSIGNMENT(String.valueOf("UserAssignment"));

    private String value;

    AcquiredCapabilitiesEnum(String value) {
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
    public static AcquiredCapabilitiesEnum fromValue(String value) {
      for (AcquiredCapabilitiesEnum b : AcquiredCapabilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACQUIRED_CAPABILITIES = "acquired_capabilities";
  private List<AcquiredCapabilitiesEnum> acquiredCapabilities = null;

  public ExternalConnectionPhoneNumber() { 
  }

  public ExternalConnectionPhoneNumber ticketId(UUID ticketId) {
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Uniquely identifies the resource.
   * @return ticketId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "542c3bca-d247-42bc-8fe7-e01d16ecd761", value = "Uniquely identifies the resource.")
  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTicketId() {
    return ticketId;
  }


  @JsonProperty(JSON_PROPERTY_TICKET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTicketId(UUID ticketId) {
    this.ticketId = ticketId;
  }


  public ExternalConnectionPhoneNumber telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * Phone number in E164 format.
   * @return telephoneNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Phone number in E164 format.")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  public ExternalConnectionPhoneNumber numberId(String numberId) {
    this.numberId = numberId;
    return this;
  }

   /**
   * Phone number ID from the Telnyx API.
   * @return numberId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Phone number ID from the Telnyx API.")
  @JsonProperty(JSON_PROPERTY_NUMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumberId() {
    return numberId;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberId(String numberId) {
    this.numberId = numberId;
  }


  public ExternalConnectionPhoneNumber civicAddressId(UUID civicAddressId) {
    this.civicAddressId = civicAddressId;
    return this;
  }

   /**
   * Identifies the civic address assigned to the phone number.
   * @return civicAddressId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifies the civic address assigned to the phone number.")
  @JsonProperty(JSON_PROPERTY_CIVIC_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCivicAddressId() {
    return civicAddressId;
  }


  @JsonProperty(JSON_PROPERTY_CIVIC_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCivicAddressId(UUID civicAddressId) {
    this.civicAddressId = civicAddressId;
  }


  public ExternalConnectionPhoneNumber locationId(UUID locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Identifies the location assigned to the phone number.
   * @return locationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifies the location assigned to the phone number.")
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLocationId() {
    return locationId;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationId(UUID locationId) {
    this.locationId = locationId;
  }


  public ExternalConnectionPhoneNumber displayedCountryCode(String displayedCountryCode) {
    this.displayedCountryCode = displayedCountryCode;
    return this;
  }

   /**
   * The iso country code that will be displayed to the user when they receive a call from this phone number.
   * @return displayedCountryCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The iso country code that will be displayed to the user when they receive a call from this phone number.")
  @JsonProperty(JSON_PROPERTY_DISPLAYED_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayedCountryCode() {
    return displayedCountryCode;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAYED_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayedCountryCode(String displayedCountryCode) {
    this.displayedCountryCode = displayedCountryCode;
  }


  public ExternalConnectionPhoneNumber acquiredCapabilities(List<AcquiredCapabilitiesEnum> acquiredCapabilities) {
    this.acquiredCapabilities = acquiredCapabilities;
    return this;
  }

  public ExternalConnectionPhoneNumber addacquiredCapabilitiesItem(AcquiredCapabilitiesEnum acquiredCapabilitiesItem) {
    if (this.acquiredCapabilities == null) {
      this.acquiredCapabilities = new ArrayList<>();
    }
    this.acquiredCapabilities.add(acquiredCapabilitiesItem);
    return this;
  }

   /**
   * Get acquiredCapabilities
   * @return acquiredCapabilities
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACQUIRED_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AcquiredCapabilitiesEnum> getAcquiredCapabilities() {
    return acquiredCapabilities;
  }


  @JsonProperty(JSON_PROPERTY_ACQUIRED_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcquiredCapabilities(List<AcquiredCapabilitiesEnum> acquiredCapabilities) {
    this.acquiredCapabilities = acquiredCapabilities;
  }


  /**
   * Return true if this ExternalConnectionPhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalConnectionPhoneNumber externalConnectionPhoneNumber = (ExternalConnectionPhoneNumber) o;
    return Objects.equals(this.ticketId, externalConnectionPhoneNumber.ticketId) &&
        Objects.equals(this.telephoneNumber, externalConnectionPhoneNumber.telephoneNumber) &&
        Objects.equals(this.numberId, externalConnectionPhoneNumber.numberId) &&
        Objects.equals(this.civicAddressId, externalConnectionPhoneNumber.civicAddressId) &&
        Objects.equals(this.locationId, externalConnectionPhoneNumber.locationId) &&
        Objects.equals(this.displayedCountryCode, externalConnectionPhoneNumber.displayedCountryCode) &&
        Objects.equals(this.acquiredCapabilities, externalConnectionPhoneNumber.acquiredCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, telephoneNumber, numberId, civicAddressId, locationId, displayedCountryCode, acquiredCapabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalConnectionPhoneNumber {\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    numberId: ").append(toIndentedString(numberId)).append("\n");
    sb.append("    civicAddressId: ").append(toIndentedString(civicAddressId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    displayedCountryCode: ").append(toIndentedString(displayedCountryCode)).append("\n");
    sb.append("    acquiredCapabilities: ").append(toIndentedString(acquiredCapabilities)).append("\n");
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

