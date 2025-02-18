/*
 * Telnyx 10DLC API
 * # Overview The Telnyx 10DLC API facilitates interaction with The Campaign Registry (TCR), allowing the creation and registration of brands and campaigns with TCR.  # API Interaction ## Request Authorization Telnyx 10DLC API endpoints require authorization for each request. To properly authorize requests, send an Authorization header with `Bearer ` plus your Telnyx API key as the value. See the following curl request for example usage:  ```sh curl --location --request GET 'https://api.telnyx.com/10dlc/example/endpoint' \\  --header 'Authorization: Bearer YOUR_API_KEY_GOES_HERE' \\  --data-raw '' ```  You can obtain your API key by logging into your <a href=\"https://portal.telnyx.com\">Telnyx portal account</a> and clicking the \"API Keys\" tab. From there, you can copy your desired API key for use in your requests, similar to the above example curl request.  ## The 10DLC Work Flow 1. Create a brand  2. Apply for brand vetting  3. Create a campaign or campaigns (associated with the created brand)  4. Assign a phone number or phone numbers to the created campaign ## 10DLC Costs **Brands:** 1. Brand registration: $4 one time charge  2.  Brand vetting: $40 one time charge  **Campaigns:**  1. Campaign registration T-Mobile: $50 one time charge  2. Campaign creation: first 3 month's charge upfront. After the first 3 months, this charge will change to a once a month recurring charge (see charge values below, based on campaign use case)     a. Charity Campaign Use Case: $15 upfront (first 3 months), and $5 month to month after     b. Low Mixed Volume Campaign Use Case: $6 upfront (first 3 months), and $2 month to month after     c. Any Other Campaign Use Case: $30 upfront (first 3 months), and $10 month to month after 3. Phone number to campaign assignment: $0.03 one time charge for each assignment  ## Frequently Asked Questions For frequently asked questions, visit <a href=\"https://support.telnyx.com/en/articles/3679260-frequently-asked-questions-about-10dlc\">Telnyx 10DLC FAQs</a>.
 *
 * The version of the OpenAPI document: 0.1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.CreateExternalConnectionRequest;
import com.telnyx.sdk.model.CreateExternalConnectionUploadRequest;
import com.telnyx.sdk.model.CreateUploadRequestResponse;
import com.telnyx.sdk.model.CreateUploadRequestResponse1;
import com.telnyx.sdk.model.DismissRequestWasSuccessful;
import com.telnyx.sdk.model.ErrorResponse;
import com.telnyx.sdk.model.ExternalConnectionResponse;
import com.telnyx.sdk.model.GetAllCivicAddressesResponse;
import com.telnyx.sdk.model.GetAllExternalConnectionsResponse;
import com.telnyx.sdk.model.GetCivicAddressResponse;
import com.telnyx.sdk.model.GetExternalConnectionPhoneNumberResponse;
import com.telnyx.sdk.model.GetLogMessageResponse;
import com.telnyx.sdk.model.GetReleaseResponse;
import com.telnyx.sdk.model.GetUploadResponse;
import com.telnyx.sdk.model.GetUploadsStatusResponse;
import com.telnyx.sdk.model.ListExternalConnectionPhoneNumbersResponse;
import com.telnyx.sdk.model.ListLogMessagesResponse;
import com.telnyx.sdk.model.ListReleasesResponse;
import com.telnyx.sdk.model.ListUploadsResponse;
import com.telnyx.sdk.model.LocationResponse;
import com.telnyx.sdk.model.UpdateExternalConnectionPhoneNumberRequest;
import com.telnyx.sdk.model.UpdateExternalConnectionRequest;
import com.telnyx.sdk.model.UpdateLocationRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for ExternalConnectionsApi
 */
public class ExternalConnectionsApiTest {

    private final ExternalConnectionsApi api = new ExternalConnectionsApi();

