// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces

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
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileDeleteResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileIngestResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListPage
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListPageResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRecallResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRememberResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.ProfileRetrieveSummaryResponse
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.MemoryService
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.MemoryServiceImpl
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.SourceService
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles.SourceServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProfileServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProfileService {

    private val withRawResponse: ProfileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val memories: MemoryService by lazy { MemoryServiceImpl(clientOptions) }

    private val sources: SourceService by lazy { SourceServiceImpl(clientOptions) }

    override fun withRawResponse(): ProfileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService =
        ProfileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** What a namespace and a profile hold. */
    override fun memories(): MemoryService = memories

    /** What a profile stored, and what its memories came from. */
    override fun sources(): SourceService = sources

    override fun list(params: ProfileListParams, requestOptions: RequestOptions): ProfileListPage =
        // get /ai/memory/namespaces/{namespace}/profiles
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ProfileDeleteParams,
        requestOptions: RequestOptions,
    ): ProfileDeleteResponse =
        // delete /ai/memory/namespaces/{namespace}/profiles/{profile_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun ingest(
        params: ProfileIngestParams,
        requestOptions: RequestOptions,
    ): ProfileIngestResponse =
        // post /ai/memory/namespaces/{namespace}/profiles/{profile_id}/ingest
        withRawResponse().ingest(params, requestOptions).parse()

    override fun recall(
        params: ProfileRecallParams,
        requestOptions: RequestOptions,
    ): ProfileRecallResponse =
        // post /ai/memory/namespaces/{namespace}/profiles/{profile_id}/recall
        withRawResponse().recall(params, requestOptions).parse()

    override fun remember(
        params: ProfileRememberParams,
        requestOptions: RequestOptions,
    ): ProfileRememberResponse =
        // post /ai/memory/namespaces/{namespace}/profiles/{profile_id}/remember
        withRawResponse().remember(params, requestOptions).parse()

    override fun retrieveSummary(
        params: ProfileRetrieveSummaryParams,
        requestOptions: RequestOptions,
    ): ProfileRetrieveSummaryResponse =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/summary
        withRawResponse().retrieveSummary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProfileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val memories: MemoryService.WithRawResponse by lazy {
            MemoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sources: SourceService.WithRawResponse by lazy {
            SourceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileService.WithRawResponse =
            ProfileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** What a namespace and a profile hold. */
        override fun memories(): MemoryService.WithRawResponse = memories

        /** What a profile stored, and what its memories came from. */
        override fun sources(): SourceService.WithRawResponse = sources

        private val listHandler: Handler<ProfileListPageResponse> =
            jsonHandler<ProfileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProfileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("namespace", params.namespace().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "memory", "namespaces", params._pathParam(0), "profiles")
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
                    .let {
                        ProfileListPage.builder()
                            .service(ProfileServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ProfileDeleteResponse> =
            jsonHandler<ProfileDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ProfileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileDeleteResponse> {
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

        private val ingestHandler: Handler<ProfileIngestResponse> =
            jsonHandler<ProfileIngestResponse>(clientOptions.jsonMapper)

        override fun ingest(
            params: ProfileIngestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileIngestResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { ingestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val recallHandler: Handler<ProfileRecallResponse> =
            jsonHandler<ProfileRecallResponse>(clientOptions.jsonMapper)

        override fun recall(
            params: ProfileRecallParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileRecallResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recallHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rememberHandler: Handler<ProfileRememberResponse> =
            jsonHandler<ProfileRememberResponse>(clientOptions.jsonMapper)

        override fun remember(
            params: ProfileRememberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileRememberResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { rememberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSummaryHandler: Handler<ProfileRetrieveSummaryResponse> =
            jsonHandler<ProfileRetrieveSummaryResponse>(clientOptions.jsonMapper)

        override fun retrieveSummary(
            params: ProfileRetrieveSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileRetrieveSummaryResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
