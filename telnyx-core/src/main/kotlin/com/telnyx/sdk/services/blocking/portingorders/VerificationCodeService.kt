// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portingorders

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeListPage
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeListParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeSendParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeVerifyParams
import com.telnyx.sdk.models.portingorders.verificationcodes.VerificationCodeVerifyResponse
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
interface VerificationCodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationCodeService

    /** Returns a list of verification codes for a porting order. */
    fun list(id: String): VerificationCodeListPage = list(id, VerificationCodeListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: VerificationCodeListParams = VerificationCodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationCodeListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: VerificationCodeListParams = VerificationCodeListParams.none(),
    ): VerificationCodeListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: VerificationCodeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationCodeListPage

    /** @see list */
    fun list(params: VerificationCodeListParams): VerificationCodeListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): VerificationCodeListPage =
        list(id, VerificationCodeListParams.none(), requestOptions)

    /** Send the verification code for all porting phone numbers. */
    fun send(id: String) = send(id, VerificationCodeSendParams.none())

    /** @see send */
    fun send(
        id: String,
        params: VerificationCodeSendParams = VerificationCodeSendParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = send(params.toBuilder().id(id).build(), requestOptions)

    /** @see send */
    fun send(id: String, params: VerificationCodeSendParams = VerificationCodeSendParams.none()) =
        send(id, params, RequestOptions.none())

    /** @see send */
    fun send(
        params: VerificationCodeSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see send */
    fun send(params: VerificationCodeSendParams) = send(params, RequestOptions.none())

    /** @see send */
    fun send(id: String, requestOptions: RequestOptions) =
        send(id, VerificationCodeSendParams.none(), requestOptions)

    /** Verifies the verification code for a list of phone numbers. */
    fun verify(id: String): VerificationCodeVerifyResponse =
        verify(id, VerificationCodeVerifyParams.none())

    /** @see verify */
    fun verify(
        id: String,
        params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationCodeVerifyResponse = verify(params.toBuilder().id(id).build(), requestOptions)

    /** @see verify */
    fun verify(
        id: String,
        params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
    ): VerificationCodeVerifyResponse = verify(id, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: VerificationCodeVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationCodeVerifyResponse

    /** @see verify */
    fun verify(params: VerificationCodeVerifyParams): VerificationCodeVerifyResponse =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(id: String, requestOptions: RequestOptions): VerificationCodeVerifyResponse =
        verify(id, VerificationCodeVerifyParams.none(), requestOptions)

    /**
     * A view of [VerificationCodeService] that provides access to raw HTTP responses for each
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
        ): VerificationCodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/verification_codes`, but is
         * otherwise the same as [VerificationCodeService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<VerificationCodeListPage> =
            list(id, VerificationCodeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: VerificationCodeListParams = VerificationCodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationCodeListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: VerificationCodeListParams = VerificationCodeListParams.none(),
        ): HttpResponseFor<VerificationCodeListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerificationCodeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationCodeListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: VerificationCodeListParams): HttpResponseFor<VerificationCodeListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationCodeListPage> =
            list(id, VerificationCodeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/verification_codes/send`, but
         * is otherwise the same as [VerificationCodeService.send].
         */
        @MustBeClosed
        fun send(id: String): HttpResponse = send(id, VerificationCodeSendParams.none())

        /** @see send */
        @MustBeClosed
        fun send(
            id: String,
            params: VerificationCodeSendParams = VerificationCodeSendParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = send(params.toBuilder().id(id).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(
            id: String,
            params: VerificationCodeSendParams = VerificationCodeSendParams.none(),
        ): HttpResponse = send(id, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: VerificationCodeSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see send */
        @MustBeClosed
        fun send(params: VerificationCodeSendParams): HttpResponse =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(id: String, requestOptions: RequestOptions): HttpResponse =
            send(id, VerificationCodeSendParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting_orders/{id}/verification_codes/verify`,
         * but is otherwise the same as [VerificationCodeService.verify].
         */
        @MustBeClosed
        fun verify(id: String): HttpResponseFor<VerificationCodeVerifyResponse> =
            verify(id, VerificationCodeVerifyParams.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            id: String,
            params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationCodeVerifyResponse> =
            verify(params.toBuilder().id(id).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        fun verify(
            id: String,
            params: VerificationCodeVerifyParams = VerificationCodeVerifyParams.none(),
        ): HttpResponseFor<VerificationCodeVerifyResponse> =
            verify(id, params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: VerificationCodeVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationCodeVerifyResponse>

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: VerificationCodeVerifyParams
        ): HttpResponseFor<VerificationCodeVerifyResponse> = verify(params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationCodeVerifyResponse> =
            verify(id, VerificationCodeVerifyParams.none(), requestOptions)
    }
}
