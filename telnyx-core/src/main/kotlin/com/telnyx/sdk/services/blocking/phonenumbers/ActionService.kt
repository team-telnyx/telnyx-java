// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionChangeBundleStatusResponse
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionEnableEmergencyResponse
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipParams
import com.telnyx.sdk.models.phonenumbers.actions.ActionVerifyOwnershipResponse
import java.util.function.Consumer

/** Configure your phone numbers */
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
     * Change the bundle status for a phone number (set to being in a bundle or remove from a
     * bundle)
     */
    fun changeBundleStatus(
        id: String,
        params: ActionChangeBundleStatusParams,
    ): ActionChangeBundleStatusResponse = changeBundleStatus(id, params, RequestOptions.none())

    /** @see changeBundleStatus */
    fun changeBundleStatus(
        id: String,
        params: ActionChangeBundleStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionChangeBundleStatusResponse =
        changeBundleStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see changeBundleStatus */
    fun changeBundleStatus(
        params: ActionChangeBundleStatusParams
    ): ActionChangeBundleStatusResponse = changeBundleStatus(params, RequestOptions.none())

    /** @see changeBundleStatus */
    fun changeBundleStatus(
        params: ActionChangeBundleStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionChangeBundleStatusResponse

    /** Enable emergency for a phone number */
    fun enableEmergency(
        id: String,
        params: ActionEnableEmergencyParams,
    ): ActionEnableEmergencyResponse = enableEmergency(id, params, RequestOptions.none())

    /** @see enableEmergency */
    fun enableEmergency(
        id: String,
        params: ActionEnableEmergencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnableEmergencyResponse =
        enableEmergency(params.toBuilder().id(id).build(), requestOptions)

    /** @see enableEmergency */
    fun enableEmergency(params: ActionEnableEmergencyParams): ActionEnableEmergencyResponse =
        enableEmergency(params, RequestOptions.none())

    /** @see enableEmergency */
    fun enableEmergency(
        params: ActionEnableEmergencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionEnableEmergencyResponse

    /**
     * Verifies ownership of the provided phone numbers and returns a mapping of numbers to their
     * IDs, plus a list of numbers not found in the account.
     */
    fun verifyOwnership(params: ActionVerifyOwnershipParams): ActionVerifyOwnershipResponse =
        verifyOwnership(params, RequestOptions.none())

    /** @see verifyOwnership */
    fun verifyOwnership(
        params: ActionVerifyOwnershipParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionVerifyOwnershipResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /phone_numbers/{id}/actions/bundle_status_change`,
         * but is otherwise the same as [ActionService.changeBundleStatus].
         */
        @MustBeClosed
        fun changeBundleStatus(
            id: String,
            params: ActionChangeBundleStatusParams,
        ): HttpResponseFor<ActionChangeBundleStatusResponse> =
            changeBundleStatus(id, params, RequestOptions.none())

        /** @see changeBundleStatus */
        @MustBeClosed
        fun changeBundleStatus(
            id: String,
            params: ActionChangeBundleStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionChangeBundleStatusResponse> =
            changeBundleStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see changeBundleStatus */
        @MustBeClosed
        fun changeBundleStatus(
            params: ActionChangeBundleStatusParams
        ): HttpResponseFor<ActionChangeBundleStatusResponse> =
            changeBundleStatus(params, RequestOptions.none())

        /** @see changeBundleStatus */
        @MustBeClosed
        fun changeBundleStatus(
            params: ActionChangeBundleStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionChangeBundleStatusResponse>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/{id}/actions/enable_emergency`, but
         * is otherwise the same as [ActionService.enableEmergency].
         */
        @MustBeClosed
        fun enableEmergency(
            id: String,
            params: ActionEnableEmergencyParams,
        ): HttpResponseFor<ActionEnableEmergencyResponse> =
            enableEmergency(id, params, RequestOptions.none())

        /** @see enableEmergency */
        @MustBeClosed
        fun enableEmergency(
            id: String,
            params: ActionEnableEmergencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnableEmergencyResponse> =
            enableEmergency(params.toBuilder().id(id).build(), requestOptions)

        /** @see enableEmergency */
        @MustBeClosed
        fun enableEmergency(
            params: ActionEnableEmergencyParams
        ): HttpResponseFor<ActionEnableEmergencyResponse> =
            enableEmergency(params, RequestOptions.none())

        /** @see enableEmergency */
        @MustBeClosed
        fun enableEmergency(
            params: ActionEnableEmergencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionEnableEmergencyResponse>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/actions/verify_ownership`, but is
         * otherwise the same as [ActionService.verifyOwnership].
         */
        @MustBeClosed
        fun verifyOwnership(
            params: ActionVerifyOwnershipParams
        ): HttpResponseFor<ActionVerifyOwnershipResponse> =
            verifyOwnership(params, RequestOptions.none())

        /** @see verifyOwnership */
        @MustBeClosed
        fun verifyOwnership(
            params: ActionVerifyOwnershipParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionVerifyOwnershipResponse>
    }
}
