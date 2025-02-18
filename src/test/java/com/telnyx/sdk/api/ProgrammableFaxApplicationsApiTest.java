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
import com.telnyx.sdk.model.CreateFaxApplicationRequest;
import com.telnyx.sdk.model.InlineResponse200;
import com.telnyx.sdk.model.InlineResponse201;
import com.telnyx.sdk.model.UpdateFaxApplicationRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ProgrammableFaxApplicationsApi
 */
public class ProgrammableFaxApplicationsApiTest {

    private final ProgrammableFaxApplicationsApi api =
        new ProgrammableFaxApplicationsApi();

    /**
     * Creates a Fax Application
     *
     * Creates a new Fax Application based on the parameters sent in the request. The application name and webhook URL are required. Once created, you can assign phone numbers to your application using the &#x60;/phone_numbers&#x60; endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFaxApplicationTest() throws ApiException {
        //CreateFaxApplicationRequest createFaxApplicationRequest = null;
        //InlineResponse201 response = api.createFaxApplication(createFaxApplicationRequest);
        // TODO: test validations
    }

    /**
     * Deletes a Fax Application
     *
     * Permanently deletes a Fax Application. Deletion may be prevented if the application is in use by phone numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFaxApplicationTest() throws ApiException {
        //String id = null;
        //InlineResponse201 response = api.deleteFaxApplication(id);
        // TODO: test validations
    }

    /**
     * Retrieve a Fax Application
     *
     * Return the details of an existing Fax Application inside the &#39;data&#39; attribute of the response.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFaxApplicationTest() throws ApiException {
        //String id = null;
        //InlineResponse201 response = api.getFaxApplication(id);
        // TODO: test validations
    }

    /**
     * List all Fax Applications
     *
     * This endpoint returns a list of your Fax Applications inside the &#39;data&#39; attribute of the response. You can adjust which applications are listed by using filters. Fax Applications are used to configure how you send and receive faxes using the Programmable Fax API with Telnyx.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFaxApplicationsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterApplicationNameContains = null;
        //String filterOutboundVoiceProfileId = null;
        //String sort = null;
        //InlineResponse200 response = api.listFaxApplications(pageNumber, pageSize, filterApplicationNameContains, filterOutboundVoiceProfileId, sort);
        // TODO: test validations
    }

    /**
     * Update a Fax Application
     *
     * Updates settings of an existing Fax Application based on the parameters of the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFaxApplicationTest() throws ApiException {
        //String id = null;
        //UpdateFaxApplicationRequest updateFaxApplicationRequest = null;
        //InlineResponse201 response = api.updateFaxApplication(id, updateFaxApplicationRequest);
        // TODO: test validations
    }
}
