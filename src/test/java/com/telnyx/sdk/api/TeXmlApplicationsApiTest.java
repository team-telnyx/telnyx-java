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
import com.telnyx.sdk.model.CreateTexmlApplicationRequest;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.GetAllTexmlApplicationsResponse;
import com.telnyx.sdk.model.TexmlApplicationResponse;
import com.telnyx.sdk.model.UpdateTexmlApplicationRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for TeXmlApplicationsApi
 */
public class TeXmlApplicationsApiTest {

    private final TeXmlApplicationsApi api = new TeXmlApplicationsApi();

    /**
     * Creates a TeXML Application
     *
     * Creates a TeXML Application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTexmlApplicationTest() throws ApiException {
        //CreateTexmlApplicationRequest createTexmlApplicationRequest = null;
        //TexmlApplicationResponse response = api.createTexmlApplication(createTexmlApplicationRequest);
        // TODO: test validations
    }

    /**
     * Deletes a TeXML Application
     *
     * Deletes a TeXML Application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTexmlApplicationTest() throws ApiException {
        //UUID id = null;
        //TexmlApplicationResponse response = api.deleteTexmlApplication(id);
        // TODO: test validations
    }

    /**
     * List all TeXML Applications
     *
     * Returns a list of your TeXML Applications.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTexmlApplicationsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterFriendlyNameContains = null;
        //String filterOutboundVoiceProfileId = null;
        //String sort = null;
        //GetAllTexmlApplicationsResponse response = api.findTexmlApplications(pageNumber, pageSize, filterFriendlyNameContains, filterOutboundVoiceProfileId, sort);
        // TODO: test validations
    }

    /**
     * Retrieve a TeXML Application
     *
     * Retrieves the details of an existing TeXML Application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTexmlApplicationTest() throws ApiException {
        //UUID id = null;
        //TexmlApplicationResponse response = api.getTexmlApplication(id);
        // TODO: test validations
    }

    /**
     * Update a TeXML Application
     *
     * Updates settings of an existing TeXML Application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTexmlApplicationTest() throws ApiException {
        //UUID id = null;
        //UpdateTexmlApplicationRequest updateTexmlApplicationRequest = null;
        //TexmlApplicationResponse response = api.updateTexmlApplication(id, updateTexmlApplicationRequest);
        // TODO: test validations
    }
}
