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
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListPhoneNumberBlocksBackgroundJobsResponse;
import com.telnyx.sdk.model.PhoneNumberBlocksJob;
import com.telnyx.sdk.model.PhoneNumberBlocksJobDeletePhoneNumberBlock;
import com.telnyx.sdk.model.PhoneNumberBlocksJobDeletePhoneNumberBlockRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhoneNumberBlocksBackgroundJobsApi
 */
public class PhoneNumberBlocksBackgroundJobsApiTest {

    private final PhoneNumberBlocksBackgroundJobsApi api = new PhoneNumberBlocksBackgroundJobsApi();

    /**
     * Deletes all numbers associated with a phone number block
     *
     * Creates a new background job to delete all the phone numbers associated with the given block. We will only consider the phone number block as deleted after all phone numbers associated with it are removed, so multiple executions of this job may be necessary in case some of the phone numbers present errors during the deletion process.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPhoneNumberBlockDeletionJobTest() throws ApiException {
        //PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest = null;
        //PhoneNumberBlocksJobDeletePhoneNumberBlock response = api.createPhoneNumberBlockDeletionJob()
        //        .phoneNumberBlocksJobDeletePhoneNumberBlockRequest(phoneNumberBlocksJobDeletePhoneNumberBlockRequest)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieves a phone number blocks job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPhoneNumberBlocksJobTest() throws ApiException {
        //String id = null;
        //PhoneNumberBlocksJob response = api.getPhoneNumberBlocksJob(id)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Lists the phone number blocks jobs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumberBlocksJobsTest() throws ApiException {
        //String filterType = null;
        //String filterStatus = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String sort = null;
        //ListPhoneNumberBlocksBackgroundJobsResponse response = api.listPhoneNumberBlocksJobs()
        //        .filterType(filterType)
        //        .filterStatus(filterStatus)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .sort(sort)
        //        .execute();
        // TODO: test validations
    }

}
