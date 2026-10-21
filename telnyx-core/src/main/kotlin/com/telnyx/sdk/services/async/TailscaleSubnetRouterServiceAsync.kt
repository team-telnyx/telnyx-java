// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterDeleteParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterDeleteResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterListPageAsync
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterListParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterRetrieveParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterRetrieveResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Tailscale Subnet Router operations */
interface TailscaleSubnetRouterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TailscaleSubnetRouterServiceAsync

    /**
     * Creates a Tailscale Subnet Router on a Network and enrolls it in the user's tailnet with the
     * auth key. The response returns the router with `status` `provisioning`. Poll `GET
     * /tailscale_subnet_routers/{id}` until it is `provisioned`. Then approve its routes in the
     * tailnet, unless an auto-approver covers them.
     */
    fun create(
        params: TailscaleSubnetRouterCreateParams
    ): CompletableFuture<TailscaleSubnetRouterCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TailscaleSubnetRouterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterCreateResponse>

    /**
     * Returns the details of a single Tailscale Subnet Router by its identifier, including its
     * enrollment state.
     */
    fun retrieve(id: String): CompletableFuture<TailscaleSubnetRouterRetrieveResponse> =
        retrieve(id, TailscaleSubnetRouterRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TailscaleSubnetRouterRetrieveParams = TailscaleSubnetRouterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TailscaleSubnetRouterRetrieveParams = TailscaleSubnetRouterRetrieveParams.none(),
    ): CompletableFuture<TailscaleSubnetRouterRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TailscaleSubnetRouterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TailscaleSubnetRouterRetrieveParams
    ): CompletableFuture<TailscaleSubnetRouterRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterRetrieveResponse> =
        retrieve(id, TailscaleSubnetRouterRetrieveParams.none(), requestOptions)

    /**
     * Renames the router, changes its advertised routes, or retries a failed enrollment. Any change
     * queues a new provisioning run and returns the router with `status` `provisioning`. The router
     * keeps its machine identity on the tailnet. Send an empty object to retry a `failed` router
     * with its stored auth key. Include a new `auth_key` only while the router has never enrolled.
     * The router's Network and region cannot change: create a new router instead.
     */
    fun update(id: String): CompletableFuture<TailscaleSubnetRouterUpdateResponse> =
        update(id, TailscaleSubnetRouterUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
    ): CompletableFuture<TailscaleSubnetRouterUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TailscaleSubnetRouterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterUpdateResponse>

    /** @see update */
    fun update(
        params: TailscaleSubnetRouterUpdateParams
    ): CompletableFuture<TailscaleSubnetRouterUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterUpdateResponse> =
        update(id, TailscaleSubnetRouterUpdateParams.none(), requestOptions)

    /**
     * Returns a paginated list of the Tailscale Subnet Routers on the account, with support for
     * filtering by Network.
     */
    fun list(): CompletableFuture<TailscaleSubnetRouterListPageAsync> =
        list(TailscaleSubnetRouterListParams.none())

    /** @see list */
    fun list(
        params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterListPageAsync>

    /** @see list */
    fun list(
        params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none()
    ): CompletableFuture<TailscaleSubnetRouterListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<TailscaleSubnetRouterListPageAsync> =
        list(TailscaleSubnetRouterListParams.none(), requestOptions)

    /**
     * Removes the router from the Network and logs it out of the tailnet. The response returns the
     * router with `status` `deleting`. The record disappears once removal completes. A machine
     * entry can remain in the tailnet's admin console until it is removed there.
     */
    fun delete(id: String): CompletableFuture<TailscaleSubnetRouterDeleteResponse> =
        delete(id, TailscaleSubnetRouterDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
    ): CompletableFuture<TailscaleSubnetRouterDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TailscaleSubnetRouterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TailscaleSubnetRouterDeleteResponse>

    /** @see delete */
    fun delete(
        params: TailscaleSubnetRouterDeleteParams
    ): CompletableFuture<TailscaleSubnetRouterDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterDeleteResponse> =
        delete(id, TailscaleSubnetRouterDeleteParams.none(), requestOptions)

    /**
     * A view of [TailscaleSubnetRouterServiceAsync] that provides access to raw HTTP responses for
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
        ): TailscaleSubnetRouterServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tailscale_subnet_routers`, but is otherwise the
         * same as [TailscaleSubnetRouterServiceAsync.create].
         */
        fun create(
            params: TailscaleSubnetRouterCreateParams
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TailscaleSubnetRouterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /tailscale_subnet_routers/{id}`, but is otherwise
         * the same as [TailscaleSubnetRouterServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>> =
            retrieve(id, TailscaleSubnetRouterRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TailscaleSubnetRouterRetrieveParams =
                TailscaleSubnetRouterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TailscaleSubnetRouterRetrieveParams = TailscaleSubnetRouterRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TailscaleSubnetRouterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TailscaleSubnetRouterRetrieveParams
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>> =
            retrieve(id, TailscaleSubnetRouterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /tailscale_subnet_routers/{id}`, but is otherwise
         * the same as [TailscaleSubnetRouterServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterUpdateResponse>> =
            update(id, TailscaleSubnetRouterUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: TailscaleSubnetRouterUpdateParams = TailscaleSubnetRouterUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TailscaleSubnetRouterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterUpdateResponse>>

        /** @see update */
        fun update(
            params: TailscaleSubnetRouterUpdateParams
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterUpdateResponse>> =
            update(id, TailscaleSubnetRouterUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tailscale_subnet_routers`, but is otherwise the
         * same as [TailscaleSubnetRouterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterListPageAsync>> =
            list(TailscaleSubnetRouterListParams.none())

        /** @see list */
        fun list(
            params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterListPageAsync>>

        /** @see list */
        fun list(
            params: TailscaleSubnetRouterListParams = TailscaleSubnetRouterListParams.none()
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterListPageAsync>> =
            list(TailscaleSubnetRouterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /tailscale_subnet_routers/{id}`, but is otherwise
         * the same as [TailscaleSubnetRouterServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterDeleteResponse>> =
            delete(id, TailscaleSubnetRouterDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TailscaleSubnetRouterDeleteParams = TailscaleSubnetRouterDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TailscaleSubnetRouterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterDeleteResponse>>

        /** @see delete */
        fun delete(
            params: TailscaleSubnetRouterDeleteParams
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterDeleteResponse>> =
            delete(id, TailscaleSubnetRouterDeleteParams.none(), requestOptions)
    }
}
