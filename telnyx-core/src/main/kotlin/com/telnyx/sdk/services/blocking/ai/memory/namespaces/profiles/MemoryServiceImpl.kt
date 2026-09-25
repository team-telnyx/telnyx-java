// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces.profiles

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryListPage
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryListPageResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories.MemoryRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** What a namespace and a profile hold. */
class MemoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MemoryService {

    private val withRawResponse: MemoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MemoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryService =
        MemoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: MemoryRetrieveParams,
        requestOptions: RequestOptions,
    ): MemoryRetrieveResponse =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/memories/{memory_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: MemoryListParams, requestOptions: RequestOptions): MemoryListPage =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/memories
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemoryService.WithRawResponse =
            MemoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<MemoryRetrieveResponse> =
            jsonHandler<MemoryRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MemoryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemoryRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("memoryId", params.memoryId().getOrNull())
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
                        "memories",
                        params._pathParam(2),
                    )
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

        private val listHandler: Handler<MemoryListPageResponse> =
            jsonHandler<MemoryListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MemoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MemoryListPage> {
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
                        "memories",
                    )
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
                        MemoryListPage.builder()
                            .service(MemoryServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
