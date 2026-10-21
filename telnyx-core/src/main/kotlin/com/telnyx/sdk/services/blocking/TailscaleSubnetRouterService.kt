// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterDeleteParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterDeleteResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterListPage
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterListParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterRetrieveParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterRetrieveResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateResponse
import java.util.function.Consumer

/** Tailscale Subnet Router operations */
interface TailscaleSubnetRouterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TailscaleSubnetRouterService

    /**
     * Creates a Tailscale Subnet Router on a Network and enrolls it in the user's tailnet with the
     * auth key. The response returns the router with `status` `provisioning`. Poll `GET
     * /tailscale_subnet_routers/{id}` until it is `provisioned`. Then approve its routes in the
     * tailnet, unless an auto-approver covers them.
     */
    fun create(params: TailscaleSubnetRouterCreateParams): TailscaleSubnetRouterCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TailscaleSubnetRouterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterCreateResponse

    /**
     * Returns the details of a single Tailscale Subnet Router by its identifier, including its
     * enrollment state.
     */
    fun retrieve(id: String): TailscaleSubnetRouterRetrieveResponse =
        retrieve(id, TailscaleSubnetRouterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TailscaleSubnetRouterRetrieveParams = TailscaleSubnetRouterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TailscaleSubnetRouterRetrieveParams = TailscaleSubnetRouterRetrieveParams.none(),
    ): TailscaleSubnetRouterRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TailscaleSubnetRouterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: TailscaleSubnetRouterRetrieveParams
    ): TailscaleSubnetRouterRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): TailscaleSubnetRouterRetrieveResponse =
        retrieve(id, TailscaleSubnetRouterRetrieveParams.none(), requestOptions)

    /**
     * Renames the router, changes its advertised routes, or retries a failed enrollment. Any change
     * queues a new provisioning run and returns the router with `status` `provisioning`. The router
     * keeps its machine identity on the tailnet. Send an empty object to retry a `failed` router
     * with its stored auth key. Include a new `auth_key` only while the router has never enrolled.
     * The router's Network and region cannot change: create a new router instead.
     */
    fun update(id: String): TailscaleSubnetRouterUpdateResponse =
        update(id, TailscaleSubnetRouterUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
    ): TailscaleSubnetRouterUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TailscaleSubnetRouterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterUpdateResponse

    /** @see update */
    fun update(params: TailscaleSubnetRouterUpdateParams): TailscaleSubnetRouterUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): TailscaleSubnetRouterUpdateResponse =
        update(id, TailscaleSubnetRouterUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of the Tailscale Subnet Routers on the account, with support for
     * filtering by Network.
     */
    fun list(): TailscaleSubnetRouterListPage = list(TailscaleSubnetRouterListParams.none())

    /** @see list */
    fun list(
        params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterListPage

    /** @see list */
    fun list(
        params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none()
    ): TailscaleSubnetRouterListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TailscaleSubnetRouterListPage =
        list(TailscaleSubnetRouterListParams.none(), requestOptions)

    /**
     * Removes the router from the Network and logs it out of the tailnet. The response returns the
     * router with `status` `deleting`. The record disappears once removal completes. A machine
     * entry can remain in the tailnet's admin console until it is removed there.
     */
    fun delete(id: String): TailscaleSubnetRouterDeleteResponse =
        delete(id, TailscaleSubnetRouterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
    ): TailscaleSubnetRouterDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TailscaleSubnetRouterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TailscaleSubnetRouterDeleteResponse

    /** @see delete */
    fun delete(params: TailscaleSubnetRouterDeleteParams): TailscaleSubnetRouterDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): TailscaleSubnetRouterDeleteResponse =
        delete(id, TailscaleSubnetRouterDeleteParams.none(), requestOptions)

    /**
     * A view of [TailscaleSubnetRouterService] that provides access to raw HTTP responses for each
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
        ): TailscaleSubnetRouterService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tailscale_subnet_routers`, but is otherwise the
         * same as [TailscaleSubnetRouterService.create].
         */
        @MustBeClosed
        fun create(
            params: TailscaleSubnetRouterCreateParams
        ): HttpResponseFor<TailscaleSubnetRouterCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TailscaleSubnetRouterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterCreateResponse>

        /**
         * Returns a raw HTTP response for `get /tailscale_subnet_routers/{id}`, but is otherwise
         * the same as [TailscaleSubnetRouterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TailscaleSubnetRouterRetrieveResponse> =
            retrieve(id, TailscaleSubnetRouterRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TailscaleSubnetRouterRetrieveParams =
                TailscaleSubnetRouterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TailscaleSubnetRouterRetrieveParams = TailscaleSubnetRouterRetrieveParams.none(),
        ): HttpResponseFor<TailscaleSubnetRouterRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TailscaleSubnetRouterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TailscaleSubnetRouterRetrieveParams
        ): HttpResponseFor<TailscaleSubnetRouterRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TailscaleSubnetRouterRetrieveResponse> =
            retrieve(id, TailscaleSubnetRouterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /tailscale_subnet_routers/{id}`, but is otherwise
         * the same as [TailscaleSubnetRouterService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<TailscaleSubnetRouterUpdateResponse> =
            update(id, TailscaleSubnetRouterUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
        ): HttpResponseFor<TailscaleSubnetRouterUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TailscaleSubnetRouterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: TailscaleSubnetRouterUpdateParams
        ): HttpResponseFor<TailscaleSubnetRouterUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TailscaleSubnetRouterUpdateResponse> =
            update(id, TailscaleSubnetRouterUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tailscale_subnet_routers`, but is otherwise the
         * same as [TailscaleSubnetRouterService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TailscaleSubnetRouterListPage> =
            list(TailscaleSubnetRouterListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none()
        ): HttpResponseFor<TailscaleSubnetRouterListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TailscaleSubnetRouterListPage> =
            list(TailscaleSubnetRouterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /tailscale_subnet_routers/{id}`, but is otherwise
         * the same as [TailscaleSubnetRouterService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<TailscaleSubnetRouterDeleteResponse> =
            delete(id, TailscaleSubnetRouterDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
        ): HttpResponseFor<TailscaleSubnetRouterDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TailscaleSubnetRouterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TailscaleSubnetRouterDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TailscaleSubnetRouterDeleteParams
        ): HttpResponseFor<TailscaleSubnetRouterDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TailscaleSubnetRouterDeleteResponse> =
            delete(id, TailscaleSubnetRouterDeleteParams.none(), requestOptions)
    }
}
