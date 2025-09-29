// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.simcards

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /**
     * This API fetches detailed information about a SIM card action to follow-up on an existing
     * asynchronous operation.
     */
    fun retrieve(id: String): ActionRetrieveResponse = retrieve(id, ActionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ActionRetrieveParams = ActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ActionRetrieveParams = ActionRetrieveParams.none(),
    ): ActionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ActionRetrieveParams): ActionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ActionRetrieveResponse =
        retrieve(id, ActionRetrieveParams.none(), requestOptions)

    /**
     * This API lists a paginated collection of SIM card actions. It enables exploring a collection
     * of existing asynchronous operations using specific filters.
     */
    fun list(): ActionListResponse = list(ActionListParams.none())

    /** @see list */
    fun list(
        params: ActionListParams = ActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionListResponse

    /** @see list */
    fun list(params: ActionListParams = ActionListParams.none()): ActionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ActionListResponse =
        list(ActionListParams.none(), requestOptions)

    /**
     * This API triggers an asynchronous operation to set a public IP for each of the specified SIM
     * cards.<br/> For each SIM Card a SIM Card Action will be generated. The status of the SIM Card
     * Action can be followed through the
     * [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions)
     * API.
     */
    fun bulkSetPublicIps(params: ActionBulkSetPublicIpsParams): ActionBulkSetPublicIpsResponse =
        bulkSetPublicIps(params, RequestOptions.none())

    /** @see bulkSetPublicIps */
    fun bulkSetPublicIps(
        params: ActionBulkSetPublicIpsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionBulkSetPublicIpsResponse

    /**
     * This API disables a SIM card, disconnecting it from the network and making it impossible to
     * consume data.<br/> The API will trigger an asynchronous operation called a SIM Card Action.
     * Transitioning to the disabled state may take a period of time. The status of the SIM Card
     * Action can be followed through the
     * [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions)
     * API.
     */
    fun disable(id: String): ActionDisableResponse = disable(id, ActionDisableParams.none())

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionDisableResponse = disable(params.toBuilder().id(id).build(), requestOptions)

    /** @see disable */
    fun disable(
        id: String,
        params: ActionDisableParams = ActionDisableParams.none(),
    ): ActionDisableResponse = disable(id, params, RequestOptions.none())

    /** @see disable */
    fun disable(
        params: ActionDisableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionDisableResponse

    /** @see disable */
    fun disable(params: ActionDisableParams): ActionDisableResponse =
        disable(params, RequestOptions.none())

    /** @see disable */
    fun disable(id: String, requestOptions: RequestOptions): ActionDisableResponse =
        disable(id, ActionDisableParams.none(), requestOptions)

    /**
     * This API enables a SIM card, connecting it to the network and making it possible to consume
     * data.<br/> To enable a SIM card, it must be associated with a SIM card group.<br/> The API
     * will trigger an asynchronous operation called a SIM Card Action. Transitioning to the enabled
     * state may take a period of time. The status of the SIM Card Action can be followed through
     * the
     * [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions)
     * API.
     */
    fun enable(id: String): ActionEnableResponse = enable(id, ActionEnableParams.none())

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnableResponse = enable(params.toBuilder().id(id).build(), requestOptions)

    /** @see enable */
    fun enable(
        id: String,
        params: ActionEnableParams = ActionEnableParams.none(),
    ): ActionEnableResponse = enable(id, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: ActionEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnableResponse

    /** @see enable */
    fun enable(params: ActionEnableParams): ActionEnableResponse =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(id: String, requestOptions: RequestOptions): ActionEnableResponse =
        enable(id, ActionEnableParams.none(), requestOptions)

    /**
     * This API removes an existing public IP from a SIM card. <br/><br/> The API will trigger an
     * asynchronous operation called a SIM Card Action. The status of the SIM Card Action can be
     * followed through the
     * [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions)
     * API.
     */
    fun removePublicIp(id: String): ActionRemovePublicIpResponse =
        removePublicIp(id, ActionRemovePublicIpParams.none())

    /** @see removePublicIp */
    fun removePublicIp(
        id: String,
        params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRemovePublicIpResponse =
        removePublicIp(params.toBuilder().id(id).build(), requestOptions)

    /** @see removePublicIp */
    fun removePublicIp(
        id: String,
        params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
    ): ActionRemovePublicIpResponse = removePublicIp(id, params, RequestOptions.none())

    /** @see removePublicIp */
    fun removePublicIp(
        params: ActionRemovePublicIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRemovePublicIpResponse

    /** @see removePublicIp */
    fun removePublicIp(params: ActionRemovePublicIpParams): ActionRemovePublicIpResponse =
        removePublicIp(params, RequestOptions.none())

    /** @see removePublicIp */
    fun removePublicIp(id: String, requestOptions: RequestOptions): ActionRemovePublicIpResponse =
        removePublicIp(id, ActionRemovePublicIpParams.none(), requestOptions)

    /**
     * This API makes a SIM card reachable on the public internet by mapping a random public IP to
     * the SIM card. <br/><br/> The API will trigger an asynchronous operation called a SIM Card
     * Action. The status of the SIM Card Action can be followed through the
     * [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions)
     * API. <br/><br/> Setting a Public IP to a SIM Card incurs a charge and will only succeed if
     * the account has sufficient funds.
     */
    fun setPublicIp(id: String): ActionSetPublicIpResponse =
        setPublicIp(id, ActionSetPublicIpParams.none())

    /** @see setPublicIp */
    fun setPublicIp(
        id: String,
        params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSetPublicIpResponse = setPublicIp(params.toBuilder().id(id).build(), requestOptions)

    /** @see setPublicIp */
    fun setPublicIp(
        id: String,
        params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
    ): ActionSetPublicIpResponse = setPublicIp(id, params, RequestOptions.none())

    /** @see setPublicIp */
    fun setPublicIp(
        params: ActionSetPublicIpParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSetPublicIpResponse

    /** @see setPublicIp */
    fun setPublicIp(params: ActionSetPublicIpParams): ActionSetPublicIpResponse =
        setPublicIp(params, RequestOptions.none())

    /** @see setPublicIp */
    fun setPublicIp(id: String, requestOptions: RequestOptions): ActionSetPublicIpResponse =
        setPublicIp(id, ActionSetPublicIpParams.none(), requestOptions)

    /**
     * The SIM card will be able to connect to the network once the process to set it to standby has
     * been completed, thus making it possible to consume data.<br/> To set a SIM card to standby,
     * it must be associated with SIM card group.<br/> The API will trigger an asynchronous
     * operation called a SIM Card Action. Transitioning to the standby state may take a period of
     * time. The status of the SIM Card Action can be followed through the
     * [List SIM Card Action](https://developersdev.telnyx.com/docs/api/v2/wireless/SIM-Card-Actions#ListSIMCardActions)
     * API.
     */
    fun setStandby(id: String): ActionSetStandbyResponse =
        setStandby(id, ActionSetStandbyParams.none())

    /** @see setStandby */
    fun setStandby(
        id: String,
        params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSetStandbyResponse = setStandby(params.toBuilder().id(id).build(), requestOptions)

    /** @see setStandby */
    fun setStandby(
        id: String,
        params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
    ): ActionSetStandbyResponse = setStandby(id, params, RequestOptions.none())

    /** @see setStandby */
    fun setStandby(
        params: ActionSetStandbyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionSetStandbyResponse

    /** @see setStandby */
    fun setStandby(params: ActionSetStandbyParams): ActionSetStandbyResponse =
        setStandby(params, RequestOptions.none())

    /** @see setStandby */
    fun setStandby(id: String, requestOptions: RequestOptions): ActionSetStandbyResponse =
        setStandby(id, ActionSetStandbyParams.none(), requestOptions)

    /** It validates whether SIM card registration codes are valid or not. */
    fun validateRegistrationCodes(): ActionValidateRegistrationCodesResponse =
        validateRegistrationCodes(ActionValidateRegistrationCodesParams.none())

    /** @see validateRegistrationCodes */
    fun validateRegistrationCodes(
        params: ActionValidateRegistrationCodesParams =
            ActionValidateRegistrationCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionValidateRegistrationCodesResponse

    /** @see validateRegistrationCodes */
    fun validateRegistrationCodes(
        params: ActionValidateRegistrationCodesParams = ActionValidateRegistrationCodesParams.none()
    ): ActionValidateRegistrationCodesResponse =
        validateRegistrationCodes(params, RequestOptions.none())

    /** @see validateRegistrationCodes */
    fun validateRegistrationCodes(
        requestOptions: RequestOptions
    ): ActionValidateRegistrationCodesResponse =
        validateRegistrationCodes(ActionValidateRegistrationCodesParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /sim_card_actions/{id}`, but is otherwise the same
         * as [ActionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(id, ActionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ActionRetrieveParams = ActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ActionRetrieveParams = ActionRetrieveParams.none(),
        ): HttpResponseFor<ActionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ActionRetrieveParams): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(id, ActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_card_actions`, but is otherwise the same as
         * [ActionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ActionListResponse> = list(ActionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ActionListParams = ActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ActionListParams = ActionListParams.none()
        ): HttpResponseFor<ActionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ActionListResponse> =
            list(ActionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/actions/bulk_set_public_ips`, but is
         * otherwise the same as [ActionService.bulkSetPublicIps].
         */
        @MustBeClosed
        fun bulkSetPublicIps(
            params: ActionBulkSetPublicIpsParams
        ): HttpResponseFor<ActionBulkSetPublicIpsResponse> =
            bulkSetPublicIps(params, RequestOptions.none())

        /** @see bulkSetPublicIps */
        @MustBeClosed
        fun bulkSetPublicIps(
            params: ActionBulkSetPublicIpsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionBulkSetPublicIpsResponse>

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/disable`, but is otherwise
         * the same as [ActionService.disable].
         */
        @MustBeClosed
        fun disable(id: String): HttpResponseFor<ActionDisableResponse> =
            disable(id, ActionDisableParams.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionDisableResponse> =
            disable(params.toBuilder().id(id).build(), requestOptions)

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            params: ActionDisableParams = ActionDisableParams.none(),
        ): HttpResponseFor<ActionDisableResponse> = disable(id, params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            params: ActionDisableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionDisableResponse>

        /** @see disable */
        @MustBeClosed
        fun disable(params: ActionDisableParams): HttpResponseFor<ActionDisableResponse> =
            disable(params, RequestOptions.none())

        /** @see disable */
        @MustBeClosed
        fun disable(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionDisableResponse> =
            disable(id, ActionDisableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/enable`, but is otherwise
         * the same as [ActionService.enable].
         */
        @MustBeClosed
        fun enable(id: String): HttpResponseFor<ActionEnableResponse> =
            enable(id, ActionEnableParams.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnableResponse> =
            enable(params.toBuilder().id(id).build(), requestOptions)

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            params: ActionEnableParams = ActionEnableParams.none(),
        ): HttpResponseFor<ActionEnableResponse> = enable(id, params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            params: ActionEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnableResponse>

        /** @see enable */
        @MustBeClosed
        fun enable(params: ActionEnableParams): HttpResponseFor<ActionEnableResponse> =
            enable(params, RequestOptions.none())

        /** @see enable */
        @MustBeClosed
        fun enable(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionEnableResponse> =
            enable(id, ActionEnableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/remove_public_ip`, but is
         * otherwise the same as [ActionService.removePublicIp].
         */
        @MustBeClosed
        fun removePublicIp(id: String): HttpResponseFor<ActionRemovePublicIpResponse> =
            removePublicIp(id, ActionRemovePublicIpParams.none())

        /** @see removePublicIp */
        @MustBeClosed
        fun removePublicIp(
            id: String,
            params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRemovePublicIpResponse> =
            removePublicIp(params.toBuilder().id(id).build(), requestOptions)

        /** @see removePublicIp */
        @MustBeClosed
        fun removePublicIp(
            id: String,
            params: ActionRemovePublicIpParams = ActionRemovePublicIpParams.none(),
        ): HttpResponseFor<ActionRemovePublicIpResponse> =
            removePublicIp(id, params, RequestOptions.none())

        /** @see removePublicIp */
        @MustBeClosed
        fun removePublicIp(
            params: ActionRemovePublicIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRemovePublicIpResponse>

        /** @see removePublicIp */
        @MustBeClosed
        fun removePublicIp(
            params: ActionRemovePublicIpParams
        ): HttpResponseFor<ActionRemovePublicIpResponse> =
            removePublicIp(params, RequestOptions.none())

        /** @see removePublicIp */
        @MustBeClosed
        fun removePublicIp(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRemovePublicIpResponse> =
            removePublicIp(id, ActionRemovePublicIpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/set_public_ip`, but is
         * otherwise the same as [ActionService.setPublicIp].
         */
        @MustBeClosed
        fun setPublicIp(id: String): HttpResponseFor<ActionSetPublicIpResponse> =
            setPublicIp(id, ActionSetPublicIpParams.none())

        /** @see setPublicIp */
        @MustBeClosed
        fun setPublicIp(
            id: String,
            params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSetPublicIpResponse> =
            setPublicIp(params.toBuilder().id(id).build(), requestOptions)

        /** @see setPublicIp */
        @MustBeClosed
        fun setPublicIp(
            id: String,
            params: ActionSetPublicIpParams = ActionSetPublicIpParams.none(),
        ): HttpResponseFor<ActionSetPublicIpResponse> =
            setPublicIp(id, params, RequestOptions.none())

        /** @see setPublicIp */
        @MustBeClosed
        fun setPublicIp(
            params: ActionSetPublicIpParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSetPublicIpResponse>

        /** @see setPublicIp */
        @MustBeClosed
        fun setPublicIp(
            params: ActionSetPublicIpParams
        ): HttpResponseFor<ActionSetPublicIpResponse> = setPublicIp(params, RequestOptions.none())

        /** @see setPublicIp */
        @MustBeClosed
        fun setPublicIp(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionSetPublicIpResponse> =
            setPublicIp(id, ActionSetPublicIpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/{id}/actions/set_standby`, but is
         * otherwise the same as [ActionService.setStandby].
         */
        @MustBeClosed
        fun setStandby(id: String): HttpResponseFor<ActionSetStandbyResponse> =
            setStandby(id, ActionSetStandbyParams.none())

        /** @see setStandby */
        @MustBeClosed
        fun setStandby(
            id: String,
            params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSetStandbyResponse> =
            setStandby(params.toBuilder().id(id).build(), requestOptions)

        /** @see setStandby */
        @MustBeClosed
        fun setStandby(
            id: String,
            params: ActionSetStandbyParams = ActionSetStandbyParams.none(),
        ): HttpResponseFor<ActionSetStandbyResponse> = setStandby(id, params, RequestOptions.none())

        /** @see setStandby */
        @MustBeClosed
        fun setStandby(
            params: ActionSetStandbyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionSetStandbyResponse>

        /** @see setStandby */
        @MustBeClosed
        fun setStandby(params: ActionSetStandbyParams): HttpResponseFor<ActionSetStandbyResponse> =
            setStandby(params, RequestOptions.none())

        /** @see setStandby */
        @MustBeClosed
        fun setStandby(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionSetStandbyResponse> =
            setStandby(id, ActionSetStandbyParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sim_cards/actions/validate_registration_codes`,
         * but is otherwise the same as [ActionService.validateRegistrationCodes].
         */
        @MustBeClosed
        fun validateRegistrationCodes(): HttpResponseFor<ActionValidateRegistrationCodesResponse> =
            validateRegistrationCodes(ActionValidateRegistrationCodesParams.none())

        /** @see validateRegistrationCodes */
        @MustBeClosed
        fun validateRegistrationCodes(
            params: ActionValidateRegistrationCodesParams =
                ActionValidateRegistrationCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionValidateRegistrationCodesResponse>

        /** @see validateRegistrationCodes */
        @MustBeClosed
        fun validateRegistrationCodes(
            params: ActionValidateRegistrationCodesParams =
                ActionValidateRegistrationCodesParams.none()
        ): HttpResponseFor<ActionValidateRegistrationCodesResponse> =
            validateRegistrationCodes(params, RequestOptions.none())

        /** @see validateRegistrationCodes */
        @MustBeClosed
        fun validateRegistrationCodes(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActionValidateRegistrationCodesResponse> =
            validateRegistrationCodes(ActionValidateRegistrationCodesParams.none(), requestOptions)
    }
}
