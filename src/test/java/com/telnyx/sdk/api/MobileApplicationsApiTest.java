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
import com.telnyx.sdk.model.CreateMobileApplicationRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.MobileApplicationResponse;
import com.telnyx.sdk.model.PushCredentialResponse;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MobileApplicationsApi
 */
public class MobileApplicationsApiTest {

    private final MobileApplicationsApi api = new MobileApplicationsApi();

    /**
     * Adds a mobile application
     *
     * Creates a new mobile application which can be android or ios based on the &#x60;type&#x60; parameter
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMobileApplicationTest() throws ApiException {
        //CreateMobileApplicationRequest createMobileApplicationRequest = null;
        //MobileApplicationResponse response = api.addMobileApplication(createMobileApplicationRequest);
        // TODO: test validations
    }

    /**
     * Adds push credential to a given mobile application
     *
     * Creates a new credential for a given mobile application
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPushCredentialTest() throws ApiException {
        //UUID mobileApplicationId = null;
        //UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = null;
        //PushCredentialResponse response = api.addPushCredential(mobileApplicationId, UNKNOWN_BASE_TYPE);
        // TODO: test validations
    }

    /**
     * Deletes a mobile application
     *
     * Deletes a mobile application based on the given &#x60;id&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMobileApplicationByIdTest() throws ApiException {
        //UUID mobileApplicationId = null;
        //api.deleteMobileApplicationById(mobileApplicationId);
        // TODO: test validations
    }

    /**
     * Retrieves mobile applications
     *
     * Retrieves all mobile applications for a user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMobileApplicationsTest() throws ApiException {
        //List<MobileApplicationResponse> response = api.getAllMobileApplications();
        // TODO: test validations
    }

    /**
     * Retrieves a given mobile application
     *
     * Retrieves a mobile application based on the given &#x60;id&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMobileApplicationByIdTest() throws ApiException {
        //UUID mobileApplicationId = null;
        //MobileApplicationResponse response = api.getMobileApplicationById(mobileApplicationId);
        // TODO: test validations
    }

    /**
     * Updates a mobile application
     *
     * Updates a mobile application based on the given &#x60;id&#x60;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMobileApplicationByIdTest() throws ApiException {
        //UUID mobileApplicationId = null;
        //CreateMobileApplicationRequest createMobileApplicationRequest = null;
        //MobileApplicationResponse response = api.updateMobileApplicationById(mobileApplicationId, createMobileApplicationRequest);
        // TODO: test validations
    }

}
