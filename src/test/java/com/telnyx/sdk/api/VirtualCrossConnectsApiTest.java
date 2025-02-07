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
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.VirtaulCrossConnectList200Response;
import com.telnyx.sdk.model.VirtaulCrossConnectRegionList200Response;
import com.telnyx.sdk.model.VirtualCrossConnectCreate;
import com.telnyx.sdk.model.VirtualCrossConnectCreate200Response;
import com.telnyx.sdk.model.VirtualCrossConnectPatch;
import com.telnyx.sdk.model.VirtualCrossConnectRegionGet200Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for VirtualCrossConnectsApi
 */
public class VirtualCrossConnectsApiTest {

    private final VirtualCrossConnectsApi api = new VirtualCrossConnectsApi();

    /**
     * List all Virtual Cross Connects
     *
     * List all Virtual Cross Connects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtaulCrossConnectListTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterNetworkId = null;
        //VirtaulCrossConnectList200Response response = api.virtaulCrossConnectList(pageNumber, pageSize, filterNetworkId);
        // TODO: test validations
    }

    /**
     * List all Virtual Cross Connect Cloud Regions
     *
     * List all Virtual Cross Connects Cloud Regions.&lt;br /&gt;&lt;br /&gt;This endpoint shows which cloud regions are available for the &#x60;region_code&#x60; your Virtual Cross Connect will be provisioned in.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtaulCrossConnectRegionListTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterRegionCode = null;
        //String filterCloudProvider = null;
        //VirtaulCrossConnectRegionList200Response response = api.virtaulCrossConnectRegionList(pageNumber, pageSize, filterRegionCode, filterCloudProvider);
        // TODO: test validations
    }

    /**
     * Create a Virtual Cross Connect
     *
     * Create a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;For AWS and GCE, you have the option of creating the primary connection first and the secondary connection later. You also have the option of disabling the primary and/or secondary connections at any time and later re-enabling them. With Azure, you do not have this option. Azure requires both the primary and secondary connections to be created at the same time and they can not be independantly disabled.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtualCrossConnectCreateTest() throws ApiException {
        //VirtualCrossConnectCreate virtualCrossConnectCreate = null;
        //VirtualCrossConnectCreate200Response response = api.virtualCrossConnectCreate(virtualCrossConnectCreate);
        // TODO: test validations
    }

    /**
     * Delete a Virtual Cross Connect
     *
     * Delete a Virtual Cross Connect.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtualCrossConnectDeleteTest() throws ApiException {
        //UUID id = null;
        //VirtualCrossConnectCreate200Response response = api.virtualCrossConnectDelete(id);
        // TODO: test validations
    }

    /**
     * Retrieve a Virtual Cross Connect
     *
     * Retrieve a Virtual Cross Connect.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtualCrossConnectGetTest() throws ApiException {
        //UUID id = null;
        //VirtualCrossConnectCreate200Response response = api.virtualCrossConnectGet(id);
        // TODO: test validations
    }

    /**
     * Provision a Virtual Cross Connect
     *
     * Provision a new Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;This endpoint is only necessary for GCE cloud regions. Once you have patched your Cloud IPs, you must POST this request to trigger the provision.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtualCrossConnectProvisionTest() throws ApiException {
        //UUID id = null;
        //VirtualCrossConnectCreate200Response response = api.virtualCrossConnectProvision(id);
        // TODO: test validations
    }

    /**
     * Retrieve a Virtual Cross Connect Cloud Regions
     *
     * Retrieve a Virtual Cross Connect Cloud Regions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtualCrossConnectRegionGetTest() throws ApiException {
        //UUID id = null;
        //VirtualCrossConnectRegionGet200Response response = api.virtualCrossConnectRegionGet(id);
        // TODO: test validations
    }

    /**
     * Update the Virtual Cross Connect
     *
     * Update the Virtual Cross Connect.&lt;br /&gt;&lt;br /&gt;Cloud IPs can only be patched during the &#x60;created&#x60; state, as GCE will only inform you of your generated IP once the pending connection requested has been accepted. Once the Virtual Cross Connect has moved to &#x60;provisioning&#x60;, the IPs can no longer be patched.&lt;br /&gt;&lt;br /&gt;Once the Virtual Cross Connect has moved to &#x60;provisioned&#x60; and you are ready to enable routing, you can toggle the routing announcements to &#x60;true&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void virtualCrossConnectUpdateTest() throws ApiException {
        //UUID id = null;
        //VirtualCrossConnectPatch virtualCrossConnectPatch = null;
        //VirtualCrossConnectCreate200Response response = api.virtualCrossConnectUpdate(id, virtualCrossConnectPatch);
        // TODO: test validations
    }
}
