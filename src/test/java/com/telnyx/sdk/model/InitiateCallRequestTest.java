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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;



import org.junit.Test;

/**
 * Model tests for InitiateCallRequest
 */
public class InitiateCallRequestTest {
    private final InitiateCallRequest model = new InitiateCallRequest();

    /**
     * Model tests for InitiateCallRequest
     */
    @Test
    public void testInitiateCallRequest() {
        // TODO: test InitiateCallRequest
    }

    /**
     * Test the property 'applicationSid'
     */
    @Test
    public void applicationSidTest() {
        // TODO: test applicationSid
    }

    /**
     * Test the property 'to'
     */
    @Test
    public void toTest() {
        // TODO: test to
    }

    /**
     * Test the property 'from'
     */
    @Test
    public void fromTest() {
        // TODO: test from
    }

    /**
     * Test the property 'url'
     */
    @Test
    public void urlTest() {
        // TODO: test url
    }

    /**
     * Test the property 'urlMethod'
     */
    @Test
    public void urlMethodTest() {
        // TODO: test urlMethod
    }

    /**
     * Test the property 'fallbackUrl'
     */
    @Test
    public void fallbackUrlTest() {
        // TODO: test fallbackUrl
    }

    /**
     * Test the property 'statusCallback'
     */
    @Test
    public void statusCallbackTest() {
        // TODO: test statusCallback
    }

    /**
     * Test the property 'statusCallbackMethod'
     */
    @Test
    public void statusCallbackMethodTest() {
        // TODO: test statusCallbackMethod
    }

    /**
     * Test the property 'statusCallbackEvent'
     */
    @Test
    public void statusCallbackEventTest() {
        // TODO: test statusCallbackEvent
    }

    /**
     * Test the property 'machineDetection'
     */
    @Test
    public void machineDetectionTest() {
        // TODO: test machineDetection
    }

    /**
     * Test the property 'detectionMode'
     */
    @Test
    public void detectionModeTest() {
        // TODO: test detectionMode
    }

    /**
     * Test the property 'asyncAmd'
     */
    @Test
    public void asyncAmdTest() {
        // TODO: test asyncAmd
    }

    /**
     * Test the property 'asyncAmdStatusCallback'
     */
    @Test
    public void asyncAmdStatusCallbackTest() {
        // TODO: test asyncAmdStatusCallback
    }

    /**
     * Test the property 'asyncAmdStatusCallbackMethod'
     */
    @Test
    public void asyncAmdStatusCallbackMethodTest() {
        // TODO: test asyncAmdStatusCallbackMethod
    }

    /**
     * Test the property 'machineDetectionTimeout'
     */
    @Test
    public void machineDetectionTimeoutTest() {
        // TODO: test machineDetectionTimeout
    }

    /**
     * Test the property 'machineDetectionSpeechThreshold'
     */
    @Test
    public void machineDetectionSpeechThresholdTest() {
        // TODO: test machineDetectionSpeechThreshold
    }

    /**
     * Test the property 'machineDetectionSpeechEndThreshold'
     */
    @Test
    public void machineDetectionSpeechEndThresholdTest() {
        // TODO: test machineDetectionSpeechEndThreshold
    }

    /**
     * Test the property 'machineDetectionSilenceTimeout'
     */
    @Test
    public void machineDetectionSilenceTimeoutTest() {
        // TODO: test machineDetectionSilenceTimeout
    }

    /**
     * Test the property 'cancelPlaybackOnMachineDetection'
     */
    @Test
    public void cancelPlaybackOnMachineDetectionTest() {
        // TODO: test cancelPlaybackOnMachineDetection
    }

    /**
     * Test the property 'cancelPlaybackOnDetectMessageEnd'
     */
    @Test
    public void cancelPlaybackOnDetectMessageEndTest() {
        // TODO: test cancelPlaybackOnDetectMessageEnd
    }

    /**
     * Test the property 'preferredCodecs'
     */
    @Test
    public void preferredCodecsTest() {
        // TODO: test preferredCodecs
    }

    /**
     * Test the property 'record'
     */
    @Test
    public void recordTest() {
        // TODO: test record
    }

    /**
     * Test the property 'recordingChannels'
     */
    @Test
    public void recordingChannelsTest() {
        // TODO: test recordingChannels
    }

    /**
     * Test the property 'recordingStatusCallback'
     */
    @Test
    public void recordingStatusCallbackTest() {
        // TODO: test recordingStatusCallback
    }

    /**
     * Test the property 'recordingStatusCallbackMethod'
     */
    @Test
    public void recordingStatusCallbackMethodTest() {
        // TODO: test recordingStatusCallbackMethod
    }

    /**
     * Test the property 'recordingStatusCallbackEvent'
     */
    @Test
    public void recordingStatusCallbackEventTest() {
        // TODO: test recordingStatusCallbackEvent
    }

    /**
     * Test the property 'recordingTimeout'
     */
    @Test
    public void recordingTimeoutTest() {
        // TODO: test recordingTimeout
    }

    /**
     * Test the property 'recordingTrack'
     */
    @Test
    public void recordingTrackTest() {
        // TODO: test recordingTrack
    }

    /**
     * Test the property 'sipAuthPassword'
     */
    @Test
    public void sipAuthPasswordTest() {
        // TODO: test sipAuthPassword
    }

    /**
     * Test the property 'sipAuthUsername'
     */
    @Test
    public void sipAuthUsernameTest() {
        // TODO: test sipAuthUsername
    }

    /**
     * Test the property 'trim'
     */
    @Test
    public void trimTest() {
        // TODO: test trim
    }

}
