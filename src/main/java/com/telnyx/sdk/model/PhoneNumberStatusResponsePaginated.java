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
import com.telnyx.sdk.model.ProfileAssignmentPhoneNumbers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PhoneNumberStatusResponsePaginated
 */
@JsonPropertyOrder({ PhoneNumberStatusResponsePaginated.JSON_PROPERTY_RECORDS })
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PhoneNumberStatusResponsePaginated {

    public static final String JSON_PROPERTY_RECORDS = "records";
    private List<ProfileAssignmentPhoneNumbers> records = new ArrayList<>();

    public PhoneNumberStatusResponsePaginated() {}

    public PhoneNumberStatusResponsePaginated records(
        List<ProfileAssignmentPhoneNumbers> records
    ) {
        this.records = records;
        return this;
    }

    public PhoneNumberStatusResponsePaginated addrecordsItem(
        ProfileAssignmentPhoneNumbers recordsItem
    ) {
        this.records.add(recordsItem);
        return this;
    }

    /**
     * Get records
     * @return records
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_RECORDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ProfileAssignmentPhoneNumbers> getRecords() {
        return records;
    }

    @JsonProperty(JSON_PROPERTY_RECORDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRecords(List<ProfileAssignmentPhoneNumbers> records) {
        this.records = records;
    }

    /**
     * Return true if this PhoneNumberStatusResponsePaginated object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumberStatusResponsePaginated phoneNumberStatusResponsePaginated =
            (PhoneNumberStatusResponsePaginated) o;
        return Objects.equals(
            this.records,
            phoneNumberStatusResponsePaginated.records
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneNumberStatusResponsePaginated {\n");
        sb
            .append("    records: ")
            .append(toIndentedString(records))
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
