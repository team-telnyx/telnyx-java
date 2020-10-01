/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.apis;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.models.CreateFqdnRequest;
import com.telnyx.sdk.models.FqdnResponse;
import com.telnyx.sdk.models.ListFqdnsResponse;
import java.util.UUID;
import com.telnyx.sdk.models.UpdateFqdnRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FqdNsApi
 */
@Ignore
public class FqdNsApiTest {

    private final FqdNsApi api = new FqdNsApi();

    /**
     * Create an Fqdn
     *
     * Create a new FQDN object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFqdnTest() throws ApiException {
        CreateFqdnRequest body = null;
        FqdnResponse response = api.createFqdn(body);

        // TODO: test validations
    }
    /**
     * Delete an Fqdn
     *
     * Delete an FQDN.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFqdnTest() throws ApiException {
        UUID id = null;
        FqdnResponse response = api.deleteFqdn(id);

        // TODO: test validations
    }
    /**
     * List Fqdns
     *
     * Get all FQDNs belonging to the user that match the given filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFqdnsTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        String filterConnectionId = null;
        String filterFqdn = null;
        Integer filterPort = null;
        String filterDnsRecordType = null;
        ListFqdnsResponse response = api.listFqdns(pageNumber, pageSize, filterConnectionId, filterFqdn, filterPort, filterDnsRecordType);

        // TODO: test validations
    }
    /**
     * Retrieve an Fqdn
     *
     * Return the details regarding a specific FQDN.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveFqdnTest() throws ApiException {
        UUID id = null;
        FqdnResponse response = api.retrieveFqdn(id);

        // TODO: test validations
    }
    /**
     * Update an Fqdn
     *
     * Update the details of a specific FQDN.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFqdnTest() throws ApiException {
        UUID id = null;
        UpdateFqdnRequest body = null;
        FqdnResponse response = api.updateFqdn(id, body);

        // TODO: test validations
    }
}