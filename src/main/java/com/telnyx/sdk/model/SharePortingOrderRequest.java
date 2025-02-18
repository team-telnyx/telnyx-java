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
 * SharePortingOrderRequest
 */
@JsonPropertyOrder(
    {
        SharePortingOrderRequest.JSON_PROPERTY_EXPIRES_IN_SECONDS,
        SharePortingOrderRequest.JSON_PROPERTY_PERMISSIONS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SharePortingOrderRequest {

    public static final String JSON_PROPERTY_EXPIRES_IN_SECONDS =
        "expires_in_seconds";
    private Integer expiresInSeconds;

    /**
     * The permissions the token will have
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
    private PermissionsEnum permissions;

    public SharePortingOrderRequest() {}

    public SharePortingOrderRequest expiresInSeconds(Integer expiresInSeconds) {
        this.expiresInSeconds = expiresInSeconds;
        return this;
    }

    /**
     * The number of seconds the token will be valid for
     * minimum: 1
     * maximum: 172800
     * @return expiresInSeconds
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The number of seconds the token will be valid for"
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

    public SharePortingOrderRequest permissions(PermissionsEnum permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permissions the token will have
     * @return permissions
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The permissions the token will have")
    @JsonProperty(JSON_PROPERTY_PERMISSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PermissionsEnum getPermissions() {
        return permissions;
    }

    @JsonProperty(JSON_PROPERTY_PERMISSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPermissions(PermissionsEnum permissions) {
        this.permissions = permissions;
    }

    /**
     * Return true if this SharePortingOrder_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SharePortingOrderRequest sharePortingOrderRequest =
            (SharePortingOrderRequest) o;
        return (
            Objects.equals(
                this.expiresInSeconds,
                sharePortingOrderRequest.expiresInSeconds
            ) &&
            Objects.equals(
                this.permissions,
                sharePortingOrderRequest.permissions
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiresInSeconds, permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SharePortingOrderRequest {\n");
        sb
            .append("    expiresInSeconds: ")
            .append(toIndentedString(expiresInSeconds))
            .append("\n");
        sb
            .append("    permissions: ")
            .append(toIndentedString(permissions))
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
