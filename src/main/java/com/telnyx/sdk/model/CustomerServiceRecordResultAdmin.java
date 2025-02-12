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
 * The admin of the customer service record.
 */
@ApiModel(description = "The admin of the customer service record.")
@JsonPropertyOrder(
    {
        CustomerServiceRecordResultAdmin.JSON_PROPERTY_NAME,
        CustomerServiceRecordResultAdmin.JSON_PROPERTY_BILLING_PHONE_NUMBER,
        CustomerServiceRecordResultAdmin.JSON_PROPERTY_ACCOUNT_NUMBER,
        CustomerServiceRecordResultAdmin.JSON_PROPERTY_AUTHORIZED_PERSON_NAME,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CustomerServiceRecordResultAdmin {

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_BILLING_PHONE_NUMBER =
        "billing_phone_number";
    private String billingPhoneNumber;

    public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
    private String accountNumber;

    public static final String JSON_PROPERTY_AUTHORIZED_PERSON_NAME =
        "authorized_person_name";
    private String authorizedPersonName;

    public CustomerServiceRecordResultAdmin() {}

    public CustomerServiceRecordResultAdmin name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the customer service record.
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "John Doe",
        value = "The name of the customer service record."
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public CustomerServiceRecordResultAdmin billingPhoneNumber(
        String billingPhoneNumber
    ) {
        this.billingPhoneNumber = billingPhoneNumber;
        return this;
    }

    /**
     * The billing phone number of the customer service record.
     * @return billingPhoneNumber
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "+12065551212",
        value = "The billing phone number of the customer service record."
    )
    @JsonProperty(JSON_PROPERTY_BILLING_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBillingPhoneNumber() {
        return billingPhoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_BILLING_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBillingPhoneNumber(String billingPhoneNumber) {
        this.billingPhoneNumber = billingPhoneNumber;
    }

    public CustomerServiceRecordResultAdmin accountNumber(
        String accountNumber
    ) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * The account number of the customer service record.
     * @return accountNumber
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "1234567890",
        value = "The account number of the customer service record."
    )
    @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public CustomerServiceRecordResultAdmin authorizedPersonName(
        String authorizedPersonName
    ) {
        this.authorizedPersonName = authorizedPersonName;
        return this;
    }

    /**
     * The authorized person name of the customer service record.
     * @return authorizedPersonName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "John Doe",
        value = "The authorized person name of the customer service record."
    )
    @JsonProperty(JSON_PROPERTY_AUTHORIZED_PERSON_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAuthorizedPersonName() {
        return authorizedPersonName;
    }

    @JsonProperty(JSON_PROPERTY_AUTHORIZED_PERSON_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAuthorizedPersonName(String authorizedPersonName) {
        this.authorizedPersonName = authorizedPersonName;
    }

    /**
     * Return true if this CustomerServiceRecord_result_admin object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerServiceRecordResultAdmin customerServiceRecordResultAdmin =
            (CustomerServiceRecordResultAdmin) o;
        return (
            Objects.equals(this.name, customerServiceRecordResultAdmin.name) &&
            Objects.equals(
                this.billingPhoneNumber,
                customerServiceRecordResultAdmin.billingPhoneNumber
            ) &&
            Objects.equals(
                this.accountNumber,
                customerServiceRecordResultAdmin.accountNumber
            ) &&
            Objects.equals(
                this.authorizedPersonName,
                customerServiceRecordResultAdmin.authorizedPersonName
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            billingPhoneNumber,
            accountNumber,
            authorizedPersonName
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerServiceRecordResultAdmin {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    billingPhoneNumber: ")
            .append(toIndentedString(billingPhoneNumber))
            .append("\n");
        sb
            .append("    accountNumber: ")
            .append(toIndentedString(accountNumber))
            .append("\n");
        sb
            .append("    authorizedPersonName: ")
            .append(toIndentedString(authorizedPersonName))
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
