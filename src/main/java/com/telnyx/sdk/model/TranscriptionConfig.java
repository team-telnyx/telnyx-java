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
 * The settings associated with speech to text for the voice assistant. This is only relevant if the assistant uses a text-to-text language model. Any assistant using a model with native audio support (e.g. &#x60;fixie-ai/ultravox-v0_4&#x60;) will ignore this field.
 */
@ApiModel(
    description = "The settings associated with speech to text for the voice assistant. This is only relevant if the assistant uses a text-to-text language model. Any assistant using a model with native audio support (e.g. `fixie-ai/ultravox-v0_4`) will ignore this field."
)
@JsonPropertyOrder({ TranscriptionConfig.JSON_PROPERTY_MODEL })
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class TranscriptionConfig {

    public static final String JSON_PROPERTY_MODEL = "model";
    private String model = "distil-whisper/distil-large-v2";

    public TranscriptionConfig() {}

    public TranscriptionConfig model(String model) {
        this.model = model;
        return this;
    }

    /**
     * The speech to text model to be used by the voice assistant. &#x60;distil-whisper/distil-large-v2&#x60; is lower latency but English-only. &#x60;openai/whisper-large-v3-turbo&#x60; is multi-lingual but slightly higher latency.
     * @return model
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "distil-whisper/distil-large-v2",
        value = "The speech to text model to be used by the voice assistant. `distil-whisper/distil-large-v2` is lower latency but English-only. `openai/whisper-large-v3-turbo` is multi-lingual but slightly higher latency."
    )
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Return true if this TranscriptionConfig object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscriptionConfig transcriptionConfig = (TranscriptionConfig) o;
        return Objects.equals(this.model, transcriptionConfig.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscriptionConfig {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
