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
import com.telnyx.sdk.model.ListInboundChannels200Response;
import com.telnyx.sdk.model.UpdateOutboundChannels200Response;
import com.telnyx.sdk.model.UpdateOutboundChannelsDefaultResponse;
import com.telnyx.sdk.model.UpdateOutboundChannelsRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InboundChannelsApi
 */
public class InboundChannelsApiTest {

    private final InboundChannelsApi api = new InboundChannelsApi();

    /**
     * List your inbound channels
     *
     * Returns the inbound channels for your account. Inbound channels allows you to use Channel Billing for calls to your Telnyx phone numbers. Please check the Telnyx Support Articles section for full information and examples of how to utilize Channel Billing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInboundChannelsTest() throws ApiException {
        //ListInboundChannels200Response response = api.listInboundChannels();
        // TODO: test validations
    }

    /**
     * Update inbound channels
     *
     * Update the inbound channels for the account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOutboundChannelsTest() throws ApiException {
        //UpdateOutboundChannelsRequest updateOutboundChannelsRequest = null;
        //UpdateOutboundChannels200Response response = api.updateOutboundChannels(updateOutboundChannelsRequest);
        // TODO: test validations
    }

}
