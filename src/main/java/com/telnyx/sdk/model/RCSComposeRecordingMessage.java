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
 * Initiate the recording and sending of an audio or video message.
 */
@ApiModel(
    description = "Initiate the recording and sending of an audio or video message."
)
@JsonPropertyOrder(
    {
        RCSComposeRecordingMessage.JSON_PROPERTY_PHONE_NUMBER,
        RCSComposeRecordingMessage.JSON_PROPERTY_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RCSComposeRecordingMessage {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    /**
     * The type of the recording action.
     */
    public enum TypeEnum {
        COMPOSE_RECORDING_ACTION_TYPE_UNSPECIFIED(
            String.valueOf("COMPOSE_RECORDING_ACTION_TYPE_UNSPECIFIED")
        ),

        ACTION_TYPE_AUDIO(String.valueOf("ACTION_TYPE_AUDIO")),

        ACTION_TYPE_VIDEO(String.valueOf("ACTION_TYPE_VIDEO"));

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

    public RCSComposeRecordingMessage() {}

    public RCSComposeRecordingMessage phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * phone number in +E.164 format
     * @return phoneNumber
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "+13125551234",
        required = true,
        value = "phone number in +E.164 format"
    )
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RCSComposeRecordingMessage type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the recording action.
     * @return type
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The type of the recording action."
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

    /**
     * Return true if this RCSComposeRecordingMessage object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RCSComposeRecordingMessage rcSComposeRecordingMessage =
            (RCSComposeRecordingMessage) o;
        return (
            Objects.equals(
                this.phoneNumber,
                rcSComposeRecordingMessage.phoneNumber
            ) &&
            Objects.equals(this.type, rcSComposeRecordingMessage.type)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RCSComposeRecordingMessage {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
