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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CheckContactRequestBody
 */
@JsonPropertyOrder({
  CheckContactRequestBody.JSON_PROPERTY_WHATSAPP_USER_ID,
  CheckContactRequestBody.JSON_PROPERTY_BLOCKING,
  CheckContactRequestBody.JSON_PROPERTY_CONTACTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CheckContactRequestBody {
  public static final String JSON_PROPERTY_WHATSAPP_USER_ID = "whatsapp_user_id";
  private String whatsappUserId;

  /**
   * Blocking determines whether the request should wait for the processing to complete (synchronous) or not (asynchronous).
   */
  public enum BlockingEnum {
    NO_WAIT("no_wait"),
    
    WAIT("wait");

    private String value;

    BlockingEnum(String value) {
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
    public static BlockingEnum fromValue(String value) {
      for (BlockingEnum b : BlockingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BLOCKING = "blocking";
  private BlockingEnum blocking = BlockingEnum.NO_WAIT;

  public static final String JSON_PROPERTY_CONTACTS = "contacts";
  private List<String> contacts = new ArrayList<>();

  public CheckContactRequestBody() { 
  }

  public CheckContactRequestBody whatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
    return this;
  }

   /**
   * The sender&#39;s WhatsApp ID.
   * @return whatsappUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The sender's WhatsApp ID.")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWhatsappUserId() {
    return whatsappUserId;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWhatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
  }


  public CheckContactRequestBody blocking(BlockingEnum blocking) {
    this.blocking = blocking;
    return this;
  }

   /**
   * Blocking determines whether the request should wait for the processing to complete (synchronous) or not (asynchronous).
   * @return blocking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Blocking determines whether the request should wait for the processing to complete (synchronous) or not (asynchronous).")
  @JsonProperty(JSON_PROPERTY_BLOCKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BlockingEnum getBlocking() {
    return blocking;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlocking(BlockingEnum blocking) {
    this.blocking = blocking;
  }


  public CheckContactRequestBody contacts(List<String> contacts) {
    this.contacts = contacts;
    return this;
  }

  public CheckContactRequestBody addContactsItem(String contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Array of contact phone numbers. The numbers can be in any standard telephone number format.
   * @return contacts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of contact phone numbers. The numbers can be in any standard telephone number format.")
  @JsonProperty(JSON_PROPERTY_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getContacts() {
    return contacts;
  }


  @JsonProperty(JSON_PROPERTY_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }


  /**
   * Return true if this CheckContactRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckContactRequestBody checkContactRequestBody = (CheckContactRequestBody) o;
    return Objects.equals(this.whatsappUserId, checkContactRequestBody.whatsappUserId) &&
        Objects.equals(this.blocking, checkContactRequestBody.blocking) &&
        Objects.equals(this.contacts, checkContactRequestBody.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsappUserId, blocking, contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckContactRequestBody {\n");
    sb.append("    whatsappUserId: ").append(toIndentedString(whatsappUserId)).append("\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

