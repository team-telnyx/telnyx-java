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
import com.telnyx.sdk.model.Status;
import com.telnyx.sdk.model.Usecase;
import com.telnyx.sdk.model.Vertical;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Campaign
 */
@JsonPropertyOrder(
    {
        Campaign.JSON_PROPERTY_CAMPAIGN_ID,
        Campaign.JSON_PROPERTY_CSP_ID,
        Campaign.JSON_PROPERTY_RESELLER_ID,
        Campaign.JSON_PROPERTY_STATUS,
        Campaign.JSON_PROPERTY_CREATE_DATE,
        Campaign.JSON_PROPERTY_AUTO_RENEWAL,
        Campaign.JSON_PROPERTY_BILLED_DATE,
        Campaign.JSON_PROPERTY_BRAND_ID,
        Campaign.JSON_PROPERTY_VERTICAL,
        Campaign.JSON_PROPERTY_USECASE,
        Campaign.JSON_PROPERTY_SUB_USECASES,
        Campaign.JSON_PROPERTY_DESCRIPTION,
        Campaign.JSON_PROPERTY_EMBEDDED_LINK,
        Campaign.JSON_PROPERTY_EMBEDDED_PHONE,
        Campaign.JSON_PROPERTY_AFFILIATE_MARKETING,
        Campaign.JSON_PROPERTY_NUMBER_POOL,
        Campaign.JSON_PROPERTY_AGE_GATED,
        Campaign.JSON_PROPERTY_DIRECT_LENDING,
        Campaign.JSON_PROPERTY_SUBSCRIBER_OPTIN,
        Campaign.JSON_PROPERTY_SUBSCRIBER_OPTOUT,
        Campaign.JSON_PROPERTY_SUBSCRIBER_HELP,
        Campaign.JSON_PROPERTY_SAMPLE1,
        Campaign.JSON_PROPERTY_SAMPLE2,
        Campaign.JSON_PROPERTY_SAMPLE3,
        Campaign.JSON_PROPERTY_SAMPLE4,
        Campaign.JSON_PROPERTY_SAMPLE5,
        Campaign.JSON_PROPERTY_MESSAGE_FLOW,
        Campaign.JSON_PROPERTY_HELP_MESSAGE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class Campaign {

    public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
    private String campaignId;

    public static final String JSON_PROPERTY_CSP_ID = "cspId";
    private String cspId;

    public static final String JSON_PROPERTY_RESELLER_ID = "resellerId";
    private String resellerId;

    public static final String JSON_PROPERTY_STATUS = "status";
    private Status status;

    public static final String JSON_PROPERTY_CREATE_DATE = "createDate";
    private OffsetDateTime createDate;

    public static final String JSON_PROPERTY_AUTO_RENEWAL = "autoRenewal";
    private Boolean autoRenewal;

    public static final String JSON_PROPERTY_BILLED_DATE = "billedDate";
    private OffsetDateTime billedDate;

    public static final String JSON_PROPERTY_BRAND_ID = "brandId";
    private String brandId;

    public static final String JSON_PROPERTY_VERTICAL = "vertical";
    private Vertical vertical;

    public static final String JSON_PROPERTY_USECASE = "usecase";
    private Usecase usecase;

    public static final String JSON_PROPERTY_SUB_USECASES = "subUsecases";
    private Usecase subUsecases;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_EMBEDDED_LINK = "embeddedLink";
    private Boolean embeddedLink = false;

    public static final String JSON_PROPERTY_EMBEDDED_PHONE = "embeddedPhone";
    private Boolean embeddedPhone = false;

    public static final String JSON_PROPERTY_AFFILIATE_MARKETING =
        "affiliateMarketing";
    private Boolean affiliateMarketing;

    public static final String JSON_PROPERTY_NUMBER_POOL = "numberPool";
    private Boolean numberPool = false;

    public static final String JSON_PROPERTY_AGE_GATED = "ageGated";
    private Boolean ageGated;

    public static final String JSON_PROPERTY_DIRECT_LENDING = "directLending";
    private Boolean directLending;

    public static final String JSON_PROPERTY_SUBSCRIBER_OPTIN =
        "subscriberOptin";
    private Boolean subscriberOptin = false;

    public static final String JSON_PROPERTY_SUBSCRIBER_OPTOUT =
        "subscriberOptout";
    private Boolean subscriberOptout = false;

    public static final String JSON_PROPERTY_SUBSCRIBER_HELP = "subscriberHelp";
    private Boolean subscriberHelp = false;

    public static final String JSON_PROPERTY_SAMPLE1 = "sample1";
    private String sample1;

    public static final String JSON_PROPERTY_SAMPLE2 = "sample2";
    private String sample2;

    public static final String JSON_PROPERTY_SAMPLE3 = "sample3";
    private String sample3;

    public static final String JSON_PROPERTY_SAMPLE4 = "sample4";
    private String sample4;

    public static final String JSON_PROPERTY_SAMPLE5 = "sample5";
    private String sample5;

    public static final String JSON_PROPERTY_MESSAGE_FLOW = "messageFlow";
    private String messageFlow;

    public static final String JSON_PROPERTY_HELP_MESSAGE = "helpMessage";
    private String helpMessage;

    public Campaign() {}

    public Campaign campaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Alphanumeric identifier assigned by the registry for a campaign. This identifier is required by the NetNumber OSR SMS enabling process of 10DLC.
     * @return campaignId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "4b30017a-15eb-6a25-2e3f-59b6422cud79",
        value = "Alphanumeric identifier assigned by the registry for a campaign. This identifier is required by the NetNumber OSR SMS enabling process of 10DLC."
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

    public Campaign cspId(String cspId) {
        this.cspId = cspId;
        return this;
    }

    /**
     * Alphanumeric identifier of the CSP associated with this campaign.
     * @return cspId
     **/
    @jakarta.annotation.Nullable
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

    public Campaign resellerId(String resellerId) {
        this.resellerId = resellerId;
        return this;
    }

    /**
     * Alphanumeric identifier of the reseller that you want to associate with this campaign.
     * @return resellerId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "RPQFAOY",
        value = "Alphanumeric identifier of the reseller that you want to associate with this campaign."
    )
    @JsonProperty(JSON_PROPERTY_RESELLER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getResellerId() {
        return resellerId;
    }

    @JsonProperty(JSON_PROPERTY_RESELLER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResellerId(String resellerId) {
        this.resellerId = resellerId;
    }

    public Campaign status(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign defaults to ACTIVE status.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Current campaign status. Possible values: ACTIVE, EXPIRED. A newly created campaign defaults to ACTIVE status."
    )
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Status getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(Status status) {
        this.status = status;
    }

    public Campaign createDate(OffsetDateTime createDate) {
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
    public OffsetDateTime getCreateDate() {
        return createDate;
    }

    @JsonProperty(JSON_PROPERTY_CREATE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreateDate(OffsetDateTime createDate) {
        this.createDate = createDate;
    }

    public Campaign autoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }

    /**
     * Campaign subscription auto-renewal status.
     * @return autoRenewal
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Campaign subscription auto-renewal status.")
    @JsonProperty(JSON_PROPERTY_AUTO_RENEWAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAutoRenewal() {
        return autoRenewal;
    }

    @JsonProperty(JSON_PROPERTY_AUTO_RENEWAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }

    public Campaign billedDate(OffsetDateTime billedDate) {
        this.billedDate = billedDate;
        return this;
    }

    /**
     * Campaign recent billed date.
     * @return billedDate
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Campaign recent billed date.")
    @JsonProperty(JSON_PROPERTY_BILLED_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getBilledDate() {
        return billedDate;
    }

    @JsonProperty(JSON_PROPERTY_BILLED_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBilledDate(OffsetDateTime billedDate) {
        this.billedDate = billedDate;
    }

    public Campaign brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Alphanumeric identifier of the brand associated with this campaign.
     * @return brandId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "4b206179-f731-8ab7-f19c-34e19d22ide9",
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

    public Campaign vertical(Vertical vertical) {
        this.vertical = vertical;
        return this;
    }

    /**
     * Get vertical
     * @return vertical
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_VERTICAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Vertical getVertical() {
        return vertical;
    }

    @JsonProperty(JSON_PROPERTY_VERTICAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVertical(Vertical vertical) {
        this.vertical = vertical;
    }

    public Campaign usecase(Usecase usecase) {
        this.usecase = usecase;
        return this;
    }

    /**
     * Get usecase
     * @return usecase
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_USECASE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Usecase getUsecase() {
        return usecase;
    }

    @JsonProperty(JSON_PROPERTY_USECASE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUsecase(Usecase usecase) {
        this.usecase = usecase;
    }

    public Campaign subUsecases(Usecase subUsecases) {
        this.subUsecases = subUsecases;
        return this;
    }

    /**
     * Get subUsecases
     * @return subUsecases
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SUB_USECASES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Usecase getSubUsecases() {
        return subUsecases;
    }

    @JsonProperty(JSON_PROPERTY_SUB_USECASES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubUsecases(Usecase subUsecases) {
        this.subUsecases = subUsecases;
    }

    public Campaign description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Summary description of this campaign.
     * @return description
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Campaign description goes here.",
        required = true,
        value = "Summary description of this campaign."
    )
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDescription(String description) {
        this.description = description;
    }

    public Campaign embeddedLink(Boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
        return this;
    }

    /**
     * Does message generated by the campaign include URL link in SMS?
     * @return embeddedLink
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Does message generated by the campaign include URL link in SMS?"
    )
    @JsonProperty(JSON_PROPERTY_EMBEDDED_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEmbeddedLink() {
        return embeddedLink;
    }

    @JsonProperty(JSON_PROPERTY_EMBEDDED_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmbeddedLink(Boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
    }

    public Campaign embeddedPhone(Boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
        return this;
    }

    /**
     * Does message generated by the campaign include phone number in SMS?
     * @return embeddedPhone
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Does message generated by the campaign include phone number in SMS?"
    )
    @JsonProperty(JSON_PROPERTY_EMBEDDED_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEmbeddedPhone() {
        return embeddedPhone;
    }

    @JsonProperty(JSON_PROPERTY_EMBEDDED_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmbeddedPhone(Boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
    }

    public Campaign affiliateMarketing(Boolean affiliateMarketing) {
        this.affiliateMarketing = affiliateMarketing;
        return this;
    }

    /**
     * Does message content controlled by affiliate marketing other than the brand?
     * @return affiliateMarketing
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Does message content controlled by affiliate marketing other than the brand?"
    )
    @JsonProperty(JSON_PROPERTY_AFFILIATE_MARKETING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAffiliateMarketing() {
        return affiliateMarketing;
    }

    @JsonProperty(JSON_PROPERTY_AFFILIATE_MARKETING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAffiliateMarketing(Boolean affiliateMarketing) {
        this.affiliateMarketing = affiliateMarketing;
    }

    public Campaign numberPool(Boolean numberPool) {
        this.numberPool = numberPool;
        return this;
    }

    /**
     * Does campaign utilize pool of phone nubers?
     * @return numberPool
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Does campaign utilize pool of phone nubers?")
    @JsonProperty(JSON_PROPERTY_NUMBER_POOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getNumberPool() {
        return numberPool;
    }

    @JsonProperty(JSON_PROPERTY_NUMBER_POOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNumberPool(Boolean numberPool) {
        this.numberPool = numberPool;
    }

    public Campaign ageGated(Boolean ageGated) {
        this.ageGated = ageGated;
        return this;
    }

    /**
     * Age gated content in campaign.
     * @return ageGated
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Age gated content in campaign.")
    @JsonProperty(JSON_PROPERTY_AGE_GATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAgeGated() {
        return ageGated;
    }

    @JsonProperty(JSON_PROPERTY_AGE_GATED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAgeGated(Boolean ageGated) {
        this.ageGated = ageGated;
    }

    public Campaign directLending(Boolean directLending) {
        this.directLending = directLending;
        return this;
    }

    /**
     * Get directLending
     * @return directLending
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DIRECT_LENDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getDirectLending() {
        return directLending;
    }

    @JsonProperty(JSON_PROPERTY_DIRECT_LENDING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDirectLending(Boolean directLending) {
        this.directLending = directLending;
    }

    public Campaign subscriberOptin(Boolean subscriberOptin) {
        this.subscriberOptin = subscriberOptin;
        return this;
    }

    /**
     * Does campaign require subscriber to opt-in before SMS is sent to subscriber?
     * @return subscriberOptin
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Does campaign require subscriber to opt-in before SMS is sent to subscriber?"
    )
    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_OPTIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSubscriberOptin() {
        return subscriberOptin;
    }

    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_OPTIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubscriberOptin(Boolean subscriberOptin) {
        this.subscriberOptin = subscriberOptin;
    }

    public Campaign subscriberOptout(Boolean subscriberOptout) {
        this.subscriberOptout = subscriberOptout;
        return this;
    }

    /**
     * Does campaign support subscriber opt-out keyword(s)?
     * @return subscriberOptout
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Does campaign support subscriber opt-out keyword(s)?"
    )
    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_OPTOUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSubscriberOptout() {
        return subscriberOptout;
    }

    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_OPTOUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubscriberOptout(Boolean subscriberOptout) {
        this.subscriberOptout = subscriberOptout;
    }

    public Campaign subscriberHelp(Boolean subscriberHelp) {
        this.subscriberHelp = subscriberHelp;
        return this;
    }

    /**
     * Does campaign responds to help keyword(s)?
     * @return subscriberHelp
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Does campaign responds to help keyword(s)?")
    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_HELP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSubscriberHelp() {
        return subscriberHelp;
    }

    @JsonProperty(JSON_PROPERTY_SUBSCRIBER_HELP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubscriberHelp(Boolean subscriberHelp) {
        this.subscriberHelp = subscriberHelp;
    }

    public Campaign sample1(String sample1) {
        this.sample1 = sample1;
        return this;
    }

    /**
     * Message sample. Some campaign tiers require 1 or more message samples.
     * @return sample1
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "This is a an updated message!",
        value = "Message sample. Some campaign tiers require 1 or more message samples."
    )
    @JsonProperty(JSON_PROPERTY_SAMPLE1)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSample1() {
        return sample1;
    }

    @JsonProperty(JSON_PROPERTY_SAMPLE1)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSample1(String sample1) {
        this.sample1 = sample1;
    }

    public Campaign sample2(String sample2) {
        this.sample2 = sample2;
        return this;
    }

    /**
     * Message sample. Some campaign tiers require 2 or more message samples.
     * @return sample2
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "This is a newly created message!",
        value = "Message sample. Some campaign tiers require 2 or more message samples."
    )
    @JsonProperty(JSON_PROPERTY_SAMPLE2)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSample2() {
        return sample2;
    }

    @JsonProperty(JSON_PROPERTY_SAMPLE2)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSample2(String sample2) {
        this.sample2 = sample2;
    }

    public Campaign sample3(String sample3) {
        this.sample3 = sample3;
        return this;
    }

    /**
     * Message sample. Some campaign tiers require 3 or more message samples.
     * @return sample3
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "This is a newly created message!",
        value = "Message sample. Some campaign tiers require 3 or more message samples."
    )
    @JsonProperty(JSON_PROPERTY_SAMPLE3)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSample3() {
        return sample3;
    }

    @JsonProperty(JSON_PROPERTY_SAMPLE3)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSample3(String sample3) {
        this.sample3 = sample3;
    }

    public Campaign sample4(String sample4) {
        this.sample4 = sample4;
        return this;
    }

    /**
     * Message sample. Some campaign tiers require 4 or more message samples.
     * @return sample4
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Message sample. Some campaign tiers require 4 or more message samples."
    )
    @JsonProperty(JSON_PROPERTY_SAMPLE4)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSample4() {
        return sample4;
    }

    @JsonProperty(JSON_PROPERTY_SAMPLE4)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSample4(String sample4) {
        this.sample4 = sample4;
    }

    public Campaign sample5(String sample5) {
        this.sample5 = sample5;
        return this;
    }

    /**
     * Message sample. Some campaign tiers require 5 or more message samples.
     * @return sample5
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Message sample. Some campaign tiers require 5 or more message samples."
    )
    @JsonProperty(JSON_PROPERTY_SAMPLE5)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSample5() {
        return sample5;
    }

    @JsonProperty(JSON_PROPERTY_SAMPLE5)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSample5(String sample5) {
        this.sample5 = sample5;
    }

    public Campaign messageFlow(String messageFlow) {
        this.messageFlow = messageFlow;
        return this;
    }

    /**
     * Message flow description.
     * @return messageFlow
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Message flow description.")
    @JsonProperty(JSON_PROPERTY_MESSAGE_FLOW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessageFlow() {
        return messageFlow;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_FLOW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessageFlow(String messageFlow) {
        this.messageFlow = messageFlow;
    }

    public Campaign helpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
        return this;
    }

    /**
     * Help message of the campaign.
     * @return helpMessage
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Help message of the campaign.")
    @JsonProperty(JSON_PROPERTY_HELP_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getHelpMessage() {
        return helpMessage;
    }

    @JsonProperty(JSON_PROPERTY_HELP_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    /**
     * Return true if this Campaign object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Campaign campaign = (Campaign) o;
        return (
            Objects.equals(this.campaignId, campaign.campaignId) &&
            Objects.equals(this.cspId, campaign.cspId) &&
            Objects.equals(this.resellerId, campaign.resellerId) &&
            Objects.equals(this.status, campaign.status) &&
            Objects.equals(this.createDate, campaign.createDate) &&
            Objects.equals(this.autoRenewal, campaign.autoRenewal) &&
            Objects.equals(this.billedDate, campaign.billedDate) &&
            Objects.equals(this.brandId, campaign.brandId) &&
            Objects.equals(this.vertical, campaign.vertical) &&
            Objects.equals(this.usecase, campaign.usecase) &&
            Objects.equals(this.subUsecases, campaign.subUsecases) &&
            Objects.equals(this.description, campaign.description) &&
            Objects.equals(this.embeddedLink, campaign.embeddedLink) &&
            Objects.equals(this.embeddedPhone, campaign.embeddedPhone) &&
            Objects.equals(
                this.affiliateMarketing,
                campaign.affiliateMarketing
            ) &&
            Objects.equals(this.numberPool, campaign.numberPool) &&
            Objects.equals(this.ageGated, campaign.ageGated) &&
            Objects.equals(this.directLending, campaign.directLending) &&
            Objects.equals(this.subscriberOptin, campaign.subscriberOptin) &&
            Objects.equals(this.subscriberOptout, campaign.subscriberOptout) &&
            Objects.equals(this.subscriberHelp, campaign.subscriberHelp) &&
            Objects.equals(this.sample1, campaign.sample1) &&
            Objects.equals(this.sample2, campaign.sample2) &&
            Objects.equals(this.sample3, campaign.sample3) &&
            Objects.equals(this.sample4, campaign.sample4) &&
            Objects.equals(this.sample5, campaign.sample5) &&
            Objects.equals(this.messageFlow, campaign.messageFlow) &&
            Objects.equals(this.helpMessage, campaign.helpMessage)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            campaignId,
            cspId,
            resellerId,
            status,
            createDate,
            autoRenewal,
            billedDate,
            brandId,
            vertical,
            usecase,
            subUsecases,
            description,
            embeddedLink,
            embeddedPhone,
            affiliateMarketing,
            numberPool,
            ageGated,
            directLending,
            subscriberOptin,
            subscriberOptout,
            subscriberHelp,
            sample1,
            sample2,
            sample3,
            sample4,
            sample5,
            messageFlow,
            helpMessage
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Campaign {\n");
        sb
            .append("    campaignId: ")
            .append(toIndentedString(campaignId))
            .append("\n");
        sb.append("    cspId: ").append(toIndentedString(cspId)).append("\n");
        sb
            .append("    resellerId: ")
            .append(toIndentedString(resellerId))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    createDate: ")
            .append(toIndentedString(createDate))
            .append("\n");
        sb
            .append("    autoRenewal: ")
            .append(toIndentedString(autoRenewal))
            .append("\n");
        sb
            .append("    billedDate: ")
            .append(toIndentedString(billedDate))
            .append("\n");
        sb
            .append("    brandId: ")
            .append(toIndentedString(brandId))
            .append("\n");
        sb
            .append("    vertical: ")
            .append(toIndentedString(vertical))
            .append("\n");
        sb
            .append("    usecase: ")
            .append(toIndentedString(usecase))
            .append("\n");
        sb
            .append("    subUsecases: ")
            .append(toIndentedString(subUsecases))
            .append("\n");
        sb
            .append("    description: ")
            .append(toIndentedString(description))
            .append("\n");
        sb
            .append("    embeddedLink: ")
            .append(toIndentedString(embeddedLink))
            .append("\n");
        sb
            .append("    embeddedPhone: ")
            .append(toIndentedString(embeddedPhone))
            .append("\n");
        sb
            .append("    affiliateMarketing: ")
            .append(toIndentedString(affiliateMarketing))
            .append("\n");
        sb
            .append("    numberPool: ")
            .append(toIndentedString(numberPool))
            .append("\n");
        sb
            .append("    ageGated: ")
            .append(toIndentedString(ageGated))
            .append("\n");
        sb
            .append("    directLending: ")
            .append(toIndentedString(directLending))
            .append("\n");
        sb
            .append("    subscriberOptin: ")
            .append(toIndentedString(subscriberOptin))
            .append("\n");
        sb
            .append("    subscriberOptout: ")
            .append(toIndentedString(subscriberOptout))
            .append("\n");
        sb
            .append("    subscriberHelp: ")
            .append(toIndentedString(subscriberHelp))
            .append("\n");
        sb
            .append("    sample1: ")
            .append(toIndentedString(sample1))
            .append("\n");
        sb
            .append("    sample2: ")
            .append(toIndentedString(sample2))
            .append("\n");
        sb
            .append("    sample3: ")
            .append(toIndentedString(sample3))
            .append("\n");
        sb
            .append("    sample4: ")
            .append(toIndentedString(sample4))
            .append("\n");
        sb
            .append("    sample5: ")
            .append(toIndentedString(sample5))
            .append("\n");
        sb
            .append("    messageFlow: ")
            .append(toIndentedString(messageFlow))
            .append("\n");
        sb
            .append("    helpMessage: ")
            .append(toIndentedString(helpMessage))
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
