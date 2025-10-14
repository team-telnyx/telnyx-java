// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.simcards

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcards.actions.ActionBulkSetPublicIpsParams
import com.telnyx.sdk.models.simcards.actions.ActionBulkSetPublicIpsResponse
import com.telnyx.sdk.models.simcards.actions.ActionDisableParams
import com.telnyx.sdk.models.simcards.actions.ActionDisableResponse
import com.telnyx.sdk.models.simcards.actions.ActionEnableParams
import com.telnyx.sdk.models.simcards.actions.ActionEnableResponse
import com.telnyx.sdk.models.simcards.actions.ActionListParams
import com.telnyx.sdk.models.simcards.actions.ActionListResponse
import com.telnyx.sdk.models.simcards.actions.ActionRemovePublicIpParams
import com.telnyx.sdk.models.simcards.actions.ActionRemovePublicIpResponse
import com.telnyx.sdk.models.simcards.actions.ActionRetrieveParams
import com.telnyx.sdk.models.simcards.actions.ActionRetrieveResponse
import com.telnyx.sdk.models.simcards.actions.ActionSetPublicIpParams
import com.telnyx.sdk.models.simcards.actions.ActionSetPublicIpResponse
import com.telnyx.sdk.models.simcards.actions.ActionSetStandbyParams
import com.telnyx.sdk.models.simcards.actions.ActionSetStandbyResponse
import com.telnyx.sdk.models.simcards.actions.ActionValidateRegistrationCodesParams
import com.telnyx.sdk.models.simcards.actions.ActionValidateRegistrationCodesResponse
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
     * This API fetches detailed information about a SIM card action to follow-up on an existing
     * asynchronous operation.
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
     * This API lists a paginated collection of SIM card actions. It enables exploring a collection
     * of existing asynchronous operations using specific filters.
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
     * This API triggers an asynchronous operation to set a public IP for each of the specified SIM
     * cards.<br/> For each SIM Card a SIM Card Action will be generated. The status of the SIM Card
     * Action can be followed through the
     * [List SIM Card Action](https://developers.telnyx.com/api/wireless/list-sim-card-actions) API.
     */
    fun bulkSetPublicIps(
        params: ActionBulkSetPublicIpsParams
    ): CompletableFuture<ActionBulkSetPublicIpsResponse> =
        bulkSetPublicIps(params, RequestOptions.none())

    /** @see bulkSetPublicIps */
    fun bulkSetPublicIps(
        params: ActionBulkSetPublicIpsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionBulkSetPublicIpsResponse>

    /**
     * This API disables a SIM card, disconnecting it from the network and making it impossible to
     * consume data.<br/> The API will trigger an asynchronous operation called a SIM Card Action.
     * Transitioning to the disabled state may take a period of time. The status of the SIM Card
     * Action can be followed through the
     * [List SIM Card Action](https://developers.telnyx.com/api/wireless/list-sim-card-actions) API.
     */
    fun disable(id: String): CompletableFuture<ActionDisableResponse> =
        disable(id, ActionDisableParams.none())

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionDisableResponse> =
        disable(params.toBuilder().id(id).build(), requestOptions)

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
    ): CompletableFuture<ActionDisableResponse> = disable(id, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: ActionDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionDisableResponse>

    /** @see disable */
    fun disable(params: ActionDisableParams): CompletableFuture<ActionDisableResponse> =
        disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionDisableResponse> =
        disable(id, ActionDisableParams.none(), requestOptions)

    /**
     * This API enables a SIM card, connecting it to the network and making it possible to consume
     * data.<br/> To enable a SIM card, it must be associated with a SIM card group.<br/> The API
     * will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled
     * state may take a period of time. The status of the SIM Card Action can be followed through
     * the [List SIM Card Action](https://developers.telnyx.com/api/wireless/list-sim-card-actions)
     * API.
     */
    fun enable(id: String): CompletableFuture<ActionEnableResponse> =
        enable(id, ActionEnableParams.none())

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnableResponse> =
        enable(params.toBuilder().id(id).build(), requestOptions)

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
    ): CompletableFuture<ActionEnableResponse> = enable(id, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: ActionEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnableResponse>

    /** @see enable */
    fun enable(params: ActionEnableParams): CompletableFuture<ActionEnableResponse> =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionEnableResponse> =
        enable(id, ActionEnableParams.none(), requestOptions)

    /**
     * This API removes an existing public IP from a SIM card. <br/><br/> The API will trigger an
     * asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be
     * followed through the
     * [List SIM Card Action](https://developers.telnyx.com/api/wireless/list-sim-card-actions) API.
     */
    fun removePublicIp(id: String): CompletableFuture<ActionRemovePublicIpResponse> =
        removePublicIp(id, ActionRemovePublicIpParams.none())

    /** @see removePublicIp */
    fun removePublicIp(
        id: String,
        params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemovePublicIpResponse> =
        removePublicIp(params.toBuilder().id(id).build(), requestOptions)

    /** @see removePublicIp */
    fun removePublicIp(
        id: String,
        params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
    ): CompletableFuture<ActionRemovePublicIpResponse> =
        removePublicIp(id, params, RequestOptions.none())

    /** @see removePublicIp */
    fun removePublicIp(
        params: ActionRemovePublicIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionRemovePublicIpResponse>

    /** @see removePublicIp */
    fun removePublicIp(
        params: ActionRemovePublicIpParams
    ): CompletableFuture<ActionRemovePublicIpResponse> =
        removePublicIp(params, RequestOptions.none())

    /** @see removePublicIp */
    fun removePublicIp(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRemovePublicIpResponse> =
        removePublicIp(id, ActionRemovePublicIpParams.none(), requestOptions)

    /**
     * This API makes a SIM card reachable on the public internet by mapping a random public IP to
     * the SIM card. <br/><br/> The API will trigger an asynchronous operation called a SIM Card
     * Action. The status of the SIM Card Action can be followed through the
     * [List SIM Card Action](https://developers.telnyx.com/api/wireless/list-sim-card-actions) API.
     * <br/><br/> Setting a Public IP to a SIM Card incurs a charge and will only succeed if the
     * account has sufficient funds.
     */
    fun setPublicIp(id: String): CompletableFuture<ActionSetPublicIpResponse> =
        setPublicIp(id, ActionSetPublicIpParams.none())

    /** @see setPublicIp */
    fun setPublicIp(
        id: String,
        params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetPublicIpResponse> =
        setPublicIp(params.toBuilder().id(id).build(), requestOptions)

    /** @see setPublicIp */
    fun setPublicIp(
        id: String,
        params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
    ): CompletableFuture<ActionSetPublicIpResponse> = setPublicIp(id, params, RequestOptions.none())

    /** @see setPublicIp */
    fun setPublicIp(
        params: ActionSetPublicIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetPublicIpResponse>

    /** @see setPublicIp */
    fun setPublicIp(params: ActionSetPublicIpParams): CompletableFuture<ActionSetPublicIpResponse> =
        setPublicIp(params, RequestOptions.none())

    /** @see setPublicIp */
    fun setPublicIp(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSetPublicIpResponse> =
        setPublicIp(id, ActionSetPublicIpParams.none(), requestOptions)

    /**
     * The SIM card will be able to connect to the network once the process to set it to standby has
     * been completed, thus making it possible to consume data.<br/> To set a SIM card to standby,
     * it must be associated with SIM card group.<br/> The API will trigger an asynchronous
     * operation called a SIM Card Action. Transitioning to the standby state may take a period of
     * time. The status of the SIM Card Action can be followed through the
     * [List SIM Card Action](https://developers.telnyx.com/api/wireless/list-sim-card-actions) API.
     */
    fun setStandby(id: String): CompletableFuture<ActionSetStandbyResponse> =
        setStandby(id, ActionSetStandbyParams.none())

    /** @see setStandby */
    fun setStandby(
        id: String,
        params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetStandbyResponse> =
        setStandby(params.toBuilder().id(id).build(), requestOptions)

    /** @see setStandby */
    fun setStandby(
        id: String,
        params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
    ): CompletableFuture<ActionSetStandbyResponse> = setStandby(id, params, RequestOptions.none())

    /** @see setStandby */
    fun setStandby(
        params: ActionSetStandbyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionSetStandbyResponse>

    /** @see setStandby */
    fun setStandby(params: ActionSetStandbyParams): CompletableFuture<ActionSetStandbyResponse> =
        setStandby(params, RequestOptions.none())

    /** @see setStandby */
    fun setStandby(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSetStandbyResponse> =
        setStandby(id, ActionSetStandbyParams.none(), requestOptions)

    /** It validates whether SIM card registration codes are valid or not. */
    fun validateRegistrationCodes(): CompletableFuture<ActionValidateRegistrationCodesResponse> =
        validateRegistrationCodes(ActionValidateRegistrationCodesParams.none())

    /** @see validateRegistrationCodes */
    fun validateRegistrationCodes(
        params: ActionValidateRegistrationCodesParams =
            ActionValidateRegistrationCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionValidateRegistrationCodesResponse>

    /** @see validateRegistrationCodes */
    fun validateRegistrationCodes(
        params: ActionValidateRegistrationCodesParams = ActionValidateRegistrationCodesParams.none()
    ): CompletableFuture<ActionValidateRegistrationCodesResponse> =
        validateRegistrationCodes(params, RequestOptions.none())

    /** @see validateRegistrationCodes */
    fun validateRegistrationCodes(
        requestOptions: RequestOptions
    ): CompletableFuture<ActionValidateRegistrationCodesResponse> =
        validateRegistrationCodes(ActionValidateRegistrationCodesParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /sim_card_actions/{id}`, but is otherwise the same
         * as [ActionServiceAsync.retrieve].
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
         * Returns a raw HTTP response for `get /sim_card_actions`, but is otherwise the same as
         * [ActionServiceAsync.list].
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
         * Returns a raw HTTP response for `post /sim_cards/actions/bulk_set_public_ips`, but is
         * otherwise the same as [ActionServiceAsync.bulkSetPublicIps].
         */
        fun bulkSetPublicIps(
            params: ActionBulkSetPublicIpsParams
        ): CompletableFuture<HttpResponseFor<ActionBulkSetPublicIpsResponse>> =
            bulkSetPublicIps(params, RequestOptions.none())

        /** @see bulkSetPublicIps */
        fun bulkSetPublicIps(
            params: ActionBulkSetPublicIpsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionBulkSetPublicIpsResponse>>

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/disable`, but is otherwise
         * the same as [ActionServiceAsync.disable].
         */
        fun disable(id: String): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(id, ActionDisableParams.none())

        /** @see disable */
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(params.toBuilder().id(id).build(), requestOptions)

        /** @see disable */
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(id, params, RequestOptions.none())

        /** @see disable */
        fun disable(
            params: ActionDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>>

        /** @see disable */
        fun disable(
            params: ActionDisableParams
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(params, RequestOptions.none())

        /** @see disable */
        fun disable(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionDisableResponse>> =
            disable(id, ActionDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/enable`, but is otherwise
         * the same as [ActionServiceAsync.enable].
         */
        fun enable(id: String): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(id, ActionEnableParams.none())

        /** @see enable */
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(params.toBuilder().id(id).build(), requestOptions)

        /** @see enable */
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(id, params, RequestOptions.none())

        /** @see enable */
        fun enable(
            params: ActionEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>>

        /** @see enable */
        fun enable(
            params: ActionEnableParams
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(params, RequestOptions.none())

        /** @see enable */
        fun enable(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionEnableResponse>> =
            enable(id, ActionEnableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/remove_public_ip`, but is
         * otherwise the same as [ActionServiceAsync.removePublicIp].
         */
        fun removePublicIp(
            id: String
        ): CompletableFuture<HttpResponseFor<ActionRemovePublicIpResponse>> =
            removePublicIp(id, ActionRemovePublicIpParams.none())

        /** @see removePublicIp */
        fun removePublicIp(
            id: String,
            params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemovePublicIpResponse>> =
            removePublicIp(params.toBuilder().id(id).build(), requestOptions)

        /** @see removePublicIp */
        fun removePublicIp(
            id: String,
            params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemovePublicIpResponse>> =
            removePublicIp(id, params, RequestOptions.none())

        /** @see removePublicIp */
        fun removePublicIp(
            params: ActionRemovePublicIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionRemovePublicIpResponse>>

        /** @see removePublicIp */
        fun removePublicIp(
            params: ActionRemovePublicIpParams
        ): CompletableFuture<HttpResponseFor<ActionRemovePublicIpResponse>> =
            removePublicIp(params, RequestOptions.none())

        /** @see removePublicIp */
        fun removePublicIp(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRemovePublicIpResponse>> =
            removePublicIp(id, ActionRemovePublicIpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/set_public_ip`, but is
         * otherwise the same as [ActionServiceAsync.setPublicIp].
         */
        fun setPublicIp(id: String): CompletableFuture<HttpResponseFor<ActionSetPublicIpResponse>> =
            setPublicIp(id, ActionSetPublicIpParams.none())

        /** @see setPublicIp */
        fun setPublicIp(
            id: String,
            params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetPublicIpResponse>> =
            setPublicIp(params.toBuilder().id(id).build(), requestOptions)

        /** @see setPublicIp */
        fun setPublicIp(
            id: String,
            params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetPublicIpResponse>> =
            setPublicIp(id, params, RequestOptions.none())

        /** @see setPublicIp */
        fun setPublicIp(
            params: ActionSetPublicIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetPublicIpResponse>>

        /** @see setPublicIp */
        fun setPublicIp(
            params: ActionSetPublicIpParams
        ): CompletableFuture<HttpResponseFor<ActionSetPublicIpResponse>> =
            setPublicIp(params, RequestOptions.none())

        /** @see setPublicIp */
        fun setPublicIp(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSetPublicIpResponse>> =
            setPublicIp(id, ActionSetPublicIpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/set_standby`, but is
         * otherwise the same as [ActionServiceAsync.setStandby].
         */
        fun setStandby(id: String): CompletableFuture<HttpResponseFor<ActionSetStandbyResponse>> =
            setStandby(id, ActionSetStandbyParams.none())

        /** @see setStandby */
        fun setStandby(
            id: String,
            params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetStandbyResponse>> =
            setStandby(params.toBuilder().id(id).build(), requestOptions)

        /** @see setStandby */
        fun setStandby(
            id: String,
            params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetStandbyResponse>> =
            setStandby(id, params, RequestOptions.none())

        /** @see setStandby */
        fun setStandby(
            params: ActionSetStandbyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionSetStandbyResponse>>

        /** @see setStandby */
        fun setStandby(
            params: ActionSetStandbyParams
        ): CompletableFuture<HttpResponseFor<ActionSetStandbyResponse>> =
            setStandby(params, RequestOptions.none())

        /** @see setStandby */
        fun setStandby(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSetStandbyResponse>> =
            setStandby(id, ActionSetStandbyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/actions/validate_registration_codes`,
         * but is otherwise the same as [ActionServiceAsync.validateRegistrationCodes].
         */
        fun validateRegistrationCodes():
            CompletableFuture<HttpResponseFor<ActionValidateRegistrationCodesResponse>> =
            validateRegistrationCodes(ActionValidateRegistrationCodesParams.none())

        /** @see validateRegistrationCodes */
        fun validateRegistrationCodes(
            params: ActionValidateRegistrationCodesParams =
                ActionValidateRegistrationCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionValidateRegistrationCodesResponse>>

        /** @see validateRegistrationCodes */
        fun validateRegistrationCodes(
            params: ActionValidateRegistrationCodesParams =
                ActionValidateRegistrationCodesParams.none()
        ): CompletableFuture<HttpResponseFor<ActionValidateRegistrationCodesResponse>> =
            validateRegistrationCodes(params, RequestOptions.none())

        /** @see validateRegistrationCodes */
        fun validateRegistrationCodes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ActionValidateRegistrationCodesResponse>> =
            validateRegistrationCodes(ActionValidateRegistrationCodesParams.none(), requestOptions)
    }
}
