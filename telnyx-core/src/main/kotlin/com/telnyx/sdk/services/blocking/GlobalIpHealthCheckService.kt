// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckCreateParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckCreateResponse
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckDeleteParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckDeleteResponse
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckListPage
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckListParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckRetrieveParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckRetrieveResponse
import java.util.function.Consumer

/** Global IPs */
interface GlobalIpHealthCheckService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpHealthCheckService

    /** Create a Global IP health check. */
    fun create(): GlobalIpHealthCheckCreateResponse = create(GlobalIpHealthCheckCreateParams.none())

    /** @see create */
    fun create(
        params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpHealthCheckCreateResponse

    /** @see create */
    fun create(
        params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none()
    ): GlobalIpHealthCheckCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): GlobalIpHealthCheckCreateResponse =
        create(GlobalIpHealthCheckCreateParams.none(), requestOptions)

    /** Retrieve a Global IP health check. */
    fun retrieve(id: String): GlobalIpHealthCheckRetrieveResponse =
        retrieve(id, GlobalIpHealthCheckRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpHealthCheckRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
    ): GlobalIpHealthCheckRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GlobalIpHealthCheckRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpHealthCheckRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: GlobalIpHealthCheckRetrieveParams): GlobalIpHealthCheckRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): GlobalIpHealthCheckRetrieveResponse =
        retrieve(id, GlobalIpHealthCheckRetrieveParams.none(), requestOptions)

    /** List all Global IP health checks. */
    fun list(): GlobalIpHealthCheckListPage = list(GlobalIpHealthCheckListParams.none())

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpHealthCheckListPage

    /** @see list */
    fun list(
        params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none()
    ): GlobalIpHealthCheckListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): GlobalIpHealthCheckListPage =
        list(GlobalIpHealthCheckListParams.none(), requestOptions)

    /** Delete a Global IP health check. */
    fun delete(id: String): GlobalIpHealthCheckDeleteResponse =
        delete(id, GlobalIpHealthCheckDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpHealthCheckDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
    ): GlobalIpHealthCheckDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GlobalIpHealthCheckDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GlobalIpHealthCheckDeleteResponse

    /** @see delete */
    fun delete(params: GlobalIpHealthCheckDeleteParams): GlobalIpHealthCheckDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): GlobalIpHealthCheckDeleteResponse =
        delete(id, GlobalIpHealthCheckDeleteParams.none(), requestOptions)

    /**
     * A view of [GlobalIpHealthCheckService] that provides access to raw HTTP responses for each
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
        ): GlobalIpHealthCheckService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /global_ip_health_checks`, but is otherwise the
         * same as [GlobalIpHealthCheckService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<GlobalIpHealthCheckCreateResponse> =
            create(GlobalIpHealthCheckCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpHealthCheckCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: GlobalIpHealthCheckCreateParams = GlobalIpHealthCheckCreateParams.none()
        ): HttpResponseFor<GlobalIpHealthCheckCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<GlobalIpHealthCheckCreateResponse> =
            create(GlobalIpHealthCheckCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ip_health_checks/{id}`, but is otherwise the
         * same as [GlobalIpHealthCheckService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<GlobalIpHealthCheckRetrieveResponse> =
            retrieve(id, GlobalIpHealthCheckRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpHealthCheckRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: GlobalIpHealthCheckRetrieveParams = GlobalIpHealthCheckRetrieveParams.none(),
        ): HttpResponseFor<GlobalIpHealthCheckRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpHealthCheckRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpHealthCheckRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GlobalIpHealthCheckRetrieveParams
        ): HttpResponseFor<GlobalIpHealthCheckRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpHealthCheckRetrieveResponse> =
            retrieve(id, GlobalIpHealthCheckRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /global_ip_health_checks`, but is otherwise the same
         * as [GlobalIpHealthCheckService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<GlobalIpHealthCheckListPage> =
            list(GlobalIpHealthCheckListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpHealthCheckListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: GlobalIpHealthCheckListParams = GlobalIpHealthCheckListParams.none()
        ): HttpResponseFor<GlobalIpHealthCheckListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<GlobalIpHealthCheckListPage> =
            list(GlobalIpHealthCheckListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /global_ip_health_checks/{id}`, but is otherwise
         * the same as [GlobalIpHealthCheckService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<GlobalIpHealthCheckDeleteResponse> =
            delete(id, GlobalIpHealthCheckDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpHealthCheckDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: GlobalIpHealthCheckDeleteParams = GlobalIpHealthCheckDeleteParams.none(),
        ): HttpResponseFor<GlobalIpHealthCheckDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GlobalIpHealthCheckDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GlobalIpHealthCheckDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GlobalIpHealthCheckDeleteParams
        ): HttpResponseFor<GlobalIpHealthCheckDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpHealthCheckDeleteResponse> =
            delete(id, GlobalIpHealthCheckDeleteParams.none(), requestOptions)
    }
}
