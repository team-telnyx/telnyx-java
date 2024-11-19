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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * NotificationEventConditionParametersInner
 */
@JsonPropertyOrder({
  NotificationEventConditionParametersInner.JSON_PROPERTY_NAME,
  NotificationEventConditionParametersInner.JSON_PROPERTY_OPTIONAL,
  NotificationEventConditionParametersInner.JSON_PROPERTY_DATA_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class NotificationEventConditionParametersInner {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONAL = "optional";
  private Boolean optional;

  public static final String JSON_PROPERTY_DATA_TYPE = "data_type";
  private String dataType;

  public NotificationEventConditionParametersInner() { 
  }

  public NotificationEventConditionParametersInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phone_number", value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public NotificationEventConditionParametersInner optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Get optional
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOptional() {
    return optional;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public NotificationEventConditionParametersInner dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  /**
   * Return true if this NotificationEventCondition_parameters_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEventConditionParametersInner notificationEventConditionParametersInner = (NotificationEventConditionParametersInner) o;
    return Objects.equals(this.name, notificationEventConditionParametersInner.name) &&
        Objects.equals(this.optional, notificationEventConditionParametersInner.optional) &&
        Objects.equals(this.dataType, notificationEventConditionParametersInner.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional, dataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEventConditionParametersInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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

