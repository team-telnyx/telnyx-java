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
import com.telnyx.sdk.model.CreateRequirementGroupRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.RequirementGroup;
import com.telnyx.sdk.model.SubNumberOrderRequirementGroupResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateNumberOrderPhoneNumberRequirementGroup200Response;
import com.telnyx.sdk.model.UpdateNumberOrderPhoneNumberRequirementGroupRequest;
import com.telnyx.sdk.model.UpdateRequirementGroupRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RequirementGroupsApi
 */
public class RequirementGroupsApiTest {

    private final RequirementGroupsApi api = new RequirementGroupsApi();

    /**
     * Create a new requirement group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRequirementGroupTest() throws ApiException {
        //CreateRequirementGroupRequest createRequirementGroupRequest = null;
        //RequirementGroup response = api.createRequirementGroup(createRequirementGroupRequest);
        // TODO: test validations
    }

    /**
     * Delete a requirement group by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRequirementGroupTest() throws ApiException {
        //String id = null;
        //RequirementGroup response = api.deleteRequirementGroup(id);
        // TODO: test validations
    }

    /**
     * Get a single requirement group by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRequirementGroupTest() throws ApiException {
        //String id = null;
        //RequirementGroup response = api.getRequirementGroup(id);
        // TODO: test validations
    }

    /**
     * List requirement groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRequirementGroupsTest() throws ApiException {
        //String filterCountryCode = null;
        //String filterPhoneNumberType = null;
        //String filterAction = null;
        //String filterStatus = null;
        //String filterCustomerReference = null;
        //List<RequirementGroup> response = api.getRequirementGroups(filterCountryCode, filterPhoneNumberType, filterAction, filterStatus, filterCustomerReference);
        // TODO: test validations
    }

    /**
     * Submit a Requirement Group for Approval
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitRequirementGroupTest() throws ApiException {
        //String id = null;
        //RequirementGroup response = api.submitRequirementGroup(id);
        // TODO: test validations
    }

    /**
     * Update requirement group for a phone number order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNumberOrderPhoneNumberRequirementGroupTest() throws ApiException {
        //UUID id = null;
        //UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest = null;
        //UpdateNumberOrderPhoneNumberRequirementGroup200Response response = api.updateNumberOrderPhoneNumberRequirementGroup(id, updateNumberOrderPhoneNumberRequirementGroupRequest);
        // TODO: test validations
    }

    /**
     * Update requirement values in requirement group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRequirementGroupTest() throws ApiException {
        //String id = null;
        //UpdateRequirementGroupRequest updateRequirementGroupRequest = null;
        //RequirementGroup response = api.updateRequirementGroup(id, updateRequirementGroupRequest);
        // TODO: test validations
    }

    /**
     * Update requirement group for a sub number order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSubNumberOrderRequirementGroupTest() throws ApiException {
        //UUID id = null;
        //UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest = null;
        //SubNumberOrderRequirementGroupResponse response = api.updateSubNumberOrderRequirementGroup(id, updateNumberOrderPhoneNumberRequirementGroupRequest);
        // TODO: test validations
    }

}
