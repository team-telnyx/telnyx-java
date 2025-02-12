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
import com.telnyx.sdk.model.ExternalConnectionInbound;
import com.telnyx.sdk.model.ExternalConnectionOutbound;
import com.telnyx.sdk.model.ExternalSipConnection;
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
 * ExternalConnection
 */
@JsonPropertyOrder(
    {
        ExternalConnection.JSON_PROPERTY_ID,
        ExternalConnection.JSON_PROPERTY_RECORD_TYPE,
        ExternalConnection.JSON_PROPERTY_ACTIVE,
        ExternalConnection.JSON_PROPERTY_CREDENTIAL_ACTIVE,
        ExternalConnection.JSON_PROPERTY_EXTERNAL_SIP_CONNECTION,
        ExternalConnection.JSON_PROPERTY_WEBHOOK_EVENT_URL,
        ExternalConnection.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
        ExternalConnection.JSON_PROPERTY_WEBHOOK_API_VERSION,
        ExternalConnection.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
        ExternalConnection.JSON_PROPERTY_INBOUND,
        ExternalConnection.JSON_PROPERTY_OUTBOUND,
        ExternalConnection.JSON_PROPERTY_CREATED_AT,
        ExternalConnection.JSON_PROPERTY_UPDATED_AT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ExternalConnection {

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_ACTIVE = "active";
    private Boolean active = true;

    public static final String JSON_PROPERTY_CREDENTIAL_ACTIVE =
        "credential_active";
    private Boolean credentialActive = false;

    public static final String JSON_PROPERTY_EXTERNAL_SIP_CONNECTION =
        "external_sip_connection";
    private ExternalSipConnection externalSipConnection =
        ExternalSipConnection.ZOOM;

    public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL =
        "webhook_event_url";
    private String webhookEventUrl;

    public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL =
        "webhook_event_failover_url";
    private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<
            String
        >of("");

    /**
     * Determines which webhook format will be used, Telnyx API v1 or v2.
     */
    public enum WebhookApiVersionEnum {
        _1(String.valueOf("1")),

        _2(String.valueOf("2"));

        private String value;

        WebhookApiVersionEnum(String value) {
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
        public static WebhookApiVersionEnum fromValue(String value) {
            for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_WEBHOOK_API_VERSION =
        "webhook_api_version";
    private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._1;

    public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS =
        "webhook_timeout_secs";
    private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<
            Integer
        >undefined();

    public static final String JSON_PROPERTY_INBOUND = "inbound";
    private ExternalConnectionInbound inbound;

    public static final String JSON_PROPERTY_OUTBOUND = "outbound";
    private ExternalConnectionOutbound outbound;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public ExternalConnection() {}

    public ExternalConnection id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies the resource.
     * @return id
     **/
    @javax.annotation.Nullable
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

    public ExternalConnection recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "external_connection",
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

    public ExternalConnection active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Specifies whether the connection can be used.
     * @return active
     **/
    @javax.annotation.Nullable
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

    public ExternalConnection credentialActive(Boolean credentialActive) {
        this.credentialActive = credentialActive;
        return this;
    }

    /**
     * If the credential associated with this service is active.
     * @return credentialActive
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "If the credential associated with this service is active."
    )
    @JsonProperty(JSON_PROPERTY_CREDENTIAL_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCredentialActive() {
        return credentialActive;
    }

    @JsonProperty(JSON_PROPERTY_CREDENTIAL_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCredentialActive(Boolean credentialActive) {
        this.credentialActive = credentialActive;
    }

    public ExternalConnection externalSipConnection(
        ExternalSipConnection externalSipConnection
    ) {
        this.externalSipConnection = externalSipConnection;
        return this;
    }

    /**
     * Get externalSipConnection
     * @return externalSipConnection
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EXTERNAL_SIP_CONNECTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ExternalSipConnection getExternalSipConnection() {
        return externalSipConnection;
    }

    @JsonProperty(JSON_PROPERTY_EXTERNAL_SIP_CONNECTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExternalSipConnection(
        ExternalSipConnection externalSipConnection
    ) {
        this.externalSipConnection = externalSipConnection;
    }

    public ExternalConnection webhookEventUrl(String webhookEventUrl) {
        this.webhookEventUrl = webhookEventUrl;
        return this;
    }

    /**
     * The URL where webhooks related to this connection will be sent. Must include a scheme, such as &#39;https&#39;.
     * @return webhookEventUrl
     **/
    @javax.annotation.Nullable
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

    public ExternalConnection webhookEventFailoverUrl(
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
    @javax.annotation.Nullable
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

    public ExternalConnection webhookApiVersion(
        WebhookApiVersionEnum webhookApiVersion
    ) {
        this.webhookApiVersion = webhookApiVersion;
        return this;
    }

    /**
     * Determines which webhook format will be used, Telnyx API v1 or v2.
     * @return webhookApiVersion
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "1",
        value = "Determines which webhook format will be used, Telnyx API v1 or v2."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WebhookApiVersionEnum getWebhookApiVersion() {
        return webhookApiVersion;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
        this.webhookApiVersion = webhookApiVersion;
    }

    public ExternalConnection webhookTimeoutSecs(Integer webhookTimeoutSecs) {
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

    public ExternalConnection inbound(ExternalConnectionInbound inbound) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     * @return inbound
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ExternalConnectionInbound getInbound() {
        return inbound;
    }

    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInbound(ExternalConnectionInbound inbound) {
        this.inbound = inbound;
    }

    public ExternalConnection outbound(ExternalConnectionOutbound outbound) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Get outbound
     * @return outbound
     **/
    @javax.annotation.Nullable
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

    public ExternalConnection createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @javax.annotation.Nullable
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

    public ExternalConnection updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     * @return updatedAt
     **/
    @javax.annotation.Nullable
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
     * Return true if this ExternalConnection object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalConnection externalConnection = (ExternalConnection) o;
        return (
            Objects.equals(this.id, externalConnection.id) &&
            Objects.equals(this.recordType, externalConnection.recordType) &&
            Objects.equals(this.active, externalConnection.active) &&
            Objects.equals(
                this.credentialActive,
                externalConnection.credentialActive
            ) &&
            Objects.equals(
                this.externalSipConnection,
                externalConnection.externalSipConnection
            ) &&
            Objects.equals(
                this.webhookEventUrl,
                externalConnection.webhookEventUrl
            ) &&
            equalsNullable(
                this.webhookEventFailoverUrl,
                externalConnection.webhookEventFailoverUrl
            ) &&
            Objects.equals(
                this.webhookApiVersion,
                externalConnection.webhookApiVersion
            ) &&
            equalsNullable(
                this.webhookTimeoutSecs,
                externalConnection.webhookTimeoutSecs
            ) &&
            Objects.equals(this.inbound, externalConnection.inbound) &&
            Objects.equals(this.outbound, externalConnection.outbound) &&
            Objects.equals(this.createdAt, externalConnection.createdAt) &&
            Objects.equals(this.updatedAt, externalConnection.updatedAt)
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
            active,
            credentialActive,
            externalSipConnection,
            webhookEventUrl,
            hashCodeNullable(webhookEventFailoverUrl),
            webhookApiVersion,
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
        sb.append("class ExternalConnection {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb
            .append("    credentialActive: ")
            .append(toIndentedString(credentialActive))
            .append("\n");
        sb
            .append("    externalSipConnection: ")
            .append(toIndentedString(externalSipConnection))
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
            .append("    webhookApiVersion: ")
            .append(toIndentedString(webhookApiVersion))
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
