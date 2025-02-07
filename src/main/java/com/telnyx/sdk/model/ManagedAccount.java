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
import com.telnyx.sdk.model.ManagedAccountBalance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * ManagedAccount
 */
@JsonPropertyOrder(
    {
        ManagedAccount.JSON_PROPERTY_RECORD_TYPE,
        ManagedAccount.JSON_PROPERTY_ID,
        ManagedAccount.JSON_PROPERTY_EMAIL,
        ManagedAccount.JSON_PROPERTY_API_KEY,
        ManagedAccount.JSON_PROPERTY_API_USER,
        ManagedAccount.JSON_PROPERTY_API_TOKEN,
        ManagedAccount.JSON_PROPERTY_ORGANIZATION_NAME,
        ManagedAccount.JSON_PROPERTY_MANAGER_ACCOUNT_ID,
        ManagedAccount.JSON_PROPERTY_BALANCE,
        ManagedAccount.JSON_PROPERTY_CREATED_AT,
        ManagedAccount.JSON_PROPERTY_UPDATED_AT,
        ManagedAccount.JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING,
        ManagedAccount.JSON_PROPERTY_ROLLUP_BILLING,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ManagedAccount {

    /**
     * Identifies the type of the resource.
     */
    public enum RecordTypeEnum {
        MANAGED_ACCOUNT(String.valueOf("managed_account"));

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            for (RecordTypeEnum b : RecordTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private RecordTypeEnum recordType;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_EMAIL = "email";
    private String email;

    public static final String JSON_PROPERTY_API_KEY = "api_key";
    private String apiKey;

    public static final String JSON_PROPERTY_API_USER = "api_user";
    private String apiUser;

    public static final String JSON_PROPERTY_API_TOKEN = "api_token";
    private String apiToken;

    public static final String JSON_PROPERTY_ORGANIZATION_NAME =
        "organization_name";
    private String organizationName;

    public static final String JSON_PROPERTY_MANAGER_ACCOUNT_ID =
        "manager_account_id";
    private String managerAccountId;

    public static final String JSON_PROPERTY_BALANCE = "balance";
    private ManagedAccountBalance balance;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public static final String JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING =
        "managed_account_allow_custom_pricing";
    private Boolean managedAccountAllowCustomPricing;

    public static final String JSON_PROPERTY_ROLLUP_BILLING = "rollup_billing";
    private Boolean rollupBilling;

    public ManagedAccount() {}

    public ManagedAccount recordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "managed_account",
        required = true,
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    public ManagedAccount id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies the managed account.
     * @return id
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "f65ceda4-6522-4ad6-aede-98de83385123",
        required = true,
        value = "Uniquely identifies the managed account."
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

    public ManagedAccount email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The managed account&#39;s email.
     * @return email
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "user@example.com",
        required = true,
        value = "The managed account's email."
    )
    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getEmail() {
        return email;
    }

    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEmail(String email) {
        this.email = email;
    }

    public ManagedAccount apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The managed account&#39;s V2 API access key
     * @return apiKey
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "KEY01236170692E74656C6E79782E636F6D_YmlnIGlyb24gaXMgZGVhZA",
        required = true,
        value = "The managed account's V2 API access key"
    )
    @JsonProperty(JSON_PROPERTY_API_KEY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getApiKey() {
        return apiKey;
    }

    @JsonProperty(JSON_PROPERTY_API_KEY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public ManagedAccount apiUser(String apiUser) {
        this.apiUser = apiUser;
        return this;
    }

    /**
     * The manager account&#39;s email, which serves as the V1 API user identifier
     * @return apiUser
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "managed_account@example.com",
        required = true,
        value = "The manager account's email, which serves as the V1 API user identifier"
    )
    @JsonProperty(JSON_PROPERTY_API_USER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getApiUser() {
        return apiUser;
    }

    @JsonProperty(JSON_PROPERTY_API_USER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setApiUser(String apiUser) {
        this.apiUser = apiUser;
    }

    public ManagedAccount apiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    /**
     * The managed account&#39;s V1 API token
     * @return apiToken
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "x6oexQNHTs-fZ7-QsDMOeg",
        required = true,
        value = "The managed account's V1 API token"
    )
    @JsonProperty(JSON_PROPERTY_API_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getApiToken() {
        return apiToken;
    }

    @JsonProperty(JSON_PROPERTY_API_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public ManagedAccount organizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * The organization the managed account is associated with.
     * @return organizationName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Example Company LLC",
        value = "The organization the managed account is associated with."
    )
    @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOrganizationName() {
        return organizationName;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public ManagedAccount managerAccountId(String managerAccountId) {
        this.managerAccountId = managerAccountId;
        return this;
    }

    /**
     * The ID of the manager account associated with the managed account.
     * @return managerAccountId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "f65ceda4-6522-4ad6-aede-98de83385123",
        required = true,
        value = "The ID of the manager account associated with the managed account."
    )
    @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getManagerAccountId() {
        return managerAccountId;
    }

    @JsonProperty(JSON_PROPERTY_MANAGER_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setManagerAccountId(String managerAccountId) {
        this.managerAccountId = managerAccountId;
    }

    public ManagedAccount balance(ManagedAccountBalance balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Get balance
     * @return balance
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BALANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ManagedAccountBalance getBalance() {
        return balance;
    }

    @JsonProperty(JSON_PROPERTY_BALANCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBalance(ManagedAccountBalance balance) {
        this.balance = balance;
    }

    public ManagedAccount createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        required = true,
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ManagedAccount updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        required = true,
        value = "ISO 8601 formatted date indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ManagedAccount managedAccountAllowCustomPricing(
        Boolean managedAccountAllowCustomPricing
    ) {
        this.managedAccountAllowCustomPricing =
            managedAccountAllowCustomPricing;
        return this;
    }

    /**
     * Boolean value that indicates if the managed account is able to have custom pricing set for it or not. If false, uses the pricing of the manager account. Defaults to false. There may be time lag between when the value is changed and pricing changes take effect.
     * @return managedAccountAllowCustomPricing
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Boolean value that indicates if the managed account is able to have custom pricing set for it or not. If false, uses the pricing of the manager account. Defaults to false. There may be time lag between when the value is changed and pricing changes take effect."
    )
    @JsonProperty(JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getManagedAccountAllowCustomPricing() {
        return managedAccountAllowCustomPricing;
    }

    @JsonProperty(JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setManagedAccountAllowCustomPricing(
        Boolean managedAccountAllowCustomPricing
    ) {
        this.managedAccountAllowCustomPricing =
            managedAccountAllowCustomPricing;
    }

    public ManagedAccount rollupBilling(Boolean rollupBilling) {
        this.rollupBilling = rollupBilling;
        return this;
    }

    /**
     * Boolean value that indicates if the billing information and charges to the managed account \&quot;roll up\&quot; to the manager account. If true, the managed account will not have its own balance and will use the shared balance with the manager account. This value cannot be changed after account creation without going through Telnyx support as changes require manual updates to the account ledger. Defaults to false.
     * @return rollupBilling
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Boolean value that indicates if the billing information and charges to the managed account \"roll up\" to the manager account. If true, the managed account will not have its own balance and will use the shared balance with the manager account. This value cannot be changed after account creation without going through Telnyx support as changes require manual updates to the account ledger. Defaults to false."
    )
    @JsonProperty(JSON_PROPERTY_ROLLUP_BILLING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getRollupBilling() {
        return rollupBilling;
    }

    @JsonProperty(JSON_PROPERTY_ROLLUP_BILLING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRollupBilling(Boolean rollupBilling) {
        this.rollupBilling = rollupBilling;
    }

    /**
     * Return true if this ManagedAccount object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManagedAccount managedAccount = (ManagedAccount) o;
        return (
            Objects.equals(this.recordType, managedAccount.recordType) &&
            Objects.equals(this.id, managedAccount.id) &&
            Objects.equals(this.email, managedAccount.email) &&
            Objects.equals(this.apiKey, managedAccount.apiKey) &&
            Objects.equals(this.apiUser, managedAccount.apiUser) &&
            Objects.equals(this.apiToken, managedAccount.apiToken) &&
            Objects.equals(
                this.organizationName,
                managedAccount.organizationName
            ) &&
            Objects.equals(
                this.managerAccountId,
                managedAccount.managerAccountId
            ) &&
            Objects.equals(this.balance, managedAccount.balance) &&
            Objects.equals(this.createdAt, managedAccount.createdAt) &&
            Objects.equals(this.updatedAt, managedAccount.updatedAt) &&
            Objects.equals(
                this.managedAccountAllowCustomPricing,
                managedAccount.managedAccountAllowCustomPricing
            ) &&
            Objects.equals(this.rollupBilling, managedAccount.rollupBilling)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            id,
            email,
            apiKey,
            apiUser,
            apiToken,
            organizationName,
            managerAccountId,
            balance,
            createdAt,
            updatedAt,
            managedAccountAllowCustomPricing,
            rollupBilling
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagedAccount {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb
            .append("    apiUser: ")
            .append(toIndentedString(apiUser))
            .append("\n");
        sb
            .append("    apiToken: ")
            .append(toIndentedString(apiToken))
            .append("\n");
        sb
            .append("    organizationName: ")
            .append(toIndentedString(organizationName))
            .append("\n");
        sb
            .append("    managerAccountId: ")
            .append(toIndentedString(managerAccountId))
            .append("\n");
        sb
            .append("    balance: ")
            .append(toIndentedString(balance))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
            .append("\n");
        sb
            .append("    managedAccountAllowCustomPricing: ")
            .append(toIndentedString(managedAccountAllowCustomPricing))
            .append("\n");
        sb
            .append("    rollupBilling: ")
            .append(toIndentedString(rollupBilling))
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
