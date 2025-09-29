// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.bundlepricing

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleCreateParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleCreateResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleDeactivateParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleDeactivateResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListResourcesParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListResourcesResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListUnusedParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleListUnusedResponse
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleRetrieveParams
import com.telnyx.api.models.bundlepricing.userbundles.UserBundleRetrieveResponse
import java.util.function.Consumer

interface UserBundleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserBundleService

    /** Creates multiple user bundles for the user. */
    fun create(): UserBundleCreateResponse = create(UserBundleCreateParams.none())

    /** @see create */
    fun create(
        params: UserBundleCreateParams = UserBundleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleCreateResponse

    /** @see create */
    fun create(
        params: UserBundleCreateParams = UserBundleCreateParams.none()
    ): UserBundleCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): UserBundleCreateResponse =
        create(UserBundleCreateParams.none(), requestOptions)

    /** Retrieves a user bundle by its ID. */
    fun retrieve(userBundleId: String): UserBundleRetrieveResponse =
        retrieve(userBundleId, UserBundleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userBundleId: String,
        params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleRetrieveResponse =
        retrieve(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userBundleId: String,
        params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
    ): UserBundleRetrieveResponse = retrieve(userBundleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserBundleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: UserBundleRetrieveParams): UserBundleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(userBundleId: String, requestOptions: RequestOptions): UserBundleRetrieveResponse =
        retrieve(userBundleId, UserBundleRetrieveParams.none(), requestOptions)

    /** Get a paginated list of user bundles. */
    fun list(): UserBundleListResponse = list(UserBundleListParams.none())

    /** @see list */
    fun list(
        params: UserBundleListParams = UserBundleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleListResponse

    /** @see list */
    fun list(params: UserBundleListParams = UserBundleListParams.none()): UserBundleListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UserBundleListResponse =
        list(UserBundleListParams.none(), requestOptions)

    /** Deactivates a user bundle by its ID. */
    fun deactivate(userBundleId: String): UserBundleDeactivateResponse =
        deactivate(userBundleId, UserBundleDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        userBundleId: String,
        params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleDeactivateResponse =
        deactivate(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        userBundleId: String,
        params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
    ): UserBundleDeactivateResponse = deactivate(userBundleId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: UserBundleDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleDeactivateResponse

    /** @see deactivate */
    fun deactivate(params: UserBundleDeactivateParams): UserBundleDeactivateResponse =
        deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        userBundleId: String,
        requestOptions: RequestOptions,
    ): UserBundleDeactivateResponse =
        deactivate(userBundleId, UserBundleDeactivateParams.none(), requestOptions)

    /** Retrieves the resources of a user bundle by its ID. */
    fun listResources(userBundleId: String): UserBundleListResourcesResponse =
        listResources(userBundleId, UserBundleListResourcesParams.none())

    /** @see listResources */
    fun listResources(
        userBundleId: String,
        params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleListResourcesResponse =
        listResources(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

    /** @see listResources */
    fun listResources(
        userBundleId: String,
        params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
    ): UserBundleListResourcesResponse = listResources(userBundleId, params, RequestOptions.none())

    /** @see listResources */
    fun listResources(
        params: UserBundleListResourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleListResourcesResponse

    /** @see listResources */
    fun listResources(params: UserBundleListResourcesParams): UserBundleListResourcesResponse =
        listResources(params, RequestOptions.none())

    /** @see listResources */
    fun listResources(
        userBundleId: String,
        requestOptions: RequestOptions,
    ): UserBundleListResourcesResponse =
        listResources(userBundleId, UserBundleListResourcesParams.none(), requestOptions)

    /** Returns all user bundles that aren't in use. */
    fun listUnused(): UserBundleListUnusedResponse = listUnused(UserBundleListUnusedParams.none())

    /** @see listUnused */
    fun listUnused(
        params: UserBundleListUnusedParams = UserBundleListUnusedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserBundleListUnusedResponse

    /** @see listUnused */
    fun listUnused(
        params: UserBundleListUnusedParams = UserBundleListUnusedParams.none()
    ): UserBundleListUnusedResponse = listUnused(params, RequestOptions.none())

    /** @see listUnused */
    fun listUnused(requestOptions: RequestOptions): UserBundleListUnusedResponse =
        listUnused(UserBundleListUnusedParams.none(), requestOptions)

    /** A view of [UserBundleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserBundleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bundle_pricing/user_bundles/bulk`, but is
         * otherwise the same as [UserBundleService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<UserBundleCreateResponse> =
            create(UserBundleCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UserBundleCreateParams = UserBundleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: UserBundleCreateParams = UserBundleCreateParams.none()
        ): HttpResponseFor<UserBundleCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<UserBundleCreateResponse> =
            create(UserBundleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/user_bundles/{user_bundle_id}`, but
         * is otherwise the same as [UserBundleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(userBundleId: String): HttpResponseFor<UserBundleRetrieveResponse> =
            retrieve(userBundleId, UserBundleRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userBundleId: String,
            params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleRetrieveResponse> =
            retrieve(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userBundleId: String,
            params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
        ): HttpResponseFor<UserBundleRetrieveResponse> =
            retrieve(userBundleId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserBundleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserBundleRetrieveParams
        ): HttpResponseFor<UserBundleRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userBundleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleRetrieveResponse> =
            retrieve(userBundleId, UserBundleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/user_bundles`, but is otherwise the
         * same as [UserBundleService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UserBundleListResponse> = list(UserBundleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserBundleListParams = UserBundleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: UserBundleListParams = UserBundleListParams.none()
        ): HttpResponseFor<UserBundleListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserBundleListResponse> =
            list(UserBundleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /bundle_pricing/user_bundles/{user_bundle_id}`,
         * but is otherwise the same as [UserBundleService.deactivate].
         */
        @MustBeClosed
        fun deactivate(userBundleId: String): HttpResponseFor<UserBundleDeactivateResponse> =
            deactivate(userBundleId, UserBundleDeactivateParams.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            userBundleId: String,
            params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleDeactivateResponse> =
            deactivate(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            userBundleId: String,
            params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
        ): HttpResponseFor<UserBundleDeactivateResponse> =
            deactivate(userBundleId, params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: UserBundleDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleDeactivateResponse>

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            params: UserBundleDeactivateParams
        ): HttpResponseFor<UserBundleDeactivateResponse> = deactivate(params, RequestOptions.none())

        /** @see deactivate */
        @MustBeClosed
        fun deactivate(
            userBundleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleDeactivateResponse> =
            deactivate(userBundleId, UserBundleDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /bundle_pricing/user_bundles/{user_bundle_id}/resources`, but is otherwise the same as
         * [UserBundleService.listResources].
         */
        @MustBeClosed
        fun listResources(userBundleId: String): HttpResponseFor<UserBundleListResourcesResponse> =
            listResources(userBundleId, UserBundleListResourcesParams.none())

        /** @see listResources */
        @MustBeClosed
        fun listResources(
            userBundleId: String,
            params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleListResourcesResponse> =
            listResources(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

        /** @see listResources */
        @MustBeClosed
        fun listResources(
            userBundleId: String,
            params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
        ): HttpResponseFor<UserBundleListResourcesResponse> =
            listResources(userBundleId, params, RequestOptions.none())

        /** @see listResources */
        @MustBeClosed
        fun listResources(
            params: UserBundleListResourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleListResourcesResponse>

        /** @see listResources */
        @MustBeClosed
        fun listResources(
            params: UserBundleListResourcesParams
        ): HttpResponseFor<UserBundleListResourcesResponse> =
            listResources(params, RequestOptions.none())

        /** @see listResources */
        @MustBeClosed
        fun listResources(
            userBundleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserBundleListResourcesResponse> =
            listResources(userBundleId, UserBundleListResourcesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/user_bundles/unused`, but is
         * otherwise the same as [UserBundleService.listUnused].
         */
        @MustBeClosed
        fun listUnused(): HttpResponseFor<UserBundleListUnusedResponse> =
            listUnused(UserBundleListUnusedParams.none())

        /** @see listUnused */
        @MustBeClosed
        fun listUnused(
            params: UserBundleListUnusedParams = UserBundleListUnusedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserBundleListUnusedResponse>

        /** @see listUnused */
        @MustBeClosed
        fun listUnused(
            params: UserBundleListUnusedParams = UserBundleListUnusedParams.none()
        ): HttpResponseFor<UserBundleListUnusedResponse> = listUnused(params, RequestOptions.none())

        /** @see listUnused */
        @MustBeClosed
        fun listUnused(
            requestOptions: RequestOptions
        ): HttpResponseFor<UserBundleListUnusedResponse> =
            listUnused(UserBundleListUnusedParams.none(), requestOptions)
    }
}
