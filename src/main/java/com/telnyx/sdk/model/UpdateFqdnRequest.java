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
 * UpdateFqdnRequest
 */
@JsonPropertyOrder(
    {
        UpdateFqdnRequest.JSON_PROPERTY_CONNECTION_ID,
        UpdateFqdnRequest.JSON_PROPERTY_FQDN,
        UpdateFqdnRequest.JSON_PROPERTY_PORT,
        UpdateFqdnRequest.JSON_PROPERTY_DNS_RECORD_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdateFqdnRequest {

    public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
    private String connectionId;

    public static final String JSON_PROPERTY_FQDN = "fqdn";
    private String fqdn;

    public static final String JSON_PROPERTY_PORT = "port";
    private JsonNullable<Integer> port = JsonNullable.<Integer>of(5060);

    public static final String JSON_PROPERTY_DNS_RECORD_TYPE =
        "dns_record_type";
    private String dnsRecordType;

    public UpdateFqdnRequest() {}

    public UpdateFqdnRequest connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * ID of the FQDN connection to which this IP should be attached.
     * @return connectionId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "ID of the FQDN connection to which this IP should be attached."
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

    public UpdateFqdnRequest fqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * FQDN represented by this resource.
     * @return fqdn
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "example.com",
        value = "FQDN represented by this resource."
    )
    @JsonProperty(JSON_PROPERTY_FQDN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFqdn() {
        return fqdn;
    }

    @JsonProperty(JSON_PROPERTY_FQDN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public UpdateFqdnRequest port(Integer port) {
        this.port = JsonNullable.<Integer>of(port);
        return this;
    }

    /**
     * Port to use when connecting to this FQDN.
     * @return port
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "5060",
        value = "Port to use when connecting to this FQDN."
    )
    @JsonIgnore
    public Integer getPort() {
        return port.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<Integer> getPort_JsonNullable() {
        return port;
    }

    @JsonProperty(JSON_PROPERTY_PORT)
    public void setPort_JsonNullable(JsonNullable<Integer> port) {
        this.port = port;
    }

    public void setPort(Integer port) {
        this.port = JsonNullable.<Integer>of(port);
    }

    public UpdateFqdnRequest dnsRecordType(String dnsRecordType) {
        this.dnsRecordType = dnsRecordType;
        return this;
    }

    /**
     * The DNS record type for the FQDN. For cases where a port is not set, the DNS record type must be &#39;srv&#39;. For cases where a port is set, the DNS record type must be &#39;a&#39;. If the DNS record type is &#39;a&#39; and a port is not specified, 5060 will be used.
     * @return dnsRecordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "a",
        value = "The DNS record type for the FQDN. For cases where a port is not set, the DNS record type must be 'srv'. For cases where a port is set, the DNS record type must be 'a'. If the DNS record type is 'a' and a port is not specified, 5060 will be used."
    )
    @JsonProperty(JSON_PROPERTY_DNS_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDnsRecordType() {
        return dnsRecordType;
    }

    @JsonProperty(JSON_PROPERTY_DNS_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDnsRecordType(String dnsRecordType) {
        this.dnsRecordType = dnsRecordType;
    }

    /**
     * Return true if this UpdateFqdnRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFqdnRequest updateFqdnRequest = (UpdateFqdnRequest) o;
        return (
            Objects.equals(this.connectionId, updateFqdnRequest.connectionId) &&
            Objects.equals(this.fqdn, updateFqdnRequest.fqdn) &&
            equalsNullable(this.port, updateFqdnRequest.port) &&
            Objects.equals(this.dnsRecordType, updateFqdnRequest.dnsRecordType)
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
            connectionId,
            fqdn,
            hashCodeNullable(port),
            dnsRecordType
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
        sb.append("class UpdateFqdnRequest {\n");
        sb
            .append("    connectionId: ")
            .append(toIndentedString(connectionId))
            .append("\n");
        sb.append("    fqdn: ").append(toIndentedString(fqdn)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb
            .append("    dnsRecordType: ")
            .append(toIndentedString(dnsRecordType))
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
