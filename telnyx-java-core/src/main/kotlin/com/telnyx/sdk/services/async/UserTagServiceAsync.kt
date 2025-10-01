// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.usertags.UserTagListParams
import com.telnyx.sdk.models.usertags.UserTagListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserTagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserTagServiceAsync

    /** List all user tags. */
    fun list(): CompletableFuture<UserTagListResponse> = list(UserTagListParams.none())

    /** @see list */
    fun list(
        params: UserTagListParams = UserTagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserTagListResponse>

    /** @see list */
    fun list(
        params: UserTagListParams = UserTagListParams.none()
    ): CompletableFuture<UserTagListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserTagListResponse> =
        list(UserTagListParams.none(), requestOptions)

    /**
     * A view of [UserTagServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserTagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /user_tags`, but is otherwise the same as
         * [UserTagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserTagListResponse>> =
            list(UserTagListParams.none())

        /** @see list */
        fun list(
            params: UserTagListParams = UserTagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserTagListResponse>>

        /** @see list */
        fun list(
            params: UserTagListParams = UserTagListParams.none()
        ): CompletableFuture<HttpResponseFor<UserTagListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserTagListResponse>> =
            list(UserTagListParams.none(), requestOptions)
    }
}
