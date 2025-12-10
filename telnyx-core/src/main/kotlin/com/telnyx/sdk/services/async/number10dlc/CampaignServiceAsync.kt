// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.models.number10dlc.campaign.CampaignAppealParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignAppealResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignDeleteParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignDeleteResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignListResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveMnoMetadataParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveMnoMetadataResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveOperationStatusParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveOperationStatusResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveSharingParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignRetrieveSharingResponse
import com.telnyx.sdk.models.number10dlc.campaign.CampaignUpdateParams
import com.telnyx.sdk.services.async.number10dlc.campaign.OsrServiceAsync
import com.telnyx.sdk.services.async.number10dlc.campaign.UsecaseServiceAsync
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
    fun list(params: CampaignListParams): CompletableFuture<CampaignListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignListResponse>

    /** Terminate a campaign. Note that once deactivated, a campaign cannot be restored. */
    fun delete(campaignId: String): CompletableFuture<CampaignDeleteResponse> =
        delete(campaignId, CampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        campaignId: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDeleteResponse> =
        delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see delete */
    fun delete(
        campaignId: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
    ): CompletableFuture<CampaignDeleteResponse> = delete(campaignId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CampaignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignDeleteResponse>

    /** @see delete */
    fun delete(params: CampaignDeleteParams): CompletableFuture<CampaignDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignDeleteResponse> =
        delete(campaignId, CampaignDeleteParams.none(), requestOptions)

    /**
     * Submits an appeal for rejected native campaigns in TELNYX_FAILED or MNO_REJECTED status. The
     * appeal is recorded for manual compliance team review and the campaign status is reset to
     * TCR_ACCEPTED. Note: Appeal forwarding is handled manually to allow proper review before
     * incurring upstream charges.
     */
    fun appeal(
        campaignId: String,
        params: CampaignAppealParams,
    ): CompletableFuture<CampaignAppealResponse> = appeal(campaignId, params, RequestOptions.none())

    /** @see appeal */
    fun appeal(
        campaignId: String,
        params: CampaignAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignAppealResponse> =
        appeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see appeal */
    fun appeal(params: CampaignAppealParams): CompletableFuture<CampaignAppealResponse> =
        appeal(params, RequestOptions.none())

    /** @see appeal */
    fun appeal(
        params: CampaignAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignAppealResponse>

    /** Get the campaign metadata for each MNO it was submitted to. */
    fun retrieveMnoMetadata(
        campaignId: String
    ): CompletableFuture<CampaignRetrieveMnoMetadataResponse> =
        retrieveMnoMetadata(campaignId, CampaignRetrieveMnoMetadataParams.none())

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        campaignId: String,
        params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveMnoMetadataResponse> =
        retrieveMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        campaignId: String,
        params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
    ): CompletableFuture<CampaignRetrieveMnoMetadataResponse> =
        retrieveMnoMetadata(campaignId, params, RequestOptions.none())

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        params: CampaignRetrieveMnoMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveMnoMetadataResponse>

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        params: CampaignRetrieveMnoMetadataParams
    ): CompletableFuture<CampaignRetrieveMnoMetadataResponse> =
        retrieveMnoMetadata(params, RequestOptions.none())

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveMnoMetadataResponse> =
        retrieveMnoMetadata(campaignId, CampaignRetrieveMnoMetadataParams.none(), requestOptions)

    /** Retrieve campaign's operation status at MNO level. */
    fun retrieveOperationStatus(
        campaignId: String
    ): CompletableFuture<CampaignRetrieveOperationStatusResponse> =
        retrieveOperationStatus(campaignId, CampaignRetrieveOperationStatusParams.none())

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        campaignId: String,
        params: CampaignRetrieveOperationStatusParams =
            CampaignRetrieveOperationStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveOperationStatusResponse> =
        retrieveOperationStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        campaignId: String,
        params: CampaignRetrieveOperationStatusParams = CampaignRetrieveOperationStatusParams.none(),
    ): CompletableFuture<CampaignRetrieveOperationStatusResponse> =
        retrieveOperationStatus(campaignId, params, RequestOptions.none())

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        params: CampaignRetrieveOperationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveOperationStatusResponse>

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        params: CampaignRetrieveOperationStatusParams
    ): CompletableFuture<CampaignRetrieveOperationStatusResponse> =
        retrieveOperationStatus(params, RequestOptions.none())

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveOperationStatusResponse> =
        retrieveOperationStatus(
            campaignId,
            CampaignRetrieveOperationStatusParams.none(),
            requestOptions,
        )

    /** Get Sharing Status */
    fun retrieveSharing(campaignId: String): CompletableFuture<CampaignRetrieveSharingResponse> =
        retrieveSharing(campaignId, CampaignRetrieveSharingParams.none())

    /** @see retrieveSharing */
    fun retrieveSharing(
        campaignId: String,
        params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveSharingResponse> =
        retrieveSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveSharing */
    fun retrieveSharing(
        campaignId: String,
        params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
    ): CompletableFuture<CampaignRetrieveSharingResponse> =
        retrieveSharing(campaignId, params, RequestOptions.none())

    /** @see retrieveSharing */
    fun retrieveSharing(
        params: CampaignRetrieveSharingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CampaignRetrieveSharingResponse>

    /** @see retrieveSharing */
    fun retrieveSharing(
        params: CampaignRetrieveSharingParams
    ): CompletableFuture<CampaignRetrieveSharingResponse> =
        retrieveSharing(params, RequestOptions.none())

    /** @see retrieveSharing */
    fun retrieveSharing(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CampaignRetrieveSharingResponse> =
        retrieveSharing(campaignId, CampaignRetrieveSharingParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}`, but is otherwise the
         * same as [CampaignServiceAsync.retrieve].
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
         * Returns a raw HTTP response for `put /10dlc/campaign/{campaignId}`, but is otherwise the
         * same as [CampaignServiceAsync.update].
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
         * Returns a raw HTTP response for `get /10dlc/campaign`, but is otherwise the same as
         * [CampaignServiceAsync.list].
         */
        fun list(
            params: CampaignListParams
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignListResponse>>

        /**
         * Returns a raw HTTP response for `delete /10dlc/campaign/{campaignId}`, but is otherwise
         * the same as [CampaignServiceAsync.delete].
         */
        fun delete(campaignId: String): CompletableFuture<HttpResponseFor<CampaignDeleteResponse>> =
            delete(campaignId, CampaignDeleteParams.none())

        /** @see delete */
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDeleteResponse>> =
            delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see delete */
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDeleteResponse>> =
            delete(campaignId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignDeleteResponse>>

        /** @see delete */
        fun delete(
            params: CampaignDeleteParams
        ): CompletableFuture<HttpResponseFor<CampaignDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignDeleteResponse>> =
            delete(campaignId, CampaignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/campaign/{campaignId}/appeal`, but is
         * otherwise the same as [CampaignServiceAsync.appeal].
         */
        fun appeal(
            campaignId: String,
            params: CampaignAppealParams,
        ): CompletableFuture<HttpResponseFor<CampaignAppealResponse>> =
            appeal(campaignId, params, RequestOptions.none())

        /** @see appeal */
        fun appeal(
            campaignId: String,
            params: CampaignAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignAppealResponse>> =
            appeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see appeal */
        fun appeal(
            params: CampaignAppealParams
        ): CompletableFuture<HttpResponseFor<CampaignAppealResponse>> =
            appeal(params, RequestOptions.none())

        /** @see appeal */
        fun appeal(
            params: CampaignAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignAppealResponse>>

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/mnoMetadata`, but is
         * otherwise the same as [CampaignServiceAsync.retrieveMnoMetadata].
         */
        fun retrieveMnoMetadata(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveMnoMetadataResponse>> =
            retrieveMnoMetadata(campaignId, CampaignRetrieveMnoMetadataParams.none())

        /** @see retrieveMnoMetadata */
        fun retrieveMnoMetadata(
            campaignId: String,
            params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveMnoMetadataResponse>> =
            retrieveMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveMnoMetadata */
        fun retrieveMnoMetadata(
            campaignId: String,
            params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveMnoMetadataResponse>> =
            retrieveMnoMetadata(campaignId, params, RequestOptions.none())

        /** @see retrieveMnoMetadata */
        fun retrieveMnoMetadata(
            params: CampaignRetrieveMnoMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveMnoMetadataResponse>>

        /** @see retrieveMnoMetadata */
        fun retrieveMnoMetadata(
            params: CampaignRetrieveMnoMetadataParams
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveMnoMetadataResponse>> =
            retrieveMnoMetadata(params, RequestOptions.none())

        /** @see retrieveMnoMetadata */
        fun retrieveMnoMetadata(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveMnoMetadataResponse>> =
            retrieveMnoMetadata(
                campaignId,
                CampaignRetrieveMnoMetadataParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/operationStatus`, but
         * is otherwise the same as [CampaignServiceAsync.retrieveOperationStatus].
         */
        fun retrieveOperationStatus(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveOperationStatusResponse>> =
            retrieveOperationStatus(campaignId, CampaignRetrieveOperationStatusParams.none())

        /** @see retrieveOperationStatus */
        fun retrieveOperationStatus(
            campaignId: String,
            params: CampaignRetrieveOperationStatusParams =
                CampaignRetrieveOperationStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveOperationStatusResponse>> =
            retrieveOperationStatus(
                params.toBuilder().campaignId(campaignId).build(),
                requestOptions,
            )

        /** @see retrieveOperationStatus */
        fun retrieveOperationStatus(
            campaignId: String,
            params: CampaignRetrieveOperationStatusParams =
                CampaignRetrieveOperationStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveOperationStatusResponse>> =
            retrieveOperationStatus(campaignId, params, RequestOptions.none())

        /** @see retrieveOperationStatus */
        fun retrieveOperationStatus(
            params: CampaignRetrieveOperationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveOperationStatusResponse>>

        /** @see retrieveOperationStatus */
        fun retrieveOperationStatus(
            params: CampaignRetrieveOperationStatusParams
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveOperationStatusResponse>> =
            retrieveOperationStatus(params, RequestOptions.none())

        /** @see retrieveOperationStatus */
        fun retrieveOperationStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveOperationStatusResponse>> =
            retrieveOperationStatus(
                campaignId,
                CampaignRetrieveOperationStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/sharing`, but is
         * otherwise the same as [CampaignServiceAsync.retrieveSharing].
         */
        fun retrieveSharing(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveSharingResponse>> =
            retrieveSharing(campaignId, CampaignRetrieveSharingParams.none())

        /** @see retrieveSharing */
        fun retrieveSharing(
            campaignId: String,
            params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveSharingResponse>> =
            retrieveSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveSharing */
        fun retrieveSharing(
            campaignId: String,
            params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveSharingResponse>> =
            retrieveSharing(campaignId, params, RequestOptions.none())

        /** @see retrieveSharing */
        fun retrieveSharing(
            params: CampaignRetrieveSharingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveSharingResponse>>

        /** @see retrieveSharing */
        fun retrieveSharing(
            params: CampaignRetrieveSharingParams
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveSharingResponse>> =
            retrieveSharing(params, RequestOptions.none())

        /** @see retrieveSharing */
        fun retrieveSharing(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CampaignRetrieveSharingResponse>> =
            retrieveSharing(campaignId, CampaignRetrieveSharingParams.none(), requestOptions)
    }
}
