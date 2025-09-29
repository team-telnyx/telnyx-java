// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts.conferences

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantDeleteParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantParticipantsParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantParticipantsResponse
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantRetrieveParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantRetrieveParticipantsParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantRetrieveParticipantsResponse
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantRetrieveResponse
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantUpdateParams
import com.telnyx.api.models.texml.accounts.conferences.participants.ParticipantUpdateResponse
import java.util.function.Consumer

interface ParticipantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipantService

    /** Gets conference participant resource */
    fun retrieve(
        callSidOrParticipantLabel: String,
        params: ParticipantRetrieveParams,
    ): ParticipantRetrieveResponse =
        retrieve(callSidOrParticipantLabel, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callSidOrParticipantLabel: String,
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantRetrieveResponse =
        retrieve(
            params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(params: ParticipantRetrieveParams): ParticipantRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantRetrieveResponse

    /** Updates a conference participant */
    fun update(
        callSidOrParticipantLabel: String,
        params: ParticipantUpdateParams,
    ): ParticipantUpdateResponse = update(callSidOrParticipantLabel, params, RequestOptions.none())

    /** @see update */
    fun update(
        callSidOrParticipantLabel: String,
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantUpdateResponse =
        update(
            params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
            requestOptions,
        )

    /** @see update */
    fun update(params: ParticipantUpdateParams): ParticipantUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantUpdateResponse

    /** Deletes a conference participant */
    fun delete(callSidOrParticipantLabel: String, params: ParticipantDeleteParams) =
        delete(callSidOrParticipantLabel, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        callSidOrParticipantLabel: String,
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        delete(
            params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(params: ParticipantDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Dials a new conference participant */
    fun participants(
        conferenceSid: String,
        params: ParticipantParticipantsParams,
    ): ParticipantParticipantsResponse = participants(conferenceSid, params, RequestOptions.none())

    /** @see participants */
    fun participants(
        conferenceSid: String,
        params: ParticipantParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantParticipantsResponse =
        participants(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see participants */
    fun participants(params: ParticipantParticipantsParams): ParticipantParticipantsResponse =
        participants(params, RequestOptions.none())

    /** @see participants */
    fun participants(
        params: ParticipantParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantParticipantsResponse

    /** Lists conference participants */
    fun retrieveParticipants(
        conferenceSid: String,
        params: ParticipantRetrieveParticipantsParams,
    ): ParticipantRetrieveParticipantsResponse =
        retrieveParticipants(conferenceSid, params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        conferenceSid: String,
        params: ParticipantRetrieveParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantRetrieveParticipantsResponse =
        retrieveParticipants(
            params.toBuilder().conferenceSid(conferenceSid).build(),
            requestOptions,
        )

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: ParticipantRetrieveParticipantsParams
    ): ParticipantRetrieveParticipantsResponse = retrieveParticipants(params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: ParticipantRetrieveParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipantRetrieveParticipantsResponse

    /**
     * A view of [ParticipantService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}`,
         * but is otherwise the same as [ParticipantService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            callSidOrParticipantLabel: String,
            params: ParticipantRetrieveParams,
        ): HttpResponseFor<ParticipantRetrieveResponse> =
            retrieve(callSidOrParticipantLabel, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callSidOrParticipantLabel: String,
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantRetrieveResponse> =
            retrieve(
                params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ParticipantRetrieveParams
        ): HttpResponseFor<ParticipantRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantRetrieveResponse>

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}`,
         * but is otherwise the same as [ParticipantService.update].
         */
        @MustBeClosed
        fun update(
            callSidOrParticipantLabel: String,
            params: ParticipantUpdateParams,
        ): HttpResponseFor<ParticipantUpdateResponse> =
            update(callSidOrParticipantLabel, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            callSidOrParticipantLabel: String,
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantUpdateResponse> =
            update(
                params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(params: ParticipantUpdateParams): HttpResponseFor<ParticipantUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}`,
         * but is otherwise the same as [ParticipantService.delete].
         */
        @MustBeClosed
        fun delete(
            callSidOrParticipantLabel: String,
            params: ParticipantDeleteParams,
        ): HttpResponse = delete(callSidOrParticipantLabel, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            callSidOrParticipantLabel: String,
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(
                params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(params: ParticipantDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants`, but is
         * otherwise the same as [ParticipantService.participants].
         */
        @MustBeClosed
        fun participants(
            conferenceSid: String,
            params: ParticipantParticipantsParams,
        ): HttpResponseFor<ParticipantParticipantsResponse> =
            participants(conferenceSid, params, RequestOptions.none())

        /** @see participants */
        @MustBeClosed
        fun participants(
            conferenceSid: String,
            params: ParticipantParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantParticipantsResponse> =
            participants(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

        /** @see participants */
        @MustBeClosed
        fun participants(
            params: ParticipantParticipantsParams
        ): HttpResponseFor<ParticipantParticipantsResponse> =
            participants(params, RequestOptions.none())

        /** @see participants */
        @MustBeClosed
        fun participants(
            params: ParticipantParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantParticipantsResponse>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants`, but is
         * otherwise the same as [ParticipantService.retrieveParticipants].
         */
        @MustBeClosed
        fun retrieveParticipants(
            conferenceSid: String,
            params: ParticipantRetrieveParticipantsParams,
        ): HttpResponseFor<ParticipantRetrieveParticipantsResponse> =
            retrieveParticipants(conferenceSid, params, RequestOptions.none())

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            conferenceSid: String,
            params: ParticipantRetrieveParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantRetrieveParticipantsResponse> =
            retrieveParticipants(
                params.toBuilder().conferenceSid(conferenceSid).build(),
                requestOptions,
            )

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            params: ParticipantRetrieveParticipantsParams
        ): HttpResponseFor<ParticipantRetrieveParticipantsResponse> =
            retrieveParticipants(params, RequestOptions.none())

        /** @see retrieveParticipants */
        @MustBeClosed
        fun retrieveParticipants(
            params: ParticipantRetrieveParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipantRetrieveParticipantsResponse>
    }
}
