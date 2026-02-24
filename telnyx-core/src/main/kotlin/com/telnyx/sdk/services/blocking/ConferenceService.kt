// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.conferences.ConferenceCreateParams
import com.telnyx.sdk.models.conferences.ConferenceCreateResponse
import com.telnyx.sdk.models.conferences.ConferenceListPage
import com.telnyx.sdk.models.conferences.ConferenceListParams
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsPage
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParticipantParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParticipantResponse
import com.telnyx.sdk.models.conferences.ConferenceRetrieveResponse
import com.telnyx.sdk.models.conferences.ConferenceUpdateParticipantParams
import com.telnyx.sdk.models.conferences.ConferenceUpdateParticipantResponse
import com.telnyx.sdk.services.blocking.conferences.ActionService
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

    fun actions(): ActionService

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
    fun create(params: ConferenceCreateParams): ConferenceCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceCreateResponse

    /** Retrieve an existing conference */
    fun retrieve(id: String): ConferenceRetrieveResponse =
        retrieve(id, ConferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
    ): ConferenceRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ConferenceRetrieveParams): ConferenceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ConferenceRetrieveResponse =
        retrieve(id, ConferenceRetrieveParams.none(), requestOptions)

    /**
     * Lists conferences. Conferences are created on demand, and will expire after all participants
     * have left the conference or after 4 hours regardless of the number of active participants.
     * Conferences are listed in descending order by `expires_at`.
     */
    fun list(): ConferenceListPage = list(ConferenceListParams.none())

    /** @see list */
    fun list(
        params: ConferenceListParams = ConferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceListPage

    /** @see list */
    fun list(params: ConferenceListParams = ConferenceListParams.none()): ConferenceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ConferenceListPage =
        list(ConferenceListParams.none(), requestOptions)

    /** Lists conference participants */
    fun listParticipants(conferenceId: String): ConferenceListParticipantsPage =
        listParticipants(conferenceId, ConferenceListParticipantsParams.none())

    /** @see listParticipants */
    fun listParticipants(
        conferenceId: String,
        params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceListParticipantsPage =
        listParticipants(params.toBuilder().conferenceId(conferenceId).build(), requestOptions)

    /** @see listParticipants */
    fun listParticipants(
        conferenceId: String,
        params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
    ): ConferenceListParticipantsPage =
        listParticipants(conferenceId, params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        params: ConferenceListParticipantsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceListParticipantsPage

    /** @see listParticipants */
    fun listParticipants(params: ConferenceListParticipantsParams): ConferenceListParticipantsPage =
        listParticipants(params, RequestOptions.none())

    /** @see listParticipants */
    fun listParticipants(
        conferenceId: String,
        requestOptions: RequestOptions,
    ): ConferenceListParticipantsPage =
        listParticipants(conferenceId, ConferenceListParticipantsParams.none(), requestOptions)

    /** Retrieve details of a specific conference participant by their ID or label. */
    fun retrieveParticipant(
        participantId: String,
        params: ConferenceRetrieveParticipantParams,
    ): ConferenceRetrieveParticipantResponse =
        retrieveParticipant(participantId, params, RequestOptions.none())

    /** @see retrieveParticipant */
    fun retrieveParticipant(
        participantId: String,
        params: ConferenceRetrieveParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveParticipantResponse =
        retrieveParticipant(params.toBuilder().participantId(participantId).build(), requestOptions)

    /** @see retrieveParticipant */
    fun retrieveParticipant(
        params: ConferenceRetrieveParticipantParams
    ): ConferenceRetrieveParticipantResponse = retrieveParticipant(params, RequestOptions.none())

    /** @see retrieveParticipant */
    fun retrieveParticipant(
        params: ConferenceRetrieveParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceRetrieveParticipantResponse

    /** Update properties of a conference participant. */
    fun updateParticipant(
        participantId: String,
        params: ConferenceUpdateParticipantParams,
    ): ConferenceUpdateParticipantResponse =
        updateParticipant(participantId, params, RequestOptions.none())

    /** @see updateParticipant */
    fun updateParticipant(
        participantId: String,
        params: ConferenceUpdateParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceUpdateParticipantResponse =
        updateParticipant(params.toBuilder().participantId(participantId).build(), requestOptions)

    /** @see updateParticipant */
    fun updateParticipant(
        params: ConferenceUpdateParticipantParams
    ): ConferenceUpdateParticipantResponse = updateParticipant(params, RequestOptions.none())

    /** @see updateParticipant */
    fun updateParticipant(
        params: ConferenceUpdateParticipantParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConferenceUpdateParticipantResponse

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

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /conferences`, but is otherwise the same as
         * [ConferenceService.create].
         */
        @MustBeClosed
        fun create(params: ConferenceCreateParams): HttpResponseFor<ConferenceCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ConferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceCreateResponse>

        /**
         * Returns a raw HTTP response for `get /conferences/{id}`, but is otherwise the same as
         * [ConferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ConferenceRetrieveResponse> =
            retrieve(id, ConferenceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ConferenceRetrieveParams = ConferenceRetrieveParams.none(),
        ): HttpResponseFor<ConferenceRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConferenceRetrieveParams
        ): HttpResponseFor<ConferenceRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceRetrieveResponse> =
            retrieve(id, ConferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conferences`, but is otherwise the same as
         * [ConferenceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ConferenceListPage> = list(ConferenceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConferenceListParams = ConferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConferenceListParams = ConferenceListParams.none()
        ): HttpResponseFor<ConferenceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConferenceListPage> =
            list(ConferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conferences/{conference_id}/participants`, but is
         * otherwise the same as [ConferenceService.listParticipants].
         */
        @MustBeClosed
        fun listParticipants(
            conferenceId: String
        ): HttpResponseFor<ConferenceListParticipantsPage> =
            listParticipants(conferenceId, ConferenceListParticipantsParams.none())

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            conferenceId: String,
            params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceListParticipantsPage> =
            listParticipants(params.toBuilder().conferenceId(conferenceId).build(), requestOptions)

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            conferenceId: String,
            params: ConferenceListParticipantsParams = ConferenceListParticipantsParams.none(),
        ): HttpResponseFor<ConferenceListParticipantsPage> =
            listParticipants(conferenceId, params, RequestOptions.none())

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            params: ConferenceListParticipantsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceListParticipantsPage>

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            params: ConferenceListParticipantsParams
        ): HttpResponseFor<ConferenceListParticipantsPage> =
            listParticipants(params, RequestOptions.none())

        /** @see listParticipants */
        @MustBeClosed
        fun listParticipants(
            conferenceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceListParticipantsPage> =
            listParticipants(conferenceId, ConferenceListParticipantsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /conferences/{id}/participants/{participant_id}`,
         * but is otherwise the same as [ConferenceService.retrieveParticipant].
         */
        @MustBeClosed
        fun retrieveParticipant(
            participantId: String,
            params: ConferenceRetrieveParticipantParams,
        ): HttpResponseFor<ConferenceRetrieveParticipantResponse> =
            retrieveParticipant(participantId, params, RequestOptions.none())

        /** @see retrieveParticipant */
        @MustBeClosed
        fun retrieveParticipant(
            participantId: String,
            params: ConferenceRetrieveParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveParticipantResponse> =
            retrieveParticipant(
                params.toBuilder().participantId(participantId).build(),
                requestOptions,
            )

        /** @see retrieveParticipant */
        @MustBeClosed
        fun retrieveParticipant(
            params: ConferenceRetrieveParticipantParams
        ): HttpResponseFor<ConferenceRetrieveParticipantResponse> =
            retrieveParticipant(params, RequestOptions.none())

        /** @see retrieveParticipant */
        @MustBeClosed
        fun retrieveParticipant(
            params: ConferenceRetrieveParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceRetrieveParticipantResponse>

        /**
         * Returns a raw HTTP response for `patch /conferences/{id}/participants/{participant_id}`,
         * but is otherwise the same as [ConferenceService.updateParticipant].
         */
        @MustBeClosed
        fun updateParticipant(
            participantId: String,
            params: ConferenceUpdateParticipantParams,
        ): HttpResponseFor<ConferenceUpdateParticipantResponse> =
            updateParticipant(participantId, params, RequestOptions.none())

        /** @see updateParticipant */
        @MustBeClosed
        fun updateParticipant(
            participantId: String,
            params: ConferenceUpdateParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceUpdateParticipantResponse> =
            updateParticipant(
                params.toBuilder().participantId(participantId).build(),
                requestOptions,
            )

        /** @see updateParticipant */
        @MustBeClosed
        fun updateParticipant(
            params: ConferenceUpdateParticipantParams
        ): HttpResponseFor<ConferenceUpdateParticipantResponse> =
            updateParticipant(params, RequestOptions.none())

        /** @see updateParticipant */
        @MustBeClosed
        fun updateParticipant(
            params: ConferenceUpdateParticipantParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConferenceUpdateParticipantResponse>
    }
}
