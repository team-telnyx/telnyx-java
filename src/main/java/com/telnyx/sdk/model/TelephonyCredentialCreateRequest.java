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
 * TelephonyCredentialCreateRequest
 */
@JsonPropertyOrder({
  TelephonyCredentialCreateRequest.JSON_PROPERTY_NAME,
  TelephonyCredentialCreateRequest.JSON_PROPERTY_TAG,
  TelephonyCredentialCreateRequest.JSON_PROPERTY_CONNECTION_ID,
  TelephonyCredentialCreateRequest.JSON_PROPERTY_EXPIRES_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class TelephonyCredentialCreateRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private String expiresAt;

  public TelephonyCredentialCreateRequest() { 
  }

  public TelephonyCredentialCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TelephonyCredentialCreateRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tags a credential. A single tag can hold at maximum 1000 credentials.
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some_tag", value = "Tags a credential. A single tag can hold at maximum 1000 credentials.")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public TelephonyCredentialCreateRequest connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the Credential Connection this credential is associated with.
   * @return connectionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1234567890", required = true, value = "Identifies the Credential Connection this credential is associated with.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public TelephonyCredentialCreateRequest expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ISO-8601 formatted date indicating when the credential will expire.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO-8601 formatted date indicating when the credential will expire.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiresAt() {
    return expiresAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }


  /**
   * Return true if this TelephonyCredentialCreateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephonyCredentialCreateRequest telephonyCredentialCreateRequest = (TelephonyCredentialCreateRequest) o;
    return Objects.equals(this.name, telephonyCredentialCreateRequest.name) &&
        Objects.equals(this.tag, telephonyCredentialCreateRequest.tag) &&
        Objects.equals(this.connectionId, telephonyCredentialCreateRequest.connectionId) &&
        Objects.equals(this.expiresAt, telephonyCredentialCreateRequest.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tag, connectionId, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephonyCredentialCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

