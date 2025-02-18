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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UploadPortingOrderDocumentsRequestDocumentsInner
 */
@JsonPropertyOrder(
    {
        UploadPortingOrderDocumentsRequestDocumentsInner.JSON_PROPERTY_DOCUMENT_TYPE,
        UploadPortingOrderDocumentsRequestDocumentsInner.JSON_PROPERTY_DOCUMENT_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class UploadPortingOrderDocumentsRequestDocumentsInner {

    /**
     * The type of the document.
     */
    public enum DocumentTypeEnum {
        LOA("loa"),

        INVOICE("invoice"),

        OTHER("other");

        private String value;

        DocumentTypeEnum(String value) {
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
        public static DocumentTypeEnum fromValue(String value) {
            for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_DOCUMENT_TYPE = "document_type";
    private DocumentTypeEnum documentType;

    public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
    private String documentId;

    public UploadPortingOrderDocumentsRequestDocumentsInner() {}

    public UploadPortingOrderDocumentsRequestDocumentsInner documentType(
        DocumentTypeEnum documentType
    ) {
        this.documentType = documentType;
        return this;
    }

    /**
     * The type of the document.
     * @return documentType
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "loa",
        required = true,
        value = "The type of the document."
    )
    @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public DocumentTypeEnum getDocumentType() {
        return documentType;
    }

    @JsonProperty(JSON_PROPERTY_DOCUMENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDocumentType(DocumentTypeEnum documentType) {
        this.documentType = documentType;
    }

    public UploadPortingOrderDocumentsRequestDocumentsInner documentId(
        String documentId
    ) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Uniquely identifies a document uploaded via the &lt;code&gt;&lt;a href&#x3D;\&quot;https://developers.telnyx.com/docs/api/v2/documents/Documents#createDocument\&quot;&gt;/v2/documents&lt;/a&gt;&lt;/code&gt; endpoint.
     * @return documentId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "5f940c35-ef28-4408-bb95-af73b047d589",
        required = true,
        value = "Uniquely identifies a document uploaded via the <code><a href=\"https://developers.telnyx.com/docs/api/v2/documents/Documents#createDocument\">/v2/documents</a></code> endpoint."
    )
    @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDocumentId() {
        return documentId;
    }

    @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * Return true if this uploadPortingOrderDocuments_request_documents_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadPortingOrderDocumentsRequestDocumentsInner uploadPortingOrderDocumentsRequestDocumentsInner =
            (UploadPortingOrderDocumentsRequestDocumentsInner) o;
        return (
            Objects.equals(
                this.documentType,
                uploadPortingOrderDocumentsRequestDocumentsInner.documentType
            ) &&
            Objects.equals(
                this.documentId,
                uploadPortingOrderDocumentsRequestDocumentsInner.documentId
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentType, documentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadPortingOrderDocumentsRequestDocumentsInner {\n");
        sb
            .append("    documentType: ")
            .append(toIndentedString(documentType))
            .append("\n");
        sb
            .append("    documentId: ")
            .append(toIndentedString(documentId))
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
