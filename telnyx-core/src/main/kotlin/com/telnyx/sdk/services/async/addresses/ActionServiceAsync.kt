// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.addresses

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.addresses.actions.ActionAcceptSuggestionsParams
import com.telnyx.sdk.models.addresses.actions.ActionAcceptSuggestionsResponse
import com.telnyx.sdk.models.addresses.actions.ActionValidateParams
import com.telnyx.sdk.models.addresses.actions.ActionValidateResponse
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
     * Accepts this address suggestion as a new emergency address for Operator Connect and finishes
     * the uploads of the numbers associated with it to Microsoft.
     */
    fun acceptSuggestions(addressUuid: String): CompletableFuture<ActionAcceptSuggestionsResponse> =
        acceptSuggestions(addressUuid, ActionAcceptSuggestionsParams.none())

    /** @see acceptSuggestions */
    fun acceptSuggestions(
        addressUuid: String,
        params: ActionAcceptSuggestionsParams = ActionAcceptSuggestionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptSuggestionsResponse> =
        acceptSuggestions(params.toBuilder().addressUuid(addressUuid).build(), requestOptions)

    /** @see acceptSuggestions */
    fun acceptSuggestions(
        addressUuid: String,
        params: ActionAcceptSuggestionsParams = ActionAcceptSuggestionsParams.none(),
    ): CompletableFuture<ActionAcceptSuggestionsResponse> =
        acceptSuggestions(addressUuid, params, RequestOptions.none())

    /** @see acceptSuggestions */
    fun acceptSuggestions(
        params: ActionAcceptSuggestionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionAcceptSuggestionsResponse>

    /** @see acceptSuggestions */
    fun acceptSuggestions(
        params: ActionAcceptSuggestionsParams
    ): CompletableFuture<ActionAcceptSuggestionsResponse> =
        acceptSuggestions(params, RequestOptions.none())

    /** @see acceptSuggestions */
    fun acceptSuggestions(
        addressUuid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionAcceptSuggestionsResponse> =
        acceptSuggestions(addressUuid, ActionAcceptSuggestionsParams.none(), requestOptions)

    /** Validates an address for emergency services. */
    fun validate(params: ActionValidateParams): CompletableFuture<ActionValidateResponse> =
        validate(params, RequestOptions.none())

    /** @see validate */
    fun validate(
        params: ActionValidateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionValidateResponse>

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
         * Returns a raw HTTP response for `post /addresses/{id}/actions/accept_suggestions`, but is
         * otherwise the same as [ActionServiceAsync.acceptSuggestions].
         */
        fun acceptSuggestions(
            addressUuid: String
        ): CompletableFuture<HttpResponseFor<ActionAcceptSuggestionsResponse>> =
            acceptSuggestions(addressUuid, ActionAcceptSuggestionsParams.none())

        /** @see acceptSuggestions */
        fun acceptSuggestions(
            addressUuid: String,
            params: ActionAcceptSuggestionsParams = ActionAcceptSuggestionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptSuggestionsResponse>> =
            acceptSuggestions(params.toBuilder().addressUuid(addressUuid).build(), requestOptions)

        /** @see acceptSuggestions */
        fun acceptSuggestions(
            addressUuid: String,
            params: ActionAcceptSuggestionsParams = ActionAcceptSuggestionsParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptSuggestionsResponse>> =
            acceptSuggestions(addressUuid, params, RequestOptions.none())

        /** @see acceptSuggestions */
        fun acceptSuggestions(
            params: ActionAcceptSuggestionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionAcceptSuggestionsResponse>>

        /** @see acceptSuggestions */
        fun acceptSuggestions(
            params: ActionAcceptSuggestionsParams
        ): CompletableFuture<HttpResponseFor<ActionAcceptSuggestionsResponse>> =
            acceptSuggestions(params, RequestOptions.none())

        /** @see acceptSuggestions */
        fun acceptSuggestions(
            addressUuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionAcceptSuggestionsResponse>> =
            acceptSuggestions(addressUuid, ActionAcceptSuggestionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /addresses/actions/validate`, but is otherwise the
         * same as [ActionServiceAsync.validate].
         */
        fun validate(
            params: ActionValidateParams
        ): CompletableFuture<HttpResponseFor<ActionValidateResponse>> =
            validate(params, RequestOptions.none())

        /** @see validate */
        fun validate(
            params: ActionValidateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionValidateResponse>>
    }
}
