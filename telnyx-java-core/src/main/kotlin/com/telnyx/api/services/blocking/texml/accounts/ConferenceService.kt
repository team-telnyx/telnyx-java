// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveConferencesParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveConferencesResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceUpdateParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceUpdateResponse
import com.telnyx.api.services.blocking.texml.accounts.conferences.ParticipantService
import java.util.function.Consumer

interface ConferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConferenceService

    fun participants(): ParticipantService

    /** Returns a conference resource. */
    fun retrieve(
        conferenceSid: String,
        params: ConferenceRetrieveParams,
    ): ConferenceRetrieveResponse = retrieve(conferenceSid, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        conferenceSid: String,
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveResponse =
        retrieve(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ConferenceRetrieveParams): ConferenceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveResponse

    /** Updates a conference resource. */
    fun update(conferenceSid: String, params: ConferenceUpdateParams): ConferenceUpdateResponse =
        update(conferenceSid, params, RequestOptions.none())

    /** @see update */
    fun update(
        conferenceSid: String,
        params: ConferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceUpdateResponse =
        update(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see update */
    fun update(params: ConferenceUpdateParams): ConferenceUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceUpdateResponse

    /** Lists conference resources. */
    fun retrieveConferences(accountSid: String): ConferenceRetrieveConferencesResponse =
        retrieveConferences(accountSid, ConferenceRetrieveConferencesParams.none())

    /** @see retrieveConferences */
    fun retrieveConferences(
        accountSid: String,
        params: ConferenceRetrieveConferencesParams = ConferenceRetrieveConferencesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveConferencesResponse =
        retrieveConferences(params.toBuilder().accountSid(accountSid).build(), requestOptions)

    /** @see retrieveConferences */
    fun retrieveConferences(
        accountSid: String,
        params: ConferenceRetrieveConferencesParams = ConferenceRetrieveConferencesParams.none(),
    ): ConferenceRetrieveConferencesResponse =
        retrieveConferences(accountSid, params, RequestOptions.none())

    /** @see retrieveConferences */
    fun retrieveConferences(
        params: ConferenceRetrieveConferencesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveConferencesResponse

    /** @see retrieveConferences */
    fun retrieveConferences(
        params: ConferenceRetrieveConferencesParams
    ): ConferenceRetrieveConferencesResponse = retrieveConferences(params, RequestOptions.none())

    /** @see retrieveConferences */
    fun retrieveConferences(
        accountSid: String,
        requestOptions: RequestOptions,
    ): ConferenceRetrieveConferencesResponse =
        retrieveConferences(accountSid, ConferenceRetrieveConferencesParams.none(), requestOptions)

    /** Lists conference recordings */
    fun retrieveRecordings(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsParams,
    ): ConferenceRetrieveRecordingsResponse =
        retrieveRecordings(conferenceSid, params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveRecordingsResponse =
        retrieveRecordings(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: ConferenceRetrieveRecordingsParams
    ): ConferenceRetrieveRecordingsResponse = retrieveRecordings(params, RequestOptions.none())

    /** @see retrieveRecordings */
    fun retrieveRecordings(
        params: ConferenceRetrieveRecordingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveRecordingsResponse

    /** Returns recordings for a conference identified by conference_sid. */
    fun retrieveRecordingsJson(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsJsonParams,
    ): ConferenceRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(conferenceSid, params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        conferenceSid: String,
        params: ConferenceRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(
            params.toBuilder().conferenceSid(conferenceSid).build(),
            requestOptions,
        )

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: ConferenceRetrieveRecordingsJsonParams
    ): ConferenceRetrieveRecordingsJsonResponse =
        retrieveRecordingsJson(params, RequestOptions.none())

    /** @see retrieveRecordingsJson */
    fun retrieveRecordingsJson(
        params: ConferenceRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveRecordingsJsonResponse

    /** A view of [ConferenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConferenceService.WithRawResponse

        fun participants(): ParticipantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}`, but is otherwise the same as
         * [ConferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            conferenceSid: String,
            params: ConferenceRetrieveParams,
        ): HttpResponseFor<ConferenceRetrieveResponse> =
            retrieve(conferenceSid, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conferenceSid: String,
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveResponse> =
            retrieve(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConferenceRetrieveParams
        ): HttpResponseFor<ConferenceRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}`, but is otherwise the same as
         * [ConferenceService.update].
         */
        @MustBeClosed
        fun update(
            conferenceSid: String,
            params: ConferenceUpdateParams,
        ): HttpResponseFor<ConferenceUpdateResponse> =
            update(conferenceSid, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            conferenceSid: String,
            params: ConferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceUpdateResponse> =
            update(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ConferenceUpdateParams): HttpResponseFor<ConferenceUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ConferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /texml/Accounts/{account_sid}/Conferences`, but is
         * otherwise the same as [ConferenceService.retrieveConferences].
         */
        @MustBeClosed
        fun retrieveConferences(
            accountSid: String
        ): HttpResponseFor<ConferenceRetrieveConferencesResponse> =
            retrieveConferences(accountSid, ConferenceRetrieveConferencesParams.none())

        /** @see retrieveConferences */
        @MustBeClosed
        fun retrieveConferences(
            accountSid: String,
            params: ConferenceRetrieveConferencesParams =
                ConferenceRetrieveConferencesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveConferencesResponse> =
            retrieveConferences(params.toBuilder().accountSid(accountSid).build(), requestOptions)

        /** @see retrieveConferences */
        @MustBeClosed
        fun retrieveConferences(
            accountSid: String,
            params: ConferenceRetrieveConferencesParams = ConferenceRetrieveConferencesParams.none(),
        ): HttpResponseFor<ConferenceRetrieveConferencesResponse> =
            retrieveConferences(accountSid, params, RequestOptions.none())

        /** @see retrieveConferences */
        @MustBeClosed
        fun retrieveConferences(
            params: ConferenceRetrieveConferencesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveConferencesResponse>

        /** @see retrieveConferences */
        @MustBeClosed
        fun retrieveConferences(
            params: ConferenceRetrieveConferencesParams
        ): HttpResponseFor<ConferenceRetrieveConferencesResponse> =
            retrieveConferences(params, RequestOptions.none())

        /** @see retrieveConferences */
        @MustBeClosed
        fun retrieveConferences(
            accountSid: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceRetrieveConferencesResponse> =
            retrieveConferences(
                accountSid,
                ConferenceRetrieveConferencesParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings`, but is otherwise
         * the same as [ConferenceService.retrieveRecordings].
         */
        @MustBeClosed
        fun retrieveRecordings(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsParams,
        ): HttpResponseFor<ConferenceRetrieveRecordingsResponse> =
            retrieveRecordings(conferenceSid, params, RequestOptions.none())

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveRecordingsResponse> =
            retrieveRecordings(
                params.toBuilder().conferenceSid(conferenceSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            params: ConferenceRetrieveRecordingsParams
        ): HttpResponseFor<ConferenceRetrieveRecordingsResponse> =
            retrieveRecordings(params, RequestOptions.none())

        /** @see retrieveRecordings */
        @MustBeClosed
        fun retrieveRecordings(
            params: ConferenceRetrieveRecordingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveRecordingsResponse>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings.json`, but is
         * otherwise the same as [ConferenceService.retrieveRecordingsJson].
         */
        @MustBeClosed
        fun retrieveRecordingsJson(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsJsonParams,
        ): HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(conferenceSid, params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            conferenceSid: String,
            params: ConferenceRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(
                params.toBuilder().conferenceSid(conferenceSid).build(),
                requestOptions,
            )

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: ConferenceRetrieveRecordingsJsonParams
        ): HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse> =
            retrieveRecordingsJson(params, RequestOptions.none())

        /** @see retrieveRecordingsJson */
        @MustBeClosed
        fun retrieveRecordingsJson(
            params: ConferenceRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse>
    }
}
