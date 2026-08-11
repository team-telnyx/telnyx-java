// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rcs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rcs.brands.BrandCreateParams
import com.telnyx.sdk.models.rcs.brands.BrandListParams
import com.telnyx.sdk.models.rcs.brands.BrandResponse
import com.telnyx.sdk.models.rcs.brands.BrandRetrieveParams
import com.telnyx.sdk.models.rcs.brands.BrandSubmitParams
import com.telnyx.sdk.models.rcs.brands.BrandUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage the legal business entities that operate RCS agents. */
interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync

    /** Creates an editable RCS brand draft. Creating the draft does not begin external review. */
    fun create(params: BrandCreateParams): CompletableFuture<BrandResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandResponse>

    /** Retrieves an RCS brand and its current lifecycle status. */
    fun retrieve(id: String): CompletableFuture<BrandResponse> =
        retrieve(id, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): CompletableFuture<BrandResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandResponse>

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<BrandResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<BrandResponse> =
        retrieve(id, BrandRetrieveParams.none(), requestOptions)

    /**
     * Updates one or more fields on a brand while its status is `CREATED`. Submitted brands cannot
     * be changed.
     */
    fun update(id: String): CompletableFuture<BrandResponse> = update(id, BrandUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandResponse> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
    ): CompletableFuture<BrandResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandResponse>

    /** @see update */
    fun update(params: BrandUpdateParams): CompletableFuture<BrandResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<BrandResponse> =
        update(id, BrandUpdateParams.none(), requestOptions)

    /** Lists RCS brands owned by the authenticated organization. */
    fun list(): CompletableFuture<List<BrandResponse>> = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BrandResponse>>

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none()
    ): CompletableFuture<List<BrandResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<BrandResponse>> =
        list(BrandListParams.none(), requestOptions)

    /**
     * Starts asynchronous provider provisioning and external review for a brand. Repeating this
     * request for an in-progress brand returns its current state without creating new work.
     */
    fun submit(id: String): CompletableFuture<BrandResponse> = submit(id, BrandSubmitParams.none())

    /** @see submit */
    fun submit(
        id: String,
        params: BrandSubmitParams = BrandSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandResponse> = submit(params.toBuilder().id(id).build(), requestOptions)

    /** @see submit */
    fun submit(
        id: String,
        params: BrandSubmitParams = BrandSubmitParams.none(),
    ): CompletableFuture<BrandResponse> = submit(id, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: BrandSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandResponse>

    /** @see submit */
    fun submit(params: BrandSubmitParams): CompletableFuture<BrandResponse> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(id: String, requestOptions: RequestOptions): CompletableFuture<BrandResponse> =
        submit(id, BrandSubmitParams.none(), requestOptions)

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rcs/brands`, but is otherwise the same as
         * [BrandServiceAsync.create].
         */
        fun create(params: BrandCreateParams): CompletableFuture<HttpResponseFor<BrandResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>>

        /**
         * Returns a raw HTTP response for `get /rcs/brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BrandResponse>> =
            retrieve(id, BrandRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            retrieve(id, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rcs/brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<BrandResponse>> =
            update(id, BrandUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>>

        /** @see update */
        fun update(params: BrandUpdateParams): CompletableFuture<HttpResponseFor<BrandResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            update(id, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rcs/brands`, but is otherwise the same as
         * [BrandServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<BrandResponse>>> =
            list(BrandListParams.none())

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BrandResponse>>>

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): CompletableFuture<HttpResponseFor<List<BrandResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<BrandResponse>>> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rcs/brands/{id}/submit`, but is otherwise the same
         * as [BrandServiceAsync.submit].
         */
        fun submit(id: String): CompletableFuture<HttpResponseFor<BrandResponse>> =
            submit(id, BrandSubmitParams.none())

        /** @see submit */
        fun submit(
            id: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            submit(params.toBuilder().id(id).build(), requestOptions)

        /** @see submit */
        fun submit(
            id: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            submit(id, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: BrandSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandResponse>>

        /** @see submit */
        fun submit(params: BrandSubmitParams): CompletableFuture<HttpResponseFor<BrandResponse>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandResponse>> =
            submit(id, BrandSubmitParams.none(), requestOptions)
    }
}
