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
 * Streaming parameters as they were originally given to the Call Control API.
 */
@ApiModel(
    description = "Streaming parameters as they were originally given to the Call Control API."
)
@JsonPropertyOrder(
    {
        CallStreamingFailedPayloadStreamParams.JSON_PROPERTY_STREAM_URL,
        CallStreamingFailedPayloadStreamParams.JSON_PROPERTY_TRACK,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallStreamingFailedPayloadStreamParams {

    public static final String JSON_PROPERTY_STREAM_URL = "stream_url";
    private String streamUrl;

    /**
     * Specifies which track should be streamed.
     */
    public enum TrackEnum {
        INBOUND_TRACK(String.valueOf("inbound_track")),

        OUTBOUND_TRACK(String.valueOf("outbound_track")),

        BOTH_TRACKS(String.valueOf("both_tracks"));

        private String value;

        TrackEnum(String value) {
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
        public static TrackEnum fromValue(String value) {
            for (TrackEnum b : TrackEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_TRACK = "track";
    private TrackEnum track = TrackEnum.INBOUND_TRACK;

    public CallStreamingFailedPayloadStreamParams() {}

    public CallStreamingFailedPayloadStreamParams streamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
        return this;
    }

    /**
     * The destination WebSocket address where the stream is going to be delivered.
     * @return streamUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "wss://www.example.com/websocket",
        value = "The destination WebSocket address where the stream is going to be delivered."
    )
    @JsonProperty(JSON_PROPERTY_STREAM_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStreamUrl() {
        return streamUrl;
    }

    @JsonProperty(JSON_PROPERTY_STREAM_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    public CallStreamingFailedPayloadStreamParams track(TrackEnum track) {
        this.track = track;
        return this;
    }

    /**
     * Specifies which track should be streamed.
     * @return track
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "inbound_track",
        value = "Specifies which track should be streamed."
    )
    @JsonProperty(JSON_PROPERTY_TRACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TrackEnum getTrack() {
        return track;
    }

    @JsonProperty(JSON_PROPERTY_TRACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTrack(TrackEnum track) {
        this.track = track;
    }

    /**
     * Return true if this CallStreamingFailed_payload_stream_params object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallStreamingFailedPayloadStreamParams callStreamingFailedPayloadStreamParams =
            (CallStreamingFailedPayloadStreamParams) o;
        return (
            Objects.equals(
                this.streamUrl,
                callStreamingFailedPayloadStreamParams.streamUrl
            ) &&
            Objects.equals(
                this.track,
                callStreamingFailedPayloadStreamParams.track
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamUrl, track);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallStreamingFailedPayloadStreamParams {\n");
        sb
            .append("    streamUrl: ")
            .append(toIndentedString(streamUrl))
            .append("\n");
        sb.append("    track: ").append(toIndentedString(track)).append("\n");
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
