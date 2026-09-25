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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceDeleteResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListPage
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListPageResponse
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceListParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources.SourceRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** What a profile stored, and what its memories came from. */
class SourceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SourceService {

    private val withRawResponse: SourceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SourceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SourceService =
        SourceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SourceRetrieveParams,
        requestOptions: RequestOptions,
    ): SourceRetrieveResponse =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources/{source_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: SourceListParams, requestOptions: RequestOptions): SourceListPage =
        // get /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SourceDeleteParams,
        requestOptions: RequestOptions,
    ): SourceDeleteResponse =
        // delete /ai/memory/namespaces/{namespace}/profiles/{profile_id}/sources/{source_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SourceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SourceService.WithRawResponse =
            SourceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SourceRetrieveResponse> =
            jsonHandler<SourceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SourceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SourceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sourceId", params.sourceId().getOrNull())
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
                        "sources",
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

        private val listHandler: Handler<SourceListPageResponse> =
            jsonHandler<SourceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SourceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SourceListPage> {
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
                        "sources",
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
                        SourceListPage.builder()
                            .service(SourceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<SourceDeleteResponse> =
            jsonHandler<SourceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SourceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SourceDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sourceId", params.sourceId().getOrNull())
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
                        "sources",
                        params._pathParam(2),
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
    }
}
