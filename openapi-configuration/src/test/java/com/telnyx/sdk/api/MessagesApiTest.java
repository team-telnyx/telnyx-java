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
import com.telnyx.sdk.model.CreateGroupMMSMessageRequest;
import com.telnyx.sdk.model.CreateLongCodeMessageRequest;
import com.telnyx.sdk.model.CreateMessageRequest;
import com.telnyx.sdk.model.CreateNumberPoolMessageRequest;
import com.telnyx.sdk.model.CreateShortCodeMessageRequest;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetMessage200Response;
import com.telnyx.sdk.model.MessageResponse;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    private final MessagesApi api = new MessagesApi();

    /**
     * Send a group MMS message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupMmsMessageTest() throws ApiException {
        //CreateGroupMMSMessageRequest createGroupMMSMessageRequest = null;
        //MessageResponse response = api.createGroupMmsMessage(createGroupMMSMessageRequest);
        // TODO: test validations
    }

    /**
     * Send a long code message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLongCodeMessageTest() throws ApiException {
        //CreateLongCodeMessageRequest createLongCodeMessageRequest = null;
        //MessageResponse response = api.createLongCodeMessage(createLongCodeMessageRequest);
        // TODO: test validations
    }

    /**
     * Send a message using number pool
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNumberPoolMessageTest() throws ApiException {
        //CreateNumberPoolMessageRequest createNumberPoolMessageRequest = null;
        //MessageResponse response = api.createNumberPoolMessage(createNumberPoolMessageRequest);
        // TODO: test validations
    }

    /**
     * Send a short code message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createShortCodeMessageTest() throws ApiException {
        //CreateShortCodeMessageRequest createShortCodeMessageRequest = null;
        //MessageResponse response = api.createShortCodeMessage(createShortCodeMessageRequest);
        // TODO: test validations
    }

    /**
     * Retrieve a message
     *
     * Note: This API endpoint can only retrieve messages that are no older than 10 days since their creation. If you require messages older than this, please generate an [MDR report.](https://developers.telnyx.com/api/v1/mission-control/add-mdr-request)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMessageTest() throws ApiException {
        //UUID id = null;
        //GetMessage200Response response = api.getMessage(id);
        // TODO: test validations
    }

    /**
     * Send a message
     *
     * Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.  This endpoint allows you to send a message with any messaging resource. Current messaging resources include: long-code, short-code, number-pool, and alphanumeric-sender-id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        //CreateMessageRequest createMessageRequest = null;
        //MessageResponse response = api.sendMessage(createMessageRequest);
        // TODO: test validations
    }

}
