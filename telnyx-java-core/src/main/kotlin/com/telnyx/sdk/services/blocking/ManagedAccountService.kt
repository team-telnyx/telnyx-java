// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountGetAllocatableGlobalOutboundChannelsParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountGetAllocatableGlobalOutboundChannelsResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountListPage
import com.telnyx.sdk.models.managedaccounts.ManagedAccountListParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountRetrieveParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountRetrieveResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateResponse
import com.telnyx.sdk.services.blocking.managedaccounts.ActionService
import java.util.function.Consumer

/** Managed Accounts operations */
interface ManagedAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManagedAccountService

    /** Managed Accounts operations */
    fun actions(): ActionService

    /**
     * Create a new managed account owned by the authenticated user. You need to be explictly
     * approved by Telnyx in order to become a manager account.
     */
    fun create(params: ManagedAccountCreateParams): ManagedAccountCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ManagedAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountCreateResponse

    /** Retrieves the details of a single managed account. */
    fun retrieve(id: String): ManagedAccountRetrieveResponse =
        retrieve(id, ManagedAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
    ): ManagedAccountRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ManagedAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ManagedAccountRetrieveParams): ManagedAccountRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ManagedAccountRetrieveResponse =
        retrieve(id, ManagedAccountRetrieveParams.none(), requestOptions)

    /** Update a single managed account. */
    fun update(id: String): ManagedAccountUpdateResponse =
        update(id, ManagedAccountUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
    ): ManagedAccountUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ManagedAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountUpdateResponse

    /** @see update */
    fun update(params: ManagedAccountUpdateParams): ManagedAccountUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): ManagedAccountUpdateResponse =
        update(id, ManagedAccountUpdateParams.none(), requestOptions)

    /**
     * Lists the accounts managed by the current user. Users need to be explictly approved by Telnyx
     * in order to become manager accounts.
     */
    fun list(): ManagedAccountListPage = list(ManagedAccountListParams.none())

    /** @see list */
    fun list(
        params: ManagedAccountListParams = ManagedAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountListPage

    /** @see list */
    fun list(
        params: ManagedAccountListParams = ManagedAccountListParams.none()
    ): ManagedAccountListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ManagedAccountListPage =
        list(ManagedAccountListParams.none(), requestOptions)

    /**
     * Display information about allocatable global outbound channels for the current user. Only
     * usable by account managers.
     */
    fun getAllocatableGlobalOutboundChannels():
        ManagedAccountGetAllocatableGlobalOutboundChannelsResponse =
        getAllocatableGlobalOutboundChannels(
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
        )

    /** @see getAllocatableGlobalOutboundChannels */
    fun getAllocatableGlobalOutboundChannels(
        params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountGetAllocatableGlobalOutboundChannelsResponse

    /** @see getAllocatableGlobalOutboundChannels */
    fun getAllocatableGlobalOutboundChannels(
        params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
    ): ManagedAccountGetAllocatableGlobalOutboundChannelsResponse =
        getAllocatableGlobalOutboundChannels(params, RequestOptions.none())

    /** @see getAllocatableGlobalOutboundChannels */
    fun getAllocatableGlobalOutboundChannels(
        requestOptions: RequestOptions
    ): ManagedAccountGetAllocatableGlobalOutboundChannelsResponse =
        getAllocatableGlobalOutboundChannels(
            ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
            requestOptions,
        )

    /**
     * Update the amount of allocatable global outbound channels allocated to a specific managed
     * account.
     */
    fun updateGlobalChannelLimit(id: String): ManagedAccountUpdateGlobalChannelLimitResponse =
        updateGlobalChannelLimit(id, ManagedAccountUpdateGlobalChannelLimitParams.none())

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        id: String,
        params: ManagedAccountUpdateGlobalChannelLimitParams =
            ManagedAccountUpdateGlobalChannelLimitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountUpdateGlobalChannelLimitResponse =
        updateGlobalChannelLimit(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        id: String,
        params: ManagedAccountUpdateGlobalChannelLimitParams =
            ManagedAccountUpdateGlobalChannelLimitParams.none(),
    ): ManagedAccountUpdateGlobalChannelLimitResponse =
        updateGlobalChannelLimit(id, params, RequestOptions.none())

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        params: ManagedAccountUpdateGlobalChannelLimitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagedAccountUpdateGlobalChannelLimitResponse

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        params: ManagedAccountUpdateGlobalChannelLimitParams
    ): ManagedAccountUpdateGlobalChannelLimitResponse =
        updateGlobalChannelLimit(params, RequestOptions.none())

    /** @see updateGlobalChannelLimit */
    fun updateGlobalChannelLimit(
        id: String,
        requestOptions: RequestOptions,
    ): ManagedAccountUpdateGlobalChannelLimitResponse =
        updateGlobalChannelLimit(
            id,
            ManagedAccountUpdateGlobalChannelLimitParams.none(),
            requestOptions,
        )

    /**
     * A view of [ManagedAccountService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManagedAccountService.WithRawResponse

        /** Managed Accounts operations */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /managed_accounts`, but is otherwise the same as
         * [ManagedAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: ManagedAccountCreateParams
        ): HttpResponseFor<ManagedAccountCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ManagedAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountCreateResponse>

        /**
         * Returns a raw HTTP response for `get /managed_accounts/{id}`, but is otherwise the same
         * as [ManagedAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ManagedAccountRetrieveResponse> =
            retrieve(id, ManagedAccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ManagedAccountRetrieveParams = ManagedAccountRetrieveParams.none(),
        ): HttpResponseFor<ManagedAccountRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ManagedAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ManagedAccountRetrieveParams
        ): HttpResponseFor<ManagedAccountRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedAccountRetrieveResponse> =
            retrieve(id, ManagedAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /managed_accounts/{id}`, but is otherwise the same
         * as [ManagedAccountService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<ManagedAccountUpdateResponse> =
            update(id, ManagedAccountUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ManagedAccountUpdateParams = ManagedAccountUpdateParams.none(),
        ): HttpResponseFor<ManagedAccountUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ManagedAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: ManagedAccountUpdateParams
        ): HttpResponseFor<ManagedAccountUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedAccountUpdateResponse> =
            update(id, ManagedAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /managed_accounts`, but is otherwise the same as
         * [ManagedAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ManagedAccountListPage> = list(ManagedAccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ManagedAccountListParams = ManagedAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ManagedAccountListParams = ManagedAccountListParams.none()
        ): HttpResponseFor<ManagedAccountListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ManagedAccountListPage> =
            list(ManagedAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /managed_accounts/allocatable_global_outbound_channels`, but is otherwise the same as
         * [ManagedAccountService.getAllocatableGlobalOutboundChannels].
         */
        @MustBeClosed
        fun getAllocatableGlobalOutboundChannels():
            HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
            getAllocatableGlobalOutboundChannels(
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
            )

        /** @see getAllocatableGlobalOutboundChannels */
        @MustBeClosed
        fun getAllocatableGlobalOutboundChannels(
            params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>

        /** @see getAllocatableGlobalOutboundChannels */
        @MustBeClosed
        fun getAllocatableGlobalOutboundChannels(
            params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams =
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none()
        ): HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
            getAllocatableGlobalOutboundChannels(params, RequestOptions.none())

        /** @see getAllocatableGlobalOutboundChannels */
        @MustBeClosed
        fun getAllocatableGlobalOutboundChannels(
            requestOptions: RequestOptions
        ): HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
            getAllocatableGlobalOutboundChannels(
                ManagedAccountGetAllocatableGlobalOutboundChannelsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /managed_accounts/{id}/update_global_channel_limit`, but is otherwise the same as
         * [ManagedAccountService.updateGlobalChannelLimit].
         */
        @MustBeClosed
        fun updateGlobalChannelLimit(
            id: String
        ): HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse> =
            updateGlobalChannelLimit(id, ManagedAccountUpdateGlobalChannelLimitParams.none())

        /** @see updateGlobalChannelLimit */
        @MustBeClosed
        fun updateGlobalChannelLimit(
            id: String,
            params: ManagedAccountUpdateGlobalChannelLimitParams =
                ManagedAccountUpdateGlobalChannelLimitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse> =
            updateGlobalChannelLimit(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateGlobalChannelLimit */
        @MustBeClosed
        fun updateGlobalChannelLimit(
            id: String,
            params: ManagedAccountUpdateGlobalChannelLimitParams =
                ManagedAccountUpdateGlobalChannelLimitParams.none(),
        ): HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse> =
            updateGlobalChannelLimit(id, params, RequestOptions.none())

        /** @see updateGlobalChannelLimit */
        @MustBeClosed
        fun updateGlobalChannelLimit(
            params: ManagedAccountUpdateGlobalChannelLimitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>

        /** @see updateGlobalChannelLimit */
        @MustBeClosed
        fun updateGlobalChannelLimit(
            params: ManagedAccountUpdateGlobalChannelLimitParams
        ): HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse> =
            updateGlobalChannelLimit(params, RequestOptions.none())

        /** @see updateGlobalChannelLimit */
        @MustBeClosed
        fun updateGlobalChannelLimit(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse> =
            updateGlobalChannelLimit(
                id,
                ManagedAccountUpdateGlobalChannelLimitParams.none(),
                requestOptions,
            )
    }
}
