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
 * ExternalVetting
 */
@JsonPropertyOrder(
    {
        ExternalVetting.JSON_PROPERTY_EVP_ID,
        ExternalVetting.JSON_PROPERTY_VETTING_ID,
        ExternalVetting.JSON_PROPERTY_VETTING_TOKEN,
        ExternalVetting.JSON_PROPERTY_VETTING_SCORE,
        ExternalVetting.JSON_PROPERTY_VETTING_CLASS,
        ExternalVetting.JSON_PROPERTY_VETTED_DATE,
        ExternalVetting.JSON_PROPERTY_CREATE_DATE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ExternalVetting {

    public static final String JSON_PROPERTY_EVP_ID = "evpId";
    private String evpId;

    public static final String JSON_PROPERTY_VETTING_ID = "vettingId";
    private String vettingId;

    public static final String JSON_PROPERTY_VETTING_TOKEN = "vettingToken";
    private String vettingToken;

    public static final String JSON_PROPERTY_VETTING_SCORE = "vettingScore";
    private Integer vettingScore;

    public static final String JSON_PROPERTY_VETTING_CLASS = "vettingClass";
    private String vettingClass;

    public static final String JSON_PROPERTY_VETTED_DATE = "vettedDate";
    private String vettedDate;

    public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
    private String createDate;

    public ExternalVetting() {}

    public ExternalVetting evpId(String evpId) {
        this.evpId = evpId;
        return this;
    }

    /**
     * External vetting provider ID for the brand.
     * @return evpId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "External vetting provider ID for the brand.")
    @JsonProperty(JSON_PROPERTY_EVP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEvpId() {
        return evpId;
    }

    @JsonProperty(JSON_PROPERTY_EVP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEvpId(String evpId) {
        this.evpId = evpId;
    }

    public ExternalVetting vettingId(String vettingId) {
        this.vettingId = vettingId;
        return this;
    }

    /**
     * Unique ID that identifies a vetting transaction performed by a vetting provider. This ID is provided by the vetting provider at time of vetting.
     * @return vettingId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Unique ID that identifies a vetting transaction performed by a vetting provider. This ID is provided by the vetting provider at time of vetting."
    )
    @JsonProperty(JSON_PROPERTY_VETTING_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVettingId() {
        return vettingId;
    }

    @JsonProperty(JSON_PROPERTY_VETTING_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVettingId(String vettingId) {
        this.vettingId = vettingId;
    }

    public ExternalVetting vettingToken(String vettingToken) {
        this.vettingToken = vettingToken;
        return this;
    }

    /**
     * Required by some providers for vetting record confirmation.
     * @return vettingToken
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Required by some providers for vetting record confirmation."
    )
    @JsonProperty(JSON_PROPERTY_VETTING_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVettingToken() {
        return vettingToken;
    }

    @JsonProperty(JSON_PROPERTY_VETTING_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVettingToken(String vettingToken) {
        this.vettingToken = vettingToken;
    }

    public ExternalVetting vettingScore(Integer vettingScore) {
        this.vettingScore = vettingScore;
        return this;
    }

    /**
     * Vetting score ranging from 0-100.
     * @return vettingScore
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Vetting score ranging from 0-100.")
    @JsonProperty(JSON_PROPERTY_VETTING_SCORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getVettingScore() {
        return vettingScore;
    }

    @JsonProperty(JSON_PROPERTY_VETTING_SCORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVettingScore(Integer vettingScore) {
        this.vettingScore = vettingScore;
    }

    public ExternalVetting vettingClass(String vettingClass) {
        this.vettingClass = vettingClass;
        return this;
    }

    /**
     * Identifies the vetting classification.
     * @return vettingClass
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Identifies the vetting classification.")
    @JsonProperty(JSON_PROPERTY_VETTING_CLASS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVettingClass() {
        return vettingClass;
    }

    @JsonProperty(JSON_PROPERTY_VETTING_CLASS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVettingClass(String vettingClass) {
        this.vettingClass = vettingClass;
    }

    public ExternalVetting vettedDate(String vettedDate) {
        this.vettedDate = vettedDate;
        return this;
    }

    /**
     * Vetting effective date. This is the date when vetting was completed, or the starting effective date in ISO 8601 format. If this date is missing, then the vetting was not complete or not valid.
     * @return vettedDate
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Vetting effective date. This is the date when vetting was completed, or the starting effective date in ISO 8601 format. If this date is missing, then the vetting was not complete or not valid."
    )
    @JsonProperty(JSON_PROPERTY_VETTED_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVettedDate() {
        return vettedDate;
    }

    @JsonProperty(JSON_PROPERTY_VETTED_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVettedDate(String vettedDate) {
        this.vettedDate = vettedDate;
    }

    public ExternalVetting createDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Vetting submission date. This is the date when the vetting request is generated in ISO 8601 format.
     * @return createDate
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Vetting submission date. This is the date when the vetting request is generated in ISO 8601 format."
    )
    @JsonProperty(JSON_PROPERTY_CREATE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty(JSON_PROPERTY_CREATE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * Return true if this ExternalVetting object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalVetting externalVetting = (ExternalVetting) o;
        return (
            Objects.equals(this.evpId, externalVetting.evpId) &&
            Objects.equals(this.vettingId, externalVetting.vettingId) &&
            Objects.equals(this.vettingToken, externalVetting.vettingToken) &&
            Objects.equals(this.vettingScore, externalVetting.vettingScore) &&
            Objects.equals(this.vettingClass, externalVetting.vettingClass) &&
            Objects.equals(this.vettedDate, externalVetting.vettedDate) &&
            Objects.equals(this.createDate, externalVetting.createDate)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            evpId,
            vettingId,
            vettingToken,
            vettingScore,
            vettingClass,
            vettedDate,
            createDate
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalVetting {\n");
        sb.append("    evpId: ").append(toIndentedString(evpId)).append("\n");
        sb
            .append("    vettingId: ")
            .append(toIndentedString(vettingId))
            .append("\n");
        sb
            .append("    vettingToken: ")
            .append(toIndentedString(vettingToken))
            .append("\n");
        sb
            .append("    vettingScore: ")
            .append(toIndentedString(vettingScore))
            .append("\n");
        sb
            .append("    vettingClass: ")
            .append(toIndentedString(vettingClass))
            .append("\n");
        sb
            .append("    vettedDate: ")
            .append(toIndentedString(vettedDate))
            .append("\n");
        sb
            .append("    createDate: ")
            .append(toIndentedString(createDate))
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
