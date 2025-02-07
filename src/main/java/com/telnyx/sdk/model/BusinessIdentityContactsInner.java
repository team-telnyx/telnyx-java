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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * A contact person for the business
 */
@ApiModel(description = "A contact person for the business")
@JsonPropertyOrder(
    {
        BusinessIdentityContactsInner.JSON_PROPERTY_RECORD_TYPE,
        BusinessIdentityContactsInner.JSON_PROPERTY_ID,
        BusinessIdentityContactsInner.JSON_PROPERTY_EMAIL,
        BusinessIdentityContactsInner.JSON_PROPERTY_FIRST_NAME,
        BusinessIdentityContactsInner.JSON_PROPERTY_JOB_TITLE,
        BusinessIdentityContactsInner.JSON_PROPERTY_LAST_NAME,
        BusinessIdentityContactsInner.JSON_PROPERTY_PHONE_NUMBER,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class BusinessIdentityContactsInner {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_EMAIL = "email";
    private String email;

    public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
    private String firstName;

    public static final String JSON_PROPERTY_JOB_TITLE = "job_title";
    private String jobTitle;

    public static final String JSON_PROPERTY_LAST_NAME = "last_name";
    private String lastName;

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public BusinessIdentityContactsInner() {}

    @JsonCreator
    public BusinessIdentityContactsInner(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_ID) UUID id
    ) {
        this();
        this.recordType = recordType;
        this.id = id;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "contact", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * Get id
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "c6feda4e-6501-4db9-a21f-665e5b4ce2ba",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    public BusinessIdentityContactsInner email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "johnsmith@telnyx.com", value = "")
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

    public BusinessIdentityContactsInner firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get firstName
     * @return firstName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "John", value = "")
    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BusinessIdentityContactsInner jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get jobTitle
     * @return jobTitle
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "CEO", value = "")
    @JsonProperty(JSON_PROPERTY_JOB_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty(JSON_PROPERTY_JOB_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public BusinessIdentityContactsInner lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get lastName
     * @return lastName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "Smith", value = "")
    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLastName() {
        return lastName;
    }

    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BusinessIdentityContactsInner phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "+12345678900", value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Return true if this BusinessIdentity_contacts_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessIdentityContactsInner businessIdentityContactsInner =
            (BusinessIdentityContactsInner) o;
        return (
            Objects.equals(
                this.recordType,
                businessIdentityContactsInner.recordType
            ) &&
            Objects.equals(this.id, businessIdentityContactsInner.id) &&
            Objects.equals(this.email, businessIdentityContactsInner.email) &&
            Objects.equals(
                this.firstName,
                businessIdentityContactsInner.firstName
            ) &&
            Objects.equals(
                this.jobTitle,
                businessIdentityContactsInner.jobTitle
            ) &&
            Objects.equals(
                this.lastName,
                businessIdentityContactsInner.lastName
            ) &&
            Objects.equals(
                this.phoneNumber,
                businessIdentityContactsInner.phoneNumber
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            id,
            email,
            firstName,
            jobTitle,
            lastName,
            phoneNumber
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessIdentityContactsInner {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb
            .append("    firstName: ")
            .append(toIndentedString(firstName))
            .append("\n");
        sb
            .append("    jobTitle: ")
            .append(toIndentedString(jobTitle))
            .append("\n");
        sb
            .append("    lastName: ")
            .append(toIndentedString(lastName))
            .append("\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
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
