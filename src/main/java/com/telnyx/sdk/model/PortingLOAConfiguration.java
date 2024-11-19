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
import com.telnyx.sdk.model.PortingLOAConfigurationAddress;
import com.telnyx.sdk.model.PortingLOAConfigurationContact;
import com.telnyx.sdk.model.PortingLOAConfigurationLogo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PortingLOAConfiguration
 */
@JsonPropertyOrder({
  PortingLOAConfiguration.JSON_PROPERTY_ID,
  PortingLOAConfiguration.JSON_PROPERTY_COMPANY_NAME,
  PortingLOAConfiguration.JSON_PROPERTY_ORGANIZATION_ID,
  PortingLOAConfiguration.JSON_PROPERTY_NAME,
  PortingLOAConfiguration.JSON_PROPERTY_LOGO,
  PortingLOAConfiguration.JSON_PROPERTY_ADDRESS,
  PortingLOAConfiguration.JSON_PROPERTY_CONTACT,
  PortingLOAConfiguration.JSON_PROPERTY_RECORD_TYPE,
  PortingLOAConfiguration.JSON_PROPERTY_CREATED_AT,
  PortingLOAConfiguration.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class PortingLOAConfiguration {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_COMPANY_NAME = "company_name";
  private String companyName;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private String organizationId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private PortingLOAConfigurationLogo logo;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private PortingLOAConfigurationAddress address;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private PortingLOAConfigurationContact contact;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public PortingLOAConfiguration() { 
  }

  @JsonCreator
  public PortingLOAConfiguration(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
  ) {
    this();
    this.recordType = recordType;
  }

  public PortingLOAConfiguration id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the LOA configuration.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eef3340b-8903-4466-b445-89b697315a3a", value = "Uniquely identifies the LOA configuration.")
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


  public PortingLOAConfiguration companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * The name of the company
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Telnyx", value = "The name of the company")
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public PortingLOAConfiguration organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The organization that owns the LOA configuration
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f902", value = "The organization that owns the LOA configuration")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  public PortingLOAConfiguration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the LOA configuration
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My LOA Configuration", value = "The name of the LOA configuration")
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


  public PortingLOAConfiguration logo(PortingLOAConfigurationLogo logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PortingLOAConfigurationLogo getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(PortingLOAConfigurationLogo logo) {
    this.logo = logo;
  }


  public PortingLOAConfiguration address(PortingLOAConfigurationAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PortingLOAConfigurationAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(PortingLOAConfigurationAddress address) {
    this.address = address;
  }


  public PortingLOAConfiguration contact(PortingLOAConfigurationContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PortingLOAConfigurationContact getContact() {
    return contact;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContact(PortingLOAConfigurationContact contact) {
    this.contact = contact;
  }


   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "porting_loa_configuration", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public PortingLOAConfiguration createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-19T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the resource was created.")
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


  public PortingLOAConfiguration updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-19T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
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
   * Return true if this PortingLOAConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingLOAConfiguration portingLOAConfiguration = (PortingLOAConfiguration) o;
    return Objects.equals(this.id, portingLOAConfiguration.id) &&
        Objects.equals(this.companyName, portingLOAConfiguration.companyName) &&
        Objects.equals(this.organizationId, portingLOAConfiguration.organizationId) &&
        Objects.equals(this.name, portingLOAConfiguration.name) &&
        Objects.equals(this.logo, portingLOAConfiguration.logo) &&
        Objects.equals(this.address, portingLOAConfiguration.address) &&
        Objects.equals(this.contact, portingLOAConfiguration.contact) &&
        Objects.equals(this.recordType, portingLOAConfiguration.recordType) &&
        Objects.equals(this.createdAt, portingLOAConfiguration.createdAt) &&
        Objects.equals(this.updatedAt, portingLOAConfiguration.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyName, organizationId, name, logo, address, contact, recordType, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingLOAConfiguration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

