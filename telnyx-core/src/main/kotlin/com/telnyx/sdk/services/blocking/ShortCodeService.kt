// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.shortcodes.ShortCodeListParams
import com.telnyx.sdk.models.shortcodes.ShortCodeListResponse
import com.telnyx.sdk.models.shortcodes.ShortCodeRetrieveParams
import com.telnyx.sdk.models.shortcodes.ShortCodeRetrieveResponse
import com.telnyx.sdk.models.shortcodes.ShortCodeUpdateParams
import com.telnyx.sdk.models.shortcodes.ShortCodeUpdateResponse
import java.util.function.Consumer

interface ShortCodeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShortCodeService

    /** Retrieve a short code */
    fun retrieve(id: String): ShortCodeRetrieveResponse =
        retrieve(id, ShortCodeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortCodeRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
    ): ShortCodeRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ShortCodeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortCodeRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ShortCodeRetrieveParams): ShortCodeRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ShortCodeRetrieveResponse =
        retrieve(id, ShortCodeRetrieveParams.none(), requestOptions)

    /**
     * Update the settings for a specific short code. To unbind a short code from a profile, set the
     * `messaging_profile_id` to `null` or an empty string.
     */
    fun update(id: String, params: ShortCodeUpdateParams): ShortCodeUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ShortCodeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortCodeUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ShortCodeUpdateParams): ShortCodeUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ShortCodeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortCodeUpdateResponse

    /** List short codes */
    fun list(): ShortCodeListResponse = list(ShortCodeListParams.none())

    /** @see list */
    fun list(
        params: ShortCodeListParams = ShortCodeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ShortCodeListResponse

    /** @see list */
    fun list(params: ShortCodeListParams = ShortCodeListParams.none()): ShortCodeListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ShortCodeListResponse =
        list(ShortCodeListParams.none(), requestOptions)

    /** A view of [ShortCodeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShortCodeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /short_codes/{id}`, but is otherwise the same as
         * [ShortCodeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ShortCodeRetrieveResponse> =
            retrieve(id, ShortCodeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortCodeRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ShortCodeRetrieveParams = ShortCodeRetrieveParams.none(),
        ): HttpResponseFor<ShortCodeRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ShortCodeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortCodeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ShortCodeRetrieveParams): HttpResponseFor<ShortCodeRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShortCodeRetrieveResponse> =
            retrieve(id, ShortCodeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /short_codes/{id}`, but is otherwise the same as
         * [ShortCodeService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ShortCodeUpdateParams,
        ): HttpResponseFor<ShortCodeUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ShortCodeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortCodeUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ShortCodeUpdateParams): HttpResponseFor<ShortCodeUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ShortCodeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortCodeUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /short_codes`, but is otherwise the same as
         * [ShortCodeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ShortCodeListResponse> = list(ShortCodeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ShortCodeListParams = ShortCodeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ShortCodeListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ShortCodeListParams = ShortCodeListParams.none()
        ): HttpResponseFor<ShortCodeListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ShortCodeListResponse> =
            list(ShortCodeListParams.none(), requestOptions)
    }
}
