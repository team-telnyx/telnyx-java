// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.useraddresses.UserAddressCreateParams
import com.telnyx.sdk.models.useraddresses.UserAddressCreateResponse
import com.telnyx.sdk.models.useraddresses.UserAddressListPageAsync
import com.telnyx.sdk.models.useraddresses.UserAddressListParams
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveParams
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserAddressServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserAddressServiceAsync

    /** Creates a user address. */
    fun create(params: UserAddressCreateParams): CompletableFuture<UserAddressCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UserAddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddressCreateResponse>

    /** Retrieves the details of an existing user address. */
    fun retrieve(id: String): CompletableFuture<UserAddressRetrieveResponse> =
        retrieve(id, UserAddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddressRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
    ): CompletableFuture<UserAddressRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddressRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: UserAddressRetrieveParams
    ): CompletableFuture<UserAddressRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserAddressRetrieveResponse> =
        retrieve(id, UserAddressRetrieveParams.none(), requestOptions)

    /** Returns a list of your user addresses. */
    fun list(): CompletableFuture<UserAddressListPageAsync> = list(UserAddressListParams.none())

    /** @see list */
    fun list(
        params: UserAddressListParams = UserAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserAddressListPageAsync>

    /** @see list */
    fun list(
        params: UserAddressListParams = UserAddressListParams.none()
    ): CompletableFuture<UserAddressListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserAddressListPageAsync> =
        list(UserAddressListParams.none(), requestOptions)

    /**
     * A view of [UserAddressServiceAsync] that provides access to raw HTTP responses for each
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
        ): UserAddressServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user_addresses`, but is otherwise the same as
         * [UserAddressServiceAsync.create].
         */
        fun create(
            params: UserAddressCreateParams
        ): CompletableFuture<HttpResponseFor<UserAddressCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UserAddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddressCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /user_addresses/{id}`, but is otherwise the same as
         * [UserAddressServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<UserAddressRetrieveResponse>> =
            retrieve(id, UserAddressRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddressRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UserAddressRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UserAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddressRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UserAddressRetrieveParams
        ): CompletableFuture<HttpResponseFor<UserAddressRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserAddressRetrieveResponse>> =
            retrieve(id, UserAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user_addresses`, but is otherwise the same as
         * [UserAddressServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserAddressListPageAsync>> =
            list(UserAddressListParams.none())

        /** @see list */
        fun list(
            params: UserAddressListParams = UserAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserAddressListPageAsync>>

        /** @see list */
        fun list(
            params: UserAddressListParams = UserAddressListParams.none()
        ): CompletableFuture<HttpResponseFor<UserAddressListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserAddressListPageAsync>> =
            list(UserAddressListParams.none(), requestOptions)
    }
}
