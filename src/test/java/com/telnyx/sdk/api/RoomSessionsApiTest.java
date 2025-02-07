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
import com.telnyx.sdk.model.ActionSuccessResponse;
import com.telnyx.sdk.model.ActionsParticipantsRequest;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.GetRoomSessionResponse;
import com.telnyx.sdk.model.ListRoomParticipantsResponse;
import com.telnyx.sdk.model.ListRoomSessionsResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for RoomSessionsApi
 */
public class RoomSessionsApiTest {

    private final RoomSessionsApi api = new RoomSessionsApi();

    /**
     * Kick participants from a room session.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void kickParticipantInSessionTest() throws ApiException {
        //UUID roomSessionId = null;
        //ActionsParticipantsRequest actionsParticipantsRequest = null;
        //ActionSuccessResponse response = api.kickParticipantInSession(roomSessionId, actionsParticipantsRequest);
        // TODO: test validations
    }

    /**
     * View a list of room sessions.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRoomSessionsTest() throws ApiException {
        //LocalDate filterDateCreatedAtEq = null;
        //LocalDate filterDateCreatedAtGte = null;
        //LocalDate filterDateCreatedAtLte = null;
        //LocalDate filterDateUpdatedAtEq = null;
        //LocalDate filterDateUpdatedAtGte = null;
        //LocalDate filterDateUpdatedAtLte = null;
        //LocalDate filterDateEndedAtEq = null;
        //LocalDate filterDateEndedAtGte = null;
        //LocalDate filterDateEndedAtLte = null;
        //String filterRoomId = null;
        //Boolean filterActive = null;
        //Boolean includeParticipants = null;
        //Integer pageSize = null;
        //Integer pageNumber = null;
        //ListRoomSessionsResponse response = api.listRoomSessions(filterDateCreatedAtEq, filterDateCreatedAtGte, filterDateCreatedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateEndedAtEq, filterDateEndedAtGte, filterDateEndedAtLte, filterRoomId, filterActive, includeParticipants, pageSize, pageNumber);
        // TODO: test validations
    }

    /**
     * Mute participants in room session.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void muteParticipantInSessionTest() throws ApiException {
        //UUID roomSessionId = null;
        //ActionsParticipantsRequest actionsParticipantsRequest = null;
        //ActionSuccessResponse response = api.muteParticipantInSession(roomSessionId, actionsParticipantsRequest);
        // TODO: test validations
    }

    /**
     * View a list of room participants.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nestedListRoomParticipantsTest() throws ApiException {
        //UUID roomSessionId = null;
        //LocalDate filterDateJoinedAtEq = null;
        //LocalDate filterDateJoinedAtGte = null;
        //LocalDate filterDateJoinedAtLte = null;
        //LocalDate filterDateUpdatedAtEq = null;
        //LocalDate filterDateUpdatedAtGte = null;
        //LocalDate filterDateUpdatedAtLte = null;
        //LocalDate filterDateLeftAtEq = null;
        //LocalDate filterDateLeftAtGte = null;
        //LocalDate filterDateLeftAtLte = null;
        //String filterContext = null;
        //Integer pageSize = null;
        //Integer pageNumber = null;
        //ListRoomParticipantsResponse response = api.nestedListRoomParticipants(roomSessionId, filterDateJoinedAtEq, filterDateJoinedAtGte, filterDateJoinedAtLte, filterDateUpdatedAtEq, filterDateUpdatedAtGte, filterDateUpdatedAtLte, filterDateLeftAtEq, filterDateLeftAtGte, filterDateLeftAtLte, filterContext, pageSize, pageNumber);
        // TODO: test validations
    }

    /**
     * Unmute participants in room session.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unmuteParticipantInSessionTest() throws ApiException {
        //UUID roomSessionId = null;
        //ActionsParticipantsRequest actionsParticipantsRequest = null;
        //ActionSuccessResponse response = api.unmuteParticipantInSession(roomSessionId, actionsParticipantsRequest);
        // TODO: test validations
    }

    /**
     * View a room session.
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void viewRoomSessionTest() throws ApiException {
        //UUID roomSessionId = null;
        //Boolean includeParticipants = null;
        //GetRoomSessionResponse response = api.viewRoomSession(roomSessionId, includeParticipants);
        // TODO: test validations
    }
}
