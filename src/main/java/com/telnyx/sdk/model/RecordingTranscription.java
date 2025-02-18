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
 * RecordingTranscription
 */
@JsonPropertyOrder(
    {
        RecordingTranscription.JSON_PROPERTY_CREATED_AT,
        RecordingTranscription.JSON_PROPERTY_DURATION_MILLIS,
        RecordingTranscription.JSON_PROPERTY_ID,
        RecordingTranscription.JSON_PROPERTY_RECORDING_ID,
        RecordingTranscription.JSON_PROPERTY_RECORD_TYPE,
        RecordingTranscription.JSON_PROPERTY_STATUS,
        RecordingTranscription.JSON_PROPERTY_TRANSCRIPTION_TEXT,
        RecordingTranscription.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RecordingTranscription {

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_DURATION_MILLIS =
        "duration_millis";
    private Integer durationMillis;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_RECORDING_ID = "recording_id";
    private String recordingId;

    /**
     * Gets or Sets recordType
     */
    public enum RecordTypeEnum {
        RECORDING_TRANSCRIPTION(String.valueOf("recording_transcription"));

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            for (RecordTypeEnum b : RecordTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private RecordTypeEnum recordType;

    /**
     * The status of the recording transcriptions. The transcription text will be available only when the status is completed.
     */
    public enum StatusEnum {
        IN_PROGRESS(String.valueOf("in-progress")),

        COMPLETED(String.valueOf("completed"));

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public static final String JSON_PROPERTY_TRANSCRIPTION_TEXT =
        "transcription_text";
    private String transcriptionText;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public RecordingTranscription() {}

    public RecordingTranscription createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecordingTranscription durationMillis(Integer durationMillis) {
        this.durationMillis = durationMillis;
        return this;
    }

    /**
     * The duration of the recording transcription in milliseconds.
     * @return durationMillis
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "60000",
        value = "The duration of the recording transcription in milliseconds."
    )
    @JsonProperty(JSON_PROPERTY_DURATION_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDurationMillis() {
        return durationMillis;
    }

    @JsonProperty(JSON_PROPERTY_DURATION_MILLIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDurationMillis(Integer durationMillis) {
        this.durationMillis = durationMillis;
    }

    public RecordingTranscription id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies the recording transcription.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        value = "Uniquely identifies the recording transcription."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public RecordingTranscription recordingId(String recordingId) {
        this.recordingId = recordingId;
        return this;
    }

    /**
     * Uniquely identifies the recording associated with this transcription.
     * @return recordingId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "3fa85f64-5717-4562-b3fc-2c963f66afa6",
        value = "Uniquely identifies the recording associated with this transcription."
    )
    @JsonProperty(JSON_PROPERTY_RECORDING_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordingId() {
        return recordingId;
    }

    @JsonProperty(JSON_PROPERTY_RECORDING_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordingId(String recordingId) {
        this.recordingId = recordingId;
    }

    public RecordingTranscription recordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "recording_transcription", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    public RecordingTranscription status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the recording transcriptions. The transcription text will be available only when the status is completed.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "completed",
        value = "The status of the recording transcriptions. The transcription text will be available only when the status is completed."
    )
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RecordingTranscription transcriptionText(String transcriptionText) {
        this.transcriptionText = transcriptionText;
        return this;
    }

    /**
     * The recording&#39;s transcribed text
     * @return transcriptionText
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Good morning, how may I help you?",
        value = "The recording's transcribed text"
    )
    @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTranscriptionText() {
        return transcriptionText;
    }

    @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTranscriptionText(String transcriptionText) {
        this.transcriptionText = transcriptionText;
    }

    public RecordingTranscription updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     * @return updatedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Return true if this RecordingTranscription object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordingTranscription recordingTranscription =
            (RecordingTranscription) o;
        return (
            Objects.equals(this.createdAt, recordingTranscription.createdAt) &&
            Objects.equals(
                this.durationMillis,
                recordingTranscription.durationMillis
            ) &&
            Objects.equals(this.id, recordingTranscription.id) &&
            Objects.equals(
                this.recordingId,
                recordingTranscription.recordingId
            ) &&
            Objects.equals(
                this.recordType,
                recordingTranscription.recordType
            ) &&
            Objects.equals(this.status, recordingTranscription.status) &&
            Objects.equals(
                this.transcriptionText,
                recordingTranscription.transcriptionText
            ) &&
            Objects.equals(this.updatedAt, recordingTranscription.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            durationMillis,
            id,
            recordingId,
            recordType,
            status,
            transcriptionText,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordingTranscription {\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    durationMillis: ")
            .append(toIndentedString(durationMillis))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordingId: ")
            .append(toIndentedString(recordingId))
            .append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    transcriptionText: ")
            .append(toIndentedString(transcriptionText))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
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
