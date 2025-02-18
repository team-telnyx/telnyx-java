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
import com.telnyx.sdk.model.EntityType;
import com.telnyx.sdk.model.StockExchange;
import com.telnyx.sdk.model.Vertical;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateBrand
 */
@JsonPropertyOrder(
    {
        CreateBrand.JSON_PROPERTY_ENTITY_TYPE,
        CreateBrand.JSON_PROPERTY_DISPLAY_NAME,
        CreateBrand.JSON_PROPERTY_COMPANY_NAME,
        CreateBrand.JSON_PROPERTY_FIRST_NAME,
        CreateBrand.JSON_PROPERTY_LAST_NAME,
        CreateBrand.JSON_PROPERTY_EIN,
        CreateBrand.JSON_PROPERTY_PHONE,
        CreateBrand.JSON_PROPERTY_STREET,
        CreateBrand.JSON_PROPERTY_CITY,
        CreateBrand.JSON_PROPERTY_STATE,
        CreateBrand.JSON_PROPERTY_POSTAL_CODE,
        CreateBrand.JSON_PROPERTY_COUNTRY,
        CreateBrand.JSON_PROPERTY_EMAIL,
        CreateBrand.JSON_PROPERTY_STOCK_SYMBOL,
        CreateBrand.JSON_PROPERTY_STOCK_EXCHANGE,
        CreateBrand.JSON_PROPERTY_IP_ADDRESS,
        CreateBrand.JSON_PROPERTY_WEBSITE,
        CreateBrand.JSON_PROPERTY_VERTICAL,
        CreateBrand.JSON_PROPERTY_IS_RESELLER,
        CreateBrand.JSON_PROPERTY_MOCK,
        CreateBrand.JSON_PROPERTY_MOBILE_PHONE,
        CreateBrand.JSON_PROPERTY_BUSINESS_CONTACT_EMAIL,
        CreateBrand.JSON_PROPERTY_WEBHOOK_U_R_L,
        CreateBrand.JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateBrand {

    public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
    private EntityType entityType;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
    private String companyName;

    public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
    private String firstName;

    public static final String JSON_PROPERTY_LAST_NAME = "lastName";
    private String lastName;

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

    public static final String JSON_PROPERTY_IS_RESELLER = "isReseller";
    private Boolean isReseller = false;

    public static final String JSON_PROPERTY_MOCK = "mock";
    private Boolean mock = false;

    public static final String JSON_PROPERTY_MOBILE_PHONE = "mobilePhone";
    private String mobilePhone;

    public static final String JSON_PROPERTY_BUSINESS_CONTACT_EMAIL =
        "businessContactEmail";
    private String businessContactEmail;

    public static final String JSON_PROPERTY_WEBHOOK_U_R_L = "webhookURL";
    private String webhookURL;

    public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L =
        "webhookFailoverURL";
    private String webhookFailoverURL;

    public CreateBrand() {}

    public CreateBrand entityType(EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Entity type behind the brand. This is the form of business establishment.
     * @return entityType
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Entity type behind the brand. This is the form of business establishment."
    )
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

    public CreateBrand displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Display name, marketing name, or DBA name of the brand.
     * @return displayName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "ABC Mobile",
        required = true,
        value = "Display name, marketing name, or DBA name of the brand."
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

    public CreateBrand companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * (Required for Non-profit/private/public) Legal company name.
     * @return companyName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "ABC Inc.",
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

    public CreateBrand firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * First name of business contact.
     * @return firstName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "John",
        value = "First name of business contact."
    )
    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CreateBrand lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Last name of business contact.
     * @return lastName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Smith",
        value = "Last name of business contact."
    )
    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLastName() {
        return lastName;
    }

    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CreateBrand ein(String ein) {
        this.ein = ein;
        return this;
    }

    /**
     * (Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S.
     * @return ein
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "111111111",
        value = "(Required for Non-profit) Government assigned corporate tax ID. EIN is 9-digits in U.S."
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

    public CreateBrand phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Valid phone number in e.164 international format.
     * @return phone
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+12024567890",
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

    public CreateBrand street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Street number and name.
     * @return street
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "123", value = "Street number and name.")
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

    public CreateBrand city(String city) {
        this.city = city;
        return this;
    }

    /**
     * City name
     * @return city
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "New York", value = "City name")
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

    public CreateBrand state(String state) {
        this.state = state;
        return this;
    }

    /**
     * State. Must be 2 letters code for United States.
     * @return state
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "NY",
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

    public CreateBrand postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Postal codes. Use 5 digit zipcode for United States
     * @return postalCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "10001",
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

    public CreateBrand country(String country) {
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

    public CreateBrand email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Valid email address of brand support contact.
     * @return email
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
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

    public CreateBrand stockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
        return this;
    }

    /**
     * (Required for public company) stock symbol.
     * @return stockSymbol
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "ABC",
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

    public CreateBrand stockExchange(StockExchange stockExchange) {
        this.stockExchange = stockExchange;
        return this;
    }

    /**
     * (Required for public company) stock exchange.
     * @return stockExchange
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "(Required for public company) stock exchange.")
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

    public CreateBrand ipAddress(String ipAddress) {
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

    public CreateBrand website(String website) {
        this.website = website;
        return this;
    }

    /**
     * Brand website URL.
     * @return website
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "http://www.abcmobile.com",
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

    public CreateBrand vertical(Vertical vertical) {
        this.vertical = vertical;
        return this;
    }

    /**
     * Vertical or industry segment of the brand.
     * @return vertical
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Vertical or industry segment of the brand."
    )
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

    public CreateBrand isReseller(Boolean isReseller) {
        this.isReseller = isReseller;
        return this;
    }

    /**
     * Get isReseller
     * @return isReseller
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IS_RESELLER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsReseller() {
        return isReseller;
    }

    @JsonProperty(JSON_PROPERTY_IS_RESELLER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsReseller(Boolean isReseller) {
        this.isReseller = isReseller;
    }

    public CreateBrand mock(Boolean mock) {
        this.mock = mock;
        return this;
    }

    /**
     * Mock brand for testing purposes. Defaults to false.
     * @return mock
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Mock brand for testing purposes. Defaults to false."
    )
    @JsonProperty(JSON_PROPERTY_MOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getMock() {
        return mock;
    }

    @JsonProperty(JSON_PROPERTY_MOCK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMock(Boolean mock) {
        this.mock = mock;
    }

    public CreateBrand mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * Valid mobile phone number in e.164 international format.
     * @return mobilePhone
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+12024567890",
        value = "Valid mobile phone number in e.164 international format."
    )
    @JsonProperty(JSON_PROPERTY_MOBILE_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMobilePhone() {
        return mobilePhone;
    }

    @JsonProperty(JSON_PROPERTY_MOBILE_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public CreateBrand businessContactEmail(String businessContactEmail) {
        this.businessContactEmail = businessContactEmail;
        return this;
    }

    /**
     * Business contact email.  Required if &#x60;entityType&#x60; is &#x60;PUBLIC_PROFIT&#x60;.
     * @return businessContactEmail
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "name@example.com",
        value = "Business contact email.  Required if `entityType` is `PUBLIC_PROFIT`."
    )
    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBusinessContactEmail() {
        return businessContactEmail;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_CONTACT_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBusinessContactEmail(String businessContactEmail) {
        this.businessContactEmail = businessContactEmail;
    }

    public CreateBrand webhookURL(String webhookURL) {
        this.webhookURL = webhookURL;
        return this;
    }

    /**
     * Webhook URL for brand status updates.
     * @return webhookURL
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93",
        value = "Webhook URL for brand status updates."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookURL() {
        return webhookURL;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookURL(String webhookURL) {
        this.webhookURL = webhookURL;
    }

    public CreateBrand webhookFailoverURL(String webhookFailoverURL) {
        this.webhookFailoverURL = webhookFailoverURL;
        return this;
    }

    /**
     * Webhook failover URL for brand status updates.
     * @return webhookFailoverURL
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6",
        value = "Webhook failover URL for brand status updates."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookFailoverURL() {
        return webhookFailoverURL;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_U_R_L)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookFailoverURL(String webhookFailoverURL) {
        this.webhookFailoverURL = webhookFailoverURL;
    }

    /**
     * Return true if this CreateBrand object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBrand createBrand = (CreateBrand) o;
        return (
            Objects.equals(this.entityType, createBrand.entityType) &&
            Objects.equals(this.displayName, createBrand.displayName) &&
            Objects.equals(this.companyName, createBrand.companyName) &&
            Objects.equals(this.firstName, createBrand.firstName) &&
            Objects.equals(this.lastName, createBrand.lastName) &&
            Objects.equals(this.ein, createBrand.ein) &&
            Objects.equals(this.phone, createBrand.phone) &&
            Objects.equals(this.street, createBrand.street) &&
            Objects.equals(this.city, createBrand.city) &&
            Objects.equals(this.state, createBrand.state) &&
            Objects.equals(this.postalCode, createBrand.postalCode) &&
            Objects.equals(this.country, createBrand.country) &&
            Objects.equals(this.email, createBrand.email) &&
            Objects.equals(this.stockSymbol, createBrand.stockSymbol) &&
            Objects.equals(this.stockExchange, createBrand.stockExchange) &&
            Objects.equals(this.ipAddress, createBrand.ipAddress) &&
            Objects.equals(this.website, createBrand.website) &&
            Objects.equals(this.vertical, createBrand.vertical) &&
            Objects.equals(this.isReseller, createBrand.isReseller) &&
            Objects.equals(this.mock, createBrand.mock) &&
            Objects.equals(this.mobilePhone, createBrand.mobilePhone) &&
            Objects.equals(
                this.businessContactEmail,
                createBrand.businessContactEmail
            ) &&
            Objects.equals(this.webhookURL, createBrand.webhookURL) &&
            Objects.equals(
                this.webhookFailoverURL,
                createBrand.webhookFailoverURL
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            entityType,
            displayName,
            companyName,
            firstName,
            lastName,
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
            isReseller,
            mock,
            mobilePhone,
            businessContactEmail,
            webhookURL,
            webhookFailoverURL
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBrand {\n");
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
        sb
            .append("    firstName: ")
            .append(toIndentedString(firstName))
            .append("\n");
        sb
            .append("    lastName: ")
            .append(toIndentedString(lastName))
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
            .append("    isReseller: ")
            .append(toIndentedString(isReseller))
            .append("\n");
        sb.append("    mock: ").append(toIndentedString(mock)).append("\n");
        sb
            .append("    mobilePhone: ")
            .append(toIndentedString(mobilePhone))
            .append("\n");
        sb
            .append("    businessContactEmail: ")
            .append(toIndentedString(businessContactEmail))
            .append("\n");
        sb
            .append("    webhookURL: ")
            .append(toIndentedString(webhookURL))
            .append("\n");
        sb
            .append("    webhookFailoverURL: ")
            .append(toIndentedString(webhookFailoverURL))
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
