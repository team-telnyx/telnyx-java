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

package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.ChatCompletionRequest;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.ModelsResponse;
import com.telnyx.sdk.model.SummaryRequest;
import com.telnyx.sdk.model.SummaryResponseData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ChatApi
 */
public class ChatApiTest {

    private final ChatApi api = new ChatApi();

    /**
     * Create a chat completion
     *
     * Chat with a language model. This endpoint is consistent with the [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat) and may be used with the OpenAI JS or Python SDK.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chatPublicChatCompletionsPostTest() throws ApiException {
        //ChatCompletionRequest chatCompletionRequest = null;
        //Object response = api.chatPublicChatCompletionsPost(chatCompletionRequest);
        // TODO: test validations
    }

    /**
     * Get available models
     *
     * This endpoint returns a list of Open Source and OpenAI models that are available for use. &lt;br /&gt;&lt;br /&gt; **Note**: Model &#x60;id&#x60;&#39;s will be in the form &#x60;{source}/{model_name}&#x60;. For example &#x60;openai/gpt-4&#x60; or &#x60;mistralai/Mistral-7B-Instruct-v0.1&#x60; consistent with HuggingFace naming conventions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelsPublicModelsGetTest() throws ApiException {
        //ModelsResponse response = api.getModelsPublicModelsGet();
        // TODO: test validations
    }

    /**
     * Summarize file content
     *
     * Generate a summary of a file&#39;s contents.    Supports the following text formats:  - PDF, HTML, txt, json, csv   Supports the following media formats (billed for both the transcription and summary):  - flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm - Up to 100 MB
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSummaryTest() throws ApiException {
        //SummaryRequest summaryRequest = null;
        //SummaryResponseData response = api.postSummary(summaryRequest);
        // TODO: test validations
    }
}
