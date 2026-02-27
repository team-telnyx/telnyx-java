// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

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
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateResponse
import com.telnyx.sdk.models.texml.accounts.queues.QueueDeleteParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueListPage
import com.telnyx.sdk.models.texml.accounts.queues.QueueListPageResponse
import com.telnyx.sdk.models.texml.accounts.queues.QueueListParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** TeXML REST Commands */
class QueueServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueService {

    private val withRawResponse: QueueService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QueueService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueService =
        QueueServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: QueueCreateParams,
        requestOptions: RequestOptions,
    ): QueueCreateResponse =
        // post /texml/Accounts/{account_sid}/Queues
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: QueueRetrieveParams,
        requestOptions: RequestOptions,
    ): QueueRetrieveResponse =
        // get /texml/Accounts/{account_sid}/Queues/{queue_sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: QueueUpdateParams,
        requestOptions: RequestOptions,
    ): QueueUpdateResponse =
        // post /texml/Accounts/{account_sid}/Queues/{queue_sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: QueueListParams, requestOptions: RequestOptions): QueueListPage =
        // get /texml/Accounts/{account_sid}/Queues
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: QueueDeleteParams, requestOptions: RequestOptions) {
        // delete /texml/Accounts/{account_sid}/Queues/{queue_sid}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueService.WithRawResponse =
            QueueServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<QueueCreateResponse> =
            jsonHandler<QueueCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: QueueCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Queues")
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
            checkRequired("queueSid", params.queueSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Queues",
                        params._pathParam(1),
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

        private val updateHandler: Handler<QueueUpdateResponse> =
            jsonHandler<QueueUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: QueueUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueueUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueSid", params.queueSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Queues",
                        params._pathParam(1),
                    )
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Queues")
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
            checkRequired("queueSid", params.queueSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Queues",
                        params._pathParam(1),
                    )
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
