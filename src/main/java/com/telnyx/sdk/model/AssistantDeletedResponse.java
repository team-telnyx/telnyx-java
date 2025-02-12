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
 * Aligns with the OpenAI API: https://platform.openai.com/docs/api-reference/assistants/deleteAssistant
 */
@ApiModel(
    description = "Aligns with the OpenAI API: https://platform.openai.com/docs/api-reference/assistants/deleteAssistant"
)
@JsonPropertyOrder(
    {
        AssistantDeletedResponse.JSON_PROPERTY_ID,
        AssistantDeletedResponse.JSON_PROPERTY_OBJECT,
        AssistantDeletedResponse.JSON_PROPERTY_DELETED,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AssistantDeletedResponse {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_OBJECT = "object";
    private String _object;

    public static final String JSON_PROPERTY_DELETED = "deleted";
    private Boolean deleted;

    public AssistantDeletedResponse() {}

    public AssistantDeletedResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public AssistantDeletedResponse _object(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * Get _object
     * @return _object
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getObject() {
        return _object;
    }

    @JsonProperty(JSON_PROPERTY_OBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setObject(String _object) {
        this._object = _object;
    }

    public AssistantDeletedResponse deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty(JSON_PROPERTY_DELETED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Return true if this AssistantDeletedResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssistantDeletedResponse assistantDeletedResponse =
            (AssistantDeletedResponse) o;
        return (
            Objects.equals(this.id, assistantDeletedResponse.id) &&
            Objects.equals(this._object, assistantDeletedResponse._object) &&
            Objects.equals(this.deleted, assistantDeletedResponse.deleted)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, _object, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantDeletedResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    _object: ")
            .append(toIndentedString(_object))
            .append("\n");
        sb
            .append("    deleted: ")
            .append(toIndentedString(deleted))
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
