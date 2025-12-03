// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListPage
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListSharedByMePage
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignListSharedByMeParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusParams
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignRetrieveSharingStatusResponse
import com.telnyx.sdk.models.partnercampaigns.PartnerCampaignUpdateParams
import com.telnyx.sdk.models.partnercampaigns.TelnyxDownstreamCampaign
import java.util.function.Consumer

interface PartnerCampaignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartnerCampaignService

    /** Retrieve campaign details by `campaignId`. */
    fun retrieve(campaignId: String): TelnyxDownstreamCampaign =
        retrieve(campaignId, PartnerCampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxDownstreamCampaign =
        retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        campaignId: String,
        params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
    ): TelnyxDownstreamCampaign = retrieve(campaignId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PartnerCampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxDownstreamCampaign

    /** @see retrieve */
    fun retrieve(params: PartnerCampaignRetrieveParams): TelnyxDownstreamCampaign =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(campaignId: String, requestOptions: RequestOptions): TelnyxDownstreamCampaign =
        retrieve(campaignId, PartnerCampaignRetrieveParams.none(), requestOptions)

    /** Update campaign details by `campaignId`. **Please note:** Only webhook urls are editable. */
    fun update(campaignId: String): TelnyxDownstreamCampaign =
        update(campaignId, PartnerCampaignUpdateParams.none())

    /** @see update */
    fun update(
        campaignId: String,
        params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxDownstreamCampaign =
        update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see update */
    fun update(
        campaignId: String,
        params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
    ): TelnyxDownstreamCampaign = update(campaignId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartnerCampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxDownstreamCampaign

    /** @see update */
    fun update(params: PartnerCampaignUpdateParams): TelnyxDownstreamCampaign =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(campaignId: String, requestOptions: RequestOptions): TelnyxDownstreamCampaign =
        update(campaignId, PartnerCampaignUpdateParams.none(), requestOptions)

    /**
     * Retrieve all partner campaigns you have shared to Telnyx in a paginated fashion.
     *
     * This endpoint is currently limited to only returning shared campaigns that Telnyx has
     * accepted. In other words, shared but pending campaigns are currently omitted from the
     * response from this endpoint.
     */
    fun list(): PartnerCampaignListPage = list(PartnerCampaignListParams.none())

    /** @see list */
    fun list(
        params: PartnerCampaignListParams = PartnerCampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerCampaignListPage

    /** @see list */
    fun list(
        params: PartnerCampaignListParams = PartnerCampaignListParams.none()
    ): PartnerCampaignListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PartnerCampaignListPage =
        list(PartnerCampaignListParams.none(), requestOptions)

    /**
     * Get all partner campaigns you have shared to Telnyx in a paginated fashion
     *
     * This endpoint is currently limited to only returning shared campaigns that Telnyx has
     * accepted. In other words, shared but pending campaigns are currently omitted from the
     * response from this endpoint.
     */
    fun listSharedByMe(): PartnerCampaignListSharedByMePage =
        listSharedByMe(PartnerCampaignListSharedByMeParams.none())

    /** @see listSharedByMe */
    fun listSharedByMe(
        params: PartnerCampaignListSharedByMeParams = PartnerCampaignListSharedByMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerCampaignListSharedByMePage

    /** @see listSharedByMe */
    fun listSharedByMe(
        params: PartnerCampaignListSharedByMeParams = PartnerCampaignListSharedByMeParams.none()
    ): PartnerCampaignListSharedByMePage = listSharedByMe(params, RequestOptions.none())

    /** @see listSharedByMe */
    fun listSharedByMe(requestOptions: RequestOptions): PartnerCampaignListSharedByMePage =
        listSharedByMe(PartnerCampaignListSharedByMeParams.none(), requestOptions)

    /** Get Sharing Status */
    fun retrieveSharingStatus(campaignId: String): PartnerCampaignRetrieveSharingStatusResponse =
        retrieveSharingStatus(campaignId, PartnerCampaignRetrieveSharingStatusParams.none())

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        campaignId: String,
        params: PartnerCampaignRetrieveSharingStatusParams =
            PartnerCampaignRetrieveSharingStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerCampaignRetrieveSharingStatusResponse =
        retrieveSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        campaignId: String,
        params: PartnerCampaignRetrieveSharingStatusParams =
            PartnerCampaignRetrieveSharingStatusParams.none(),
    ): PartnerCampaignRetrieveSharingStatusResponse =
        retrieveSharingStatus(campaignId, params, RequestOptions.none())

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        params: PartnerCampaignRetrieveSharingStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PartnerCampaignRetrieveSharingStatusResponse

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        params: PartnerCampaignRetrieveSharingStatusParams
    ): PartnerCampaignRetrieveSharingStatusResponse =
        retrieveSharingStatus(params, RequestOptions.none())

    /** @see retrieveSharingStatus */
    fun retrieveSharingStatus(
        campaignId: String,
        requestOptions: RequestOptions,
    ): PartnerCampaignRetrieveSharingStatusResponse =
        retrieveSharingStatus(
            campaignId,
            PartnerCampaignRetrieveSharingStatusParams.none(),
            requestOptions,
        )

    /**
     * A view of [PartnerCampaignService] that provides access to raw HTTP responses for each
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
        ): PartnerCampaignService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /partner_campaigns/{campaignId}`, but is otherwise
         * the same as [PartnerCampaignService.retrieve].
         */
        @MustBeClosed
        fun retrieve(campaignId: String): HttpResponseFor<TelnyxDownstreamCampaign> =
            retrieve(campaignId, PartnerCampaignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxDownstreamCampaign> =
            retrieve(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            params: PartnerCampaignRetrieveParams = PartnerCampaignRetrieveParams.none(),
        ): HttpResponseFor<TelnyxDownstreamCampaign> =
            retrieve(campaignId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PartnerCampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxDownstreamCampaign>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PartnerCampaignRetrieveParams
        ): HttpResponseFor<TelnyxDownstreamCampaign> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxDownstreamCampaign> =
            retrieve(campaignId, PartnerCampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /partner_campaigns/{campaignId}`, but is otherwise
         * the same as [PartnerCampaignService.update].
         */
        @MustBeClosed
        fun update(campaignId: String): HttpResponseFor<TelnyxDownstreamCampaign> =
            update(campaignId, PartnerCampaignUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxDownstreamCampaign> =
            update(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            params: PartnerCampaignUpdateParams = PartnerCampaignUpdateParams.none(),
        ): HttpResponseFor<TelnyxDownstreamCampaign> =
            update(campaignId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PartnerCampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxDownstreamCampaign>

        /** @see update */
        @MustBeClosed
        fun update(params: PartnerCampaignUpdateParams): HttpResponseFor<TelnyxDownstreamCampaign> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelnyxDownstreamCampaign> =
            update(campaignId, PartnerCampaignUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /partner_campaigns`, but is otherwise the same as
         * [PartnerCampaignService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PartnerCampaignListPage> =
            list(PartnerCampaignListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PartnerCampaignListParams = PartnerCampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerCampaignListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PartnerCampaignListParams = PartnerCampaignListParams.none()
        ): HttpResponseFor<PartnerCampaignListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PartnerCampaignListPage> =
            list(PartnerCampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /partnerCampaign/sharedByMe`, but is otherwise the
         * same as [PartnerCampaignService.listSharedByMe].
         */
        @MustBeClosed
        fun listSharedByMe(): HttpResponseFor<PartnerCampaignListSharedByMePage> =
            listSharedByMe(PartnerCampaignListSharedByMeParams.none())

        /** @see listSharedByMe */
        @MustBeClosed
        fun listSharedByMe(
            params: PartnerCampaignListSharedByMeParams =
                PartnerCampaignListSharedByMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerCampaignListSharedByMePage>

        /** @see listSharedByMe */
        @MustBeClosed
        fun listSharedByMe(
            params: PartnerCampaignListSharedByMeParams = PartnerCampaignListSharedByMeParams.none()
        ): HttpResponseFor<PartnerCampaignListSharedByMePage> =
            listSharedByMe(params, RequestOptions.none())

        /** @see listSharedByMe */
        @MustBeClosed
        fun listSharedByMe(
            requestOptions: RequestOptions
        ): HttpResponseFor<PartnerCampaignListSharedByMePage> =
            listSharedByMe(PartnerCampaignListSharedByMeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /partnerCampaign/{campaignId}/sharing`, but is
         * otherwise the same as [PartnerCampaignService.retrieveSharingStatus].
         */
        @MustBeClosed
        fun retrieveSharingStatus(
            campaignId: String
        ): HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse> =
            retrieveSharingStatus(campaignId, PartnerCampaignRetrieveSharingStatusParams.none())

        /** @see retrieveSharingStatus */
        @MustBeClosed
        fun retrieveSharingStatus(
            campaignId: String,
            params: PartnerCampaignRetrieveSharingStatusParams =
                PartnerCampaignRetrieveSharingStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse> =
            retrieveSharingStatus(params.toBuilder().campaignId(campaignId).build(), requestOptions)

        /** @see retrieveSharingStatus */
        @MustBeClosed
        fun retrieveSharingStatus(
            campaignId: String,
            params: PartnerCampaignRetrieveSharingStatusParams =
                PartnerCampaignRetrieveSharingStatusParams.none(),
        ): HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse> =
            retrieveSharingStatus(campaignId, params, RequestOptions.none())

        /** @see retrieveSharingStatus */
        @MustBeClosed
        fun retrieveSharingStatus(
            params: PartnerCampaignRetrieveSharingStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse>

        /** @see retrieveSharingStatus */
        @MustBeClosed
        fun retrieveSharingStatus(
            params: PartnerCampaignRetrieveSharingStatusParams
        ): HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse> =
            retrieveSharingStatus(params, RequestOptions.none())

        /** @see retrieveSharingStatus */
        @MustBeClosed
        fun retrieveSharingStatus(
            campaignId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PartnerCampaignRetrieveSharingStatusResponse> =
            retrieveSharingStatus(
                campaignId,
                PartnerCampaignRetrieveSharingStatusParams.none(),
                requestOptions,
            )
    }
}
