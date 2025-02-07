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
 * SIMCardPublicIP
 */
@JsonPropertyOrder(
    {
        SIMCardPublicIP.JSON_PROPERTY_RECORD_TYPE,
        SIMCardPublicIP.JSON_PROPERTY_REGION_CODE,
        SIMCardPublicIP.JSON_PROPERTY_SIM_CARD_ID,
        SIMCardPublicIP.JSON_PROPERTY_TYPE,
        SIMCardPublicIP.JSON_PROPERTY_IP,
        SIMCardPublicIP.JSON_PROPERTY_CREATED_AT,
        SIMCardPublicIP.JSON_PROPERTY_UPDATED_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardPublicIP {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_REGION_CODE = "region_code";
    private String regionCode;

    public static final String JSON_PROPERTY_SIM_CARD_ID = "sim_card_id";
    private UUID simCardId;

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        IPV4(String.valueOf("ipv4"));

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type = TypeEnum.IPV4;

    public static final String JSON_PROPERTY_IP = "ip";
    private String ip;

    public static final String JSON_PROPERTY_CREATED_AT = "created_at";
    private String createdAt;

    public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
    private String updatedAt;

    public SIMCardPublicIP() {}

    @JsonCreator
    public SIMCardPublicIP(
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType,
        @JsonProperty(JSON_PROPERTY_REGION_CODE) String regionCode,
        @JsonProperty(JSON_PROPERTY_TYPE) TypeEnum type,
        @JsonProperty(JSON_PROPERTY_IP) String ip,
        @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt,
        @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
    ) {
        this();
        this.recordType = recordType;
        this.regionCode = regionCode;
        this.type = type;
        this.ip = ip;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "sim_card_public_ip", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * Get regionCode
     * @return regionCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "dc2", value = "")
    @JsonProperty(JSON_PROPERTY_REGION_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRegionCode() {
        return regionCode;
    }

    public SIMCardPublicIP simCardId(UUID simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * Get simCardId
     * @return simCardId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "6b14e151-8493-4fa1-8664-1cc4e6d14158",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getSimCardId() {
        return simCardId;
    }

    @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSimCardId(UUID simCardId) {
        this.simCardId = simCardId;
    }

    /**
     * Get type
     * @return type
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "ipv4", value = "")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    /**
     * The provisioned IP address. This attribute will only be available when underlying resource status is in a \&quot;provisioned\&quot; status.
     * @return ip
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "192.168.0.0",
        value = "The provisioned IP address. This attribute will only be available when underlying resource status is in a \"provisioned\" status."
    )
    @JsonProperty(JSON_PROPERTY_IP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIp() {
        return ip;
    }

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     * @return createdAt
     **/
    @jakarta.annotation.Nullable
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
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating when the resource was updated."
    )
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Return true if this SIMCardPublicIP object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardPublicIP siMCardPublicIP = (SIMCardPublicIP) o;
        return (
            Objects.equals(this.recordType, siMCardPublicIP.recordType) &&
            Objects.equals(this.regionCode, siMCardPublicIP.regionCode) &&
            Objects.equals(this.simCardId, siMCardPublicIP.simCardId) &&
            Objects.equals(this.type, siMCardPublicIP.type) &&
            Objects.equals(this.ip, siMCardPublicIP.ip) &&
            Objects.equals(this.createdAt, siMCardPublicIP.createdAt) &&
            Objects.equals(this.updatedAt, siMCardPublicIP.updatedAt)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            regionCode,
            simCardId,
            type,
            ip,
            createdAt,
            updatedAt
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardPublicIP {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    regionCode: ")
            .append(toIndentedString(regionCode))
            .append("\n");
        sb
            .append("    simCardId: ")
            .append(toIndentedString(simCardId))
            .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
