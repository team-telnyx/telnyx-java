// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.termsofservice

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.termsofservice.agreements.AgreementListPage
import com.telnyx.sdk.models.termsofservice.agreements.AgreementListParams
import com.telnyx.sdk.models.termsofservice.agreements.AgreementRetrieveParams
import com.telnyx.sdk.models.termsofservice.agreements.AgreementRetrieveResponse
import java.util.function.Consumer

/** Accept and review the Branded Calling and Phone Number Reputation terms of service. */
interface AgreementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgreementService

    /**
     * Retrieve a single ToS agreement record. Returns `404` if the agreement does not exist or does
     * not belong to the authenticated user.
     */
    fun retrieve(agreementId: String): AgreementRetrieveResponse =
        retrieve(agreementId, AgreementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        agreementId: String,
        params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgreementRetrieveResponse =
        retrieve(params.toBuilder().agreementId(agreementId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        agreementId: String,
        params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
    ): AgreementRetrieveResponse = retrieve(agreementId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgreementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgreementRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AgreementRetrieveParams): AgreementRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(agreementId: String, requestOptions: RequestOptions): AgreementRetrieveResponse =
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
    fun list(): AgreementListPage = list(AgreementListParams.none())

    /** @see list */
    fun list(
        params: AgreementListParams = AgreementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgreementListPage

    /** @see list */
    fun list(params: AgreementListParams = AgreementListParams.none()): AgreementListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgreementListPage =
        list(AgreementListParams.none(), requestOptions)

    /** A view of [AgreementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgreementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /terms_of_service/agreements/{agreement_id}`, but is
         * otherwise the same as [AgreementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(agreementId: String): HttpResponseFor<AgreementRetrieveResponse> =
            retrieve(agreementId, AgreementRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agreementId: String,
            params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgreementRetrieveResponse> =
            retrieve(params.toBuilder().agreementId(agreementId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agreementId: String,
            params: AgreementRetrieveParams = AgreementRetrieveParams.none(),
        ): HttpResponseFor<AgreementRetrieveResponse> =
            retrieve(agreementId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgreementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgreementRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AgreementRetrieveParams): HttpResponseFor<AgreementRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            agreementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgreementRetrieveResponse> =
            retrieve(agreementId, AgreementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /terms_of_service/agreements`, but is otherwise the
         * same as [AgreementService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AgreementListPage> = list(AgreementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgreementListParams = AgreementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgreementListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgreementListParams = AgreementListParams.none()
        ): HttpResponseFor<AgreementListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgreementListPage> =
            list(AgreementListParams.none(), requestOptions)
    }
}
