// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountGetAllocatableGlobalOutboundChannelsParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountGetAllocatableGlobalOutboundChannelsResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountListPageAsync
import com.telnyx.sdk.models.managedaccounts.ManagedAccountListParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountRetrieveParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountRetrieveResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateResponse
import com.telnyx.sdk.services.async.managedaccounts.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ManagedAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManagedAccountServiceAsync

    fun actions(): ActionServiceAsync

    /**
     * Create a new managed account owned by the authenticated user. You need to be explictly
     * approved by Telnyx in order to become a manager account.
     */
    fun create(
        params: ManagedAccountCreateParams
    ): CompletableFuture<ManagedAccountCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ManagedAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountCreateResponse>

    /** Retrieves the details of a single managed account. */
    fun retrieve(id: String): CompletableFuture<ManagedAccountRetrieveResponse> =
        retrieve(id, ManagedAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
    ): CompletableFuture<ManagedAccountRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ManagedAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ManagedAccountRetrieveParams
    ): CompletableFuture<ManagedAccountRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountRetrieveResponse> =
        retrieve(id, ManagedAccountRetrieveParams.none(), requestOptions)

    /** Update a single managed account. */
    fun update(id: String): CompletableFuture<ManagedAccountUpdateResponse> =
        update(id, ManagedAccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
    ): CompletableFuture<ManagedAccountUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ManagedAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountUpdateResponse>

    /** @see update */
    fun update(
        params: ManagedAccountUpdateParams
    ): CompletableFuture<ManagedAccountUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountUpdateResponse> =
        update(id, ManagedAccountUpdateParams.none(), requestOptions)

    /**
     * Lists the accounts managed by the current user. Users need to be explictly approved by Telnyx
     * in order to become manager accounts.
     */
    fun list(): CompletableFuture<ManagedAccountListPageAsync> =
        list(ManagedAccountListParams.none())

    /** @see list */
    fun list(
        params: ManagedAccountListParams = ManagedAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountListPageAsync>

    /** @see list */
    fun list(
        params: ManagedAccountListParams = ManagedAccountListParams.none()
    ): CompletableFuture<ManagedAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ManagedAccountListPageAsync> =
        list(ManagedAccountListParams.none(), requestOptions)

    /**
     * Display information about allocatable global outbound channels for the current user. Only
     * usable by account managers.
     */
    fun getAllocatableGlobalOutboundChannels():
        CompletableFuture<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
        getAllocatableGlobalOutboundChannels(
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
        )

    /** @see getAllocatableGlobalOutboundChannels */
    fun getAllocatableGlobalOutboundChannels(
        params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>

    /** @see getAllocatableGlobalOutboundChannels */
    fun getAllocatableGlobalOutboundChannels(
        params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
    ): CompletableFuture<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
        getAllocatableGlobalOutboundChannels(params, RequestOptions.none())

    /** @see getAllocatableGlobalOutboundChannels */
    fun getAllocatableGlobalOutboundChannels(
        requestOptions: RequestOptions
    ): CompletableFuture<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
        getAllocatableGlobalOutboundChannels(
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
            requestOptions,
        )

    /**
     * Update the amount of allocatable global outbound channels allocated to a specific managed
     * account.
     */
    fun updateGlobalChannelLimit(
        id: String
    ): CompletableFuture<ManagedAccountUpdateGlobalChannelLimitResponse> =
        updateGlobalChannelLimit(id, ManagedAccountUpdateGlobalChannelLimitParams.none())

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        id: String,
        params: ManagedAccountUpdateGlobalChannelLimitParams =
            ManagedAccountUpdateGlobalChannelLimitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountUpdateGlobalChannelLimitResponse> =
        updateGlobalChannelLimit(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        id: String,
        params: ManagedAccountUpdateGlobalChannelLimitParams =
            ManagedAccountUpdateGlobalChannelLimitParams.none(),
    ): CompletableFuture<ManagedAccountUpdateGlobalChannelLimitResponse> =
        updateGlobalChannelLimit(id, params, RequestOptions.none())

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        params: ManagedAccountUpdateGlobalChannelLimitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagedAccountUpdateGlobalChannelLimitResponse>

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        params: ManagedAccountUpdateGlobalChannelLimitParams
    ): CompletableFuture<ManagedAccountUpdateGlobalChannelLimitResponse> =
        updateGlobalChannelLimit(params, RequestOptions.none())

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountUpdateGlobalChannelLimitResponse> =
        updateGlobalChannelLimit(
            id,
            ManagedAccountUpdateGlobalChannelLimitParams.none(),
            requestOptions,
        )

    /**
     * A view of [ManagedAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): ManagedAccountServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /managed_accounts`, but is otherwise the same as
         * [ManagedAccountServiceAsync.create].
         */
        fun create(
            params: ManagedAccountCreateParams
        ): CompletableFuture<HttpResponseFor<ManagedAccountCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ManagedAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /managed_accounts/{id}`, but is otherwise the same
         * as [ManagedAccountServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<ManagedAccountRetrieveResponse>> =
            retrieve(id, ManagedAccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ManagedAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ManagedAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<ManagedAccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountRetrieveResponse>> =
            retrieve(id, ManagedAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /managed_accounts/{id}`, but is otherwise the same
         * as [ManagedAccountServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<ManagedAccountUpdateResponse>> =
            update(id, ManagedAccountUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ManagedAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateResponse>>

        /** @see update */
        fun update(
            params: ManagedAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateResponse>> =
            update(id, ManagedAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /managed_accounts`, but is otherwise the same as
         * [ManagedAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ManagedAccountListPageAsync>> =
            list(ManagedAccountListParams.none())

        /** @see list */
        fun list(
            params: ManagedAccountListParams = ManagedAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountListPageAsync>>

        /** @see list */
        fun list(
            params: ManagedAccountListParams = ManagedAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<ManagedAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ManagedAccountListPageAsync>> =
            list(ManagedAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /managed_accounts/allocatable_global_outbound_channels`, but is otherwise the same as
         * [ManagedAccountServiceAsync.getAllocatableGlobalOutboundChannels].
         */
        fun getAllocatableGlobalOutboundChannels():
            CompletableFuture<
                HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>
            > =
            getAllocatableGlobalOutboundChannels(
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
            )

        /** @see getAllocatableGlobalOutboundChannels */
        fun getAllocatableGlobalOutboundChannels(
            params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>
        >

        /** @see getAllocatableGlobalOutboundChannels */
        fun getAllocatableGlobalOutboundChannels(
            params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
        ): CompletableFuture<
            HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>
        > = getAllocatableGlobalOutboundChannels(params, RequestOptions.none())

        /** @see getAllocatableGlobalOutboundChannels */
        fun getAllocatableGlobalOutboundChannels(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>
        > =
            getAllocatableGlobalOutboundChannels(
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /managed_accounts/{id}/update_global_channel_limit`, but is otherwise the same as
         * [ManagedAccountServiceAsync.updateGlobalChannelLimit].
         */
        fun updateGlobalChannelLimit(
            id: String
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>> =
            updateGlobalChannelLimit(id, ManagedAccountUpdateGlobalChannelLimitParams.none())

        /** @see updateGlobalChannelLimit */
        fun updateGlobalChannelLimit(
            id: String,
            params: ManagedAccountUpdateGlobalChannelLimitParams =
                ManagedAccountUpdateGlobalChannelLimitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>> =
            updateGlobalChannelLimit(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateGlobalChannelLimit */
        fun updateGlobalChannelLimit(
            id: String,
            params: ManagedAccountUpdateGlobalChannelLimitParams =
                ManagedAccountUpdateGlobalChannelLimitParams.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>> =
            updateGlobalChannelLimit(id, params, RequestOptions.none())

        /** @see updateGlobalChannelLimit */
        fun updateGlobalChannelLimit(
            params: ManagedAccountUpdateGlobalChannelLimitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>>

        /** @see updateGlobalChannelLimit */
        fun updateGlobalChannelLimit(
            params: ManagedAccountUpdateGlobalChannelLimitParams
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>> =
            updateGlobalChannelLimit(params, RequestOptions.none())

        /** @see updateGlobalChannelLimit */
        fun updateGlobalChannelLimit(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>> =
            updateGlobalChannelLimit(
                id,
                ManagedAccountUpdateGlobalChannelLimitParams.none(),
                requestOptions,
            )
    }
}
