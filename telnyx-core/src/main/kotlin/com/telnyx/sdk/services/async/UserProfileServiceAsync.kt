// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.userprofile.UserProfileListParams
import com.telnyx.sdk.models.userprofile.UserProfileListResponse
import com.telnyx.sdk.models.userprofile.UserProfilePatchAllParams
import com.telnyx.sdk.models.userprofile.UserProfilePatchAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Read and update the authenticated user's profile and data locality. */
interface UserProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserProfileServiceAsync

    /**
     * Retrieve the authenticated user's profile, including data locality and migration status.
     *
     * **Beta:** this API should be considered a beta integration target because it may change if
     * user account settings require changes
     */
    fun list(): CompletableFuture<UserProfileListResponse> = list(UserProfileListParams.none())

    /** @see list */
    fun list(
        params: UserProfileListParams = UserProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserProfileListResponse>

    /** @see list */
    fun list(
        params: UserProfileListParams = UserProfileListParams.none()
    ): CompletableFuture<UserProfileListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserProfileListResponse> =
        list(UserProfileListParams.none(), requestOptions)

    /**
     * Update the authenticated user's profile using top-level JSON fields. Returns the updated
     * profile.
     *
     * **Beta:** this API should be considered a beta integration target because it may change if
     * user account settings require changes
     */
    fun patchAll(): CompletableFuture<UserProfilePatchAllResponse> =
        patchAll(UserProfilePatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        params: UserProfilePatchAllParams = UserProfilePatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserProfilePatchAllResponse>

    /** @see patchAll */
    fun patchAll(
        params: UserProfilePatchAllParams = UserProfilePatchAllParams.none()
    ): CompletableFuture<UserProfilePatchAllResponse> = patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(requestOptions: RequestOptions): CompletableFuture<UserProfilePatchAllResponse> =
        patchAll(UserProfilePatchAllParams.none(), requestOptions)

    /**
     * A view of [UserProfileServiceAsync] that provides access to raw HTTP responses for each
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
        ): UserProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /user_profile`, but is otherwise the same as
         * [UserProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserProfileListResponse>> =
            list(UserProfileListParams.none())

        /** @see list */
        fun list(
            params: UserProfileListParams = UserProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserProfileListResponse>>

        /** @see list */
        fun list(
            params: UserProfileListParams = UserProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<UserProfileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserProfileListResponse>> =
            list(UserProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /user_profile`, but is otherwise the same as
         * [UserProfileServiceAsync.patchAll].
         */
        fun patchAll(): CompletableFuture<HttpResponseFor<UserProfilePatchAllResponse>> =
            patchAll(UserProfilePatchAllParams.none())

        /** @see patchAll */
        fun patchAll(
            params: UserProfilePatchAllParams = UserProfilePatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserProfilePatchAllResponse>>

        /** @see patchAll */
        fun patchAll(
            params: UserProfilePatchAllParams = UserProfilePatchAllParams.none()
        ): CompletableFuture<HttpResponseFor<UserProfilePatchAllResponse>> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserProfilePatchAllResponse>> =
            patchAll(UserProfilePatchAllParams.none(), requestOptions)
    }
}
