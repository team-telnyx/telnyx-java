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
import com.telnyx.sdk.model.CountryCoverageLocal;
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
 * CountryCoverage
 */
@JsonPropertyOrder(
    {
        CountryCoverage.JSON_PROPERTY_CODE,
        CountryCoverage.JSON_PROPERTY_NUMBERS,
        CountryCoverage.JSON_PROPERTY_FEATURES,
        CountryCoverage.JSON_PROPERTY_PHONE_NUMBER_TYPE,
        CountryCoverage.JSON_PROPERTY_RESERVABLE,
        CountryCoverage.JSON_PROPERTY_QUICKSHIP,
        CountryCoverage.JSON_PROPERTY_INTERNATIONAL_SMS,
        CountryCoverage.JSON_PROPERTY_P2P,
        CountryCoverage.JSON_PROPERTY_LOCAL,
        CountryCoverage.JSON_PROPERTY_TOLL_FREE,
        CountryCoverage.JSON_PROPERTY_MOBILE,
        CountryCoverage.JSON_PROPERTY_NATIONAL,
        CountryCoverage.JSON_PROPERTY_INVENTORY_COVERAGE,
        CountryCoverage.JSON_PROPERTY_SHARED_COST,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CountryCoverage {

    public static final String JSON_PROPERTY_CODE = "code";
    private String code;

    public static final String JSON_PROPERTY_NUMBERS = "numbers";
    private Boolean numbers;

    public static final String JSON_PROPERTY_FEATURES = "features";
    private List<String> features = null;

    public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE =
        "phone_number_type";
    private List<String> phoneNumberType = null;

    public static final String JSON_PROPERTY_RESERVABLE = "reservable";
    private Boolean reservable;

    public static final String JSON_PROPERTY_QUICKSHIP = "quickship";
    private Boolean quickship;

    public static final String JSON_PROPERTY_INTERNATIONAL_SMS =
        "international_sms";
    private Boolean internationalSms;

    public static final String JSON_PROPERTY_P2P = "p2p";
    private Boolean p2p;

    public static final String JSON_PROPERTY_LOCAL = "local";
    private CountryCoverageLocal local;

    public static final String JSON_PROPERTY_TOLL_FREE = "toll_free";
    private CountryCoverageLocal tollFree;

    public static final String JSON_PROPERTY_MOBILE = "mobile";
    private Object mobile;

    public static final String JSON_PROPERTY_NATIONAL = "national";
    private Object national;

    public static final String JSON_PROPERTY_INVENTORY_COVERAGE =
        "inventory_coverage";
    private Boolean inventoryCoverage;

    public static final String JSON_PROPERTY_SHARED_COST = "shared_cost";
    private Object sharedCost;

    public CountryCoverage() {}

    public CountryCoverage code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Country ISO code
     * @return code
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Country ISO code")
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCode(String code) {
        this.code = code;
    }

    public CountryCoverage numbers(Boolean numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Get numbers
     * @return numbers
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getNumbers() {
        return numbers;
    }

    @JsonProperty(JSON_PROPERTY_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNumbers(Boolean numbers) {
        this.numbers = numbers;
    }

    public CountryCoverage features(List<String> features) {
        this.features = features;
        return this;
    }

    public CountryCoverage addfeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Set of features supported
     * @return features
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Set of features supported")
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

    public CountryCoverage phoneNumberType(List<String> phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
        return this;
    }

    public CountryCoverage addphoneNumberTypeItem(String phoneNumberTypeItem) {
        if (this.phoneNumberType == null) {
            this.phoneNumberType = new ArrayList<>();
        }
        this.phoneNumberType.add(phoneNumberTypeItem);
        return this;
    }

    /**
     * Phone number type
     * @return phoneNumberType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Phone number type")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getPhoneNumberType() {
        return phoneNumberType;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumberType(List<String> phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public CountryCoverage reservable(Boolean reservable) {
        this.reservable = reservable;
        return this;
    }

    /**
     * Supports reservable
     * @return reservable
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Supports reservable")
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

    public CountryCoverage quickship(Boolean quickship) {
        this.quickship = quickship;
        return this;
    }

    /**
     * Supports quickship
     * @return quickship
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Supports quickship")
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

    public CountryCoverage internationalSms(Boolean internationalSms) {
        this.internationalSms = internationalSms;
        return this;
    }

    /**
     * Get internationalSms
     * @return internationalSms
     **/
    @jakarta.annotation.Nullable
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

    public CountryCoverage p2p(Boolean p2p) {
        this.p2p = p2p;
        return this;
    }

    /**
     * Get p2p
     * @return p2p
     **/
    @jakarta.annotation.Nullable
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

    public CountryCoverage local(CountryCoverageLocal local) {
        this.local = local;
        return this;
    }

    /**
     * Get local
     * @return local
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LOCAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CountryCoverageLocal getLocal() {
        return local;
    }

    @JsonProperty(JSON_PROPERTY_LOCAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocal(CountryCoverageLocal local) {
        this.local = local;
    }

    public CountryCoverage tollFree(CountryCoverageLocal tollFree) {
        this.tollFree = tollFree;
        return this;
    }

    /**
     * Get tollFree
     * @return tollFree
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TOLL_FREE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CountryCoverageLocal getTollFree() {
        return tollFree;
    }

    @JsonProperty(JSON_PROPERTY_TOLL_FREE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTollFree(CountryCoverageLocal tollFree) {
        this.tollFree = tollFree;
    }

    public CountryCoverage mobile(Object mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * Get mobile
     * @return mobile
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MOBILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getMobile() {
        return mobile;
    }

    @JsonProperty(JSON_PROPERTY_MOBILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public CountryCoverage national(Object national) {
        this.national = national;
        return this;
    }

    /**
     * Get national
     * @return national
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NATIONAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getNational() {
        return national;
    }

    @JsonProperty(JSON_PROPERTY_NATIONAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNational(Object national) {
        this.national = national;
    }

    public CountryCoverage inventoryCoverage(Boolean inventoryCoverage) {
        this.inventoryCoverage = inventoryCoverage;
        return this;
    }

    /**
     * Indicates whether country can be queried with inventory coverage endpoint
     * @return inventoryCoverage
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Indicates whether country can be queried with inventory coverage endpoint"
    )
    @JsonProperty(JSON_PROPERTY_INVENTORY_COVERAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getInventoryCoverage() {
        return inventoryCoverage;
    }

    @JsonProperty(JSON_PROPERTY_INVENTORY_COVERAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInventoryCoverage(Boolean inventoryCoverage) {
        this.inventoryCoverage = inventoryCoverage;
    }

    public CountryCoverage sharedCost(Object sharedCost) {
        this.sharedCost = sharedCost;
        return this;
    }

    /**
     * Get sharedCost
     * @return sharedCost
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SHARED_COST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getSharedCost() {
        return sharedCost;
    }

    @JsonProperty(JSON_PROPERTY_SHARED_COST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSharedCost(Object sharedCost) {
        this.sharedCost = sharedCost;
    }

    /**
     * Return true if this CountryCoverage object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountryCoverage countryCoverage = (CountryCoverage) o;
        return (
            Objects.equals(this.code, countryCoverage.code) &&
            Objects.equals(this.numbers, countryCoverage.numbers) &&
            Objects.equals(this.features, countryCoverage.features) &&
            Objects.equals(
                this.phoneNumberType,
                countryCoverage.phoneNumberType
            ) &&
            Objects.equals(this.reservable, countryCoverage.reservable) &&
            Objects.equals(this.quickship, countryCoverage.quickship) &&
            Objects.equals(
                this.internationalSms,
                countryCoverage.internationalSms
            ) &&
            Objects.equals(this.p2p, countryCoverage.p2p) &&
            Objects.equals(this.local, countryCoverage.local) &&
            Objects.equals(this.tollFree, countryCoverage.tollFree) &&
            Objects.equals(this.mobile, countryCoverage.mobile) &&
            Objects.equals(this.national, countryCoverage.national) &&
            Objects.equals(
                this.inventoryCoverage,
                countryCoverage.inventoryCoverage
            ) &&
            Objects.equals(this.sharedCost, countryCoverage.sharedCost)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            numbers,
            features,
            phoneNumberType,
            reservable,
            quickship,
            internationalSms,
            p2p,
            local,
            tollFree,
            mobile,
            national,
            inventoryCoverage,
            sharedCost
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountryCoverage {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb
            .append("    numbers: ")
            .append(toIndentedString(numbers))
            .append("\n");
        sb
            .append("    features: ")
            .append(toIndentedString(features))
            .append("\n");
        sb
            .append("    phoneNumberType: ")
            .append(toIndentedString(phoneNumberType))
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
        sb.append("    local: ").append(toIndentedString(local)).append("\n");
        sb
            .append("    tollFree: ")
            .append(toIndentedString(tollFree))
            .append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb
            .append("    national: ")
            .append(toIndentedString(national))
            .append("\n");
        sb
            .append("    inventoryCoverage: ")
            .append(toIndentedString(inventoryCoverage))
            .append("\n");
        sb
            .append("    sharedCost: ")
            .append(toIndentedString(sharedCost))
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
