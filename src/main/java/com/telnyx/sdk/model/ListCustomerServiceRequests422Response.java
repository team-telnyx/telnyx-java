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
import com.telnyx.sdk.model.UnprocessableEntityError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ListCustomerServiceRequests422Response
 */
@JsonPropertyOrder(
    { ListCustomerServiceRequests422Response.JSON_PROPERTY_ERRORS }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class ListCustomerServiceRequests422Response {

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<UnprocessableEntityError> errors = null;

    public ListCustomerServiceRequests422Response() {}

    public ListCustomerServiceRequests422Response errors(
        List<UnprocessableEntityError> errors
    ) {
        this.errors = errors;
        return this;
    }

    public ListCustomerServiceRequests422Response addErrorsItem(
        UnprocessableEntityError errorsItem
    ) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     * @return errors
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<UnprocessableEntityError> getErrors() {
        return errors;
    }

    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrors(List<UnprocessableEntityError> errors) {
        this.errors = errors;
    }

    /**
     * Return true if this listCustomerServiceRequests_422_response object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerServiceRequests422Response listCustomerServiceRequests422Response =
            (ListCustomerServiceRequests422Response) o;
        return Objects.equals(
            this.errors,
            listCustomerServiceRequests422Response.errors
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerServiceRequests422Response {\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