    /**
     * Creates an External Connection
     *
     * Creates a new External Connection based on the parameters sent in the request. The external_sip_connection and outbound voice profile id are required. Once created, you can assign phone numbers to your application using the &#x60;/phone_numbers&#x60; endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExternalConnectionTest() throws ApiException {
        //CreateExternalConnectionRequest createExternalConnectionRequest = null;
        //ExternalConnectionResponse response = api.createExternalConnection(createExternalConnectionRequest);
        // TODO: test validations
    }

    /**
     * Creates an Upload request
     *
     * Creates a new Upload request to Microsoft teams with the included phone numbers. Only one of civic_address_id or location_id must be provided, not both. The maximum allowed phone numbers for the numbers_ids array is 1000.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExternalConnectionUploadTest() throws ApiException {
        //String id = null;
        //CreateExternalConnectionUploadRequest createExternalConnectionUploadRequest = null;
        //CreateUploadRequestResponse response = api.createExternalConnectionUpload(id, createExternalConnectionUploadRequest);
        // TODO: test validations
    }

    /**
     * Deletes an External Connection
     *
     * Permanently deletes an External Connection. Deletion may be prevented if the application is in use by phone numbers, is active, or if it is an Operator Connect connection. To remove an Operator Connect integration please contact Telnyx support.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExternalConnectionTest() throws ApiException {
        //String id = null;
        //ExternalConnectionResponse response = api.deleteExternalConnection(id);
        // TODO: test validations
    }

    /**
     * Dismiss a log message
     *
     * Dismiss a log message for an external connection associated with your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExternalConnectionLogMessageTest() throws ApiException {
        //String id = null;
        //DismissRequestWasSuccessful response = api.deleteExternalConnectionLogMessage(id);
        // TODO: test validations
    }

    /**
     * Retrieve an External Connection
     *
     * Return the details of an existing External Connection inside the &#39;data&#39; attribute of the response.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalConnectionTest() throws ApiException {
        //String id = null;
        //ExternalConnectionResponse response = api.getExternalConnection(id);
        // TODO: test validations
    }

    /**
     * Retrieve a Civic Address
     *
     * Return the details of an existing Civic Address with its Locations inside the &#39;data&#39; attribute of the response.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalConnectionCivicAddressTest() throws ApiException {
        //String id = null;
        //UUID addressId = null;
        //GetCivicAddressResponse response = api.getExternalConnectionCivicAddress(id, addressId);
        // TODO: test validations
    }

    /**
     * Retrieve a log message
     *
     * Retrieve a log message for an external connection associated with your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalConnectionLogMessageTest() throws ApiException {
        //String id = null;
        //GetLogMessageResponse response = api.getExternalConnectionLogMessage(id);
        // TODO: test validations
    }

    /**
     * Retrieve a phone number
     *
     * Return the details of a phone number associated with the given external connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalConnectionPhoneNumberTest() throws ApiException {
        //String id = null;
        //String phoneNumberId = null;
        //GetExternalConnectionPhoneNumberResponse response = api.getExternalConnectionPhoneNumber(id, phoneNumberId);
        // TODO: test validations
    }

    /**
     * Retrieve a Release request
     *
     * Return the details of a Release request and its phone numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalConnectionReleaseTest() throws ApiException {
        //String id = null;
        //UUID releaseId = null;
        //GetReleaseResponse response = api.getExternalConnectionRelease(id, releaseId);
        // TODO: test validations
    }

    /**
     * Retrieve an Upload request
     *
     * Return the details of an Upload request and its phone numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalConnectionUploadTest() throws ApiException {
        //String id = null;
        //UUID ticketId = null;
        //GetUploadResponse response = api.getExternalConnectionUpload(id, ticketId);
        // TODO: test validations
    }

    /**
     * Get the count of pending upload requests
     *
     * Returns the count of all pending upload requests for the given external connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalConnectionUploadsStatusTest() throws ApiException {
        //String id = null;
        //GetUploadsStatusResponse response = api.getExternalConnectionUploadsStatus(id);
        // TODO: test validations
    }

    /**
     * List all civic addresses and locations
     *
     * Returns the civic addresses and locations from Microsoft Teams.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCivicAddressesTest() throws ApiException {
        //String id = null;
        //GetAllCivicAddressesResponse response = api.listCivicAddresses(id);
        // TODO: test validations
    }

    /**
     * List all log messages
     *
     * Retrieve a list of log messages for all external connections associated with your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalConnectionLogMessagesTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterExternalConnectionId = null;
        //String filterTelephoneNumberContains = null;
        //String filterTelephoneNumberEq = null;
        //ListLogMessagesResponse response = api.listExternalConnectionLogMessages(pageNumber, pageSize, filterExternalConnectionId, filterTelephoneNumberContains, filterTelephoneNumberEq);
        // TODO: test validations
    }

    /**
     * List all phone numbers
     *
     * Returns a list of all active phone numbers associated with the given external connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalConnectionPhoneNumbersTest() throws ApiException {
        //String id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterPhoneNumberEq = null;
        //String filterPhoneNumberContains = null;
        //UUID filterCivicAddressIdEq = null;
        //UUID filterLocationIdEq = null;
        //ListExternalConnectionPhoneNumbersResponse response = api.listExternalConnectionPhoneNumbers(id, pageNumber, pageSize, filterPhoneNumberEq, filterPhoneNumberContains, filterCivicAddressIdEq, filterLocationIdEq);
        // TODO: test validations
    }

    /**
     * List all Releases
     *
     * Returns a list of your Releases for the given external connection. These are automatically created when you change the &#x60;connection_id&#x60; of a phone number that is currently on Microsoft Teams.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalConnectionReleasesTest() throws ApiException {
        //String id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //List<String> filterStatusEq = null;
        //UUID filterCivicAddressIdEq = null;
        //UUID filterLocationIdEq = null;
        //String filterPhoneNumberEq = null;
        //String filterPhoneNumberContains = null;
        //ListReleasesResponse response = api.listExternalConnectionReleases(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains);
        // TODO: test validations
    }

    /**
     * List all Upload requests
     *
     * Returns a list of your Upload requests for the given external connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalConnectionUploadsTest() throws ApiException {
        //String id = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //List<String> filterStatusEq = null;
        //UUID filterCivicAddressIdEq = null;
        //UUID filterLocationIdEq = null;
        //String filterPhoneNumberEq = null;
        //String filterPhoneNumberContains = null;
        //ListUploadsResponse response = api.listExternalConnectionUploads(id, pageNumber, pageSize, filterStatusEq, filterCivicAddressIdEq, filterLocationIdEq, filterPhoneNumberEq, filterPhoneNumberContains);
        // TODO: test validations
    }

    /**
     * List all External Connections
     *
     * This endpoint returns a list of your External Connections inside the &#39;data&#39; attribute of the response. External Connections are used by Telnyx customers to seamless configure SIP trunking integrations with Telnyx Partners, through External Voice Integrations in Mission Control Portal.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalConnectionsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterConnectionNameContains = null;
        //String filterExternalSipConnection = null;
        //String filterId = null;
        //String filterCreatedAt = null;
        //String filterPhoneNumberContains = null;
        //GetAllExternalConnectionsResponse response = api.listExternalConnections(pageNumber, pageSize, filterConnectionNameContains, filterExternalSipConnection, filterId, filterCreatedAt, filterPhoneNumberContains);
        // TODO: test validations
    }

    /**
     * Refresh the status of all Upload requests
     *
     * Forces a recheck of the status of all pending Upload requests for the given external connection in the background.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refreshExternalConnectionUploadsTest() throws ApiException {
        //String id = null;
        //CreateUploadRequestResponse1 response = api.refreshExternalConnectionUploads(id);
        // TODO: test validations
    }

    /**
     * Retry an Upload request
     *
     * If there were any errors during the upload process, this endpoint will retry the upload request. In some cases this will reattempt the existing upload request, in other cases it may create a new upload request. Please check the ticket_id in the response to determine if a new upload request was created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retryUploadTest() throws ApiException {
        //String id = null;
        //UUID ticketId = null;
        //GetUploadResponse response = api.retryUpload(id, ticketId);
        // TODO: test validations
    }

    /**
     * Update an External Connection
     *
     * Updates settings of an existing External Connection based on the parameters of the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateExternalConnectionTest() throws ApiException {
        //String id = null;
        //UpdateExternalConnectionRequest updateExternalConnectionRequest = null;
        //ExternalConnectionResponse response = api.updateExternalConnection(id, updateExternalConnectionRequest);
        // TODO: test validations
    }

    /**
     * Update a phone number
     *
     * Asynchronously update settings of the phone number associated with the given external connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateExternalConnectionPhoneNumberTest() throws ApiException {
        //String id = null;
        //String phoneNumberId = null;
        //UpdateExternalConnectionPhoneNumberRequest updateExternalConnectionPhoneNumberRequest = null;
        //GetExternalConnectionPhoneNumberResponse response = api.updateExternalConnectionPhoneNumber(id, phoneNumberId, updateExternalConnectionPhoneNumberRequest);
        // TODO: test validations
    }

    /**
     * Update a location&#39;s static emergency address
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLocationTest() throws ApiException {
        //UUID id = null;
        //UUID locationId = null;
        //UpdateLocationRequest updateLocationRequest = null;
        //LocationResponse response = api.updateLocation(id, locationId, updateLocationRequest);
        // TODO: test validations
    }
}
