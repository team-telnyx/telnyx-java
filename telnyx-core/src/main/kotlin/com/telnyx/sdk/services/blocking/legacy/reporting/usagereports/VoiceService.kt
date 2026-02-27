// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.usagereports

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceCreateParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceCreateResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceDeleteParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceDeleteResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceListPage
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceListParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceRetrieveResponse
import java.util.function.Consumer

/** Voice usage reports */
interface VoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService

    /** Creates a new legacy usage V2 CDR report request with the specified filters */
    fun create(params: VoiceCreateParams): VoiceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceCreateResponse

    /** Fetch single cdr usage report by id. */
    fun retrieve(id: String): VoiceRetrieveResponse = retrieve(id, VoiceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
    ): VoiceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VoiceRetrieveParams): VoiceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VoiceRetrieveResponse =
        retrieve(id, VoiceRetrieveParams.none(), requestOptions)

    /** Fetch all previous requests for cdr usage reports. */
    fun list(): VoiceListPage = list(VoiceListParams.none())

    /** @see list */
    fun list(
        params: VoiceListParams = VoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceListPage

    /** @see list */
    fun list(params: VoiceListParams = VoiceListParams.none()): VoiceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VoiceListPage =
        list(VoiceListParams.none(), requestOptions)

    /** Deletes a specific V2 legacy usage CDR report request by ID */
    fun delete(id: String): VoiceDeleteResponse = delete(id, VoiceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VoiceDeleteParams = VoiceDeleteParams.none(),
    ): VoiceDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VoiceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceDeleteResponse

    /** @see delete */
    fun delete(params: VoiceDeleteParams): VoiceDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): VoiceDeleteResponse =
        delete(id, VoiceDeleteParams.none(), requestOptions)

    /** A view of [VoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /legacy/reporting/usage_reports/voice`, but is
         * otherwise the same as [VoiceService.create].
         */
        @MustBeClosed
        fun create(params: VoiceCreateParams): HttpResponseFor<VoiceCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceCreateResponse>

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/voice/{id}`, but is
         * otherwise the same as [VoiceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(id, VoiceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VoiceRetrieveParams = VoiceRetrieveParams.none(),
        ): HttpResponseFor<VoiceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VoiceRetrieveParams): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceRetrieveResponse> =
            retrieve(id, VoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /legacy/reporting/usage_reports/voice`, but is
         * otherwise the same as [VoiceService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<VoiceListPage> = list(VoiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceListParams = VoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: VoiceListParams = VoiceListParams.none()): HttpResponseFor<VoiceListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VoiceListPage> =
            list(VoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /legacy/reporting/usage_reports/voice/{id}`, but
         * is otherwise the same as [VoiceService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<VoiceDeleteResponse> =
            delete(id, VoiceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VoiceDeleteParams = VoiceDeleteParams.none(),
        ): HttpResponseFor<VoiceDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VoiceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: VoiceDeleteParams): HttpResponseFor<VoiceDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceDeleteResponse> =
            delete(id, VoiceDeleteParams.none(), requestOptions)
    }
}
