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
import com.telnyx.sdk.model.CreateMessagingProfileRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.ListMessagingProfileMetricsResponse;
import com.telnyx.sdk.model.ListMessagingProfilePhoneNumbersResponse;
import com.telnyx.sdk.model.ListMessagingProfileShortCodesResponse;
import com.telnyx.sdk.model.ListMessagingProfilesResponse;
import com.telnyx.sdk.model.MessagingProfileResponse;
import com.telnyx.sdk.model.RetrieveMessagingProfileMetricsResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateMessagingProfileRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagingProfilesApi
 */
public class MessagingProfilesApiTest {

    private final MessagingProfilesApi api = new MessagingProfilesApi();

    /**
     * Create a messaging profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMessagingProfileTest() throws ApiException {
        //CreateMessagingProfileRequest createMessagingProfileRequest = null;
        //MessagingProfileResponse response = api.createMessagingProfile(createMessagingProfileRequest);
        // TODO: test validations
    }

    /**
     * Delete a messaging profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMessagingProfileTest() throws ApiException {
        //UUID id = null;
        //MessagingProfileResponse response = api.deleteMessagingProfile(id);
        // TODO: test validations
    }

    /**
     * List messaging profile metrics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessagingProfileMetricsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //UUID id = null;
        //String timeFrame = null;
        //ListMessagingProfileMetricsResponse response = api.listMessagingProfileMetrics()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .id(id)
        //        .timeFrame(timeFrame)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List phone numbers associated with a messaging profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessagingProfilePhoneNumbersTest() throws ApiException {
        //UUID id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListMessagingProfilePhoneNumbersResponse response = api.listMessagingProfilePhoneNumbers(id)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List short codes associated with a messaging profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessagingProfileShortCodesTest() throws ApiException {
        //UUID id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListMessagingProfileShortCodesResponse response = api.listMessagingProfileShortCodes(id)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List messaging profiles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessagingProfilesTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListMessagingProfilesResponse response = api.listMessagingProfiles()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a messaging profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveMessagingProfileTest() throws ApiException {
        //UUID id = null;
        //MessagingProfileResponse response = api.retrieveMessagingProfile(id);
        // TODO: test validations
    }

    /**
     * Retrieve messaging profile metrics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveMessagingProfileDetailedMetricsTest() throws ApiException {
        //UUID id = null;
        //String timeFrame = null;
        //RetrieveMessagingProfileMetricsResponse response = api.retrieveMessagingProfileDetailedMetrics(id)
        //        .timeFrame(timeFrame)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update a messaging profile
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMessagingProfileTest() throws ApiException {
        //UUID id = null;
        //UpdateMessagingProfileRequest updateMessagingProfileRequest = null;
        //MessagingProfileResponse response = api.updateMessagingProfile(id, updateMessagingProfileRequest);
        // TODO: test validations
    }

}