// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionCreateParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionCreateResponse
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionDeleteParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionListParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionListResponse
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionResponse
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionRetrieveParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionUpdateParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionUpdateResponse
import com.telnyx.sdk.services.async.calendarconnections.MeetingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Connect calendars and manage automatic meeting joins. */
interface CalendarConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarConnectionServiceAsync

    /** Connect calendars and manage automatic meeting joins. */
    fun meetings(): MeetingServiceAsync

    /**
     * Start Google Calendar or Microsoft Outlook OAuth. Open oauth_url in a browser. No connection
     * exists until authorization succeeds. The resulting connection is owned by the connecting
     * user.
     */
    fun create(
        params: CalendarConnectionCreateParams
    ): CompletableFuture<CalendarConnectionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CalendarConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionCreateResponse>

    /**
     * Retrieve a calendar connection owned by the authenticated connecting user. Missing and
     * foreign connections both return 404. Signing secrets are omitted.
     */
    fun retrieve(id: String): CompletableFuture<CalendarConnectionResponse> =
        retrieve(id, CalendarConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
    ): CompletableFuture<CalendarConnectionResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CalendarConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionResponse>

    /** @see retrieve */
    fun retrieve(
        params: CalendarConnectionRetrieveParams
    ): CompletableFuture<CalendarConnectionResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CalendarConnectionResponse> =
        retrieve(id, CalendarConnectionRetrieveParams.none(), requestOptions)

    /**
     * Update policy or defaults for future sessions. Supply at least one field. Existing sessions
     * retain their configuration. Null clears nullable overrides. Assistant, recording, and webhook
     * defaults apply to Google Meet and Teams. Assistant defaults require default_barge_in to be
     * false or null and default_voice to be null. Recording=true requires a destination; false
     * rejects one. A non-null default_webhook_url update returns webhook_secret once; save it to
     * verify future session deliveries.
     */
    fun update(id: String): CompletableFuture<CalendarConnectionUpdateResponse> =
        update(id, CalendarConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
    ): CompletableFuture<CalendarConnectionUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CalendarConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionUpdateResponse>

    /** @see update */
    fun update(
        params: CalendarConnectionUpdateParams
    ): CompletableFuture<CalendarConnectionUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CalendarConnectionUpdateResponse> =
        update(id, CalendarConnectionUpdateParams.none(), requestOptions)

    /**
     * List only the authenticated connecting user’s calendar connections. Session resources created
     * by those connections are shared within the organization.
     */
    fun list(): CompletableFuture<CalendarConnectionListResponse> =
        list(CalendarConnectionListParams.none())

    /** @see list */
    fun list(
        params: CalendarConnectionListParams = CalendarConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionListResponse>

    /** @see list */
    fun list(
        params: CalendarConnectionListParams = CalendarConnectionListParams.none()
    ): CompletableFuture<CalendarConnectionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CalendarConnectionListResponse> =
        list(CalendarConnectionListParams.none(), requestOptions)

    /**
     * Disconnect the calendar, cancel future joins, and clear retained calendar identity fields.
     * Previously created session records, transcripts, artifacts, and Storage objects remain. The
     * response is the updated connection.
     */
    fun delete(id: String): CompletableFuture<CalendarConnectionResponse> =
        delete(id, CalendarConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
    ): CompletableFuture<CalendarConnectionResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CalendarConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CalendarConnectionResponse>

    /** @see delete */
    fun delete(
        params: CalendarConnectionDeleteParams
    ): CompletableFuture<CalendarConnectionResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CalendarConnectionResponse> =
        delete(id, CalendarConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [CalendarConnectionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarConnectionServiceAsync.WithRawResponse

        /** Connect calendars and manage automatic meeting joins. */
        fun meetings(): MeetingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /calendar_connections`, but is otherwise the same
         * as [CalendarConnectionServiceAsync.create].
         */
        fun create(
            params: CalendarConnectionCreateParams
        ): CompletableFuture<HttpResponseFor<CalendarConnectionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CalendarConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /calendar_connections/{id}`, but is otherwise the
         * same as [CalendarConnectionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            retrieve(id, CalendarConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CalendarConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CalendarConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            retrieve(id, CalendarConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /calendar_connections/{id}`, but is otherwise the
         * same as [CalendarConnectionServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<CalendarConnectionUpdateResponse>> =
            update(id, CalendarConnectionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CalendarConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionUpdateResponse>>

        /** @see update */
        fun update(
            params: CalendarConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<CalendarConnectionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CalendarConnectionUpdateResponse>> =
            update(id, CalendarConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /calendar_connections`, but is otherwise the same as
         * [CalendarConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CalendarConnectionListResponse>> =
            list(CalendarConnectionListParams.none())

        /** @see list */
        fun list(
            params: CalendarConnectionListParams = CalendarConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionListResponse>>

        /** @see list */
        fun list(
            params: CalendarConnectionListParams = CalendarConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<CalendarConnectionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CalendarConnectionListResponse>> =
            list(CalendarConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /calendar_connections/{id}`, but is otherwise the
         * same as [CalendarConnectionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            delete(id, CalendarConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CalendarConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>>

        /** @see delete */
        fun delete(
            params: CalendarConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CalendarConnectionResponse>> =
            delete(id, CalendarConnectionDeleteParams.none(), requestOptions)
    }
}
