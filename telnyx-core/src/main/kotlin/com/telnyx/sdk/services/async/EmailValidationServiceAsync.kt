// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateParams
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateResponse
import com.telnyx.sdk.services.async.emailvalidations.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Validate email addresses synchronously or in asynchronous batches. */
interface EmailValidationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailValidationServiceAsync

    /** Validate email addresses synchronously or in asynchronous batches. */
    fun batch(): BatchServiceAsync

    /** Validates a single email address and returns deliverability checks. */
    fun create(
        params: EmailValidationCreateParams
    ): CompletableFuture<EmailValidationCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailValidationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailValidationCreateResponse>

    /**
     * A view of [EmailValidationServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmailValidationServiceAsync.WithRawResponse

        /** Validate email addresses synchronously or in asynchronous batches. */
        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_validations`, but is otherwise the same as
         * [EmailValidationServiceAsync.create].
         */
        fun create(
            params: EmailValidationCreateParams
        ): CompletableFuture<HttpResponseFor<EmailValidationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailValidationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailValidationCreateResponse>>
    }
}
