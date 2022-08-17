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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.RoomSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Room
 */
@JsonPropertyOrder({
  Room.JSON_PROPERTY_ID,
  Room.JSON_PROPERTY_MAX_PARTICIPANTS,
  Room.JSON_PROPERTY_UNIQUE_NAME,
  Room.JSON_PROPERTY_CREATED_AT,
  Room.JSON_PROPERTY_UPDATED_AT,
  Room.JSON_PROPERTY_ACTIVE_SESSION_ID,
  Room.JSON_PROPERTY_SESSIONS,
  Room.JSON_PROPERTY_ENABLE_RECORDING,
  Room.JSON_PROPERTY_WEBHOOK_EVENT_URL,
  Room.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
  Room.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
  Room.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Room {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_MAX_PARTICIPANTS = "max_participants";
  private Integer maxParticipants;

  public static final String JSON_PROPERTY_UNIQUE_NAME = "unique_name";
  private String uniqueName;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_ACTIVE_SESSION_ID = "active_session_id";
  private UUID activeSessionId;

  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private List<RoomSession> sessions = null;

  public static final String JSON_PROPERTY_ENABLE_RECORDING = "enable_recording";
  private Boolean enableRecording = false;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL = "webhook_event_url";
  private String webhookEventUrl;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL = "webhook_event_failover_url";
  private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<String>of("");

  public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS = "webhook_timeout_secs";
  private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public Room() { 
  }

  @JsonCreator
  public Room(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
  ) {
    this();
    this.recordType = recordType;
  }

  public Room id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the room.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "A unique identifier for the room.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public Room maxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }

   /**
   * Maximum participants allowed in the room.
   * @return maxParticipants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "Maximum participants allowed in the room.")
  @JsonProperty(JSON_PROPERTY_MAX_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxParticipants() {
    return maxParticipants;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
  }


  public Room uniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * The unique (within the Telnyx account scope) name of the room.
   * @return uniqueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My room", value = "The unique (within the Telnyx account scope) name of the room.")
  @JsonProperty(JSON_PROPERTY_UNIQUE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUniqueName() {
    return uniqueName;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }


  public Room createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room was created.")
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


  public Room updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room was updated.")
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


  public Room activeSessionId(UUID activeSessionId) {
    this.activeSessionId = activeSessionId;
    return this;
  }

   /**
   * The identifier of the active room session if any.
   * @return activeSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "The identifier of the active room session if any.")
  @JsonProperty(JSON_PROPERTY_ACTIVE_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getActiveSessionId() {
    return activeSessionId;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveSessionId(UUID activeSessionId) {
    this.activeSessionId = activeSessionId;
  }


  public Room sessions(List<RoomSession> sessions) {
    this.sessions = sessions;
    return this;
  }

  public Room addSessionsItem(RoomSession sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RoomSession> getSessions() {
    return sessions;
  }


  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessions(List<RoomSession> sessions) {
    this.sessions = sessions;
  }


  public Room enableRecording(Boolean enableRecording) {
    this.enableRecording = enableRecording;
    return this;
  }

   /**
   * Enable or disable recording for that room.
   * @return enableRecording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enable or disable recording for that room.")
  @JsonProperty(JSON_PROPERTY_ENABLE_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableRecording() {
    return enableRecording;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableRecording(Boolean enableRecording) {
    this.enableRecording = enableRecording;
  }


  public Room webhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this room will be sent. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "The URL where webhooks related to this room will be sent. Must include a scheme, such as 'https'.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookEventUrl() {
    return webhookEventUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
  }


  public Room webhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this room will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://failover.example.com", value = "The failover URL where webhooks related to this room will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'.")
  @JsonIgnore

  public String getWebhookEventFailoverUrl() {
        return webhookEventFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookEventFailoverUrl_JsonNullable() {
    return webhookEventFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  public void setWebhookEventFailoverUrl_JsonNullable(JsonNullable<String> webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
  }

  public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
  }


  public Room webhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a webhook.
   * minimum: 0
   * maximum: 30
   * @return webhookTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Specifies how many seconds to wait before timing out a webhook.")
  @JsonIgnore

  public Integer getWebhookTimeoutSecs() {
        return webhookTimeoutSecs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getWebhookTimeoutSecs_JsonNullable() {
    return webhookTimeoutSecs;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  public void setWebhookTimeoutSecs_JsonNullable(JsonNullable<Integer> webhookTimeoutSecs) {
    this.webhookTimeoutSecs = webhookTimeoutSecs;
  }

  public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "room", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  /**
   * Return true if this Room object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.id, room.id) &&
        Objects.equals(this.maxParticipants, room.maxParticipants) &&
        Objects.equals(this.uniqueName, room.uniqueName) &&
        Objects.equals(this.createdAt, room.createdAt) &&
        Objects.equals(this.updatedAt, room.updatedAt) &&
        Objects.equals(this.activeSessionId, room.activeSessionId) &&
        Objects.equals(this.sessions, room.sessions) &&
        Objects.equals(this.enableRecording, room.enableRecording) &&
        Objects.equals(this.webhookEventUrl, room.webhookEventUrl) &&
        equalsNullable(this.webhookEventFailoverUrl, room.webhookEventFailoverUrl) &&
        equalsNullable(this.webhookTimeoutSecs, room.webhookTimeoutSecs) &&
        Objects.equals(this.recordType, room.recordType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxParticipants, uniqueName, createdAt, updatedAt, activeSessionId, sessions, enableRecording, webhookEventUrl, hashCodeNullable(webhookEventFailoverUrl), hashCodeNullable(webhookTimeoutSecs), recordType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    activeSessionId: ").append(toIndentedString(activeSessionId)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    enableRecording: ").append(toIndentedString(enableRecording)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookTimeoutSecs: ").append(toIndentedString(webhookTimeoutSecs)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

