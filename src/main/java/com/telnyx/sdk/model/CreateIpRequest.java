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
 * CreateIpRequest
 */
@JsonPropertyOrder(
    {
        CreateIpRequest.JSON_PROPERTY_CONNECTION_ID,
        CreateIpRequest.JSON_PROPERTY_IP_ADDRESS,
        CreateIpRequest.JSON_PROPERTY_PORT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateIpRequest {

    public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
    private String connectionId;

    public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
    private String ipAddress;

    public static final String JSON_PROPERTY_PORT = "port";
    private Integer port = 5060;

    public CreateIpRequest() {}

    public CreateIpRequest connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the IP Connection to which this IP should be attached.
     * @return connectionId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "ID of the IP Connection to which this IP should be attached."
    )
    @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getConnectionId() {
        return connectionId;
    }

    @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public CreateIpRequest ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP adddress represented by this resource.
     * @return ipAddress
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "192.168.0.0",
        required = true,
        value = "IP adddress represented by this resource."
    )
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public CreateIpRequest port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Port to use when connecting to this IP.
     * @return port
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "5060",
        value = "Port to use when connecting to this IP."
    )
    @JsonProperty(JSON_PROPERTY_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPort() {
        return port;
    }

    @JsonProperty(JSON_PROPERTY_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Return true if this CreateIpRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIpRequest createIpRequest = (CreateIpRequest) o;
        return (
            Objects.equals(this.connectionId, createIpRequest.connectionId) &&
            Objects.equals(this.ipAddress, createIpRequest.ipAddress) &&
            Objects.equals(this.port, createIpRequest.port)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, ipAddress, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIpRequest {\n");
        sb
            .append("    connectionId: ")
            .append(toIndentedString(connectionId))
            .append("\n");
        sb
            .append("    ipAddress: ")
            .append(toIndentedString(ipAddress))
            .append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
