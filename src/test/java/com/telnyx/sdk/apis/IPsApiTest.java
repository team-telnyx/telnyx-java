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
import com.telnyx.sdk.models.CreateIpRequest;
import com.telnyx.sdk.models.IpResponse;
import com.telnyx.sdk.models.ListIpsResponse;
import java.util.UUID;
import com.telnyx.sdk.models.UpdateIpRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IPsApi
 */
@Ignore
public class IPsApiTest {

    private final IPsApi api = new IPsApi();

    /**
     * Create an Ip
     *
     * Create a new IP object.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIpTest() throws ApiException {
        CreateIpRequest body = null;
        IpResponse response = api.createIp(body);

        // TODO: test validations
    }
    /**
     * Delete an Ip
     *
     * Delete an IP.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIpTest() throws ApiException {
        UUID id = null;
        IpResponse response = api.deleteIp(id);

        // TODO: test validations
    }
    /**
     * List Ips
     *
     * Get all IPs belonging to the user that match the given filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIpsTest() throws ApiException {
        Integer pageNumber = null;
        Integer pageSize = null;
        String filterConnectionId = null;
        String filterIpAddress = null;
        Integer filterPort = null;
        ListIpsResponse response = api.listIps(pageNumber, pageSize, filterConnectionId, filterIpAddress, filterPort);

        // TODO: test validations
    }
    /**
     * Retrieve an Ip
     *
     * Return the details regarding a specific IP.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveIpTest() throws ApiException {
        UUID id = null;
        IpResponse response = api.retrieveIp(id);

        // TODO: test validations
    }
    /**
     * Update an Ip
     *
     * Update the details of a specific IP.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIpTest() throws ApiException {
        UUID id = null;
        UpdateIpRequest body = null;
        IpResponse response = api.updateIp(id, body);

        // TODO: test validations
    }
}