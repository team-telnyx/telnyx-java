// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileDeleteParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileDeleteResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListPageAsync
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListServicesPageAsync
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListServicesParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileRetrieveParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileRetrieveResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Traffic Policy Profiles operations */
interface TrafficPolicyProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrafficPolicyProfileServiceAsync

    /**
     * Create a new traffic policy profile. At least one of `services`, `ip_ranges`, or `domains`
     * must be provided.
     */
    fun create(
        params: TrafficPolicyProfileCreateParams
    ): CompletableFuture<TrafficPolicyProfileCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TrafficPolicyProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileCreateResponse>

    /** Returns the details regarding a specific traffic policy profile. */
    fun retrieve(id: String): CompletableFuture<TrafficPolicyProfileRetrieveResponse> =
        retrieve(id, TrafficPolicyProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
    ): CompletableFuture<TrafficPolicyProfileRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TrafficPolicyProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TrafficPolicyProfileRetrieveParams
    ): CompletableFuture<TrafficPolicyProfileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileRetrieveResponse> =
        retrieve(id, TrafficPolicyProfileRetrieveParams.none(), requestOptions)

    /** Updates a traffic policy profile. */
    fun update(id: String): CompletableFuture<TrafficPolicyProfileUpdateResponse> =
        update(id, TrafficPolicyProfileUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
    ): CompletableFuture<TrafficPolicyProfileUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TrafficPolicyProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileUpdateResponse>

    /** @see update */
    fun update(
        params: TrafficPolicyProfileUpdateParams
    ): CompletableFuture<TrafficPolicyProfileUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileUpdateResponse> =
        update(id, TrafficPolicyProfileUpdateParams.none(), requestOptions)

    /** Get all traffic policy profiles belonging to the user that match the given filters. */
    fun list(): CompletableFuture<TrafficPolicyProfileListPageAsync> =
        list(TrafficPolicyProfileListParams.none())

    /** @see list */
    fun list(
        params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileListPageAsync>

    /** @see list */
    fun list(
        params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none()
    ): CompletableFuture<TrafficPolicyProfileListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TrafficPolicyProfileListPageAsync> =
        list(TrafficPolicyProfileListParams.none(), requestOptions)

    /** Deletes the traffic policy profile. */
    fun delete(id: String): CompletableFuture<TrafficPolicyProfileDeleteResponse> =
        delete(id, TrafficPolicyProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
    ): CompletableFuture<TrafficPolicyProfileDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TrafficPolicyProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileDeleteResponse>

    /** @see delete */
    fun delete(
        params: TrafficPolicyProfileDeleteParams
    ): CompletableFuture<TrafficPolicyProfileDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TrafficPolicyProfileDeleteResponse> =
        delete(id, TrafficPolicyProfileDeleteParams.none(), requestOptions)

    /** Get all available PCEF services that can be used in traffic policy profiles. */
    fun listServices(): CompletableFuture<TrafficPolicyProfileListServicesPageAsync> =
        listServices(TrafficPolicyProfileListServicesParams.none())

    /** @see listServices */
    fun listServices(
        params: TrafficPolicyProfileListServicesParams =
            TrafficPolicyProfileListServicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TrafficPolicyProfileListServicesPageAsync>

    /** @see listServices */
    fun listServices(
        params: TrafficPolicyProfileListServicesParams =
            TrafficPolicyProfileListServicesParams.none()
    ): CompletableFuture<TrafficPolicyProfileListServicesPageAsync> =
        listServices(params, RequestOptions.none())

    /** @see listServices */
    fun listServices(
        requestOptions: RequestOptions
    ): CompletableFuture<TrafficPolicyProfileListServicesPageAsync> =
        listServices(TrafficPolicyProfileListServicesParams.none(), requestOptions)

    /**
     * A view of [TrafficPolicyProfileServiceAsync] that provides access to raw HTTP responses for
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
        ): TrafficPolicyProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /traffic_policy_profiles`, but is otherwise the
         * same as [TrafficPolicyProfileServiceAsync.create].
         */
        fun create(
            params: TrafficPolicyProfileCreateParams
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TrafficPolicyProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /traffic_policy_profiles/{id}`, but is otherwise the
         * same as [TrafficPolicyProfileServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileRetrieveResponse>> =
            retrieve(id, TrafficPolicyProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TrafficPolicyProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TrafficPolicyProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileRetrieveResponse>> =
            retrieve(id, TrafficPolicyProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /traffic_policy_profiles/{id}`, but is otherwise
         * the same as [TrafficPolicyProfileServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileUpdateResponse>> =
            update(id, TrafficPolicyProfileUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TrafficPolicyProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileUpdateResponse>>

        /** @see update */
        fun update(
            params: TrafficPolicyProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileUpdateResponse>> =
            update(id, TrafficPolicyProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /traffic_policy_profiles`, but is otherwise the same
         * as [TrafficPolicyProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListPageAsync>> =
            list(TrafficPolicyProfileListParams.none())

        /** @see list */
        fun list(
            params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListPageAsync>>

        /** @see list */
        fun list(
            params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListPageAsync>> =
            list(TrafficPolicyProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /traffic_policy_profiles/{id}`, but is otherwise
         * the same as [TrafficPolicyProfileServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileDeleteResponse>> =
            delete(id, TrafficPolicyProfileDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TrafficPolicyProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileDeleteResponse>>

        /** @see delete */
        fun delete(
            params: TrafficPolicyProfileDeleteParams
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileDeleteResponse>> =
            delete(id, TrafficPolicyProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /traffic_policy_profiles/services`, but is otherwise
         * the same as [TrafficPolicyProfileServiceAsync.listServices].
         */
        fun listServices():
            CompletableFuture<HttpResponseFor<TrafficPolicyProfileListServicesPageAsync>> =
            listServices(TrafficPolicyProfileListServicesParams.none())

        /** @see listServices */
        fun listServices(
            params: TrafficPolicyProfileListServicesParams =
                TrafficPolicyProfileListServicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListServicesPageAsync>>

        /** @see listServices */
        fun listServices(
            params: TrafficPolicyProfileListServicesParams =
                TrafficPolicyProfileListServicesParams.none()
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListServicesPageAsync>> =
            listServices(params, RequestOptions.none())

        /** @see listServices */
        fun listServices(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TrafficPolicyProfileListServicesPageAsync>> =
            listServices(TrafficPolicyProfileListServicesParams.none(), requestOptions)
    }
}
