/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import com.telnyx.sdk.model.ListRegulatoryRequirements200Response;
import com.telnyx.sdk.model.ListRegulatoryRequirementsPhoneNumbers200Response;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegulatoryRequirementsApi
 */
public class RegulatoryRequirementsApiTest {

    private final RegulatoryRequirementsApi api = new RegulatoryRequirementsApi();

    /**
     * Retrieve regulatory requirements
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRegulatoryRequirementsTest() throws ApiException {
        //String filterPhoneNumber = null;
        //String filterRequirementGroupId = null;
        //String filterCountryCode = null;
        //String filterPhoneNumberType = null;
        //String filterAction = null;
        //ListRegulatoryRequirements200Response response = api.listRegulatoryRequirements(filterPhoneNumber, filterRequirementGroupId, filterCountryCode, filterPhoneNumberType, filterAction);
        // TODO: test validations
    }

    /**
     * Retrieve regulatory requirements for a list of phone numbers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRegulatoryRequirementsPhoneNumbersTest() throws ApiException {
        //String filterPhoneNumber = null;
        //ListRegulatoryRequirementsPhoneNumbers200Response response = api.listRegulatoryRequirementsPhoneNumbers(filterPhoneNumber);
        // TODO: test validations
    }

}
