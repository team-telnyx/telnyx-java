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
import com.telnyx.sdk.model.PostPortRequestSupportingDocumentsRequestDocumentsInner;
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
 * PostPortRequestSupportingDocumentsRequest
 */
@JsonPropertyOrder(
    { PostPortRequestSupportingDocumentsRequest.JSON_PROPERTY_DOCUMENTS }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PostPortRequestSupportingDocumentsRequest {

    public static final String JSON_PROPERTY_DOCUMENTS = "documents";
    private List<
        PostPortRequestSupportingDocumentsRequestDocumentsInner
    > documents = null;

    public PostPortRequestSupportingDocumentsRequest() {}

    public PostPortRequestSupportingDocumentsRequest documents(
        List<PostPortRequestSupportingDocumentsRequestDocumentsInner> documents
    ) {
        this.documents = documents;
        return this;
    }

    public PostPortRequestSupportingDocumentsRequest adddocumentsItem(
        PostPortRequestSupportingDocumentsRequestDocumentsInner documentsItem
    ) {
        if (this.documents == null) {
            this.documents = new ArrayList<>();
        }
        this.documents.add(documentsItem);
        return this;
    }

    /**
     * List of supporting documents parameters
     * @return documents
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "List of supporting documents parameters")
    @JsonProperty(JSON_PROPERTY_DOCUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<
        PostPortRequestSupportingDocumentsRequestDocumentsInner
    > getDocuments() {
        return documents;
    }

    @JsonProperty(JSON_PROPERTY_DOCUMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDocuments(
        List<PostPortRequestSupportingDocumentsRequestDocumentsInner> documents
    ) {
        this.documents = documents;
    }

    /**
     * Return true if this PostPortRequestSupportingDocuments_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPortRequestSupportingDocumentsRequest postPortRequestSupportingDocumentsRequest =
            (PostPortRequestSupportingDocumentsRequest) o;
        return Objects.equals(
            this.documents,
            postPortRequestSupportingDocumentsRequest.documents
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(documents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPortRequestSupportingDocumentsRequest {\n");
        sb
            .append("    documents: ")
            .append(toIndentedString(documents))
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
