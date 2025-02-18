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

/**
 * DocServiceDocumentUploadInline
 */
@JsonPropertyOrder(
    {
        DocServiceDocumentUploadInline.JSON_PROPERTY_FILE,
        DocServiceDocumentUploadInline.JSON_PROPERTY_FILENAME,
        DocServiceDocumentUploadInline.JSON_PROPERTY_CUSTOMER_REFERENCE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class DocServiceDocumentUploadInline {

    public static final String JSON_PROPERTY_FILE = "file";
    private byte[] _file;

    public static final String JSON_PROPERTY_FILENAME = "filename";
    private String filename;

    public static final String JSON_PROPERTY_CUSTOMER_REFERENCE =
        "customer_reference";
    private String customerReference;

    public DocServiceDocumentUploadInline() {}

    public DocServiceDocumentUploadInline _file(byte[] _file) {
        this._file = _file;
        return this;
    }

    /**
     * The Base64 encoded contents of the file you are uploading.
     * @return _file
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "[B@6b3871d6",
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

    public DocServiceDocumentUploadInline filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * The filename of the document.
     * @return filename
     **/
    @jakarta.annotation.Nullable
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

    public DocServiceDocumentUploadInline customerReference(
        String customerReference
    ) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * A customer reference string for customer look ups.
     * @return customerReference
     **/
    @jakarta.annotation.Nullable
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
     * Return true if this DocServiceDocumentUploadInline object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocServiceDocumentUploadInline docServiceDocumentUploadInline =
            (DocServiceDocumentUploadInline) o;
        return (
            Arrays.equals(this._file, docServiceDocumentUploadInline._file) &&
            Objects.equals(
                this.filename,
                docServiceDocumentUploadInline.filename
            ) &&
            Objects.equals(
                this.customerReference,
                docServiceDocumentUploadInline.customerReference
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
        sb.append("class DocServiceDocumentUploadInline {\n");
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
