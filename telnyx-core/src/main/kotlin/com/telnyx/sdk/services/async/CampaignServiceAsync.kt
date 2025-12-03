// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.campaign.CampaignAcceptSharingParams
import com.telnyx.sdk.models.campaign.CampaignAcceptSharingResponse
import com.telnyx.sdk.models.campaign.CampaignDeactivateParams
import com.telnyx.sdk.models.campaign.CampaignDeactivateResponse
import com.telnyx.sdk.models.campaign.CampaignGetMnoMetadataParams
import com.telnyx.sdk.models.campaign.CampaignGetMnoMetadataResponse
import com.telnyx.sdk.models.campaign.CampaignGetOperationStatusParams
import com.telnyx.sdk.models.campaign.CampaignGetOperationStatusResponse
import com.telnyx.sdk.models.campaign.CampaignGetSharingStatusParams
import com.telnyx.sdk.models.campaign.CampaignGetSharingStatusResponse
import com.telnyx.sdk.models.campaign.CampaignListPageAsync
import com.telnyx.sdk.models.campaign.CampaignListParams
import com.telnyx.sdk.models.campaign.CampaignRetrieveParams
import com.telnyx.sdk.models.campaign.CampaignSubmitAppealParams
import com.telnyx.sdk.models.campaign.CampaignSubmitAppealResponse
import com.telnyx.sdk.models.campaign.CampaignUpdateParams
import com.telnyx.sdk.models.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.services.async.campaign.OsrServiceAsync
import com.telnyx.sdk.services.async.campaign.UsecaseServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CampaignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync

    fun usecase(): UsecaseServiceAsync

    fun osr(): OsrServiceAsync

    /** Retrieve campaign details by `campaignId`. */
    fun retrieve(campaignId: String): CompletableFuture<TelnyxCampaignCsp> =
        retrieve(campaignId, CampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxCampaignCsp> =
        retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
    ): CompletableFuture<TelnyxCampaignCsp> = retrieve(campaignId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxCampaignCsp>

    /** @see retrieve */
    fun retrieve(params: CampaignRetrieveParams): CompletableFuture<TelnyxCampaignCsp> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxCampaignCsp> =
        retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

    /**
     * Update a campaign's properties by `campaignId`. **Please note:** only sample messages are
     * editable.
     */
    fun update(campaignId: String): CompletableFuture<TelnyxCampaignCsp> =
        update(campaignId, CampaignUpdateParams.none())

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxCampaignCsp> =
        update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see update */
    fun update(
        campaignId: String,
        params: CampaignUpdateParams = CampaignUpdateParams.none(),
    ): CompletableFuture<TelnyxCampaignCsp> = update(campaignId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxCampaignCsp>

    /** @see update */
    fun update(params: CampaignUpdateParams): CompletableFuture<TelnyxCampaignCsp> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxCampaignCsp> =
        update(campaignId, CampaignUpdateParams.none(), requestOptions)

    /** Retrieve a list of campaigns associated with a supplied `brandId`. */
    fun list(params: CampaignListParams): CompletableFuture<CampaignListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignListPageAsync>

    /** Manually accept a campaign shared with Telnyx */
    fun acceptSharing(campaignId: String): CompletableFuture<CampaignAcceptSharingResponse> =
        acceptSharing(campaignId, CampaignAcceptSharingParams.none())

    /** @see acceptSharing */
    fun acceptSharing(
        campaignId: String,
        params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignAcceptSharingResponse> =
        acceptSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see acceptSharing */
    fun acceptSharing(
        campaignId: String,
        params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
    ): CompletableFuture<CampaignAcceptSharingResponse> =
        acceptSharing(campaignId, params, RequestOptions.none())

    /** @see acceptSharing */
    fun acceptSharing(
        params: CampaignAcceptSharingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignAcceptSharingResponse>

    /** @see acceptSharing */
    fun acceptSharing(
        params: CampaignAcceptSharingParams
    ): CompletableFuture<CampaignAcceptSharingResponse> =
        acceptSharing(params, RequestOptions.none())

    /** @see acceptSharing */
    fun acceptSharing(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignAcceptSharingResponse> =
        acceptSharing(campaignId, CampaignAcceptSharingParams.none(), requestOptions)

    /** Terminate a campaign. Note that once deactivated, a campaign cannot be restored. */
    fun deactivate(campaignId: String): CompletableFuture<CampaignDeactivateResponse> =
        deactivate(campaignId, CampaignDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        campaignId: String,
        params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDeactivateResponse> =
        deactivate(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        campaignId: String,
        params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
    ): CompletableFuture<CampaignDeactivateResponse> =
        deactivate(campaignId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: CampaignDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDeactivateResponse>

    /** @see deactivate */
    fun deactivate(
        params: CampaignDeactivateParams
    ): CompletableFuture<CampaignDeactivateResponse> = deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignDeactivateResponse> =
        deactivate(campaignId, CampaignDeactivateParams.none(), requestOptions)

    /** Get the campaign metadata for each MNO it was submitted to. */
    fun getMnoMetadata(campaignId: String): CompletableFuture<CampaignGetMnoMetadataResponse> =
        getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none())

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        campaignId: String,
        params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignGetMnoMetadataResponse> =
        getMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        campaignId: String,
        params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
    ): CompletableFuture<CampaignGetMnoMetadataResponse> =
        getMnoMetadata(campaignId, params, RequestOptions.none())

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        params: CampaignGetMnoMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignGetMnoMetadataResponse>

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        params: CampaignGetMnoMetadataParams
    ): CompletableFuture<CampaignGetMnoMetadataResponse> =
        getMnoMetadata(params, RequestOptions.none())

    /** @see getMnoMetadata */
    fun getMnoMetadata(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetMnoMetadataResponse> =
        getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none(), requestOptions)

    /** Retrieve campaign's operation status at MNO level. */
    fun getOperationStatus(
        campaignId: String
    ): CompletableFuture<CampaignGetOperationStatusResponse> =
        getOperationStatus(campaignId, CampaignGetOperationStatusParams.none())

    /** @see getOperationStatus */
    fun getOperationStatus(
        campaignId: String,
        params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignGetOperationStatusResponse> =
        getOperationStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getOperationStatus */
    fun getOperationStatus(
        campaignId: String,
        params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
    ): CompletableFuture<CampaignGetOperationStatusResponse> =
        getOperationStatus(campaignId, params, RequestOptions.none())

    /** @see getOperationStatus */
    fun getOperationStatus(
        params: CampaignGetOperationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignGetOperationStatusResponse>

    /** @see getOperationStatus */
    fun getOperationStatus(
        params: CampaignGetOperationStatusParams
    ): CompletableFuture<CampaignGetOperationStatusResponse> =
        getOperationStatus(params, RequestOptions.none())

    /** @see getOperationStatus */
    fun getOperationStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetOperationStatusResponse> =
        getOperationStatus(campaignId, CampaignGetOperationStatusParams.none(), requestOptions)

    /** Get Sharing Status */
    fun getSharingStatus(campaignId: String): CompletableFuture<CampaignGetSharingStatusResponse> =
        getSharingStatus(campaignId, CampaignGetSharingStatusParams.none())

    /** @see getSharingStatus */
    fun getSharingStatus(
        campaignId: String,
        params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignGetSharingStatusResponse> =
        getSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see getSharingStatus */
    fun getSharingStatus(
        campaignId: String,
        params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
    ): CompletableFuture<CampaignGetSharingStatusResponse> =
        getSharingStatus(campaignId, params, RequestOptions.none())

    /** @see getSharingStatus */
    fun getSharingStatus(
        params: CampaignGetSharingStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignGetSharingStatusResponse>

    /** @see getSharingStatus */
    fun getSharingStatus(
        params: CampaignGetSharingStatusParams
    ): CompletableFuture<CampaignGetSharingStatusResponse> =
        getSharingStatus(params, RequestOptions.none())

    /** @see getSharingStatus */
    fun getSharingStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignGetSharingStatusResponse> =
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
    ): CompletableFuture<CampaignSubmitAppealResponse> =
        submitAppeal(campaignId, params, RequestOptions.none())

    /** @see submitAppeal */
    fun submitAppeal(
        campaignId: String,
        params: CampaignSubmitAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignSubmitAppealResponse> =
        submitAppeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see submitAppeal */
    fun submitAppeal(
        params: CampaignSubmitAppealParams
    ): CompletableFuture<CampaignSubmitAppealResponse> = submitAppeal(params, RequestOptions.none())

    /** @see submitAppeal */
    fun submitAppeal(
        params: CampaignSubmitAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignSubmitAppealResponse>

    /**
     * A view of [CampaignServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse

        fun usecase(): UsecaseServiceAsync.WithRawResponse

        fun osr(): OsrServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /campaign/{campaignId}`, but is otherwise the same
         * as [CampaignServiceAsync.retrieve].
         */
        fun retrieve(campaignId: String): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            retrieve(campaignId, CampaignRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            params: CampaignRetrieveParams = CampaignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            retrieve(campaignId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>>

        /** @see retrieve */
        fun retrieve(
            params: CampaignRetrieveParams
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            retrieve(campaignId, CampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /campaign/{campaignId}`, but is otherwise the same
         * as [CampaignServiceAsync.update].
         */
        fun update(campaignId: String): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            update(campaignId, CampaignUpdateParams.none())

        /** @see update */
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see update */
        fun update(
            campaignId: String,
            params: CampaignUpdateParams = CampaignUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            update(campaignId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>>

        /** @see update */
        fun update(
            params: CampaignUpdateParams
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            update(campaignId, CampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign`, but is otherwise the same as
         * [CampaignServiceAsync.list].
         */
        fun list(
            params: CampaignListParams
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignListPageAsync>>

        /**
         * Returns a raw HTTP response for `post /campaign/acceptSharing/{campaignId}`, but is
         * otherwise the same as [CampaignServiceAsync.acceptSharing].
         */
        fun acceptSharing(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignAcceptSharingResponse>> =
            acceptSharing(campaignId, CampaignAcceptSharingParams.none())

        /** @see acceptSharing */
        fun acceptSharing(
            campaignId: String,
            params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignAcceptSharingResponse>> =
            acceptSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see acceptSharing */
        fun acceptSharing(
            campaignId: String,
            params: CampaignAcceptSharingParams = CampaignAcceptSharingParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignAcceptSharingResponse>> =
            acceptSharing(campaignId, params, RequestOptions.none())

        /** @see acceptSharing */
        fun acceptSharing(
            params: CampaignAcceptSharingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignAcceptSharingResponse>>

        /** @see acceptSharing */
        fun acceptSharing(
            params: CampaignAcceptSharingParams
        ): CompletableFuture<HttpResponseFor<CampaignAcceptSharingResponse>> =
            acceptSharing(params, RequestOptions.none())

        /** @see acceptSharing */
        fun acceptSharing(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignAcceptSharingResponse>> =
            acceptSharing(campaignId, CampaignAcceptSharingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /campaign/{campaignId}`, but is otherwise the
         * same as [CampaignServiceAsync.deactivate].
         */
        fun deactivate(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignDeactivateResponse>> =
            deactivate(campaignId, CampaignDeactivateParams.none())

        /** @see deactivate */
        fun deactivate(
            campaignId: String,
            params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDeactivateResponse>> =
            deactivate(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see deactivate */
        fun deactivate(
            campaignId: String,
            params: CampaignDeactivateParams = CampaignDeactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDeactivateResponse>> =
            deactivate(campaignId, params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: CampaignDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDeactivateResponse>>

        /** @see deactivate */
        fun deactivate(
            params: CampaignDeactivateParams
        ): CompletableFuture<HttpResponseFor<CampaignDeactivateResponse>> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignDeactivateResponse>> =
            deactivate(campaignId, CampaignDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{campaignId}/mnoMetadata`, but is
         * otherwise the same as [CampaignServiceAsync.getMnoMetadata].
         */
        fun getMnoMetadata(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignGetMnoMetadataResponse>> =
            getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none())

        /** @see getMnoMetadata */
        fun getMnoMetadata(
            campaignId: String,
            params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetMnoMetadataResponse>> =
            getMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getMnoMetadata */
        fun getMnoMetadata(
            campaignId: String,
            params: CampaignGetMnoMetadataParams = CampaignGetMnoMetadataParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetMnoMetadataResponse>> =
            getMnoMetadata(campaignId, params, RequestOptions.none())

        /** @see getMnoMetadata */
        fun getMnoMetadata(
            params: CampaignGetMnoMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetMnoMetadataResponse>>

        /** @see getMnoMetadata */
        fun getMnoMetadata(
            params: CampaignGetMnoMetadataParams
        ): CompletableFuture<HttpResponseFor<CampaignGetMnoMetadataResponse>> =
            getMnoMetadata(params, RequestOptions.none())

        /** @see getMnoMetadata */
        fun getMnoMetadata(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignGetMnoMetadataResponse>> =
            getMnoMetadata(campaignId, CampaignGetMnoMetadataParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{campaignId}/operationStatus`, but is
         * otherwise the same as [CampaignServiceAsync.getOperationStatus].
         */
        fun getOperationStatus(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignGetOperationStatusResponse>> =
            getOperationStatus(campaignId, CampaignGetOperationStatusParams.none())

        /** @see getOperationStatus */
        fun getOperationStatus(
            campaignId: String,
            params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetOperationStatusResponse>> =
            getOperationStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getOperationStatus */
        fun getOperationStatus(
            campaignId: String,
            params: CampaignGetOperationStatusParams = CampaignGetOperationStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetOperationStatusResponse>> =
            getOperationStatus(campaignId, params, RequestOptions.none())

        /** @see getOperationStatus */
        fun getOperationStatus(
            params: CampaignGetOperationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetOperationStatusResponse>>

        /** @see getOperationStatus */
        fun getOperationStatus(
            params: CampaignGetOperationStatusParams
        ): CompletableFuture<HttpResponseFor<CampaignGetOperationStatusResponse>> =
            getOperationStatus(params, RequestOptions.none())

        /** @see getOperationStatus */
        fun getOperationStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignGetOperationStatusResponse>> =
            getOperationStatus(campaignId, CampaignGetOperationStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /campaign/{campaignId}/sharing`, but is otherwise
         * the same as [CampaignServiceAsync.getSharingStatus].
         */
        fun getSharingStatus(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignGetSharingStatusResponse>> =
            getSharingStatus(campaignId, CampaignGetSharingStatusParams.none())

        /** @see getSharingStatus */
        fun getSharingStatus(
            campaignId: String,
            params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetSharingStatusResponse>> =
            getSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see getSharingStatus */
        fun getSharingStatus(
            campaignId: String,
            params: CampaignGetSharingStatusParams = CampaignGetSharingStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetSharingStatusResponse>> =
            getSharingStatus(campaignId, params, RequestOptions.none())

        /** @see getSharingStatus */
        fun getSharingStatus(
            params: CampaignGetSharingStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignGetSharingStatusResponse>>

        /** @see getSharingStatus */
        fun getSharingStatus(
            params: CampaignGetSharingStatusParams
        ): CompletableFuture<HttpResponseFor<CampaignGetSharingStatusResponse>> =
            getSharingStatus(params, RequestOptions.none())

        /** @see getSharingStatus */
        fun getSharingStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignGetSharingStatusResponse>> =
            getSharingStatus(campaignId, CampaignGetSharingStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /campaign/{campaignId}/appeal`, but is otherwise
         * the same as [CampaignServiceAsync.submitAppeal].
         */
        fun submitAppeal(
            campaignId: String,
            params: CampaignSubmitAppealParams,
        ): CompletableFuture<HttpResponseFor<CampaignSubmitAppealResponse>> =
            submitAppeal(campaignId, params, RequestOptions.none())

        /** @see submitAppeal */
        fun submitAppeal(
            campaignId: String,
            params: CampaignSubmitAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSubmitAppealResponse>> =
            submitAppeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see submitAppeal */
        fun submitAppeal(
            params: CampaignSubmitAppealParams
        ): CompletableFuture<HttpResponseFor<CampaignSubmitAppealResponse>> =
            submitAppeal(params, RequestOptions.none())

        /** @see submitAppeal */
        fun submitAppeal(
            params: CampaignSubmitAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignSubmitAppealResponse>>
    }
}
