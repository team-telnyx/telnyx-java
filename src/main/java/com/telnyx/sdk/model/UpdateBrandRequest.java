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
import com.telnyx.sdk.model.AltBusinessIdType;
import com.telnyx.sdk.model.EntityType;
import com.telnyx.sdk.model.StockExchange;
import com.telnyx.sdk.model.Vertical;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateBrandRequest
 */
@JsonPropertyOrder(
    {
        UpdateBrandRequest.JSON_PROPERTY_ENTITY_TYPE,
        UpdateBrandRequest.JSON_PROPERTY_DISPLAY_NAME,
        UpdateBrandRequest.JSON_PROPERTY_COMPANY_NAME,
        UpdateBrandRequest.JSON_PROPERTY_EIN,
        UpdateBrandRequest.JSON_PROPERTY_PHONE,
        UpdateBrandRequest.JSON_PROPERTY_STREET,
        UpdateBrandRequest.JSON_PROPERTY_CITY,
        UpdateBrandRequest.JSON_PROPERTY_STATE,
        UpdateBrandRequest.JSON_PROPERTY_POSTAL_CODE,
        UpdateBrandRequest.JSON_PROPERTY_COUNTRY,
        UpdateBrandRequest.JSON_PROPERTY_EMAIL,
        UpdateBrandRequest.JSON_PROPERTY_STOCK_SYMBOL,
        UpdateBrandRequest.JSON_PROPERTY_STOCK_EXCHANGE,
        UpdateBrandRequest.JSON_PROPERTY_IP_ADDRESS,
        UpdateBrandRequest.JSON_PROPERTY_WEBSITE,
        UpdateBrandRequest.JSON_PROPERTY_VERTICAL,
        UpdateBrandRequest.JSON_PROPERTY_ALT_BUSINESS_ID,
        UpdateBrandRequest.JSON_PROPERTY_ALT_BUSINESS_ID_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class UpdateBrandRequest {

    public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
    private EntityType entityType;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
    private String companyName;

    public static final String JSON_PROPERTY_EIN = "ein";
    private String ein;

    public static final String JSON_PROPERTY_PHONE = "phone";
    private String phone;

    public static final String JSON_PROPERTY_STREET = "street";
    private String street;

    public static final String JSON_PROPERTY_CITY = "city";
    private String city;

    public static final String JSON_PROPERTY_STATE = "state";
    private String state;

    public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
    private String postalCode;

    public static final String JSON_PROPERTY_COUNTRY = "country";
    private String country;

    public static final String JSON_PROPERTY_EMAIL = "email";
    private String email;

    public static final String JSON_PROPERTY_STOCK_SYMBOL = "stockSymbol";
    private String stockSymbol;

    public static final String JSON_PROPERTY_STOCK_EXCHANGE = "stockExchange";
    private StockExchange stockExchange;

    public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
    private String ipAddress;

    public static final String JSON_PROPERTY_WEBSITE = "website";
    private String website;

    public static final String JSON_PROPERTY_VERTICAL = "vertical";
    private Vertical vertical;

    public static final String JSON_PROPERTY_ALT_BUSINESS_ID = "altBusinessId";
    private String altBusinessId;

    public static final String JSON_PROPERTY_ALT_BUSINESS_ID_TYPE =
        "altBusinessIdType";
    private AltBusinessIdType altBusinessIdType;

    public UpdateBrandRequest() {}

    public UpdateBrandRequest entityType(EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     * @return entityType
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public EntityType getEntityType() {
        return entityType;
    }

    @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public UpdateBrandRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display or marketing name of the brand.
     * @return displayName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Example Company Updated",
        required = true,
        value = "Display or marketing name of the brand."
    )
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UpdateBrandRequest companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * (Required for Non-profit/private/public) Legal company name.
     * @return companyName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Example Company Inc.",
        value = "(Required for Non-profit/private/public) Legal company name."
    )
    @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public UpdateBrandRequest ein(String ein) {
        this.ein = ein;
        return this;
    }

    /**
     * (Required for Non-profit/private/public) Government assigned corporate tax ID. EIN is 9-digits in U.S. The only entity type which does not require an EIN is a Sole Proprietor.
     * @return ein
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "142536893",
        value = "(Required for Non-profit/private/public) Government assigned corporate tax ID. EIN is 9-digits in U.S. The only entity type which does not require an EIN is a Sole Proprietor."
    )
    @JsonProperty(JSON_PROPERTY_EIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEin() {
        return ein;
    }

    @JsonProperty(JSON_PROPERTY_EIN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEin(String ein) {
        this.ein = ein;
    }

    public UpdateBrandRequest phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Valid phone number in e.164 international format.
     * @return phone
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+13259390512",
        value = "Valid phone number in e.164 international format."
    )
    @JsonProperty(JSON_PROPERTY_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhone() {
        return phone;
    }

    @JsonProperty(JSON_PROPERTY_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UpdateBrandRequest street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Street number and name.
     * @return street
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "123 Example St.",
        value = "Street number and name."
    )
    @JsonProperty(JSON_PROPERTY_STREET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStreet() {
        return street;
    }

    @JsonProperty(JSON_PROPERTY_STREET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStreet(String street) {
        this.street = street;
    }

    public UpdateBrandRequest city(String city) {
        this.city = city;
        return this;
    }

    /**
     * City name
     * @return city
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "San Francisco", value = "City name")
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

    public UpdateBrandRequest state(String state) {
        this.state = state;
        return this;
    }

    /**
     * State. Must be 2 letters code for United States.
     * @return state
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "CA",
        value = "State. Must be 2 letters code for United States."
    )
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

    public UpdateBrandRequest postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Postal codes. Use 5 digit zipcode for United States
     * @return postalCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "94016",
        value = "Postal codes. Use 5 digit zipcode for United States"
    )
    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public UpdateBrandRequest country(String country) {
        this.country = country;
        return this;
    }

    /**
     * ISO2 2 characters country code. Example: US - United States
     * @return country
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "US",
        required = true,
        value = "ISO2 2 characters country code. Example: US - United States"
    )
    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCountry() {
        return country;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCountry(String country) {
        this.country = country;
    }

    public UpdateBrandRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Valid email address of brand support contact.
     * @return email
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "examplename@examplecompanyupdated.com",
        required = true,
        value = "Valid email address of brand support contact."
    )
    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getEmail() {
        return email;
    }

    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEmail(String email) {
        this.email = email;
    }

    public UpdateBrandRequest stockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
        return this;
    }

    /**
     * (Required for public company) stock symbol.
     * @return stockSymbol
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "EXCOUP",
        value = "(Required for public company) stock symbol."
    )
    @JsonProperty(JSON_PROPERTY_STOCK_SYMBOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStockSymbol() {
        return stockSymbol;
    }

    @JsonProperty(JSON_PROPERTY_STOCK_SYMBOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public UpdateBrandRequest stockExchange(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
        return this;
    }

    /**
     * Get stockExchange
     * @return stockExchange
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STOCK_EXCHANGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StockExchange getStockExchange() {
        return stockExchange;
    }

    @JsonProperty(JSON_PROPERTY_STOCK_EXCHANGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStockExchange(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
    }

    public UpdateBrandRequest ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IP address of the browser requesting to create brand identity.
     * @return ipAddress
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "IP address of the browser requesting to create brand identity."
    )
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public UpdateBrandRequest website(String website) {
        this.website = website;
        return this;
    }

    /**
     * Brand website URL.
     * @return website
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "www.examplecompanyupdated.com",
        value = "Brand website URL."
    )
    @JsonProperty(JSON_PROPERTY_WEBSITE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebsite() {
        return website;
    }

    @JsonProperty(JSON_PROPERTY_WEBSITE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebsite(String website) {
        this.website = website;
    }

    public UpdateBrandRequest vertical(Vertical vertical) {
        this.vertical = vertical;
        return this;
    }

    /**
     * Get vertical
     * @return vertical
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_VERTICAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Vertical getVertical() {
        return vertical;
    }

    @JsonProperty(JSON_PROPERTY_VERTICAL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVertical(Vertical vertical) {
        this.vertical = vertical;
    }

    public UpdateBrandRequest altBusinessId(String altBusinessId) {
        this.altBusinessId = altBusinessId;
        return this;
    }

    /**
     * Alternate business identifier such as DUNS, LEI, or GIIN
     * @return altBusinessId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Alternate business identifier such as DUNS, LEI, or GIIN"
    )
    @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAltBusinessId() {
        return altBusinessId;
    }

    @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAltBusinessId(String altBusinessId) {
        this.altBusinessId = altBusinessId;
    }

    public UpdateBrandRequest altBusinessIdType(
        AltBusinessIdType altBusinessIdType
    ) {
        this.altBusinessIdType = altBusinessIdType;
        return this;
    }

    /**
     * Get altBusinessIdType
     * @return altBusinessIdType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AltBusinessIdType getAltBusinessIdType() {
        return altBusinessIdType;
    }

    @JsonProperty(JSON_PROPERTY_ALT_BUSINESS_ID_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAltBusinessIdType(AltBusinessIdType altBusinessIdType) {
        this.altBusinessIdType = altBusinessIdType;
    }

    /**
     * Return true if this UpdateBrandRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBrandRequest updateBrandRequest = (UpdateBrandRequest) o;
        return (
            Objects.equals(this.entityType, updateBrandRequest.entityType) &&
            Objects.equals(this.displayName, updateBrandRequest.displayName) &&
            Objects.equals(this.companyName, updateBrandRequest.companyName) &&
            Objects.equals(this.ein, updateBrandRequest.ein) &&
            Objects.equals(this.phone, updateBrandRequest.phone) &&
            Objects.equals(this.street, updateBrandRequest.street) &&
            Objects.equals(this.city, updateBrandRequest.city) &&
            Objects.equals(this.state, updateBrandRequest.state) &&
            Objects.equals(this.postalCode, updateBrandRequest.postalCode) &&
            Objects.equals(this.country, updateBrandRequest.country) &&
            Objects.equals(this.email, updateBrandRequest.email) &&
            Objects.equals(this.stockSymbol, updateBrandRequest.stockSymbol) &&
            Objects.equals(
                this.stockExchange,
                updateBrandRequest.stockExchange
            ) &&
            Objects.equals(this.ipAddress, updateBrandRequest.ipAddress) &&
            Objects.equals(this.website, updateBrandRequest.website) &&
            Objects.equals(this.vertical, updateBrandRequest.vertical) &&
            Objects.equals(
                this.altBusinessId,
                updateBrandRequest.altBusinessId
            ) &&
            Objects.equals(
                this.altBusinessIdType,
                updateBrandRequest.altBusinessIdType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            entityType,
            displayName,
            companyName,
            ein,
            phone,
            street,
            city,
            state,
            postalCode,
            country,
            email,
            stockSymbol,
            stockExchange,
            ipAddress,
            website,
            vertical,
            altBusinessId,
            altBusinessIdType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBrandRequest {\n");
        sb
            .append("    entityType: ")
            .append(toIndentedString(entityType))
            .append("\n");
        sb
            .append("    displayName: ")
            .append(toIndentedString(displayName))
            .append("\n");
        sb
            .append("    companyName: ")
            .append(toIndentedString(companyName))
            .append("\n");
        sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb
            .append("    postalCode: ")
            .append(toIndentedString(postalCode))
            .append("\n");
        sb
            .append("    country: ")
            .append(toIndentedString(country))
            .append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb
            .append("    stockSymbol: ")
            .append(toIndentedString(stockSymbol))
            .append("\n");
        sb
            .append("    stockExchange: ")
            .append(toIndentedString(stockExchange))
            .append("\n");
        sb
            .append("    ipAddress: ")
            .append(toIndentedString(ipAddress))
            .append("\n");
        sb
            .append("    website: ")
            .append(toIndentedString(website))
            .append("\n");
        sb
            .append("    vertical: ")
            .append(toIndentedString(vertical))
            .append("\n");
        sb
            .append("    altBusinessId: ")
            .append(toIndentedString(altBusinessId))
            .append("\n");
        sb
            .append("    altBusinessIdType: ")
            .append(toIndentedString(altBusinessIdType))
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
