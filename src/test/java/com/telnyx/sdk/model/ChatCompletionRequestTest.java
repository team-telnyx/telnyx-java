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
import com.telnyx.sdk.model.ChatCompletionRequestToolsInner;
import com.telnyx.sdk.model.ChatCompletionSystemMessageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Model tests for ChatCompletionRequest
 */
public class ChatCompletionRequestTest {

    private final ChatCompletionRequest model = new ChatCompletionRequest();

    /**
     * Model tests for ChatCompletionRequest
     */
    @Test
    public void testChatCompletionRequest() {
        // TODO: test ChatCompletionRequest
    }

    /**
     * Test the property 'messages'
     */
    @Test
    public void messagesTest() {
        // TODO: test messages
    }

    /**
     * Test the property 'model'
     */
    @Test
    public void modelTest() {
        // TODO: test model
    }

    /**
     * Test the property 'stream'
     */
    @Test
    public void streamTest() {
        // TODO: test stream
    }

    /**
     * Test the property 'maxTokens'
     */
    @Test
    public void maxTokensTest() {
        // TODO: test maxTokens
    }

    /**
     * Test the property 'temperature'
     */
    @Test
    public void temperatureTest() {
        // TODO: test temperature
    }

    /**
     * Test the property 'minP'
     */
    @Test
    public void minPTest() {
        // TODO: test minP
    }

    /**
     * Test the property 'n'
     */
    @Test
    public void nTest() {
        // TODO: test n
    }

    /**
     * Test the property 'tools'
     */
    @Test
    public void toolsTest() {
        // TODO: test tools
    }

    /**
     * Test the property 'toolChoice'
     */
    @Test
    public void toolChoiceTest() {
        // TODO: test toolChoice
    }

    /**
     * Test the property 'useBeamSearch'
     */
    @Test
    public void useBeamSearchTest() {
        // TODO: test useBeamSearch
    }

    /**
     * Test the property 'bestOf'
     */
    @Test
    public void bestOfTest() {
        // TODO: test bestOf
    }

    /**
     * Test the property 'lengthPenalty'
     */
    @Test
    public void lengthPenaltyTest() {
        // TODO: test lengthPenalty
    }

    /**
     * Test the property 'earlyStopping'
     */
    @Test
    public void earlyStoppingTest() {
        // TODO: test earlyStopping
    }

    /**
     * Test the property 'frequencyPenalty'
     */
    @Test
    public void frequencyPenaltyTest() {
        // TODO: test frequencyPenalty
    }

    /**
     * Test the property 'presencePenalty'
     */
    @Test
    public void presencePenaltyTest() {
        // TODO: test presencePenalty
    }

    /**
     * Test the property 'topP'
     */
    @Test
    public void topPTest() {
        // TODO: test topP
    }

    /**
     * Test the property 'openaiApiKey'
     */
    @Test
    public void openaiApiKeyTest() {
        // TODO: test openaiApiKey
    }
}
