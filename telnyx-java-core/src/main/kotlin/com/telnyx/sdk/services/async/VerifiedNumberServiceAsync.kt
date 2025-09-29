// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateResponse
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberDeleteParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListResponse
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberRetrieveParams
import com.telnyx.sdk.services.async.verifiednumbers.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VerifiedNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifiedNumberServiceAsync

    fun actions(): ActionServiceAsync

    /**
     * Initiates phone number verification procedure. Supports DTMF extension dialing for voice
     * calls to numbers behind IVR systems.
     */
    fun create(
        params: VerifiedNumberCreateParams
    ): CompletableFuture<VerifiedNumberCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifiedNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberCreateResponse>

    /** Retrieve a verified number */
    fun retrieve(phoneNumber: String): CompletableFuture<VerifiedNumberDataWrapper> =
        retrieve(phoneNumber, VerifiedNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VerifiedNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper>

    /** @see retrieve */
    fun retrieve(
        params: VerifiedNumberRetrieveParams
    ): CompletableFuture<VerifiedNumberDataWrapper> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        retrieve(phoneNumber, VerifiedNumberRetrieveParams.none(), requestOptions)

    /** Gets a paginated list of Verified Numbers. */
    fun list(): CompletableFuture<VerifiedNumberListResponse> =
        list(VerifiedNumberListParams.none())

    /** @see list */
    fun list(
        params: VerifiedNumberListParams = VerifiedNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberListResponse>

    /** @see list */
    fun list(
        params: VerifiedNumberListParams = VerifiedNumberListParams.none()
    ): CompletableFuture<VerifiedNumberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VerifiedNumberListResponse> =
        list(VerifiedNumberListParams.none(), requestOptions)

    /** Delete a verified number */
    fun delete(phoneNumber: String): CompletableFuture<VerifiedNumberDataWrapper> =
        delete(phoneNumber, VerifiedNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VerifiedNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifiedNumberDataWrapper>

    /** @see delete */
    fun delete(params: VerifiedNumberDeleteParams): CompletableFuture<VerifiedNumberDataWrapper> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        delete(phoneNumber, VerifiedNumberDeleteParams.none(), requestOptions)

    /**
     * A view of [VerifiedNumberServiceAsync] that provides access to raw HTTP responses for each
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
        ): VerifiedNumberServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /verified_numbers`, but is otherwise the same as
         * [VerifiedNumberServiceAsync.create].
         */
        fun create(
            params: VerifiedNumberCreateParams
        ): CompletableFuture<HttpResponseFor<VerifiedNumberCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VerifiedNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /verified_numbers/{phone_number}`, but is otherwise
         * the same as [VerifiedNumberServiceAsync.retrieve].
         */
        fun retrieve(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            retrieve(phoneNumber, VerifiedNumberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VerifiedNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>>

        /** @see retrieve */
        fun retrieve(
            params: VerifiedNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            retrieve(phoneNumber, VerifiedNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /verified_numbers`, but is otherwise the same as
         * [VerifiedNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VerifiedNumberListResponse>> =
            list(VerifiedNumberListParams.none())

        /** @see list */
        fun list(
            params: VerifiedNumberListParams = VerifiedNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberListResponse>>

        /** @see list */
        fun list(
            params: VerifiedNumberListParams = VerifiedNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<VerifiedNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VerifiedNumberListResponse>> =
            list(VerifiedNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /verified_numbers/{phone_number}`, but is
         * otherwise the same as [VerifiedNumberServiceAsync.delete].
         */
        fun delete(
            phoneNumber: String
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            delete(phoneNumber, VerifiedNumberDeleteParams.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VerifiedNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>>

        /** @see delete */
        fun delete(
            params: VerifiedNumberDeleteParams
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> =
            delete(phoneNumber, VerifiedNumberDeleteParams.none(), requestOptions)
    }
}
