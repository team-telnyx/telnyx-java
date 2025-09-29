// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.usertags.UserTagListParams
import com.telnyx.sdk.models.usertags.UserTagListResponse
import java.util.function.Consumer

interface UserTagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserTagService

    /** List all user tags. */
    fun list(): UserTagListResponse = list(UserTagListParams.none())

    /** @see list */
    fun list(
        params: UserTagListParams = UserTagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserTagListResponse

    /** @see list */
    fun list(params: UserTagListParams = UserTagListParams.none()): UserTagListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserTagListResponse =
        list(UserTagListParams.none(), requestOptions)

    /** A view of [UserTagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserTagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /user_tags`, but is otherwise the same as
         * [UserTagService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UserTagListResponse> = list(UserTagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserTagListParams = UserTagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserTagListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserTagListParams = UserTagListParams.none()
        ): HttpResponseFor<UserTagListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserTagListResponse> =
            list(UserTagListParams.none(), requestOptions)
    }
}
