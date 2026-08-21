// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailmessages

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailmessages.recipients.RecipientListPage
import com.telnyx.sdk.models.emailmessages.recipients.RecipientListParams
import com.telnyx.sdk.models.emailmessages.recipients.RecipientRetrieveParams
import com.telnyx.sdk.models.emailmessages.recipients.RecipientRetrieveResponse
import java.util.function.Consumer

/** Send and manage email messages. Legacy `/v2/emails` routes are aliases for these endpoints. */
interface RecipientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecipientService

    /**
     * Returns the current delivery state of a single recipient, including status, billable flag,
     * SMTP detail, and lifecycle timestamps. BCC recipient addresses are redacted (returned as
     * null).
     */
    fun retrieve(recipientId: String, params: RecipientRetrieveParams): RecipientRetrieveResponse =
        retrieve(recipientId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        recipientId: String,
        params: RecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecipientRetrieveResponse =
        retrieve(params.toBuilder().recipientId(recipientId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RecipientRetrieveParams): RecipientRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecipientRetrieveResponse

    /**
     * Lists per-recipient delivery states for a single message with cursor pagination. Each
     * recipient has an independent status, billable flag, and lifecycle timestamps. BCC recipient
     * addresses are redacted (returned as null) to protect BCC privacy. Default page size is 25,
     * maximum is 100.
     */
    fun list(emailId: String): RecipientListPage = list(emailId, RecipientListParams.none())

    /** @see list */
    fun list(
        emailId: String,
        params: RecipientListParams = RecipientListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecipientListPage = list(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see list */
    fun list(
        emailId: String,
        params: RecipientListParams = RecipientListParams.none(),
    ): RecipientListPage = list(emailId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RecipientListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecipientListPage

    /** @see list */
    fun list(params: RecipientListParams): RecipientListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(emailId: String, requestOptions: RequestOptions): RecipientListPage =
        list(emailId, RecipientListParams.none(), requestOptions)

    /** A view of [RecipientService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecipientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /email_messages/{email_id}/recipients/{recipient_id}`, but is otherwise the same as
         * [RecipientService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            recipientId: String,
            params: RecipientRetrieveParams,
        ): HttpResponseFor<RecipientRetrieveResponse> =
            retrieve(recipientId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            recipientId: String,
            params: RecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecipientRetrieveResponse> =
            retrieve(params.toBuilder().recipientId(recipientId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RecipientRetrieveParams): HttpResponseFor<RecipientRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecipientRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /email_messages/{email_id}/recipients`, but is
         * otherwise the same as [RecipientService.list].
         */
        @MustBeClosed
        fun list(emailId: String): HttpResponseFor<RecipientListPage> =
            list(emailId, RecipientListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            emailId: String,
            params: RecipientListParams = RecipientListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecipientListPage> =
            list(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            emailId: String,
            params: RecipientListParams = RecipientListParams.none(),
        ): HttpResponseFor<RecipientListPage> = list(emailId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RecipientListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecipientListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: RecipientListParams): HttpResponseFor<RecipientListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            emailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecipientListPage> =
            list(emailId, RecipientListParams.none(), requestOptions)
    }
}
