// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texml.calls.CallInitiateParams
import com.telnyx.api.models.texml.calls.CallInitiateResponse
import com.telnyx.api.models.texml.calls.CallUpdateParams
import com.telnyx.api.models.texml.calls.CallUpdateResponse
import java.util.function.Consumer

interface CallService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService

    /**
     * Update TeXML call. Please note that the keys present in the payload MUST BE formatted in
     * CamelCase as specified in the example.
     */
    fun update(callSid: String, params: CallUpdateParams): CallUpdateResponse =
        update(callSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        callSid: String,
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallUpdateResponse = update(params.toBuilder().callSid(callSid).build(), requestOptions)

    /** @see update */
    fun update(params: CallUpdateParams): CallUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallUpdateResponse

    /**
     * Initiate an outbound TeXML call. Telnyx will request TeXML from the XML Request URL
     * configured for the connection in the Mission Control Portal.
     */
    fun initiate(applicationId: String, params: CallInitiateParams): CallInitiateResponse =
        initiate(applicationId, params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        applicationId: String,
        params: CallInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallInitiateResponse =
        initiate(params.toBuilder().applicationId(applicationId).build(), requestOptions)

    /** @see initiate */
    fun initiate(params: CallInitiateParams): CallInitiateResponse =
        initiate(params, RequestOptions.none())

    /** @see initiate */
    fun initiate(
        params: CallInitiateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallInitiateResponse

    /** A view of [CallService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml/calls/{call_sid}/update`, but is otherwise
         * the same as [CallService.update].
         */
        @MustBeClosed
        fun update(callSid: String, params: CallUpdateParams): HttpResponseFor<CallUpdateResponse> =
            update(callSid, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            callSid: String,
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallUpdateResponse> =
            update(params.toBuilder().callSid(callSid).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CallUpdateParams): HttpResponseFor<CallUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallUpdateResponse>

        /**
         * Returns a raw HTTP response for `post /texml/calls/{application_id}`, but is otherwise
         * the same as [CallService.initiate].
         */
        @MustBeClosed
        fun initiate(
            applicationId: String,
            params: CallInitiateParams,
        ): HttpResponseFor<CallInitiateResponse> =
            initiate(applicationId, params, RequestOptions.none())

        /** @see initiate */
        @MustBeClosed
        fun initiate(
            applicationId: String,
            params: CallInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallInitiateResponse> =
            initiate(params.toBuilder().applicationId(applicationId).build(), requestOptions)

        /** @see initiate */
        @MustBeClosed
        fun initiate(params: CallInitiateParams): HttpResponseFor<CallInitiateResponse> =
            initiate(params, RequestOptions.none())

        /** @see initiate */
        @MustBeClosed
        fun initiate(
            params: CallInitiateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallInitiateResponse>
    }
}
