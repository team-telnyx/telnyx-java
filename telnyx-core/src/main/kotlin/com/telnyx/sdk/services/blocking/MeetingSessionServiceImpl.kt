// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.meetingsessions.MeetingSessionCreateParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionDeleteParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionDeleteRecordingMediaParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionDeleteRecordingMediaResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionListParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionListResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveEventsParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveEventsResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveRecordingsParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveRecordingsResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveTranscriptParams
import com.telnyx.sdk.models.meetingsessions.MeetingSessionRetrieveTranscriptResponse
import com.telnyx.sdk.models.meetingsessions.MeetingSessionUpdateParams
import com.telnyx.sdk.services.blocking.meetingsessions.ActionService
import com.telnyx.sdk.services.blocking.meetingsessions.ActionServiceImpl
import com.telnyx.sdk.services.blocking.meetingsessions.ArtifactService
import com.telnyx.sdk.services.blocking.meetingsessions.ArtifactServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MeetingSessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingSessionService {

    private val withRawResponse: MeetingSessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    private val artifacts: ArtifactService by lazy { ArtifactServiceImpl(clientOptions) }

    override fun withRawResponse(): MeetingSessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingSessionService =
        MeetingSessionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Send real-time speech and chat actions to an active meeting session. */
    override fun actions(): ActionService = actions

    /** Create and retrieve asynchronous summaries and action-item artifacts. */
    override fun artifacts(): ArtifactService = artifacts

    override fun create(
        params: MeetingSessionCreateParams,
        requestOptions: RequestOptions,
    ): MeetingSessionResponse =
        // post /meeting_sessions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MeetingSessionRetrieveParams,
        requestOptions: RequestOptions,
    ): MeetingSessionResponse =
        // get /meeting_sessions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: MeetingSessionUpdateParams,
        requestOptions: RequestOptions,
    ): MeetingSessionResponse =
        // patch /meeting_sessions/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MeetingSessionListParams,
        requestOptions: RequestOptions,
    ): MeetingSessionListResponse =
        // get /meeting_sessions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MeetingSessionDeleteParams,
        requestOptions: RequestOptions,
    ): MeetingSessionResponse =
        // delete /meeting_sessions/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun deleteRecordingMedia(
        params: MeetingSessionDeleteRecordingMediaParams,
        requestOptions: RequestOptions,
    ): MeetingSessionDeleteRecordingMediaResponse =
        // delete /meeting_sessions/{id}/recording_media
        withRawResponse().deleteRecordingMedia(params, requestOptions).parse()

    override fun retrieveEvents(
        params: MeetingSessionRetrieveEventsParams,
        requestOptions: RequestOptions,
    ): MeetingSessionRetrieveEventsResponse =
        // get /meeting_sessions/{id}/events
        withRawResponse().retrieveEvents(params, requestOptions).parse()

    override fun retrieveRecordings(
        params: MeetingSessionRetrieveRecordingsParams,
        requestOptions: RequestOptions,
    ): MeetingSessionRetrieveRecordingsResponse =
        // get /meeting_sessions/{id}/recordings
        withRawResponse().retrieveRecordings(params, requestOptions).parse()

    override fun retrieveTranscript(
        params: MeetingSessionRetrieveTranscriptParams,
        requestOptions: RequestOptions,
    ): MeetingSessionRetrieveTranscriptResponse =
        // get /meeting_sessions/{id}/transcript
        withRawResponse().retrieveTranscript(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingSessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val artifacts: ArtifactService.WithRawResponse by lazy {
            ArtifactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingSessionService.WithRawResponse =
            MeetingSessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Send real-time speech and chat actions to an active meeting session. */
        override fun actions(): ActionService.WithRawResponse = actions

        /** Create and retrieve asynchronous summaries and action-item artifacts. */
        override fun artifacts(): ArtifactService.WithRawResponse = artifacts

        private val createHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MeetingSessionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MeetingSessionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MeetingSessionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MeetingSessionListResponse> =
            jsonHandler<MeetingSessionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MeetingSessionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MeetingSessionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteRecordingMediaHandler:
            Handler<MeetingSessionDeleteRecordingMediaResponse> =
            jsonHandler<MeetingSessionDeleteRecordingMediaResponse>(clientOptions.jsonMapper)

        override fun deleteRecordingMedia(
            params: MeetingSessionDeleteRecordingMediaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "recording_media")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteRecordingMediaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveEventsHandler: Handler<MeetingSessionRetrieveEventsResponse> =
            jsonHandler<MeetingSessionRetrieveEventsResponse>(clientOptions.jsonMapper)

        override fun retrieveEvents(
            params: MeetingSessionRetrieveEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionRetrieveEventsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveRecordingsHandler: Handler<MeetingSessionRetrieveRecordingsResponse> =
            jsonHandler<MeetingSessionRetrieveRecordingsResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordings(
            params: MeetingSessionRetrieveRecordingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionRetrieveRecordingsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "recordings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRecordingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveTranscriptHandler: Handler<MeetingSessionRetrieveTranscriptResponse> =
            jsonHandler<MeetingSessionRetrieveTranscriptResponse>(clientOptions.jsonMapper)

        override fun retrieveTranscript(
            params: MeetingSessionRetrieveTranscriptParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingSessionRetrieveTranscriptResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "transcript")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveTranscriptHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
