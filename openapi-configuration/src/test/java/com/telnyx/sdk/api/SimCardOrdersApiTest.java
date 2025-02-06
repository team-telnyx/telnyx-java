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
import com.telnyx.sdk.model.CreateSimCardOrder200Response;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.GetSimCardOrders200Response;
import com.telnyx.sdk.model.PreviewSimCardOrders202Response;
import com.telnyx.sdk.model.PreviewSimCardOrdersRequest;
import com.telnyx.sdk.model.SimCardOrderCreate;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SimCardOrdersApi
 */
public class SimCardOrdersApiTest {

    private final SimCardOrdersApi api = new SimCardOrdersApi();

    /**
     * Create a SIM card order
     *
     * Creates a new order for SIM cards.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSimCardOrderTest() throws ApiException {
        //SimCardOrderCreate simCardOrderCreate = null;
        //CreateSimCardOrder200Response response = api.createSimCardOrder(simCardOrderCreate);
        // TODO: test validations
    }

    /**
     * Get a single SIM card order
     *
     * Get a single SIM card order by its ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSimCardOrderTest() throws ApiException {
        //UUID id = null;
        //CreateSimCardOrder200Response response = api.getSimCardOrder(id);
        // TODO: test validations
    }

    /**
     * Get all SIM card orders
     *
     * Get all SIM card orders according to filters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSimCardOrdersTest() throws ApiException {
        //String filterCreatedAt = null;
        //String filterUpdatedAt = null;
        //Integer filterQuantity = null;
        //String filterCostAmount = null;
        //String filterCostCurrency = null;
        //String filterAddressId = null;
        //String filterAddressStreetAddress = null;
        //String filterAddressExtendedAddress = null;
        //String filterAddressLocality = null;
        //String filterAddressAdministrativeArea = null;
        //String filterAddressCountryCode = null;
        //String filterAddressPostalCode = null;
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //GetSimCardOrders200Response response = api.getSimCardOrders(filterCreatedAt, filterUpdatedAt, filterQuantity, filterCostAmount, filterCostCurrency, filterAddressId, filterAddressStreetAddress, filterAddressExtendedAddress, filterAddressLocality, filterAddressAdministrativeArea, filterAddressCountryCode, filterAddressPostalCode, pageNumber, pageSize);
        // TODO: test validations
    }

    /**
     * Preview SIM card orders
     *
     * Preview SIM card order purchases.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previewSimCardOrdersTest() throws ApiException {
        //PreviewSimCardOrdersRequest previewSimCardOrdersRequest = null;
        //PreviewSimCardOrders202Response response = api.previewSimCardOrders(previewSimCardOrdersRequest);
        // TODO: test validations
    }

}
