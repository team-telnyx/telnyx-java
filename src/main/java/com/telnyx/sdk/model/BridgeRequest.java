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
import java.util.UUID;

/**
 * BridgeRequest
 */
@JsonPropertyOrder(
    {
        BridgeRequest.JSON_PROPERTY_CALL_CONTROL_ID,
        BridgeRequest.JSON_PROPERTY_CLIENT_STATE,
        BridgeRequest.JSON_PROPERTY_COMMAND_ID,
        BridgeRequest.JSON_PROPERTY_QUEUE,
        BridgeRequest.JSON_PROPERTY_VIDEO_ROOM_ID,
        BridgeRequest.JSON_PROPERTY_VIDEO_ROOM_CONTEXT,
        BridgeRequest.JSON_PROPERTY_PARK_AFTER_UNBRIDGE,
        BridgeRequest.JSON_PROPERTY_PLAY_RINGTONE,
        BridgeRequest.JSON_PROPERTY_RINGTONE,
        BridgeRequest.JSON_PROPERTY_RECORD,
        BridgeRequest.JSON_PROPERTY_RECORD_CHANNELS,
        BridgeRequest.JSON_PROPERTY_RECORD_FORMAT,
        BridgeRequest.JSON_PROPERTY_RECORD_MAX_LENGTH,
        BridgeRequest.JSON_PROPERTY_RECORD_TIMEOUT_SECS,
        BridgeRequest.JSON_PROPERTY_RECORD_TRACK,
        BridgeRequest.JSON_PROPERTY_RECORD_TRIM,
        BridgeRequest.JSON_PROPERTY_RECORD_CUSTOM_FILE_NAME,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BridgeRequest {

    public static final String JSON_PROPERTY_CALL_CONTROL_ID =
        "call_control_id";
    private String callControlId;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
    private String commandId;

    public static final String JSON_PROPERTY_QUEUE = "queue";
    private String queue;

    public static final String JSON_PROPERTY_VIDEO_ROOM_ID = "video_room_id";
    private UUID videoRoomId;

    public static final String JSON_PROPERTY_VIDEO_ROOM_CONTEXT =
        "video_room_context";
    private String videoRoomContext;

    public static final String JSON_PROPERTY_PARK_AFTER_UNBRIDGE =
        "park_after_unbridge";
    private String parkAfterUnbridge;

    public static final String JSON_PROPERTY_PLAY_RINGTONE = "play_ringtone";
    private Boolean playRingtone = false;

    /**
     * Specifies which country ringtone to play when &#x60;play_ringtone&#x60; is set to &#x60;true&#x60;. If not set, the US ringtone will be played.
     */
    public enum RingtoneEnum {
        AT(String.valueOf("at")),

        AU(String.valueOf("au")),

        BE(String.valueOf("be")),

        BG(String.valueOf("bg")),

        BR(String.valueOf("br")),

        CH(String.valueOf("ch")),

        CL(String.valueOf("cl")),

        CN(String.valueOf("cn")),

        CZ(String.valueOf("cz")),

        DE(String.valueOf("de")),

        DK(String.valueOf("dk")),

        EE(String.valueOf("ee")),

        ES(String.valueOf("es")),

        FI(String.valueOf("fi")),

        FR(String.valueOf("fr")),

        GR(String.valueOf("gr")),

        HU(String.valueOf("hu")),

        IL(String.valueOf("il")),

        IN(String.valueOf("in")),

        IT(String.valueOf("it")),

        JP(String.valueOf("jp")),

        LT(String.valueOf("lt")),

        MX(String.valueOf("mx")),

        MY(String.valueOf("my")),

        NL(String.valueOf("nl")),

        NO(String.valueOf("no")),

        NZ(String.valueOf("nz")),

        PH(String.valueOf("ph")),

        PL(String.valueOf("pl")),

        PT(String.valueOf("pt")),

        RU(String.valueOf("ru")),

        SE(String.valueOf("se")),

        SG(String.valueOf("sg")),

        TH(String.valueOf("th")),

        TW(String.valueOf("tw")),

        UK(String.valueOf("uk")),

        US_OLD(String.valueOf("us-old")),

        US(String.valueOf("us")),

        VE(String.valueOf("ve")),

        ZA(String.valueOf("za"));

        private String value;

        RingtoneEnum(String value) {
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
        public static RingtoneEnum fromValue(String value) {
            for (RingtoneEnum b : RingtoneEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RINGTONE = "ringtone";
    private RingtoneEnum ringtone = RingtoneEnum.US;

    /**
     * Start recording automatically after an event. Disabled by default.
     */
    public enum RecordEnum {
        RECORD_FROM_ANSWER(String.valueOf("record-from-answer"));

        private String value;

        RecordEnum(String value) {
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
        public static RecordEnum fromValue(String value) {
            for (RecordEnum b : RecordEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD = "record";
    private RecordEnum record;

    /**
     * Defines which channel should be recorded (&#39;single&#39; or &#39;dual&#39;) when &#x60;record&#x60; is specified.
     */
    public enum RecordChannelsEnum {
        SINGLE(String.valueOf("single")),

        DUAL(String.valueOf("dual"));

        private String value;

        RecordChannelsEnum(String value) {
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
        public static RecordChannelsEnum fromValue(String value) {
            for (RecordChannelsEnum b : RecordChannelsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_CHANNELS =
        "record_channels";
    private RecordChannelsEnum recordChannels = RecordChannelsEnum.DUAL;

    /**
     * Defines the format of the recording (&#39;wav&#39; or &#39;mp3&#39;) when &#x60;record&#x60; is specified.
     */
    public enum RecordFormatEnum {
        WAV(String.valueOf("wav")),

        MP3(String.valueOf("mp3"));

        private String value;

        RecordFormatEnum(String value) {
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
        public static RecordFormatEnum fromValue(String value) {
            for (RecordFormatEnum b : RecordFormatEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_FORMAT = "record_format";
    private RecordFormatEnum recordFormat = RecordFormatEnum.MP3;

    public static final String JSON_PROPERTY_RECORD_MAX_LENGTH =
        "record_max_length";
    private Integer recordMaxLength = 0;

    public static final String JSON_PROPERTY_RECORD_TIMEOUT_SECS =
        "record_timeout_secs";
    private Integer recordTimeoutSecs = 0;

    /**
     * The audio track to be recorded. Can be either &#x60;both&#x60;, &#x60;inbound&#x60; or &#x60;outbound&#x60;. If only single track is specified (&#x60;inbound&#x60;, &#x60;outbound&#x60;), &#x60;channels&#x60; configuration is ignored and it will be recorded as mono (single channel).
     */
    public enum RecordTrackEnum {
        BOTH(String.valueOf("both")),

        INBOUND(String.valueOf("inbound")),

        OUTBOUND(String.valueOf("outbound"));

        private String value;

        RecordTrackEnum(String value) {
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
        public static RecordTrackEnum fromValue(String value) {
            for (RecordTrackEnum b : RecordTrackEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_TRACK = "record_track";
    private RecordTrackEnum recordTrack = RecordTrackEnum.BOTH;

    /**
     * When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording.
     */
    public enum RecordTrimEnum {
        TRIM_SILENCE(String.valueOf("trim-silence"));

        private String value;

        RecordTrimEnum(String value) {
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
        public static RecordTrimEnum fromValue(String value) {
            for (RecordTrimEnum b : RecordTrimEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_TRIM = "record_trim";
    private RecordTrimEnum recordTrim;

    public static final String JSON_PROPERTY_RECORD_CUSTOM_FILE_NAME =
        "record_custom_file_name";
    private String recordCustomFileName;

    public BridgeRequest() {}

    public BridgeRequest callControlId(String callControlId) {
        this.callControlId = callControlId;
        return this;
    }

    /**
     * The Call Control ID of the call you want to bridge with, can&#39;t be used together with queue parameter or video_room_id parameter.
     * @return callControlId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg",
        required = true,
        value = "The Call Control ID of the call you want to bridge with, can't be used together with queue parameter or video_room_id parameter."
    )
    @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCallControlId() {
        return callControlId;
    }

    @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCallControlId(String callControlId) {
        this.callControlId = callControlId;
    }

    public BridgeRequest clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
     * @return clientState
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "aGF2ZSBhIG5pY2UgZGF5ID1d",
        value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string."
    )
    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getClientState() {
        return clientState;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setClientState(String clientState) {
        this.clientState = clientState;
    }

    public BridgeRequest commandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
     * @return commandId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "891510ac-f3e4-11e8-af5b-de00688a4901",
        value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`."
    )
    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCommandId() {
        return commandId;
    }

    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public BridgeRequest queue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * The name of the queue you want to bridge with, can&#39;t be used together with call_control_id parameter or video_room_id parameter. Bridging with a queue means bridging with the first call in the queue. The call will always be removed from the queue regardless of whether bridging succeeds. Returns an error when the queue is empty.
     * @return queue
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "support",
        value = "The name of the queue you want to bridge with, can't be used together with call_control_id parameter or video_room_id parameter. Bridging with a queue means bridging with the first call in the queue. The call will always be removed from the queue regardless of whether bridging succeeds. Returns an error when the queue is empty."
    )
    @JsonProperty(JSON_PROPERTY_QUEUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getQueue() {
        return queue;
    }

    @JsonProperty(JSON_PROPERTY_QUEUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQueue(String queue) {
        this.queue = queue;
    }

    public BridgeRequest videoRoomId(UUID videoRoomId) {
        this.videoRoomId = videoRoomId;
        return this;
    }

    /**
     * The ID of the video room you want to bridge with, can&#39;t be used together with call_control_id parameter or queue parameter.
     * @return videoRoomId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0",
        value = "The ID of the video room you want to bridge with, can't be used together with call_control_id parameter or queue parameter."
    )
    @JsonProperty(JSON_PROPERTY_VIDEO_ROOM_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getVideoRoomId() {
        return videoRoomId;
    }

    @JsonProperty(JSON_PROPERTY_VIDEO_ROOM_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVideoRoomId(UUID videoRoomId) {
        this.videoRoomId = videoRoomId;
    }

    public BridgeRequest videoRoomContext(String videoRoomContext) {
        this.videoRoomContext = videoRoomContext;
        return this;
    }

    /**
     * The additional parameter that will be passed to the video conference. It is a text field and the user can decide how to use it. For example, you can set the participant name or pass JSON text. It can be used only with video_room_id parameter.
     * @return videoRoomContext
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Alice",
        value = "The additional parameter that will be passed to the video conference. It is a text field and the user can decide how to use it. For example, you can set the participant name or pass JSON text. It can be used only with video_room_id parameter."
    )
    @JsonProperty(JSON_PROPERTY_VIDEO_ROOM_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVideoRoomContext() {
        return videoRoomContext;
    }

    @JsonProperty(JSON_PROPERTY_VIDEO_ROOM_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVideoRoomContext(String videoRoomContext) {
        this.videoRoomContext = videoRoomContext;
    }

    public BridgeRequest parkAfterUnbridge(String parkAfterUnbridge) {
        this.parkAfterUnbridge = parkAfterUnbridge;
        return this;
    }

    /**
     * Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is transferred). If supplied with the value &#x60;self&#x60;, the current leg will be parked after unbridge. If not set, the default behavior is to hang up the leg.
     * @return parkAfterUnbridge
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "self",
        value = "Specifies behavior after the bridge ends (i.e. the opposite leg either hangs up or is transferred). If supplied with the value `self`, the current leg will be parked after unbridge. If not set, the default behavior is to hang up the leg."
    )
    @JsonProperty(JSON_PROPERTY_PARK_AFTER_UNBRIDGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getParkAfterUnbridge() {
        return parkAfterUnbridge;
    }

    @JsonProperty(JSON_PROPERTY_PARK_AFTER_UNBRIDGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParkAfterUnbridge(String parkAfterUnbridge) {
        this.parkAfterUnbridge = parkAfterUnbridge;
    }

    public BridgeRequest playRingtone(Boolean playRingtone) {
        this.playRingtone = playRingtone;
        return this;
    }

    /**
     * Specifies whether to play a ringtone if the call you want to bridge with has not yet been answered.
     * @return playRingtone
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Specifies whether to play a ringtone if the call you want to bridge with has not yet been answered."
    )
    @JsonProperty(JSON_PROPERTY_PLAY_RINGTONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPlayRingtone() {
        return playRingtone;
    }

    @JsonProperty(JSON_PROPERTY_PLAY_RINGTONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlayRingtone(Boolean playRingtone) {
        this.playRingtone = playRingtone;
    }

    public BridgeRequest ringtone(RingtoneEnum ringtone) {
        this.ringtone = ringtone;
        return this;
    }

    /**
     * Specifies which country ringtone to play when &#x60;play_ringtone&#x60; is set to &#x60;true&#x60;. If not set, the US ringtone will be played.
     * @return ringtone
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "pl",
        value = "Specifies which country ringtone to play when `play_ringtone` is set to `true`. If not set, the US ringtone will be played."
    )
    @JsonProperty(JSON_PROPERTY_RINGTONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RingtoneEnum getRingtone() {
        return ringtone;
    }

    @JsonProperty(JSON_PROPERTY_RINGTONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRingtone(RingtoneEnum ringtone) {
        this.ringtone = ringtone;
    }

    public BridgeRequest record(RecordEnum record) {
        this.record = record;
        return this;
    }

    /**
     * Start recording automatically after an event. Disabled by default.
     * @return record
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "record-from-answer",
        value = "Start recording automatically after an event. Disabled by default."
    )
    @JsonProperty(JSON_PROPERTY_RECORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordEnum getRecord() {
        return record;
    }

    @JsonProperty(JSON_PROPERTY_RECORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecord(RecordEnum record) {
        this.record = record;
    }

    public BridgeRequest recordChannels(RecordChannelsEnum recordChannels) {
        this.recordChannels = recordChannels;
        return this;
    }

    /**
     * Defines which channel should be recorded (&#39;single&#39; or &#39;dual&#39;) when &#x60;record&#x60; is specified.
     * @return recordChannels
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "single",
        value = "Defines which channel should be recorded ('single' or 'dual') when `record` is specified."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_CHANNELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordChannelsEnum getRecordChannels() {
        return recordChannels;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_CHANNELS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordChannels(RecordChannelsEnum recordChannels) {
        this.recordChannels = recordChannels;
    }

    public BridgeRequest recordFormat(RecordFormatEnum recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }

    /**
     * Defines the format of the recording (&#39;wav&#39; or &#39;mp3&#39;) when &#x60;record&#x60; is specified.
     * @return recordFormat
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "wav",
        value = "Defines the format of the recording ('wav' or 'mp3') when `record` is specified."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordFormatEnum getRecordFormat() {
        return recordFormat;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordFormat(RecordFormatEnum recordFormat) {
        this.recordFormat = recordFormat;
    }

    public BridgeRequest recordMaxLength(Integer recordMaxLength) {
        this.recordMaxLength = recordMaxLength;
        return this;
    }

    /**
     * Defines the maximum length for the recording in seconds when &#x60;record&#x60; is specified. The minimum value is 0. The maximum value is 43200. The default value is 0 (infinite).
     * @return recordMaxLength
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "1000",
        value = "Defines the maximum length for the recording in seconds when `record` is specified. The minimum value is 0. The maximum value is 43200. The default value is 0 (infinite)."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_MAX_LENGTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getRecordMaxLength() {
        return recordMaxLength;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_MAX_LENGTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordMaxLength(Integer recordMaxLength) {
        this.recordMaxLength = recordMaxLength;
    }

    public BridgeRequest recordTimeoutSecs(Integer recordTimeoutSecs) {
        this.recordTimeoutSecs = recordTimeoutSecs;
        return this;
    }

    /**
     * The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected when &#x60;record&#x60; is specified. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite).
     * @return recordTimeoutSecs
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "100",
        value = "The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected when `record` is specified. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite)."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TIMEOUT_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getRecordTimeoutSecs() {
        return recordTimeoutSecs;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TIMEOUT_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordTimeoutSecs(Integer recordTimeoutSecs) {
        this.recordTimeoutSecs = recordTimeoutSecs;
    }

    public BridgeRequest recordTrack(RecordTrackEnum recordTrack) {
        this.recordTrack = recordTrack;
        return this;
    }

    /**
     * The audio track to be recorded. Can be either &#x60;both&#x60;, &#x60;inbound&#x60; or &#x60;outbound&#x60;. If only single track is specified (&#x60;inbound&#x60;, &#x60;outbound&#x60;), &#x60;channels&#x60; configuration is ignored and it will be recorded as mono (single channel).
     * @return recordTrack
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "outbound",
        value = "The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will be recorded as mono (single channel)."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TRACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordTrackEnum getRecordTrack() {
        return recordTrack;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TRACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordTrack(RecordTrackEnum recordTrack) {
        this.recordTrack = recordTrack;
    }

    public BridgeRequest recordTrim(RecordTrimEnum recordTrim) {
        this.recordTrim = recordTrim;
        return this;
    }

    /**
     * When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording.
     * @return recordTrim
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "trim-silence",
        value = "When set to `trim-silence`, silence will be removed from the beginning and end of the recording."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TRIM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RecordTrimEnum getRecordTrim() {
        return recordTrim;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TRIM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordTrim(RecordTrimEnum recordTrim) {
        this.recordTrim = recordTrim;
    }

    public BridgeRequest recordCustomFileName(String recordCustomFileName) {
        this.recordCustomFileName = recordCustomFileName;
        return this;
    }

    /**
     * The custom recording file name to be used instead of the default &#x60;call_leg_id&#x60;. Telnyx will still add a Unix timestamp suffix.
     * @return recordCustomFileName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "my_recording_file_name",
        value = "The custom recording file name to be used instead of the default `call_leg_id`. Telnyx will still add a Unix timestamp suffix."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_CUSTOM_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordCustomFileName() {
        return recordCustomFileName;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_CUSTOM_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordCustomFileName(String recordCustomFileName) {
        this.recordCustomFileName = recordCustomFileName;
    }

    /**
     * Return true if this BridgeRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BridgeRequest bridgeRequest = (BridgeRequest) o;
        return (
            Objects.equals(this.callControlId, bridgeRequest.callControlId) &&
            Objects.equals(this.clientState, bridgeRequest.clientState) &&
            Objects.equals(this.commandId, bridgeRequest.commandId) &&
            Objects.equals(this.queue, bridgeRequest.queue) &&
            Objects.equals(this.videoRoomId, bridgeRequest.videoRoomId) &&
            Objects.equals(
                this.videoRoomContext,
                bridgeRequest.videoRoomContext
            ) &&
            Objects.equals(
                this.parkAfterUnbridge,
                bridgeRequest.parkAfterUnbridge
            ) &&
            Objects.equals(this.playRingtone, bridgeRequest.playRingtone) &&
            Objects.equals(this.ringtone, bridgeRequest.ringtone) &&
            Objects.equals(this.record, bridgeRequest.record) &&
            Objects.equals(this.recordChannels, bridgeRequest.recordChannels) &&
            Objects.equals(this.recordFormat, bridgeRequest.recordFormat) &&
            Objects.equals(
                this.recordMaxLength,
                bridgeRequest.recordMaxLength
            ) &&
            Objects.equals(
                this.recordTimeoutSecs,
                bridgeRequest.recordTimeoutSecs
            ) &&
            Objects.equals(this.recordTrack, bridgeRequest.recordTrack) &&
            Objects.equals(this.recordTrim, bridgeRequest.recordTrim) &&
            Objects.equals(
                this.recordCustomFileName,
                bridgeRequest.recordCustomFileName
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            callControlId,
            clientState,
            commandId,
            queue,
            videoRoomId,
            videoRoomContext,
            parkAfterUnbridge,
            playRingtone,
            ringtone,
            record,
            recordChannels,
            recordFormat,
            recordMaxLength,
            recordTimeoutSecs,
            recordTrack,
            recordTrim,
            recordCustomFileName
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BridgeRequest {\n");
        sb
            .append("    callControlId: ")
            .append(toIndentedString(callControlId))
            .append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb
            .append("    commandId: ")
            .append(toIndentedString(commandId))
            .append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb
            .append("    videoRoomId: ")
            .append(toIndentedString(videoRoomId))
            .append("\n");
        sb
            .append("    videoRoomContext: ")
            .append(toIndentedString(videoRoomContext))
            .append("\n");
        sb
            .append("    parkAfterUnbridge: ")
            .append(toIndentedString(parkAfterUnbridge))
            .append("\n");
        sb
            .append("    playRingtone: ")
            .append(toIndentedString(playRingtone))
            .append("\n");
        sb
            .append("    ringtone: ")
            .append(toIndentedString(ringtone))
            .append("\n");
        sb.append("    record: ").append(toIndentedString(record)).append("\n");
        sb
            .append("    recordChannels: ")
            .append(toIndentedString(recordChannels))
            .append("\n");
        sb
            .append("    recordFormat: ")
            .append(toIndentedString(recordFormat))
            .append("\n");
        sb
            .append("    recordMaxLength: ")
            .append(toIndentedString(recordMaxLength))
            .append("\n");
        sb
            .append("    recordTimeoutSecs: ")
            .append(toIndentedString(recordTimeoutSecs))
            .append("\n");
        sb
            .append("    recordTrack: ")
            .append(toIndentedString(recordTrack))
            .append("\n");
        sb
            .append("    recordTrim: ")
            .append(toIndentedString(recordTrim))
            .append("\n");
        sb
            .append("    recordCustomFileName: ")
            .append(toIndentedString(recordCustomFileName))
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
