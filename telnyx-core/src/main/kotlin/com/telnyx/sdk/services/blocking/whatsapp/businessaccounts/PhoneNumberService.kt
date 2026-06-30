// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.businessaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberInitializeVerificationParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberListPage
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberListParams
import java.util.function.Consumer

interface PhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberService

    /** List phone numbers for a WABA */
    fun list(id: String): PhoneNumberListPage = list(id, PhoneNumberListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: PhoneNumberListParams = PhoneNumberListParams.none(),
    ): PhoneNumberListPage = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberListPage

    /** @see list */
    fun list(params: PhoneNumberListParams): PhoneNumberListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): PhoneNumberListPage =
        list(id, PhoneNumberListParams.none(), requestOptions)

    /** Initialize Whatsapp phone number verification */
    fun initializeVerification(id: String, params: PhoneNumberInitializeVerificationParams) =
        initializeVerification(id, params, RequestOptions.none())

    /** @see initializeVerification */
    fun initializeVerification(
        id: String,
        params: PhoneNumberInitializeVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = initializeVerification(params.toBuilder().id(id).build(), requestOptions)

    /** @see initializeVerification */
    fun initializeVerification(params: PhoneNumberInitializeVerificationParams) =
        initializeVerification(params, RequestOptions.none())

    /** @see initializeVerification */
    fun initializeVerification(
        params: PhoneNumberInitializeVerificationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [PhoneNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts/{id}/phone_numbers`,
         * but is otherwise the same as [PhoneNumberService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<PhoneNumberListPage> =
            list(id, PhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: PhoneNumberListParams = PhoneNumberListParams.none(),
        ): HttpResponseFor<PhoneNumberListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PhoneNumberListParams): HttpResponseFor<PhoneNumberListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<PhoneNumberListPage> =
            list(id, PhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/business_accounts/{id}/phone_numbers`,
         * but is otherwise the same as [PhoneNumberService.initializeVerification].
         */
        @MustBeClosed
        fun initializeVerification(
            id: String,
            params: PhoneNumberInitializeVerificationParams,
        ): HttpResponse = initializeVerification(id, params, RequestOptions.none())

        /** @see initializeVerification */
        @MustBeClosed
        fun initializeVerification(
            id: String,
            params: PhoneNumberInitializeVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = initializeVerification(params.toBuilder().id(id).build(), requestOptions)

        /** @see initializeVerification */
        @MustBeClosed
        fun initializeVerification(params: PhoneNumberInitializeVerificationParams): HttpResponse =
            initializeVerification(params, RequestOptions.none())

        /** @see initializeVerification */
        @MustBeClosed
        fun initializeVerification(
            params: PhoneNumberInitializeVerificationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
