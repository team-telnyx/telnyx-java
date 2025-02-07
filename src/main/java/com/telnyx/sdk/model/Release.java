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
import com.telnyx.sdk.model.TnReleaseEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Release
 */
@JsonPropertyOrder({
  Release.JSON_PROPERTY_TICKET_ID,
  Release.JSON_PROPERTY_TENANT_ID,
  Release.JSON_PROPERTY_STATUS,
  Release.JSON_PROPERTY_ERROR_MESSAGE,
  Release.JSON_PROPERTY_TELEPHONE_NUMBERS,
  Release.JSON_PROPERTY_CREATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Release {
  public static final String JSON_PROPERTY_TICKET_ID = "ticket_id";
  private UUID ticketId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenant_id";
  private UUID tenantId;

  /**
   * Represents the status of the release on Microsoft Teams.
   */
  public enum StatusEnum {
    PENDING_UPLOAD(String.valueOf("pending_upload")),
    
    PENDING(String.valueOf("pending")),
    
    IN_PROGRESS(String.valueOf("in_progress")),
    
    COMPLETE(String.valueOf("complete")),
    
    FAILED(String.valueOf("failed")),
    
    EXPIRED(String.valueOf("expired")),
    
    UNKNOWN(String.valueOf("unknown"));

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
  private StatusEnum status = StatusEnum.PENDING_UPLOAD;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "error_message";
  private String errorMessage;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBERS = "telephone_numbers";
  private List<TnReleaseEntry> telephoneNumbers = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public Release() { 
  }

  public Release ticketId(UUID ticketId) {
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


  public Release tenantId(UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ea175aba-f47c-4702-9400-efaa42688048", value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public Release status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Represents the status of the release on Microsoft Teams.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "pending", value = "Represents the status of the release on Microsoft Teams.")
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


  public Release errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * A message set if there is an error with the upload process.
   * @return errorMessage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "A message set if there is an error with the upload process.")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public Release telephoneNumbers(List<TnReleaseEntry> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
    return this;
  }

  public Release addtelephoneNumbersItem(TnReleaseEntry telephoneNumbersItem) {
    if (this.telephoneNumbers == null) {
      this.telephoneNumbers = new ArrayList<>();
    }
    this.telephoneNumbers.add(telephoneNumbersItem);
    return this;
  }

   /**
   * Get telephoneNumbers
   * @return telephoneNumbers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TnReleaseEntry> getTelephoneNumbers() {
    return telephoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumbers(List<TnReleaseEntry> telephoneNumbers) {
    this.telephoneNumbers = telephoneNumbers;
  }


  public Release createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was created.")
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


  /**
   * Return true if this Release object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Release release = (Release) o;
    return Objects.equals(this.ticketId, release.ticketId) &&
        Objects.equals(this.tenantId, release.tenantId) &&
        Objects.equals(this.status, release.status) &&
        Objects.equals(this.errorMessage, release.errorMessage) &&
        Objects.equals(this.telephoneNumbers, release.telephoneNumbers) &&
        Objects.equals(this.createdAt, release.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId, tenantId, status, errorMessage, telephoneNumbers, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Release {\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    telephoneNumbers: ").append(toIndentedString(telephoneNumbers)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

