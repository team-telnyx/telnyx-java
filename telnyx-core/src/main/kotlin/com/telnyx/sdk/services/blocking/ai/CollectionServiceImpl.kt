// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.ai.collections.CollectionCreateParams
import com.telnyx.sdk.models.ai.collections.CollectionDeleteParams
import com.telnyx.sdk.models.ai.collections.CollectionEnvelope
import com.telnyx.sdk.models.ai.collections.CollectionListPage
import com.telnyx.sdk.models.ai.collections.CollectionListPageResponse
import com.telnyx.sdk.models.ai.collections.CollectionListParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveByIdParams
import com.telnyx.sdk.models.ai.collections.CollectionRetrieveParams
import com.telnyx.sdk.models.ai.collections.CollectionUpdateParams
import com.telnyx.sdk.services.blocking.ai.collections.SettingService
import com.telnyx.sdk.services.blocking.ai.collections.SettingServiceImpl
import com.telnyx.sdk.services.blocking.ai.collections.SourceService
import com.telnyx.sdk.services.blocking.ai.collections.SourceServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
class CollectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CollectionService {

    private val withRawResponse: CollectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    private val sources: SourceService by lazy { SourceServiceImpl(clientOptions) }

    override fun withRawResponse(): CollectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CollectionService =
        CollectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    override fun settings(): SettingService = settings

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    override fun sources(): SourceService = sources

    override fun create(
        params: CollectionCreateParams,
        requestOptions: RequestOptions,
    ): CollectionEnvelope =
        // post /ai/collections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CollectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CollectionEnvelope =
        // get /ai/collections/slug/{slug}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CollectionUpdateParams,
        requestOptions: RequestOptions,
    ): CollectionEnvelope =
        // patch /ai/collections/{uuid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CollectionListParams,
        requestOptions: RequestOptions,
    ): CollectionListPage =
        // get /ai/collections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CollectionDeleteParams, requestOptions: RequestOptions) {
        // delete /ai/collections/{uuid}
        withRawResponse().delete(params, requestOptions)
    }

    override fun retrieveById(
        params: CollectionRetrieveByIdParams,
        requestOptions: RequestOptions,
    ): CollectionEnvelope =
        // get /ai/collections/{uuid}
        withRawResponse().retrieveById(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CollectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sources: SourceService.WithRawResponse by lazy {
            SourceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CollectionService.WithRawResponse =
            CollectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        override fun settings(): SettingService.WithRawResponse = settings

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        override fun sources(): SourceService.WithRawResponse = sources

        private val createHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun create(
            params: CollectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionEnvelope> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections")
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

        private val retrieveHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CollectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionEnvelope> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("slug", params.slug().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", "slug", params._pathParam(0))
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

        private val updateHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun update(
            params: CollectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionEnvelope> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0))
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

        private val listHandler: Handler<CollectionListPageResponse> =
            jsonHandler<CollectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CollectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections")
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
                        CollectionListPage.builder()
                            .service(CollectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CollectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val retrieveByIdHandler: Handler<CollectionEnvelope> =
            jsonHandler<CollectionEnvelope>(clientOptions.jsonMapper)

        override fun retrieveById(
            params: CollectionRetrieveByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionEnvelope> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByIdHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
