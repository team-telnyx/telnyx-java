// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.addresses.AddressCreateParams
import com.telnyx.api.models.addresses.AddressCreateResponse
import com.telnyx.api.models.addresses.AddressDeleteParams
import com.telnyx.api.models.addresses.AddressDeleteResponse
import com.telnyx.api.models.addresses.AddressListParams
import com.telnyx.api.models.addresses.AddressListResponse
import com.telnyx.api.models.addresses.AddressRetrieveParams
import com.telnyx.api.models.addresses.AddressRetrieveResponse
import com.telnyx.api.services.async.addresses.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressServiceAsync

    fun actions(): ActionServiceAsync

    /** Creates an address. */
    fun create(params: AddressCreateParams): CompletableFuture<AddressCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressCreateResponse>

    /** Retrieves the details of an existing address. */
    fun retrieve(id: String): CompletableFuture<AddressRetrieveResponse> =
        retrieve(id, AddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
    ): CompletableFuture<AddressRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AddressRetrieveParams): CompletableFuture<AddressRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressRetrieveResponse> =
        retrieve(id, AddressRetrieveParams.none(), requestOptions)

    /** Returns a list of your addresses. */
    fun list(): CompletableFuture<AddressListResponse> = list(AddressListParams.none())

    /** @see list */
    fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressListResponse>

    /** @see list */
    fun list(
        params: AddressListParams = AddressListParams.none()
    ): CompletableFuture<AddressListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AddressListResponse> =
        list(AddressListParams.none(), requestOptions)

    /** Deletes an existing address. */
    fun delete(id: String): CompletableFuture<AddressDeleteResponse> =
        delete(id, AddressDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
    ): CompletableFuture<AddressDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddressDeleteResponse>

    /** @see delete */
    fun delete(params: AddressDeleteParams): CompletableFuture<AddressDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressDeleteResponse> =
        delete(id, AddressDeleteParams.none(), requestOptions)

    /**
     * A view of [AddressServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddressServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /addresses`, but is otherwise the same as
         * [AddressServiceAsync.create].
         */
        fun create(
            params: AddressCreateParams
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /addresses/{id}`, but is otherwise the same as
         * [AddressServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(id, AddressRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AddressRetrieveParams
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> =
            retrieve(id, AddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /addresses`, but is otherwise the same as
         * [AddressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(AddressListParams.none())

        /** @see list */
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressListResponse>>

        /** @see list */
        fun list(
            params: AddressListParams = AddressListParams.none()
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /addresses/{id}`, but is otherwise the same as
         * [AddressServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(id, AddressDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AddressDeleteParams
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> =
            delete(id, AddressDeleteParams.none(), requestOptions)
    }
}
