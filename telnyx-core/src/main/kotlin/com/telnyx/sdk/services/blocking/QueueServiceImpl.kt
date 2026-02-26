// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.queues.QueueCreateParams
import com.telnyx.sdk.models.queues.QueueCreateResponse
import com.telnyx.sdk.models.queues.QueueDeleteParams
import com.telnyx.sdk.models.queues.QueueListPage
import com.telnyx.sdk.models.queues.QueueListPageResponse
import com.telnyx.sdk.models.queues.QueueListParams
import com.telnyx.sdk.models.queues.QueueRetrieveParams
import com.telnyx.sdk.models.queues.QueueRetrieveResponse
import com.telnyx.sdk.models.queues.QueueUpdateParams
import com.telnyx.sdk.models.queues.QueueUpdateResponse
import com.telnyx.sdk.services.blocking.queues.CallService
import com.telnyx.sdk.services.blocking.queues.CallServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class QueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueService {

    private val withRawResponse: QueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calls: CallService by lazy { CallServiceImpl(clientOptions) }

    override fun withRawResponse(): QueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService =
        QueueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calls(): CallService = calls

    override fun create(
        params: QueueCreateParams,
        requestOptions: RequestOptions,
    ): QueueCreateResponse =
        // post /queues
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions,
    ): QueueRetrieveResponse =
        // get /queues/{queue_name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: QueueUpdateParams,
        requestOptions: RequestOptions,
    ): QueueUpdateResponse =
        // post /queues/{queue_name}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: QueueListParams, requestOptions: RequestOptions): QueueListPage =
        // get /queues
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: QueueDeleteParams, requestOptions: RequestOptions) {
        // delete /queues/{queue_name}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val calls: CallService.WithRawResponse by lazy {
            CallServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueService.WithRawResponse =
            QueueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calls(): CallService.WithRawResponse = calls

        private val createHandler: Handler<QueueCreateResponse> =
            jsonHandler<QueueCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: QueueCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues")
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

        private val retrieveHandler: Handler<QueueRetrieveResponse> =
            jsonHandler<QueueRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: QueueRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues", params._pathParam(0))
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

        private val updateHandler: Handler<QueueUpdateResponse> =
            jsonHandler<QueueUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: QueueUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues", params._pathParam(0))
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

        private val listHandler: Handler<QueueListPageResponse> =
            jsonHandler<QueueListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: QueueListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues")
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
                        QueueListPage.builder()
                            .service(QueueServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: QueueDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueName", params.queueName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("queues", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
