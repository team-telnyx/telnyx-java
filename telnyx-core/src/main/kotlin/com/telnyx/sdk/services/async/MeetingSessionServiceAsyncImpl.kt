// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
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
import com.telnyx.sdk.services.async.meetingsessions.ActionServiceAsync
import com.telnyx.sdk.services.async.meetingsessions.ActionServiceAsyncImpl
import com.telnyx.sdk.services.async.meetingsessions.ArtifactServiceAsync
import com.telnyx.sdk.services.async.meetingsessions.ArtifactServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MeetingSessionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MeetingSessionServiceAsync {

    private val withRawResponse: MeetingSessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    private val artifacts: ArtifactServiceAsync by lazy { ArtifactServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MeetingSessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MeetingSessionServiceAsync =
        MeetingSessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Send real-time speech and chat actions to an active meeting session. */
    override fun actions(): ActionServiceAsync = actions

    /** Create and retrieve asynchronous summaries and action-item artifacts. */
    override fun artifacts(): ArtifactServiceAsync = artifacts

    override fun create(
        params: MeetingSessionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionResponse> =
        // post /meeting_sessions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MeetingSessionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionResponse> =
        // get /meeting_sessions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MeetingSessionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionResponse> =
        // patch /meeting_sessions/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MeetingSessionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionListResponse> =
        // get /meeting_sessions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MeetingSessionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionResponse> =
        // delete /meeting_sessions/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun deleteRecordingMedia(
        params: MeetingSessionDeleteRecordingMediaParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionDeleteRecordingMediaResponse> =
        // delete /meeting_sessions/{id}/recording_media
        withRawResponse().deleteRecordingMedia(params, requestOptions).thenApply { it.parse() }

    override fun retrieveEvents(
        params: MeetingSessionRetrieveEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionRetrieveEventsResponse> =
        // get /meeting_sessions/{id}/events
        withRawResponse().retrieveEvents(params, requestOptions).thenApply { it.parse() }

    override fun retrieveRecordings(
        params: MeetingSessionRetrieveRecordingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionRetrieveRecordingsResponse> =
        // get /meeting_sessions/{id}/recordings
        withRawResponse().retrieveRecordings(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTranscript(
        params: MeetingSessionRetrieveTranscriptParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionRetrieveTranscriptResponse> =
        // get /meeting_sessions/{id}/transcript
        withRawResponse().retrieveTranscript(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingSessionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val artifacts: ArtifactServiceAsync.WithRawResponse by lazy {
            ArtifactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingSessionServiceAsync.WithRawResponse =
            MeetingSessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Send real-time speech and chat actions to an active meeting session. */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        /** Create and retrieve asynchronous summaries and action-item artifacts. */
        override fun artifacts(): ArtifactServiceAsync.WithRawResponse = artifacts

        private val createHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MeetingSessionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MeetingSessionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MeetingSessionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<MeetingSessionListResponse> =
            jsonHandler<MeetingSessionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MeetingSessionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<MeetingSessionResponse> =
            jsonHandler<MeetingSessionResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MeetingSessionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<MeetingSessionDeleteRecordingMediaResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteRecordingMediaHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveEventsHandler: Handler<MeetingSessionRetrieveEventsResponse> =
            jsonHandler<MeetingSessionRetrieveEventsResponse>(clientOptions.jsonMapper)

        override fun retrieveEvents(
            params: MeetingSessionRetrieveEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveEventsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "events")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveRecordingsHandler: Handler<MeetingSessionRetrieveRecordingsResponse> =
            jsonHandler<MeetingSessionRetrieveRecordingsResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordings(
            params: MeetingSessionRetrieveRecordingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveRecordingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "recordings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRecordingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveTranscriptHandler: Handler<MeetingSessionRetrieveTranscriptResponse> =
            jsonHandler<MeetingSessionRetrieveTranscriptResponse>(clientOptions.jsonMapper)

        override fun retrieveTranscript(
            params: MeetingSessionRetrieveTranscriptParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionRetrieveTranscriptResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "transcript")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
