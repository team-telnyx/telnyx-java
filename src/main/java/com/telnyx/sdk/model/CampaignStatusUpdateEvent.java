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
 * CampaignStatusUpdateEvent
 */
@JsonPropertyOrder(
    {
        CampaignStatusUpdateEvent.JSON_PROPERTY_BRAND_ID,
        CampaignStatusUpdateEvent.JSON_PROPERTY_CAMPAIGN_ID,
        CampaignStatusUpdateEvent.JSON_PROPERTY_CREATE_DATE,
        CampaignStatusUpdateEvent.JSON_PROPERTY_CSP_ID,
        CampaignStatusUpdateEvent.JSON_PROPERTY_IS_T_MOBILE_REGISTERED,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CampaignStatusUpdateEvent {

    public static final String JSON_PROPERTY_BRAND_ID = "brandId";
    private String brandId;

    public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
    private String campaignId;

    public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
    private String createDate;

    public static final String JSON_PROPERTY_CSP_ID = "cspId";
    private String cspId;

    public static final String JSON_PROPERTY_IS_T_MOBILE_REGISTERED =
        "isTMobileRegistered";
    private Boolean isTMobileRegistered;

    public CampaignStatusUpdateEvent() {}

    public CampaignStatusUpdateEvent brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Brand ID associated with the campaign.
     * @return brandId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5",
        value = "Brand ID associated with the campaign."
    )
    @JsonProperty(JSON_PROPERTY_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBrandId() {
        return brandId;
    }

    @JsonProperty(JSON_PROPERTY_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public CampaignStatusUpdateEvent campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * The ID of the campaign.
     * @return campaignId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "4b300178-131c-d902-d54e-72d90ba1620j",
        value = "The ID of the campaign."
    )
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCampaignId() {
        return campaignId;
    }

    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public CampaignStatusUpdateEvent createDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Unix timestamp when campaign was created.
     * @return createDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Unix timestamp when campaign was created.")
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

    public CampaignStatusUpdateEvent cspId(String cspId) {
        this.cspId = cspId;
        return this;
    }

    /**
     * Alphanumeric identifier of the CSP associated with this campaign.
     * @return cspId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Alphanumeric identifier of the CSP associated with this campaign."
    )
    @JsonProperty(JSON_PROPERTY_CSP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCspId() {
        return cspId;
    }

    @JsonProperty(JSON_PROPERTY_CSP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCspId(String cspId) {
        this.cspId = cspId;
    }

    public CampaignStatusUpdateEvent isTMobileRegistered(
        Boolean isTMobileRegistered
    ) {
        this.isTMobileRegistered = isTMobileRegistered;
        return this;
    }

    /**
     * Indicates whether the campaign is registered with T-Mobile.
     * @return isTMobileRegistered
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates whether the campaign is registered with T-Mobile."
    )
    @JsonProperty(JSON_PROPERTY_IS_T_MOBILE_REGISTERED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsTMobileRegistered() {
        return isTMobileRegistered;
    }

    @JsonProperty(JSON_PROPERTY_IS_T_MOBILE_REGISTERED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsTMobileRegistered(Boolean isTMobileRegistered) {
        this.isTMobileRegistered = isTMobileRegistered;
    }

    /**
     * Return true if this CampaignStatusUpdateEvent object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignStatusUpdateEvent campaignStatusUpdateEvent =
            (CampaignStatusUpdateEvent) o;
        return (
            Objects.equals(this.brandId, campaignStatusUpdateEvent.brandId) &&
            Objects.equals(
                this.campaignId,
                campaignStatusUpdateEvent.campaignId
            ) &&
            Objects.equals(
                this.createDate,
                campaignStatusUpdateEvent.createDate
            ) &&
            Objects.equals(this.cspId, campaignStatusUpdateEvent.cspId) &&
            Objects.equals(
                this.isTMobileRegistered,
                campaignStatusUpdateEvent.isTMobileRegistered
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            brandId,
            campaignId,
            createDate,
            cspId,
            isTMobileRegistered
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignStatusUpdateEvent {\n");
        sb
            .append("    brandId: ")
            .append(toIndentedString(brandId))
            .append("\n");
        sb
            .append("    campaignId: ")
            .append(toIndentedString(campaignId))
            .append("\n");
        sb
            .append("    createDate: ")
            .append(toIndentedString(createDate))
            .append("\n");
        sb.append("    cspId: ").append(toIndentedString(cspId)).append("\n");
        sb
            .append("    isTMobileRegistered: ")
            .append(toIndentedString(isTMobileRegistered))
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
