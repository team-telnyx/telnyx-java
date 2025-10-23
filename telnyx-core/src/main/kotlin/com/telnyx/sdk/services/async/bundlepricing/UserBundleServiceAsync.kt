// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.bundlepricing

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleCreateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleCreateResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleDeactivateParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleDeactivateResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResourcesParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResourcesResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListUnusedParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleListUnusedResponse
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleRetrieveParams
import com.telnyx.sdk.models.bundlepricing.userbundles.UserBundleRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserBundleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserBundleServiceAsync

    /** Creates multiple user bundles for the user. */
    fun create(): CompletableFuture<UserBundleCreateResponse> =
        create(UserBundleCreateParams.none())

    /** @see create */
    fun create(
        params: UserBundleCreateParams = UserBundleCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleCreateResponse>

    /** @see create */
    fun create(
        params: UserBundleCreateParams = UserBundleCreateParams.none()
    ): CompletableFuture<UserBundleCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<UserBundleCreateResponse> =
        create(UserBundleCreateParams.none(), requestOptions)

    /** Retrieves a user bundle by its ID. */
    fun retrieve(userBundleId: String): CompletableFuture<UserBundleRetrieveResponse> =
        retrieve(userBundleId, UserBundleRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userBundleId: String,
        params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleRetrieveResponse> =
        retrieve(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userBundleId: String,
        params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
    ): CompletableFuture<UserBundleRetrieveResponse> =
        retrieve(userBundleId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserBundleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: UserBundleRetrieveParams): CompletableFuture<UserBundleRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        userBundleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleRetrieveResponse> =
        retrieve(userBundleId, UserBundleRetrieveParams.none(), requestOptions)

    /** Get a paginated list of user bundles. */
    fun list(): CompletableFuture<UserBundleListResponse> = list(UserBundleListParams.none())

    /** @see list */
    fun list(
        params: UserBundleListParams = UserBundleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleListResponse>

    /** @see list */
    fun list(
        params: UserBundleListParams = UserBundleListParams.none()
    ): CompletableFuture<UserBundleListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserBundleListResponse> =
        list(UserBundleListParams.none(), requestOptions)

    /** Deactivates a user bundle by its ID. */
    fun deactivate(userBundleId: String): CompletableFuture<UserBundleDeactivateResponse> =
        deactivate(userBundleId, UserBundleDeactivateParams.none())

    /** @see deactivate */
    fun deactivate(
        userBundleId: String,
        params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleDeactivateResponse> =
        deactivate(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

    /** @see deactivate */
    fun deactivate(
        userBundleId: String,
        params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
    ): CompletableFuture<UserBundleDeactivateResponse> =
        deactivate(userBundleId, params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        params: UserBundleDeactivateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleDeactivateResponse>

    /** @see deactivate */
    fun deactivate(
        params: UserBundleDeactivateParams
    ): CompletableFuture<UserBundleDeactivateResponse> = deactivate(params, RequestOptions.none())

    /** @see deactivate */
    fun deactivate(
        userBundleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleDeactivateResponse> =
        deactivate(userBundleId, UserBundleDeactivateParams.none(), requestOptions)

    /** Retrieves the resources of a user bundle by its ID. */
    fun listResources(userBundleId: String): CompletableFuture<UserBundleListResourcesResponse> =
        listResources(userBundleId, UserBundleListResourcesParams.none())

    /** @see listResources */
    fun listResources(
        userBundleId: String,
        params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleListResourcesResponse> =
        listResources(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

    /** @see listResources */
    fun listResources(
        userBundleId: String,
        params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
    ): CompletableFuture<UserBundleListResourcesResponse> =
        listResources(userBundleId, params, RequestOptions.none())

    /** @see listResources */
    fun listResources(
        params: UserBundleListResourcesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleListResourcesResponse>

    /** @see listResources */
    fun listResources(
        params: UserBundleListResourcesParams
    ): CompletableFuture<UserBundleListResourcesResponse> =
        listResources(params, RequestOptions.none())

    /** @see listResources */
    fun listResources(
        userBundleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserBundleListResourcesResponse> =
        listResources(userBundleId, UserBundleListResourcesParams.none(), requestOptions)

    /** Returns all user bundles that aren't in use. */
    fun listUnused(): CompletableFuture<UserBundleListUnusedResponse> =
        listUnused(UserBundleListUnusedParams.none())

    /** @see listUnused */
    fun listUnused(
        params: UserBundleListUnusedParams = UserBundleListUnusedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserBundleListUnusedResponse>

    /** @see listUnused */
    fun listUnused(
        params: UserBundleListUnusedParams = UserBundleListUnusedParams.none()
    ): CompletableFuture<UserBundleListUnusedResponse> = listUnused(params, RequestOptions.none())

    /** @see listUnused */
    fun listUnused(
        requestOptions: RequestOptions
    ): CompletableFuture<UserBundleListUnusedResponse> =
        listUnused(UserBundleListUnusedParams.none(), requestOptions)

    /**
     * A view of [UserBundleServiceAsync] that provides access to raw HTTP responses for each
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
        ): UserBundleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bundle_pricing/user_bundles/bulk`, but is
         * otherwise the same as [UserBundleServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<UserBundleCreateResponse>> =
            create(UserBundleCreateParams.none())

        /** @see create */
        fun create(
            params: UserBundleCreateParams = UserBundleCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleCreateResponse>>

        /** @see create */
        fun create(
            params: UserBundleCreateParams = UserBundleCreateParams.none()
        ): CompletableFuture<HttpResponseFor<UserBundleCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserBundleCreateResponse>> =
            create(UserBundleCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/user_bundles/{user_bundle_id}`, but
         * is otherwise the same as [UserBundleServiceAsync.retrieve].
         */
        fun retrieve(
            userBundleId: String
        ): CompletableFuture<HttpResponseFor<UserBundleRetrieveResponse>> =
            retrieve(userBundleId, UserBundleRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userBundleId: String,
            params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleRetrieveResponse>> =
            retrieve(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userBundleId: String,
            params: UserBundleRetrieveParams = UserBundleRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleRetrieveResponse>> =
            retrieve(userBundleId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UserBundleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UserBundleRetrieveParams
        ): CompletableFuture<HttpResponseFor<UserBundleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            userBundleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleRetrieveResponse>> =
            retrieve(userBundleId, UserBundleRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/user_bundles`, but is otherwise the
         * same as [UserBundleServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserBundleListResponse>> =
            list(UserBundleListParams.none())

        /** @see list */
        fun list(
            params: UserBundleListParams = UserBundleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleListResponse>>

        /** @see list */
        fun list(
            params: UserBundleListParams = UserBundleListParams.none()
        ): CompletableFuture<HttpResponseFor<UserBundleListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserBundleListResponse>> =
            list(UserBundleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /bundle_pricing/user_bundles/{user_bundle_id}`,
         * but is otherwise the same as [UserBundleServiceAsync.deactivate].
         */
        fun deactivate(
            userBundleId: String
        ): CompletableFuture<HttpResponseFor<UserBundleDeactivateResponse>> =
            deactivate(userBundleId, UserBundleDeactivateParams.none())

        /** @see deactivate */
        fun deactivate(
            userBundleId: String,
            params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleDeactivateResponse>> =
            deactivate(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

        /** @see deactivate */
        fun deactivate(
            userBundleId: String,
            params: UserBundleDeactivateParams = UserBundleDeactivateParams.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleDeactivateResponse>> =
            deactivate(userBundleId, params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            params: UserBundleDeactivateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleDeactivateResponse>>

        /** @see deactivate */
        fun deactivate(
            params: UserBundleDeactivateParams
        ): CompletableFuture<HttpResponseFor<UserBundleDeactivateResponse>> =
            deactivate(params, RequestOptions.none())

        /** @see deactivate */
        fun deactivate(
            userBundleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleDeactivateResponse>> =
            deactivate(userBundleId, UserBundleDeactivateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /bundle_pricing/user_bundles/{user_bundle_id}/resources`, but is otherwise the same as
         * [UserBundleServiceAsync.listResources].
         */
        fun listResources(
            userBundleId: String
        ): CompletableFuture<HttpResponseFor<UserBundleListResourcesResponse>> =
            listResources(userBundleId, UserBundleListResourcesParams.none())

        /** @see listResources */
        fun listResources(
            userBundleId: String,
            params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleListResourcesResponse>> =
            listResources(params.toBuilder().userBundleId(userBundleId).build(), requestOptions)

        /** @see listResources */
        fun listResources(
            userBundleId: String,
            params: UserBundleListResourcesParams = UserBundleListResourcesParams.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleListResourcesResponse>> =
            listResources(userBundleId, params, RequestOptions.none())

        /** @see listResources */
        fun listResources(
            params: UserBundleListResourcesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleListResourcesResponse>>

        /** @see listResources */
        fun listResources(
            params: UserBundleListResourcesParams
        ): CompletableFuture<HttpResponseFor<UserBundleListResourcesResponse>> =
            listResources(params, RequestOptions.none())

        /** @see listResources */
        fun listResources(
            userBundleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserBundleListResourcesResponse>> =
            listResources(userBundleId, UserBundleListResourcesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bundle_pricing/user_bundles/unused`, but is
         * otherwise the same as [UserBundleServiceAsync.listUnused].
         */
        fun listUnused(): CompletableFuture<HttpResponseFor<UserBundleListUnusedResponse>> =
            listUnused(UserBundleListUnusedParams.none())

        /** @see listUnused */
        fun listUnused(
            params: UserBundleListUnusedParams = UserBundleListUnusedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserBundleListUnusedResponse>>

        /** @see listUnused */
        fun listUnused(
            params: UserBundleListUnusedParams = UserBundleListUnusedParams.none()
        ): CompletableFuture<HttpResponseFor<UserBundleListUnusedResponse>> =
            listUnused(params, RequestOptions.none())

        /** @see listUnused */
        fun listUnused(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserBundleListUnusedResponse>> =
            listUnused(UserBundleListUnusedParams.none(), requestOptions)
    }
}
