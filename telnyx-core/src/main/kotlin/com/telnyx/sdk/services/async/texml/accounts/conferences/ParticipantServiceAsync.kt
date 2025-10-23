// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.conferences

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantDeleteParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantParticipantsParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantParticipantsResponse
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveParticipantsParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveParticipantsResponse
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantUpdateParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ParticipantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipantServiceAsync

    /** Gets conference participant resource */
    fun retrieve(
        callSidOrParticipantLabel: String,
        params: ParticipantRetrieveParams,
    ): CompletableFuture<ParticipantRetrieveResponse> =
        retrieve(callSidOrParticipantLabel, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callSidOrParticipantLabel: String,
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantRetrieveResponse> =
        retrieve(
            params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: ParticipantRetrieveParams
    ): CompletableFuture<ParticipantRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantRetrieveResponse>

    /** Updates a conference participant */
    fun update(
        callSidOrParticipantLabel: String,
        params: ParticipantUpdateParams,
    ): CompletableFuture<ParticipantUpdateResponse> =
        update(callSidOrParticipantLabel, params, RequestOptions.none())

    /** @see update */
    fun update(
        callSidOrParticipantLabel: String,
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantUpdateResponse> =
        update(
            params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
            requestOptions,
        )

    /** @see update */
    fun update(params: ParticipantUpdateParams): CompletableFuture<ParticipantUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantUpdateResponse>

    /** Deletes a conference participant */
    fun delete(
        callSidOrParticipantLabel: String,
        params: ParticipantDeleteParams,
    ): CompletableFuture<Void?> = delete(callSidOrParticipantLabel, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        callSidOrParticipantLabel: String,
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(
            params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
            requestOptions,
        )

    /** @see delete */
    fun delete(params: ParticipantDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ParticipantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Dials a new conference participant */
    fun participants(
        conferenceSid: String,
        params: ParticipantParticipantsParams,
    ): CompletableFuture<ParticipantParticipantsResponse> =
        participants(conferenceSid, params, RequestOptions.none())

    /** @see participants */
    fun participants(
        conferenceSid: String,
        params: ParticipantParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantParticipantsResponse> =
        participants(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

    /** @see participants */
    fun participants(
        params: ParticipantParticipantsParams
    ): CompletableFuture<ParticipantParticipantsResponse> =
        participants(params, RequestOptions.none())

    /** @see participants */
    fun participants(
        params: ParticipantParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantParticipantsResponse>

    /** Lists conference participants */
    fun retrieveParticipants(
        conferenceSid: String,
        params: ParticipantRetrieveParticipantsParams,
    ): CompletableFuture<ParticipantRetrieveParticipantsResponse> =
        retrieveParticipants(conferenceSid, params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        conferenceSid: String,
        params: ParticipantRetrieveParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantRetrieveParticipantsResponse> =
        retrieveParticipants(
            params.toBuilder().conferenceSid(conferenceSid).build(),
            requestOptions,
        )

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: ParticipantRetrieveParticipantsParams
    ): CompletableFuture<ParticipantRetrieveParticipantsResponse> =
        retrieveParticipants(params, RequestOptions.none())

    /** @see retrieveParticipants */
    fun retrieveParticipants(
        params: ParticipantRetrieveParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipantRetrieveParticipantsResponse>

    /**
     * A view of [ParticipantServiceAsync] that provides access to raw HTTP responses for each
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
        ): ParticipantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}`,
         * but is otherwise the same as [ParticipantServiceAsync.retrieve].
         */
        fun retrieve(
            callSidOrParticipantLabel: String,
            params: ParticipantRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveResponse>> =
            retrieve(callSidOrParticipantLabel, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            callSidOrParticipantLabel: String,
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveResponse>> =
            retrieve(
                params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            params: ParticipantRetrieveParams
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}`,
         * but is otherwise the same as [ParticipantServiceAsync.update].
         */
        fun update(
            callSidOrParticipantLabel: String,
            params: ParticipantUpdateParams,
        ): CompletableFuture<HttpResponseFor<ParticipantUpdateResponse>> =
            update(callSidOrParticipantLabel, params, RequestOptions.none())

        /** @see update */
        fun update(
            callSidOrParticipantLabel: String,
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantUpdateResponse>> =
            update(
                params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: ParticipantUpdateParams
        ): CompletableFuture<HttpResponseFor<ParticipantUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}`,
         * but is otherwise the same as [ParticipantServiceAsync.delete].
         */
        fun delete(
            callSidOrParticipantLabel: String,
            params: ParticipantDeleteParams,
        ): CompletableFuture<HttpResponse> =
            delete(callSidOrParticipantLabel, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            callSidOrParticipantLabel: String,
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(
                params.toBuilder().callSidOrParticipantLabel(callSidOrParticipantLabel).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(params: ParticipantDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants`, but is
         * otherwise the same as [ParticipantServiceAsync.participants].
         */
        fun participants(
            conferenceSid: String,
            params: ParticipantParticipantsParams,
        ): CompletableFuture<HttpResponseFor<ParticipantParticipantsResponse>> =
            participants(conferenceSid, params, RequestOptions.none())

        /** @see participants */
        fun participants(
            conferenceSid: String,
            params: ParticipantParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantParticipantsResponse>> =
            participants(params.toBuilder().conferenceSid(conferenceSid).build(), requestOptions)

        /** @see participants */
        fun participants(
            params: ParticipantParticipantsParams
        ): CompletableFuture<HttpResponseFor<ParticipantParticipantsResponse>> =
            participants(params, RequestOptions.none())

        /** @see participants */
        fun participants(
            params: ParticipantParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantParticipantsResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants`, but is
         * otherwise the same as [ParticipantServiceAsync.retrieveParticipants].
         */
        fun retrieveParticipants(
            conferenceSid: String,
            params: ParticipantRetrieveParticipantsParams,
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveParticipantsResponse>> =
            retrieveParticipants(conferenceSid, params, RequestOptions.none())

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            conferenceSid: String,
            params: ParticipantRetrieveParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveParticipantsResponse>> =
            retrieveParticipants(
                params.toBuilder().conferenceSid(conferenceSid).build(),
                requestOptions,
            )

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            params: ParticipantRetrieveParticipantsParams
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveParticipantsResponse>> =
            retrieveParticipants(params, RequestOptions.none())

        /** @see retrieveParticipants */
        fun retrieveParticipants(
            params: ParticipantRetrieveParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipantRetrieveParticipantsResponse>>
    }
}
