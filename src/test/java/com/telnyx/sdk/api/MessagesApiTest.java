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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telnyx.sdk.ApiClient;
import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.Configuration;
import com.telnyx.sdk.JSON;
import com.telnyx.sdk.auth.HttpBearerAuth;
import com.telnyx.sdk.model.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * API tests for MessagesApi
 */
public class MessagesApiTest {

    private final MessagesApi api = new MessagesApi();
    private ObjectMapper mapper;

    @Ignore
    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);

        mapper = new JSON().getMapper();
    }

    /**
     * Send a long code message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void createLongCodeMessage_whenRequestIsValid_sendsMessage() throws ApiException {
        CreateLongCodeMessageRequest createLongCodeMessageRequest = new CreateLongCodeMessageRequest()
                .from(TestConfiguration.TEST_FROM_NUMBER)
                .to(TestConfiguration.TEST_TO_NUMBER)
                .text("Long Code Message Test")
                .useProfileWebhooks(false)
                .webhookUrl("http://webhook.com");

        MessageResponse actualResponse = api.createLongCodeMessage(createLongCodeMessageRequest);

        assertNotNull(actualResponse.getData().getId());
    }

    /**
     * Send a message
     *
     * Send a message with a Phone Number, Alphanumeric Sender ID, Short Code or Number Pool.  This endpoint allows you to send a message with any messaging resource. Current messaging resources include: long-code, short-code, number-pool, and alphanumeric-sender-id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void createMessage_whenRequestIsValid_sendsMessage() throws ApiException {
        CreateMessageRequest createMessageRequest = new CreateMessageRequest()
                .from(TestConfiguration.TEST_FROM_NUMBER)
                .to(TestConfiguration.TEST_TO_NUMBER)
                .text("Message Test")
                .useProfileWebhooks(false)
                .webhookUrl("http://webhook.com");

        MessageResponse actualResponse = api.sendMessage(createMessageRequest);

        assertNotNull(actualResponse.getData().getId());
    }

    /**
     * Send a message using number pool
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void createNumberPoolMessage_whenRequestIsValid_sendsMessage() throws ApiException {
        CreateNumberPoolMessageRequest createNumberPoolMessageRequest = new CreateNumberPoolMessageRequest()
                .messagingProfileId(TestConfiguration.EXISTING_MESSAGING_PROFILE_ID)
                .to(TestConfiguration.TEST_TO_NUMBER)
                .text("Number Pool Message Test")
                .useProfileWebhooks(false)
                .webhookUrl("http://webhook.com");

        MessageResponse actualResponse = api.createNumberPoolMessage(createNumberPoolMessageRequest);

        assertNotNull(actualResponse.getData().getId());
    }

    /**
     * Send a short code message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void createShortCodeMessage_whenRequestIsValid_sendsMessage() throws ApiException {
        //CreateShortCodeMessageRequest createShortCodeMessageRequest = null;
        //MessageResponse response = api.createShortCodeMessage(createShortCodeMessageRequest);
        // TODO: test validations
    }

    /**
     * Retrieve a message
     *
     * Note: This API endpoint can only retrieve messages that are no older than 10 days since their creation. If you require messages older than this, please generate an [MDR report.](https://developers.telnyx.com/docs/api/v1/reports/MDR-Reports)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void retrieveMessage_whenMessageExists_returnsMessage() throws ApiException {
        CreateMessageRequest createMessageRequest = new CreateMessageRequest()
                .from(TestConfiguration.TEST_FROM_NUMBER)
                .to(TestConfiguration.TEST_TO_NUMBER)
                .text("Existing Message");

        UUID expectedId = api.sendMessage(createMessageRequest).getData().getId();

        MessageResponse actualResponse = api.getMessage(expectedId);

        assertEquals(expectedId, actualResponse.getData().getId());
    }

    /**
     * Parses the incoming webhook received when an outbound message is sent
     *
     * @throws IOException
     *          if the test fixture can't be loaded
     */
    @Ignore
    @Test
    public void webhook_whenOutboundMessageSent_receivesMessageSentEvent() throws IOException {
        InputStream sentEventFixtureJson = getClass().getClassLoader().getResourceAsStream("webhook-message-sent-event.json");

        OutboundMessageEvent actualOutboundMessageEvent = mapper.readValue(sentEventFixtureJson, OutboundMessageEvent.class);

        assertNotNull(actualOutboundMessageEvent.getData());
    }

    /**
     * Parses the incoming webhook received when an outbound message is finalized
     *
     * @throws IOException
     *          if the test fixture can't be loaded
     */
    @Ignore
    @Test
    public void webhook_whenOutboundMessageFinalized_receivesMessageFinalizedEvent() throws IOException {
        InputStream finalizedEventFixtureJson = getClass().getClassLoader().getResourceAsStream("webhook-message-finalized-event.json");

        OutboundMessageEvent actualOutboundMessageEvent = mapper.readValue(finalizedEventFixtureJson, OutboundMessageEvent.class);

        assertNotNull(actualOutboundMessageEvent.getData());
    }
}
