// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckCreateParams
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckCreateResponse
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckDeleteParams
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckDeleteResponse
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckListParams
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckListResponse
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckRetrieveParams
import com.telnyx.api.models.globaliphealthchecks.GlobalIpHealthCheckRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalIpHealthCheckServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpHealthCheckServiceAsync

    /** Create a Global IP health check. */
    fun create(): CompletableFuture<GlobalIpHealthCheckCreateResponse> =
        create(GlobalIpHealthCheckCreateParams.none())

    /** @see create */
    fun create(
        params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpHealthCheckCreateResponse>

    /** @see create */
    fun create(
        params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none()
    ): CompletableFuture<GlobalIpHealthCheckCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<GlobalIpHealthCheckCreateResponse> =
        create(GlobalIpHealthCheckCreateParams.none(), requestOptions)

    /** Retrieve a Global IP health check. */
    fun retrieve(id: String): CompletableFuture<GlobalIpHealthCheckRetrieveResponse> =
        retrieve(id, GlobalIpHealthCheckRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpHealthCheckRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
    ): CompletableFuture<GlobalIpHealthCheckRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpHealthCheckRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpHealthCheckRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpHealthCheckRetrieveParams
    ): CompletableFuture<GlobalIpHealthCheckRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpHealthCheckRetrieveResponse> =
        retrieve(id, GlobalIpHealthCheckRetrieveParams.none(), requestOptions)

    /** List all Global IP health checks. */
    fun list(): CompletableFuture<GlobalIpHealthCheckListResponse> =
        list(GlobalIpHealthCheckListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpHealthCheckListResponse>

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none()
    ): CompletableFuture<GlobalIpHealthCheckListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<GlobalIpHealthCheckListResponse> =
        list(GlobalIpHealthCheckListParams.none(), requestOptions)

    /** Delete a Global IP health check. */
    fun delete(id: String): CompletableFuture<GlobalIpHealthCheckDeleteResponse> =
        delete(id, GlobalIpHealthCheckDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpHealthCheckDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
    ): CompletableFuture<GlobalIpHealthCheckDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GlobalIpHealthCheckDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GlobalIpHealthCheckDeleteResponse>

    /** @see delete */
    fun delete(
        params: GlobalIpHealthCheckDeleteParams
    ): CompletableFuture<GlobalIpHealthCheckDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpHealthCheckDeleteResponse> =
        delete(id, GlobalIpHealthCheckDeleteParams.none(), requestOptions)

    /**
     * A view of [GlobalIpHealthCheckServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpHealthCheckServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /global_ip_health_checks`, but is otherwise the
         * same as [GlobalIpHealthCheckServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckCreateResponse>> =
            create(GlobalIpHealthCheckCreateParams.none())

        /** @see create */
        fun create(
            params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckCreateResponse>>

        /** @see create */
        fun create(
            params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckCreateResponse>> =
            create(GlobalIpHealthCheckCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ip_health_checks/{id}`, but is otherwise the
         * same as [GlobalIpHealthCheckServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckRetrieveResponse>> =
            retrieve(id, GlobalIpHealthCheckRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpHealthCheckRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: GlobalIpHealthCheckRetrieveParams
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckRetrieveResponse>> =
            retrieve(id, GlobalIpHealthCheckRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ip_health_checks`, but is otherwise the same
         * as [GlobalIpHealthCheckServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckListResponse>> =
            list(GlobalIpHealthCheckListParams.none())

        /** @see list */
        fun list(
            params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckListResponse>>

        /** @see list */
        fun list(
            params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none()
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckListResponse>> =
            list(GlobalIpHealthCheckListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /global_ip_health_checks/{id}`, but is otherwise
         * the same as [GlobalIpHealthCheckServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckDeleteResponse>> =
            delete(id, GlobalIpHealthCheckDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GlobalIpHealthCheckDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckDeleteResponse>>

        /** @see delete */
        fun delete(
            params: GlobalIpHealthCheckDeleteParams
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpHealthCheckDeleteResponse>> =
            delete(id, GlobalIpHealthCheckDeleteParams.none(), requestOptions)
    }
}
