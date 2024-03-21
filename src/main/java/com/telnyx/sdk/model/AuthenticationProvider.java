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
import com.telnyx.sdk.model.AuthenticationProviderSettings;
import java.util.Arrays;
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * AuthenticationProvider
 */
@JsonPropertyOrder({
  AuthenticationProvider.JSON_PROPERTY_ID,
  AuthenticationProvider.JSON_PROPERTY_RECORD_TYPE,
  AuthenticationProvider.JSON_PROPERTY_NAME,
  AuthenticationProvider.JSON_PROPERTY_SHORT_NAME,
  AuthenticationProvider.JSON_PROPERTY_ORGANIZATION_ID,
  AuthenticationProvider.JSON_PROPERTY_ACTIVE,
  AuthenticationProvider.JSON_PROPERTY_SETTINGS,
  AuthenticationProvider.JSON_PROPERTY_CREATED_AT,
  AuthenticationProvider.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AuthenticationProvider {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SHORT_NAME = "short_name";
  private String shortName;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private UUID organizationId;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active = true;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private AuthenticationProviderSettings settings;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public AuthenticationProvider() { 
  }

  public AuthenticationProvider id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the authentication provider.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35146afd-df93-4963-b1e9-1a085e2ae874", value = "Uniquely identifies the authentication provider.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public AuthenticationProvider recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authentication_provider", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public AuthenticationProvider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name associated with the authentication provider.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Okta", value = "The name associated with the authentication provider.")
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


  public AuthenticationProvider shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * The short name associated with the authentication provider. This must be unique and URL-friendly, as it&#39;s going to be part of the login URL.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "myorg", value = "The short name associated with the authentication provider. This must be unique and URL-friendly, as it's going to be part of the login URL.")
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortName() {
    return shortName;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public AuthenticationProvider organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The id from the Organization the authentication provider belongs to.
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24b4a4bb-c4df-46ad-bbcb-23fc741c5ad7", value = "The id from the Organization the authentication provider belongs to.")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }


  public AuthenticationProvider active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * The active status of the authentication provider
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "The active status of the authentication provider")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public AuthenticationProvider settings(AuthenticationProviderSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthenticationProviderSettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(AuthenticationProviderSettings settings) {
    this.settings = settings;
  }


  public AuthenticationProvider createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
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


  public AuthenticationProvider updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
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
   * Return true if this AuthenticationProvider object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationProvider authenticationProvider = (AuthenticationProvider) o;
    return Objects.equals(this.id, authenticationProvider.id) &&
        Objects.equals(this.recordType, authenticationProvider.recordType) &&
        Objects.equals(this.name, authenticationProvider.name) &&
        Objects.equals(this.shortName, authenticationProvider.shortName) &&
        Objects.equals(this.organizationId, authenticationProvider.organizationId) &&
        Objects.equals(this.active, authenticationProvider.active) &&
        Objects.equals(this.settings, authenticationProvider.settings) &&
        Objects.equals(this.createdAt, authenticationProvider.createdAt) &&
        Objects.equals(this.updatedAt, authenticationProvider.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, name, shortName, organizationId, active, settings, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

