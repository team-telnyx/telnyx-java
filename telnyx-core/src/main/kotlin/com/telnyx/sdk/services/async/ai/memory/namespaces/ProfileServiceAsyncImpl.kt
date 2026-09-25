// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListPageAsync
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListPageResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryResponse
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.MemoryServiceAsync
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.MemoryServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.SourceServiceAsync
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.SourceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProfileServiceAsync {

    private val withRawResponse: ProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val memories: MemoryServiceAsync by lazy { MemoryServiceAsyncImpl(clientOptions) }

    private val sources: SourceServiceAsync by lazy { SourceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync =
        ProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** What a namespace and a profile hold. */
    override fun memories(): MemoryServiceAsync = memories

    /** What a profile stored, and what its memories came from. */
    override fun sources(): SourceServiceAsync = sources

    override fun list(
        params: ProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileListPageAsync> =
        // get /ai/memory/namespaces/{namespace}/profiles
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: ProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileDeleteResponse> =
        // delete /ai/memory/namespaces/{namespace}/profiles/{profile_id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    override fun ingest(
        params: ProfileIngestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileIngestResponse> =
        // post /ai/memory/namespaces/{namespace}/profiles/{profile_id}/ingest
        withRawResponse().ingest(params, requestOptions).mapCancellable { it.parse() }

    override fun recall(
        params: ProfileRecallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileRecallResponse> =
        // post /ai/memory/namespaces/{namespace}/profiles/{profile_id}/recall
        withRawResponse().recall(params, requestOptions).mapCancellable { it.parse() }

    override fun remember(
        params: ProfileRememberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileRememberResponse> =
        // post /ai/memory/namespaces/{namespace}/profiles/{profile_id}/remember
        withRawResponse().remember(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveSummary(
        params: ProfileRetrieveSummaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileRetrieveSummaryResponse> =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/summary
        withRawResponse().retrieveSummary(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val memories: MemoryServiceAsync.WithRawResponse by lazy {
            MemoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sources: SourceServiceAsync.WithRawResponse by lazy {
            SourceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse =
            ProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** What a namespace and a profile hold. */
        override fun memories(): MemoryServiceAsync.WithRawResponse = memories

        /** What a profile stored, and what its memories came from. */
        override fun sources(): SourceServiceAsync.WithRawResponse = sources

        private val listHandler: Handler<ProfileListPageResponse> =
            jsonHandler<ProfileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("namespace", params.namespace().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "memory", "namespaces", params._pathParam(0), "profiles")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ProfileListPageAsync.builder()
                                    .service(ProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ProfileDeleteResponse> =
            jsonHandler<ProfileDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ProfileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val ingestHandler: Handler<ProfileIngestResponse> =
            jsonHandler<ProfileIngestResponse>(clientOptions.jsonMapper)

        override fun ingest(
            params: ProfileIngestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileIngestResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                        "ingest",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { ingestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val recallHandler: Handler<ProfileRecallResponse> =
            jsonHandler<ProfileRecallResponse>(clientOptions.jsonMapper)

        override fun recall(
            params: ProfileRecallParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileRecallResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                        "recall",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { recallHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rememberHandler: Handler<ProfileRememberResponse> =
            jsonHandler<ProfileRememberResponse>(clientOptions.jsonMapper)

        override fun remember(
            params: ProfileRememberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileRememberResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                        "remember",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { rememberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveSummaryHandler: Handler<ProfileRetrieveSummaryResponse> =
            jsonHandler<ProfileRetrieveSummaryResponse>(clientOptions.jsonMapper)

        override fun retrieveSummary(
            params: ProfileRetrieveSummaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveSummaryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("profileId", params.profileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "profiles",
                        params._pathParam(1),
                        "summary",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSummaryHandler.handle(it) }
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
