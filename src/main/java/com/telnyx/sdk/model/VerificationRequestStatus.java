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
import com.telnyx.sdk.model.TFPhoneNumber;
import com.telnyx.sdk.model.TFVerificationStatus;
import com.telnyx.sdk.model.Url;
import com.telnyx.sdk.model.UseCaseCategories;
import com.telnyx.sdk.model.Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * A verification request and its status, suitable for returning to users
 */
@ApiModel(
    description = "A verification request and its status, suitable for returning to users"
)
@JsonPropertyOrder(
    {
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_NAME,
        VerificationRequestStatus.JSON_PROPERTY_CORPORATE_WEBSITE,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_ADDR1,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_ADDR2,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_CITY,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_STATE,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_ZIP,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_CONTACT_EMAIL,
        VerificationRequestStatus.JSON_PROPERTY_BUSINESS_CONTACT_PHONE,
        VerificationRequestStatus.JSON_PROPERTY_MESSAGE_VOLUME,
        VerificationRequestStatus.JSON_PROPERTY_PHONE_NUMBERS,
        VerificationRequestStatus.JSON_PROPERTY_USE_CASE,
        VerificationRequestStatus.JSON_PROPERTY_USE_CASE_SUMMARY,
        VerificationRequestStatus.JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT,
        VerificationRequestStatus.JSON_PROPERTY_OPT_IN_WORKFLOW,
        VerificationRequestStatus.JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS,
        VerificationRequestStatus.JSON_PROPERTY_ADDITIONAL_INFORMATION,
        VerificationRequestStatus.JSON_PROPERTY_ISV_RESELLER,
        VerificationRequestStatus.JSON_PROPERTY_WEBHOOK_URL,
        VerificationRequestStatus.JSON_PROPERTY_ID,
        VerificationRequestStatus.JSON_PROPERTY_VERIFICATION_STATUS,
        VerificationRequestStatus.JSON_PROPERTY_REASON,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class VerificationRequestStatus {

    public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
    private String businessName;

    public static final String JSON_PROPERTY_CORPORATE_WEBSITE =
        "corporateWebsite";
    private String corporateWebsite;

    public static final String JSON_PROPERTY_BUSINESS_ADDR1 = "businessAddr1";
    private String businessAddr1;

    public static final String JSON_PROPERTY_BUSINESS_ADDR2 = "businessAddr2";
    private String businessAddr2;

    public static final String JSON_PROPERTY_BUSINESS_CITY = "businessCity";
    private String businessCity;

    public static final String JSON_PROPERTY_BUSINESS_STATE = "businessState";
    private String businessState;

    public static final String JSON_PROPERTY_BUSINESS_ZIP = "businessZip";
    private String businessZip;

    public static final String JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME =
        "businessContactFirstName";
    private String businessContactFirstName;

    public static final String JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME =
        "businessContactLastName";
    private String businessContactLastName;

    public static final String JSON_PROPERTY_BUSINESS_CONTACT_EMAIL =
        "businessContactEmail";
    private String businessContactEmail;

    public static final String JSON_PROPERTY_BUSINESS_CONTACT_PHONE =
        "businessContactPhone";
    private String businessContactPhone;

    public static final String JSON_PROPERTY_MESSAGE_VOLUME = "messageVolume";
    private Volume messageVolume;

    public static final String JSON_PROPERTY_PHONE_NUMBERS = "phoneNumbers";
    private List<TFPhoneNumber> phoneNumbers = new ArrayList<>();

    public static final String JSON_PROPERTY_USE_CASE = "useCase";
    private UseCaseCategories useCase;

    public static final String JSON_PROPERTY_USE_CASE_SUMMARY =
        "useCaseSummary";
    private String useCaseSummary;

    public static final String JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT =
        "productionMessageContent";
    private String productionMessageContent;

    public static final String JSON_PROPERTY_OPT_IN_WORKFLOW = "optInWorkflow";
    private String optInWorkflow;

    public static final String JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS =
        "optInWorkflowImageURLs";
    private List<Url> optInWorkflowImageURLs = new ArrayList<>();

    public static final String JSON_PROPERTY_ADDITIONAL_INFORMATION =
        "additionalInformation";
    private String additionalInformation;

    public static final String JSON_PROPERTY_ISV_RESELLER = "isvReseller";
    private String isvReseller;

    public static final String JSON_PROPERTY_WEBHOOK_URL = "webhookUrl";
    private String webhookUrl;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_VERIFICATION_STATUS =
        "verificationStatus";
    private TFVerificationStatus verificationStatus;

    public static final String JSON_PROPERTY_REASON = "reason";
    private String reason;

    public VerificationRequestStatus() {}

    public VerificationRequestStatus businessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    /**
     * Get businessName
     * @return businessName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "Telnyx LLC", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessName() {
        return businessName;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public VerificationRequestStatus corporateWebsite(String corporateWebsite) {
        this.corporateWebsite = corporateWebsite;
        return this;
    }

    /**
     * Get corporateWebsite
     * @return corporateWebsite
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "http://example.com",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_CORPORATE_WEBSITE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCorporateWebsite() {
        return corporateWebsite;
    }

    @JsonProperty(JSON_PROPERTY_CORPORATE_WEBSITE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCorporateWebsite(String corporateWebsite) {
        this.corporateWebsite = corporateWebsite;
    }

    public VerificationRequestStatus businessAddr1(String businessAddr1) {
        this.businessAddr1 = businessAddr1;
        return this;
    }

    /**
     * Get businessAddr1
     * @return businessAddr1
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "600 Congress Avenue",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR1)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessAddr1() {
        return businessAddr1;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR1)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessAddr1(String businessAddr1) {
        this.businessAddr1 = businessAddr1;
    }

    public VerificationRequestStatus businessAddr2(String businessAddr2) {
        this.businessAddr2 = businessAddr2;
        return this;
    }

    /**
     * Get businessAddr2
     * @return businessAddr2
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "14th Floor", value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR2)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBusinessAddr2() {
        return businessAddr2;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_ADDR2)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBusinessAddr2(String businessAddr2) {
        this.businessAddr2 = businessAddr2;
    }

    public VerificationRequestStatus businessCity(String businessCity) {
        this.businessCity = businessCity;
        return this;
    }

    /**
     * Get businessCity
     * @return businessCity
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "Austin", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_CITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessCity() {
        return businessCity;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_CITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessCity(String businessCity) {
        this.businessCity = businessCity;
    }

    public VerificationRequestStatus businessState(String businessState) {
        this.businessState = businessState;
        return this;
    }

    /**
     * Get businessState
     * @return businessState
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "Texas", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessState() {
        return businessState;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessState(String businessState) {
        this.businessState = businessState;
    }

    public VerificationRequestStatus businessZip(String businessZip) {
        this.businessZip = businessZip;
        return this;
    }

    /**
     * Get businessZip
     * @return businessZip
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "78701", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_ZIP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessZip() {
        return businessZip;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_ZIP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessZip(String businessZip) {
        this.businessZip = businessZip;
    }

    public VerificationRequestStatus businessContactFirstName(
        String businessContactFirstName
    ) {
        this.businessContactFirstName = businessContactFirstName;
        return this;
    }

    /**
     * Get businessContactFirstName
     * @return businessContactFirstName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "John", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessContactFirstName() {
        return businessContactFirstName;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessContactFirstName(String businessContactFirstName) {
        this.businessContactFirstName = businessContactFirstName;
    }

    public VerificationRequestStatus businessContactLastName(
        String businessContactLastName
    ) {
        this.businessContactLastName = businessContactLastName;
        return this;
    }

    /**
     * Get businessContactLastName
     * @return businessContactLastName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "Doe", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessContactLastName() {
        return businessContactLastName;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessContactLastName(String businessContactLastName) {
        this.businessContactLastName = businessContactLastName;
    }

    public VerificationRequestStatus businessContactEmail(
        String businessContactEmail
    ) {
        this.businessContactEmail = businessContactEmail;
        return this;
    }

    /**
     * Get businessContactEmail
     * @return businessContactEmail
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "email@example.com",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_EMAIL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessContactEmail() {
        return businessContactEmail;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_EMAIL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessContactEmail(String businessContactEmail) {
        this.businessContactEmail = businessContactEmail;
    }

    public VerificationRequestStatus businessContactPhone(
        String businessContactPhone
    ) {
        this.businessContactPhone = businessContactPhone;
        return this;
    }

    /**
     * Get businessContactPhone
     * @return businessContactPhone
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "+18889809750", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_PHONE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessContactPhone() {
        return businessContactPhone;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_PHONE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessContactPhone(String businessContactPhone) {
        this.businessContactPhone = businessContactPhone;
    }

    public VerificationRequestStatus messageVolume(Volume messageVolume) {
        this.messageVolume = messageVolume;
        return this;
    }

    /**
     * One of the following exact values: 10; 100; 1,000; 10,000; 100,000; 250,000; 500,000; 750,000; 1,000,000; 5,000,000; 10,000,000+
     * @return messageVolume
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "One of the following exact values: 10; 100; 1,000; 10,000; 100,000; 250,000; 500,000; 750,000; 1,000,000; 5,000,000; 10,000,000+"
    )
    @JsonProperty(JSON_PROPERTY_MESSAGE_VOLUME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Volume getMessageVolume() {
        return messageVolume;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_VOLUME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMessageVolume(Volume messageVolume) {
        this.messageVolume = messageVolume;
    }

    public VerificationRequestStatus phoneNumbers(
        List<TFPhoneNumber> phoneNumbers
    ) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public VerificationRequestStatus addphoneNumbersItem(
        TFPhoneNumber phoneNumbersItem
    ) {
        this.phoneNumbers.add(phoneNumbersItem);
        return this;
    }

    /**
     * Get phoneNumbers
     * @return phoneNumbers
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "[{\"phoneNumber\":\"+18773554398\"},{\"phoneNumber\":\"+18773554399\"}]",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<TFPhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPhoneNumbers(List<TFPhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public VerificationRequestStatus useCase(UseCaseCategories useCase) {
        this.useCase = useCase;
        return this;
    }

    /**
     * Get useCase
     * @return useCase
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_USE_CASE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UseCaseCategories getUseCase() {
        return useCase;
    }

    @JsonProperty(JSON_PROPERTY_USE_CASE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUseCase(UseCaseCategories useCase) {
        this.useCase = useCase;
    }

    public VerificationRequestStatus useCaseSummary(String useCaseSummary) {
        this.useCaseSummary = useCaseSummary;
        return this;
    }

    /**
     * Get useCaseSummary
     * @return useCaseSummary
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "This is a use case where Telnyx sends out 2FA codes to portal users to verify their identity in order to sign into the portal",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_USE_CASE_SUMMARY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUseCaseSummary() {
        return useCaseSummary;
    }

    @JsonProperty(JSON_PROPERTY_USE_CASE_SUMMARY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUseCaseSummary(String useCaseSummary) {
        this.useCaseSummary = useCaseSummary;
    }

    public VerificationRequestStatus productionMessageContent(
        String productionMessageContent
    ) {
        this.productionMessageContent = productionMessageContent;
        return this;
    }

    /**
     * Get productionMessageContent
     * @return productionMessageContent
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Your Telnyx OTP is XXXX",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getProductionMessageContent() {
        return productionMessageContent;
    }

    @JsonProperty(JSON_PROPERTY_PRODUCTION_MESSAGE_CONTENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setProductionMessageContent(String productionMessageContent) {
        this.productionMessageContent = productionMessageContent;
    }

    public VerificationRequestStatus optInWorkflow(String optInWorkflow) {
        this.optInWorkflow = optInWorkflow;
        return this;
    }

    /**
     * Get optInWorkflow
     * @return optInWorkflow
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "User signs into the Telnyx portal, enters number and is prompted to select whether they want to use 2FA verification for security purposes. If they've opted in a confirmation message is sent out to the handset",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOptInWorkflow() {
        return optInWorkflow;
    }

    @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOptInWorkflow(String optInWorkflow) {
        this.optInWorkflow = optInWorkflow;
    }

    public VerificationRequestStatus optInWorkflowImageURLs(
        List<Url> optInWorkflowImageURLs
    ) {
        this.optInWorkflowImageURLs = optInWorkflowImageURLs;
        return this;
    }

    public VerificationRequestStatus addoptInWorkflowImageURLsItem(
        Url optInWorkflowImageURLsItem
    ) {
        this.optInWorkflowImageURLs.add(optInWorkflowImageURLsItem);
        return this;
    }

    /**
     * Get optInWorkflowImageURLs
     * @return optInWorkflowImageURLs
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "[{\"url\":\"https://telnyx.com/sign-up\"},{\"url\":\"https://telnyx.com/company/data-privacy\"}]",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<Url> getOptInWorkflowImageURLs() {
        return optInWorkflowImageURLs;
    }

    @JsonProperty(JSON_PROPERTY_OPT_IN_WORKFLOW_IMAGE_U_R_LS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOptInWorkflowImageURLs(List<Url> optInWorkflowImageURLs) {
        this.optInWorkflowImageURLs = optInWorkflowImageURLs;
    }

    public VerificationRequestStatus additionalInformation(
        String additionalInformation
    ) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Get additionalInformation
     * @return additionalInformation
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "This is for security purposes, blah blah blah",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFORMATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public VerificationRequestStatus isvReseller(String isvReseller) {
        this.isvReseller = isvReseller;
        return this;
    }

    /**
     * Get isvReseller
     * @return isvReseller
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "Yes", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ISV_RESELLER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIsvReseller() {
        return isvReseller;
    }

    @JsonProperty(JSON_PROPERTY_ISV_RESELLER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIsvReseller(String isvReseller) {
        this.isvReseller = isvReseller;
    }

    public VerificationRequestStatus webhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * Get webhookUrl
     * @return webhookUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "http://example-webhook.com", value = "")
    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookUrl() {
        return webhookUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public VerificationRequestStatus id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "eaba9f52-164e-58e0-b002-4f668e18b7ed",
        required = true,
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(UUID id) {
        this.id = id;
    }

    public VerificationRequestStatus verificationStatus(
        TFVerificationStatus verificationStatus
    ) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * Get verificationStatus
     * @return verificationStatus
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TFVerificationStatus getVerificationStatus() {
        return verificationStatus;
    }

    @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVerificationStatus(TFVerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public VerificationRequestStatus reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     * @return reason
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Unfortunately, we have to cancel this request as we do not support non tollfree US numbers.",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getReason() {
        return reason;
    }

    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Return true if this VerificationRequestStatus object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerificationRequestStatus verificationRequestStatus =
            (VerificationRequestStatus) o;
        return (
            Objects.equals(
                this.businessName,
                verificationRequestStatus.businessName
            ) &&
            Objects.equals(
                this.corporateWebsite,
                verificationRequestStatus.corporateWebsite
            ) &&
            Objects.equals(
                this.businessAddr1,
                verificationRequestStatus.businessAddr1
            ) &&
            Objects.equals(
                this.businessAddr2,
                verificationRequestStatus.businessAddr2
            ) &&
            Objects.equals(
                this.businessCity,
                verificationRequestStatus.businessCity
            ) &&
            Objects.equals(
                this.businessState,
                verificationRequestStatus.businessState
            ) &&
            Objects.equals(
                this.businessZip,
                verificationRequestStatus.businessZip
            ) &&
            Objects.equals(
                this.businessContactFirstName,
                verificationRequestStatus.businessContactFirstName
            ) &&
            Objects.equals(
                this.businessContactLastName,
                verificationRequestStatus.businessContactLastName
            ) &&
            Objects.equals(
                this.businessContactEmail,
                verificationRequestStatus.businessContactEmail
            ) &&
            Objects.equals(
                this.businessContactPhone,
                verificationRequestStatus.businessContactPhone
            ) &&
            Objects.equals(
                this.messageVolume,
                verificationRequestStatus.messageVolume
            ) &&
            Objects.equals(
                this.phoneNumbers,
                verificationRequestStatus.phoneNumbers
            ) &&
            Objects.equals(this.useCase, verificationRequestStatus.useCase) &&
            Objects.equals(
                this.useCaseSummary,
                verificationRequestStatus.useCaseSummary
            ) &&
            Objects.equals(
                this.productionMessageContent,
                verificationRequestStatus.productionMessageContent
            ) &&
            Objects.equals(
                this.optInWorkflow,
                verificationRequestStatus.optInWorkflow
            ) &&
            Objects.equals(
                this.optInWorkflowImageURLs,
                verificationRequestStatus.optInWorkflowImageURLs
            ) &&
            Objects.equals(
                this.additionalInformation,
                verificationRequestStatus.additionalInformation
            ) &&
            Objects.equals(
                this.isvReseller,
                verificationRequestStatus.isvReseller
            ) &&
            Objects.equals(
                this.webhookUrl,
                verificationRequestStatus.webhookUrl
            ) &&
            Objects.equals(this.id, verificationRequestStatus.id) &&
            Objects.equals(
                this.verificationStatus,
                verificationRequestStatus.verificationStatus
            ) &&
            Objects.equals(this.reason, verificationRequestStatus.reason)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            businessName,
            corporateWebsite,
            businessAddr1,
            businessAddr2,
            businessCity,
            businessState,
            businessZip,
            businessContactFirstName,
            businessContactLastName,
            businessContactEmail,
            businessContactPhone,
            messageVolume,
            phoneNumbers,
            useCase,
            useCaseSummary,
            productionMessageContent,
            optInWorkflow,
            optInWorkflowImageURLs,
            additionalInformation,
            isvReseller,
            webhookUrl,
            id,
            verificationStatus,
            reason
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerificationRequestStatus {\n");
        sb
            .append("    businessName: ")
            .append(toIndentedString(businessName))
            .append("\n");
        sb
            .append("    corporateWebsite: ")
            .append(toIndentedString(corporateWebsite))
            .append("\n");
        sb
            .append("    businessAddr1: ")
            .append(toIndentedString(businessAddr1))
            .append("\n");
        sb
            .append("    businessAddr2: ")
            .append(toIndentedString(businessAddr2))
            .append("\n");
        sb
            .append("    businessCity: ")
            .append(toIndentedString(businessCity))
            .append("\n");
        sb
            .append("    businessState: ")
            .append(toIndentedString(businessState))
            .append("\n");
        sb
            .append("    businessZip: ")
            .append(toIndentedString(businessZip))
            .append("\n");
        sb
            .append("    businessContactFirstName: ")
            .append(toIndentedString(businessContactFirstName))
            .append("\n");
        sb
            .append("    businessContactLastName: ")
            .append(toIndentedString(businessContactLastName))
            .append("\n");
        sb
            .append("    businessContactEmail: ")
            .append(toIndentedString(businessContactEmail))
            .append("\n");
        sb
            .append("    businessContactPhone: ")
            .append(toIndentedString(businessContactPhone))
            .append("\n");
        sb
            .append("    messageVolume: ")
            .append(toIndentedString(messageVolume))
            .append("\n");
        sb
            .append("    phoneNumbers: ")
            .append(toIndentedString(phoneNumbers))
            .append("\n");
        sb
            .append("    useCase: ")
            .append(toIndentedString(useCase))
            .append("\n");
        sb
            .append("    useCaseSummary: ")
            .append(toIndentedString(useCaseSummary))
            .append("\n");
        sb
            .append("    productionMessageContent: ")
            .append(toIndentedString(productionMessageContent))
            .append("\n");
        sb
            .append("    optInWorkflow: ")
            .append(toIndentedString(optInWorkflow))
            .append("\n");
        sb
            .append("    optInWorkflowImageURLs: ")
            .append(toIndentedString(optInWorkflowImageURLs))
            .append("\n");
        sb
            .append("    additionalInformation: ")
            .append(toIndentedString(additionalInformation))
            .append("\n");
        sb
            .append("    isvReseller: ")
            .append(toIndentedString(isvReseller))
            .append("\n");
        sb
            .append("    webhookUrl: ")
            .append(toIndentedString(webhookUrl))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    verificationStatus: ")
            .append(toIndentedString(verificationStatus))
            .append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
