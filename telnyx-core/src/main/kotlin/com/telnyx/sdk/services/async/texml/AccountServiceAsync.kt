// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonResponse
import com.telnyx.sdk.services.async.texml.accounts.CallServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.ConferenceServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.QueueServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.RecordingServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.TranscriptionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    fun calls(): CallServiceAsync

    fun conferences(): ConferenceServiceAsync

    fun recordings(): RecordingServiceAsync

    fun transcriptions(): TranscriptionServiceAsync

    fun queues(): QueueServiceAsync

    /** Returns multiple recording resources for an account. */
    fun retrieveRecordingsJson(
        accountSid: String
    ): CompletableFuture<AccountRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(accountSid, AccountRetrieveRecordingsJsonParams.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        accountSid: String,
        params: AccountRetrieveRecordingsJsonParams = AccountRetrieveRecordingsJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        accountSid: String,
        params: AccountRetrieveRecordingsJsonParams = AccountRetrieveRecordingsJsonParams.none(),
    ): CompletableFuture<AccountRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(accountSid, params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: AccountRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveRecordingsJsonResponse>

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: AccountRetrieveRecordingsJsonParams
    ): CompletableFuture<AccountRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(
            accountSid,
            AccountRetrieveRecordingsJsonParams.none(),
            requestOptions,
        )

    /** Returns multiple recording transcription resources for an account. */
    fun retrieveTranscriptionsJson(
        accountSid: String
    ): CompletableFuture<AccountRetrieveTranscriptionsJsonResponse> =
        retrieveTranscriptionsJson(accountSid, AccountRetrieveTranscriptionsJsonParams.none())

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        accountSid: String,
        params: AccountRetrieveTranscriptionsJsonParams =
            AccountRetrieveTranscriptionsJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveTranscriptionsJsonResponse> =
        retrieveTranscriptionsJson(
            params.toBuilder().accountSid(accountSid).build(),
            requestOptions,
        )

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        accountSid: String,
        params: AccountRetrieveTranscriptionsJsonParams =
            AccountRetrieveTranscriptionsJsonParams.none(),
    ): CompletableFuture<AccountRetrieveTranscriptionsJsonResponse> =
        retrieveTranscriptionsJson(accountSid, params, RequestOptions.none())

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        params: AccountRetrieveTranscriptionsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountRetrieveTranscriptionsJsonResponse>

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        params: AccountRetrieveTranscriptionsJsonParams
    ): CompletableFuture<AccountRetrieveTranscriptionsJsonResponse> =
        retrieveTranscriptionsJson(params, RequestOptions.none())

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveTranscriptionsJsonResponse> =
        retrieveTranscriptionsJson(
            accountSid,
            AccountRetrieveTranscriptionsJsonParams.none(),
            requestOptions,
        )

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        fun calls(): CallServiceAsync.WithRawResponse

        fun conferences(): ConferenceServiceAsync.WithRawResponse

        fun recordings(): RecordingServiceAsync.WithRawResponse

        fun transcriptions(): TranscriptionServiceAsync.WithRawResponse

        fun queues(): QueueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Recordings.json`, but
         * is otherwise the same as [AccountServiceAsync.retrieveRecordingsJson].
         */
        fun retrieveRecordingsJson(
            accountSid: String
        ): CompletableFuture<HttpResponseFor<AccountRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(accountSid, AccountRetrieveRecordingsJsonParams.none())

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            accountSid: String,
            params: AccountRetrieveRecordingsJsonParams =
                AccountRetrieveRecordingsJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(
                params.toBuilder().accountSid(accountSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            accountSid: String,
            params: AccountRetrieveRecordingsJsonParams = AccountRetrieveRecordingsJsonParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(accountSid, params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            params: AccountRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveRecordingsJsonResponse>>

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            params: AccountRetrieveRecordingsJsonParams
        ): CompletableFuture<HttpResponseFor<AccountRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            accountSid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(
                accountSid,
                AccountRetrieveRecordingsJsonParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Transcriptions.json`,
         * but is otherwise the same as [AccountServiceAsync.retrieveTranscriptionsJson].
         */
        fun retrieveTranscriptionsJson(
            accountSid: String
        ): CompletableFuture<HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>> =
            retrieveTranscriptionsJson(accountSid, AccountRetrieveTranscriptionsJsonParams.none())

        /** @see retrieveTranscriptionsJson */
        fun retrieveTranscriptionsJson(
            accountSid: String,
            params: AccountRetrieveTranscriptionsJsonParams =
                AccountRetrieveTranscriptionsJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>> =
            retrieveTranscriptionsJson(
                params.toBuilder().accountSid(accountSid).build(),
                requestOptions,
            )

        /** @see retrieveTranscriptionsJson */
        fun retrieveTranscriptionsJson(
            accountSid: String,
            params: AccountRetrieveTranscriptionsJsonParams =
                AccountRetrieveTranscriptionsJsonParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>> =
            retrieveTranscriptionsJson(accountSid, params, RequestOptions.none())

        /** @see retrieveTranscriptionsJson */
        fun retrieveTranscriptionsJson(
            params: AccountRetrieveTranscriptionsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>>

        /** @see retrieveTranscriptionsJson */
        fun retrieveTranscriptionsJson(
            params: AccountRetrieveTranscriptionsJsonParams
        ): CompletableFuture<HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>> =
            retrieveTranscriptionsJson(params, RequestOptions.none())

        /** @see retrieveTranscriptionsJson */
        fun retrieveTranscriptionsJson(
            accountSid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>> =
            retrieveTranscriptionsJson(
                accountSid,
                AccountRetrieveTranscriptionsJsonParams.none(),
                requestOptions,
            )
    }
}
