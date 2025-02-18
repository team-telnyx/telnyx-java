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
 * PatchRoomRequest
 */
@JsonPropertyOrder(
    {
        PatchRoomRequest.JSON_PROPERTY_UNIQUE_NAME,
        PatchRoomRequest.JSON_PROPERTY_MAX_PARTICIPANTS,
        PatchRoomRequest.JSON_PROPERTY_ENABLE_RECORDING,
        PatchRoomRequest.JSON_PROPERTY_WEBHOOK_EVENT_URL,
        PatchRoomRequest.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
        PatchRoomRequest.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PatchRoomRequest {

    public static final String JSON_PROPERTY_UNIQUE_NAME = "unique_name";
    private String uniqueName;

    public static final String JSON_PROPERTY_MAX_PARTICIPANTS =
        "max_participants";
    private Integer maxParticipants = 10;

    public static final String JSON_PROPERTY_ENABLE_RECORDING =
        "enable_recording";
    private Boolean enableRecording = false;

    public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL =
        "webhook_event_url";
    private String webhookEventUrl;

    public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL =
        "webhook_event_failover_url";
    private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<
            String
        >of("");

    public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS =
        "webhook_timeout_secs";
    private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<
            Integer
        >undefined();

    public PatchRoomRequest() {}

    public PatchRoomRequest uniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * The unique (within the Telnyx account scope) name of the room.
     * @return uniqueName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "My room",
        value = "The unique (within the Telnyx account scope) name of the room."
    )
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

    public PatchRoomRequest maxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
        return this;
    }

    /**
     * The maximum amount of participants allowed in a room. If new participants try to join after that limit is reached, their request will be rejected.
     * minimum: 2
     * maximum: 50
     * @return maxParticipants
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "10",
        value = "The maximum amount of participants allowed in a room. If new participants try to join after that limit is reached, their request will be rejected."
    )
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

    public PatchRoomRequest enableRecording(Boolean enableRecording) {
        this.enableRecording = enableRecording;
        return this;
    }

    /**
     * Enable or disable recording for that room.
     * @return enableRecording
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Enable or disable recording for that room."
    )
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

    public PatchRoomRequest webhookEventUrl(String webhookEventUrl) {
        this.webhookEventUrl = webhookEventUrl;
        return this;
    }

    /**
     * The URL where webhooks related to this room will be sent. Must include a scheme, such as &#39;https&#39;.
     * @return webhookEventUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://example.com",
        value = "The URL where webhooks related to this room will be sent. Must include a scheme, such as 'https'."
    )
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

    public PatchRoomRequest webhookEventFailoverUrl(
        String webhookEventFailoverUrl
    ) {
        this.webhookEventFailoverUrl = JsonNullable.<String>of(
            webhookEventFailoverUrl
        );
        return this;
    }

    /**
     * The failover URL where webhooks related to this room will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
     * @return webhookEventFailoverUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://failover.example.com",
        value = "The failover URL where webhooks related to this room will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'."
    )
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
    public void setWebhookEventFailoverUrl_JsonNullable(
        JsonNullable<String> webhookEventFailoverUrl
    ) {
        this.webhookEventFailoverUrl = webhookEventFailoverUrl;
    }

    public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
        this.webhookEventFailoverUrl = JsonNullable.<String>of(
            webhookEventFailoverUrl
        );
    }

    public PatchRoomRequest webhookTimeoutSecs(Integer webhookTimeoutSecs) {
        this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
        return this;
    }

    /**
     * Specifies how many seconds to wait before timing out a webhook.
     * minimum: 0
     * maximum: 30
     * @return webhookTimeoutSecs
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "25",
        value = "Specifies how many seconds to wait before timing out a webhook."
    )
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
    public void setWebhookTimeoutSecs_JsonNullable(
        JsonNullable<Integer> webhookTimeoutSecs
    ) {
        this.webhookTimeoutSecs = webhookTimeoutSecs;
    }

    public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
        this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
    }

    /**
     * Return true if this PatchRoomRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatchRoomRequest patchRoomRequest = (PatchRoomRequest) o;
        return (
            Objects.equals(this.uniqueName, patchRoomRequest.uniqueName) &&
            Objects.equals(
                this.maxParticipants,
                patchRoomRequest.maxParticipants
            ) &&
            Objects.equals(
                this.enableRecording,
                patchRoomRequest.enableRecording
            ) &&
            Objects.equals(
                this.webhookEventUrl,
                patchRoomRequest.webhookEventUrl
            ) &&
            equalsNullable(
                this.webhookEventFailoverUrl,
                patchRoomRequest.webhookEventFailoverUrl
            ) &&
            equalsNullable(
                this.webhookTimeoutSecs,
                patchRoomRequest.webhookTimeoutSecs
            )
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
        return Objects.hash(
            uniqueName,
            maxParticipants,
            enableRecording,
            webhookEventUrl,
            hashCodeNullable(webhookEventFailoverUrl),
            hashCodeNullable(webhookTimeoutSecs)
        );
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
        sb.append("class PatchRoomRequest {\n");
        sb
            .append("    uniqueName: ")
            .append(toIndentedString(uniqueName))
            .append("\n");
        sb
            .append("    maxParticipants: ")
            .append(toIndentedString(maxParticipants))
            .append("\n");
        sb
            .append("    enableRecording: ")
            .append(toIndentedString(enableRecording))
            .append("\n");
        sb
            .append("    webhookEventUrl: ")
            .append(toIndentedString(webhookEventUrl))
            .append("\n");
        sb
            .append("    webhookEventFailoverUrl: ")
            .append(toIndentedString(webhookEventFailoverUrl))
            .append("\n");
        sb
            .append("    webhookTimeoutSecs: ")
            .append(toIndentedString(webhookTimeoutSecs))
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
