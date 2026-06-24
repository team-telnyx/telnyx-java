// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globalips.GlobalIp
import com.telnyx.sdk.models.globalips.GlobalIpCreateParams
import com.telnyx.sdk.models.globalips.GlobalIpCreateResponse
import com.telnyx.sdk.models.globalips.GlobalIpDeleteParams
import com.telnyx.sdk.models.globalips.GlobalIpDeleteResponse
import com.telnyx.sdk.models.globalips.GlobalIpListPage
import com.telnyx.sdk.models.globalips.GlobalIpListParams
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveParams
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveResponse
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpService

    /** Create a Global IP. */
    fun create(params: GlobalIpCreateParams): GlobalIpCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GlobalIpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpCreateResponse

    /** @see create */
    fun create(
        globalIp: GlobalIp,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpCreateResponse =
        create(GlobalIpCreateParams.builder().globalIp(globalIp).build(), requestOptions)

    /** @see create */
    fun create(globalIp: GlobalIp): GlobalIpCreateResponse = create(globalIp, RequestOptions.none())

    /** Retrieve a Global IP. */
    fun retrieve(id: String): GlobalIpRetrieveResponse = retrieve(id, GlobalIpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
    ): GlobalIpRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: GlobalIpRetrieveParams): GlobalIpRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): GlobalIpRetrieveResponse =
        retrieve(id, GlobalIpRetrieveParams.none(), requestOptions)

    /** List all Global IPs. */
    fun list(): GlobalIpListPage = list(GlobalIpListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpListParams = GlobalIpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpListPage

    /** @see list */
    fun list(params: GlobalIpListParams = GlobalIpListParams.none()): GlobalIpListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GlobalIpListPage =
        list(GlobalIpListParams.none(), requestOptions)

    /** Delete a Global IP. */
    fun delete(id: String): GlobalIpDeleteResponse = delete(id, GlobalIpDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
    ): GlobalIpDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GlobalIpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpDeleteResponse

    /** @see delete */
    fun delete(params: GlobalIpDeleteParams): GlobalIpDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): GlobalIpDeleteResponse =
        delete(id, GlobalIpDeleteParams.none(), requestOptions)

    /** A view of [GlobalIpService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /global_ips`, but is otherwise the same as
         * [GlobalIpService.create].
         */
        @MustBeClosed
        fun create(params: GlobalIpCreateParams): HttpResponseFor<GlobalIpCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GlobalIpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            globalIp: GlobalIp,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpCreateResponse> =
            create(GlobalIpCreateParams.builder().globalIp(globalIp).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(globalIp: GlobalIp): HttpResponseFor<GlobalIpCreateResponse> =
            create(globalIp, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /global_ips/{id}`, but is otherwise the same as
         * [GlobalIpService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<GlobalIpRetrieveResponse> =
            retrieve(id, GlobalIpRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GlobalIpRetrieveParams = GlobalIpRetrieveParams.none(),
        ): HttpResponseFor<GlobalIpRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: GlobalIpRetrieveParams): HttpResponseFor<GlobalIpRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpRetrieveResponse> =
            retrieve(id, GlobalIpRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ips`, but is otherwise the same as
         * [GlobalIpService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GlobalIpListPage> = list(GlobalIpListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpListParams = GlobalIpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpListParams = GlobalIpListParams.none()
        ): HttpResponseFor<GlobalIpListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GlobalIpListPage> =
            list(GlobalIpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /global_ips/{id}`, but is otherwise the same as
         * [GlobalIpService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<GlobalIpDeleteResponse> =
            delete(id, GlobalIpDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GlobalIpDeleteParams = GlobalIpDeleteParams.none(),
        ): HttpResponseFor<GlobalIpDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GlobalIpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: GlobalIpDeleteParams): HttpResponseFor<GlobalIpDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpDeleteResponse> =
            delete(id, GlobalIpDeleteParams.none(), requestOptions)
    }
}
