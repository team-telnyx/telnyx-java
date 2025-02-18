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
 * UpdatePartnerCampaignRequest
 */
@JsonPropertyOrder(
    {
        UpdatePartnerCampaignRequest.JSON_PROPERTY_WEBHOOK_U_R_L,
        UpdatePartnerCampaignRequest.JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdatePartnerCampaignRequest {

    public static final String JSON_PROPERTY_WEBHOOK_U_R_L = "webhookURL";
    private String webhookURL;

    public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L =
        "webhookFailoverURL";
    private String webhookFailoverURL;

    public UpdatePartnerCampaignRequest() {}

    public UpdatePartnerCampaignRequest webhookURL(String webhookURL) {
        this.webhookURL = webhookURL;
        return this;
    }

    /**
     * Webhook to which campaign status updates are sent.
     * @return webhookURL
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93",
        value = "Webhook to which campaign status updates are sent."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookURL() {
        return webhookURL;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookURL(String webhookURL) {
        this.webhookURL = webhookURL;
    }

    public UpdatePartnerCampaignRequest webhookFailoverURL(
        String webhookFailoverURL
    ) {
        this.webhookFailoverURL = webhookFailoverURL;
        return this;
    }

    /**
     * Webhook failover to which campaign status updates are sent.
     * @return webhookFailoverURL
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6",
        value = "Webhook failover to which campaign status updates are sent."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookFailoverURL() {
        return webhookFailoverURL;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookFailoverURL(String webhookFailoverURL) {
        this.webhookFailoverURL = webhookFailoverURL;
    }

    /**
     * Return true if this UpdatePartnerCampaignRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePartnerCampaignRequest updatePartnerCampaignRequest =
            (UpdatePartnerCampaignRequest) o;
        return (
            Objects.equals(
                this.webhookURL,
                updatePartnerCampaignRequest.webhookURL
            ) &&
            Objects.equals(
                this.webhookFailoverURL,
                updatePartnerCampaignRequest.webhookFailoverURL
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(webhookURL, webhookFailoverURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePartnerCampaignRequest {\n");
        sb
            .append("    webhookURL: ")
            .append(toIndentedString(webhookURL))
            .append("\n");
        sb
            .append("    webhookFailoverURL: ")
            .append(toIndentedString(webhookFailoverURL))
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
