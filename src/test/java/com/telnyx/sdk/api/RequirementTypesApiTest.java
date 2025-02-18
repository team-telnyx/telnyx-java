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
import com.telnyx.sdk.model.DocReqsListRequirementTypesResponse;
import com.telnyx.sdk.model.DocReqsRequirementTypeResponse;
import com.telnyx.sdk.model.Errors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for RequirementTypesApi
 */
public class RequirementTypesApiTest {

    private final RequirementTypesApi api = new RequirementTypesApi();

    /**
     * List all requirement types
     *
     * List all requirement types ordered by created_at descending
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void docReqsListRequirementTypesTest() throws ApiException {
        //String filterNameContains = null;
        //String sort = null;
        //DocReqsListRequirementTypesResponse response = api.docReqsListRequirementTypes(filterNameContains, sort);
        // TODO: test validations
    }

    /**
     * Retrieve a requirement types
     *
     * Retrieve a requirement type by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void docReqsRetrieveRequirementTypeTest() throws ApiException {
        //UUID id = null;
        //DocReqsRequirementTypeResponse response = api.docReqsRetrieveRequirementType(id);
        // TODO: test validations
    }
}
