// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.shortcodes.ShortCodeListPageAsync
import com.telnyx.sdk.models.shortcodes.ShortCodeListParams
import com.telnyx.sdk.models.shortcodes.ShortCodeRetrieveParams
import com.telnyx.sdk.models.shortcodes.ShortCodeRetrieveResponse
import com.telnyx.sdk.models.shortcodes.ShortCodeUpdateParams
import com.telnyx.sdk.models.shortcodes.ShortCodeUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Short codes */
interface ShortCodeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShortCodeServiceAsync

    /** Retrieve a short code */
    fun retrieve(id: String): CompletableFuture<ShortCodeRetrieveResponse> =
        retrieve(id, ShortCodeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortCodeRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
    ): CompletableFuture<ShortCodeRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ShortCodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortCodeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ShortCodeRetrieveParams): CompletableFuture<ShortCodeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ShortCodeRetrieveResponse> =
        retrieve(id, ShortCodeRetrieveParams.none(), requestOptions)

    /**
     * Update the settings for a specific short code. To unbind a short code from a profile, set the
     * `messaging_profile_id` to `null` or an empty string. To add or update tags, include the tags
     * field as an array of strings.
     */
    fun update(
        id: String,
        params: ShortCodeUpdateParams,
    ): CompletableFuture<ShortCodeUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ShortCodeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortCodeUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ShortCodeUpdateParams): CompletableFuture<ShortCodeUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ShortCodeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortCodeUpdateResponse>

    /** List short codes */
    fun list(): CompletableFuture<ShortCodeListPageAsync> = list(ShortCodeListParams.none())

    /** @see list */
    fun list(
        params: ShortCodeListParams = ShortCodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ShortCodeListPageAsync>

    /** @see list */
    fun list(
        params: ShortCodeListParams = ShortCodeListParams.none()
    ): CompletableFuture<ShortCodeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ShortCodeListPageAsync> =
        list(ShortCodeListParams.none(), requestOptions)

    /**
     * A view of [ShortCodeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShortCodeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /short_codes/{id}`, but is otherwise the same as
         * [ShortCodeServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ShortCodeRetrieveResponse>> =
            retrieve(id, ShortCodeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortCodeRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ShortCodeRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ShortCodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortCodeRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ShortCodeRetrieveParams
        ): CompletableFuture<HttpResponseFor<ShortCodeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ShortCodeRetrieveResponse>> =
            retrieve(id, ShortCodeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /short_codes/{id}`, but is otherwise the same as
         * [ShortCodeServiceAsync.update].
         */
        fun update(
            id: String,
            params: ShortCodeUpdateParams,
        ): CompletableFuture<HttpResponseFor<ShortCodeUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ShortCodeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortCodeUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ShortCodeUpdateParams
        ): CompletableFuture<HttpResponseFor<ShortCodeUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ShortCodeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortCodeUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /short_codes`, but is otherwise the same as
         * [ShortCodeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ShortCodeListPageAsync>> =
            list(ShortCodeListParams.none())

        /** @see list */
        fun list(
            params: ShortCodeListParams = ShortCodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ShortCodeListPageAsync>>

        /** @see list */
        fun list(
            params: ShortCodeListParams = ShortCodeListParams.none()
        ): CompletableFuture<HttpResponseFor<ShortCodeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ShortCodeListPageAsync>> =
            list(ShortCodeListParams.none(), requestOptions)
    }
}
