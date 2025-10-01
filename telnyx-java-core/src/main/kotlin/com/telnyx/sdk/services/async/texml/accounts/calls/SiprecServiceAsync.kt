// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.calls

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SiprecServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiprecServiceAsync

    /** Updates siprec session identified by siprec_sid. */
    fun siprecSidJson(
        siprecSid: String,
        params: SiprecSiprecSidJsonParams,
    ): CompletableFuture<SiprecSiprecSidJsonResponse> =
        siprecSidJson(siprecSid, params, RequestOptions.none())

    /** @see siprecSidJson */
    fun siprecSidJson(
        siprecSid: String,
        params: SiprecSiprecSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiprecSiprecSidJsonResponse> =
        siprecSidJson(params.toBuilder().siprecSid(siprecSid).build(), requestOptions)

    /** @see siprecSidJson */
    fun siprecSidJson(
        params: SiprecSiprecSidJsonParams
    ): CompletableFuture<SiprecSiprecSidJsonResponse> = siprecSidJson(params, RequestOptions.none())

    /** @see siprecSidJson */
    fun siprecSidJson(
        params: SiprecSiprecSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SiprecSiprecSidJsonResponse>

    /**
     * A view of [SiprecServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiprecServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec/{siprec_sid}.json`, but is
         * otherwise the same as [SiprecServiceAsync.siprecSidJson].
         */
        fun siprecSidJson(
            siprecSid: String,
            params: SiprecSiprecSidJsonParams,
        ): CompletableFuture<HttpResponseFor<SiprecSiprecSidJsonResponse>> =
            siprecSidJson(siprecSid, params, RequestOptions.none())

        /** @see siprecSidJson */
        fun siprecSidJson(
            siprecSid: String,
            params: SiprecSiprecSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiprecSiprecSidJsonResponse>> =
            siprecSidJson(params.toBuilder().siprecSid(siprecSid).build(), requestOptions)

        /** @see siprecSidJson */
        fun siprecSidJson(
            params: SiprecSiprecSidJsonParams
        ): CompletableFuture<HttpResponseFor<SiprecSiprecSidJsonResponse>> =
            siprecSidJson(params, RequestOptions.none())

        /** @see siprecSidJson */
        fun siprecSidJson(
            params: SiprecSiprecSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SiprecSiprecSidJsonResponse>>
    }
}
