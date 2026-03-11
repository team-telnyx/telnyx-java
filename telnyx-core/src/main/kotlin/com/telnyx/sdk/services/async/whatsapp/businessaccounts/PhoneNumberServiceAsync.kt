// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.businessaccounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberInitializeVerificationParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberListPageAsync
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberServiceAsync

    /** List phone numbers for a WABA */
    fun list(id: String): CompletableFuture<PhoneNumberListPageAsync> =
        list(id, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): CompletableFuture<PhoneNumberListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberListPageAsync>

    /** @see list */
    fun list(params: PhoneNumberListParams): CompletableFuture<PhoneNumberListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberListPageAsync> =
        list(id, PhoneNumberListParams.none(), requestOptions)

    /** Initialize Whatsapp phone number verification */
    fun initializeVerification(
        id: String,
        params: PhoneNumberInitializeVerificationParams,
    ): CompletableFuture<Void?> = initializeVerification(id, params, RequestOptions.none())

    /** @see initializeVerification */
    fun initializeVerification(
        id: String,
        params: PhoneNumberInitializeVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        initializeVerification(params.toBuilder().id(id).build(), requestOptions)

    /** @see initializeVerification */
    fun initializeVerification(
        params: PhoneNumberInitializeVerificationParams
    ): CompletableFuture<Void?> = initializeVerification(params, RequestOptions.none())

    /** @see initializeVerification */
    fun initializeVerification(
        params: PhoneNumberInitializeVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [PhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts/{id}/phone_numbers`,
         * but is otherwise the same as [PhoneNumberServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(id, PhoneNumberListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberListParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberListPageAsync>> =
            list(id, PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/business_accounts/{id}/phone_numbers`,
         * but is otherwise the same as [PhoneNumberServiceAsync.initializeVerification].
         */
        fun initializeVerification(
            id: String,
            params: PhoneNumberInitializeVerificationParams,
        ): CompletableFuture<HttpResponse> =
            initializeVerification(id, params, RequestOptions.none())

        /** @see initializeVerification */
        fun initializeVerification(
            id: String,
            params: PhoneNumberInitializeVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            initializeVerification(params.toBuilder().id(id).build(), requestOptions)

        /** @see initializeVerification */
        fun initializeVerification(
            params: PhoneNumberInitializeVerificationParams
        ): CompletableFuture<HttpResponse> = initializeVerification(params, RequestOptions.none())

        /** @see initializeVerification */
        fun initializeVerification(
            params: PhoneNumberInitializeVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
