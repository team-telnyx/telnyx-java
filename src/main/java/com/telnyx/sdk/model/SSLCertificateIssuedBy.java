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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SSLCertificateIssuedBy
 */
@JsonPropertyOrder(
    {
        SSLCertificateIssuedBy.JSON_PROPERTY_COMMON_NAME,
        SSLCertificateIssuedBy.JSON_PROPERTY_ORGANIZATION,
        SSLCertificateIssuedBy.JSON_PROPERTY_ORGANIZATION_UNIT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SSLCertificateIssuedBy {

    public static final String JSON_PROPERTY_COMMON_NAME = "common_name";
    private String commonName;

    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    private String organization;

    public static final String JSON_PROPERTY_ORGANIZATION_UNIT =
        "organization_unit";
    private String organizationUnit;

    public SSLCertificateIssuedBy() {}

    public SSLCertificateIssuedBy commonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * The common name of the entity the certificate was issued by
     * @return commonName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The common name of the entity the certificate was issued by"
    )
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

    public SSLCertificateIssuedBy organization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * The organization the certificate was issued by
     * @return organization
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The organization the certificate was issued by")
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

    public SSLCertificateIssuedBy organizationUnit(String organizationUnit) {
        this.organizationUnit = organizationUnit;
        return this;
    }

    /**
     * The organizational unit the certificate was issued by
     * @return organizationUnit
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The organizational unit the certificate was issued by"
    )
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
     * Return true if this SSLCertificate_issued_by object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SSLCertificateIssuedBy ssLCertificateIssuedBy =
            (SSLCertificateIssuedBy) o;
        return (
            Objects.equals(
                this.commonName,
                ssLCertificateIssuedBy.commonName
            ) &&
            Objects.equals(
                this.organization,
                ssLCertificateIssuedBy.organization
            ) &&
            Objects.equals(
                this.organizationUnit,
                ssLCertificateIssuedBy.organizationUnit
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonName, organization, organizationUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSLCertificateIssuedBy {\n");
        sb
            .append("    commonName: ")
            .append(toIndentedString(commonName))
            .append("\n");
        sb
            .append("    organization: ")
            .append(toIndentedString(organization))
            .append("\n");
        sb
            .append("    organizationUnit: ")
            .append(toIndentedString(organizationUnit))
            .append("\n");
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
