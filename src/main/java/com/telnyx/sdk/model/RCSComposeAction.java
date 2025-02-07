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
import com.telnyx.sdk.model.RCSComposeRecordingMessage;
import com.telnyx.sdk.model.RCSComposeTextMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Compose and send a message to a destination predefined by chatbot.
 */
@ApiModel(
    description = "Compose and send a message to a destination predefined by chatbot."
)
@JsonPropertyOrder(
    {
        RCSComposeAction.JSON_PROPERTY_COMPOSE_TEXT_MESSAGE,
        RCSComposeAction.JSON_PROPERTY_COMPOSE_RECORDING_MESSAGE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RCSComposeAction {

    public static final String JSON_PROPERTY_COMPOSE_TEXT_MESSAGE =
        "compose_text_message";
    private RCSComposeTextMessage composeTextMessage;

    public static final String JSON_PROPERTY_COMPOSE_RECORDING_MESSAGE =
        "compose_recording_message";
    private RCSComposeRecordingMessage composeRecordingMessage;

    public RCSComposeAction() {}

    public RCSComposeAction composeTextMessage(
        RCSComposeTextMessage composeTextMessage
    ) {
        this.composeTextMessage = composeTextMessage;
        return this;
    }

    /**
     * Get composeTextMessage
     * @return composeTextMessage
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPOSE_TEXT_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RCSComposeTextMessage getComposeTextMessage() {
        return composeTextMessage;
    }

    @JsonProperty(JSON_PROPERTY_COMPOSE_TEXT_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComposeTextMessage(
        RCSComposeTextMessage composeTextMessage
    ) {
        this.composeTextMessage = composeTextMessage;
    }

    public RCSComposeAction composeRecordingMessage(
        RCSComposeRecordingMessage composeRecordingMessage
    ) {
        this.composeRecordingMessage = composeRecordingMessage;
        return this;
    }

    /**
     * Get composeRecordingMessage
     * @return composeRecordingMessage
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPOSE_RECORDING_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RCSComposeRecordingMessage getComposeRecordingMessage() {
        return composeRecordingMessage;
    }

    @JsonProperty(JSON_PROPERTY_COMPOSE_RECORDING_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComposeRecordingMessage(
        RCSComposeRecordingMessage composeRecordingMessage
    ) {
        this.composeRecordingMessage = composeRecordingMessage;
    }

    /**
     * Return true if this RCSComposeAction object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RCSComposeAction rcSComposeAction = (RCSComposeAction) o;
        return (
            Objects.equals(
                this.composeTextMessage,
                rcSComposeAction.composeTextMessage
            ) &&
            Objects.equals(
                this.composeRecordingMessage,
                rcSComposeAction.composeRecordingMessage
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(composeTextMessage, composeRecordingMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RCSComposeAction {\n");
        sb
            .append("    composeTextMessage: ")
            .append(toIndentedString(composeTextMessage))
            .append("\n");
        sb
            .append("    composeRecordingMessage: ")
            .append(toIndentedString(composeRecordingMessage))
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
