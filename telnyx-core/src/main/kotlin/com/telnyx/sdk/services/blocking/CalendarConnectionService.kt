// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.services.blocking.calendarconnections.MeetingService
import java.util.function.Consumer

/** Connect calendars and manage automatic meeting joins. */
interface CalendarConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarConnectionService

    /** Connect calendars and manage automatic meeting joins. */
    fun meetings(): MeetingService

    /**
     * Start Google Calendar or Microsoft Outlook OAuth. Open oauth_url in a browser. No connection
     * exists until authorization succeeds. The resulting connection is owned by the connecting
     * user.
     */
    fun create(params: CalendarConnectionCreateParams): CalendarConnectionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CalendarConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionCreateResponse

    /**
     * Retrieve a calendar connection owned by the authenticated connecting user. Missing and
     * foreign connections both return 404. Signing secrets are omitted.
     */
    fun retrieve(id: String): CalendarConnectionResponse =
        retrieve(id, CalendarConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
    ): CalendarConnectionResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CalendarConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionResponse

    /** @see retrieve */
    fun retrieve(params: CalendarConnectionRetrieveParams): CalendarConnectionResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CalendarConnectionResponse =
        retrieve(id, CalendarConnectionRetrieveParams.none(), requestOptions)

    /**
     * Update policy or defaults for future sessions. Supply at least one field. Existing sessions
     * retain their configuration. Null clears nullable overrides. Assistant, recording, and webhook
     * defaults apply to Google Meet and Teams. Assistant defaults require default_barge_in to be
     * false or null and default_voice to be null. Recording=true requires a destination; false
     * rejects one. A non-null default_webhook_url update returns webhook_secret once; save it to
     * verify future session deliveries.
     */
    fun update(id: String): CalendarConnectionUpdateResponse =
        update(id, CalendarConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
    ): CalendarConnectionUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CalendarConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionUpdateResponse

    /** @see update */
    fun update(params: CalendarConnectionUpdateParams): CalendarConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CalendarConnectionUpdateResponse =
        update(id, CalendarConnectionUpdateParams.none(), requestOptions)

    /**
     * List only the authenticated connecting user’s calendar connections. Session resources created
     * by those connections are shared within the organization.
     */
    fun list(): CalendarConnectionListResponse = list(CalendarConnectionListParams.none())

    /** @see list */
    fun list(
        params: CalendarConnectionListParams = CalendarConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionListResponse

    /** @see list */
    fun list(
        params: CalendarConnectionListParams = CalendarConnectionListParams.none()
    ): CalendarConnectionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CalendarConnectionListResponse =
        list(CalendarConnectionListParams.none(), requestOptions)

    /**
     * Disconnect the calendar, cancel future joins, and clear retained calendar identity fields.
     * Previously created session records, transcripts, artifacts, and Storage objects remain. The
     * response is the updated connection.
     */
    fun delete(id: String): CalendarConnectionResponse =
        delete(id, CalendarConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
    ): CalendarConnectionResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CalendarConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CalendarConnectionResponse

    /** @see delete */
    fun delete(params: CalendarConnectionDeleteParams): CalendarConnectionResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CalendarConnectionResponse =
        delete(id, CalendarConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [CalendarConnectionService] that provides access to raw HTTP responses for each
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
        ): CalendarConnectionService.WithRawResponse

        /** Connect calendars and manage automatic meeting joins. */
        fun meetings(): MeetingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /calendar_connections`, but is otherwise the same
         * as [CalendarConnectionService.create].
         */
        @MustBeClosed
        fun create(
            params: CalendarConnectionCreateParams
        ): HttpResponseFor<CalendarConnectionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CalendarConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /calendar_connections/{id}`, but is otherwise the
         * same as [CalendarConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CalendarConnectionResponse> =
            retrieve(id, CalendarConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CalendarConnectionRetrieveParams = CalendarConnectionRetrieveParams.none(),
        ): HttpResponseFor<CalendarConnectionResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CalendarConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CalendarConnectionRetrieveParams
        ): HttpResponseFor<CalendarConnectionResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionResponse> =
            retrieve(id, CalendarConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /calendar_connections/{id}`, but is otherwise the
         * same as [CalendarConnectionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<CalendarConnectionUpdateResponse> =
            update(id, CalendarConnectionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CalendarConnectionUpdateParams = CalendarConnectionUpdateParams.none(),
        ): HttpResponseFor<CalendarConnectionUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CalendarConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: CalendarConnectionUpdateParams
        ): HttpResponseFor<CalendarConnectionUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionUpdateResponse> =
            update(id, CalendarConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /calendar_connections`, but is otherwise the same as
         * [CalendarConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CalendarConnectionListResponse> =
            list(CalendarConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CalendarConnectionListParams = CalendarConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CalendarConnectionListParams = CalendarConnectionListParams.none()
        ): HttpResponseFor<CalendarConnectionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CalendarConnectionListResponse> =
            list(CalendarConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /calendar_connections/{id}`, but is otherwise the
         * same as [CalendarConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CalendarConnectionResponse> =
            delete(id, CalendarConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CalendarConnectionDeleteParams = CalendarConnectionDeleteParams.none(),
        ): HttpResponseFor<CalendarConnectionResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CalendarConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CalendarConnectionResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CalendarConnectionDeleteParams
        ): HttpResponseFor<CalendarConnectionResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionResponse> =
            delete(id, CalendarConnectionDeleteParams.none(), requestOptions)
    }
}
