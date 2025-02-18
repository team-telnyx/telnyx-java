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
import com.telnyx.sdk.model.GcbChannelZone;
import com.telnyx.sdk.model.GcbPhoneNumber;
import com.telnyx.sdk.model.GetGcbChannelZonesRequestResponse;
import com.telnyx.sdk.model.GetGcbPhoneNumbersRequestResponse;
import com.telnyx.sdk.model.ListChannelZonesByPhoneNumber;
import com.telnyx.sdk.model.UpdateChannelZone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ChannelZonesApi
 */
public class ChannelZonesApiTest {

    private final ChannelZonesApi api = new ChannelZonesApi();

    /**
     * Assign a phone number to a channel zone
     *
     * You should own the phone number being assigned to the channel zone. Remember that you should reserve channels in this channel zone, otherwise you won&#39;t be able to receive incoming calls.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignPhoneNumberTest() throws ApiException {
        //String channelZoneId = null;
        //ListChannelZonesByPhoneNumber body = null;
        //GcbPhoneNumber response = api.assignPhoneNumber(channelZoneId, body);
        // TODO: test validations
    }

    /**
     * Get a specific channel zone
     *
     * Get a specific channel zone
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelZoneTest() throws ApiException {
        //String channelZoneId = null;
        //GcbChannelZone response = api.getChannelZone(channelZoneId);
        // TODO: test validations
    }

    /**
     * Get list of channel zones
     *
     * List of channel zones with their countries
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelZonesTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //GetGcbChannelZonesRequestResponse response = api.getChannelZones(pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Get the list of phone numbers assigned to a channel zone
     *
     * Retrieve the assigned phone numbers in a channel zone. Phone numbers assigned to a channel zone can receive concurrent calls up to the quantity reserved in that channel zone. Additional concurrent calls are rejected with a busy signal.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPhoneNumbersTest() throws ApiException {
        //String channelZoneId = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //GetGcbPhoneNumbersRequestResponse response = api.getPhoneNumbers(channelZoneId, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Patch a channel zone
     *
     * Change the amount of reserved channels at a given channel zone
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchGroupTest() throws ApiException {
        //String channelZoneId = null;
        //UpdateChannelZone body = null;
        //GcbChannelZone response = api.patchGroup(channelZoneId, body);
        // TODO: test validations
    }

    /**
     * Unassign a phone number from a channel zone
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unassignPhoneNumberTest() throws ApiException {
        //String channelZoneId = null;
        //String phoneNumber = null;
        //api.unassignPhoneNumber(channelZoneId, phoneNumber);
        // TODO: test validations
    }
}
