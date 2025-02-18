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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.Test;

/**
 * Model tests for CampaignRequest
 */
public class CampaignRequestTest {

    private final CampaignRequest model = new CampaignRequest();

    /**
     * Model tests for CampaignRequest
     */
    @Test
    public void testCampaignRequest() {
        // TODO: test CampaignRequest
    }

    /**
     * Test the property 'affiliateMarketing'
     */
    @Test
    public void affiliateMarketingTest() {
        // TODO: test affiliateMarketing
    }

    /**
     * Test the property 'ageGated'
     */
    @Test
    public void ageGatedTest() {
        // TODO: test ageGated
    }

    /**
     * Test the property 'autoRenewal'
     */
    @Test
    public void autoRenewalTest() {
        // TODO: test autoRenewal
    }

    /**
     * Test the property 'brandId'
     */
    @Test
    public void brandIdTest() {
        // TODO: test brandId
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'directLending'
     */
    @Test
    public void directLendingTest() {
        // TODO: test directLending
    }

    /**
     * Test the property 'embeddedLink'
     */
    @Test
    public void embeddedLinkTest() {
        // TODO: test embeddedLink
    }

    /**
     * Test the property 'embeddedPhone'
     */
    @Test
    public void embeddedPhoneTest() {
        // TODO: test embeddedPhone
    }

    /**
     * Test the property 'helpKeywords'
     */
    @Test
    public void helpKeywordsTest() {
        // TODO: test helpKeywords
    }

    /**
     * Test the property 'helpMessage'
     */
    @Test
    public void helpMessageTest() {
        // TODO: test helpMessage
    }

    /**
     * Test the property 'messageFlow'
     */
    @Test
    public void messageFlowTest() {
        // TODO: test messageFlow
    }

    /**
     * Test the property 'mnoIds'
     */
    @Test
    public void mnoIdsTest() {
        // TODO: test mnoIds
    }

    /**
     * Test the property 'numberPool'
     */
    @Test
    public void numberPoolTest() {
        // TODO: test numberPool
    }

    /**
     * Test the property 'optinKeywords'
     */
    @Test
    public void optinKeywordsTest() {
        // TODO: test optinKeywords
    }

    /**
     * Test the property 'optinMessage'
     */
    @Test
    public void optinMessageTest() {
        // TODO: test optinMessage
    }

    /**
     * Test the property 'optoutKeywords'
     */
    @Test
    public void optoutKeywordsTest() {
        // TODO: test optoutKeywords
    }

    /**
     * Test the property 'optoutMessage'
     */
    @Test
    public void optoutMessageTest() {
        // TODO: test optoutMessage
    }

    /**
     * Test the property 'referenceId'
     */
    @Test
    public void referenceIdTest() {
        // TODO: test referenceId
    }

    /**
     * Test the property 'resellerId'
     */
    @Test
    public void resellerIdTest() {
        // TODO: test resellerId
    }

    /**
     * Test the property 'sample1'
     */
    @Test
    public void sample1Test() {
        // TODO: test sample1
    }

    /**
     * Test the property 'sample2'
     */
    @Test
    public void sample2Test() {
        // TODO: test sample2
    }

    /**
     * Test the property 'sample3'
     */
    @Test
    public void sample3Test() {
        // TODO: test sample3
    }

    /**
     * Test the property 'sample4'
     */
    @Test
    public void sample4Test() {
        // TODO: test sample4
    }

    /**
     * Test the property 'sample5'
     */
    @Test
    public void sample5Test() {
        // TODO: test sample5
    }

    /**
     * Test the property 'subUsecases'
     */
    @Test
    public void subUsecasesTest() {
        // TODO: test subUsecases
    }

    /**
     * Test the property 'subscriberHelp'
     */
    @Test
    public void subscriberHelpTest() {
        // TODO: test subscriberHelp
    }

    /**
     * Test the property 'subscriberOptin'
     */
    @Test
    public void subscriberOptinTest() {
        // TODO: test subscriberOptin
    }

    /**
     * Test the property 'subscriberOptout'
     */
    @Test
    public void subscriberOptoutTest() {
        // TODO: test subscriberOptout
    }

    /**
     * Test the property 'tag'
     */
    @Test
    public void tagTest() {
        // TODO: test tag
    }

    /**
     * Test the property 'termsAndConditions'
     */
    @Test
    public void termsAndConditionsTest() {
        // TODO: test termsAndConditions
    }

    /**
     * Test the property 'usecase'
     */
    @Test
    public void usecaseTest() {
        // TODO: test usecase
    }

    /**
     * Test the property 'webhookURL'
     */
    @Test
    public void webhookURLTest() {
        // TODO: test webhookURL
    }

    /**
     * Test the property 'webhookFailoverURL'
     */
    @Test
    public void webhookFailoverURLTest() {
        // TODO: test webhookFailoverURL
    }
}
