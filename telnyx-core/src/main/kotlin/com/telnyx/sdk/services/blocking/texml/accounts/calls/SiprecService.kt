// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.calls

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonResponse
import java.util.function.Consumer

interface SiprecService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiprecService

    /** Updates siprec session identified by siprec_sid. */
    fun siprecSidJson(
        siprecSid: String,
        params: SiprecSiprecSidJsonParams,
    ): SiprecSiprecSidJsonResponse = siprecSidJson(siprecSid, params, RequestOptions.none())

    /** @see siprecSidJson */
    fun siprecSidJson(
        siprecSid: String,
        params: SiprecSiprecSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecSiprecSidJsonResponse =
        siprecSidJson(params.toBuilder().siprecSid(siprecSid).build(), requestOptions)

    /** @see siprecSidJson */
    fun siprecSidJson(params: SiprecSiprecSidJsonParams): SiprecSiprecSidJsonResponse =
        siprecSidJson(params, RequestOptions.none())

    /** @see siprecSidJson */
    fun siprecSidJson(
        params: SiprecSiprecSidJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SiprecSiprecSidJsonResponse

    /** A view of [SiprecService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiprecService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec/{siprec_sid}.json`, but is
         * otherwise the same as [SiprecService.siprecSidJson].
         */
        @MustBeClosed
        fun siprecSidJson(
            siprecSid: String,
            params: SiprecSiprecSidJsonParams,
        ): HttpResponseFor<SiprecSiprecSidJsonResponse> =
            siprecSidJson(siprecSid, params, RequestOptions.none())

        /** @see siprecSidJson */
        @MustBeClosed
        fun siprecSidJson(
            siprecSid: String,
            params: SiprecSiprecSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecSiprecSidJsonResponse> =
            siprecSidJson(params.toBuilder().siprecSid(siprecSid).build(), requestOptions)

        /** @see siprecSidJson */
        @MustBeClosed
        fun siprecSidJson(
            params: SiprecSiprecSidJsonParams
        ): HttpResponseFor<SiprecSiprecSidJsonResponse> =
            siprecSidJson(params, RequestOptions.none())

        /** @see siprecSidJson */
        @MustBeClosed
        fun siprecSidJson(
            params: SiprecSiprecSidJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SiprecSiprecSidJsonResponse>
    }
}
