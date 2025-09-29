// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.faxes.FaxCreateParams
import com.telnyx.api.models.faxes.FaxCreateResponse
import com.telnyx.api.models.faxes.FaxDeleteParams
import com.telnyx.api.models.faxes.FaxListParams
import com.telnyx.api.models.faxes.FaxListResponse
import com.telnyx.api.models.faxes.FaxRetrieveParams
import com.telnyx.api.models.faxes.FaxRetrieveResponse
import com.telnyx.api.services.blocking.faxes.ActionService
import java.util.function.Consumer

interface FaxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxService

    fun actions(): ActionService

    /**
     * Send a fax. Files have size limits and page count limit validations. If a file is bigger than
     * 50MB or has more than 350 pages it will fail with `file_size_limit_exceeded` and
     * `page_count_limit_exceeded` respectively.
     *
     * **Expected Webhooks:**
     * - `fax.queued`
     * - `fax.media.processed`
     * - `fax.sending.started`
     * - `fax.delivered`
     * - `fax.failed`
     */
    fun create(params: FaxCreateParams): FaxCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FaxCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxCreateResponse

    /** View a fax */
    fun retrieve(id: String): FaxRetrieveResponse = retrieve(id, FaxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxRetrieveParams = FaxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: FaxRetrieveParams = FaxRetrieveParams.none(),
    ): FaxRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FaxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FaxRetrieveParams): FaxRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): FaxRetrieveResponse =
        retrieve(id, FaxRetrieveParams.none(), requestOptions)

    /** View a list of faxes */
    fun list(): FaxListResponse = list(FaxListParams.none())

    /** @see list */
    fun list(
        params: FaxListParams = FaxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxListResponse

    /** @see list */
    fun list(params: FaxListParams = FaxListParams.none()): FaxListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FaxListResponse =
        list(FaxListParams.none(), requestOptions)

    /** Delete a fax */
    fun delete(id: String) = delete(id, FaxDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: FaxDeleteParams = FaxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: FaxDeleteParams = FaxDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FaxDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FaxDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, FaxDeleteParams.none(), requestOptions)

    /** A view of [FaxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /faxes`, but is otherwise the same as
         * [FaxService.create].
         */
        @MustBeClosed
        fun create(params: FaxCreateParams): HttpResponseFor<FaxCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FaxCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxCreateResponse>

        /**
         * Returns a raw HTTP response for `get /faxes/{id}`, but is otherwise the same as
         * [FaxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FaxRetrieveResponse> =
            retrieve(id, FaxRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FaxRetrieveParams = FaxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: FaxRetrieveParams = FaxRetrieveParams.none(),
        ): HttpResponseFor<FaxRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FaxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FaxRetrieveParams): HttpResponseFor<FaxRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxRetrieveResponse> =
            retrieve(id, FaxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /faxes`, but is otherwise the same as
         * [FaxService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FaxListResponse> = list(FaxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FaxListParams = FaxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: FaxListParams = FaxListParams.none()): HttpResponseFor<FaxListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FaxListResponse> =
            list(FaxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /faxes/{id}`, but is otherwise the same as
         * [FaxService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, FaxDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: FaxDeleteParams = FaxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: FaxDeleteParams = FaxDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FaxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FaxDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, FaxDeleteParams.none(), requestOptions)
    }
}
