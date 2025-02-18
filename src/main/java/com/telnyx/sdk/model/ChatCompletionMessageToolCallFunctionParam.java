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
 * ChatCompletionMessageToolCallFunctionParam
 */
@JsonPropertyOrder(
    {
        ChatCompletionMessageToolCallFunctionParam.JSON_PROPERTY_ARGUMENTS,
        ChatCompletionMessageToolCallFunctionParam.JSON_PROPERTY_NAME,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class ChatCompletionMessageToolCallFunctionParam {

    public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
    private String arguments;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public ChatCompletionMessageToolCallFunctionParam() {}

    public ChatCompletionMessageToolCallFunctionParam arguments(
        String arguments
    ) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get arguments
     * @return arguments
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ARGUMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getArguments() {
        return arguments;
    }

    @JsonProperty(JSON_PROPERTY_ARGUMENTS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public ChatCompletionMessageToolCallFunctionParam name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return true if this ChatCompletionMessageToolCallFunctionParam object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionMessageToolCallFunctionParam chatCompletionMessageToolCallFunctionParam =
            (ChatCompletionMessageToolCallFunctionParam) o;
        return (
            Objects.equals(
                this.arguments,
                chatCompletionMessageToolCallFunctionParam.arguments
            ) &&
            Objects.equals(
                this.name,
                chatCompletionMessageToolCallFunctionParam.name
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(arguments, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionMessageToolCallFunctionParam {\n");
        sb
            .append("    arguments: ")
            .append(toIndentedString(arguments))
            .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
