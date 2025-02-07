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
import com.telnyx.sdk.model.ListPhoneNumbersResponse;
import com.telnyx.sdk.model.ListPhoneNumbersResponse1;
import com.telnyx.sdk.model.ListPhoneNumbersWithVoiceSettingsResponse;
import com.telnyx.sdk.model.PhoneNumberEnableEmergency;
import com.telnyx.sdk.model.PhoneNumberEnableEmergencyRequest;
import com.telnyx.sdk.model.PhoneNumberResponse;
import com.telnyx.sdk.model.PhoneNumberResponse1;
import com.telnyx.sdk.model.RetrievePhoneNumberVoiceResponse;
import com.telnyx.sdk.model.UpdatePhoneNumberRequest;
import com.telnyx.sdk.model.UpdatePhoneNumberVoiceSettingsRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PhoneNumberConfigurationsApi
 */
public class PhoneNumberConfigurationsApiTest {

    private final PhoneNumberConfigurationsApi api = new PhoneNumberConfigurationsApi();

    /**
     * Delete a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePhoneNumberTest() throws ApiException {
        //String id = null;
        //PhoneNumberResponse1 response = api.deletePhoneNumber(id);
        // TODO: test validations
    }

    /**
     * Enable emergency for a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enablePhoneNumberEmergencyTest() throws ApiException {
        //String id = null;
        //PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest = null;
        //PhoneNumberEnableEmergency response = api.enablePhoneNumberEmergency(id, phoneNumberEnableEmergencyRequest);
        // TODO: test validations
    }

    /**
     * Retrieve a phone number with voice settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPhoneNumberVoiceSettingsTest() throws ApiException {
        //String id = null;
        //RetrievePhoneNumberVoiceResponse response = api.getPhoneNumberVoiceSettings(id);
        // TODO: test validations
    }

    /**
     * List phone numbers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumbersTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterTag = null;
        //String filterPhoneNumber = null;
        //String filterStatus = null;
        //String filterConnectionId = null;
        //String filterVoiceConnectionNameContains = null;
        //String filterVoiceConnectionNameStartsWith = null;
        //String filterVoiceConnectionNameEndsWith = null;
        //String filterVoiceConnectionNameEq = null;
        //String filterVoiceUsagePaymentMethod = null;
        //String filterBillingGroupId = null;
        //String filterEmergencyAddressId = null;
        //String filterCustomerReference = null;
        //String sort = null;
        //ListPhoneNumbersResponse response = api.listPhoneNumbers()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .filterTag(filterTag)
        //        .filterPhoneNumber(filterPhoneNumber)
        //        .filterStatus(filterStatus)
        //        .filterConnectionId(filterConnectionId)
        //        .filterVoiceConnectionNameContains(filterVoiceConnectionNameContains)
        //        .filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith)
        //        .filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith)
        //        .filterVoiceConnectionNameEq(filterVoiceConnectionNameEq)
        //        .filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod)
        //        .filterBillingGroupId(filterBillingGroupId)
        //        .filterEmergencyAddressId(filterEmergencyAddressId)
        //        .filterCustomerReference(filterCustomerReference)
        //        .sort(sort)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List phone numbers with voice settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPhoneNumbersWithVoiceSettingsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterPhoneNumber = null;
        //String filterConnectionNameContains = null;
        //String filterCustomerReference = null;
        //String filterVoiceUsagePaymentMethod = null;
        //String sort = null;
        //ListPhoneNumbersWithVoiceSettingsResponse response = api.listPhoneNumbersWithVoiceSettings()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .filterPhoneNumber(filterPhoneNumber)
        //        .filterConnectionNameContains(filterConnectionNameContains)
        //        .filterCustomerReference(filterCustomerReference)
        //        .filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod)
        //        .sort(sort)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrievePhoneNumberTest() throws ApiException {
        //String id = null;
        //PhoneNumberResponse response = api.retrievePhoneNumber(id);
        // TODO: test validations
    }

    /**
     * Slim List phone numbers
     *
     * List phone numbers, This endpoint is a lighter version of the /phone_numbers endpoint having higher performance and rate limit.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void slimListPhoneNumbersTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //Boolean includeConnection = null;
        //Boolean includeTags = null;
        //String filterTag = null;
        //String filterPhoneNumber = null;
        //String filterStatus = null;
        //String filterConnectionId = null;
        //String filterVoiceConnectionNameContains = null;
        //String filterVoiceConnectionNameStartsWith = null;
        //String filterVoiceConnectionNameEndsWith = null;
        //String filterVoiceConnectionName = null;
        //String filterVoiceUsagePaymentMethod = null;
        //String filterBillingGroupId = null;
        //String filterEmergencyAddressId = null;
        //String filterCustomerReference = null;
        //String sort = null;
        //ListPhoneNumbersResponse1 response = api.slimListPhoneNumbers()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .includeConnection(includeConnection)
        //        .includeTags(includeTags)
        //        .filterTag(filterTag)
        //        .filterPhoneNumber(filterPhoneNumber)
        //        .filterStatus(filterStatus)
        //        .filterConnectionId(filterConnectionId)
        //        .filterVoiceConnectionNameContains(filterVoiceConnectionNameContains)
        //        .filterVoiceConnectionNameStartsWith(filterVoiceConnectionNameStartsWith)
        //        .filterVoiceConnectionNameEndsWith(filterVoiceConnectionNameEndsWith)
        //        .filterVoiceConnectionName(filterVoiceConnectionName)
        //        .filterVoiceUsagePaymentMethod(filterVoiceUsagePaymentMethod)
        //        .filterBillingGroupId(filterBillingGroupId)
        //        .filterEmergencyAddressId(filterEmergencyAddressId)
        //        .filterCustomerReference(filterCustomerReference)
        //        .sort(sort)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a phone number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePhoneNumberTest() throws ApiException {
        //String id = null;
        //UpdatePhoneNumberRequest updatePhoneNumberRequest = null;
        //PhoneNumberResponse response = api.updatePhoneNumber(id, updatePhoneNumberRequest);
        // TODO: test validations
    }

    /**
     * Update a phone number with voice settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePhoneNumberVoiceSettingsTest() throws ApiException {
        //String id = null;
        //UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest = null;
        //RetrievePhoneNumberVoiceResponse response = api.updatePhoneNumberVoiceSettings(id, updatePhoneNumberVoiceSettingsRequest);
        // TODO: test validations
    }

}
