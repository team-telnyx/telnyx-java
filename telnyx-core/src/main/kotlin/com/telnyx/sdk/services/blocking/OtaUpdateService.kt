// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.otaupdates.OtaUpdateListPage
import com.telnyx.sdk.models.otaupdates.OtaUpdateListParams
import com.telnyx.sdk.models.otaupdates.OtaUpdateRetrieveParams
import com.telnyx.sdk.models.otaupdates.OtaUpdateRetrieveResponse
import java.util.function.Consumer

/** OTA updates operations */
interface OtaUpdateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OtaUpdateService

    /** This API returns the details of an Over the Air (OTA) update. */
    fun retrieve(id: String): OtaUpdateRetrieveResponse =
        retrieve(id, OtaUpdateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OtaUpdateRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
    ): OtaUpdateRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OtaUpdateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OtaUpdateRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OtaUpdateRetrieveParams): OtaUpdateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): OtaUpdateRetrieveResponse =
        retrieve(id, OtaUpdateRetrieveParams.none(), requestOptions)

    /** List OTA updates */
    fun list(): OtaUpdateListPage = list(OtaUpdateListParams.none())

    /** @see list */
    fun list(
        params: OtaUpdateListParams = OtaUpdateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OtaUpdateListPage

    /** @see list */
    fun list(params: OtaUpdateListParams = OtaUpdateListParams.none()): OtaUpdateListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OtaUpdateListPage =
        list(OtaUpdateListParams.none(), requestOptions)

    /** A view of [OtaUpdateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OtaUpdateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ota_updates/{id}`, but is otherwise the same as
         * [OtaUpdateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<OtaUpdateRetrieveResponse> =
            retrieve(id, OtaUpdateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OtaUpdateRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OtaUpdateRetrieveParams = OtaUpdateRetrieveParams.none(),
        ): HttpResponseFor<OtaUpdateRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OtaUpdateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OtaUpdateRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OtaUpdateRetrieveParams): HttpResponseFor<OtaUpdateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OtaUpdateRetrieveResponse> =
            retrieve(id, OtaUpdateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ota_updates`, but is otherwise the same as
         * [OtaUpdateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OtaUpdateListPage> = list(OtaUpdateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OtaUpdateListParams = OtaUpdateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OtaUpdateListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OtaUpdateListParams = OtaUpdateListParams.none()
        ): HttpResponseFor<OtaUpdateListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OtaUpdateListPage> =
            list(OtaUpdateListParams.none(), requestOptions)
    }
}
