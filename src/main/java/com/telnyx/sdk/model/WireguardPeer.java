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
 * WireguardPeer
 */
@JsonPropertyOrder(
    {
        WireguardPeer.JSON_PROPERTY_ID,
        WireguardPeer.JSON_PROPERTY_RECORD_TYPE,
        WireguardPeer.JSON_PROPERTY_CREATED_AT,
        WireguardPeer.JSON_PROPERTY_UPDATED_AT,
        WireguardPeer.JSON_PROPERTY_PUBLIC_KEY,
        WireguardPeer.JSON_PROPERTY_LAST_SEEN,
        WireguardPeer.JSON_PROPERTY_WIREGUARD_INTERFACE_ID,
        WireguardPeer.JSON_PROPERTY_PRIVATE_KEY,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class WireguardPeer {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public static final String JSON_PROPERTY_PUBLIC_KEY = "public_key";
    private String publicKey;

    public static final String JSON_PROPERTY_LAST_SEEN = "last_seen";
    private String lastSeen;

    public static final String JSON_PROPERTY_WIREGUARD_INTERFACE_ID =
        "wireguard_interface_id";
    private UUID wireguardInterfaceId;

    public static final String JSON_PROPERTY_PRIVATE_KEY = "private_key";
    private String privateKey;

    public WireguardPeer() {}

    @JsonCreator
    public WireguardPeer(
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt,
        @JsonProperty(JSON_PROPERTY_LAST_SEEN) String lastSeen,
        @JsonProperty(JSON_PROPERTY_PRIVATE_KEY) String privateKey
    ) {
        this();
        this.id = id;
        this.recordType = recordType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastSeen = lastSeen;
        this.privateKey = privateKey;
    }

    /**
     * Identifies the resource.
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "Identifies the resource."
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "wireguard_peer",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     * @return createdAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was created."
    )
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     * @return updatedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    public WireguardPeer publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * The WireGuard &#x60;PublicKey&#x60;.&lt;br /&gt;&lt;br /&gt;If you do not provide a Public Key, a new Public and Private key pair will be generated for you.
     * @return publicKey
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=",
        value = "The WireGuard `PublicKey`.<br /><br />If you do not provide a Public Key, a new Public and Private key pair will be generated for you."
    )
    @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPublicKey() {
        return publicKey;
    }

    @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * ISO 8601 formatted date-time indicating when peer sent traffic last time.
     * @return lastSeen
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when peer sent traffic last time."
    )
    @JsonProperty(JSON_PROPERTY_LAST_SEEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLastSeen() {
        return lastSeen;
    }

    public WireguardPeer wireguardInterfaceId(UUID wireguardInterfaceId) {
        this.wireguardInterfaceId = wireguardInterfaceId;
        return this;
    }

    /**
     * The id of the wireguard interface associated with the peer.
     * @return wireguardInterfaceId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58",
        value = "The id of the wireguard interface associated with the peer."
    )
    @JsonProperty(JSON_PROPERTY_WIREGUARD_INTERFACE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getWireguardInterfaceId() {
        return wireguardInterfaceId;
    }

    @JsonProperty(JSON_PROPERTY_WIREGUARD_INTERFACE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWireguardInterfaceId(UUID wireguardInterfaceId) {
        this.wireguardInterfaceId = wireguardInterfaceId;
    }

    /**
     * Your WireGuard &#x60;Interface.PrivateKey&#x60;.&lt;br /&gt;&lt;br /&gt;This attribute is only ever utlised if, on POST, you do NOT provide your own &#x60;public_key&#x60;. In which case, a new Public and Private key pair will be generated for you. When your &#x60;private_key&#x60; is returned, you must save this immediately as we do not save it within Telnyx. If you lose your Private Key, it can not be recovered.
     * @return privateKey
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=",
        value = "Your WireGuard `Interface.PrivateKey`.<br /><br />This attribute is only ever utlised if, on POST, you do NOT provide your own `public_key`. In which case, a new Public and Private key pair will be generated for you. When your `private_key` is returned, you must save this immediately as we do not save it within Telnyx. If you lose your Private Key, it can not be recovered."
    )
    @JsonProperty(JSON_PROPERTY_PRIVATE_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * Return true if this WireguardPeer object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WireguardPeer wireguardPeer = (WireguardPeer) o;
        return (
            Objects.equals(this.id, wireguardPeer.id) &&
            Objects.equals(this.recordType, wireguardPeer.recordType) &&
            Objects.equals(this.createdAt, wireguardPeer.createdAt) &&
            Objects.equals(this.updatedAt, wireguardPeer.updatedAt) &&
            Objects.equals(this.publicKey, wireguardPeer.publicKey) &&
            Objects.equals(this.lastSeen, wireguardPeer.lastSeen) &&
            Objects.equals(
                this.wireguardInterfaceId,
                wireguardPeer.wireguardInterfaceId
            ) &&
            Objects.equals(this.privateKey, wireguardPeer.privateKey)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            recordType,
            createdAt,
            updatedAt,
            publicKey,
            lastSeen,
            wireguardInterfaceId,
            privateKey
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WireguardPeer {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    createdAt: ")
            .append(toIndentedString(createdAt))
            .append("\n");
        sb
            .append("    updatedAt: ")
            .append(toIndentedString(updatedAt))
            .append("\n");
        sb
            .append("    publicKey: ")
            .append(toIndentedString(publicKey))
            .append("\n");
        sb
            .append("    lastSeen: ")
            .append(toIndentedString(lastSeen))
            .append("\n");
        sb
            .append("    wireguardInterfaceId: ")
            .append(toIndentedString(wireguardInterfaceId))
            .append("\n");
        sb
            .append("    privateKey: ")
            .append(toIndentedString(privateKey))
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
