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
import com.telnyx.sdk.model.CreateIpRequest;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.IpResponse;
import com.telnyx.sdk.model.ListIpsResponse;
import java.util.UUID;
import com.telnyx.sdk.model.UpdateIpRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpsApi
 */
public class IpsApiTest {

    private final IpsApi api = new IpsApi();

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
        //CreateIpRequest createIpRequest = null;
        //IpResponse response = api.createIp(createIpRequest);
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
        //UUID id = null;
        //IpResponse response = api.deleteIp(id);
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
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterConnectionId = null;
        //String filterIpAddress = null;
        //Integer filterPort = null;
        //ListIpsResponse response = api.listIps()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .filterConnectionId(filterConnectionId)
        //        .filterIpAddress(filterIpAddress)
        //        .filterPort(filterPort)
        //        .execute();
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
        //UUID id = null;
        //IpResponse response = api.retrieveIp(id);
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
        //UUID id = null;
        //UpdateIpRequest updateIpRequest = null;
        //IpResponse response = api.updateIp(id, updateIpRequest);
        // TODO: test validations
    }

}
