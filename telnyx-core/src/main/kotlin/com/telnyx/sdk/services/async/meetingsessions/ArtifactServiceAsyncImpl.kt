// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingsessions

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
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactCreateParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactListParams
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactListResponse
import com.telnyx.sdk.models.meetingsessions.artifacts.ArtifactRetrieveParams
import com.telnyx.sdk.models.meetingsessions.artifacts.MeetingSessionArtifactResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and retrieve asynchronous summaries and action-item artifacts. */
class ArtifactServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ArtifactServiceAsync {

    private val withRawResponse: ArtifactServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ArtifactServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ArtifactServiceAsync =
        ArtifactServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ArtifactCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionArtifactResponse> =
        // post /meeting_sessions/{id}/artifacts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ArtifactRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeetingSessionArtifactResponse> =
        // get /meeting_sessions/{id}/artifacts/{artifact_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ArtifactListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ArtifactListResponse> =
        // get /meeting_sessions/{id}/artifacts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ArtifactServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ArtifactServiceAsync.WithRawResponse =
            ArtifactServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MeetingSessionArtifactResponse> =
            jsonHandler<MeetingSessionArtifactResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ArtifactCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "artifacts")
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

        private val retrieveHandler: Handler<MeetingSessionArtifactResponse> =
            jsonHandler<MeetingSessionArtifactResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ArtifactRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeetingSessionArtifactResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("artifactId", params.artifactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "meeting_sessions",
                        params._pathParam(0),
                        "artifacts",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<ArtifactListResponse> =
            jsonHandler<ArtifactListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ArtifactListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ArtifactListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("meeting_sessions", params._pathParam(0), "artifacts")
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
    }
}
