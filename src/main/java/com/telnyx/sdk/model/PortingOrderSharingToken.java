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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * PortingOrderSharingToken
 */
@JsonPropertyOrder(
    {
        PortingOrderSharingToken.JSON_PROPERTY_ID,
        PortingOrderSharingToken.JSON_PROPERTY_PORTING_ORDER_ID,
        PortingOrderSharingToken.JSON_PROPERTY_EXPIRES_IN_SECONDS,
        PortingOrderSharingToken.JSON_PROPERTY_PERMISSIONS,
        PortingOrderSharingToken.JSON_PROPERTY_TOKEN,
        PortingOrderSharingToken.JSON_PROPERTY_EXPIRES_AT,
        PortingOrderSharingToken.JSON_PROPERTY_RECORD_TYPE,
        PortingOrderSharingToken.JSON_PROPERTY_CREATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortingOrderSharingToken {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_PORTING_ORDER_ID =
        "porting_order_id";
    private UUID portingOrderId;

    public static final String JSON_PROPERTY_EXPIRES_IN_SECONDS =
        "expires_in_seconds";
    private Integer expiresInSeconds;

    /**
     * Gets or Sets permissions
     */
    public enum PermissionsEnum {
        PORTING_ORDER_DOCUMENT_READ(
            String.valueOf("porting_order.document.read")
        ),

        PORTING_ORDER_DOCUMENT_UPDATE(
            String.valueOf("porting_order.document.update")
        );

        private String value;

        PermissionsEnum(String value) {
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
        public static PermissionsEnum fromValue(String value) {
            for (PermissionsEnum b : PermissionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
    private List<PermissionsEnum> permissions = null;

    public static final String JSON_PROPERTY_TOKEN = "token";
    private String token;

    public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
    private OffsetDateTime expiresAt;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private OffsetDateTime createdAt;

    public PortingOrderSharingToken() {}

    @JsonCreator
    public PortingOrderSharingToken(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
    ) {
        this();
        this.recordType = recordType;
    }

    public PortingOrderSharingToken id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Uniquely identifies this sharing token
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0a4b78a0-d416-4761-94f7-46c72ec56547",
        value = "Uniquely identifies this sharing token"
    )
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

    public PortingOrderSharingToken portingOrderId(UUID portingOrderId) {
        this.portingOrderId = portingOrderId;
        return this;
    }

    /**
     * Identifies the porting order resource being shared
     * @return portingOrderId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "f1486bae-f067-460c-ad43-73a92848f902",
        value = "Identifies the porting order resource being shared"
    )
    @JsonProperty(JSON_PROPERTY_PORTING_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getPortingOrderId() {
        return portingOrderId;
    }

    @JsonProperty(JSON_PROPERTY_PORTING_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPortingOrderId(UUID portingOrderId) {
        this.portingOrderId = portingOrderId;
    }

    public PortingOrderSharingToken expiresInSeconds(Integer expiresInSeconds) {
        this.expiresInSeconds = expiresInSeconds;
        return this;
    }

    /**
     * The number of seconds until the sharing token expires
     * minimum: 1
     * @return expiresInSeconds
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "3600",
        value = "The number of seconds until the sharing token expires"
    )
    @JsonProperty(JSON_PROPERTY_EXPIRES_IN_SECONDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getExpiresInSeconds() {
        return expiresInSeconds;
    }

    @JsonProperty(JSON_PROPERTY_EXPIRES_IN_SECONDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExpiresInSeconds(Integer expiresInSeconds) {
        this.expiresInSeconds = expiresInSeconds;
    }

    public PortingOrderSharingToken permissions(
        List<PermissionsEnum> permissions
    ) {
        this.permissions = permissions;
        return this;
    }

    public PortingOrderSharingToken addpermissionsItem(
        PermissionsEnum permissionsItem
    ) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * The permissions granted to the sharing token
     * @return permissions
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[\"porting_order.document.read\",\"porting_order.document.update\"]",
        value = "The permissions granted to the sharing token"
    )
    @JsonProperty(JSON_PROPERTY_PERMISSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<PermissionsEnum> getPermissions() {
        return permissions;
    }

    @JsonProperty(JSON_PROPERTY_PERMISSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPermissions(List<PermissionsEnum> permissions) {
        this.permissions = permissions;
    }

    public PortingOrderSharingToken token(String token) {
        this.token = token;
        return this;
    }

    /**
     * A signed JWT token that can be used to access the shared resource
     * @return token
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODk4OTQ2NzcsImlzdCI6MTY4OTg5MTA3NywicGVybWlzc2lvbnMiOlsicG9ydGluZ19vcmRlci5kb2N1bWVudC5yZWFkIl0sInBvcnRpbmdfb3JkZXJfaWQiOiJmZDRiODZjOC00OTdkLTRjNmQtOTYwOS1hNzg5ZTRlMTRjZmUifQ.CT0HRF6OLj7VPZ8p5Y_0S8rOL8SEUznwJJkR-YReKwc",
        value = "A signed JWT token that can be used to access the shared resource"
    )
    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getToken() {
        return token;
    }

    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setToken(String token) {
        this.token = token;
    }

    public PortingOrderSharingToken expiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the sharing token expires.
     * @return expiresAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the sharing token expires."
    )
    @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "porting_order_sharing_token",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    public PortingOrderSharingToken createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Return true if this PortingOrderSharingToken object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortingOrderSharingToken portingOrderSharingToken =
            (PortingOrderSharingToken) o;
        return (
            Objects.equals(this.id, portingOrderSharingToken.id) &&
            Objects.equals(
                this.portingOrderId,
                portingOrderSharingToken.portingOrderId
            ) &&
            Objects.equals(
                this.expiresInSeconds,
                portingOrderSharingToken.expiresInSeconds
            ) &&
            Objects.equals(
                this.permissions,
                portingOrderSharingToken.permissions
            ) &&
            Objects.equals(this.token, portingOrderSharingToken.token) &&
            Objects.equals(
                this.expiresAt,
                portingOrderSharingToken.expiresAt
            ) &&
            Objects.equals(
                this.recordType,
                portingOrderSharingToken.recordType
            ) &&
            Objects.equals(this.createdAt, portingOrderSharingToken.createdAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            portingOrderId,
            expiresInSeconds,
            permissions,
            token,
            expiresAt,
            recordType,
            createdAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortingOrderSharingToken {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    portingOrderId: ")
            .append(toIndentedString(portingOrderId))
            .append("\n");
        sb
            .append("    expiresInSeconds: ")
            .append(toIndentedString(expiresInSeconds))
            .append("\n");
        sb
            .append("    permissions: ")
            .append(toIndentedString(permissions))
            .append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb
            .append("    expiresAt: ")
            .append(toIndentedString(expiresAt))
            .append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
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
