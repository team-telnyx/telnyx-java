// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rcs.brands.BrandCreateParams
import com.telnyx.sdk.models.rcs.brands.BrandListParams
import com.telnyx.sdk.models.rcs.brands.BrandResponse
import com.telnyx.sdk.models.rcs.brands.BrandRetrieveParams
import com.telnyx.sdk.models.rcs.brands.BrandSubmitParams
import com.telnyx.sdk.models.rcs.brands.BrandUpdateParams
import java.util.function.Consumer

/** Manage the legal business entities that operate RCS agents. */
interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    /** Creates an editable RCS brand draft. Creating the draft does not begin external review. */
    fun create(params: BrandCreateParams): BrandResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandResponse

    /** Retrieves an RCS brand and its current lifecycle status. */
    fun retrieve(id: String): BrandResponse = retrieve(id, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): BrandResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandResponse

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): BrandResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BrandResponse =
        retrieve(id, BrandRetrieveParams.none(), requestOptions)

    /**
     * Updates one or more fields on a brand while its status is `CREATED`. Submitted brands cannot
     * be changed.
     */
    fun update(id: String): BrandResponse = update(id, BrandUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: BrandUpdateParams = BrandUpdateParams.none()): BrandResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandResponse

    /** @see update */
    fun update(params: BrandUpdateParams): BrandResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): BrandResponse =
        update(id, BrandUpdateParams.none(), requestOptions)

    /** Lists RCS brands owned by the authenticated organization. */
    fun list(): List<BrandResponse> = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<BrandResponse>

    /** @see list */
    fun list(params: BrandListParams = BrandListParams.none()): List<BrandResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<BrandResponse> =
        list(BrandListParams.none(), requestOptions)

    /**
     * Starts asynchronous provider provisioning and external review for a brand. Repeating this
     * request for an in-progress brand returns its current state without creating new work.
     */
    fun submit(id: String): BrandResponse = submit(id, BrandSubmitParams.none())

    /** @see submit */
    fun submit(
        id: String,
        params: BrandSubmitParams = BrandSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandResponse = submit(params.toBuilder().id(id).build(), requestOptions)

    /** @see submit */
    fun submit(id: String, params: BrandSubmitParams = BrandSubmitParams.none()): BrandResponse =
        submit(id, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: BrandSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandResponse

    /** @see submit */
    fun submit(params: BrandSubmitParams): BrandResponse = submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(id: String, requestOptions: RequestOptions): BrandResponse =
        submit(id, BrandSubmitParams.none(), requestOptions)

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rcs/brands`, but is otherwise the same as
         * [BrandService.create].
         */
        @MustBeClosed
        fun create(params: BrandCreateParams): HttpResponseFor<BrandResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandResponse>

        /**
         * Returns a raw HTTP response for `get /rcs/brands/{id}`, but is otherwise the same as
         * [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BrandResponse> =
            retrieve(id, BrandRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): HttpResponseFor<BrandResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BrandRetrieveParams): HttpResponseFor<BrandResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BrandResponse> =
            retrieve(id, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rcs/brands/{id}`, but is otherwise the same as
         * [BrandService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<BrandResponse> =
            update(id, BrandUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
        ): HttpResponseFor<BrandResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: BrandUpdateParams): HttpResponseFor<BrandResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<BrandResponse> =
            update(id, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rcs/brands`, but is otherwise the same as
         * [BrandService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<BrandResponse>> = list(BrandListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<BrandResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): HttpResponseFor<List<BrandResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<BrandResponse>> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rcs/brands/{id}/submit`, but is otherwise the same
         * as [BrandService.submit].
         */
        @MustBeClosed
        fun submit(id: String): HttpResponseFor<BrandResponse> =
            submit(id, BrandSubmitParams.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            id: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandResponse> =
            submit(params.toBuilder().id(id).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(
            id: String,
            params: BrandSubmitParams = BrandSubmitParams.none(),
        ): HttpResponseFor<BrandResponse> = submit(id, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: BrandSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandResponse>

        /** @see submit */
        @MustBeClosed
        fun submit(params: BrandSubmitParams): HttpResponseFor<BrandResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(id: String, requestOptions: RequestOptions): HttpResponseFor<BrandResponse> =
            submit(id, BrandSubmitParams.none(), requestOptions)
    }
}
