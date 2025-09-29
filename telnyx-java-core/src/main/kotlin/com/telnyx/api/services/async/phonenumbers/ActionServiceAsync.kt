// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.phonenumbers.actions.ActionChangeBundleStatusParams
import com.telnyx.api.models.phonenumbers.actions.ActionChangeBundleStatusResponse
import com.telnyx.api.models.phonenumbers.actions.ActionEnableEmergencyParams
import com.telnyx.api.models.phonenumbers.actions.ActionEnableEmergencyResponse
import com.telnyx.api.models.phonenumbers.actions.ActionVerifyOwnershipParams
import com.telnyx.api.models.phonenumbers.actions.ActionVerifyOwnershipResponse
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
     * Change the bundle status for a phone number (set to being in a bundle or remove from a
     * bundle)
     */
    fun changeBundleStatus(
        id: String,
        params: ActionChangeBundleStatusParams,
    ): CompletableFuture<ActionChangeBundleStatusResponse> =
        changeBundleStatus(id, params, RequestOptions.none())

    /** @see changeBundleStatus */
    fun changeBundleStatus(
        id: String,
        params: ActionChangeBundleStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionChangeBundleStatusResponse> =
        changeBundleStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see changeBundleStatus */
    fun changeBundleStatus(
        params: ActionChangeBundleStatusParams
    ): CompletableFuture<ActionChangeBundleStatusResponse> =
        changeBundleStatus(params, RequestOptions.none())

    /** @see changeBundleStatus */
    fun changeBundleStatus(
        params: ActionChangeBundleStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionChangeBundleStatusResponse>

    /** Enable emergency for a phone number */
    fun enableEmergency(
        id: String,
        params: ActionEnableEmergencyParams,
    ): CompletableFuture<ActionEnableEmergencyResponse> =
        enableEmergency(id, params, RequestOptions.none())

    /** @see enableEmergency */
    fun enableEmergency(
        id: String,
        params: ActionEnableEmergencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnableEmergencyResponse> =
        enableEmergency(params.toBuilder().id(id).build(), requestOptions)

    /** @see enableEmergency */
    fun enableEmergency(
        params: ActionEnableEmergencyParams
    ): CompletableFuture<ActionEnableEmergencyResponse> =
        enableEmergency(params, RequestOptions.none())

    /** @see enableEmergency */
    fun enableEmergency(
        params: ActionEnableEmergencyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionEnableEmergencyResponse>

    /**
     * Verifies ownership of the provided phone numbers and returns a mapping of numbers to their
     * IDs, plus a list of numbers not found in the account.
     */
    fun verifyOwnership(
        params: ActionVerifyOwnershipParams
    ): CompletableFuture<ActionVerifyOwnershipResponse> =
        verifyOwnership(params, RequestOptions.none())

    /** @see verifyOwnership */
    fun verifyOwnership(
        params: ActionVerifyOwnershipParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionVerifyOwnershipResponse>

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
         * Returns a raw HTTP response for `patch /phone_numbers/{id}/actions/bundle_status_change`,
         * but is otherwise the same as [ActionServiceAsync.changeBundleStatus].
         */
        fun changeBundleStatus(
            id: String,
            params: ActionChangeBundleStatusParams,
        ): CompletableFuture<HttpResponseFor<ActionChangeBundleStatusResponse>> =
            changeBundleStatus(id, params, RequestOptions.none())

        /** @see changeBundleStatus */
        fun changeBundleStatus(
            id: String,
            params: ActionChangeBundleStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionChangeBundleStatusResponse>> =
            changeBundleStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see changeBundleStatus */
        fun changeBundleStatus(
            params: ActionChangeBundleStatusParams
        ): CompletableFuture<HttpResponseFor<ActionChangeBundleStatusResponse>> =
            changeBundleStatus(params, RequestOptions.none())

        /** @see changeBundleStatus */
        fun changeBundleStatus(
            params: ActionChangeBundleStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionChangeBundleStatusResponse>>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/{id}/actions/enable_emergency`, but
         * is otherwise the same as [ActionServiceAsync.enableEmergency].
         */
        fun enableEmergency(
            id: String,
            params: ActionEnableEmergencyParams,
        ): CompletableFuture<HttpResponseFor<ActionEnableEmergencyResponse>> =
            enableEmergency(id, params, RequestOptions.none())

        /** @see enableEmergency */
        fun enableEmergency(
            id: String,
            params: ActionEnableEmergencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableEmergencyResponse>> =
            enableEmergency(params.toBuilder().id(id).build(), requestOptions)

        /** @see enableEmergency */
        fun enableEmergency(
            params: ActionEnableEmergencyParams
        ): CompletableFuture<HttpResponseFor<ActionEnableEmergencyResponse>> =
            enableEmergency(params, RequestOptions.none())

        /** @see enableEmergency */
        fun enableEmergency(
            params: ActionEnableEmergencyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionEnableEmergencyResponse>>

        /**
         * Returns a raw HTTP response for `post /phone_numbers/actions/verify_ownership`, but is
         * otherwise the same as [ActionServiceAsync.verifyOwnership].
         */
        fun verifyOwnership(
            params: ActionVerifyOwnershipParams
        ): CompletableFuture<HttpResponseFor<ActionVerifyOwnershipResponse>> =
            verifyOwnership(params, RequestOptions.none())

        /** @see verifyOwnership */
        fun verifyOwnership(
            params: ActionVerifyOwnershipParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionVerifyOwnershipResponse>>
    }
}
