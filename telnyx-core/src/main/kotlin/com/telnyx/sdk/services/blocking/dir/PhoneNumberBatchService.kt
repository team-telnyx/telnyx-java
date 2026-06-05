// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchListPage
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchListParams
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveParams
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveResponse
import java.util.function.Consumer

/**
 * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers added in
 * a single request under the same Letter of Authorization.
 */
interface PhoneNumberBatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberBatchService

    /**
     * Get a single phone-number batch by id. The enterprise is resolved server-side from the DIR
     * id.
     */
    fun retrieve(
        batchId: String,
        params: PhoneNumberBatchRetrieveParams,
    ): PhoneNumberBatchRetrieveResponse = retrieve(batchId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        batchId: String,
        params: PhoneNumberBatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBatchRetrieveResponse =
        retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PhoneNumberBatchRetrieveParams): PhoneNumberBatchRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberBatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBatchRetrieveResponse

    /**
     * List the phone-number batches submitted under a DIR. The enterprise is resolved server-side
     * from the DIR id.
     */
    fun list(dirId: String): PhoneNumberBatchListPage =
        list(dirId, PhoneNumberBatchListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBatchListPage = list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
    ): PhoneNumberBatchListPage = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberBatchListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberBatchListPage

    /** @see list */
    fun list(params: PhoneNumberBatchListParams): PhoneNumberBatchListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(dirId: String, requestOptions: RequestOptions): PhoneNumberBatchListPage =
        list(dirId, PhoneNumberBatchListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberBatchService] that provides access to raw HTTP responses for each
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
        ): PhoneNumberBatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/phone_number_batches/{batch_id}`, but
         * is otherwise the same as [PhoneNumberBatchService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            batchId: String,
            params: PhoneNumberBatchRetrieveParams,
        ): HttpResponseFor<PhoneNumberBatchRetrieveResponse> =
            retrieve(batchId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            batchId: String,
            params: PhoneNumberBatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBatchRetrieveResponse> =
            retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberBatchRetrieveParams
        ): HttpResponseFor<PhoneNumberBatchRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberBatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBatchRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/phone_number_batches`, but is
         * otherwise the same as [PhoneNumberBatchService.list].
         */
        @MustBeClosed
        fun list(dirId: String): HttpResponseFor<PhoneNumberBatchListPage> =
            list(dirId, PhoneNumberBatchListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBatchListPage> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
        ): HttpResponseFor<PhoneNumberBatchListPage> = list(dirId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberBatchListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberBatchListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PhoneNumberBatchListParams): HttpResponseFor<PhoneNumberBatchListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberBatchListPage> =
            list(dirId, PhoneNumberBatchListParams.none(), requestOptions)
    }
}
