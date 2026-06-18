// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.userdata.UserDataRetrieveParams
import com.telnyx.sdk.models.whatsapp.userdata.UserDataRetrieveResponse
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateParams
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp business accounts */
interface UserDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserDataServiceAsync

    /** Fetch Whatsapp user data */
    fun retrieve(): CompletableFuture<UserDataRetrieveResponse> =
        retrieve(UserDataRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: UserDataRetrieveParams = UserDataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserDataRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: UserDataRetrieveParams = UserDataRetrieveParams.none()
    ): CompletableFuture<UserDataRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<UserDataRetrieveResponse> =
        retrieve(UserDataRetrieveParams.none(), requestOptions)

    /** Update Whatsapp user data */
    fun update(): CompletableFuture<UserDataUpdateResponse> = update(UserDataUpdateParams.none())

    /** @see update */
    fun update(
        params: UserDataUpdateParams = UserDataUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserDataUpdateResponse>

    /** @see update */
    fun update(
        params: UserDataUpdateParams = UserDataUpdateParams.none()
    ): CompletableFuture<UserDataUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): CompletableFuture<UserDataUpdateResponse> =
        update(UserDataUpdateParams.none(), requestOptions)

    /**
     * A view of [UserDataServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserDataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/user_data`, but is otherwise the same
         * as [UserDataServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<UserDataRetrieveResponse>> =
            retrieve(UserDataRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: UserDataRetrieveParams = UserDataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserDataRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UserDataRetrieveParams = UserDataRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<UserDataRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserDataRetrieveResponse>> =
            retrieve(UserDataRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp/user_data`, but is otherwise the same
         * as [UserDataServiceAsync.update].
         */
        fun update(): CompletableFuture<HttpResponseFor<UserDataUpdateResponse>> =
            update(UserDataUpdateParams.none())

        /** @see update */
        fun update(
            params: UserDataUpdateParams = UserDataUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserDataUpdateResponse>>

        /** @see update */
        fun update(
            params: UserDataUpdateParams = UserDataUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<UserDataUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserDataUpdateResponse>> =
            update(UserDataUpdateParams.none(), requestOptions)
    }
}
