// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileCreateResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileDeleteParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileDeleteResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListPage
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListServicesPage
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileListServicesParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileRetrieveParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileRetrieveResponse
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateParams
import com.telnyx.sdk.models.trafficpolicyprofiles.TrafficPolicyProfileUpdateResponse
import java.util.function.Consumer

/** Traffic Policy Profiles operations */
interface TrafficPolicyProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TrafficPolicyProfileService

    /**
     * Create a new traffic policy profile. At least one of `services`, `ip_ranges`, or `domains`
     * must be provided.
     */
    fun create(params: TrafficPolicyProfileCreateParams): TrafficPolicyProfileCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TrafficPolicyProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileCreateResponse

    /** Returns the details regarding a specific traffic policy profile. */
    fun retrieve(id: String): TrafficPolicyProfileRetrieveResponse =
        retrieve(id, TrafficPolicyProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
    ): TrafficPolicyProfileRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TrafficPolicyProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TrafficPolicyProfileRetrieveParams): TrafficPolicyProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TrafficPolicyProfileRetrieveResponse =
        retrieve(id, TrafficPolicyProfileRetrieveParams.none(), requestOptions)

    /** Updates a traffic policy profile. */
    fun update(id: String): TrafficPolicyProfileUpdateResponse =
        update(id, TrafficPolicyProfileUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
    ): TrafficPolicyProfileUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TrafficPolicyProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileUpdateResponse

    /** @see update */
    fun update(params: TrafficPolicyProfileUpdateParams): TrafficPolicyProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): TrafficPolicyProfileUpdateResponse =
        update(id, TrafficPolicyProfileUpdateParams.none(), requestOptions)

    /** Get all traffic policy profiles belonging to the user that match the given filters. */
    fun list(): TrafficPolicyProfileListPage = list(TrafficPolicyProfileListParams.none())

    /** @see list */
    fun list(
        params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileListPage

    /** @see list */
    fun list(
        params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none()
    ): TrafficPolicyProfileListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TrafficPolicyProfileListPage =
        list(TrafficPolicyProfileListParams.none(), requestOptions)

    /** Deletes the traffic policy profile. */
    fun delete(id: String): TrafficPolicyProfileDeleteResponse =
        delete(id, TrafficPolicyProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
    ): TrafficPolicyProfileDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TrafficPolicyProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileDeleteResponse

    /** @see delete */
    fun delete(params: TrafficPolicyProfileDeleteParams): TrafficPolicyProfileDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): TrafficPolicyProfileDeleteResponse =
        delete(id, TrafficPolicyProfileDeleteParams.none(), requestOptions)

    /** Get all available PCEF services that can be used in traffic policy profiles. */
    fun listServices(): TrafficPolicyProfileListServicesPage =
        listServices(TrafficPolicyProfileListServicesParams.none())

    /** @see listServices */
    fun listServices(
        params: TrafficPolicyProfileListServicesParams =
            TrafficPolicyProfileListServicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TrafficPolicyProfileListServicesPage

    /** @see listServices */
    fun listServices(
        params: TrafficPolicyProfileListServicesParams =
            TrafficPolicyProfileListServicesParams.none()
    ): TrafficPolicyProfileListServicesPage = listServices(params, RequestOptions.none())

    /** @see listServices */
    fun listServices(requestOptions: RequestOptions): TrafficPolicyProfileListServicesPage =
        listServices(TrafficPolicyProfileListServicesParams.none(), requestOptions)

    /**
     * A view of [TrafficPolicyProfileService] that provides access to raw HTTP responses for each
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
        ): TrafficPolicyProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /traffic_policy_profiles`, but is otherwise the
         * same as [TrafficPolicyProfileService.create].
         */
        @MustBeClosed
        fun create(
            params: TrafficPolicyProfileCreateParams
        ): HttpResponseFor<TrafficPolicyProfileCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TrafficPolicyProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileCreateResponse>

        /**
         * Returns a raw HTTP response for `get /traffic_policy_profiles/{id}`, but is otherwise the
         * same as [TrafficPolicyProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TrafficPolicyProfileRetrieveResponse> =
            retrieve(id, TrafficPolicyProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TrafficPolicyProfileRetrieveParams = TrafficPolicyProfileRetrieveParams.none(),
        ): HttpResponseFor<TrafficPolicyProfileRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TrafficPolicyProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TrafficPolicyProfileRetrieveParams
        ): HttpResponseFor<TrafficPolicyProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrafficPolicyProfileRetrieveResponse> =
            retrieve(id, TrafficPolicyProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /traffic_policy_profiles/{id}`, but is otherwise
         * the same as [TrafficPolicyProfileService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<TrafficPolicyProfileUpdateResponse> =
            update(id, TrafficPolicyProfileUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TrafficPolicyProfileUpdateParams = TrafficPolicyProfileUpdateParams.none(),
        ): HttpResponseFor<TrafficPolicyProfileUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TrafficPolicyProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: TrafficPolicyProfileUpdateParams
        ): HttpResponseFor<TrafficPolicyProfileUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrafficPolicyProfileUpdateResponse> =
            update(id, TrafficPolicyProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /traffic_policy_profiles`, but is otherwise the same
         * as [TrafficPolicyProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TrafficPolicyProfileListPage> =
            list(TrafficPolicyProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TrafficPolicyProfileListParams = TrafficPolicyProfileListParams.none()
        ): HttpResponseFor<TrafficPolicyProfileListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TrafficPolicyProfileListPage> =
            list(TrafficPolicyProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /traffic_policy_profiles/{id}`, but is otherwise
         * the same as [TrafficPolicyProfileService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<TrafficPolicyProfileDeleteResponse> =
            delete(id, TrafficPolicyProfileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TrafficPolicyProfileDeleteParams = TrafficPolicyProfileDeleteParams.none(),
        ): HttpResponseFor<TrafficPolicyProfileDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TrafficPolicyProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TrafficPolicyProfileDeleteParams
        ): HttpResponseFor<TrafficPolicyProfileDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TrafficPolicyProfileDeleteResponse> =
            delete(id, TrafficPolicyProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /traffic_policy_profiles/services`, but is otherwise
         * the same as [TrafficPolicyProfileService.listServices].
         */
        @MustBeClosed
        fun listServices(): HttpResponseFor<TrafficPolicyProfileListServicesPage> =
            listServices(TrafficPolicyProfileListServicesParams.none())

        /** @see listServices */
        @MustBeClosed
        fun listServices(
            params: TrafficPolicyProfileListServicesParams =
                TrafficPolicyProfileListServicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TrafficPolicyProfileListServicesPage>

        /** @see listServices */
        @MustBeClosed
        fun listServices(
            params: TrafficPolicyProfileListServicesParams =
                TrafficPolicyProfileListServicesParams.none()
        ): HttpResponseFor<TrafficPolicyProfileListServicesPage> =
            listServices(params, RequestOptions.none())

        /** @see listServices */
        @MustBeClosed
        fun listServices(
            requestOptions: RequestOptions
        ): HttpResponseFor<TrafficPolicyProfileListServicesPage> =
            listServices(TrafficPolicyProfileListServicesParams.none(), requestOptions)
    }
}
