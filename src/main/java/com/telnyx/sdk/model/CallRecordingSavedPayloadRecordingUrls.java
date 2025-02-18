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
import com.fasterxml.jackson.annotation.JsonIgnore;
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
import java.util.NoSuchElementException;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Recording URLs in requested format. These URLs are valid for 10 minutes. After 10 minutes, you may retrieve recordings via API using Reports -&gt; Call Recordings documentation, or via Mission Control under Reporting -&gt; Recordings.
 */
@ApiModel(
    description = "Recording URLs in requested format. These URLs are valid for 10 minutes. After 10 minutes, you may retrieve recordings via API using Reports -> Call Recordings documentation, or via Mission Control under Reporting -> Recordings."
)
@JsonPropertyOrder(
    {
        CallRecordingSavedPayloadRecordingUrls.JSON_PROPERTY_MP3,
        CallRecordingSavedPayloadRecordingUrls.JSON_PROPERTY_WAV,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallRecordingSavedPayloadRecordingUrls {

    public static final String JSON_PROPERTY_MP3 = "mp3";
    private JsonNullable<String> mp3 = JsonNullable.<String>undefined();

    public static final String JSON_PROPERTY_WAV = "wav";
    private JsonNullable<String> wav = JsonNullable.<String>undefined();

    public CallRecordingSavedPayloadRecordingUrls() {}

    public CallRecordingSavedPayloadRecordingUrls mp3(String mp3) {
        this.mp3 = JsonNullable.<String>of(mp3);
        return this;
    }

    /**
     * Recording URL in requested &#x60;mp3&#x60; format.
     * @return mp3
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "http://example.com/recording.mp3",
        value = "Recording URL in requested `mp3` format."
    )
    @JsonIgnore
    public String getMp3() {
        return mp3.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_MP3)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getMp3_JsonNullable() {
        return mp3;
    }

    @JsonProperty(JSON_PROPERTY_MP3)
    public void setMp3_JsonNullable(JsonNullable<String> mp3) {
        this.mp3 = mp3;
    }

    public void setMp3(String mp3) {
        this.mp3 = JsonNullable.<String>of(mp3);
    }

    public CallRecordingSavedPayloadRecordingUrls wav(String wav) {
        this.wav = JsonNullable.<String>of(wav);
        return this;
    }

    /**
     * Recording URL in requested &#x60;wav&#x60; format.
     * @return wav
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "http://example.com/recording.wav",
        value = "Recording URL in requested `wav` format."
    )
    @JsonIgnore
    public String getWav() {
        return wav.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_WAV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getWav_JsonNullable() {
        return wav;
    }

    @JsonProperty(JSON_PROPERTY_WAV)
    public void setWav_JsonNullable(JsonNullable<String> wav) {
        this.wav = wav;
    }

    public void setWav(String wav) {
        this.wav = JsonNullable.<String>of(wav);
    }

    /**
     * Return true if this CallRecordingSaved_payload_recording_urls object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRecordingSavedPayloadRecordingUrls callRecordingSavedPayloadRecordingUrls =
            (CallRecordingSavedPayloadRecordingUrls) o;
        return (
            equalsNullable(
                this.mp3,
                callRecordingSavedPayloadRecordingUrls.mp3
            ) &&
            equalsNullable(this.wav, callRecordingSavedPayloadRecordingUrls.wav)
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(mp3), hashCodeNullable(wav));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallRecordingSavedPayloadRecordingUrls {\n");
        sb.append("    mp3: ").append(toIndentedString(mp3)).append("\n");
        sb.append("    wav: ").append(toIndentedString(wav)).append("\n");
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
