// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberListParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberListResponse
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberRetrieveParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberRetrieveResponse
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MobilePhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobilePhoneNumberServiceAsync

    /** Retrieve a Mobile Phone Number */
    fun retrieve(id: String): CompletableFuture<MobilePhoneNumberRetrieveResponse> =
        retrieve(id, MobilePhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobilePhoneNumberRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
    ): CompletableFuture<MobilePhoneNumberRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MobilePhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobilePhoneNumberRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MobilePhoneNumberRetrieveParams
    ): CompletableFuture<MobilePhoneNumberRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobilePhoneNumberRetrieveResponse> =
        retrieve(id, MobilePhoneNumberRetrieveParams.none(), requestOptions)

    /** Update a Mobile Phone Number */
    fun update(id: String): CompletableFuture<MobilePhoneNumberUpdateResponse> =
        update(id, MobilePhoneNumberUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobilePhoneNumberUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
    ): CompletableFuture<MobilePhoneNumberUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MobilePhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobilePhoneNumberUpdateResponse>

    /** @see update */
    fun update(
        params: MobilePhoneNumberUpdateParams
    ): CompletableFuture<MobilePhoneNumberUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobilePhoneNumberUpdateResponse> =
        update(id, MobilePhoneNumberUpdateParams.none(), requestOptions)

    /** List Mobile Phone Numbers */
    fun list(): CompletableFuture<MobilePhoneNumberListResponse> =
        list(MobilePhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MobilePhoneNumberListResponse>

    /** @see list */
    fun list(
        params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none()
    ): CompletableFuture<MobilePhoneNumberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MobilePhoneNumberListResponse> =
        list(MobilePhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [MobilePhoneNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): MobilePhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/mobile_phone_numbers/{id}`, but is otherwise the
         * same as [MobilePhoneNumberServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberRetrieveResponse>> =
            retrieve(id, MobilePhoneNumberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MobilePhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MobilePhoneNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberRetrieveResponse>> =
            retrieve(id, MobilePhoneNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/mobile_phone_numbers/{id}`, but is otherwise
         * the same as [MobilePhoneNumberServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberUpdateResponse>> =
            update(id, MobilePhoneNumberUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MobilePhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberUpdateResponse>>

        /** @see update */
        fun update(
            params: MobilePhoneNumberUpdateParams
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberUpdateResponse>> =
            update(id, MobilePhoneNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/mobile_phone_numbers`, but is otherwise the same
         * as [MobilePhoneNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MobilePhoneNumberListResponse>> =
            list(MobilePhoneNumberListParams.none())

        /** @see list */
        fun list(
            params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MobilePhoneNumberListResponse>> =
            list(MobilePhoneNumberListParams.none(), requestOptions)
    }
}
