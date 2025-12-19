// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonResponse
import com.telnyx.sdk.services.blocking.texml.accounts.CallService
import com.telnyx.sdk.services.blocking.texml.accounts.ConferenceService
import com.telnyx.sdk.services.blocking.texml.accounts.QueueService
import com.telnyx.sdk.services.blocking.texml.accounts.RecordingService
import com.telnyx.sdk.services.blocking.texml.accounts.TranscriptionService
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    fun calls(): CallService

    fun conferences(): ConferenceService

    fun recordings(): RecordingService

    fun transcriptions(): TranscriptionService

    fun queues(): QueueService

    /** Returns multiple recording resources for an account. */
    fun retrieveRecordingsJson(accountSid: String): AccountRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(accountSid, AccountRetrieveRecordingsJsonParams.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        accountSid: String,
        params: AccountRetrieveRecordingsJsonParams = AccountRetrieveRecordingsJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        accountSid: String,
        params: AccountRetrieveRecordingsJsonParams = AccountRetrieveRecordingsJsonParams.none(),
    ): AccountRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(accountSid, params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: AccountRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveRecordingsJsonResponse

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: AccountRetrieveRecordingsJsonParams
    ): AccountRetrieveRecordingsJsonResponse = retrieveRecordingsJson(params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        accountSid: String,
        requestOptions: RequestOptions,
    ): AccountRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(
            accountSid,
            AccountRetrieveRecordingsJsonParams.none(),
            requestOptions,
        )

    /** Returns multiple recording transcription resources for an account. */
    fun retrieveTranscriptionsJson(accountSid: String): AccountRetrieveTranscriptionsJsonResponse =
        retrieveTranscriptionsJson(accountSid, AccountRetrieveTranscriptionsJsonParams.none())

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        accountSid: String,
        params: AccountRetrieveTranscriptionsJsonParams =
            AccountRetrieveTranscriptionsJsonParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveTranscriptionsJsonResponse =
        retrieveTranscriptionsJson(
            params.toBuilder().accountSid(accountSid).build(),
            requestOptions,
        )

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        accountSid: String,
        params: AccountRetrieveTranscriptionsJsonParams =
            AccountRetrieveTranscriptionsJsonParams.none(),
    ): AccountRetrieveTranscriptionsJsonResponse =
        retrieveTranscriptionsJson(accountSid, params, RequestOptions.none())

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        params: AccountRetrieveTranscriptionsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveTranscriptionsJsonResponse

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        params: AccountRetrieveTranscriptionsJsonParams
    ): AccountRetrieveTranscriptionsJsonResponse =
        retrieveTranscriptionsJson(params, RequestOptions.none())

    /** @see retrieveTranscriptionsJson */
    fun retrieveTranscriptionsJson(
        accountSid: String,
        requestOptions: RequestOptions,
    ): AccountRetrieveTranscriptionsJsonResponse =
        retrieveTranscriptionsJson(
            accountSid,
            AccountRetrieveTranscriptionsJsonParams.none(),
            requestOptions,
        )

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        fun calls(): CallService.WithRawResponse

        fun conferences(): ConferenceService.WithRawResponse

        fun recordings(): RecordingService.WithRawResponse

        fun transcriptions(): TranscriptionService.WithRawResponse

        fun queues(): QueueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Recordings.json`, but
         * is otherwise the same as [AccountService.retrieveRecordingsJson].
         */
        @MustBeClosed
        fun retrieveRecordingsJson(
            accountSid: String
        ): HttpResponseFor<AccountRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(accountSid, AccountRetrieveRecordingsJsonParams.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            accountSid: String,
            params: AccountRetrieveRecordingsJsonParams =
                AccountRetrieveRecordingsJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(
                params.toBuilder().accountSid(accountSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            accountSid: String,
            params: AccountRetrieveRecordingsJsonParams = AccountRetrieveRecordingsJsonParams.none(),
        ): HttpResponseFor<AccountRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(accountSid, params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: AccountRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveRecordingsJsonResponse>

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: AccountRetrieveRecordingsJsonParams
        ): HttpResponseFor<AccountRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            accountSid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(
                accountSid,
                AccountRetrieveRecordingsJsonParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Transcriptions.json`,
         * but is otherwise the same as [AccountService.retrieveTranscriptionsJson].
         */
        @MustBeClosed
        fun retrieveTranscriptionsJson(
            accountSid: String
        ): HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse> =
            retrieveTranscriptionsJson(accountSid, AccountRetrieveTranscriptionsJsonParams.none())

        /** @see retrieveTranscriptionsJson */
        @MustBeClosed
        fun retrieveTranscriptionsJson(
            accountSid: String,
            params: AccountRetrieveTranscriptionsJsonParams =
                AccountRetrieveTranscriptionsJsonParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse> =
            retrieveTranscriptionsJson(
                params.toBuilder().accountSid(accountSid).build(),
                requestOptions,
            )

        /** @see retrieveTranscriptionsJson */
        @MustBeClosed
        fun retrieveTranscriptionsJson(
            accountSid: String,
            params: AccountRetrieveTranscriptionsJsonParams =
                AccountRetrieveTranscriptionsJsonParams.none(),
        ): HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse> =
            retrieveTranscriptionsJson(accountSid, params, RequestOptions.none())

        /** @see retrieveTranscriptionsJson */
        @MustBeClosed
        fun retrieveTranscriptionsJson(
            params: AccountRetrieveTranscriptionsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>

        /** @see retrieveTranscriptionsJson */
        @MustBeClosed
        fun retrieveTranscriptionsJson(
            params: AccountRetrieveTranscriptionsJsonParams
        ): HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse> =
            retrieveTranscriptionsJson(params, RequestOptions.none())

        /** @see retrieveTranscriptionsJson */
        @MustBeClosed
        fun retrieveTranscriptionsJson(
            accountSid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse> =
            retrieveTranscriptionsJson(
                accountSid,
                AccountRetrieveTranscriptionsJsonParams.none(),
                requestOptions,
            )
    }
}
