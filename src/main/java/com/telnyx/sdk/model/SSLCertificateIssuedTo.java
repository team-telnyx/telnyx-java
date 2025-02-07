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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * SSLCertificateIssuedTo
 */
@JsonPropertyOrder({
  SSLCertificateIssuedTo.JSON_PROPERTY_COMMON_NAME,
  SSLCertificateIssuedTo.JSON_PROPERTY_ORGANIZATION,
  SSLCertificateIssuedTo.JSON_PROPERTY_ORGANIZATION_UNIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SSLCertificateIssuedTo {
  public static final String JSON_PROPERTY_COMMON_NAME = "common_name";
  private String commonName;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private String organization;

  public static final String JSON_PROPERTY_ORGANIZATION_UNIT = "organization_unit";
  private String organizationUnit;

  public SSLCertificateIssuedTo() { 
  }

  public SSLCertificateIssuedTo commonName(String commonName) {
    this.commonName = commonName;
    return this;
  }

   /**
   * The common name of the entity the certificate was issued to
   * @return commonName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The common name of the entity the certificate was issued to")
  @JsonProperty(JSON_PROPERTY_COMMON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommonName() {
    return commonName;
  }


  @JsonProperty(JSON_PROPERTY_COMMON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }


  public SSLCertificateIssuedTo organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * The organization the certificate was issued to
   * @return organization
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The organization the certificate was issued to")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganization() {
    return organization;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public SSLCertificateIssuedTo organizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
    return this;
  }

   /**
   * The organizational unit the certificate was issued to
   * @return organizationUnit
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The organizational unit the certificate was issued to")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganizationUnit() {
    return organizationUnit;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationUnit(String organizationUnit) {
    this.organizationUnit = organizationUnit;
  }


  /**
   * Return true if this SSLCertificate_issued_to object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLCertificateIssuedTo ssLCertificateIssuedTo = (SSLCertificateIssuedTo) o;
    return Objects.equals(this.commonName, ssLCertificateIssuedTo.commonName) &&
        Objects.equals(this.organization, ssLCertificateIssuedTo.organization) &&
        Objects.equals(this.organizationUnit, ssLCertificateIssuedTo.organizationUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commonName, organization, organizationUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLCertificateIssuedTo {\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationUnit: ").append(toIndentedString(organizationUnit)).append("\n");
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

