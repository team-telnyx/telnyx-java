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
import com.telnyx.sdk.model.CampaignSharingStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CampaignSharingChain
 */
@JsonPropertyOrder(
    {
        CampaignSharingChain.JSON_PROPERTY_SHARED_BY_ME,
        CampaignSharingChain.JSON_PROPERTY_SHARED_WITH_ME,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CampaignSharingChain {

    public static final String JSON_PROPERTY_SHARED_BY_ME = "sharedByMe";
    private CampaignSharingStatus sharedByMe;

    public static final String JSON_PROPERTY_SHARED_WITH_ME = "sharedWithMe";
    private CampaignSharingStatus sharedWithMe;

    public CampaignSharingChain() {}

    public CampaignSharingChain sharedByMe(CampaignSharingStatus sharedByMe) {
        this.sharedByMe = sharedByMe;
        return this;
    }

    /**
     * Get sharedByMe
     * @return sharedByMe
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SHARED_BY_ME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CampaignSharingStatus getSharedByMe() {
        return sharedByMe;
    }

    @JsonProperty(JSON_PROPERTY_SHARED_BY_ME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSharedByMe(CampaignSharingStatus sharedByMe) {
        this.sharedByMe = sharedByMe;
    }

    public CampaignSharingChain sharedWithMe(
        CampaignSharingStatus sharedWithMe
    ) {
        this.sharedWithMe = sharedWithMe;
        return this;
    }

    /**
     * Get sharedWithMe
     * @return sharedWithMe
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SHARED_WITH_ME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CampaignSharingStatus getSharedWithMe() {
        return sharedWithMe;
    }

    @JsonProperty(JSON_PROPERTY_SHARED_WITH_ME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSharedWithMe(CampaignSharingStatus sharedWithMe) {
        this.sharedWithMe = sharedWithMe;
    }

    /**
     * Return true if this CampaignSharingChain object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignSharingChain campaignSharingChain = (CampaignSharingChain) o;
        return (
            Objects.equals(this.sharedByMe, campaignSharingChain.sharedByMe) &&
            Objects.equals(this.sharedWithMe, campaignSharingChain.sharedWithMe)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedByMe, sharedWithMe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignSharingChain {\n");
        sb
            .append("    sharedByMe: ")
            .append(toIndentedString(sharedByMe))
            .append("\n");
        sb
            .append("    sharedWithMe: ")
            .append(toIndentedString(sharedWithMe))
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
