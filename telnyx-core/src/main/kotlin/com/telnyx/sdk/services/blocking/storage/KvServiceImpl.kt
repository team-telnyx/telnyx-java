// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

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
import com.telnyx.sdk.models.storage.kvs.KvCreateParams
import com.telnyx.sdk.models.storage.kvs.KvDeleteParams
import com.telnyx.sdk.models.storage.kvs.KvListPage
import com.telnyx.sdk.models.storage.kvs.KvListPageResponse
import com.telnyx.sdk.models.storage.kvs.KvListParams
import com.telnyx.sdk.models.storage.kvs.KvNamespaceResponseWrapper
import com.telnyx.sdk.models.storage.kvs.KvRetrieveParams
import com.telnyx.sdk.services.blocking.storage.kvs.KeyService
import com.telnyx.sdk.services.blocking.storage.kvs.KeyServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage KV storage namespaces */
class KvServiceImpl internal constructor(private val clientOptions: ClientOptions) : KvService {

    private val withRawResponse: KvService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val keys: KeyService by lazy { KeyServiceImpl(clientOptions) }

    override fun withRawResponse(): KvService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KvService =
        KvServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Read and write keys within a KV namespace */
    override fun keys(): KeyService = keys

    override fun create(
        params: KvCreateParams,
        requestOptions: RequestOptions,
    ): KvNamespaceResponseWrapper =
        // post /storage/kvs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: KvRetrieveParams,
        requestOptions: RequestOptions,
    ): KvNamespaceResponseWrapper =
        // get /storage/kvs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: KvListParams, requestOptions: RequestOptions): KvListPage =
        // get /storage/kvs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: KvDeleteParams,
        requestOptions: RequestOptions,
    ): KvNamespaceResponseWrapper =
        // delete /storage/kvs/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KvService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val keys: KeyService.WithRawResponse by lazy {
            KeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KvService.WithRawResponse =
            KvServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Read and write keys within a KV namespace */
        override fun keys(): KeyService.WithRawResponse = keys

        private val createHandler: Handler<KvNamespaceResponseWrapper> =
            jsonHandler<KvNamespaceResponseWrapper>(clientOptions.jsonMapper)

        override fun create(
            params: KvCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KvNamespaceResponseWrapper> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs")
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

        private val retrieveHandler: Handler<KvNamespaceResponseWrapper> =
            jsonHandler<KvNamespaceResponseWrapper>(clientOptions.jsonMapper)

        override fun retrieve(
            params: KvRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KvNamespaceResponseWrapper> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs", params._pathParam(0))
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

        private val listHandler: Handler<KvListPageResponse> =
            jsonHandler<KvListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: KvListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KvListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs")
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
                        KvListPage.builder()
                            .service(KvServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<KvNamespaceResponseWrapper> =
            jsonHandler<KvNamespaceResponseWrapper>(clientOptions.jsonMapper)

        override fun delete(
            params: KvDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KvNamespaceResponseWrapper> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "kvs", params._pathParam(0))
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
