// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateParams
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateResponse
import com.telnyx.sdk.services.blocking.emailvalidations.BatchService
import java.util.function.Consumer

/** Validate email addresses synchronously or in asynchronous batches. */
interface EmailValidationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailValidationService

    /** Validate email addresses synchronously or in asynchronous batches. */
    fun batch(): BatchService

    /** Validates a single email address and returns deliverability checks. */
    fun create(params: EmailValidationCreateParams): EmailValidationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailValidationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailValidationCreateResponse

    /**
     * A view of [EmailValidationService] that provides access to raw HTTP responses for each
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
        ): EmailValidationService.WithRawResponse

        /** Validate email addresses synchronously or in asynchronous batches. */
        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_validations`, but is otherwise the same as
         * [EmailValidationService.create].
         */
        @MustBeClosed
        fun create(
            params: EmailValidationCreateParams
        ): HttpResponseFor<EmailValidationCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailValidationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailValidationCreateResponse>
    }
}
