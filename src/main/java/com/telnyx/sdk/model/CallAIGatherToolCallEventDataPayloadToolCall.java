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
import com.telnyx.sdk.model.CallAIGatherToolCallEventDataPayloadToolCallFunction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CallAIGatherToolCallEventDataPayloadToolCall
 */
@JsonPropertyOrder(
    {
        CallAIGatherToolCallEventDataPayloadToolCall.JSON_PROPERTY_ID,
        CallAIGatherToolCallEventDataPayloadToolCall.JSON_PROPERTY_TYPE,
        CallAIGatherToolCallEventDataPayloadToolCall.JSON_PROPERTY_FUNCTION,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallAIGatherToolCallEventDataPayloadToolCall {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        FUNCTION(String.valueOf("function"));

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

    public static final String JSON_PROPERTY_FUNCTION = "function";
    private CallAIGatherToolCallEventDataPayloadToolCallFunction function;

    public CallAIGatherToolCallEventDataPayloadToolCall() {}

    public CallAIGatherToolCallEventDataPayloadToolCall id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @jakarta.annotation.Nonnull
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

    public CallAIGatherToolCallEventDataPayloadToolCall type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
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

    public CallAIGatherToolCallEventDataPayloadToolCall function(
        CallAIGatherToolCallEventDataPayloadToolCallFunction function
    ) {
        this.function = function;
        return this;
    }

    /**
     * Get function
     * @return function
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CallAIGatherToolCallEventDataPayloadToolCallFunction getFunction() {
        return function;
    }

    @JsonProperty(JSON_PROPERTY_FUNCTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFunction(
        CallAIGatherToolCallEventDataPayloadToolCallFunction function
    ) {
        this.function = function;
    }

    /**
     * Return true if this CallAIGatherToolCallEvent_data_payload_tool_call object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallAIGatherToolCallEventDataPayloadToolCall callAIGatherToolCallEventDataPayloadToolCall =
            (CallAIGatherToolCallEventDataPayloadToolCall) o;
        return (
            Objects.equals(
                this.id,
                callAIGatherToolCallEventDataPayloadToolCall.id
            ) &&
            Objects.equals(
                this.type,
                callAIGatherToolCallEventDataPayloadToolCall.type
            ) &&
            Objects.equals(
                this.function,
                callAIGatherToolCallEventDataPayloadToolCall.function
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallAIGatherToolCallEventDataPayloadToolCall {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb
            .append("    function: ")
            .append(toIndentedString(function))
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
