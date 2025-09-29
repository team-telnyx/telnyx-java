// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectCreateParams
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectCreateResponse
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectDeleteParams
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectDeleteResponse
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectListParams
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectListResponse
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectRetrieveParams
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectRetrieveResponse
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectUpdateParams
import com.telnyx.api.models.virtualcrossconnects.VirtualCrossConnectUpdateResponse
import java.util.function.Consumer

interface VirtualCrossConnectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VirtualCrossConnectService

    /**
     * Create a new Virtual Cross Connect.<br /><br />For AWS and GCE, you have the option of
     * creating the primary connection first and the secondary connection later. You also have the
     * option of disabling the primary and/or secondary connections at any time and later
     * re-enabling them. With Azure, you do not have this option. Azure requires both the primary
     * and secondary connections to be created at the same time and they can not be independantly
     * disabled.
     */
    fun create(params: VirtualCrossConnectCreateParams): VirtualCrossConnectCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VirtualCrossConnectCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectCreateResponse

    /** Retrieve a Virtual Cross Connect. */
    fun retrieve(id: String): VirtualCrossConnectRetrieveResponse =
        retrieve(id, VirtualCrossConnectRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
    ): VirtualCrossConnectRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VirtualCrossConnectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VirtualCrossConnectRetrieveParams): VirtualCrossConnectRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VirtualCrossConnectRetrieveResponse =
        retrieve(id, VirtualCrossConnectRetrieveParams.none(), requestOptions)

    /**
     * Update the Virtual Cross Connect.<br /><br />Cloud IPs can only be patched during the
     * `created` state, as GCE will only inform you of your generated IP once the pending connection
     * requested has been accepted. Once the Virtual Cross Connect has moved to `provisioning`, the
     * IPs can no longer be patched.<br /><br />Once the Virtual Cross Connect has moved to
     * `provisioned` and you are ready to enable routing, you can toggle the routing announcements
     * to `true`.
     */
    fun update(id: String): VirtualCrossConnectUpdateResponse =
        update(id, VirtualCrossConnectUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
    ): VirtualCrossConnectUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VirtualCrossConnectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectUpdateResponse

    /** @see update */
    fun update(params: VirtualCrossConnectUpdateParams): VirtualCrossConnectUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): VirtualCrossConnectUpdateResponse =
        update(id, VirtualCrossConnectUpdateParams.none(), requestOptions)

    /** List all Virtual Cross Connects. */
    fun list(): VirtualCrossConnectListResponse = list(VirtualCrossConnectListParams.none())

    /** @see list */
    fun list(
        params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectListResponse

    /** @see list */
    fun list(
        params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none()
    ): VirtualCrossConnectListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VirtualCrossConnectListResponse =
        list(VirtualCrossConnectListParams.none(), requestOptions)

    /** Delete a Virtual Cross Connect. */
    fun delete(id: String): VirtualCrossConnectDeleteResponse =
        delete(id, VirtualCrossConnectDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
    ): VirtualCrossConnectDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VirtualCrossConnectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VirtualCrossConnectDeleteResponse

    /** @see delete */
    fun delete(params: VirtualCrossConnectDeleteParams): VirtualCrossConnectDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): VirtualCrossConnectDeleteResponse =
        delete(id, VirtualCrossConnectDeleteParams.none(), requestOptions)

    /**
     * A view of [VirtualCrossConnectService] that provides access to raw HTTP responses for each
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
        ): VirtualCrossConnectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /virtual_cross_connects`, but is otherwise the same
         * as [VirtualCrossConnectService.create].
         */
        @MustBeClosed
        fun create(
            params: VirtualCrossConnectCreateParams
        ): HttpResponseFor<VirtualCrossConnectCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VirtualCrossConnectCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectCreateResponse>

        /**
         * Returns a raw HTTP response for `get /virtual_cross_connects/{id}`, but is otherwise the
         * same as [VirtualCrossConnectService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VirtualCrossConnectRetrieveResponse> =
            retrieve(id, VirtualCrossConnectRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VirtualCrossConnectRetrieveParams = VirtualCrossConnectRetrieveParams.none(),
        ): HttpResponseFor<VirtualCrossConnectRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VirtualCrossConnectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VirtualCrossConnectRetrieveParams
        ): HttpResponseFor<VirtualCrossConnectRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualCrossConnectRetrieveResponse> =
            retrieve(id, VirtualCrossConnectRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /virtual_cross_connects/{id}`, but is otherwise
         * the same as [VirtualCrossConnectService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<VirtualCrossConnectUpdateResponse> =
            update(id, VirtualCrossConnectUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VirtualCrossConnectUpdateParams = VirtualCrossConnectUpdateParams.none(),
        ): HttpResponseFor<VirtualCrossConnectUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VirtualCrossConnectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: VirtualCrossConnectUpdateParams
        ): HttpResponseFor<VirtualCrossConnectUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualCrossConnectUpdateResponse> =
            update(id, VirtualCrossConnectUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /virtual_cross_connects`, but is otherwise the same
         * as [VirtualCrossConnectService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VirtualCrossConnectListResponse> =
            list(VirtualCrossConnectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VirtualCrossConnectListParams = VirtualCrossConnectListParams.none()
        ): HttpResponseFor<VirtualCrossConnectListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VirtualCrossConnectListResponse> =
            list(VirtualCrossConnectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /virtual_cross_connects/{id}`, but is otherwise
         * the same as [VirtualCrossConnectService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<VirtualCrossConnectDeleteResponse> =
            delete(id, VirtualCrossConnectDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VirtualCrossConnectDeleteParams = VirtualCrossConnectDeleteParams.none(),
        ): HttpResponseFor<VirtualCrossConnectDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VirtualCrossConnectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VirtualCrossConnectDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VirtualCrossConnectDeleteParams
        ): HttpResponseFor<VirtualCrossConnectDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualCrossConnectDeleteResponse> =
            delete(id, VirtualCrossConnectDeleteParams.none(), requestOptions)
    }
}
