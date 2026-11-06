// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.userprofile.UserProfileListParams
import com.telnyx.sdk.models.userprofile.UserProfileListResponse
import com.telnyx.sdk.models.userprofile.UserProfilePatchAllParams
import com.telnyx.sdk.models.userprofile.UserProfilePatchAllResponse
import java.util.function.Consumer

/** Read and update the authenticated user's profile and data locality. */
interface UserProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserProfileService

    /**
     * Retrieve the authenticated user's profile, including data locality and migration status.
     *
     * **Beta:** this API should be considered a beta integration target because it may change if
     * user account settings require changes
     */
    fun list(): UserProfileListResponse = list(UserProfileListParams.none())

    /** @see list */
    fun list(
        params: UserProfileListParams = UserProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserProfileListResponse

    /** @see list */
    fun list(
        params: UserProfileListParams = UserProfileListParams.none()
    ): UserProfileListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserProfileListResponse =
        list(UserProfileListParams.none(), requestOptions)

    /**
     * Update the authenticated user's profile using top-level JSON fields. Returns the updated
     * profile.
     *
     * **Beta:** this API should be considered a beta integration target because it may change if
     * user account settings require changes
     */
    fun patchAll(): UserProfilePatchAllResponse = patchAll(UserProfilePatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        params: UserProfilePatchAllParams = UserProfilePatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserProfilePatchAllResponse

    /** @see patchAll */
    fun patchAll(
        params: UserProfilePatchAllParams = UserProfilePatchAllParams.none()
    ): UserProfilePatchAllResponse = patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(requestOptions: RequestOptions): UserProfilePatchAllResponse =
        patchAll(UserProfilePatchAllParams.none(), requestOptions)

    /**
     * A view of [UserProfileService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /user_profile`, but is otherwise the same as
         * [UserProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UserProfileListResponse> = list(UserProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserProfileListParams = UserProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserProfileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserProfileListParams = UserProfileListParams.none()
        ): HttpResponseFor<UserProfileListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserProfileListResponse> =
            list(UserProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /user_profile`, but is otherwise the same as
         * [UserProfileService.patchAll].
         */
        @MustBeClosed
        fun patchAll(): HttpResponseFor<UserProfilePatchAllResponse> =
            patchAll(UserProfilePatchAllParams.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: UserProfilePatchAllParams = UserProfilePatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserProfilePatchAllResponse>

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: UserProfilePatchAllParams = UserProfilePatchAllParams.none()
        ): HttpResponseFor<UserProfilePatchAllResponse> = patchAll(params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(requestOptions: RequestOptions): HttpResponseFor<UserProfilePatchAllResponse> =
            patchAll(UserProfilePatchAllParams.none(), requestOptions)
    }
}
