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
import com.telnyx.sdk.model.AddressCreate;
import com.telnyx.sdk.model.AddressResponse;
import com.telnyx.sdk.model.GetAllAddressResponse;
import com.telnyx.sdk.model.ValidateAddressRequest;
import com.telnyx.sdk.model.ValidateAddressResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for AddressesApi
 */
public class AddressesApiTest {

    private final AddressesApi api = new AddressesApi();

    /**
     * Creates an address
     *
     * Creates an address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAddressTest() throws ApiException {
        //AddressCreate addressCreate = null;
        //AddressResponse response = api.createAddress(addressCreate);
        // TODO: test validations
    }

    /**
     * Deletes an address
     *
     * Deletes an existing address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAddressTest() throws ApiException {
        //String id = null;
        //AddressResponse response = api.deleteAddress(id);
        // TODO: test validations
    }

    /**
     * List all addresses
     *
     * Returns a list of your addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findAddresssTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterCustomerReferenceEq = null;
        //String filterCustomerReferenceContains = null;
        //String filterUsedAsEmergency = null;
        //String filterStreetAddressContains = null;
        //String filterAddressBookEq = null;
        //String sort = null;
        //GetAllAddressResponse response = api.findAddresss(pageNumber, pageSize, filterCustomerReferenceEq, filterCustomerReferenceContains, filterUsedAsEmergency, filterStreetAddressContains, filterAddressBookEq, sort);
        // TODO: test validations
    }

    /**
     * Retrieve an address
     *
     * Retrieves the details of an existing address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressTest() throws ApiException {
        //String id = null;
        //AddressResponse response = api.getAddress(id);
        // TODO: test validations
    }

    /**
     * Validate an address
     *
     * Validates an address for emergency services.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateAddressTest() throws ApiException {
        //ValidateAddressRequest validateAddressRequest = null;
        //ValidateAddressResponse response = api.validateAddress(validateAddressRequest);
        // TODO: test validations
    }
}
