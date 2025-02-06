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
import com.telnyx.sdk.model.CampaignCost;
import com.telnyx.sdk.model.CampaignDeletionResponse;
import com.telnyx.sdk.model.CampaignRecordSetCSP;
import com.telnyx.sdk.model.CampaignRequest;
import com.telnyx.sdk.model.CampaignSharingChain;
import com.telnyx.sdk.model.Errors;
import com.telnyx.sdk.model.HTTPValidationError;
import com.telnyx.sdk.model.MnoMetadata;
import com.telnyx.sdk.model.ResponseSubmitCampaignPublicCampaignbuilderPost;
import com.telnyx.sdk.model.TelnyxCampaignCSP;
import com.telnyx.sdk.model.UpdateCampaignRequest;
import com.telnyx.sdk.model.UsecaseMetadata;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignApi
 */
public class CampaignApiTest {

    private final CampaignApi api = new CampaignApi();

    /**
     * Accept Shared Campaign
     *
     * Manually accept a campaign shared with Telnyx
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptCampaignTest() throws ApiException {
        //String campaignId = null;
        //Object response = api.acceptCampaign(campaignId);
        // TODO: test validations
    }

    /**
     * Deactivate My Campaign
     *
     * Terminate a campaign. Note that once deactivated, a campaign cannot be restored.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deactivateCampaignTest() throws ApiException {
        //String campaignId = null;
        //CampaignDeletionResponse response = api.deactivateCampaign(campaignId);
        // TODO: test validations
    }

    /**
     * Get My Campaign
     *
     * Retrieve campaign details by &#x60;campaignId&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignTest() throws ApiException {
        //String campaignId = null;
        //TelnyxCampaignCSP response = api.getCampaign(campaignId);
        // TODO: test validations
    }

    /**
     * Get Campaign Cost
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignCostTest() throws ApiException {
        //String usecase = null;
        //CampaignCost response = api.getCampaignCost(usecase);
        // TODO: test validations
    }

    /**
     * Get Campaign Mno Metadata
     *
     * Get the campaign metadata for each MNO it was submitted to.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignMnoMetadataTest() throws ApiException {
        //String campaignId = null;
        //MnoMetadata response = api.getCampaignMnoMetadata(campaignId);
        // TODO: test validations
    }

    /**
     * Get My Campaign Operation Status
     *
     * Retrieve campaign&#39;s operation status at MNO level.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignOperationStatusTest() throws ApiException {
        //String campaignId = null;
        //Object response = api.getCampaignOperationStatus(campaignId);
        // TODO: test validations
    }

    /**
     * Get My Osr Campaign Attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignOsrAttributesTest() throws ApiException {
        //String campaignId = null;
        //Object response = api.getCampaignOsrAttributes(campaignId);
        // TODO: test validations
    }

    /**
     * Get Sharing Status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignSharingStatusTest() throws ApiException {
        //String campaignId = null;
        //CampaignSharingChain response = api.getCampaignSharingStatus(campaignId);
        // TODO: test validations
    }

    /**
     * List Campaigns
     *
     * Retrieve a list of campaigns associated with a supplied &#x60;brandId&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCampaignsTest() throws ApiException {
        //String brandId = null;
        //Integer page = null;
        //Integer recordsPerPage = null;
        //String sort = null;
        //CampaignRecordSetCSP response = api.getCampaigns(brandId, page, recordsPerPage, sort);
        // TODO: test validations
    }

    /**
     * Qualify By Usecase
     *
     * This endpoint allows you to see whether or not the supplied brand is suitable for your desired campaign use case.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsecaseQualificationTest() throws ApiException {
        //String usecase = null;
        //String brandId = null;
        //UsecaseMetadata response = api.getUsecaseQualification(usecase, brandId);
        // TODO: test validations
    }

    /**
     * Submit Campaign
     *
     * Before creating a campaign, use the [Qualify By Usecase endpoint](https://developers.telnyx.com/api/messaging/10dlc/get-usecase-qualification) to ensure that the brand you want to assign a new campaign to is qualified for the desired use case of that campaign. **Please note:** After campaign creation, you&#39;ll only be able to edit the campaign&#39;s sample messages. Creating a campaign will entail an upfront, non-refundable three month&#39;s cost that will depend on the campaign&#39;s use case ([see 10DLC Costs section for details](https://developers.telnyx.com/docs/messaging/10dlc/concepts#10dlc-costs)).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCampaignTest() throws ApiException {
        //CampaignRequest campaignRequest = null;
        //ResponseSubmitCampaignPublicCampaignbuilderPost response = api.postCampaign(campaignRequest);
        // TODO: test validations
    }

    /**
     * Update My Campaign
     *
     * Update a campaign&#39;s properties by &#x60;campaignId&#x60;. **Please note:** only sample messages are editable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCampaignTest() throws ApiException {
        //String campaignId = null;
        //UpdateCampaignRequest updateCampaignRequest = null;
        //TelnyxCampaignCSP response = api.updateCampaign(campaignId, updateCampaignRequest);
        // TODO: test validations
    }

}
