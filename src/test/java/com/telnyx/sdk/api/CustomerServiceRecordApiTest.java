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

package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.CreateCustomerServiceRecord201Response;
import com.telnyx.sdk.model.CreateCustomerServiceRecordRequest;
import com.telnyx.sdk.model.GetCustomerServiceRecord201Response;
import com.telnyx.sdk.model.GetCustomerServiceRecord404Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords200Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords401Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords403Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords422Response;
import com.telnyx.sdk.model.ListCustomerServiceRecords500Response;
import com.telnyx.sdk.model.VerifyPhoneNumberCoverage201Response;
import com.telnyx.sdk.model.VerifyPhoneNumberCoverageRequest;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for CustomerServiceRecordApi
 */
public class CustomerServiceRecordApiTest {

    private final CustomerServiceRecordApi api = new CustomerServiceRecordApi();

    /**
     * Create a customer service record
     *
     * Create a new customer service record for the provided phone number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomerServiceRecordTest() throws ApiException {
        //CreateCustomerServiceRecordRequest createCustomerServiceRecordRequest = null;
        //CreateCustomerServiceRecord201Response response = api.createCustomerServiceRecord(createCustomerServiceRecordRequest);
        // TODO: test validations
    }

    /**
     * Get a customer service record
     *
     * Get a specific customer service record.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerServiceRecordTest() throws ApiException {
        //String customerServiceRecordId = null;
        //GetCustomerServiceRecord201Response response = api.getCustomerServiceRecord(customerServiceRecordId);
        // TODO: test validations
    }

    /**
     * List customer service records
     *
     * List customer service records.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCustomerServiceRecordsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String sort = null;
        //String filterPhoneNumberEq = null;
        //List<String> filterPhoneNumberIn = null;
        //String filterStatusEq = null;
        //List<String> filterStatusIn = null;
        //OffsetDateTime filterCreatedAtLt = null;
        //OffsetDateTime filterCreatedAtGt = null;
        //ListCustomerServiceRecords200Response response = api.listCustomerServiceRecords(pageNumber, pageSize, sort, filterPhoneNumberEq, filterPhoneNumberIn, filterStatusEq, filterStatusIn, filterCreatedAtLt, filterCreatedAtGt);
        // TODO: test validations
    }

    /**
     * Verify CSR phone number coverage
     *
     * Verify the coverage for a list of phone numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyPhoneNumberCoverageTest() throws ApiException {
        //VerifyPhoneNumberCoverageRequest verifyPhoneNumberCoverageRequest = null;
        //VerifyPhoneNumberCoverage201Response response = api.verifyPhoneNumberCoverage(verifyPhoneNumberCoverageRequest);
        // TODO: test validations
    }
}
