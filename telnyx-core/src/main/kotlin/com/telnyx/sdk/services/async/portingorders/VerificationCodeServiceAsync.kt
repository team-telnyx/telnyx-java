// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeListParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeListResponse
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeSendParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeVerifyParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeVerifyResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VerificationCodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationCodeServiceAsync

    /** Returns a list of verification codes for a porting order. */
    fun list(id: String): CompletableFuture<VerificationCodeListResponse> =
        list(id, VerificationCodeListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: VerificationCodeListParams = VerificationCodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationCodeListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: VerificationCodeListParams = VerificationCodeListParams.none(),
    ): CompletableFuture<VerificationCodeListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VerificationCodeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationCodeListResponse>

    /** @see list */
    fun list(params: VerificationCodeListParams): CompletableFuture<VerificationCodeListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationCodeListResponse> =
        list(id, VerificationCodeListParams.none(), requestOptions)

    /** Send the verification code for all porting phone numbers. */
    fun send(id: String): CompletableFuture<Void?> = send(id, VerificationCodeSendParams.none())

    /** @see send */
    fun send(
        id: String,
        params: VerificationCodeSendParams = VerificationCodeSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = send(params.toBuilder().id(id).build(), requestOptions)

    /** @see send */
    fun send(
        id: String,
        params: VerificationCodeSendParams = VerificationCodeSendParams.none(),
    ): CompletableFuture<Void?> = send(id, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: VerificationCodeSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see send */
    fun send(params: VerificationCodeSendParams): CompletableFuture<Void?> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        send(id, VerificationCodeSendParams.none(), requestOptions)

    /** Verifies the verification code for a list of phone numbers. */
    fun verify(id: String): CompletableFuture<VerificationCodeVerifyResponse> =
        verify(id, VerificationCodeVerifyParams.none())

    /** @see verify */
    fun verify(
        id: String,
        params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationCodeVerifyResponse> =
        verify(params.toBuilder().id(id).build(), requestOptions)

    /** @see verify */
    fun verify(
        id: String,
        params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
    ): CompletableFuture<VerificationCodeVerifyResponse> = verify(id, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: VerificationCodeVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationCodeVerifyResponse>

    /** @see verify */
    fun verify(
        params: VerificationCodeVerifyParams
    ): CompletableFuture<VerificationCodeVerifyResponse> = verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationCodeVerifyResponse> =
        verify(id, VerificationCodeVerifyParams.none(), requestOptions)

    /**
     * A view of [VerificationCodeServiceAsync] that provides access to raw HTTP responses for each
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
        ): VerificationCodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/verification_codes`, but is
         * otherwise the same as [VerificationCodeServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<VerificationCodeListResponse>> =
            list(id, VerificationCodeListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: VerificationCodeListParams = VerificationCodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCodeListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: VerificationCodeListParams = VerificationCodeListParams.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCodeListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: VerificationCodeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCodeListResponse>>

        /** @see list */
        fun list(
            params: VerificationCodeListParams
        ): CompletableFuture<HttpResponseFor<VerificationCodeListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationCodeListResponse>> =
            list(id, VerificationCodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/verification_codes/send`, but
         * is otherwise the same as [VerificationCodeServiceAsync.send].
         */
        fun send(id: String): CompletableFuture<HttpResponse> =
            send(id, VerificationCodeSendParams.none())

        /** @see send */
        fun send(
            id: String,
            params: VerificationCodeSendParams = VerificationCodeSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = send(params.toBuilder().id(id).build(), requestOptions)

        /** @see send */
        fun send(
            id: String,
            params: VerificationCodeSendParams = VerificationCodeSendParams.none(),
        ): CompletableFuture<HttpResponse> = send(id, params, RequestOptions.none())

        /** @see send */
        fun send(
            params: VerificationCodeSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see send */
        fun send(params: VerificationCodeSendParams): CompletableFuture<HttpResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            send(id, VerificationCodeSendParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/verification_codes/verify`,
         * but is otherwise the same as [VerificationCodeServiceAsync.verify].
         */
        fun verify(id: String): CompletableFuture<HttpResponseFor<VerificationCodeVerifyResponse>> =
            verify(id, VerificationCodeVerifyParams.none())

        /** @see verify */
        fun verify(
            id: String,
            params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCodeVerifyResponse>> =
            verify(params.toBuilder().id(id).build(), requestOptions)

        /** @see verify */
        fun verify(
            id: String,
            params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCodeVerifyResponse>> =
            verify(id, params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: VerificationCodeVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCodeVerifyResponse>>

        /** @see verify */
        fun verify(
            params: VerificationCodeVerifyParams
        ): CompletableFuture<HttpResponseFor<VerificationCodeVerifyResponse>> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationCodeVerifyResponse>> =
            verify(id, VerificationCodeVerifyParams.none(), requestOptions)
    }
}
