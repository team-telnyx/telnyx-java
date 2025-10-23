// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.calls.CallInitiateParams
import com.telnyx.sdk.models.texml.calls.CallInitiateResponse
import com.telnyx.sdk.models.texml.calls.CallUpdateParams
import com.telnyx.sdk.models.texml.calls.CallUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync

    /**
     * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in
     * CamelCase as specified in the example.
     */
    fun update(callSid: String, params: CallUpdateParams): CompletableFuture<CallUpdateResponse> =
        update(callSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        callSid: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallUpdateResponse> =
        update(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams): CompletableFuture<CallUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallUpdateResponse>

    /**
     * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL
     * configured for the connection in the Mission Control Portal.
     */
    fun initiate(
        applicationId: String,
        params: CallInitiateParams,
    ): CompletableFuture<CallInitiateResponse> =
        initiate(applicationId, params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        applicationId: String,
        params: CallInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallInitiateResponse> =
        initiate(params.toBuilder().applicationId(applicationId).build(), requestOptions)

    /** @see initiate */
    fun initiate(params: CallInitiateParams): CompletableFuture<CallInitiateResponse> =
        initiate(params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        params: CallInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallInitiateResponse>

    /** A view of [CallServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml/calls/{call_sid}/update`, but is otherwise
         * the same as [CallServiceAsync.update].
         */
        fun update(
            callSid: String,
            params: CallUpdateParams,
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>> =
            update(callSid, params, RequestOptions.none())

        /** @see update */
        fun update(
            callSid: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>> =
            update(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see update */
        fun update(
            params: CallUpdateParams
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /texml/calls/{application_id}`, but is otherwise
         * the same as [CallServiceAsync.initiate].
         */
        fun initiate(
            applicationId: String,
            params: CallInitiateParams,
        ): CompletableFuture<HttpResponseFor<CallInitiateResponse>> =
            initiate(applicationId, params, RequestOptions.none())

        /** @see initiate */
        fun initiate(
            applicationId: String,
            params: CallInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallInitiateResponse>> =
            initiate(params.toBuilder().applicationId(applicationId).build(), requestOptions)

        /** @see initiate */
        fun initiate(
            params: CallInitiateParams
        ): CompletableFuture<HttpResponseFor<CallInitiateResponse>> =
            initiate(params, RequestOptions.none())

        /** @see initiate */
        fun initiate(
            params: CallInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallInitiateResponse>>
    }
}
