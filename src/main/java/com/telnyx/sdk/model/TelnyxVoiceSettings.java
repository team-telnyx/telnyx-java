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
 * TelnyxVoiceSettings
 */
@JsonPropertyOrder({ TelnyxVoiceSettings.JSON_PROPERTY_VOICE_SPEED })
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class TelnyxVoiceSettings {

    public static final String JSON_PROPERTY_VOICE_SPEED = "voice_speed";
    private Float voiceSpeed = 1f;

    public TelnyxVoiceSettings() {}

    public TelnyxVoiceSettings voiceSpeed(Float voiceSpeed) {
        this.voiceSpeed = voiceSpeed;
        return this;
    }

    /**
     * The voice speed to be used for the voice. The voice speed must be between 0.1 and 2.0. Default value is 1.0.
     * minimum: 0.1
     * maximum: 2
     * @return voiceSpeed
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "1",
        value = "The voice speed to be used for the voice. The voice speed must be between 0.1 and 2.0. Default value is 1.0."
    )
    @JsonProperty(JSON_PROPERTY_VOICE_SPEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Float getVoiceSpeed() {
        return voiceSpeed;
    }

    @JsonProperty(JSON_PROPERTY_VOICE_SPEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVoiceSpeed(Float voiceSpeed) {
        this.voiceSpeed = voiceSpeed;
    }

    /**
     * Return true if this TelnyxVoiceSettings object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TelnyxVoiceSettings telnyxVoiceSettings = (TelnyxVoiceSettings) o;
        return Objects.equals(this.voiceSpeed, telnyxVoiceSettings.voiceSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TelnyxVoiceSettings {\n");
        sb
            .append("    voiceSpeed: ")
            .append(toIndentedString(voiceSpeed))
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
