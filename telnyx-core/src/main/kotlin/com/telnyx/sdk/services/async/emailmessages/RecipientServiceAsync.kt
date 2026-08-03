// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailmessages

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailmessages.recipients.RecipientListParams
import com.telnyx.sdk.models.emailmessages.recipients.RecipientListResponse
import com.telnyx.sdk.models.emailmessages.recipients.RecipientRetrieveParams
import com.telnyx.sdk.models.emailmessages.recipients.RecipientRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints. */
interface RecipientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecipientServiceAsync

    /**
     * Returns the current delivery state of a single recipient, including status, billable flag,
     * SMTP detail, and lifecycle timestamps. BCC recipient addresses are redacted (returned as
     * null).
     */
    fun retrieve(
        recipientId: String,
        params: RecipientRetrieveParams,
    ): CompletableFuture<RecipientRetrieveResponse> =
        retrieve(recipientId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        recipientId: String,
        params: RecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecipientRetrieveResponse> =
        retrieve(params.toBuilder().recipientId(recipientId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RecipientRetrieveParams): CompletableFuture<RecipientRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecipientRetrieveResponse>

    /**
     * Lists per-recipient delivery states for a single message with cursor pagination. Each
     * recipient has an independent status, billable flag, and lifecycle timestamps. BCC recipient
     * addresses are redacted (returned as null) to protect BCC privacy. Default page size is 25,
     * maximum is 100.
     */
    fun list(emailId: String): CompletableFuture<RecipientListResponse> =
        list(emailId, RecipientListParams.none())

    /** @see list */
    fun list(
        emailId: String,
        params: RecipientListParams = RecipientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecipientListResponse> =
        list(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see list */
    fun list(
        emailId: String,
        params: RecipientListParams = RecipientListParams.none(),
    ): CompletableFuture<RecipientListResponse> = list(emailId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RecipientListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RecipientListResponse>

    /** @see list */
    fun list(params: RecipientListParams): CompletableFuture<RecipientListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        emailId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecipientListResponse> =
        list(emailId, RecipientListParams.none(), requestOptions)

    /**
     * A view of [RecipientServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecipientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /email_messages/{email_id}/recipients/{recipient_id}`, but is otherwise the same as
         * [RecipientServiceAsync.retrieve].
         */
        fun retrieve(
            recipientId: String,
            params: RecipientRetrieveParams,
        ): CompletableFuture<HttpResponseFor<RecipientRetrieveResponse>> =
            retrieve(recipientId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            recipientId: String,
            params: RecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecipientRetrieveResponse>> =
            retrieve(params.toBuilder().recipientId(recipientId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RecipientRetrieveParams
        ): CompletableFuture<HttpResponseFor<RecipientRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecipientRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /email_messages/{email_id}/recipients`, but is
         * otherwise the same as [RecipientServiceAsync.list].
         */
        fun list(emailId: String): CompletableFuture<HttpResponseFor<RecipientListResponse>> =
            list(emailId, RecipientListParams.none())

        /** @see list */
        fun list(
            emailId: String,
            params: RecipientListParams = RecipientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecipientListResponse>> =
            list(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see list */
        fun list(
            emailId: String,
            params: RecipientListParams = RecipientListParams.none(),
        ): CompletableFuture<HttpResponseFor<RecipientListResponse>> =
            list(emailId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RecipientListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RecipientListResponse>>

        /** @see list */
        fun list(
            params: RecipientListParams
        ): CompletableFuture<HttpResponseFor<RecipientListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            emailId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecipientListResponse>> =
            list(emailId, RecipientListParams.none(), requestOptions)
    }
}
