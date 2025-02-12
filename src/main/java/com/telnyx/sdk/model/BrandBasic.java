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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.model.BrandIdentityStatus;
import com.telnyx.sdk.model.EntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BrandBasic
 */
@JsonPropertyOrder(
    {
        BrandBasic.JSON_PROPERTY_BRAND_ID,
        BrandBasic.JSON_PROPERTY_TCR_BRAND_ID,
        BrandBasic.JSON_PROPERTY_ENTITY_TYPE,
        BrandBasic.JSON_PROPERTY_IDENTITY_STATUS,
        BrandBasic.JSON_PROPERTY_COMPANY_NAME,
        BrandBasic.JSON_PROPERTY_DISPLAY_NAME,
        BrandBasic.JSON_PROPERTY_EMAIL,
        BrandBasic.JSON_PROPERTY_WEBSITE,
        BrandBasic.JSON_PROPERTY_FAILURE_REASONS,
        BrandBasic.JSON_PROPERTY_STATUS,
        BrandBasic.JSON_PROPERTY_CREATED_AT,
        BrandBasic.JSON_PROPERTY_UPDATED_AT,
        BrandBasic.JSON_PROPERTY_ASSIGNED_CAMPAINGS_COUNT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BrandBasic {

    public static final String JSON_PROPERTY_BRAND_ID = "brandId";
    private String brandId;

    public static final String JSON_PROPERTY_TCR_BRAND_ID = "tcrBrandId";
    private String tcrBrandId;

    public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
    private EntityType entityType;

    public static final String JSON_PROPERTY_IDENTITY_STATUS = "identityStatus";
    private BrandIdentityStatus identityStatus;

    public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
    private String companyName;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_EMAIL = "email";
    private String email;

    public static final String JSON_PROPERTY_WEBSITE = "website";
    private String website;

    public static final String JSON_PROPERTY_FAILURE_REASONS = "failureReasons";
    private JsonNullable<Object> failureReasons = JsonNullable.<Object>of(null);

    /**
     * Status of the brand
     */
    public enum StatusEnum {
        OK(String.valueOf("OK")),

        REGISTRATION_PENDING(String.valueOf("REGISTRATION_PENDING")),

        REGISTRATION_FAILED(String.valueOf("REGISTRATION_FAILED"));

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
    private String updatedAt;

    public static final String JSON_PROPERTY_ASSIGNED_CAMPAINGS_COUNT =
        "assignedCampaingsCount";
    private Integer assignedCampaingsCount;

    public BrandBasic() {}

    public BrandBasic brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Unique identifier assigned to the brand.
     * @return brandId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "4b206179-f731-8ab7-f19c-34e19d22ide9",
        value = "Unique identifier assigned to the brand."
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

    public BrandBasic tcrBrandId(String tcrBrandId) {
        this.tcrBrandId = tcrBrandId;
        return this;
    }

    /**
     * Unique identifier assigned to the brand by the registry.
     * @return tcrBrandId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "BBRAND1",
        value = "Unique identifier assigned to the brand by the registry."
    )
    @JsonProperty(JSON_PROPERTY_TCR_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTcrBrandId() {
        return tcrBrandId;
    }

    @JsonProperty(JSON_PROPERTY_TCR_BRAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTcrBrandId(String tcrBrandId) {
        this.tcrBrandId = tcrBrandId;
    }

    public BrandBasic entityType(EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     * @return entityType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EntityType getEntityType() {
        return entityType;
    }

    @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public BrandBasic identityStatus(BrandIdentityStatus identityStatus) {
        this.identityStatus = identityStatus;
        return this;
    }

    /**
     * Get identityStatus
     * @return identityStatus
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IDENTITY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BrandIdentityStatus getIdentityStatus() {
        return identityStatus;
    }

    @JsonProperty(JSON_PROPERTY_IDENTITY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIdentityStatus(BrandIdentityStatus identityStatus) {
        this.identityStatus = identityStatus;
    }

    public BrandBasic companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * (Required for Non-profit/private/public) Legal company name.
     * @return companyName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "Example Company Inc.",
        value = "(Required for Non-profit/private/public) Legal company name."
    )
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

    public BrandBasic displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display or marketing name of the brand.
     * @return displayName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "Example Company",
        value = "Display or marketing name of the brand."
    )
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public BrandBasic email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Valid email address of brand support contact.
     * @return email
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "examplename@examplecompany.com",
        value = "Valid email address of brand support contact."
    )
    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEmail() {
        return email;
    }

    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmail(String email) {
        this.email = email;
    }

    public BrandBasic website(String website) {
        this.website = website;
        return this;
    }

    /**
     * Brand website URL.
     * @return website
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "www.examplecompany.com",
        value = "Brand website URL."
    )
    @JsonProperty(JSON_PROPERTY_WEBSITE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebsite() {
        return website;
    }

    @JsonProperty(JSON_PROPERTY_WEBSITE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebsite(String website) {
        this.website = website;
    }

    public BrandBasic failureReasons(Object failureReasons) {
        this.failureReasons = JsonNullable.<Object>of(failureReasons);
        return this;
    }

    /**
     * Failure reasons for brand
     * @return failureReasons
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Failure reasons for brand")
    @JsonIgnore
    public Object getFailureReasons() {
        return failureReasons.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_FAILURE_REASONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<Object> getFailureReasons_JsonNullable() {
        return failureReasons;
    }

    @JsonProperty(JSON_PROPERTY_FAILURE_REASONS)
    public void setFailureReasons_JsonNullable(
        JsonNullable<Object> failureReasons
    ) {
        this.failureReasons = failureReasons;
    }

    public void setFailureReasons(Object failureReasons) {
        this.failureReasons = JsonNullable.<Object>of(failureReasons);
    }

    public BrandBasic status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of the brand
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Status of the brand")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public BrandBasic createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Date and time that the brand was created at.
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-08T17:57:48.801186",
        value = "Date and time that the brand was created at."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BrandBasic updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Date and time that the brand was last updated at.
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-08T17:57:48.801186",
        value = "Date and time that the brand was last updated at."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BrandBasic assignedCampaingsCount(Integer assignedCampaingsCount) {
        this.assignedCampaingsCount = assignedCampaingsCount;
        return this;
    }

    /**
     * Number of campaigns associated with the brand
     * @return assignedCampaingsCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2",
        value = "Number of campaigns associated with the brand"
    )
    @JsonProperty(JSON_PROPERTY_ASSIGNED_CAMPAINGS_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getAssignedCampaingsCount() {
        return assignedCampaingsCount;
    }

    @JsonProperty(JSON_PROPERTY_ASSIGNED_CAMPAINGS_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAssignedCampaingsCount(Integer assignedCampaingsCount) {
        this.assignedCampaingsCount = assignedCampaingsCount;
    }

    /**
     * Return true if this BrandBasic object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandBasic brandBasic = (BrandBasic) o;
        return (
            Objects.equals(this.brandId, brandBasic.brandId) &&
            Objects.equals(this.tcrBrandId, brandBasic.tcrBrandId) &&
            Objects.equals(this.entityType, brandBasic.entityType) &&
            Objects.equals(this.identityStatus, brandBasic.identityStatus) &&
            Objects.equals(this.companyName, brandBasic.companyName) &&
            Objects.equals(this.displayName, brandBasic.displayName) &&
            Objects.equals(this.email, brandBasic.email) &&
            Objects.equals(this.website, brandBasic.website) &&
            equalsNullable(this.failureReasons, brandBasic.failureReasons) &&
            Objects.equals(this.status, brandBasic.status) &&
            Objects.equals(this.createdAt, brandBasic.createdAt) &&
            Objects.equals(this.updatedAt, brandBasic.updatedAt) &&
            Objects.equals(
                this.assignedCampaingsCount,
                brandBasic.assignedCampaingsCount
            )
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            brandId,
            tcrBrandId,
            entityType,
            identityStatus,
            companyName,
            displayName,
            email,
            website,
            hashCodeNullable(failureReasons),
            status,
            createdAt,
            updatedAt,
            assignedCampaingsCount
        );
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandBasic {\n");
        sb
            .append("    brandId: ")
            .append(toIndentedString(brandId))
            .append("\n");
        sb
            .append("    tcrBrandId: ")
            .append(toIndentedString(tcrBrandId))
            .append("\n");
        sb
            .append("    entityType: ")
            .append(toIndentedString(entityType))
            .append("\n");
        sb
            .append("    identityStatus: ")
            .append(toIndentedString(identityStatus))
            .append("\n");
        sb
            .append("    companyName: ")
            .append(toIndentedString(companyName))
            .append("\n");
        sb
            .append("    displayName: ")
            .append(toIndentedString(displayName))
            .append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb
            .append("    website: ")
            .append(toIndentedString(website))
            .append("\n");
        sb
            .append("    failureReasons: ")
            .append(toIndentedString(failureReasons))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
            .append("\n");
        sb
            .append("    assignedCampaingsCount: ")
            .append(toIndentedString(assignedCampaingsCount))
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
