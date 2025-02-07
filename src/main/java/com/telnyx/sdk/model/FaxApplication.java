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
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.ExternalConnectionOutbound;
import com.telnyx.sdk.model.FaxApplicationInbound;
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
 * FaxApplication
 */
@JsonPropertyOrder(
    {
        FaxApplication.JSON_PROPERTY_ID,
        FaxApplication.JSON_PROPERTY_RECORD_TYPE,
        FaxApplication.JSON_PROPERTY_APPLICATION_NAME,
        FaxApplication.JSON_PROPERTY_ACTIVE,
        FaxApplication.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
        FaxApplication.JSON_PROPERTY_WEBHOOK_EVENT_URL,
        FaxApplication.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
        FaxApplication.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
        FaxApplication.JSON_PROPERTY_INBOUND,
        FaxApplication.JSON_PROPERTY_OUTBOUND,
        FaxApplication.JSON_PROPERTY_CREATED_AT,
        FaxApplication.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class FaxApplication {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_APPLICATION_NAME =
        "application_name";
    private String applicationName;

    public static final String JSON_PROPERTY_ACTIVE = "active";
    private Boolean active = true;

    public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE =
        "anchorsite_override";
    private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

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

    public static final String JSON_PROPERTY_INBOUND = "inbound";
    private FaxApplicationInbound inbound;

    public static final String JSON_PROPERTY_OUTBOUND = "outbound";
    private ExternalConnectionOutbound outbound;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public FaxApplication() {}

    public FaxApplication id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies the resource.
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "1293384261075731499",
        value = "Uniquely identifies the resource."
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

    public FaxApplication recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "fax_application",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public FaxApplication applicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * A user-assigned name to help manage the application.
     * @return applicationName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "call-router",
        value = "A user-assigned name to help manage the application."
    )
    @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public FaxApplication active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Specifies whether the connection can be used.
     * @return active
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Specifies whether the connection can be used."
    )
    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getActive() {
        return active;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActive(Boolean active) {
        this.active = active;
    }

    public FaxApplication anchorsiteOverride(
        AnchorsiteOverride anchorsiteOverride
    ) {
        this.anchorsiteOverride = anchorsiteOverride;
        return this;
    }

    /**
     * Get anchorsiteOverride
     * @return anchorsiteOverride
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AnchorsiteOverride getAnchorsiteOverride() {
        return anchorsiteOverride;
    }

    @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAnchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
        this.anchorsiteOverride = anchorsiteOverride;
    }

    public FaxApplication webhookEventUrl(String webhookEventUrl) {
        this.webhookEventUrl = webhookEventUrl;
        return this;
    }

    /**
     * The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;.
     * @return webhookEventUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://example.com",
        value = "The URL where webhooks related to this connection will be sent. Must include a scheme, such as 'https'."
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

    public FaxApplication webhookEventFailoverUrl(
        String webhookEventFailoverUrl
    ) {
        this.webhookEventFailoverUrl = JsonNullable.<String>of(
            webhookEventFailoverUrl
        );
        return this;
    }

    /**
     * The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
     * @return webhookEventFailoverUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://failover.example.com",
        value = "The failover URL where webhooks related to this connection will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'."
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

    public FaxApplication webhookTimeoutSecs(Integer webhookTimeoutSecs) {
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

    public FaxApplication inbound(FaxApplicationInbound inbound) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     * @return inbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FaxApplicationInbound getInbound() {
        return inbound;
    }

    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInbound(FaxApplicationInbound inbound) {
        this.inbound = inbound;
    }

    public FaxApplication outbound(ExternalConnectionOutbound outbound) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Get outbound
     * @return outbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ExternalConnectionOutbound getOutbound() {
        return outbound;
    }

    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutbound(ExternalConnectionOutbound outbound) {
        this.outbound = outbound;
    }

    public FaxApplication createdAt(String createdAt) {
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

    public FaxApplication updatedAt(String updatedAt) {
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
     * Return true if this FaxApplication object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaxApplication faxApplication = (FaxApplication) o;
        return (
            Objects.equals(this.id, faxApplication.id) &&
            Objects.equals(this.recordType, faxApplication.recordType) &&
            Objects.equals(
                this.applicationName,
                faxApplication.applicationName
            ) &&
            Objects.equals(this.active, faxApplication.active) &&
            Objects.equals(
                this.anchorsiteOverride,
                faxApplication.anchorsiteOverride
            ) &&
            Objects.equals(
                this.webhookEventUrl,
                faxApplication.webhookEventUrl
            ) &&
            equalsNullable(
                this.webhookEventFailoverUrl,
                faxApplication.webhookEventFailoverUrl
            ) &&
            equalsNullable(
                this.webhookTimeoutSecs,
                faxApplication.webhookTimeoutSecs
            ) &&
            Objects.equals(this.inbound, faxApplication.inbound) &&
            Objects.equals(this.outbound, faxApplication.outbound) &&
            Objects.equals(this.createdAt, faxApplication.createdAt) &&
            Objects.equals(this.updatedAt, faxApplication.updatedAt)
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
            id,
            recordType,
            applicationName,
            active,
            anchorsiteOverride,
            webhookEventUrl,
            hashCodeNullable(webhookEventFailoverUrl),
            hashCodeNullable(webhookTimeoutSecs),
            inbound,
            outbound,
            createdAt,
            updatedAt
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
        sb.append("class FaxApplication {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    applicationName: ")
            .append(toIndentedString(applicationName))
            .append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb
            .append("    anchorsiteOverride: ")
            .append(toIndentedString(anchorsiteOverride))
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
        sb
            .append("    inbound: ")
            .append(toIndentedString(inbound))
            .append("\n");
        sb
            .append("    outbound: ")
            .append(toIndentedString(outbound))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
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
