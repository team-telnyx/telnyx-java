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
 * Campaign is generated by the 10DLC registry once the corresponding campaign request is approved. Each campaign is assigned a unique identifier - **campaignId**. Once a campaign is activated, limited information is published to the NetNumber OSR service for consumption by members of the ecosystem. When a campaign is suspended(reversible) or expired(non-reversible), campaign data is deleted from the OSR service. Most attributes of campaignare immutable, including **usecase**, **vertical**, **brandId** and **cspId**.
 */
@ApiModel(
    description = "Campaign is generated by the 10DLC registry once the corresponding campaign request is approved. Each campaign is assigned a unique identifier - **campaignId**. Once a campaign is activated, limited information is published to the NetNumber OSR service for consumption by members of the ecosystem. When a campaign is suspended(reversible) or expired(non-reversible), campaign data is deleted from the OSR service. Most attributes of campaignare immutable, including **usecase**, **vertical**, **brandId** and **cspId**."
)
@JsonPropertyOrder(
    {
        SharedCampaign.JSON_PROPERTY_BRAND_ID,
        SharedCampaign.JSON_PROPERTY_CAMPAIGN_ID,
        SharedCampaign.JSON_PROPERTY_CREATE_DATE,
        SharedCampaign.JSON_PROPERTY_STATUS,
        SharedCampaign.JSON_PROPERTY_USECASE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SharedCampaign {

    public static final String JSON_PROPERTY_BRAND_ID = "brandId";
    private String brandId;

    public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
    private String campaignId;

    public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
    private String createDate;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public static final String JSON_PROPERTY_USECASE = "usecase";
    private String usecase;

    public SharedCampaign() {}

    public SharedCampaign brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Alphanumeric identifier of the brand associated with this campaign.
     * @return brandId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Alphanumeric identifier of the brand associated with this campaign."
    )
    @JsonProperty(JSON_PROPERTY_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBrandId() {
        return brandId;
    }

    @JsonProperty(JSON_PROPERTY_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public SharedCampaign campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Alphanumeric identifier assigned by the registry for a campaign. This identifier is required by the NetNumber OSR SMS enabling process of 10DLC.
     * @return campaignId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Alphanumeric identifier assigned by the registry for a campaign. This identifier is required by the NetNumber OSR SMS enabling process of 10DLC."
    )
    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCampaignId() {
        return campaignId;
    }

    @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public SharedCampaign createDate(String createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * Unix timestamp when campaign was created.
     * @return createDate
     **/
    @jakarta.annotation.Nullable
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

    public SharedCampaign status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign defaults to ACTIVE status.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign defaults to ACTIVE status. "
    )
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    public SharedCampaign usecase(String usecase) {
        this.usecase = usecase;
        return this;
    }

    /**
     * Campaign usecase. Must be of defined valid types. Use &#x60;/registry/enum/usecase&#x60; operation to retrieve usecases available for given brand.
     * @return usecase
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Campaign usecase. Must be of defined valid types. Use `/registry/enum/usecase` operation to retrieve usecases available for given brand."
    )
    @JsonProperty(JSON_PROPERTY_USECASE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUsecase() {
        return usecase;
    }

    @JsonProperty(JSON_PROPERTY_USECASE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUsecase(String usecase) {
        this.usecase = usecase;
    }

    /**
     * Return true if this SharedCampaign object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SharedCampaign sharedCampaign = (SharedCampaign) o;
        return (
            Objects.equals(this.brandId, sharedCampaign.brandId) &&
            Objects.equals(this.campaignId, sharedCampaign.campaignId) &&
            Objects.equals(this.createDate, sharedCampaign.createDate) &&
            Objects.equals(this.status, sharedCampaign.status) &&
            Objects.equals(this.usecase, sharedCampaign.usecase)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, campaignId, createDate, status, usecase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharedCampaign {\n");
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
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    usecase: ")
            .append(toIndentedString(usecase))
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
