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
 * Portability
 */
@JsonPropertyOrder(
    {
        Portability.JSON_PROPERTY_LRN,
        Portability.JSON_PROPERTY_PORTED_STATUS,
        Portability.JSON_PROPERTY_PORTED_DATE,
        Portability.JSON_PROPERTY_OCN,
        Portability.JSON_PROPERTY_LINE_TYPE,
        Portability.JSON_PROPERTY_SPID,
        Portability.JSON_PROPERTY_SPID_CARRIER_NAME,
        Portability.JSON_PROPERTY_SPID_CARRIER_TYPE,
        Portability.JSON_PROPERTY_ALTSPID,
        Portability.JSON_PROPERTY_ALTSPID_CARRIER_NAME,
        Portability.JSON_PROPERTY_ALTSPID_CARRIER_TYPE,
        Portability.JSON_PROPERTY_CITY,
        Portability.JSON_PROPERTY_STATE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class Portability {

    public static final String JSON_PROPERTY_LRN = "lrn";
    private String lrn;

    /**
     * Indicates whether or not the requested phone number has been ported
     */
    public enum PortedStatusEnum {
        Y(String.valueOf("Y")),

        N(String.valueOf("N")),

        EMPTY(String.valueOf(""));

        private String value;

        PortedStatusEnum(String value) {
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
        public static PortedStatusEnum fromValue(String value) {
            for (PortedStatusEnum b : PortedStatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_PORTED_STATUS = "ported_status";
    private PortedStatusEnum portedStatus;

    public static final String JSON_PROPERTY_PORTED_DATE = "ported_date";
    private String portedDate;

    public static final String JSON_PROPERTY_OCN = "ocn";
    private String ocn;

    public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
    private String lineType;

    public static final String JSON_PROPERTY_SPID = "spid";
    private String spid;

    public static final String JSON_PROPERTY_SPID_CARRIER_NAME =
        "spid_carrier_name";
    private String spidCarrierName;

    public static final String JSON_PROPERTY_SPID_CARRIER_TYPE =
        "spid_carrier_type";
    private String spidCarrierType;

    public static final String JSON_PROPERTY_ALTSPID = "altspid";
    private String altspid;

    public static final String JSON_PROPERTY_ALTSPID_CARRIER_NAME =
        "altspid_carrier_name";
    private String altspidCarrierName;

    public static final String JSON_PROPERTY_ALTSPID_CARRIER_TYPE =
        "altspid_carrier_type";
    private String altspidCarrierType;

    public static final String JSON_PROPERTY_CITY = "city";
    private String city;

    public static final String JSON_PROPERTY_STATE = "state";
    private String state;

    public Portability() {}

    public Portability lrn(String lrn) {
        this.lrn = lrn;
        return this;
    }

    /**
     * Local Routing Number, if assigned to the requested phone number
     * @return lrn
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2245701999",
        value = "Local Routing Number, if assigned to the requested phone number"
    )
    @JsonProperty(JSON_PROPERTY_LRN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLrn() {
        return lrn;
    }

    @JsonProperty(JSON_PROPERTY_LRN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLrn(String lrn) {
        this.lrn = lrn;
    }

    public Portability portedStatus(PortedStatusEnum portedStatus) {
        this.portedStatus = portedStatus;
        return this;
    }

    /**
     * Indicates whether or not the requested phone number has been ported
     * @return portedStatus
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Y",
        value = "Indicates whether or not the requested phone number has been ported"
    )
    @JsonProperty(JSON_PROPERTY_PORTED_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PortedStatusEnum getPortedStatus() {
        return portedStatus;
    }

    @JsonProperty(JSON_PROPERTY_PORTED_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPortedStatus(PortedStatusEnum portedStatus) {
        this.portedStatus = portedStatus;
    }

    public Portability portedDate(String portedDate) {
        this.portedDate = portedDate;
        return this;
    }

    /**
     * ISO-formatted date when the requested phone number has been ported
     * @return portedDate
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2017-10-20",
        value = "ISO-formatted date when the requested phone number has been ported"
    )
    @JsonProperty(JSON_PROPERTY_PORTED_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPortedDate() {
        return portedDate;
    }

    @JsonProperty(JSON_PROPERTY_PORTED_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPortedDate(String portedDate) {
        this.portedDate = portedDate;
    }

    public Portability ocn(String ocn) {
        this.ocn = ocn;
        return this;
    }

    /**
     * Operating Company Name (OCN) as per the Local Exchange Routing Guide (LERG) database
     * @return ocn
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "073H",
        value = "Operating Company Name (OCN) as per the Local Exchange Routing Guide (LERG) database"
    )
    @JsonProperty(JSON_PROPERTY_OCN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOcn() {
        return ocn;
    }

    @JsonProperty(JSON_PROPERTY_OCN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOcn(String ocn) {
        this.ocn = ocn;
    }

    public Portability lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    /**
     * Type of number
     * @return lineType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "voip", value = "Type of number")
    @JsonProperty(JSON_PROPERTY_LINE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLineType() {
        return lineType;
    }

    @JsonProperty(JSON_PROPERTY_LINE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public Portability spid(String spid) {
        this.spid = spid;
        return this;
    }

    /**
     * SPID (Service Provider ID)
     * @return spid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "073H", value = "SPID (Service Provider ID)")
    @JsonProperty(JSON_PROPERTY_SPID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSpid() {
        return spid;
    }

    @JsonProperty(JSON_PROPERTY_SPID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSpid(String spid) {
        this.spid = spid;
    }

    public Portability spidCarrierName(String spidCarrierName) {
        this.spidCarrierName = spidCarrierName;
        return this;
    }

    /**
     * Service provider name
     * @return spidCarrierName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "Telnyx/4", value = "Service provider name")
    @JsonProperty(JSON_PROPERTY_SPID_CARRIER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSpidCarrierName() {
        return spidCarrierName;
    }

    @JsonProperty(JSON_PROPERTY_SPID_CARRIER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSpidCarrierName(String spidCarrierName) {
        this.spidCarrierName = spidCarrierName;
    }

    public Portability spidCarrierType(String spidCarrierType) {
        this.spidCarrierType = spidCarrierType;
        return this;
    }

    /**
     * Service provider type
     * @return spidCarrierType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "3", value = "Service provider type")
    @JsonProperty(JSON_PROPERTY_SPID_CARRIER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSpidCarrierType() {
        return spidCarrierType;
    }

    @JsonProperty(JSON_PROPERTY_SPID_CARRIER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSpidCarrierType(String spidCarrierType) {
        this.spidCarrierType = spidCarrierType;
    }

    public Portability altspid(String altspid) {
        this.altspid = altspid;
        return this;
    }

    /**
     * Alternative SPID (Service Provider ID). Often used when a carrier is using a number from another carrier
     * @return altspid
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "073H",
        value = "Alternative SPID (Service Provider ID). Often used when a carrier is using a number from another carrier"
    )
    @JsonProperty(JSON_PROPERTY_ALTSPID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAltspid() {
        return altspid;
    }

    @JsonProperty(JSON_PROPERTY_ALTSPID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAltspid(String altspid) {
        this.altspid = altspid;
    }

    public Portability altspidCarrierName(String altspidCarrierName) {
        this.altspidCarrierName = altspidCarrierName;
        return this;
    }

    /**
     * Alternative service provider name
     * @return altspidCarrierName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Telnyx/4",
        value = "Alternative service provider name"
    )
    @JsonProperty(JSON_PROPERTY_ALTSPID_CARRIER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAltspidCarrierName() {
        return altspidCarrierName;
    }

    @JsonProperty(JSON_PROPERTY_ALTSPID_CARRIER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAltspidCarrierName(String altspidCarrierName) {
        this.altspidCarrierName = altspidCarrierName;
    }

    public Portability altspidCarrierType(String altspidCarrierType) {
        this.altspidCarrierType = altspidCarrierType;
        return this;
    }

    /**
     * Alternative service provider type
     * @return altspidCarrierType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "3",
        value = "Alternative service provider type"
    )
    @JsonProperty(JSON_PROPERTY_ALTSPID_CARRIER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAltspidCarrierType() {
        return altspidCarrierType;
    }

    @JsonProperty(JSON_PROPERTY_ALTSPID_CARRIER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAltspidCarrierType(String altspidCarrierType) {
        this.altspidCarrierType = altspidCarrierType;
    }

    public Portability city(String city) {
        this.city = city;
        return this;
    }

    /**
     * City name extracted from the locality in the Local Exchange Routing Guide (LERG) database
     * @return city
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "WAUKEGAN",
        value = "City name extracted from the locality in the Local Exchange Routing Guide (LERG) database"
    )
    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCity() {
        return city;
    }

    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCity(String city) {
        this.city = city;
    }

    public Portability state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "Illinois", value = "")
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Return true if this Portability object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Portability portability = (Portability) o;
        return (
            Objects.equals(this.lrn, portability.lrn) &&
            Objects.equals(this.portedStatus, portability.portedStatus) &&
            Objects.equals(this.portedDate, portability.portedDate) &&
            Objects.equals(this.ocn, portability.ocn) &&
            Objects.equals(this.lineType, portability.lineType) &&
            Objects.equals(this.spid, portability.spid) &&
            Objects.equals(this.spidCarrierName, portability.spidCarrierName) &&
            Objects.equals(this.spidCarrierType, portability.spidCarrierType) &&
            Objects.equals(this.altspid, portability.altspid) &&
            Objects.equals(
                this.altspidCarrierName,
                portability.altspidCarrierName
            ) &&
            Objects.equals(
                this.altspidCarrierType,
                portability.altspidCarrierType
            ) &&
            Objects.equals(this.city, portability.city) &&
            Objects.equals(this.state, portability.state)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            lrn,
            portedStatus,
            portedDate,
            ocn,
            lineType,
            spid,
            spidCarrierName,
            spidCarrierType,
            altspid,
            altspidCarrierName,
            altspidCarrierType,
            city,
            state
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Portability {\n");
        sb.append("    lrn: ").append(toIndentedString(lrn)).append("\n");
        sb
            .append("    portedStatus: ")
            .append(toIndentedString(portedStatus))
            .append("\n");
        sb
            .append("    portedDate: ")
            .append(toIndentedString(portedDate))
            .append("\n");
        sb.append("    ocn: ").append(toIndentedString(ocn)).append("\n");
        sb
            .append("    lineType: ")
            .append(toIndentedString(lineType))
            .append("\n");
        sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
        sb
            .append("    spidCarrierName: ")
            .append(toIndentedString(spidCarrierName))
            .append("\n");
        sb
            .append("    spidCarrierType: ")
            .append(toIndentedString(spidCarrierType))
            .append("\n");
        sb
            .append("    altspid: ")
            .append(toIndentedString(altspid))
            .append("\n");
        sb
            .append("    altspidCarrierName: ")
            .append(toIndentedString(altspidCarrierName))
            .append("\n");
        sb
            .append("    altspidCarrierType: ")
            .append(toIndentedString(altspidCarrierType))
            .append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
