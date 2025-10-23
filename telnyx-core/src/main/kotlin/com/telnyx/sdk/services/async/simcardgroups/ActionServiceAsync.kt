// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.simcardgroups

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcardgroups.actions.ActionListParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionListResponse
import com.telnyx.sdk.models.simcardgroups.actions.ActionRemovePrivateWirelessGatewayParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionRemovePrivateWirelessGatewayResponse
import com.telnyx.sdk.models.simcardgroups.actions.ActionRemoveWirelessBlocklistParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionRemoveWirelessBlocklistResponse
import com.telnyx.sdk.models.simcardgroups.actions.ActionRetrieveParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionRetrieveResponse
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayResponse
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetWirelessBlocklistParams
import com.telnyx.sdk.models.simcardgroups.actions.ActionSetWirelessBlocklistResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /**
     * This API allows fetching detailed information about a SIM card group action resource to make
     * follow-ups in an existing asynchronous operation.
     */
    fun retrieve(id: String): CompletableFuture<ActionRetrieveResponse> =
        retrieve(id, ActionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ActionRetrieveParams = ActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ActionRetrieveParams = ActionRetrieveParams.none(),
    ): CompletableFuture<ActionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ActionRetrieveParams): CompletableFuture<ActionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRetrieveResponse> =
        retrieve(id, ActionRetrieveParams.none(), requestOptions)

    /**
     * This API allows listing a paginated collection a SIM card group actions. It allows to explore
     * a collection of existing asynchronous operation using specific filters.
     */
    fun list(): CompletableFuture<ActionListResponse> = list(ActionListParams.none())

    /** @see list */
    fun list(
        params: ActionListParams = ActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionListResponse>

    /** @see list */
    fun list(
        params: ActionListParams = ActionListParams.none()
    ): CompletableFuture<ActionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ActionListResponse> =
        list(ActionListParams.none(), requestOptions)

    /**
     * This action will asynchronously remove an existing Private Wireless Gateway definition from a
     * SIM card group. Completing this operation defines that all SIM cards in the SIM card group
     * will get their traffic handled by Telnyx's default mobile network configuration.
     */
    fun removePrivateWirelessGateway(
        id: String
    ): CompletableFuture<ActionRemovePrivateWirelessGatewayResponse> =
        removePrivateWirelessGateway(id, ActionRemovePrivateWirelessGatewayParams.none())

    /** @see removePrivateWirelessGateway */
    fun removePrivateWirelessGateway(
        id: String,
        params: ActionRemovePrivateWirelessGatewayParams =
            ActionRemovePrivateWirelessGatewayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemovePrivateWirelessGatewayResponse> =
        removePrivateWirelessGateway(params.toBuilder().id(id).build(), requestOptions)

    /** @see removePrivateWirelessGateway */
    fun removePrivateWirelessGateway(
        id: String,
        params: ActionRemovePrivateWirelessGatewayParams =
            ActionRemovePrivateWirelessGatewayParams.none(),
    ): CompletableFuture<ActionRemovePrivateWirelessGatewayResponse> =
        removePrivateWirelessGateway(id, params, RequestOptions.none())

    /** @see removePrivateWirelessGateway */
    fun removePrivateWirelessGateway(
        params: ActionRemovePrivateWirelessGatewayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemovePrivateWirelessGatewayResponse>

    /** @see removePrivateWirelessGateway */
    fun removePrivateWirelessGateway(
        params: ActionRemovePrivateWirelessGatewayParams
    ): CompletableFuture<ActionRemovePrivateWirelessGatewayResponse> =
        removePrivateWirelessGateway(params, RequestOptions.none())

    /** @see removePrivateWirelessGateway */
    fun removePrivateWirelessGateway(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRemovePrivateWirelessGatewayResponse> =
        removePrivateWirelessGateway(
            id,
            ActionRemovePrivateWirelessGatewayParams.none(),
            requestOptions,
        )

    /**
     * This action will asynchronously remove an existing Wireless Blocklist to all the SIMs in the
     * SIM card group.
     */
    fun removeWirelessBlocklist(
        id: String
    ): CompletableFuture<ActionRemoveWirelessBlocklistResponse> =
        removeWirelessBlocklist(id, ActionRemoveWirelessBlocklistParams.none())

    /** @see removeWirelessBlocklist */
    fun removeWirelessBlocklist(
        id: String,
        params: ActionRemoveWirelessBlocklistParams = ActionRemoveWirelessBlocklistParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemoveWirelessBlocklistResponse> =
        removeWirelessBlocklist(params.toBuilder().id(id).build(), requestOptions)

    /** @see removeWirelessBlocklist */
    fun removeWirelessBlocklist(
        id: String,
        params: ActionRemoveWirelessBlocklistParams = ActionRemoveWirelessBlocklistParams.none(),
    ): CompletableFuture<ActionRemoveWirelessBlocklistResponse> =
        removeWirelessBlocklist(id, params, RequestOptions.none())

    /** @see removeWirelessBlocklist */
    fun removeWirelessBlocklist(
        params: ActionRemoveWirelessBlocklistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemoveWirelessBlocklistResponse>

    /** @see removeWirelessBlocklist */
    fun removeWirelessBlocklist(
        params: ActionRemoveWirelessBlocklistParams
    ): CompletableFuture<ActionRemoveWirelessBlocklistResponse> =
        removeWirelessBlocklist(params, RequestOptions.none())

    /** @see removeWirelessBlocklist */
    fun removeWirelessBlocklist(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRemoveWirelessBlocklistResponse> =
        removeWirelessBlocklist(id, ActionRemoveWirelessBlocklistParams.none(), requestOptions)

    /**
     * This action will asynchronously assign a provisioned Private Wireless Gateway to the SIM card
     * group. Completing this operation defines that all SIM cards in the SIM card group will get
     * their traffic controlled by the associated Private Wireless Gateway. This operation will also
     * imply that new SIM cards assigned to a group will inherit its network definitions. If it's
     * moved to a different group that doesn't have a Private Wireless Gateway, it'll use Telnyx's
     * default mobile network configuration.
     */
    fun setPrivateWirelessGateway(
        id: String,
        params: ActionSetPrivateWirelessGatewayParams,
    ): CompletableFuture<ActionSetPrivateWirelessGatewayResponse> =
        setPrivateWirelessGateway(id, params, RequestOptions.none())

    /** @see setPrivateWirelessGateway */
    fun setPrivateWirelessGateway(
        id: String,
        params: ActionSetPrivateWirelessGatewayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetPrivateWirelessGatewayResponse> =
        setPrivateWirelessGateway(params.toBuilder().id(id).build(), requestOptions)

    /** @see setPrivateWirelessGateway */
    fun setPrivateWirelessGateway(
        params: ActionSetPrivateWirelessGatewayParams
    ): CompletableFuture<ActionSetPrivateWirelessGatewayResponse> =
        setPrivateWirelessGateway(params, RequestOptions.none())

    /** @see setPrivateWirelessGateway */
    fun setPrivateWirelessGateway(
        params: ActionSetPrivateWirelessGatewayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetPrivateWirelessGatewayResponse>

    /**
     * This action will asynchronously assign a Wireless Blocklist to all the SIMs in the SIM card
     * group.
     */
    fun setWirelessBlocklist(
        id: String,
        params: ActionSetWirelessBlocklistParams,
    ): CompletableFuture<ActionSetWirelessBlocklistResponse> =
        setWirelessBlocklist(id, params, RequestOptions.none())

    /** @see setWirelessBlocklist */
    fun setWirelessBlocklist(
        id: String,
        params: ActionSetWirelessBlocklistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetWirelessBlocklistResponse> =
        setWirelessBlocklist(params.toBuilder().id(id).build(), requestOptions)

    /** @see setWirelessBlocklist */
    fun setWirelessBlocklist(
        params: ActionSetWirelessBlocklistParams
    ): CompletableFuture<ActionSetWirelessBlocklistResponse> =
        setWirelessBlocklist(params, RequestOptions.none())

    /** @see setWirelessBlocklist */
    fun setWirelessBlocklist(
        params: ActionSetWirelessBlocklistParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetWirelessBlocklistResponse>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sim_card_group_actions/{id}`, but is otherwise the
         * same as [ActionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(id, ActionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ActionRetrieveParams = ActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ActionRetrieveParams = ActionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ActionRetrieveParams
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> =
            retrieve(id, ActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_card_group_actions`, but is otherwise the same
         * as [ActionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ActionListResponse>> =
            list(ActionListParams.none())

        /** @see list */
        fun list(
            params: ActionListParams = ActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionListResponse>>

        /** @see list */
        fun list(
            params: ActionListParams = ActionListParams.none()
        ): CompletableFuture<HttpResponseFor<ActionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ActionListResponse>> =
            list(ActionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /sim_card_groups/{id}/actions/remove_private_wireless_gateway`, but is otherwise the same
         * as [ActionServiceAsync.removePrivateWirelessGateway].
         */
        fun removePrivateWirelessGateway(
            id: String
        ): CompletableFuture<HttpResponseFor<ActionRemovePrivateWirelessGatewayResponse>> =
            removePrivateWirelessGateway(id, ActionRemovePrivateWirelessGatewayParams.none())

        /** @see removePrivateWirelessGateway */
        fun removePrivateWirelessGateway(
            id: String,
            params: ActionRemovePrivateWirelessGatewayParams =
                ActionRemovePrivateWirelessGatewayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemovePrivateWirelessGatewayResponse>> =
            removePrivateWirelessGateway(params.toBuilder().id(id).build(), requestOptions)

        /** @see removePrivateWirelessGateway */
        fun removePrivateWirelessGateway(
            id: String,
            params: ActionRemovePrivateWirelessGatewayParams =
                ActionRemovePrivateWirelessGatewayParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemovePrivateWirelessGatewayResponse>> =
            removePrivateWirelessGateway(id, params, RequestOptions.none())

        /** @see removePrivateWirelessGateway */
        fun removePrivateWirelessGateway(
            params: ActionRemovePrivateWirelessGatewayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemovePrivateWirelessGatewayResponse>>

        /** @see removePrivateWirelessGateway */
        fun removePrivateWirelessGateway(
            params: ActionRemovePrivateWirelessGatewayParams
        ): CompletableFuture<HttpResponseFor<ActionRemovePrivateWirelessGatewayResponse>> =
            removePrivateWirelessGateway(params, RequestOptions.none())

        /** @see removePrivateWirelessGateway */
        fun removePrivateWirelessGateway(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRemovePrivateWirelessGatewayResponse>> =
            removePrivateWirelessGateway(
                id,
                ActionRemovePrivateWirelessGatewayParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /sim_card_groups/{id}/actions/remove_wireless_blocklist`, but is otherwise the same as
         * [ActionServiceAsync.removeWirelessBlocklist].
         */
        fun removeWirelessBlocklist(
            id: String
        ): CompletableFuture<HttpResponseFor<ActionRemoveWirelessBlocklistResponse>> =
            removeWirelessBlocklist(id, ActionRemoveWirelessBlocklistParams.none())

        /** @see removeWirelessBlocklist */
        fun removeWirelessBlocklist(
            id: String,
            params: ActionRemoveWirelessBlocklistParams =
                ActionRemoveWirelessBlocklistParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemoveWirelessBlocklistResponse>> =
            removeWirelessBlocklist(params.toBuilder().id(id).build(), requestOptions)

        /** @see removeWirelessBlocklist */
        fun removeWirelessBlocklist(
            id: String,
            params: ActionRemoveWirelessBlocklistParams = ActionRemoveWirelessBlocklistParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemoveWirelessBlocklistResponse>> =
            removeWirelessBlocklist(id, params, RequestOptions.none())

        /** @see removeWirelessBlocklist */
        fun removeWirelessBlocklist(
            params: ActionRemoveWirelessBlocklistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemoveWirelessBlocklistResponse>>

        /** @see removeWirelessBlocklist */
        fun removeWirelessBlocklist(
            params: ActionRemoveWirelessBlocklistParams
        ): CompletableFuture<HttpResponseFor<ActionRemoveWirelessBlocklistResponse>> =
            removeWirelessBlocklist(params, RequestOptions.none())

        /** @see removeWirelessBlocklist */
        fun removeWirelessBlocklist(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRemoveWirelessBlocklistResponse>> =
            removeWirelessBlocklist(id, ActionRemoveWirelessBlocklistParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /sim_card_groups/{id}/actions/set_private_wireless_gateway`, but is otherwise the same as
         * [ActionServiceAsync.setPrivateWirelessGateway].
         */
        fun setPrivateWirelessGateway(
            id: String,
            params: ActionSetPrivateWirelessGatewayParams,
        ): CompletableFuture<HttpResponseFor<ActionSetPrivateWirelessGatewayResponse>> =
            setPrivateWirelessGateway(id, params, RequestOptions.none())

        /** @see setPrivateWirelessGateway */
        fun setPrivateWirelessGateway(
            id: String,
            params: ActionSetPrivateWirelessGatewayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetPrivateWirelessGatewayResponse>> =
            setPrivateWirelessGateway(params.toBuilder().id(id).build(), requestOptions)

        /** @see setPrivateWirelessGateway */
        fun setPrivateWirelessGateway(
            params: ActionSetPrivateWirelessGatewayParams
        ): CompletableFuture<HttpResponseFor<ActionSetPrivateWirelessGatewayResponse>> =
            setPrivateWirelessGateway(params, RequestOptions.none())

        /** @see setPrivateWirelessGateway */
        fun setPrivateWirelessGateway(
            params: ActionSetPrivateWirelessGatewayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetPrivateWirelessGatewayResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /sim_card_groups/{id}/actions/set_wireless_blocklist`, but is otherwise the same as
         * [ActionServiceAsync.setWirelessBlocklist].
         */
        fun setWirelessBlocklist(
            id: String,
            params: ActionSetWirelessBlocklistParams,
        ): CompletableFuture<HttpResponseFor<ActionSetWirelessBlocklistResponse>> =
            setWirelessBlocklist(id, params, RequestOptions.none())

        /** @see setWirelessBlocklist */
        fun setWirelessBlocklist(
            id: String,
            params: ActionSetWirelessBlocklistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetWirelessBlocklistResponse>> =
            setWirelessBlocklist(params.toBuilder().id(id).build(), requestOptions)

        /** @see setWirelessBlocklist */
        fun setWirelessBlocklist(
            params: ActionSetWirelessBlocklistParams
        ): CompletableFuture<HttpResponseFor<ActionSetWirelessBlocklistResponse>> =
            setWirelessBlocklist(params, RequestOptions.none())

        /** @see setWirelessBlocklist */
        fun setWirelessBlocklist(
            params: ActionSetWirelessBlocklistParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetWirelessBlocklistResponse>>
    }
}
