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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * CountryCoverageLocal
 */
@JsonPropertyOrder(
    {
        CountryCoverageLocal.JSON_PROPERTY_FEATURES,
        CountryCoverageLocal.JSON_PROPERTY_RESERVABLE,
        CountryCoverageLocal.JSON_PROPERTY_QUICKSHIP,
        CountryCoverageLocal.JSON_PROPERTY_INTERNATIONAL_SMS,
        CountryCoverageLocal.JSON_PROPERTY_P2P,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CountryCoverageLocal {

    public static final String JSON_PROPERTY_FEATURES = "features";
    private List<String> features = null;

    public static final String JSON_PROPERTY_RESERVABLE = "reservable";
    private Boolean reservable;

    public static final String JSON_PROPERTY_QUICKSHIP = "quickship";
    private Boolean quickship;

    public static final String JSON_PROPERTY_INTERNATIONAL_SMS =
        "international_sms";
    private Boolean internationalSms;

    public static final String JSON_PROPERTY_P2P = "p2p";
    private Boolean p2p;

    public CountryCoverageLocal() {}

    public CountryCoverageLocal features(List<String> features) {
        this.features = features;
        return this;
    }

    public CountryCoverageLocal addfeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Get features
     * @return features
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FEATURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getFeatures() {
        return features;
    }

    @JsonProperty(JSON_PROPERTY_FEATURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public CountryCoverageLocal reservable(Boolean reservable) {
        this.reservable = reservable;
        return this;
    }

    /**
     * Get reservable
     * @return reservable
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RESERVABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getReservable() {
        return reservable;
    }

    @JsonProperty(JSON_PROPERTY_RESERVABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReservable(Boolean reservable) {
        this.reservable = reservable;
    }

    public CountryCoverageLocal quickship(Boolean quickship) {
        this.quickship = quickship;
        return this;
    }

    /**
     * Get quickship
     * @return quickship
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_QUICKSHIP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getQuickship() {
        return quickship;
    }

    @JsonProperty(JSON_PROPERTY_QUICKSHIP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuickship(Boolean quickship) {
        this.quickship = quickship;
    }

    public CountryCoverageLocal internationalSms(Boolean internationalSms) {
        this.internationalSms = internationalSms;
        return this;
    }

    /**
     * Get internationalSms
     * @return internationalSms
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INTERNATIONAL_SMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getInternationalSms() {
        return internationalSms;
    }

    @JsonProperty(JSON_PROPERTY_INTERNATIONAL_SMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInternationalSms(Boolean internationalSms) {
        this.internationalSms = internationalSms;
    }

    public CountryCoverageLocal p2p(Boolean p2p) {
        this.p2p = p2p;
        return this;
    }

    /**
     * Get p2p
     * @return p2p
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_P2P)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getP2p() {
        return p2p;
    }

    @JsonProperty(JSON_PROPERTY_P2P)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setP2p(Boolean p2p) {
        this.p2p = p2p;
    }

    /**
     * Return true if this CountryCoverage_local object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountryCoverageLocal countryCoverageLocal = (CountryCoverageLocal) o;
        return (
            Objects.equals(this.features, countryCoverageLocal.features) &&
            Objects.equals(this.reservable, countryCoverageLocal.reservable) &&
            Objects.equals(this.quickship, countryCoverageLocal.quickship) &&
            Objects.equals(
                this.internationalSms,
                countryCoverageLocal.internationalSms
            ) &&
            Objects.equals(this.p2p, countryCoverageLocal.p2p)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            features,
            reservable,
            quickship,
            internationalSms,
            p2p
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountryCoverageLocal {\n");
        sb
            .append("    features: ")
            .append(toIndentedString(features))
            .append("\n");
        sb
            .append("    reservable: ")
            .append(toIndentedString(reservable))
            .append("\n");
        sb
            .append("    quickship: ")
            .append(toIndentedString(quickship))
            .append("\n");
        sb
            .append("    internationalSms: ")
            .append(toIndentedString(internationalSms))
            .append("\n");
        sb.append("    p2p: ").append(toIndentedString(p2p)).append("\n");
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
