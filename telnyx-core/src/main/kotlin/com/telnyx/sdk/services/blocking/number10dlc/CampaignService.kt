// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

import com.google.errorprone.annotations.MustBeClosed
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
    fun list(params: CampaignListParams): CampaignListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignListResponse

    /** Terminate a campaign. Note that once deactivated, a campaign cannot be restored. */
    fun delete(campaignId: String): CampaignDeleteResponse =
        delete(campaignId, CampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        campaignId: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDeleteResponse =
        delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see delete */
    fun delete(
        campaignId: String,
        params: CampaignDeleteParams = CampaignDeleteParams.none(),
    ): CampaignDeleteResponse = delete(campaignId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CampaignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignDeleteResponse

    /** @see delete */
    fun delete(params: CampaignDeleteParams): CampaignDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(campaignId: String, requestOptions: RequestOptions): CampaignDeleteResponse =
        delete(campaignId, CampaignDeleteParams.none(), requestOptions)

    /**
     * Submits an appeal for rejected native campaigns in TELNYX_FAILED or MNO_REJECTED status. The
     * appeal is recorded for manual compliance team review and the campaign status is reset to
     * TCR_ACCEPTED. Note: Appeal forwarding is handled manually to allow proper review before
     * incurring upstream charges.
     */
    fun appeal(campaignId: String, params: CampaignAppealParams): CampaignAppealResponse =
        appeal(campaignId, params, RequestOptions.none())

    /** @see appeal */
    fun appeal(
        campaignId: String,
        params: CampaignAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignAppealResponse =
        appeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see appeal */
    fun appeal(params: CampaignAppealParams): CampaignAppealResponse =
        appeal(params, RequestOptions.none())

    /** @see appeal */
    fun appeal(
        params: CampaignAppealParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignAppealResponse

    /** Get the campaign metadata for each MNO it was submitted to. */
    fun retrieveMnoMetadata(campaignId: String): CampaignRetrieveMnoMetadataResponse =
        retrieveMnoMetadata(campaignId, CampaignRetrieveMnoMetadataParams.none())

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        campaignId: String,
        params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveMnoMetadataResponse =
        retrieveMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        campaignId: String,
        params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
    ): CampaignRetrieveMnoMetadataResponse =
        retrieveMnoMetadata(campaignId, params, RequestOptions.none())

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        params: CampaignRetrieveMnoMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveMnoMetadataResponse

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        params: CampaignRetrieveMnoMetadataParams
    ): CampaignRetrieveMnoMetadataResponse = retrieveMnoMetadata(params, RequestOptions.none())

    /** @see retrieveMnoMetadata */
    fun retrieveMnoMetadata(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CampaignRetrieveMnoMetadataResponse =
        retrieveMnoMetadata(campaignId, CampaignRetrieveMnoMetadataParams.none(), requestOptions)

    /** Retrieve campaign's operation status at MNO level. */
    fun retrieveOperationStatus(campaignId: String): CampaignRetrieveOperationStatusResponse =
        retrieveOperationStatus(campaignId, CampaignRetrieveOperationStatusParams.none())

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        campaignId: String,
        params: CampaignRetrieveOperationStatusParams =
            CampaignRetrieveOperationStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveOperationStatusResponse =
        retrieveOperationStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        campaignId: String,
        params: CampaignRetrieveOperationStatusParams = CampaignRetrieveOperationStatusParams.none(),
    ): CampaignRetrieveOperationStatusResponse =
        retrieveOperationStatus(campaignId, params, RequestOptions.none())

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        params: CampaignRetrieveOperationStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveOperationStatusResponse

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        params: CampaignRetrieveOperationStatusParams
    ): CampaignRetrieveOperationStatusResponse =
        retrieveOperationStatus(params, RequestOptions.none())

    /** @see retrieveOperationStatus */
    fun retrieveOperationStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CampaignRetrieveOperationStatusResponse =
        retrieveOperationStatus(
            campaignId,
            CampaignRetrieveOperationStatusParams.none(),
            requestOptions,
        )

    /** Get Sharing Status */
    fun retrieveSharing(campaignId: String): CampaignRetrieveSharingResponse =
        retrieveSharing(campaignId, CampaignRetrieveSharingParams.none())

    /** @see retrieveSharing */
    fun retrieveSharing(
        campaignId: String,
        params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveSharingResponse =
        retrieveSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveSharing */
    fun retrieveSharing(
        campaignId: String,
        params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
    ): CampaignRetrieveSharingResponse = retrieveSharing(campaignId, params, RequestOptions.none())

    /** @see retrieveSharing */
    fun retrieveSharing(
        params: CampaignRetrieveSharingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CampaignRetrieveSharingResponse

    /** @see retrieveSharing */
    fun retrieveSharing(params: CampaignRetrieveSharingParams): CampaignRetrieveSharingResponse =
        retrieveSharing(params, RequestOptions.none())

    /** @see retrieveSharing */
    fun retrieveSharing(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CampaignRetrieveSharingResponse =
        retrieveSharing(campaignId, CampaignRetrieveSharingParams.none(), requestOptions)

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
        fun list(params: CampaignListParams): HttpResponseFor<CampaignListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignListResponse>

        /**
         * Returns a raw HTTP response for `delete /10dlc/campaign/{campaignId}`, but is otherwise
         * the same as [CampaignService.delete].
         */
        @MustBeClosed
        fun delete(campaignId: String): HttpResponseFor<CampaignDeleteResponse> =
            delete(campaignId, CampaignDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDeleteResponse> =
            delete(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignId: String,
            params: CampaignDeleteParams = CampaignDeleteParams.none(),
        ): HttpResponseFor<CampaignDeleteResponse> =
            delete(campaignId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: CampaignDeleteParams): HttpResponseFor<CampaignDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignDeleteResponse> =
            delete(campaignId, CampaignDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/campaign/{campaignId}/appeal`, but is
         * otherwise the same as [CampaignService.appeal].
         */
        @MustBeClosed
        fun appeal(
            campaignId: String,
            params: CampaignAppealParams,
        ): HttpResponseFor<CampaignAppealResponse> =
            appeal(campaignId, params, RequestOptions.none())

        /** @see appeal */
        @MustBeClosed
        fun appeal(
            campaignId: String,
            params: CampaignAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignAppealResponse> =
            appeal(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see appeal */
        @MustBeClosed
        fun appeal(params: CampaignAppealParams): HttpResponseFor<CampaignAppealResponse> =
            appeal(params, RequestOptions.none())

        /** @see appeal */
        @MustBeClosed
        fun appeal(
            params: CampaignAppealParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignAppealResponse>

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/mnoMetadata`, but is
         * otherwise the same as [CampaignService.retrieveMnoMetadata].
         */
        @MustBeClosed
        fun retrieveMnoMetadata(
            campaignId: String
        ): HttpResponseFor<CampaignRetrieveMnoMetadataResponse> =
            retrieveMnoMetadata(campaignId, CampaignRetrieveMnoMetadataParams.none())

        /** @see retrieveMnoMetadata */
        @MustBeClosed
        fun retrieveMnoMetadata(
            campaignId: String,
            params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveMnoMetadataResponse> =
            retrieveMnoMetadata(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveMnoMetadata */
        @MustBeClosed
        fun retrieveMnoMetadata(
            campaignId: String,
            params: CampaignRetrieveMnoMetadataParams = CampaignRetrieveMnoMetadataParams.none(),
        ): HttpResponseFor<CampaignRetrieveMnoMetadataResponse> =
            retrieveMnoMetadata(campaignId, params, RequestOptions.none())

        /** @see retrieveMnoMetadata */
        @MustBeClosed
        fun retrieveMnoMetadata(
            params: CampaignRetrieveMnoMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveMnoMetadataResponse>

        /** @see retrieveMnoMetadata */
        @MustBeClosed
        fun retrieveMnoMetadata(
            params: CampaignRetrieveMnoMetadataParams
        ): HttpResponseFor<CampaignRetrieveMnoMetadataResponse> =
            retrieveMnoMetadata(params, RequestOptions.none())

        /** @see retrieveMnoMetadata */
        @MustBeClosed
        fun retrieveMnoMetadata(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveMnoMetadataResponse> =
            retrieveMnoMetadata(
                campaignId,
                CampaignRetrieveMnoMetadataParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/operationStatus`, but
         * is otherwise the same as [CampaignService.retrieveOperationStatus].
         */
        @MustBeClosed
        fun retrieveOperationStatus(
            campaignId: String
        ): HttpResponseFor<CampaignRetrieveOperationStatusResponse> =
            retrieveOperationStatus(campaignId, CampaignRetrieveOperationStatusParams.none())

        /** @see retrieveOperationStatus */
        @MustBeClosed
        fun retrieveOperationStatus(
            campaignId: String,
            params: CampaignRetrieveOperationStatusParams =
                CampaignRetrieveOperationStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveOperationStatusResponse> =
            retrieveOperationStatus(
                params.toBuilder().campaignId(campaignId).build(),
                requestOptions,
            )

        /** @see retrieveOperationStatus */
        @MustBeClosed
        fun retrieveOperationStatus(
            campaignId: String,
            params: CampaignRetrieveOperationStatusParams =
                CampaignRetrieveOperationStatusParams.none(),
        ): HttpResponseFor<CampaignRetrieveOperationStatusResponse> =
            retrieveOperationStatus(campaignId, params, RequestOptions.none())

        /** @see retrieveOperationStatus */
        @MustBeClosed
        fun retrieveOperationStatus(
            params: CampaignRetrieveOperationStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveOperationStatusResponse>

        /** @see retrieveOperationStatus */
        @MustBeClosed
        fun retrieveOperationStatus(
            params: CampaignRetrieveOperationStatusParams
        ): HttpResponseFor<CampaignRetrieveOperationStatusResponse> =
            retrieveOperationStatus(params, RequestOptions.none())

        /** @see retrieveOperationStatus */
        @MustBeClosed
        fun retrieveOperationStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveOperationStatusResponse> =
            retrieveOperationStatus(
                campaignId,
                CampaignRetrieveOperationStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/campaign/{campaignId}/sharing`, but is
         * otherwise the same as [CampaignService.retrieveSharing].
         */
        @MustBeClosed
        fun retrieveSharing(campaignId: String): HttpResponseFor<CampaignRetrieveSharingResponse> =
            retrieveSharing(campaignId, CampaignRetrieveSharingParams.none())

        /** @see retrieveSharing */
        @MustBeClosed
        fun retrieveSharing(
            campaignId: String,
            params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveSharingResponse> =
            retrieveSharing(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveSharing */
        @MustBeClosed
        fun retrieveSharing(
            campaignId: String,
            params: CampaignRetrieveSharingParams = CampaignRetrieveSharingParams.none(),
        ): HttpResponseFor<CampaignRetrieveSharingResponse> =
            retrieveSharing(campaignId, params, RequestOptions.none())

        /** @see retrieveSharing */
        @MustBeClosed
        fun retrieveSharing(
            params: CampaignRetrieveSharingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CampaignRetrieveSharingResponse>

        /** @see retrieveSharing */
        @MustBeClosed
        fun retrieveSharing(
            params: CampaignRetrieveSharingParams
        ): HttpResponseFor<CampaignRetrieveSharingResponse> =
            retrieveSharing(params, RequestOptions.none())

        /** @see retrieveSharing */
        @MustBeClosed
        fun retrieveSharing(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignRetrieveSharingResponse> =
            retrieveSharing(campaignId, CampaignRetrieveSharingParams.none(), requestOptions)
    }
}
