/*
 * Telnyx 10DLC API
 * # Overview The Telnyx 10DLC API facilitates interaction with The Campaign Registry (TCR), allowing the creation and registration of brands and campaigns with TCR.  # API Interaction ## Request Authorization Telnyx 10DLC API endpoints require authorization for each request. To properly authorize requests, send an Authorization header with `Bearer ` plus your Telnyx API key as the value. See the following curl request for example usage:  ```sh curl --location --request GET 'https://api.telnyx.com/10dlc/example/endpoint' \\  --header 'Authorization: Bearer YOUR_API_KEY_GOES_HERE' \\  --data-raw '' ```  You can obtain your API key by logging into your <a href=\"https://portal.telnyx.com\">Telnyx portal account</a> and clicking the \"API Keys\" tab. From there, you can copy your desired API key for use in your requests, similar to the above example curl request.  ## The 10DLC Work Flow 1. Create a brand  2. Apply for brand vetting  3. Create a campaign or campaigns (associated with the created brand)  4. Assign a phone number or phone numbers to the created campaign ## 10DLC Costs **Brands:** 1. Brand registration: $4 one time charge  2.  Brand vetting: $40 one time charge  **Campaigns:**  1. Campaign registration T-Mobile: $50 one time charge  2. Campaign creation: first 3 month's charge upfront. After the first 3 months, this charge will change to a once a month recurring charge (see charge values below, based on campaign use case)     a. Charity Campaign Use Case: $15 upfront (first 3 months), and $5 month to month after     b. Low Mixed Volume Campaign Use Case: $6 upfront (first 3 months), and $2 month to month after     c. Any Other Campaign Use Case: $30 upfront (first 3 months), and $10 month to month after 3. Phone number to campaign assignment: $0.03 one time charge for each assignment  ## Frequently Asked Questions For frequently asked questions, visit <a href=\"https://support.telnyx.com/en/articles/3679260-frequently-asked-questions-about-10dlc\">Telnyx 10DLC FAQs</a>.
 *
 * The version of the OpenAPI document: 0.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.AltBusinessIdType;
import com.telnyx.sdk.model.EntityType;
import com.telnyx.sdk.model.StockExchange;
import com.telnyx.sdk.model.Vertical;
import java.util.Arrays;
import org.junit.Test;

/**
 * Model tests for BrandRequest
 */
public class BrandRequestTest {

    private final BrandRequest model = new BrandRequest();

    /**
     * Model tests for BrandRequest
     */
    @Test
    public void testBrandRequest() {
        // TODO: test BrandRequest
    }

    /**
     * Test the property 'entityType'
     */
    @Test
    public void entityTypeTest() {
        // TODO: test entityType
    }

    /**
     * Test the property 'cspId'
     */
    @Test
    public void cspIdTest() {
        // TODO: test cspId
    }

    /**
     * Test the property 'brandId'
     */
    @Test
    public void brandIdTest() {
        // TODO: test brandId
    }

    /**
     * Test the property 'displayName'
     */
    @Test
    public void displayNameTest() {
        // TODO: test displayName
    }

    /**
     * Test the property 'companyName'
     */
    @Test
    public void companyNameTest() {
        // TODO: test companyName
    }

    /**
     * Test the property 'ein'
     */
    @Test
    public void einTest() {
        // TODO: test ein
    }

    /**
     * Test the property 'phone'
     */
    @Test
    public void phoneTest() {
        // TODO: test phone
    }

    /**
     * Test the property 'street'
     */
    @Test
    public void streetTest() {
        // TODO: test street
    }

    /**
     * Test the property 'city'
     */
    @Test
    public void cityTest() {
        // TODO: test city
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'postalCode'
     */
    @Test
    public void postalCodeTest() {
        // TODO: test postalCode
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        // TODO: test country
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'stockSymbol'
     */
    @Test
    public void stockSymbolTest() {
        // TODO: test stockSymbol
    }

    /**
     * Test the property 'stockExchange'
     */
    @Test
    public void stockExchangeTest() {
        // TODO: test stockExchange
    }

    /**
     * Test the property 'ipAddress'
     */
    @Test
    public void ipAddressTest() {
        // TODO: test ipAddress
    }

    /**
     * Test the property 'website'
     */
    @Test
    public void websiteTest() {
        // TODO: test website
    }

    /**
     * Test the property 'vertical'
     */
    @Test
    public void verticalTest() {
        // TODO: test vertical
    }

    /**
     * Test the property 'altBusinessId'
     */
    @Test
    public void altBusinessIdTest() {
        // TODO: test altBusinessId
    }

    /**
     * Test the property 'altBusinessIdType'
     */
    @Test
    public void altBusinessIdTypeTest() {
        // TODO: test altBusinessIdType
    }

    /**
     * Test the property 'universalEin'
     */
    @Test
    public void universalEinTest() {
        // TODO: test universalEin
    }
}
