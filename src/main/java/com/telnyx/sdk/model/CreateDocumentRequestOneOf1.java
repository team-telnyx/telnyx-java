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
 * CreateDocumentRequestOneOf1
 */
@JsonPropertyOrder(
    {
        CreateDocumentRequestOneOf1.JSON_PROPERTY_FILE,
        CreateDocumentRequestOneOf1.JSON_PROPERTY_FILENAME,
        CreateDocumentRequestOneOf1.JSON_PROPERTY_CUSTOMER_REFERENCE,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateDocumentRequestOneOf1 {

    public static final String JSON_PROPERTY_FILE = "file";
    private byte[] _file;

    public static final String JSON_PROPERTY_FILENAME = "filename";
    private String filename;

    public static final String JSON_PROPERTY_CUSTOMER_REFERENCE =
        "customer_reference";
    private String customerReference;

    public CreateDocumentRequestOneOf1() {}

    public CreateDocumentRequestOneOf1 _file(byte[] _file) {
        this._file = _file;
        return this;
    }

    /**
     * The Base64 encoded contents of the file you are uploading.
     * @return _file
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "[B@5f303ecd",
        required = true,
        value = "The Base64 encoded contents of the file you are uploading."
    )
    @JsonProperty(JSON_PROPERTY_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public byte[] getFile() {
        return _file;
    }

    @JsonProperty(JSON_PROPERTY_FILE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFile(byte[] _file) {
        this._file = _file;
    }

    public CreateDocumentRequestOneOf1 filename(String filename) {
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

    public CreateDocumentRequestOneOf1 customerReference(
        String customerReference
    ) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * A customer reference string for customer look ups.
     * @return customerReference
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "MY REF 001",
        value = "A customer reference string for customer look ups."
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
     * Return true if this CreateDocument_request_oneOf_1 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDocumentRequestOneOf1 createDocumentRequestOneOf1 =
            (CreateDocumentRequestOneOf1) o;
        return (
            Arrays.equals(this._file, createDocumentRequestOneOf1._file) &&
            Objects.equals(
                this.filename,
                createDocumentRequestOneOf1.filename
            ) &&
            Objects.equals(
                this.customerReference,
                createDocumentRequestOneOf1.customerReference
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            Arrays.hashCode(_file),
            filename,
            customerReference
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocumentRequestOneOf1 {\n");
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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
