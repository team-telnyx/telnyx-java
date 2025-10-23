// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.useraddresses.UserAddressCreateParams
import com.telnyx.sdk.models.useraddresses.UserAddressCreateResponse
import com.telnyx.sdk.models.useraddresses.UserAddressListParams
import com.telnyx.sdk.models.useraddresses.UserAddressListResponse
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveParams
import com.telnyx.sdk.models.useraddresses.UserAddressRetrieveResponse
import java.util.function.Consumer

interface UserAddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserAddressService

    /** Creates a user address. */
    fun create(params: UserAddressCreateParams): UserAddressCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UserAddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddressCreateResponse

    /** Retrieves the details of an existing user address. */
    fun retrieve(id: String): UserAddressRetrieveResponse =
        retrieve(id, UserAddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddressRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
    ): UserAddressRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserAddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddressRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: UserAddressRetrieveParams): UserAddressRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): UserAddressRetrieveResponse =
        retrieve(id, UserAddressRetrieveParams.none(), requestOptions)

    /** Returns a list of your user addresses. */
    fun list(): UserAddressListResponse = list(UserAddressListParams.none())

    /** @see list */
    fun list(
        params: UserAddressListParams = UserAddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserAddressListResponse

    /** @see list */
    fun list(
        params: UserAddressListParams = UserAddressListParams.none()
    ): UserAddressListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserAddressListResponse =
        list(UserAddressListParams.none(), requestOptions)

    /**
     * A view of [UserAddressService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserAddressService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user_addresses`, but is otherwise the same as
         * [UserAddressService.create].
         */
        @MustBeClosed
        fun create(params: UserAddressCreateParams): HttpResponseFor<UserAddressCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UserAddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddressCreateResponse>

        /**
         * Returns a raw HTTP response for `get /user_addresses/{id}`, but is otherwise the same as
         * [UserAddressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<UserAddressRetrieveResponse> =
            retrieve(id, UserAddressRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddressRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UserAddressRetrieveParams = UserAddressRetrieveParams.none(),
        ): HttpResponseFor<UserAddressRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserAddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddressRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserAddressRetrieveParams
        ): HttpResponseFor<UserAddressRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserAddressRetrieveResponse> =
            retrieve(id, UserAddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user_addresses`, but is otherwise the same as
         * [UserAddressService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UserAddressListResponse> = list(UserAddressListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserAddressListParams = UserAddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserAddressListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserAddressListParams = UserAddressListParams.none()
        ): HttpResponseFor<UserAddressListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserAddressListResponse> =
            list(UserAddressListParams.none(), requestOptions)
    }
}
