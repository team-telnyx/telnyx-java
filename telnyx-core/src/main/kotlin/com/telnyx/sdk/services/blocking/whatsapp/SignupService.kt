// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.signup.SignupListPage
import com.telnyx.sdk.models.whatsapp.signup.SignupListParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusParams
import com.telnyx.sdk.models.whatsapp.signup.SignupRetrieveStatusResponse
import java.util.function.Consumer

interface SignupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignupService

    /**
     * List finished WhatsApp Embedded Signup sessions, with status `SUCCESS` or `FAILURE`, newest
     * first. Use the `errors` of a failed session to see why provisioning stopped.
     */
    fun list(): SignupListPage = list(SignupListParams.none())

    /** @see list */
    fun list(
        params: SignupListParams = SignupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignupListPage

    /** @see list */
    fun list(params: SignupListParams = SignupListParams.none()): SignupListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SignupListPage =
        list(SignupListParams.none(), requestOptions)

    /** Retrieve the current state and status of a WhatsApp Embedded Signup session. */
    fun retrieveStatus(id: String): SignupRetrieveStatusResponse =
        retrieveStatus(id, SignupRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignupRetrieveStatusResponse =
        retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
    ): SignupRetrieveStatusResponse = retrieveStatus(id, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: SignupRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignupRetrieveStatusResponse

    /** @see retrieveStatus */
    fun retrieveStatus(params: SignupRetrieveStatusParams): SignupRetrieveStatusResponse =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(id: String, requestOptions: RequestOptions): SignupRetrieveStatusResponse =
        retrieveStatus(id, SignupRetrieveStatusParams.none(), requestOptions)

    /** A view of [SignupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SignupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /whatsapp/signup`, but is otherwise the same as
         * [SignupService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SignupListPage> = list(SignupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SignupListParams = SignupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignupListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SignupListParams = SignupListParams.none()
        ): HttpResponseFor<SignupListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SignupListPage> =
            list(SignupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /whatsapp/signup/{id}/status`, but is otherwise the
         * same as [SignupService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(id: String): HttpResponseFor<SignupRetrieveStatusResponse> =
            retrieveStatus(id, SignupRetrieveStatusParams.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            id: String,
            params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignupRetrieveStatusResponse> =
            retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            id: String,
            params: SignupRetrieveStatusParams = SignupRetrieveStatusParams.none(),
        ): HttpResponseFor<SignupRetrieveStatusResponse> =
            retrieveStatus(id, params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: SignupRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignupRetrieveStatusResponse>

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: SignupRetrieveStatusParams
        ): HttpResponseFor<SignupRetrieveStatusResponse> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignupRetrieveStatusResponse> =
            retrieveStatus(id, SignupRetrieveStatusParams.none(), requestOptions)
    }
}
