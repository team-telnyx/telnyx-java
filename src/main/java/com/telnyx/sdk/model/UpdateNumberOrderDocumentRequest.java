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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdateNumberOrderDocumentRequest
 */
@JsonPropertyOrder({
  UpdateNumberOrderDocumentRequest.JSON_PROPERTY_ID,
  UpdateNumberOrderDocumentRequest.JSON_PROPERTY_RECORD_TYPE,
  UpdateNumberOrderDocumentRequest.JSON_PROPERTY_FILE_ID,
  UpdateNumberOrderDocumentRequest.JSON_PROPERTY_REQUIREMENTS_ID,
  UpdateNumberOrderDocumentRequest.JSON_PROPERTY_CUSTOMER_REFERENCE,
  UpdateNumberOrderDocumentRequest.JSON_PROPERTY_REQUIREMENT_TYPE,
  UpdateNumberOrderDocumentRequest.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateNumberOrderDocumentRequest {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_FILE_ID = "file_id";
  private String fileId;

  public static final String JSON_PROPERTY_REQUIREMENTS_ID = "requirements_id";
  private String requirementsId;

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
  private String customerReference;

  /**
   * Gets or Sets requirementType
   */
  public enum RequirementTypeEnum {
    ADDRESS_PROOF("address_proof"),
    
    IDENTIFICATION("identification"),
    
    REG_FORM("reg_form");

    private String value;

    RequirementTypeEnum(String value) {
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
    public static RequirementTypeEnum fromValue(String value) {
      for (RequirementTypeEnum b : RequirementTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REQUIREMENT_TYPE = "requirement_type";
  private RequirementTypeEnum requirementType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "387d1e31-a218-4375-8151-103f2d5e2d2c", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "number_order_document", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public UpdateNumberOrderDocumentRequest fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The id of the file to associate as a number order document.
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1e3c5822-0362-4702-8e46-5a129f0d3976", value = "The id of the file to associate as a number order document.")
  @JsonProperty(JSON_PROPERTY_FILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileId() {
    return fileId;
  }


  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  public UpdateNumberOrderDocumentRequest requirementsId(String requirementsId) {
    this.requirementsId = requirementsId;
    return this;
  }

   /**
   * Unique id for a requirement.
   * @return requirementsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "36aaf27d-986b-493c-bd1b-de16af2e4292", value = "Unique id for a requirement.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequirementsId() {
    return requirementsId;
  }


  public void setRequirementsId(String requirementsId) {
    this.requirementsId = requirementsId;
  }


  public UpdateNumberOrderDocumentRequest customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MY REF 001", value = "A customer reference string for customer look ups.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerReference() {
    return customerReference;
  }


  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


   /**
   * Get requirementType
   * @return requirementType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIREMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequirementTypeEnum getRequirementType() {
    return requirementType;
  }




   /**
   * An ISO 8901 datetime string denoting when the number order document was uploaded.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8901 datetime string denoting when the number order document was uploaded.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




  /**
   * Return true if this UpdateNumberOrderDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateNumberOrderDocumentRequest updateNumberOrderDocumentRequest = (UpdateNumberOrderDocumentRequest) o;
    return Objects.equals(this.id, updateNumberOrderDocumentRequest.id) &&
        Objects.equals(this.recordType, updateNumberOrderDocumentRequest.recordType) &&
        Objects.equals(this.fileId, updateNumberOrderDocumentRequest.fileId) &&
        Objects.equals(this.requirementsId, updateNumberOrderDocumentRequest.requirementsId) &&
        Objects.equals(this.customerReference, updateNumberOrderDocumentRequest.customerReference) &&
        Objects.equals(this.requirementType, updateNumberOrderDocumentRequest.requirementType) &&
        Objects.equals(this.createdAt, updateNumberOrderDocumentRequest.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, fileId, requirementsId, customerReference, requirementType, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateNumberOrderDocumentRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    requirementsId: ").append(toIndentedString(requirementsId)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    requirementType: ").append(toIndentedString(requirementType)).append("\n");
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

