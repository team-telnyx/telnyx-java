// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListResponse
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListSharedByMeParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListSharedByMeResponse
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusResponse
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignUpdateParams
import com.telnyx.sdk.models.partnercampaigns.TelnyxDownstreamCampaign
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PartnerCampaignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerCampaignServiceAsync

    /** Retrieve campaign details by `campaignId`. */
    fun retrieve(campaignId: String): CompletableFuture<TelnyxDownstreamCampaign> =
        retrieve(campaignId, PartnerCampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        retrieve(campaignId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PartnerCampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxDownstreamCampaign>

    /** @see retrieve */
    fun retrieve(
        params: PartnerCampaignRetrieveParams
    ): CompletableFuture<TelnyxDownstreamCampaign> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        retrieve(campaignId, PartnerCampaignRetrieveParams.none(), requestOptions)

    /** Update campaign details by `campaignId`. **Please note:** Only webhook urls are editable. */
    fun update(campaignId: String): CompletableFuture<TelnyxDownstreamCampaign> =
        update(campaignId, PartnerCampaignUpdateParams.none())

    /** @see update */
    fun update(
        campaignId: String,
        params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see update */
    fun update(
        campaignId: String,
        params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        update(campaignId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartnerCampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxDownstreamCampaign>

    /** @see update */
    fun update(params: PartnerCampaignUpdateParams): CompletableFuture<TelnyxDownstreamCampaign> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxDownstreamCampaign> =
        update(campaignId, PartnerCampaignUpdateParams.none(), requestOptions)

    /**
     * Retrieve all partner campaigns you have shared to Telnyx in a paginated fashion.
     *
     * This endpoint is currently limited to only returning shared campaigns that Telnyx has
     * accepted. In other words, shared but pending campaigns are currently omitted from the
     * response from this endpoint.
     */
    fun list(): CompletableFuture<PartnerCampaignListResponse> =
        list(PartnerCampaignListParams.none())

    /** @see list */
    fun list(
        params: PartnerCampaignListParams = PartnerCampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerCampaignListResponse>

    /** @see list */
    fun list(
        params: PartnerCampaignListParams = PartnerCampaignListParams.none()
    ): CompletableFuture<PartnerCampaignListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PartnerCampaignListResponse> =
        list(PartnerCampaignListParams.none(), requestOptions)

    /**
     * Get all partner campaigns you have shared to Telnyx in a paginated fashion
     *
     * This endpoint is currently limited to only returning shared campaigns that Telnyx has
     * accepted. In other words, shared but pending campaigns are currently omitted from the
     * response from this endpoint.
     */
    fun listSharedByMe(): CompletableFuture<PartnerCampaignListSharedByMeResponse> =
        listSharedByMe(PartnerCampaignListSharedByMeParams.none())

    /** @see listSharedByMe */
    fun listSharedByMe(
        params: PartnerCampaignListSharedByMeParams = PartnerCampaignListSharedByMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerCampaignListSharedByMeResponse>

    /** @see listSharedByMe */
    fun listSharedByMe(
        params: PartnerCampaignListSharedByMeParams = PartnerCampaignListSharedByMeParams.none()
    ): CompletableFuture<PartnerCampaignListSharedByMeResponse> =
        listSharedByMe(params, RequestOptions.none())

    /** @see listSharedByMe */
    fun listSharedByMe(
        requestOptions: RequestOptions
    ): CompletableFuture<PartnerCampaignListSharedByMeResponse> =
        listSharedByMe(PartnerCampaignListSharedByMeParams.none(), requestOptions)

    /** Get Sharing Status */
    fun retrieveSharingStatus(
        campaignId: String
    ): CompletableFuture<PartnerCampaignRetrieveSharingStatusResponse> =
        retrieveSharingStatus(campaignId, PartnerCampaignRetrieveSharingStatusParams.none())

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        campaignId: String,
        params: PartnerCampaignRetrieveSharingStatusParams =
            PartnerCampaignRetrieveSharingStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerCampaignRetrieveSharingStatusResponse> =
        retrieveSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        campaignId: String,
        params: PartnerCampaignRetrieveSharingStatusParams =
            PartnerCampaignRetrieveSharingStatusParams.none(),
    ): CompletableFuture<PartnerCampaignRetrieveSharingStatusResponse> =
        retrieveSharingStatus(campaignId, params, RequestOptions.none())

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        params: PartnerCampaignRetrieveSharingStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PartnerCampaignRetrieveSharingStatusResponse>

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        params: PartnerCampaignRetrieveSharingStatusParams
    ): CompletableFuture<PartnerCampaignRetrieveSharingStatusResponse> =
        retrieveSharingStatus(params, RequestOptions.none())

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PartnerCampaignRetrieveSharingStatusResponse> =
        retrieveSharingStatus(
            campaignId,
            PartnerCampaignRetrieveSharingStatusParams.none(),
            requestOptions,
        )

    /**
     * A view of [PartnerCampaignServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartnerCampaignServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /partner_campaigns/{campaignId}`, but is otherwise
         * the same as [PartnerCampaignServiceAsync.retrieve].
         */
        fun retrieve(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            retrieve(campaignId, PartnerCampaignRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            retrieve(campaignId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PartnerCampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>>

        /** @see retrieve */
        fun retrieve(
            params: PartnerCampaignRetrieveParams
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            retrieve(campaignId, PartnerCampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /partner_campaigns/{campaignId}`, but is otherwise
         * the same as [PartnerCampaignServiceAsync.update].
         */
        fun update(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            update(campaignId, PartnerCampaignUpdateParams.none())

        /** @see update */
        fun update(
            campaignId: String,
            params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see update */
        fun update(
            campaignId: String,
            params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            update(campaignId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PartnerCampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>>

        /** @see update */
        fun update(
            params: PartnerCampaignUpdateParams
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxDownstreamCampaign>> =
            update(campaignId, PartnerCampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /partner_campaigns`, but is otherwise the same as
         * [PartnerCampaignServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PartnerCampaignListResponse>> =
            list(PartnerCampaignListParams.none())

        /** @see list */
        fun list(
            params: PartnerCampaignListParams = PartnerCampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListResponse>>

        /** @see list */
        fun list(
            params: PartnerCampaignListParams = PartnerCampaignListParams.none()
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListResponse>> =
            list(PartnerCampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /partnerCampaign/sharedByMe`, but is otherwise the
         * same as [PartnerCampaignServiceAsync.listSharedByMe].
         */
        fun listSharedByMe():
            CompletableFuture<HttpResponseFor<PartnerCampaignListSharedByMeResponse>> =
            listSharedByMe(PartnerCampaignListSharedByMeParams.none())

        /** @see listSharedByMe */
        fun listSharedByMe(
            params: PartnerCampaignListSharedByMeParams =
                PartnerCampaignListSharedByMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListSharedByMeResponse>>

        /** @see listSharedByMe */
        fun listSharedByMe(
            params: PartnerCampaignListSharedByMeParams = PartnerCampaignListSharedByMeParams.none()
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListSharedByMeResponse>> =
            listSharedByMe(params, RequestOptions.none())

        /** @see listSharedByMe */
        fun listSharedByMe(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PartnerCampaignListSharedByMeResponse>> =
            listSharedByMe(PartnerCampaignListSharedByMeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /partnerCampaign/{campaignId}/sharing`, but is
         * otherwise the same as [PartnerCampaignServiceAsync.retrieveSharingStatus].
         */
        fun retrieveSharingStatus(
            campaignId: String
        ): CompletableFuture<HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>> =
            retrieveSharingStatus(campaignId, PartnerCampaignRetrieveSharingStatusParams.none())

        /** @see retrieveSharingStatus */
        fun retrieveSharingStatus(
            campaignId: String,
            params: PartnerCampaignRetrieveSharingStatusParams =
                PartnerCampaignRetrieveSharingStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>> =
            retrieveSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveSharingStatus */
        fun retrieveSharingStatus(
            campaignId: String,
            params: PartnerCampaignRetrieveSharingStatusParams =
                PartnerCampaignRetrieveSharingStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>> =
            retrieveSharingStatus(campaignId, params, RequestOptions.none())

        /** @see retrieveSharingStatus */
        fun retrieveSharingStatus(
            params: PartnerCampaignRetrieveSharingStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>>

        /** @see retrieveSharingStatus */
        fun retrieveSharingStatus(
            params: PartnerCampaignRetrieveSharingStatusParams
        ): CompletableFuture<HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>> =
            retrieveSharingStatus(params, RequestOptions.none())

        /** @see retrieveSharingStatus */
        fun retrieveSharingStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>> =
            retrieveSharingStatus(
                campaignId,
                PartnerCampaignRetrieveSharingStatusParams.none(),
                requestOptions,
            )
    }
}
