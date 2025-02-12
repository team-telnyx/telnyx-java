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
 * CreateDocumentRequestOneOf
 */
@JsonPropertyOrder(
    {
        CreateDocumentRequestOneOf.JSON_PROPERTY_URL,
        CreateDocumentRequestOneOf.JSON_PROPERTY_FILENAME,
        CreateDocumentRequestOneOf.JSON_PROPERTY_CUSTOMER_REFERENCE,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateDocumentRequestOneOf {

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_FILENAME = "filename";
    private String filename;

    public static final String JSON_PROPERTY_CUSTOMER_REFERENCE =
        "customer_reference";
    private String customerReference;

    public CreateDocumentRequestOneOf() {}

    public CreateDocumentRequestOneOf url(String url) {
        this.url = url;
        return this;
    }

    /**
     * If the file is already hosted publicly, you can provide a URL and have the documents service fetch it for you.
     * @return url
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf",
        required = true,
        value = "If the file is already hosted publicly, you can provide a URL and have the documents service fetch it for you."
    )
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(String url) {
        this.url = url;
    }

    public CreateDocumentRequestOneOf filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * The filename of the document.
     * @return filename
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "test-document.pdf",
        value = "The filename of the document."
    )
    @JsonProperty(JSON_PROPERTY_FILENAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFilename() {
        return filename;
    }

    @JsonProperty(JSON_PROPERTY_FILENAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public CreateDocumentRequestOneOf customerReference(
        String customerReference
    ) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * Optional reference string for customer tracking.
     * @return customerReference
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "MY REF 001",
        value = "Optional reference string for customer tracking."
    )
    @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomerReference() {
        return customerReference;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    /**
     * Return true if this CreateDocument_request_oneOf object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDocumentRequestOneOf createDocumentRequestOneOf =
            (CreateDocumentRequestOneOf) o;
        return (
            Objects.equals(this.url, createDocumentRequestOneOf.url) &&
            Objects.equals(
                this.filename,
                createDocumentRequestOneOf.filename
            ) &&
            Objects.equals(
                this.customerReference,
                createDocumentRequestOneOf.customerReference
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, filename, customerReference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocumentRequestOneOf {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb
            .append("    filename: ")
            .append(toIndentedString(filename))
            .append("\n");
        sb
            .append("    customerReference: ")
            .append(toIndentedString(customerReference))
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
