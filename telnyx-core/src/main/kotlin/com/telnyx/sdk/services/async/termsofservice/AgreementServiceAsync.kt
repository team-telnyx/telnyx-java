// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.agreements.AgreementListPageAsync
import com.telnyx.sdk.models.termsofservice.agreements.AgreementListParams
import com.telnyx.sdk.models.termsofservice.agreements.AgreementRetrieveParams
import com.telnyx.sdk.models.termsofservice.agreements.AgreementRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
interface AgreementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgreementServiceAsync

    /**
     * Retrieve a single ToS agreement record. Returns `404` if the agreement does not exist or does
     * not belong to the authenticated user.
     */
    fun retrieve(agreementId: String): CompletableFuture<AgreementRetrieveResponse> =
        retrieve(agreementId, AgreementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        agreementId: String,
        params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgreementRetrieveResponse> =
        retrieve(params.toBuilder().agreementId(agreementId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        agreementId: String,
        params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
    ): CompletableFuture<AgreementRetrieveResponse> =
        retrieve(agreementId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgreementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgreementRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AgreementRetrieveParams): CompletableFuture<AgreementRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        agreementId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgreementRetrieveResponse> =
        retrieve(agreementId, AgreementRetrieveParams.none(), requestOptions)

    /**
     * Returns the Terms of Service agreements the authenticated user has on file. Each entry
     * records the version agreed to and when. Most users only have one agreement per product, but
     * if the ToS is updated and the user re-agrees a new entry is added.
     *
     * Results are paginated with the standard `page[number]` / `page[size]` parameters; the
     * response uses the standard `{data, meta}` JSON:API envelope.
     *
     * By default this returns agreements for **all** products the user has agreed to (including
     * Branded Calling). Pass the `product_type` query parameter to scope the result to a single
     * product.
     */
    fun list(): CompletableFuture<AgreementListPageAsync> = list(AgreementListParams.none())

    /** @see list */
    fun list(
        params: AgreementListParams = AgreementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgreementListPageAsync>

    /** @see list */
    fun list(
        params: AgreementListParams = AgreementListParams.none()
    ): CompletableFuture<AgreementListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgreementListPageAsync> =
        list(AgreementListParams.none(), requestOptions)

    /**
     * A view of [AgreementServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgreementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /terms_of_service/agreements/{agreement_id}`, but is
         * otherwise the same as [AgreementServiceAsync.retrieve].
         */
        fun retrieve(
            agreementId: String
        ): CompletableFuture<HttpResponseFor<AgreementRetrieveResponse>> =
            retrieve(agreementId, AgreementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            agreementId: String,
            params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgreementRetrieveResponse>> =
            retrieve(params.toBuilder().agreementId(agreementId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            agreementId: String,
            params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgreementRetrieveResponse>> =
            retrieve(agreementId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgreementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgreementRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgreementRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgreementRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            agreementId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgreementRetrieveResponse>> =
            retrieve(agreementId, AgreementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /terms_of_service/agreements`, but is otherwise the
         * same as [AgreementServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgreementListPageAsync>> =
            list(AgreementListParams.none())

        /** @see list */
        fun list(
            params: AgreementListParams = AgreementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgreementListPageAsync>>

        /** @see list */
        fun list(
            params: AgreementListParams = AgreementListParams.none()
        ): CompletableFuture<HttpResponseFor<AgreementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgreementListPageAsync>> =
            list(AgreementListParams.none(), requestOptions)
    }
}
