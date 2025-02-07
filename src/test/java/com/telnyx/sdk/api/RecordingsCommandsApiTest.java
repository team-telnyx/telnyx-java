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
import com.telnyx.sdk.model.GetRecordingResponse;
import com.telnyx.sdk.model.ListRecordingsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for RecordingsCommandsApi
 */
public class RecordingsCommandsApiTest {

    private final RecordingsCommandsApi api = new RecordingsCommandsApi();

    /**
     * List recordings
     *
     * Lists recordings for the authenticated user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRecordingsTest() throws ApiException {
        //String filterConferenceId = null;
        //String filterCreatedAtGte = null;
        //String filterCreatedAtLte = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListRecordingsResponse response = api.listRecordings()
        //        .filterConferenceId(filterConferenceId)
        //        .filterCreatedAtGte(filterCreatedAtGte)
        //        .filterCreatedAtLte(filterCreatedAtLte)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a recording
     *
     * Retrieve a recording from the authenticated user&#39;s recordings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveRecordingTest() throws ApiException {
        //String id = null;
        //GetRecordingResponse response = api.retrieveRecording(id);
        // TODO: test validations
    }
}
