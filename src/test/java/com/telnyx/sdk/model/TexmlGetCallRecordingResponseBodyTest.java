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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.RecordingSource;
import com.telnyx.sdk.model.TexmlRecordingStatus;
import com.telnyx.sdk.model.TexmlRecordingSubresourcesUris;
import com.telnyx.sdk.model.TwimlRecordingChannels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.junit.Test;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Model tests for TexmlGetCallRecordingResponseBody
 */
public class TexmlGetCallRecordingResponseBodyTest {

    private final TexmlGetCallRecordingResponseBody model =
        new TexmlGetCallRecordingResponseBody();

    /**
     * Model tests for TexmlGetCallRecordingResponseBody
     */
    @Test
    public void testTexmlGetCallRecordingResponseBody() {
        // TODO: test TexmlGetCallRecordingResponseBody
    }

    /**
     * Test the property 'accountSid'
     */
    @Test
    public void accountSidTest() {
        // TODO: test accountSid
    }

    /**
     * Test the property 'callSid'
     */
    @Test
    public void callSidTest() {
        // TODO: test callSid
    }

    /**
     * Test the property 'conferenceSid'
     */
    @Test
    public void conferenceSidTest() {
        // TODO: test conferenceSid
    }

    /**
     * Test the property 'channels'
     */
    @Test
    public void channelsTest() {
        // TODO: test channels
    }

    /**
     * Test the property 'dateCreated'
     */
    @Test
    public void dateCreatedTest() {
        // TODO: test dateCreated
    }

    /**
     * Test the property 'dateUpdated'
     */
    @Test
    public void dateUpdatedTest() {
        // TODO: test dateUpdated
    }

    /**
     * Test the property 'startTime'
     */
    @Test
    public void startTimeTest() {
        // TODO: test startTime
    }

    /**
     * Test the property 'duration'
     */
    @Test
    public void durationTest() {
        // TODO: test duration
    }

    /**
     * Test the property 'sid'
     */
    @Test
    public void sidTest() {
        // TODO: test sid
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'errorCode'
     */
    @Test
    public void errorCodeTest() {
        // TODO: test errorCode
    }

    /**
     * Test the property 'subresourcesUris'
     */
    @Test
    public void subresourcesUrisTest() {
        // TODO: test subresourcesUris
    }

    /**
     * Test the property 'uri'
     */
    @Test
    public void uriTest() {
        // TODO: test uri
    }

    /**
     * Test the property 'mediaUrl'
     */
    @Test
    public void mediaUrlTest() {
        // TODO: test mediaUrl
    }
}
