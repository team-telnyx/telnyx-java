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
import com.telnyx.sdk.model.BrandFeedback;
import com.telnyx.sdk.model.BrandRecordSetCSP;
import com.telnyx.sdk.model.CreateBrand;
import com.telnyx.sdk.model.ExternalVetting;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.ImportExternalVetting;
import com.telnyx.sdk.model.OrderExternalVetting;
import com.telnyx.sdk.model.TelnyxBrand;
import com.telnyx.sdk.model.UpdateBrand;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for BrandsApi
 */
public class BrandsApiTest {

    private final BrandsApi api = new BrandsApi();

    /**
     * Create Brand
     *
     * This endpoint is used to create a new brand. A brand is an entity created by The Campaign Registry (TCR) that represents an organization or a company. It is this entity that TCR created campaigns will be associated with. Each brand creation will entail an upfront, non-refundable $4 expense.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBrandPostTest() throws ApiException {
        //CreateBrand createBrand = null;
        //Object response = api.createBrandPost(createBrand);
        // TODO: test validations
    }

    /**
     * Delete Brand
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBrandTest() throws ApiException {
        //String brandId = null;
        //Object response = api.deleteBrand(brandId);
        // TODO: test validations
    }

    /**
     * Get Brand
     *
     * Retrieve a brand by &#x60;brandId&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBrandTest() throws ApiException {
        //String brandId = null;
        //TelnyxBrand response = api.getBrand(brandId);
        // TODO: test validations
    }

    /**
     * Get Brand Feedback By Id
     *
     * Get feedback about a brand by ID. This endpoint can be used after creating or revetting a brand.  Possible values for &#x60;.category[].id&#x60;:  * &#x60;TAX_ID&#x60; - Data mismatch related to tax id and its associated properties. * &#x60;STOCK_SYMBOL&#x60; - Non public entity registered as a public for profit entity or   the stock information mismatch. * &#x60;GOVERNMENT_ENTITY&#x60; - Non government entity registered as a government entity.   Must be a U.S. government entity. * &#x60;NONPROFIT&#x60; - Not a recognized non-profit entity. No IRS tax-exempt status   found. * &#x60;OTHERS&#x60; - Details of the data misrepresentation if any.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBrandFeedbackByIdTest() throws ApiException {
        //String brandId = null;
        //BrandFeedback response = api.getBrandFeedbackById(brandId);
        // TODO: test validations
    }

    /**
     * List Brands
     *
     * This endpoint is used to list all brands associated with your organization.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBrandsTest() throws ApiException {
        //Integer page = null;
        //Integer recordsPerPage = null;
        //String displayName = null;
        //String entityType = null;
        //String state = null;
        //String country = null;
        //BrandRecordSetCSP response = api.getBrands(page, recordsPerPage, displayName, entityType, state, country);
        // TODO: test validations
    }

    /**
     * List External Vettings
     *
     * Get list of valid external vetting record for a given brand
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExternalVettingsTest() throws ApiException {
        //String brandId = null;
        //Object response = api.listExternalVettings(brandId);
        // TODO: test validations
    }

    /**
     * Order Brand External Vetting
     *
     * Order new external vetting for a brand
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postOrderExternalVettingTest() throws ApiException {
        //String brandId = null;
        //OrderExternalVetting orderExternalVetting = null;
        //Object response = api.postOrderExternalVetting(brandId, orderExternalVetting);
        // TODO: test validations
    }

    /**
     * Import External Vetting Record
     *
     * This operation can be used to import an external vetting record from a TCR-approved vetting provider. If the vetting provider confirms validity of the record, it will be saved with the brand and will be considered for future campaign qualification.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putExternalVettingRecordTest() throws ApiException {
        //String brandId = null;
        //ImportExternalVetting importExternalVetting = null;
        //ExternalVetting response = api.putExternalVettingRecord(brandId, importExternalVetting);
        // TODO: test validations
    }

    /**
     * Revet Brand
     *
     * This operation allows you to revet the brand. However, revetting is allowed once after the successful brand registration and thereafter limited to once every 3 months.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revetBrandTest() throws ApiException {
        //String brandId = null;
        //Object response = api.revetBrand(brandId);
        // TODO: test validations
    }

    /**
     * Update Brand
     *
     * Update a brand&#39;s attributes by &#x60;brandId&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBrandTest() throws ApiException {
        //String brandId = null;
        //UpdateBrand updateBrand = null;
        //TelnyxBrand response = api.updateBrand(brandId, updateBrand);
        // TODO: test validations
    }
}
