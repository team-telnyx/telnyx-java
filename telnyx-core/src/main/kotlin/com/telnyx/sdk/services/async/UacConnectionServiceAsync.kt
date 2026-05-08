// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteParams
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionListPageAsync
import com.telnyx.sdk.models.uacconnections.UacConnectionListParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateResponse
import com.telnyx.sdk.services.async.uacconnections.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** UAC connection operations */
interface UacConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UacConnectionServiceAsync

    /** UAC connection operations */
    fun actions(): ActionServiceAsync

    /**
     * Creates a UAC connection. A UAC (User Agent Client) Connection registers Telnyx to your PBX —
     * the opposite of a standard SIP trunk, where the PBX registers to Telnyx. Use UAC when your
     * PBX doesn’t support outbound SIP registration or you need Telnyx to maintain the
     * registration.
     */
    fun create(params: UacConnectionCreateParams): CompletableFuture<UacConnectionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UacConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionCreateResponse>

    /** Retrieves the details of an existing UAC connection. */
    fun retrieve(id: String): CompletableFuture<UacConnectionRetrieveResponse> =
        retrieve(id, UacConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
    ): CompletableFuture<UacConnectionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UacConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: UacConnectionRetrieveParams
    ): CompletableFuture<UacConnectionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionRetrieveResponse> =
        retrieve(id, UacConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing UAC connection. */
    fun update(id: String): CompletableFuture<UacConnectionUpdateResponse> =
        update(id, UacConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
    ): CompletableFuture<UacConnectionUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UacConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionUpdateResponse>

    /** @see update */
    fun update(params: UacConnectionUpdateParams): CompletableFuture<UacConnectionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionUpdateResponse> =
        update(id, UacConnectionUpdateParams.none(), requestOptions)

    /**
     * Returns a list of your UAC connections. A UAC (User Agent Client) Connection registers Telnyx
     * to your PBX — the opposite of a standard SIP trunk, where the PBX registers to Telnyx. Use
     * UAC when your PBX doesn’t support outbound SIP registration or you need Telnyx to maintain
     * the registration.
     */
    fun list(): CompletableFuture<UacConnectionListPageAsync> = list(UacConnectionListParams.none())

    /** @see list */
    fun list(
        params: UacConnectionListParams = UacConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionListPageAsync>

    /** @see list */
    fun list(
        params: UacConnectionListParams = UacConnectionListParams.none()
    ): CompletableFuture<UacConnectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UacConnectionListPageAsync> =
        list(UacConnectionListParams.none(), requestOptions)

    /** Deletes an existing UAC connection. */
    fun delete(id: String): CompletableFuture<UacConnectionDeleteResponse> =
        delete(id, UacConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
    ): CompletableFuture<UacConnectionDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UacConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UacConnectionDeleteResponse>

    /** @see delete */
    fun delete(params: UacConnectionDeleteParams): CompletableFuture<UacConnectionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionDeleteResponse> =
        delete(id, UacConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [UacConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): UacConnectionServiceAsync.WithRawResponse

        /** UAC connection operations */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /uac_connections`, but is otherwise the same as
         * [UacConnectionServiceAsync.create].
         */
        fun create(
            params: UacConnectionCreateParams
        ): CompletableFuture<HttpResponseFor<UacConnectionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UacConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /uac_connections/{id}`, but is otherwise the same as
         * [UacConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<UacConnectionRetrieveResponse>> =
            retrieve(id, UacConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UacConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UacConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<UacConnectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionRetrieveResponse>> =
            retrieve(id, UacConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /uac_connections/{id}`, but is otherwise the same
         * as [UacConnectionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<UacConnectionUpdateResponse>> =
            update(id, UacConnectionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: UacConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionUpdateResponse>>

        /** @see update */
        fun update(
            params: UacConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<UacConnectionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionUpdateResponse>> =
            update(id, UacConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /uac_connections`, but is otherwise the same as
         * [UacConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UacConnectionListPageAsync>> =
            list(UacConnectionListParams.none())

        /** @see list */
        fun list(
            params: UacConnectionListParams = UacConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionListPageAsync>>

        /** @see list */
        fun list(
            params: UacConnectionListParams = UacConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<UacConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UacConnectionListPageAsync>> =
            list(UacConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /uac_connections/{id}`, but is otherwise the same
         * as [UacConnectionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<UacConnectionDeleteResponse>> =
            delete(id, UacConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: UacConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UacConnectionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: UacConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<UacConnectionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionDeleteResponse>> =
            delete(id, UacConnectionDeleteParams.none(), requestOptions)
    }
}
