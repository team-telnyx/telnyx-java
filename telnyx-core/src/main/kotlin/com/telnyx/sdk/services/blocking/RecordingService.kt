// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.recordings.RecordingDeleteParams
import com.telnyx.sdk.models.recordings.RecordingDeleteResponse
import com.telnyx.sdk.models.recordings.RecordingListPage
import com.telnyx.sdk.models.recordings.RecordingListParams
import com.telnyx.sdk.models.recordings.RecordingRetrieveParams
import com.telnyx.sdk.models.recordings.RecordingRetrieveResponse
import com.telnyx.sdk.services.blocking.recordings.ActionService
import java.util.function.Consumer

interface RecordingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingService

    fun actions(): ActionService

    /** Retrieves the details of an existing call recording. */
    fun retrieve(recordingId: String): RecordingRetrieveResponse =
        retrieve(recordingId, RecordingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        recordingId: String,
        params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingRetrieveResponse =
        retrieve(params.toBuilder().recordingId(recordingId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        recordingId: String,
        params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
    ): RecordingRetrieveResponse = retrieve(recordingId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RecordingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RecordingRetrieveParams): RecordingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(recordingId: String, requestOptions: RequestOptions): RecordingRetrieveResponse =
        retrieve(recordingId, RecordingRetrieveParams.none(), requestOptions)

    /** Returns a list of your call recordings. */
    fun list(): RecordingListPage = list(RecordingListParams.none())

    /** @see list */
    fun list(
        params: RecordingListParams = RecordingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingListPage

    /** @see list */
    fun list(params: RecordingListParams = RecordingListParams.none()): RecordingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RecordingListPage =
        list(RecordingListParams.none(), requestOptions)

    /** Permanently deletes a call recording. */
    fun delete(recordingId: String): RecordingDeleteResponse =
        delete(recordingId, RecordingDeleteParams.none())

    /** @see delete */
    fun delete(
        recordingId: String,
        params: RecordingDeleteParams = RecordingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingDeleteResponse =
        delete(params.toBuilder().recordingId(recordingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        recordingId: String,
        params: RecordingDeleteParams = RecordingDeleteParams.none(),
    ): RecordingDeleteResponse = delete(recordingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RecordingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RecordingDeleteResponse

    /** @see delete */
    fun delete(params: RecordingDeleteParams): RecordingDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(recordingId: String, requestOptions: RequestOptions): RecordingDeleteResponse =
        delete(recordingId, RecordingDeleteParams.none(), requestOptions)

    /** A view of [RecordingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /recordings/{recording_id}`, but is otherwise the
         * same as [RecordingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(recordingId: String): HttpResponseFor<RecordingRetrieveResponse> =
            retrieve(recordingId, RecordingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            recordingId: String,
            params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingRetrieveResponse> =
            retrieve(params.toBuilder().recordingId(recordingId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            recordingId: String,
            params: RecordingRetrieveParams = RecordingRetrieveParams.none(),
        ): HttpResponseFor<RecordingRetrieveResponse> =
            retrieve(recordingId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RecordingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RecordingRetrieveParams): HttpResponseFor<RecordingRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            recordingId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingRetrieveResponse> =
            retrieve(recordingId, RecordingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /recordings`, but is otherwise the same as
         * [RecordingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RecordingListPage> = list(RecordingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RecordingListParams = RecordingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RecordingListParams = RecordingListParams.none()
        ): HttpResponseFor<RecordingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RecordingListPage> =
            list(RecordingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /recordings/{recording_id}`, but is otherwise the
         * same as [RecordingService.delete].
         */
        @MustBeClosed
        fun delete(recordingId: String): HttpResponseFor<RecordingDeleteResponse> =
            delete(recordingId, RecordingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            recordingId: String,
            params: RecordingDeleteParams = RecordingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingDeleteResponse> =
            delete(params.toBuilder().recordingId(recordingId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            recordingId: String,
            params: RecordingDeleteParams = RecordingDeleteParams.none(),
        ): HttpResponseFor<RecordingDeleteResponse> =
            delete(recordingId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RecordingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RecordingDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: RecordingDeleteParams): HttpResponseFor<RecordingDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            recordingId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingDeleteResponse> =
            delete(recordingId, RecordingDeleteParams.none(), requestOptions)
    }
}
