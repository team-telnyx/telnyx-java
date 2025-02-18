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
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.PaginatedVerificationRequestStatus;
import com.telnyx.sdk.model.TFVerificationRequest;
import com.telnyx.sdk.model.TFVerificationStatus;
import com.telnyx.sdk.model.VerificationRequestEgress;
import com.telnyx.sdk.model.VerificationRequestStatus;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for MessagingTollfreeVerificationApi
 */
public class MessagingTollfreeVerificationApiTest {

    private final MessagingTollfreeVerificationApi api =
        new MessagingTollfreeVerificationApi();

    /**
     * Get Verification Request
     *
     * Get a single verification request by its ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVerificationRequestTest() throws ApiException {
        //UUID id = null;
        //VerificationRequestStatus response = api.getVerificationRequest(id);
        // TODO: test validations
    }

    /**
     * List Verification Requests
     *
     * Get a list of previously-submitted tollfree verification requests
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVerificationRequestsTest() throws ApiException {
        //Integer page = null;
        //Integer pageSize = null;
        //OffsetDateTime dateStart = null;
        //OffsetDateTime dateEnd = null;
        //TFVerificationStatus status = null;
        //String phoneNumber = null;
        //PaginatedVerificationRequestStatus response = api.listVerificationRequests(page, pageSize, dateStart, dateEnd, status, phoneNumber);
        // TODO: test validations
    }

    /**
     * Submit Verification Request
     *
     * Submit a new tollfree verification request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitVerificationRequestTest() throws ApiException {
        //TFVerificationRequest tfVerificationRequest = null;
        //VerificationRequestEgress response = api.submitVerificationRequest(tfVerificationRequest);
        // TODO: test validations
    }

    /**
     * Update Verification Request
     *
     * Update an existing tollfree verification request. This is particularly useful when there are pending customer actions to be taken.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVerificationRequestTest() throws ApiException {
        //UUID id = null;
        //TFVerificationRequest tfVerificationRequest = null;
        //VerificationRequestEgress response = api.updateVerificationRequest(id, tfVerificationRequest);
        // TODO: test validations
    }
}
