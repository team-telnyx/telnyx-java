// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveConferencesParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveConferencesResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceUpdateParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceUpdateResponse
import com.telnyx.sdk.services.async.texml.accounts.conferences.ParticipantServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** TeXML REST Commands */
interface ConferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConferenceServiceAsync

    /** TeXML REST Commands */
    fun participants(): ParticipantServiceAsync

    /** Returns a conference resource. */
    fun retrieve(
        conferenceSid: String,
        params: ConferenceRetrieveParams,
    ): CompletableFuture<ConferenceRetrieveResponse> =
        retrieve(conferenceSid, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        conferenceSid: String,
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveResponse> =
        retrieve(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ConferenceRetrieveParams): CompletableFuture<ConferenceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveResponse>

    /** Updates a conference resource. */
    fun update(
        conferenceSid: String,
        params: ConferenceUpdateParams,
    ): CompletableFuture<ConferenceUpdateResponse> =
        update(conferenceSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        conferenceSid: String,
        params: ConferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceUpdateResponse> =
        update(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see update */
    fun update(params: ConferenceUpdateParams): CompletableFuture<ConferenceUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceUpdateResponse>

    /** Lists conference resources. */
    fun retrieveConferences(
        accountSid: String
    ): CompletableFuture<ConferenceRetrieveConferencesResponse> =
        retrieveConferences(accountSid, ConferenceRetrieveConferencesParams.none())

    /** @see retrieveConferences */
    fun retrieveConferences(
        accountSid: String,
        params: ConferenceRetrieveConferencesParams = ConferenceRetrieveConferencesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveConferencesResponse> =
        retrieveConferences(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see retrieveConferences */
    fun retrieveConferences(
        accountSid: String,
        params: ConferenceRetrieveConferencesParams = ConferenceRetrieveConferencesParams.none(),
    ): CompletableFuture<ConferenceRetrieveConferencesResponse> =
        retrieveConferences(accountSid, params, RequestOptions.none())

    /** @see retrieveConferences */
    fun retrieveConferences(
        params: ConferenceRetrieveConferencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveConferencesResponse>

    /** @see retrieveConferences */
    fun retrieveConferences(
        params: ConferenceRetrieveConferencesParams
    ): CompletableFuture<ConferenceRetrieveConferencesResponse> =
        retrieveConferences(params, RequestOptions.none())

    /** @see retrieveConferences */
    fun retrieveConferences(
        accountSid: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceRetrieveConferencesResponse> =
        retrieveConferences(accountSid, ConferenceRetrieveConferencesParams.none(), requestOptions)

    /** Lists conference recordings */
    fun retrieveRecordings(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsParams,
    ): CompletableFuture<ConferenceRetrieveRecordingsResponse> =
        retrieveRecordings(conferenceSid, params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveRecordingsResponse> =
        retrieveRecordings(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: ConferenceRetrieveRecordingsParams
    ): CompletableFuture<ConferenceRetrieveRecordingsResponse> =
        retrieveRecordings(params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: ConferenceRetrieveRecordingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveRecordingsResponse>

    /** Returns recordings for a conference identified by conference_sid. */
    fun retrieveRecordingsJson(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsJsonParams,
    ): CompletableFuture<ConferenceRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(conferenceSid, params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(
            params.toBuilder().conferenceSid(conferenceSid).build(),
            requestOptions,
        )

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: ConferenceRetrieveRecordingsJsonParams
    ): CompletableFuture<ConferenceRetrieveRecordingsJsonResponse> =
        retrieveRecordingsJson(params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: ConferenceRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveRecordingsJsonResponse>

    /**
     * A view of [ConferenceServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConferenceServiceAsync.WithRawResponse

        /** TeXML REST Commands */
        fun participants(): ParticipantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}`, but is otherwise the same as
         * [ConferenceServiceAsync.retrieve].
         */
        fun retrieve(
            conferenceSid: String,
            params: ConferenceRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(conferenceSid, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            conferenceSid: String,
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ConferenceRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}`, but is otherwise the same as
         * [ConferenceServiceAsync.update].
         */
        fun update(
            conferenceSid: String,
            params: ConferenceUpdateParams,
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateResponse>> =
            update(conferenceSid, params, RequestOptions.none())

        /** @see update */
        fun update(
            conferenceSid: String,
            params: ConferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateResponse>> =
            update(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

        /** @see update */
        fun update(
            params: ConferenceUpdateParams
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ConferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Conferences`, but is
         * otherwise the same as [ConferenceServiceAsync.retrieveConferences].
         */
        fun retrieveConferences(
            accountSid: String
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveConferencesResponse>> =
            retrieveConferences(accountSid, ConferenceRetrieveConferencesParams.none())

        /** @see retrieveConferences */
        fun retrieveConferences(
            accountSid: String,
            params: ConferenceRetrieveConferencesParams =
                ConferenceRetrieveConferencesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveConferencesResponse>> =
            retrieveConferences(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see retrieveConferences */
        fun retrieveConferences(
            accountSid: String,
            params: ConferenceRetrieveConferencesParams = ConferenceRetrieveConferencesParams.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveConferencesResponse>> =
            retrieveConferences(accountSid, params, RequestOptions.none())

        /** @see retrieveConferences */
        fun retrieveConferences(
            params: ConferenceRetrieveConferencesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveConferencesResponse>>

        /** @see retrieveConferences */
        fun retrieveConferences(
            params: ConferenceRetrieveConferencesParams
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveConferencesResponse>> =
            retrieveConferences(params, RequestOptions.none())

        /** @see retrieveConferences */
        fun retrieveConferences(
            accountSid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveConferencesResponse>> =
            retrieveConferences(
                accountSid,
                ConferenceRetrieveConferencesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings`, but is otherwise
         * the same as [ConferenceServiceAsync.retrieveRecordings].
         */
        fun retrieveRecordings(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsParams,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsResponse>> =
            retrieveRecordings(conferenceSid, params, RequestOptions.none())

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsResponse>> =
            retrieveRecordings(
                params.toBuilder().conferenceSid(conferenceSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            params: ConferenceRetrieveRecordingsParams
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsResponse>> =
            retrieveRecordings(params, RequestOptions.none())

        /** @see retrieveRecordings */
        fun retrieveRecordings(
            params: ConferenceRetrieveRecordingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings.json`, but is
         * otherwise the same as [ConferenceServiceAsync.retrieveRecordingsJson].
         */
        fun retrieveRecordingsJson(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsJsonParams,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(conferenceSid, params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(
                params.toBuilder().conferenceSid(conferenceSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            params: ConferenceRetrieveRecordingsJsonParams
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse>> =
            retrieveRecordingsJson(params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        fun retrieveRecordingsJson(
            params: ConferenceRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse>>
    }
}
