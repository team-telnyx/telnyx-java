// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberParams
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberResponse
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesResponse
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesResponse
import com.telnyx.sdk.services.async.messaging.rcs.AgentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RcServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync

    fun agents(): AgentServiceAsync

    /** Adds a test phone number to an RCS agent for testing purposes. */
    fun inviteTestNumber(
        phoneNumber: String,
        params: RcInviteTestNumberParams,
    ): CompletableFuture<RcInviteTestNumberResponse> =
        inviteTestNumber(phoneNumber, params, RequestOptions.none())

    /** @see inviteTestNumber */
    fun inviteTestNumber(
        phoneNumber: String,
        params: RcInviteTestNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcInviteTestNumberResponse> =
        inviteTestNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see inviteTestNumber */
    fun inviteTestNumber(
        params: RcInviteTestNumberParams
    ): CompletableFuture<RcInviteTestNumberResponse> =
        inviteTestNumber(params, RequestOptions.none())

    /** @see inviteTestNumber */
    fun inviteTestNumber(
        params: RcInviteTestNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcInviteTestNumberResponse>

    /** List RCS capabilities of a given batch of phone numbers */
    fun listBulkCapabilities(
        params: RcListBulkCapabilitiesParams
    ): CompletableFuture<RcListBulkCapabilitiesResponse> =
        listBulkCapabilities(params, RequestOptions.none())

    /** @see listBulkCapabilities */
    fun listBulkCapabilities(
        params: RcListBulkCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcListBulkCapabilitiesResponse>

    /** List RCS capabilities of a phone number */
    fun retrieveCapabilities(
        phoneNumber: String,
        params: RcRetrieveCapabilitiesParams,
    ): CompletableFuture<RcRetrieveCapabilitiesResponse> =
        retrieveCapabilities(phoneNumber, params, RequestOptions.none())

    /** @see retrieveCapabilities */
    fun retrieveCapabilities(
        phoneNumber: String,
        params: RcRetrieveCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcRetrieveCapabilitiesResponse> =
        retrieveCapabilities(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieveCapabilities */
    fun retrieveCapabilities(
        params: RcRetrieveCapabilitiesParams
    ): CompletableFuture<RcRetrieveCapabilitiesResponse> =
        retrieveCapabilities(params, RequestOptions.none())

    /** @see retrieveCapabilities */
    fun retrieveCapabilities(
        params: RcRetrieveCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RcRetrieveCapabilitiesResponse>

    /** A view of [RcServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync.WithRawResponse

        fun agents(): AgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /messaging/rcs/test_number_invite/{id}/{phone_number}`, but is otherwise the same as
         * [RcServiceAsync.inviteTestNumber].
         */
        fun inviteTestNumber(
            phoneNumber: String,
            params: RcInviteTestNumberParams,
        ): CompletableFuture<HttpResponseFor<RcInviteTestNumberResponse>> =
            inviteTestNumber(phoneNumber, params, RequestOptions.none())

        /** @see inviteTestNumber */
        fun inviteTestNumber(
            phoneNumber: String,
            params: RcInviteTestNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcInviteTestNumberResponse>> =
            inviteTestNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see inviteTestNumber */
        fun inviteTestNumber(
            params: RcInviteTestNumberParams
        ): CompletableFuture<HttpResponseFor<RcInviteTestNumberResponse>> =
            inviteTestNumber(params, RequestOptions.none())

        /** @see inviteTestNumber */
        fun inviteTestNumber(
            params: RcInviteTestNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcInviteTestNumberResponse>>

        /**
         * Returns a raw HTTP response for `post /messaging/rcs/bulk_capabilities`, but is otherwise
         * the same as [RcServiceAsync.listBulkCapabilities].
         */
        fun listBulkCapabilities(
            params: RcListBulkCapabilitiesParams
        ): CompletableFuture<HttpResponseFor<RcListBulkCapabilitiesResponse>> =
            listBulkCapabilities(params, RequestOptions.none())

        /** @see listBulkCapabilities */
        fun listBulkCapabilities(
            params: RcListBulkCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcListBulkCapabilitiesResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /messaging/rcs/capabilities/{agent_id}/{phone_number}`, but is otherwise the same as
         * [RcServiceAsync.retrieveCapabilities].
         */
        fun retrieveCapabilities(
            phoneNumber: String,
            params: RcRetrieveCapabilitiesParams,
        ): CompletableFuture<HttpResponseFor<RcRetrieveCapabilitiesResponse>> =
            retrieveCapabilities(phoneNumber, params, RequestOptions.none())

        /** @see retrieveCapabilities */
        fun retrieveCapabilities(
            phoneNumber: String,
            params: RcRetrieveCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcRetrieveCapabilitiesResponse>> =
            retrieveCapabilities(
                params.toBuilder().phoneNumber(phoneNumber).build(),
                requestOptions,
            )

        /** @see retrieveCapabilities */
        fun retrieveCapabilities(
            params: RcRetrieveCapabilitiesParams
        ): CompletableFuture<HttpResponseFor<RcRetrieveCapabilitiesResponse>> =
            retrieveCapabilities(params, RequestOptions.none())

        /** @see retrieveCapabilities */
        fun retrieveCapabilities(
            params: RcRetrieveCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RcRetrieveCapabilitiesResponse>>
    }
}
