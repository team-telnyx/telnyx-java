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

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.TranscriptionStartRequestLanguage;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * StartRecordingRequest
 */
@JsonPropertyOrder({
  StartRecordingRequest.JSON_PROPERTY_FORMAT,
  StartRecordingRequest.JSON_PROPERTY_CHANNELS,
  StartRecordingRequest.JSON_PROPERTY_CLIENT_STATE,
  StartRecordingRequest.JSON_PROPERTY_COMMAND_ID,
  StartRecordingRequest.JSON_PROPERTY_PLAY_BEEP,
  StartRecordingRequest.JSON_PROPERTY_MAX_LENGTH,
  StartRecordingRequest.JSON_PROPERTY_TIMEOUT_SECS,
  StartRecordingRequest.JSON_PROPERTY_RECORDING_TRACK,
  StartRecordingRequest.JSON_PROPERTY_TRIM,
  StartRecordingRequest.JSON_PROPERTY_CUSTOM_FILE_NAME,
  StartRecordingRequest.JSON_PROPERTY_TRANSCRIPTION,
  StartRecordingRequest.JSON_PROPERTY_TRANSCRIPTION_ENGINE,
  StartRecordingRequest.JSON_PROPERTY_TRANSCRIPTION_LANGUAGE,
  StartRecordingRequest.JSON_PROPERTY_TRANSCRIPTION_PROFANITY_FILTER,
  StartRecordingRequest.JSON_PROPERTY_TRANSCRIPTION_SPEAKER_DIARIZATION,
  StartRecordingRequest.JSON_PROPERTY_TRANSCRIPTION_MIN_SPEAKER_COUNT,
  StartRecordingRequest.JSON_PROPERTY_TRANSCRIPTION_MAX_SPEAKER_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class StartRecordingRequest {
  /**
   * The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;.
   */
  public enum FormatEnum {
    WAV(String.valueOf("wav")),
    
    MP3(String.valueOf("mp3"));

    private String value;

    FormatEnum(String value) {
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
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORMAT = "format";
  private FormatEnum format;

  /**
   * When &#x60;dual&#x60;, final audio file will be stereo recorded with the first leg on channel A, and the rest on channel B.
   */
  public enum ChannelsEnum {
    SINGLE(String.valueOf("single")),
    
    DUAL(String.valueOf("dual"));

    private String value;

    ChannelsEnum(String value) {
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
    public static ChannelsEnum fromValue(String value) {
      for (ChannelsEnum b : ChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private ChannelsEnum channels;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public static final String JSON_PROPERTY_PLAY_BEEP = "play_beep";
  private Boolean playBeep;

  public static final String JSON_PROPERTY_MAX_LENGTH = "max_length";
  private Integer maxLength = 0;

  public static final String JSON_PROPERTY_TIMEOUT_SECS = "timeout_secs";
  private Integer timeoutSecs = 0;

  /**
   * The audio track to be recorded. Can be either &#x60;both&#x60;, &#x60;inbound&#x60; or &#x60;outbound&#x60;. If only single track is specified (&#x60;inbound&#x60;, &#x60;outbound&#x60;), &#x60;channels&#x60; configuration is ignored and it will be recorded as mono (single channel).
   */
  public enum RecordingTrackEnum {
    BOTH(String.valueOf("both")),
    
    INBOUND(String.valueOf("inbound")),
    
    OUTBOUND(String.valueOf("outbound"));

    private String value;

    RecordingTrackEnum(String value) {
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
    public static RecordingTrackEnum fromValue(String value) {
      for (RecordingTrackEnum b : RecordingTrackEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORDING_TRACK = "recording_track";
  private RecordingTrackEnum recordingTrack = RecordingTrackEnum.BOTH;

  /**
   * When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording.
   */
  public enum TrimEnum {
    TRIM_SILENCE(String.valueOf("trim-silence"));

    private String value;

    TrimEnum(String value) {
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
    public static TrimEnum fromValue(String value) {
      for (TrimEnum b : TrimEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRIM = "trim";
  private TrimEnum trim;

  public static final String JSON_PROPERTY_CUSTOM_FILE_NAME = "custom_file_name";
  private String customFileName;

  public static final String JSON_PROPERTY_TRANSCRIPTION = "transcription";
  private Boolean transcription = false;

  /**
   * Engine to use for speech recognition. &#x60;A&#x60; - &#x60;Google&#x60;, &#x60;B&#x60; - &#x60;Telnyx&#x60;.
   */
  public enum TranscriptionEngineEnum {
    A(String.valueOf("A")),
    
    B(String.valueOf("B"));

    private String value;

    TranscriptionEngineEnum(String value) {
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
    public static TranscriptionEngineEnum fromValue(String value) {
      for (TranscriptionEngineEnum b : TranscriptionEngineEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSCRIPTION_ENGINE = "transcription_engine";
  private TranscriptionEngineEnum transcriptionEngine = TranscriptionEngineEnum.A;

  public static final String JSON_PROPERTY_TRANSCRIPTION_LANGUAGE = "transcription_language";
  private TranscriptionStartRequestLanguage transcriptionLanguage;

  public static final String JSON_PROPERTY_TRANSCRIPTION_PROFANITY_FILTER = "transcription_profanity_filter";
  private Boolean transcriptionProfanityFilter = false;

  public static final String JSON_PROPERTY_TRANSCRIPTION_SPEAKER_DIARIZATION = "transcription_speaker_diarization";
  private Boolean transcriptionSpeakerDiarization = false;

  public static final String JSON_PROPERTY_TRANSCRIPTION_MIN_SPEAKER_COUNT = "transcription_min_speaker_count";
  private Integer transcriptionMinSpeakerCount = 2;

  public static final String JSON_PROPERTY_TRANSCRIPTION_MAX_SPEAKER_COUNT = "transcription_max_speaker_count";
  private Integer transcriptionMaxSpeakerCount = 6;

  public StartRecordingRequest() { 
  }

  public StartRecordingRequest format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;.
   * @return format
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mp3", required = true, value = "The audio file format used when storing the call recording. Can be either `mp3` or `wav`.")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FormatEnum getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public StartRecordingRequest channels(ChannelsEnum channels) {
    this.channels = channels;
    return this;
  }

   /**
   * When &#x60;dual&#x60;, final audio file will be stereo recorded with the first leg on channel A, and the rest on channel B.
   * @return channels
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "single", required = true, value = "When `dual`, final audio file will be stereo recorded with the first leg on channel A, and the rest on channel B.")
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChannelsEnum getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannels(ChannelsEnum channels) {
    this.channels = channels;
  }


  public StartRecordingRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
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


  public StartRecordingRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`.")
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


  public StartRecordingRequest playBeep(Boolean playBeep) {
    this.playBeep = playBeep;
    return this;
  }

   /**
   * If enabled, a beep sound will be played at the start of a recording.
   * @return playBeep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If enabled, a beep sound will be played at the start of a recording.")
  @JsonProperty(JSON_PROPERTY_PLAY_BEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPlayBeep() {
    return playBeep;
  }


  @JsonProperty(JSON_PROPERTY_PLAY_BEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlayBeep(Boolean playBeep) {
    this.playBeep = playBeep;
  }


  public StartRecordingRequest maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Defines the maximum length for the recording in seconds. The minimum value is 0. The maximum value is 14400. The default value is 0 (infinite)
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "Defines the maximum length for the recording in seconds. The minimum value is 0. The maximum value is 14400. The default value is 0 (infinite)")
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxLength() {
    return maxLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public StartRecordingRequest timeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
    return this;
  }

   /**
   * The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite)
   * @return timeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The number of seconds that Telnyx will wait for the recording to be stopped if silence is detected. The timer only starts when the speech is detected. Please note that call transcription is used to detect silence and the related charge will be applied. The minimum value is 0. The default value is 0 (infinite)")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutSecs() {
    return timeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
  }


  public StartRecordingRequest recordingTrack(RecordingTrackEnum recordingTrack) {
    this.recordingTrack = recordingTrack;
    return this;
  }

   /**
   * The audio track to be recorded. Can be either &#x60;both&#x60;, &#x60;inbound&#x60; or &#x60;outbound&#x60;. If only single track is specified (&#x60;inbound&#x60;, &#x60;outbound&#x60;), &#x60;channels&#x60; configuration is ignored and it will be recorded as mono (single channel).
   * @return recordingTrack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "outbound", value = "The audio track to be recorded. Can be either `both`, `inbound` or `outbound`. If only single track is specified (`inbound`, `outbound`), `channels` configuration is ignored and it will be recorded as mono (single channel).")
  @JsonProperty(JSON_PROPERTY_RECORDING_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordingTrackEnum getRecordingTrack() {
    return recordingTrack;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_TRACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordingTrack(RecordingTrackEnum recordingTrack) {
    this.recordingTrack = recordingTrack;
  }


  public StartRecordingRequest trim(TrimEnum trim) {
    this.trim = trim;
    return this;
  }

   /**
   * When set to &#x60;trim-silence&#x60;, silence will be removed from the beginning and end of the recording.
   * @return trim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "trim-silence", value = "When set to `trim-silence`, silence will be removed from the beginning and end of the recording.")
  @JsonProperty(JSON_PROPERTY_TRIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrimEnum getTrim() {
    return trim;
  }


  @JsonProperty(JSON_PROPERTY_TRIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrim(TrimEnum trim) {
    this.trim = trim;
  }


  public StartRecordingRequest customFileName(String customFileName) {
    this.customFileName = customFileName;
    return this;
  }

   /**
   * The custom recording file name to be used instead of the default &#x60;call_leg_id&#x60;. Telnyx will still add a Unix timestamp suffix.
   * @return customFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my_recording_file_name", value = "The custom recording file name to be used instead of the default `call_leg_id`. Telnyx will still add a Unix timestamp suffix.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomFileName() {
    return customFileName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFileName(String customFileName) {
    this.customFileName = customFileName;
  }


  public StartRecordingRequest transcription(Boolean transcription) {
    this.transcription = transcription;
    return this;
  }

   /**
   * Enable post recording transcription. The default value is false.
   * @return transcription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enable post recording transcription. The default value is false.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTranscription() {
    return transcription;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscription(Boolean transcription) {
    this.transcription = transcription;
  }


  public StartRecordingRequest transcriptionEngine(TranscriptionEngineEnum transcriptionEngine) {
    this.transcriptionEngine = transcriptionEngine;
    return this;
  }

   /**
   * Engine to use for speech recognition. &#x60;A&#x60; - &#x60;Google&#x60;, &#x60;B&#x60; - &#x60;Telnyx&#x60;.
   * @return transcriptionEngine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TranscriptionEngineEnum getTranscriptionEngine() {
    return transcriptionEngine;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptionEngine(TranscriptionEngineEnum transcriptionEngine) {
    this.transcriptionEngine = transcriptionEngine;
  }


  public StartRecordingRequest transcriptionLanguage(TranscriptionStartRequestLanguage transcriptionLanguage) {
    this.transcriptionLanguage = transcriptionLanguage;
    return this;
  }

   /**
   * Get transcriptionLanguage
   * @return transcriptionLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TranscriptionStartRequestLanguage getTranscriptionLanguage() {
    return transcriptionLanguage;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptionLanguage(TranscriptionStartRequestLanguage transcriptionLanguage) {
    this.transcriptionLanguage = transcriptionLanguage;
  }


  public StartRecordingRequest transcriptionProfanityFilter(Boolean transcriptionProfanityFilter) {
    this.transcriptionProfanityFilter = transcriptionProfanityFilter;
    return this;
  }

   /**
   * Enables profanity_filter. Applies to &#x60;google&#x60; engine only.
   * @return transcriptionProfanityFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enables profanity_filter. Applies to `google` engine only.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_PROFANITY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTranscriptionProfanityFilter() {
    return transcriptionProfanityFilter;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_PROFANITY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptionProfanityFilter(Boolean transcriptionProfanityFilter) {
    this.transcriptionProfanityFilter = transcriptionProfanityFilter;
  }


  public StartRecordingRequest transcriptionSpeakerDiarization(Boolean transcriptionSpeakerDiarization) {
    this.transcriptionSpeakerDiarization = transcriptionSpeakerDiarization;
    return this;
  }

   /**
   * Enables speaker diarization. Applies to &#x60;google&#x60; engine only.
   * @return transcriptionSpeakerDiarization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enables speaker diarization. Applies to `google` engine only.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_SPEAKER_DIARIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTranscriptionSpeakerDiarization() {
    return transcriptionSpeakerDiarization;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_SPEAKER_DIARIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptionSpeakerDiarization(Boolean transcriptionSpeakerDiarization) {
    this.transcriptionSpeakerDiarization = transcriptionSpeakerDiarization;
  }


  public StartRecordingRequest transcriptionMinSpeakerCount(Integer transcriptionMinSpeakerCount) {
    this.transcriptionMinSpeakerCount = transcriptionMinSpeakerCount;
    return this;
  }

   /**
   * Defines minimum number of speakers in the conversation. Applies to &#x60;google&#x60; engine only.
   * @return transcriptionMinSpeakerCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Defines minimum number of speakers in the conversation. Applies to `google` engine only.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_MIN_SPEAKER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTranscriptionMinSpeakerCount() {
    return transcriptionMinSpeakerCount;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_MIN_SPEAKER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptionMinSpeakerCount(Integer transcriptionMinSpeakerCount) {
    this.transcriptionMinSpeakerCount = transcriptionMinSpeakerCount;
  }


  public StartRecordingRequest transcriptionMaxSpeakerCount(Integer transcriptionMaxSpeakerCount) {
    this.transcriptionMaxSpeakerCount = transcriptionMaxSpeakerCount;
    return this;
  }

   /**
   * Defines maximum number of speakers in the conversation. Applies to &#x60;google&#x60; engine only.
   * @return transcriptionMaxSpeakerCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Defines maximum number of speakers in the conversation. Applies to `google` engine only.")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_MAX_SPEAKER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTranscriptionMaxSpeakerCount() {
    return transcriptionMaxSpeakerCount;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_MAX_SPEAKER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptionMaxSpeakerCount(Integer transcriptionMaxSpeakerCount) {
    this.transcriptionMaxSpeakerCount = transcriptionMaxSpeakerCount;
  }


  /**
   * Return true if this StartRecordingRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartRecordingRequest startRecordingRequest = (StartRecordingRequest) o;
    return Objects.equals(this.format, startRecordingRequest.format) &&
        Objects.equals(this.channels, startRecordingRequest.channels) &&
        Objects.equals(this.clientState, startRecordingRequest.clientState) &&
        Objects.equals(this.commandId, startRecordingRequest.commandId) &&
        Objects.equals(this.playBeep, startRecordingRequest.playBeep) &&
        Objects.equals(this.maxLength, startRecordingRequest.maxLength) &&
        Objects.equals(this.timeoutSecs, startRecordingRequest.timeoutSecs) &&
        Objects.equals(this.recordingTrack, startRecordingRequest.recordingTrack) &&
        Objects.equals(this.trim, startRecordingRequest.trim) &&
        Objects.equals(this.customFileName, startRecordingRequest.customFileName) &&
        Objects.equals(this.transcription, startRecordingRequest.transcription) &&
        Objects.equals(this.transcriptionEngine, startRecordingRequest.transcriptionEngine) &&
        Objects.equals(this.transcriptionLanguage, startRecordingRequest.transcriptionLanguage) &&
        Objects.equals(this.transcriptionProfanityFilter, startRecordingRequest.transcriptionProfanityFilter) &&
        Objects.equals(this.transcriptionSpeakerDiarization, startRecordingRequest.transcriptionSpeakerDiarization) &&
        Objects.equals(this.transcriptionMinSpeakerCount, startRecordingRequest.transcriptionMinSpeakerCount) &&
        Objects.equals(this.transcriptionMaxSpeakerCount, startRecordingRequest.transcriptionMaxSpeakerCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, channels, clientState, commandId, playBeep, maxLength, timeoutSecs, recordingTrack, trim, customFileName, transcription, transcriptionEngine, transcriptionLanguage, transcriptionProfanityFilter, transcriptionSpeakerDiarization, transcriptionMinSpeakerCount, transcriptionMaxSpeakerCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartRecordingRequest {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    playBeep: ").append(toIndentedString(playBeep)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    timeoutSecs: ").append(toIndentedString(timeoutSecs)).append("\n");
    sb.append("    recordingTrack: ").append(toIndentedString(recordingTrack)).append("\n");
    sb.append("    trim: ").append(toIndentedString(trim)).append("\n");
    sb.append("    customFileName: ").append(toIndentedString(customFileName)).append("\n");
    sb.append("    transcription: ").append(toIndentedString(transcription)).append("\n");
    sb.append("    transcriptionEngine: ").append(toIndentedString(transcriptionEngine)).append("\n");
    sb.append("    transcriptionLanguage: ").append(toIndentedString(transcriptionLanguage)).append("\n");
    sb.append("    transcriptionProfanityFilter: ").append(toIndentedString(transcriptionProfanityFilter)).append("\n");
    sb.append("    transcriptionSpeakerDiarization: ").append(toIndentedString(transcriptionSpeakerDiarization)).append("\n");
    sb.append("    transcriptionMinSpeakerCount: ").append(toIndentedString(transcriptionMinSpeakerCount)).append("\n");
    sb.append("    transcriptionMaxSpeakerCount: ").append(toIndentedString(transcriptionMaxSpeakerCount)).append("\n");
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

