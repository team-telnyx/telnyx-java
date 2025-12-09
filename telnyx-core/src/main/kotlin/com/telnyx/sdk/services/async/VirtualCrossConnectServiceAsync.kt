// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectCreateParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectCreateResponse
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectDeleteParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectDeleteResponse
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectListPageAsync
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectListParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectRetrieveParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectRetrieveResponse
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectUpdateParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VirtualCrossConnectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VirtualCrossConnectServiceAsync

    /**
     * Create a new Virtual Cross Connect.<br /><br />For AWS and GCE, you have the option of
     * creating the primary connection first and the secondary connection later. You also have the
     * option of disabling the primary and/or secondary connections at any time and later
     * re-enabling them. With Azure, you do not have this option. Azure requires both the primary
     * and secondary connections to be created at the same time and they can not be independantly
     * disabled.
     */
    fun create(): CompletableFuture<VirtualCrossConnectCreateResponse> =
        create(VirtualCrossConnectCreateParams.none())

    /** @see create */
    fun create(
        params: VirtualCrossConnectCreateParams = VirtualCrossConnectCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectCreateResponse>

    /** @see create */
    fun create(
        params: VirtualCrossConnectCreateParams = VirtualCrossConnectCreateParams.none()
    ): CompletableFuture<VirtualCrossConnectCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualCrossConnectCreateResponse> =
        create(VirtualCrossConnectCreateParams.none(), requestOptions)

    /** Retrieve a Virtual Cross Connect. */
    fun retrieve(id: String): CompletableFuture<VirtualCrossConnectRetrieveResponse> =
        retrieve(id, VirtualCrossConnectRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
    ): CompletableFuture<VirtualCrossConnectRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VirtualCrossConnectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: VirtualCrossConnectRetrieveParams
    ): CompletableFuture<VirtualCrossConnectRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectRetrieveResponse> =
        retrieve(id, VirtualCrossConnectRetrieveParams.none(), requestOptions)

    /**
     * Update the Virtual Cross Connect.<br /><br />Cloud IPs can only be patched during the
     * `created` state, as GCE will only inform you of your generated IP once the pending connection
     * requested has been accepted. Once the Virtual Cross Connect has moved to `provisioning`, the
     * IPs can no longer be patched.<br /><br />Once the Virtual Cross Connect has moved to
     * `provisioned` and you are ready to enable routing, you can toggle the routing announcements
     * to `true`.
     */
    fun update(id: String): CompletableFuture<VirtualCrossConnectUpdateResponse> =
        update(id, VirtualCrossConnectUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
    ): CompletableFuture<VirtualCrossConnectUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VirtualCrossConnectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectUpdateResponse>

    /** @see update */
    fun update(
        params: VirtualCrossConnectUpdateParams
    ): CompletableFuture<VirtualCrossConnectUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectUpdateResponse> =
        update(id, VirtualCrossConnectUpdateParams.none(), requestOptions)

    /** List all Virtual Cross Connects. */
    fun list(): CompletableFuture<VirtualCrossConnectListPageAsync> =
        list(VirtualCrossConnectListParams.none())

    /** @see list */
    fun list(
        params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectListPageAsync>

    /** @see list */
    fun list(
        params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none()
    ): CompletableFuture<VirtualCrossConnectListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VirtualCrossConnectListPageAsync> =
        list(VirtualCrossConnectListParams.none(), requestOptions)

    /** Delete a Virtual Cross Connect. */
    fun delete(id: String): CompletableFuture<VirtualCrossConnectDeleteResponse> =
        delete(id, VirtualCrossConnectDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
    ): CompletableFuture<VirtualCrossConnectDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VirtualCrossConnectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualCrossConnectDeleteResponse>

    /** @see delete */
    fun delete(
        params: VirtualCrossConnectDeleteParams
    ): CompletableFuture<VirtualCrossConnectDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectDeleteResponse> =
        delete(id, VirtualCrossConnectDeleteParams.none(), requestOptions)

    /**
     * A view of [VirtualCrossConnectServiceAsync] that provides access to raw HTTP responses for
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
        ): VirtualCrossConnectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /virtual_cross_connects`, but is otherwise the same
         * as [VirtualCrossConnectServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<VirtualCrossConnectCreateResponse>> =
            create(VirtualCrossConnectCreateParams.none())

        /** @see create */
        fun create(
            params: VirtualCrossConnectCreateParams = VirtualCrossConnectCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectCreateResponse>>

        /** @see create */
        fun create(
            params: VirtualCrossConnectCreateParams = VirtualCrossConnectCreateParams.none()
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectCreateResponse>> =
            create(VirtualCrossConnectCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /virtual_cross_connects/{id}`, but is otherwise the
         * same as [VirtualCrossConnectServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectRetrieveResponse>> =
            retrieve(id, VirtualCrossConnectRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VirtualCrossConnectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VirtualCrossConnectRetrieveParams
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectRetrieveResponse>> =
            retrieve(id, VirtualCrossConnectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /virtual_cross_connects/{id}`, but is otherwise
         * the same as [VirtualCrossConnectServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectUpdateResponse>> =
            update(id, VirtualCrossConnectUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VirtualCrossConnectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectUpdateResponse>>

        /** @see update */
        fun update(
            params: VirtualCrossConnectUpdateParams
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectUpdateResponse>> =
            update(id, VirtualCrossConnectUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /virtual_cross_connects`, but is otherwise the same
         * as [VirtualCrossConnectServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VirtualCrossConnectListPageAsync>> =
            list(VirtualCrossConnectListParams.none())

        /** @see list */
        fun list(
            params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectListPageAsync>>

        /** @see list */
        fun list(
            params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none()
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectListPageAsync>> =
            list(VirtualCrossConnectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /virtual_cross_connects/{id}`, but is otherwise
         * the same as [VirtualCrossConnectServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectDeleteResponse>> =
            delete(id, VirtualCrossConnectDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VirtualCrossConnectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectDeleteResponse>>

        /** @see delete */
        fun delete(
            params: VirtualCrossConnectDeleteParams
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectDeleteResponse>> =
            delete(id, VirtualCrossConnectDeleteParams.none(), requestOptions)
    }
}
