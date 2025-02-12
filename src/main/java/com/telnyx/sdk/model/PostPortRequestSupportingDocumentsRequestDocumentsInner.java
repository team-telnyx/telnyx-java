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
import java.util.UUID;

/**
 * PostPortRequestSupportingDocumentsRequestDocumentsInner
 */
@JsonPropertyOrder(
    {
        PostPortRequestSupportingDocumentsRequestDocumentsInner.JSON_PROPERTY_TYPE,
        PostPortRequestSupportingDocumentsRequestDocumentsInner.JSON_PROPERTY_DOCUMENT_ID,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PostPortRequestSupportingDocumentsRequestDocumentsInner {

    /**
     * Identifies the type of the document
     */
    public enum TypeEnum {
        LOA(String.valueOf("loa")),

        INVOICE(String.valueOf("invoice"));

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_DOCUMENT_ID = "document_id";
    private UUID documentId;

    public PostPortRequestSupportingDocumentsRequestDocumentsInner() {}

    public PostPortRequestSupportingDocumentsRequestDocumentsInner type(
        TypeEnum type
    ) {
        this.type = type;
        return this;
    }

    /**
     * Identifies the type of the document
     * @return type
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "loa",
        required = true,
        value = "Identifies the type of the document"
    )
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PostPortRequestSupportingDocumentsRequestDocumentsInner documentId(
        UUID documentId
    ) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Identifies the associated document
     * @return documentId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0",
        required = true,
        value = "Identifies the associated document"
    )
    @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getDocumentId() {
        return documentId;
    }

    @JsonProperty(JSON_PROPERTY_DOCUMENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDocumentId(UUID documentId) {
        this.documentId = documentId;
    }

    /**
     * Return true if this PostPortRequestSupportingDocuments_request_documents_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPortRequestSupportingDocumentsRequestDocumentsInner postPortRequestSupportingDocumentsRequestDocumentsInner =
            (PostPortRequestSupportingDocumentsRequestDocumentsInner) o;
        return (
            Objects.equals(
                this.type,
                postPortRequestSupportingDocumentsRequestDocumentsInner.type
            ) &&
            Objects.equals(
                this.documentId,
                postPortRequestSupportingDocumentsRequestDocumentsInner.documentId
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, documentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class PostPortRequestSupportingDocumentsRequestDocumentsInner {\n"
        );
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
