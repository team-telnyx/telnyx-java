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
 * SubNumberOrderRegulatoryRequirement
 */
@JsonPropertyOrder({
  SubNumberOrderRegulatoryRequirement.JSON_PROPERTY_RECORD_TYPE,
  SubNumberOrderRegulatoryRequirement.JSON_PROPERTY_REQUIREMENT_ID,
  SubNumberOrderRegulatoryRequirement.JSON_PROPERTY_FIELD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubNumberOrderRegulatoryRequirement {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_REQUIREMENT_ID = "requirement_id";
  private UUID requirementId;

  /**
   * Gets or Sets fieldType
   */
  public enum FieldTypeEnum {
    TEXTUAL("textual"),
    
    DATETIME("datetime"),
    
    ADDRESS("address"),
    
    DOCUMENT("document");

    private String value;

    FieldTypeEnum(String value) {
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
    public static FieldTypeEnum fromValue(String value) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
  private FieldTypeEnum fieldType;

  public SubNumberOrderRegulatoryRequirement() { 
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phone_number_regulatory_requirement", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public SubNumberOrderRegulatoryRequirement requirementId(UUID requirementId) {
    this.requirementId = requirementId;
    return this;
  }

   /**
   * Unique id for a requirement.
   * @return requirementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8ffb3622-7c6b-4ccc-b65f-7a3dc0099576", value = "Unique id for a requirement.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRequirementId() {
    return requirementId;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequirementId(UUID requirementId) {
    this.requirementId = requirementId;
  }


   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "address", value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FieldTypeEnum getFieldType() {
    return fieldType;
  }




  /**
   * Return true if this SubNumberOrderRegulatoryRequirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubNumberOrderRegulatoryRequirement subNumberOrderRegulatoryRequirement = (SubNumberOrderRegulatoryRequirement) o;
    return Objects.equals(this.recordType, subNumberOrderRegulatoryRequirement.recordType) &&
        Objects.equals(this.requirementId, subNumberOrderRegulatoryRequirement.requirementId) &&
        Objects.equals(this.fieldType, subNumberOrderRegulatoryRequirement.fieldType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, requirementId, fieldType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubNumberOrderRegulatoryRequirement {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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
