/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UserRequirement
 */
@JsonPropertyOrder({
  UserRequirement.JSON_PROPERTY_REQUIREMENT_ID,
  UserRequirement.JSON_PROPERTY_FIELD_VALUE,
  UserRequirement.JSON_PROPERTY_FIELD_TYPE,
  UserRequirement.JSON_PROPERTY_STATUS,
  UserRequirement.JSON_PROPERTY_EXPIRES_AT,
  UserRequirement.JSON_PROPERTY_CREATED_AT,
  UserRequirement.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class UserRequirement {
  public static final String JSON_PROPERTY_REQUIREMENT_ID = "requirement_id";
  private String requirementId;

  public static final String JSON_PROPERTY_FIELD_VALUE = "field_value";
  private String fieldValue;

  public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
  private String fieldType;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    APPROVED(String.valueOf("approved")),
    
    UNAPPROVED(String.valueOf("unapproved")),
    
    PENDING_APPROVAL(String.valueOf("pending-approval")),
    
    DECLINED(String.valueOf("declined"));

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

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private OffsetDateTime expiresAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public UserRequirement() { 
  }

  public UserRequirement requirementId(String requirementId) {
    this.requirementId = requirementId;
    return this;
  }

   /**
   * Get requirementId
   * @return requirementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequirementId() {
    return requirementId;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequirementId(String requirementId) {
    this.requirementId = requirementId;
  }


  public UserRequirement fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Get fieldValue
   * @return fieldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldValue() {
    return fieldValue;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  public UserRequirement fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldType() {
    return fieldType;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  public UserRequirement status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public UserRequirement expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public UserRequirement createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public UserRequirement updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this UserRequirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRequirement userRequirement = (UserRequirement) o;
    return Objects.equals(this.requirementId, userRequirement.requirementId) &&
        Objects.equals(this.fieldValue, userRequirement.fieldValue) &&
        Objects.equals(this.fieldType, userRequirement.fieldType) &&
        Objects.equals(this.status, userRequirement.status) &&
        Objects.equals(this.expiresAt, userRequirement.expiresAt) &&
        Objects.equals(this.createdAt, userRequirement.createdAt) &&
        Objects.equals(this.updatedAt, userRequirement.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementId, fieldValue, fieldType, status, expiresAt, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRequirement {\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

