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
 * Use this field to modify sound effects, for example adjust the pitch.
 */
@ApiModel(
    description = "Use this field to modify sound effects, for example adjust the pitch."
)
@JsonPropertyOrder(
    {
        SoundModifications.JSON_PROPERTY_PITCH,
        SoundModifications.JSON_PROPERTY_SEMITONE,
        SoundModifications.JSON_PROPERTY_OCTAVES,
        SoundModifications.JSON_PROPERTY_TRACK,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SoundModifications {

    public static final String JSON_PROPERTY_PITCH = "pitch";
    private Double pitch;

    public static final String JSON_PROPERTY_SEMITONE = "semitone";
    private Double semitone;

    public static final String JSON_PROPERTY_OCTAVES = "octaves";
    private Double octaves;

    public static final String JSON_PROPERTY_TRACK = "track";
    private String track = "outbound";

    public SoundModifications() {}

    public SoundModifications pitch(Double pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * Set the pitch directly, value should be &gt; 0, default 1 (lower &#x3D; lower tone)
     * @return pitch
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0.8",
        value = "Set the pitch directly, value should be > 0, default 1 (lower = lower tone)"
    )
    @JsonProperty(JSON_PROPERTY_PITCH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Double getPitch() {
        return pitch;
    }

    @JsonProperty(JSON_PROPERTY_PITCH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public SoundModifications semitone(Double semitone) {
        this.semitone = semitone;
        return this;
    }

    /**
     * Adjust the pitch in semitones, values should be between -14 and 14, default 0
     * @return semitone
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "-10",
        value = "Adjust the pitch in semitones, values should be between -14 and 14, default 0"
    )
    @JsonProperty(JSON_PROPERTY_SEMITONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Double getSemitone() {
        return semitone;
    }

    @JsonProperty(JSON_PROPERTY_SEMITONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSemitone(Double semitone) {
        this.semitone = semitone;
    }

    public SoundModifications octaves(Double octaves) {
        this.octaves = octaves;
        return this;
    }

    /**
     * Adjust the pitch in octaves, values should be between -1 and 1, default 0
     * @return octaves
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "-0.5",
        value = "Adjust the pitch in octaves, values should be between -1 and 1, default 0"
    )
    @JsonProperty(JSON_PROPERTY_OCTAVES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Double getOctaves() {
        return octaves;
    }

    @JsonProperty(JSON_PROPERTY_OCTAVES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOctaves(Double octaves) {
        this.octaves = octaves;
    }

    public SoundModifications track(String track) {
        this.track = track;
        return this;
    }

    /**
     * The track to which the sound modifications will be applied. Accepted values are &#x60;inbound&#x60; or &#x60;outbound&#x60;
     * @return track
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "inbound",
        value = "The track to which the sound modifications will be applied. Accepted values are `inbound` or `outbound`"
    )
    @JsonProperty(JSON_PROPERTY_TRACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTrack() {
        return track;
    }

    @JsonProperty(JSON_PROPERTY_TRACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTrack(String track) {
        this.track = track;
    }

    /**
     * Return true if this SoundModifications object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SoundModifications soundModifications = (SoundModifications) o;
        return (
            Objects.equals(this.pitch, soundModifications.pitch) &&
            Objects.equals(this.semitone, soundModifications.semitone) &&
            Objects.equals(this.octaves, soundModifications.octaves) &&
            Objects.equals(this.track, soundModifications.track)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(pitch, semitone, octaves, track);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SoundModifications {\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb
            .append("    semitone: ")
            .append(toIndentedString(semitone))
            .append("\n");
        sb
            .append("    octaves: ")
            .append(toIndentedString(octaves))
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
