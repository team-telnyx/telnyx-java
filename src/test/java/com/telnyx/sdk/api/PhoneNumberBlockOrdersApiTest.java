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
import com.telnyx.sdk.model.CreateNumberBlockOrderRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListNumberBlockOrdersResponse;
import com.telnyx.sdk.model.NumberBlockOrderResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for PhoneNumberBlockOrdersApi
 */
public class PhoneNumberBlockOrdersApiTest {

    private final PhoneNumberBlockOrdersApi api =
        new PhoneNumberBlockOrdersApi();

    /**
     * Create a number block order
     *
     * Creates a phone number block order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNumberBlockOrderTest() throws ApiException {
        //CreateNumberBlockOrderRequest createNumberBlockOrderRequest = null;
        //NumberBlockOrderResponse response = api.createNumberBlockOrder(createNumberBlockOrderRequest);
        // TODO: test validations
    }

    /**
     * List number block orders
     *
     * Get a paginated list of number block orders.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNumberBlockOrdersTest() throws ApiException {
        //String filterStatus = null;
        //String filterCreatedAtGt = null;
        //String filterCreatedAtLt = null;
        //String filterPhoneNumbersStartingNumber = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListNumberBlockOrdersResponse response = api.listNumberBlockOrders(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersStartingNumber, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Retrieve a number block order
     *
     * Get an existing phone number block order.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveNumberBlockOrderTest() throws ApiException {
        //String numberBlockOrderId = null;
        //NumberBlockOrderResponse response = api.retrieveNumberBlockOrder(numberBlockOrderId);
        // TODO: test validations
    }
}
