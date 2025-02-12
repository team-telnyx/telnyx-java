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
import com.telnyx.sdk.model.AudioTranscriptionResponseSegments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * AudioTranscriptionResponse
 */
@JsonPropertyOrder(
    {
        AudioTranscriptionResponse.JSON_PROPERTY_TEXT,
        AudioTranscriptionResponse.JSON_PROPERTY_DURATION,
        AudioTranscriptionResponse.JSON_PROPERTY_SEGMENTS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AudioTranscriptionResponse {

    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public static final String JSON_PROPERTY_DURATION = "duration";
    private BigDecimal duration;

    public static final String JSON_PROPERTY_SEGMENTS = "segments";
    private List<AudioTranscriptionResponseSegments> segments = null;

    public AudioTranscriptionResponse() {}

    public AudioTranscriptionResponse text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The transcribed text for the audio file.
     * @return text
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The transcribed text for the audio file."
    )
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setText(String text) {
        this.text = text;
    }

    public AudioTranscriptionResponse duration(BigDecimal duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The duration of the audio file in seconds. This is only included if &#x60;response_format&#x60; is set to &#x60;verbose_json&#x60;.
     * @return duration
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "The duration of the audio file in seconds. This is only included if `response_format` is set to `verbose_json`."
    )
    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getDuration() {
        return duration;
    }

    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public AudioTranscriptionResponse segments(
        List<AudioTranscriptionResponseSegments> segments
    ) {
        this.segments = segments;
        return this;
    }

    public AudioTranscriptionResponse addsegmentsItem(
        AudioTranscriptionResponseSegments segmentsItem
    ) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    /**
     * Segments of the transcribed text and their corresponding details. This is only included if &#x60;response_format&#x60; is set to &#x60;verbose_json&#x60;.
     * @return segments
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Segments of the transcribed text and their corresponding details. This is only included if `response_format` is set to `verbose_json`."
    )
    @JsonProperty(JSON_PROPERTY_SEGMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<AudioTranscriptionResponseSegments> getSegments() {
        return segments;
    }

    @JsonProperty(JSON_PROPERTY_SEGMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSegments(List<AudioTranscriptionResponseSegments> segments) {
        this.segments = segments;
    }

    /**
     * Return true if this AudioTranscriptionResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioTranscriptionResponse audioTranscriptionResponse =
            (AudioTranscriptionResponse) o;
        return (
            Objects.equals(this.text, audioTranscriptionResponse.text) &&
            Objects.equals(
                this.duration,
                audioTranscriptionResponse.duration
            ) &&
            Objects.equals(this.segments, audioTranscriptionResponse.segments)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, duration, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioTranscriptionResponse {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb
            .append("    duration: ")
            .append(toIndentedString(duration))
            .append("\n");
        sb
            .append("    segments: ")
            .append(toIndentedString(segments))
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
