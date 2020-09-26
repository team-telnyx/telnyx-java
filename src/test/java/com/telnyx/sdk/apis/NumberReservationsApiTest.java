/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.apis;

import com.telnyx.sdk.ApiException;
import com.telnyx.sdk.models.CreateNumberReservationRequest;
import com.telnyx.sdk.models.Errors;
import com.telnyx.sdk.models.ListNumberReservationsResponse;
import com.telnyx.sdk.models.NumberReservationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NumberReservationsApi
 */
@Ignore
public class NumberReservationsApiTest {

    private final NumberReservationsApi api = new NumberReservationsApi();

    /**
     * Create a number reservation
     *
     * Creates a Phone Number Reservation for multiple numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNumberReservationTest() throws ApiException {
        CreateNumberReservationRequest body = null;
        NumberReservationResponse response = api.createNumberReservation(body);

        // TODO: test validations
    }
    /**
     * Extend a number reservation
     *
     * Extends reservation expiry time on all phone numbers.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extendNumberReservationExpiryTimeTest() throws ApiException {
        String numberReservationId = null;
        NumberReservationResponse response = api.extendNumberReservationExpiryTime(numberReservationId);

        // TODO: test validations
    }
    /**
     * List number reservations
     *
     * Gets a paginated list of phone number reservations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNumberReservationsTest() throws ApiException {
        String filterStatus = null;
        String filterCreatedAtGt = null;
        String filterCreatedAtLt = null;
        String filterPhoneNumbersPhoneNumber = null;
        String filterCustomerReference = null;
        ListNumberReservationsResponse response = api.listNumberReservations(filterStatus, filterCreatedAtGt, filterCreatedAtLt, filterPhoneNumbersPhoneNumber, filterCustomerReference);

        // TODO: test validations
    }
    /**
     * Retrieve a number reservation
     *
     * Gets a single phone number reservation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveNumberReservationTest() throws ApiException {
        String numberReservationId = null;
        NumberReservationResponse response = api.retrieveNumberReservation(numberReservationId);

        // TODO: test validations
    }
}