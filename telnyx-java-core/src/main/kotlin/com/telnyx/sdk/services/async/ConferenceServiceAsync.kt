// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.conferences.ConferenceCreateParams
import com.telnyx.sdk.models.conferences.ConferenceCreateResponse
import com.telnyx.sdk.models.conferences.ConferenceListPageAsync
import com.telnyx.sdk.models.conferences.ConferenceListParams
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsPageAsync
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParticipantParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParticipantResponse
import com.telnyx.sdk.models.conferences.ConferenceRetrieveResponse
import com.telnyx.sdk.models.conferences.ConferenceUpdateParticipantParams
import com.telnyx.sdk.models.conferences.ConferenceUpdateParticipantResponse
import com.telnyx.sdk.services.async.conferences.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Conference command operations */
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

    /** Conference command operations */
    fun actions(): ActionServiceAsync

    /**
     * Create a conference from an existing call leg using a `call_control_id` and a conference
     * name. Upon creating the conference, the call will be automatically bridged to the conference.
     * Conferences will expire after all participants have left the conference or after 4 hours
     * regardless of the number of active participants.
     *
     * **Expected Webhooks:**
     * - `conference.created`
     * - `conference.participant.joined`
     * - `conference.participant.left`
     * - `conference.ended`
     * - `conference.recording.saved`
     * - `conference.floor.changed`
     */
    fun create(params: ConferenceCreateParams): CompletableFuture<ConferenceCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceCreateResponse>

    /** Retrieve an existing conference */
    fun retrieve(id: String): CompletableFuture<ConferenceRetrieveResponse> =
        retrieve(id, ConferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
    ): CompletableFuture<ConferenceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ConferenceRetrieveParams): CompletableFuture<ConferenceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceRetrieveResponse> =
        retrieve(id, ConferenceRetrieveParams.none(), requestOptions)

    /**
     * Lists conferences. Conferences are created on demand, and will expire after all participants
     * have left the conference or after 4 hours regardless of the number of active participants.
     * Conferences are listed in descending order by `expires_at`.
     */
    fun list(): CompletableFuture<ConferenceListPageAsync> = list(ConferenceListParams.none())

    /** @see list */
    fun list(
        params: ConferenceListParams = ConferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceListPageAsync>

    /** @see list */
    fun list(
        params: ConferenceListParams = ConferenceListParams.none()
    ): CompletableFuture<ConferenceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConferenceListPageAsync> =
        list(ConferenceListParams.none(), requestOptions)

    /** Lists conference participants */
    fun listParticipants(
        conferenceId: String
    ): CompletableFuture<ConferenceListParticipantsPageAsync> =
        listParticipants(conferenceId, ConferenceListParticipantsParams.none())

    /** @see listParticipants */
    fun listParticipants(
        conferenceId: String,
        params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceListParticipantsPageAsync> =
        listParticipants(params.toBuilder().conferenceId(conferenceId).build(), requestOptions)

    /** @see listParticipants */
    fun listParticipants(
        conferenceId: String,
        params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
    ): CompletableFuture<ConferenceListParticipantsPageAsync> =
        listParticipants(conferenceId, params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        params: ConferenceListParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceListParticipantsPageAsync>

    /** @see listParticipants */
    fun listParticipants(
        params: ConferenceListParticipantsParams
    ): CompletableFuture<ConferenceListParticipantsPageAsync> =
        listParticipants(params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        conferenceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceListParticipantsPageAsync> =
        listParticipants(conferenceId, ConferenceListParticipantsParams.none(), requestOptions)

    /** Retrieve details of a specific conference participant by their ID or label. */
    fun retrieveParticipant(
        participantId: String,
        params: ConferenceRetrieveParticipantParams,
    ): CompletableFuture<ConferenceRetrieveParticipantResponse> =
        retrieveParticipant(participantId, params, RequestOptions.none())

    /** @see retrieveParticipant */
    fun retrieveParticipant(
        participantId: String,
        params: ConferenceRetrieveParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveParticipantResponse> =
        retrieveParticipant(params.toBuilder().participantId(participantId).build(), requestOptions)

    /** @see retrieveParticipant */
    fun retrieveParticipant(
        params: ConferenceRetrieveParticipantParams
    ): CompletableFuture<ConferenceRetrieveParticipantResponse> =
        retrieveParticipant(params, RequestOptions.none())

    /** @see retrieveParticipant */
    fun retrieveParticipant(
        params: ConferenceRetrieveParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceRetrieveParticipantResponse>

    /** Update properties of a conference participant. */
    fun updateParticipant(
        participantId: String,
        params: ConferenceUpdateParticipantParams,
    ): CompletableFuture<ConferenceUpdateParticipantResponse> =
        updateParticipant(participantId, params, RequestOptions.none())

    /** @see updateParticipant */
    fun updateParticipant(
        participantId: String,
        params: ConferenceUpdateParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceUpdateParticipantResponse> =
        updateParticipant(params.toBuilder().participantId(participantId).build(), requestOptions)

    /** @see updateParticipant */
    fun updateParticipant(
        params: ConferenceUpdateParticipantParams
    ): CompletableFuture<ConferenceUpdateParticipantResponse> =
        updateParticipant(params, RequestOptions.none())

    /** @see updateParticipant */
    fun updateParticipant(
        params: ConferenceUpdateParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConferenceUpdateParticipantResponse>

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

        /** Conference command operations */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conferences`, but is otherwise the same as
         * [ConferenceServiceAsync.create].
         */
        fun create(
            params: ConferenceCreateParams
        ): CompletableFuture<HttpResponseFor<ConferenceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ConferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /conferences/{id}`, but is otherwise the same as
         * [ConferenceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(id, ConferenceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ConferenceRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> =
            retrieve(id, ConferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conferences`, but is otherwise the same as
         * [ConferenceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ConferenceListPageAsync>> =
            list(ConferenceListParams.none())

        /** @see list */
        fun list(
            params: ConferenceListParams = ConferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceListPageAsync>>

        /** @see list */
        fun list(
            params: ConferenceListParams = ConferenceListParams.none()
        ): CompletableFuture<HttpResponseFor<ConferenceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConferenceListPageAsync>> =
            list(ConferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conferences/{conference_id}/participants`, but is
         * otherwise the same as [ConferenceServiceAsync.listParticipants].
         */
        fun listParticipants(
            conferenceId: String
        ): CompletableFuture<HttpResponseFor<ConferenceListParticipantsPageAsync>> =
            listParticipants(conferenceId, ConferenceListParticipantsParams.none())

        /** @see listParticipants */
        fun listParticipants(
            conferenceId: String,
            params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceListParticipantsPageAsync>> =
            listParticipants(params.toBuilder().conferenceId(conferenceId).build(), requestOptions)

        /** @see listParticipants */
        fun listParticipants(
            conferenceId: String,
            params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceListParticipantsPageAsync>> =
            listParticipants(conferenceId, params, RequestOptions.none())

        /** @see listParticipants */
        fun listParticipants(
            params: ConferenceListParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceListParticipantsPageAsync>>

        /** @see listParticipants */
        fun listParticipants(
            params: ConferenceListParticipantsParams
        ): CompletableFuture<HttpResponseFor<ConferenceListParticipantsPageAsync>> =
            listParticipants(params, RequestOptions.none())

        /** @see listParticipants */
        fun listParticipants(
            conferenceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceListParticipantsPageAsync>> =
            listParticipants(conferenceId, ConferenceListParticipantsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conferences/{id}/participants/{participant_id}`,
         * but is otherwise the same as [ConferenceServiceAsync.retrieveParticipant].
         */
        fun retrieveParticipant(
            participantId: String,
            params: ConferenceRetrieveParticipantParams,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveParticipantResponse>> =
            retrieveParticipant(participantId, params, RequestOptions.none())

        /** @see retrieveParticipant */
        fun retrieveParticipant(
            participantId: String,
            params: ConferenceRetrieveParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveParticipantResponse>> =
            retrieveParticipant(
                params.toBuilder().participantId(participantId).build(),
                requestOptions,
            )

        /** @see retrieveParticipant */
        fun retrieveParticipant(
            params: ConferenceRetrieveParticipantParams
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveParticipantResponse>> =
            retrieveParticipant(params, RequestOptions.none())

        /** @see retrieveParticipant */
        fun retrieveParticipant(
            params: ConferenceRetrieveParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveParticipantResponse>>

        /**
         * Returns a raw HTTP response for `patch /conferences/{id}/participants/{participant_id}`,
         * but is otherwise the same as [ConferenceServiceAsync.updateParticipant].
         */
        fun updateParticipant(
            participantId: String,
            params: ConferenceUpdateParticipantParams,
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateParticipantResponse>> =
            updateParticipant(participantId, params, RequestOptions.none())

        /** @see updateParticipant */
        fun updateParticipant(
            participantId: String,
            params: ConferenceUpdateParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateParticipantResponse>> =
            updateParticipant(
                params.toBuilder().participantId(participantId).build(),
                requestOptions,
            )

        /** @see updateParticipant */
        fun updateParticipant(
            params: ConferenceUpdateParticipantParams
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateParticipantResponse>> =
            updateParticipant(params, RequestOptions.none())

        /** @see updateParticipant */
        fun updateParticipant(
            params: ConferenceUpdateParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateParticipantResponse>>
    }
}
