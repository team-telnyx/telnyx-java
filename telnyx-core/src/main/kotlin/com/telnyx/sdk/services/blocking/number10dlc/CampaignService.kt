// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.campaign.CampaignAcceptSharingParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignAcceptSharingResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignDeactivateParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignDeactivateResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignGetMnoMetadataParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignGetMnoMetadataResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignGetOperationStatusParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignGetOperationStatusResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignGetSharingStatusParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignGetSharingStatusResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignListPage
import com.telnyx.sdk.models.number10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignSubmitAppealParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignSubmitAppealResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignUpdateParams
import com.telnyx.sdk.models.number10dlc.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.services.blocking.number10dlc.campaign.OsrService
import com.telnyx.sdk.services.blocking.number10dlc.campaign.UsecaseService
import java.util.function.Consumer

interface CampaignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService

    fun usecase(): UsecaseService

    fun osr(): OsrService

    /** Retrieve campaign details by `campaignId`. */
    fun retrieve(campaignId: String): TelnyxCampaignCsp =
        retrieve(campaignId, CampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxCampaignCsp =
        retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
    ): TelnyxCampaignCsp = retrieve(campaignId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxCampaignCsp

    /** @see retrieve */
    fun retrieve(params: CampaignRetrieveParams): TelnyxCampaignCsp =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(campaignId: String, requestOptions: RequestOptions): TelnyxCampaignCsp =
        retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

    /**
     * Update a campaign's properties by `campaignId`. **Please note:** only sample messages are
     * editable.
     */
    fun update(campaignId: String): TelnyxCampaignCsp =
        update(campaignId, CampaignUpdateParams.none())

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxCampaignCsp = update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
    ): TelnyxCampaignCsp = update(campaignId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxCampaignCsp

    /** @see update */
    fun update(params: CampaignUpdateParams): TelnyxCampaignCsp =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(campaignId: String, requestOptions: RequestOptions): TelnyxCampaignCsp =
        update(campaignId, CampaignUpdateParams.none(), requestOptions)

    /** Retrieve a list of campaigns associated with a supplied `brandId`. */
    fun list(params: CampaignListParams): CampaignListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignListPage

    /** Manually accept a campaign shared with Telnyx */
    fun acceptSharing(campaignId: String): CampaignAcceptSharingResponse =
        acceptSharing(campaignId, CampaignAcceptSharingParams.none())

    /** @see acceptSharing */
    fun acceptSharing(
        campaignId: String,
        params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignAcceptSharingResponse =
        acceptSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see acceptSharing */
    fun acceptSharing(
        campaignId: String,
        params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
    ): CampaignAcceptSharingResponse = acceptSharing(campaignId, params, RequestOptions.none())

    /** @see acceptSharing */
    fun acceptSharing(
        params: CampaignAcceptSharingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignAcceptSharingResponse

    /** @see acceptSharing */
    fun acceptSharing(params: CampaignAcceptSharingParams): CampaignAcceptSharingResponse =
        acceptSharing(params, RequestOptions.none())

    /** @see acceptSharing */
    fun acceptSharing(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CampaignAcceptSharingResponse =
        acceptSharing(campaignId, CampaignAcceptSharingParams.none(), requestOptions)

    /** Terminate a campaign. Note that once deactivated, a campaign cannot be restored. */
    fun deactivate(campaignId: String): CampaignDeactivateResponse =
        deactivate(campaignId, CampaignDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        campaignId: String,
        params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDeactivateResponse =
        deactivate(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        campaignId: String,
        params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
    ): CampaignDeactivateResponse = deactivate(campaignId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: CampaignDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDeactivateResponse

    /** @see deactivate */
    fun deactivate(params: CampaignDeactivateParams): CampaignDeactivateResponse =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(campaignId: String, requestOptions: RequestOptions): CampaignDeactivateResponse =
        deactivate(campaignId, CampaignDeactivateParams.none(), requestOptions)

    /** Get the campaign metadata for each MNO it was submitted to. */
    fun getMnoMetadata(campaignId: String): CampaignGetMnoMetadataResponse =
        getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none())

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        campaignId: String,
        params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignGetMnoMetadataResponse =
        getMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        campaignId: String,
        params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
    ): CampaignGetMnoMetadataResponse = getMnoMetadata(campaignId, params, RequestOptions.none())

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        params: CampaignGetMnoMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignGetMnoMetadataResponse

    /** @see getMnoMetadata */
    fun getMnoMetadata(params: CampaignGetMnoMetadataParams): CampaignGetMnoMetadataResponse =
        getMnoMetadata(params, RequestOptions.none())

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CampaignGetMnoMetadataResponse =
        getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none(), requestOptions)

    /** Retrieve campaign's operation status at MNO level. */
    fun getOperationStatus(campaignId: String): CampaignGetOperationStatusResponse =
        getOperationStatus(campaignId, CampaignGetOperationStatusParams.none())

    /** @see getOperationStatus */
    fun getOperationStatus(
        campaignId: String,
        params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignGetOperationStatusResponse =
        getOperationStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getOperationStatus */
    fun getOperationStatus(
        campaignId: String,
        params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
    ): CampaignGetOperationStatusResponse =
        getOperationStatus(campaignId, params, RequestOptions.none())

    /** @see getOperationStatus */
    fun getOperationStatus(
        params: CampaignGetOperationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignGetOperationStatusResponse

    /** @see getOperationStatus */
    fun getOperationStatus(
        params: CampaignGetOperationStatusParams
    ): CampaignGetOperationStatusResponse = getOperationStatus(params, RequestOptions.none())

    /** @see getOperationStatus */
    fun getOperationStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CampaignGetOperationStatusResponse =
        getOperationStatus(campaignId, CampaignGetOperationStatusParams.none(), requestOptions)

    /** Get Sharing Status */
    fun getSharingStatus(campaignId: String): CampaignGetSharingStatusResponse =
        getSharingStatus(campaignId, CampaignGetSharingStatusParams.none())

    /** @see getSharingStatus */
    fun getSharingStatus(
        campaignId: String,
        params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignGetSharingStatusResponse =
        getSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getSharingStatus */
    fun getSharingStatus(
        campaignId: String,
        params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
    ): CampaignGetSharingStatusResponse =
        getSharingStatus(campaignId, params, RequestOptions.none())

    /** @see getSharingStatus */
    fun getSharingStatus(
        params: CampaignGetSharingStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignGetSharingStatusResponse

    /** @see getSharingStatus */
    fun getSharingStatus(params: CampaignGetSharingStatusParams): CampaignGetSharingStatusResponse =
        getSharingStatus(params, RequestOptions.none())

    /** @see getSharingStatus */
    fun getSharingStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CampaignGetSharingStatusResponse =
        getSharingStatus(campaignId, CampaignGetSharingStatusParams.none(), requestOptions)

    /**
     * Submits an appeal for rejected native campaigns in TELNYX_FAILED or MNO_REJECTED status. The
     * appeal is recorded for manual compliance team review and the campaign status is reset to
     * TCR_ACCEPTED. Note: Appeal forwarding is handled manually to allow proper review before
     * incurring upstream charges.
     */
    fun submitAppeal(
        campaignId: String,
        params: CampaignSubmitAppealParams,
    ): CampaignSubmitAppealResponse = submitAppeal(campaignId, params, RequestOptions.none())

    /** @see submitAppeal */
    fun submitAppeal(
        campaignId: String,
        params: CampaignSubmitAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignSubmitAppealResponse =
        submitAppeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see submitAppeal */
    fun submitAppeal(params: CampaignSubmitAppealParams): CampaignSubmitAppealResponse =
        submitAppeal(params, RequestOptions.none())

    /** @see submitAppeal */
    fun submitAppeal(
        params: CampaignSubmitAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignSubmitAppealResponse

    /** A view of [CampaignService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService.WithRawResponse

        fun usecase(): UsecaseService.WithRawResponse

        fun osr(): OsrService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}`, but is otherwise the
         * same as [CampaignService.retrieve].
         */
        @MustBeClosed
        fun retrieve(campaignId: String): HttpResponseFor<TelnyxCampaignCsp> =
            retrieve(campaignId, CampaignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxCampaignCsp> =
            retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        ): HttpResponseFor<TelnyxCampaignCsp> = retrieve(campaignId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxCampaignCsp>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CampaignRetrieveParams): HttpResponseFor<TelnyxCampaignCsp> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxCampaignCsp> =
            retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /10dlc/campaign/{campaignId}`, but is otherwise the
         * same as [CampaignService.update].
         */
        @MustBeClosed
        fun update(campaignId: String): HttpResponseFor<TelnyxCampaignCsp> =
            update(campaignId, CampaignUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxCampaignCsp> =
            update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
        ): HttpResponseFor<TelnyxCampaignCsp> = update(campaignId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxCampaignCsp>

        /** @see update */
        @MustBeClosed
        fun update(params: CampaignUpdateParams): HttpResponseFor<TelnyxCampaignCsp> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxCampaignCsp> =
            update(campaignId, CampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign`, but is otherwise the same as
         * [CampaignService.list].
         */
        @MustBeClosed
        fun list(params: CampaignListParams): HttpResponseFor<CampaignListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignListPage>

        /**
         * Returns a raw HTTP response for `post /10dlc/campaign/acceptSharing/{campaignId}`, but is
         * otherwise the same as [CampaignService.acceptSharing].
         */
        @MustBeClosed
        fun acceptSharing(campaignId: String): HttpResponseFor<CampaignAcceptSharingResponse> =
            acceptSharing(campaignId, CampaignAcceptSharingParams.none())

        /** @see acceptSharing */
        @MustBeClosed
        fun acceptSharing(
            campaignId: String,
            params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignAcceptSharingResponse> =
            acceptSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see acceptSharing */
        @MustBeClosed
        fun acceptSharing(
            campaignId: String,
            params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
        ): HttpResponseFor<CampaignAcceptSharingResponse> =
            acceptSharing(campaignId, params, RequestOptions.none())

        /** @see acceptSharing */
        @MustBeClosed
        fun acceptSharing(
            params: CampaignAcceptSharingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignAcceptSharingResponse>

        /** @see acceptSharing */
        @MustBeClosed
        fun acceptSharing(
            params: CampaignAcceptSharingParams
        ): HttpResponseFor<CampaignAcceptSharingResponse> =
            acceptSharing(params, RequestOptions.none())

        /** @see acceptSharing */
        @MustBeClosed
        fun acceptSharing(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignAcceptSharingResponse> =
            acceptSharing(campaignId, CampaignAcceptSharingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /10dlc/campaign/{campaignId}`, but is otherwise
         * the same as [CampaignService.deactivate].
         */
        @MustBeClosed
        fun deactivate(campaignId: String): HttpResponseFor<CampaignDeactivateResponse> =
            deactivate(campaignId, CampaignDeactivateParams.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            campaignId: String,
            params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDeactivateResponse> =
            deactivate(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            campaignId: String,
            params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
        ): HttpResponseFor<CampaignDeactivateResponse> =
            deactivate(campaignId, params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: CampaignDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDeactivateResponse>

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: CampaignDeactivateParams
        ): HttpResponseFor<CampaignDeactivateResponse> = deactivate(params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignDeactivateResponse> =
            deactivate(campaignId, CampaignDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/mnoMetadata`, but is
         * otherwise the same as [CampaignService.getMnoMetadata].
         */
        @MustBeClosed
        fun getMnoMetadata(campaignId: String): HttpResponseFor<CampaignGetMnoMetadataResponse> =
            getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none())

        /** @see getMnoMetadata */
        @MustBeClosed
        fun getMnoMetadata(
            campaignId: String,
            params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignGetMnoMetadataResponse> =
            getMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getMnoMetadata */
        @MustBeClosed
        fun getMnoMetadata(
            campaignId: String,
            params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
        ): HttpResponseFor<CampaignGetMnoMetadataResponse> =
            getMnoMetadata(campaignId, params, RequestOptions.none())

        /** @see getMnoMetadata */
        @MustBeClosed
        fun getMnoMetadata(
            params: CampaignGetMnoMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignGetMnoMetadataResponse>

        /** @see getMnoMetadata */
        @MustBeClosed
        fun getMnoMetadata(
            params: CampaignGetMnoMetadataParams
        ): HttpResponseFor<CampaignGetMnoMetadataResponse> =
            getMnoMetadata(params, RequestOptions.none())

        /** @see getMnoMetadata */
        @MustBeClosed
        fun getMnoMetadata(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignGetMnoMetadataResponse> =
            getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/operationStatus`, but
         * is otherwise the same as [CampaignService.getOperationStatus].
         */
        @MustBeClosed
        fun getOperationStatus(
            campaignId: String
        ): HttpResponseFor<CampaignGetOperationStatusResponse> =
            getOperationStatus(campaignId, CampaignGetOperationStatusParams.none())

        /** @see getOperationStatus */
        @MustBeClosed
        fun getOperationStatus(
            campaignId: String,
            params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignGetOperationStatusResponse> =
            getOperationStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getOperationStatus */
        @MustBeClosed
        fun getOperationStatus(
            campaignId: String,
            params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
        ): HttpResponseFor<CampaignGetOperationStatusResponse> =
            getOperationStatus(campaignId, params, RequestOptions.none())

        /** @see getOperationStatus */
        @MustBeClosed
        fun getOperationStatus(
            params: CampaignGetOperationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignGetOperationStatusResponse>

        /** @see getOperationStatus */
        @MustBeClosed
        fun getOperationStatus(
            params: CampaignGetOperationStatusParams
        ): HttpResponseFor<CampaignGetOperationStatusResponse> =
            getOperationStatus(params, RequestOptions.none())

        /** @see getOperationStatus */
        @MustBeClosed
        fun getOperationStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignGetOperationStatusResponse> =
            getOperationStatus(campaignId, CampaignGetOperationStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/sharing`, but is
         * otherwise the same as [CampaignService.getSharingStatus].
         */
        @MustBeClosed
        fun getSharingStatus(
            campaignId: String
        ): HttpResponseFor<CampaignGetSharingStatusResponse> =
            getSharingStatus(campaignId, CampaignGetSharingStatusParams.none())

        /** @see getSharingStatus */
        @MustBeClosed
        fun getSharingStatus(
            campaignId: String,
            params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignGetSharingStatusResponse> =
            getSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getSharingStatus */
        @MustBeClosed
        fun getSharingStatus(
            campaignId: String,
            params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
        ): HttpResponseFor<CampaignGetSharingStatusResponse> =
            getSharingStatus(campaignId, params, RequestOptions.none())

        /** @see getSharingStatus */
        @MustBeClosed
        fun getSharingStatus(
            params: CampaignGetSharingStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignGetSharingStatusResponse>

        /** @see getSharingStatus */
        @MustBeClosed
        fun getSharingStatus(
            params: CampaignGetSharingStatusParams
        ): HttpResponseFor<CampaignGetSharingStatusResponse> =
            getSharingStatus(params, RequestOptions.none())

        /** @see getSharingStatus */
        @MustBeClosed
        fun getSharingStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignGetSharingStatusResponse> =
            getSharingStatus(campaignId, CampaignGetSharingStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/campaign/{campaignId}/appeal`, but is
         * otherwise the same as [CampaignService.submitAppeal].
         */
        @MustBeClosed
        fun submitAppeal(
            campaignId: String,
            params: CampaignSubmitAppealParams,
        ): HttpResponseFor<CampaignSubmitAppealResponse> =
            submitAppeal(campaignId, params, RequestOptions.none())

        /** @see submitAppeal */
        @MustBeClosed
        fun submitAppeal(
            campaignId: String,
            params: CampaignSubmitAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignSubmitAppealResponse> =
            submitAppeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see submitAppeal */
        @MustBeClosed
        fun submitAppeal(
            params: CampaignSubmitAppealParams
        ): HttpResponseFor<CampaignSubmitAppealResponse> =
            submitAppeal(params, RequestOptions.none())

        /** @see submitAppeal */
        @MustBeClosed
        fun submitAppeal(
            params: CampaignSubmitAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignSubmitAppealResponse>
    }
}
