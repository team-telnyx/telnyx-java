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

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * API tests for MessagingProfilesApi
 */
public class MessagingProfilesApiTest {

    private final MessagingProfilesApi api = new MessagingProfilesApi();
    private MessagingProfile existingMessagingProfile;
    @Ignore
    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);

        NumberPoolSettings numberPoolSettings = new NumberPoolSettings()
                .geomatch(false)
                .longCodeWeight(BigDecimal.ONE)
                .skipUnhealthy(true)
                .stickySender(false)
                .tollFreeWeight(BigDecimal.valueOf(10));

        CreateMessagingProfileRequest createMessagingProfileRequest = new CreateMessagingProfileRequest().name("existing-test-profile")
                .enabled(true)
                .numberPoolSettings(numberPoolSettings)
                .webhookApiVersion(CreateMessagingProfileRequest.WebhookApiVersionEnum._1)
                .webhookUrl("http://webhook.com")
                .webhookFailoverUrl("http://webhook-failover.com");

        try {
            existingMessagingProfile = api.createMessagingProfile(createMessagingProfileRequest).getData();
        } catch (Exception e) {
            fail("Test Setup Failure - Unable to create messaging profile: " + e.getMessage());
        }
    }
    @Ignore
    @After
    public void tearDown() {
        try {
            api.deleteMessagingProfile(existingMessagingProfile.getId());
        } catch (ApiException e) {
            // ignore
        }
    }

    /**
     * Create a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void createMessagingProfile_whenRequestIsValid_returnsCreatedMessagingProfile() throws ApiException {
        NumberPoolSettings numberPoolSettings = new NumberPoolSettings()
                .geomatch(false)
                .longCodeWeight(BigDecimal.ONE)
                .skipUnhealthy(true)
                .stickySender(false)
                .tollFreeWeight(BigDecimal.valueOf(10));

        CreateMessagingProfileRequest createMessagingProfileRequest = new CreateMessagingProfileRequest().name("test-profile-1")
                .enabled(true)
                .numberPoolSettings(numberPoolSettings)
                .webhookApiVersion(CreateMessagingProfileRequest.WebhookApiVersionEnum._1)
                .webhookUrl("http://webhook.com")
                .webhookFailoverUrl("http://webhook-failover.com");

        UUID actualId = api.createMessagingProfile(createMessagingProfileRequest)
                .getData()
                .getId();

        assertNotNull(actualId);
    }

    /**
     * Delete a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void deleteMessagingProfile_whenProfileExists_returnsDeletedProfile() throws ApiException {
        UUID actualMessagingProfileId = api.deleteMessagingProfile(existingMessagingProfile.getId())
                .getData()
                .getId();

        assertEquals(existingMessagingProfile.getId(), actualMessagingProfileId);
    }

    /**
     * List messaging profile metrics
     *
     * @throws ApiException if the Api call fails
     */

    /**
     * List phone numbers associated with a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void listMessagingProfilePhoneNumbers_whenNumbersExist_returnsNumbers() throws ApiException {
        ListMessagingProfilePhoneNumbersResponse actualResponse = api.listProfilePhoneNumbers(existingMessagingProfile.getId())
                .pageNumber(1)
                .pageSize(20)
                .execute();

        assertNotNull(actualResponse);
    }

    /**
     * List short codes associated with a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void listMessagingProfileShortCodesTest() throws ApiException {
        //UUID id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListMessagingProfileShortCodesResponse response = api.listMessagingProfileShortCodes(id)
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * List messaging profiles
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void listMessagingProfilesTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //ListMessagingProfilesResponse response = api.listMessagingProfiles()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Ignore
    @Test
    public void retrieveMessagingProfile_whenProfileExists_returnsProfile() throws ApiException {
        MessagingProfile actualMessagingProfile = api.retrieveMessagingProfile(existingMessagingProfile.getId()).getData();

        assertEquals(existingMessagingProfile.getId(), actualMessagingProfile.getId());
    }

    /**
     * Retrieve messaging profile metrics
     *
     * @throws ApiException if the Api call fails
     */

    /**
     * Update a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void updateMessagingProfile_whenRequestIsValid_returnsUpdatedProfile() throws ApiException {
        NumberPoolSettings numberPoolSettings = new NumberPoolSettings()
                .geomatch(true)
                .longCodeWeight(BigDecimal.valueOf(10.0))
                .skipUnhealthy(false)
                .stickySender(true)
                .tollFreeWeight(BigDecimal.valueOf(2.0));

        UpdateMessagingProfileRequest updateMessagingProfileRequest = new UpdateMessagingProfileRequest()
                .name("updated-test-profile")
                .enabled(false)
                .numberPoolSettings(numberPoolSettings)
                .webhookApiVersion(UpdateMessagingProfileRequest.WebhookApiVersionEnum._2)
                .webhookUrl("http://updated-webhook.com")
                .webhookFailoverUrl("http://updated-webhook-failover.com");


        MessagingProfile actualMessagingProfile = api
                .updateMessagingProfile(existingMessagingProfile.getId(), updateMessagingProfileRequest)
                .getData();

        assertEquals(updateMessagingProfileRequest.getName(), actualMessagingProfile.getName());
        assertEquals(updateMessagingProfileRequest.getEnabled(), actualMessagingProfile.getEnabled());
        assertEquals(updateMessagingProfileRequest.getWebhookApiVersion().getValue(), actualMessagingProfile.getWebhookApiVersion().getValue());
        assertEquals(updateMessagingProfileRequest.getWebhookUrl(), actualMessagingProfile.getWebhookUrl());
        assertEquals(updateMessagingProfileRequest.getWebhookFailoverUrl(), actualMessagingProfile.getWebhookFailoverUrl());
        assertEquals(updateMessagingProfileRequest.getNumberPoolSettings(), actualMessagingProfile.getNumberPoolSettings());
    }

    /**
     * Enable number pool on a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void updateMessagingProfile_whenNumberPoolSettingsAreSent_returnsProfileWithEnabledNumberPool() throws ApiException {
        NumberPoolSettings expectedNumberPoolSettings = new NumberPoolSettings()
                .geomatch(false)
                .longCodeWeight(BigDecimal.valueOf(2.0))
                .skipUnhealthy(false)
                .stickySender(true)
                .tollFreeWeight(BigDecimal.valueOf(10.0));

        UpdateMessagingProfileRequest updateMessagingProfileRequest = new UpdateMessagingProfileRequest()
                .numberPoolSettings(expectedNumberPoolSettings);

        NumberPoolSettings actualNumberPoolSettings = api
                .updateMessagingProfile(existingMessagingProfile.getId(), updateMessagingProfileRequest)
                .getData()
                .getNumberPoolSettings();

        assertEquals(expectedNumberPoolSettings, actualNumberPoolSettings);
    }

    /**
     * Disable number pool on a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void updateMessagingProfile_whenNumberPoolSettingsNull_returnsDisabledNumberPool() throws ApiException {
        UpdateMessagingProfileRequest updateMessagingProfileRequest = new UpdateMessagingProfileRequest()
                .numberPoolSettings(null);

        NumberPoolSettings actualNumberPoolSettings = api
                .updateMessagingProfile(existingMessagingProfile.getId(), updateMessagingProfileRequest)
                .getData()
                .getNumberPoolSettings();

        assertEquals(updateMessagingProfileRequest.getNumberPoolSettings(), actualNumberPoolSettings);
    }

    /**
     * Disable a messaging profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void updateMessagingProfile_whenRequestToDisable_returnsDisabledMessagingProfile() throws ApiException {
        UpdateMessagingProfileRequest updateMessagingProfileRequest = new UpdateMessagingProfileRequest()
                .enabled(false);

        MessagingProfile actualMessagingProfile = api
                .updateMessagingProfile(existingMessagingProfile.getId(), updateMessagingProfileRequest)
                .getData();

        assertEquals(updateMessagingProfileRequest.getEnabled(), actualMessagingProfile.getEnabled());
    }

}
