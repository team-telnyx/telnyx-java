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
import com.telnyx.sdk.model.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * API tests for MessagingHostedNumberApi
 */
public class MessagingHostedNumberApiTest {

    private final MessagingHostedNumberApi api = new MessagingHostedNumberApi();

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);
    }

    /**
     * Create a messaging hosted number order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMessagingHostedNumberOrderTest() throws ApiException {
        //CreateMessagingHostedNumberOrderRequest createMessagingHostedNumberOrderRequest = null;
        //RetrieveMessagingHostedNumberOrderResponse response = api.createMessagingHostedNumberOrder(createMessagingHostedNumberOrderRequest);
        // TODO: test validations
    }

    /**
     * Delete a messaging hosted number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMessagingHostedNumberTest() throws ApiException {
        //String id = null;
        //RetrieveMessagingHostedNumberResponse response = api.deleteMessagingHostedNumber(id);
        // TODO: test validations
    }

    /**
     * List messaging hosted number orders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMessagingHostedNumberOrderTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListMessagingHostedNumberOrderResponse response = api.listMessagingHostedNumberOrder()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a messaging hosted number order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveMessagingHostedNumberOrderTest() throws ApiException {
        //String id = null;
        //RetrieveMessagingHostedNumberOrderResponse response = api.retrieveMessagingHostedNumberOrder(id);
        // TODO: test validations
    }

    /**
     * Upload file required for a messaging hosted number order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileMessagingHostedNumberOrderTest_whenUploadingValidFiles_returnsSuccess() throws ApiException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file1 = new File(classLoader.getResource("dummy1.pdf").getFile());
        File file2 = new File(classLoader.getResource("dummy2.pdf").getFile());

        String messagingHostedNumberOrderId = "80017a9e-8d6d-4497-a14e-dd89ec2d6db8";
    }

    /**
     * Upload files must be pdfs
     *
     */

}
