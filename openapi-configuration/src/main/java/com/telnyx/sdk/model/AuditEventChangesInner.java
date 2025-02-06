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
import com.telnyx.sdk.model.AuditEventChangesInnerFrom;
import com.telnyx.sdk.model.AuditEventChangesInnerTo;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * AuditEventChangesInner
 */
@JsonPropertyOrder({
  AuditEventChangesInner.JSON_PROPERTY_FIELD,
  AuditEventChangesInner.JSON_PROPERTY_TO,
  AuditEventChangesInner.JSON_PROPERTY_FROM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AuditEventChangesInner {
  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_TO = "to";
  private AuditEventChangesInnerTo to;

  public static final String JSON_PROPERTY_FROM = "from";
  private AuditEventChangesInnerFrom from;

  public AuditEventChangesInner() { 
  }

  public AuditEventChangesInner field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The name of the field that was changed. May use the dot notation to indicate nested fields.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "nested.field.name", value = "The name of the field that was changed. May use the dot notation to indicate nested fields.")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public AuditEventChangesInner to(AuditEventChangesInnerTo to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditEventChangesInnerTo getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(AuditEventChangesInnerTo to) {
    this.to = to;
  }


  public AuditEventChangesInner from(AuditEventChangesInnerFrom from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuditEventChangesInnerFrom getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(AuditEventChangesInnerFrom from) {
    this.from = from;
  }


  /**
   * Return true if this AuditEventChanges_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditEventChangesInner auditEventChangesInner = (AuditEventChangesInner) o;
    return Objects.equals(this.field, auditEventChangesInner.field) &&
        Objects.equals(this.to, auditEventChangesInner.to) &&
        Objects.equals(this.from, auditEventChangesInner.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, to, from);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditEventChangesInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

