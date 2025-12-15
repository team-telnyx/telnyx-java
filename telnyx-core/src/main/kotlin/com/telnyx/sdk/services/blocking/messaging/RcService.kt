// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberParams
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberResponse
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesResponse
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesResponse
import com.telnyx.sdk.services.blocking.messaging.rcs.AgentService
import java.util.function.Consumer

interface RcService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService

    fun agents(): AgentService

    /** Adds a test phone number to an RCS agent for testing purposes. */
    fun inviteTestNumber(
        phoneNumber: String,
        params: RcInviteTestNumberParams,
    ): RcInviteTestNumberResponse = inviteTestNumber(phoneNumber, params, RequestOptions.none())

    /** @see inviteTestNumber */
    fun inviteTestNumber(
        phoneNumber: String,
        params: RcInviteTestNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcInviteTestNumberResponse =
        inviteTestNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see inviteTestNumber */
    fun inviteTestNumber(params: RcInviteTestNumberParams): RcInviteTestNumberResponse =
        inviteTestNumber(params, RequestOptions.none())

    /** @see inviteTestNumber */
    fun inviteTestNumber(
        params: RcInviteTestNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcInviteTestNumberResponse

    /** List RCS capabilities of a given batch of phone numbers */
    fun listBulkCapabilities(params: RcListBulkCapabilitiesParams): RcListBulkCapabilitiesResponse =
        listBulkCapabilities(params, RequestOptions.none())

    /** @see listBulkCapabilities */
    fun listBulkCapabilities(
        params: RcListBulkCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcListBulkCapabilitiesResponse

    /** List RCS capabilities of a phone number */
    fun retrieveCapabilities(
        phoneNumber: String,
        params: RcRetrieveCapabilitiesParams,
    ): RcRetrieveCapabilitiesResponse =
        retrieveCapabilities(phoneNumber, params, RequestOptions.none())

    /** @see retrieveCapabilities */
    fun retrieveCapabilities(
        phoneNumber: String,
        params: RcRetrieveCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcRetrieveCapabilitiesResponse =
        retrieveCapabilities(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieveCapabilities */
    fun retrieveCapabilities(params: RcRetrieveCapabilitiesParams): RcRetrieveCapabilitiesResponse =
        retrieveCapabilities(params, RequestOptions.none())

    /** @see retrieveCapabilities */
    fun retrieveCapabilities(
        params: RcRetrieveCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RcRetrieveCapabilitiesResponse

    /** A view of [RcService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService.WithRawResponse

        fun agents(): AgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /messaging/rcs/test_number_invite/{id}/{phone_number}`, but is otherwise the same as
         * [RcService.inviteTestNumber].
         */
        @MustBeClosed
        fun inviteTestNumber(
            phoneNumber: String,
            params: RcInviteTestNumberParams,
        ): HttpResponseFor<RcInviteTestNumberResponse> =
            inviteTestNumber(phoneNumber, params, RequestOptions.none())

        /** @see inviteTestNumber */
        @MustBeClosed
        fun inviteTestNumber(
            phoneNumber: String,
            params: RcInviteTestNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcInviteTestNumberResponse> =
            inviteTestNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see inviteTestNumber */
        @MustBeClosed
        fun inviteTestNumber(
            params: RcInviteTestNumberParams
        ): HttpResponseFor<RcInviteTestNumberResponse> =
            inviteTestNumber(params, RequestOptions.none())

        /** @see inviteTestNumber */
        @MustBeClosed
        fun inviteTestNumber(
            params: RcInviteTestNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcInviteTestNumberResponse>

        /**
         * Returns a raw HTTP response for `post /messaging/rcs/bulk_capabilities`, but is otherwise
         * the same as [RcService.listBulkCapabilities].
         */
        @MustBeClosed
        fun listBulkCapabilities(
            params: RcListBulkCapabilitiesParams
        ): HttpResponseFor<RcListBulkCapabilitiesResponse> =
            listBulkCapabilities(params, RequestOptions.none())

        /** @see listBulkCapabilities */
        @MustBeClosed
        fun listBulkCapabilities(
            params: RcListBulkCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcListBulkCapabilitiesResponse>

        /**
         * Returns a raw HTTP response for `get
         * /messaging/rcs/capabilities/{agent_id}/{phone_number}`, but is otherwise the same as
         * [RcService.retrieveCapabilities].
         */
        @MustBeClosed
        fun retrieveCapabilities(
            phoneNumber: String,
            params: RcRetrieveCapabilitiesParams,
        ): HttpResponseFor<RcRetrieveCapabilitiesResponse> =
            retrieveCapabilities(phoneNumber, params, RequestOptions.none())

        /** @see retrieveCapabilities */
        @MustBeClosed
        fun retrieveCapabilities(
            phoneNumber: String,
            params: RcRetrieveCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcRetrieveCapabilitiesResponse> =
            retrieveCapabilities(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see retrieveCapabilities */
        @MustBeClosed
        fun retrieveCapabilities(
            params: RcRetrieveCapabilitiesParams
        ): HttpResponseFor<RcRetrieveCapabilitiesResponse> =
            retrieveCapabilities(params, RequestOptions.none())

        /** @see retrieveCapabilities */
        @MustBeClosed
        fun retrieveCapabilities(
            params: RcRetrieveCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RcRetrieveCapabilitiesResponse>
    }
}
