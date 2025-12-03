// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations

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
import com.telnyx.sdk.models.ai.conversations.insights.InsightCreateParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightDeleteParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightListParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightListResponse
import com.telnyx.sdk.models.ai.conversations.insights.InsightRetrieveParams
import com.telnyx.sdk.models.ai.conversations.insights.InsightTemplateDetail
import com.telnyx.sdk.models.ai.conversations.insights.InsightUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightService {

    private val withRawResponse: InsightService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InsightService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService =
        InsightServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions,
    ): InsightTemplateDetail =
        // post /ai/conversations/insights
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions,
    ): InsightTemplateDetail =
        // get /ai/conversations/insights/{insight_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions,
    ): InsightTemplateDetail =
        // put /ai/conversations/insights/{insight_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: InsightListParams,
        requestOptions: RequestOptions,
    ): InsightListResponse =
        // get /ai/conversations/insights
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: InsightDeleteParams, requestOptions: RequestOptions) {
        // delete /ai/conversations/insights/{insight_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightService.WithRawResponse =
            InsightServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InsightTemplateDetail> =
            jsonHandler<InsightTemplateDetail>(clientOptions.jsonMapper)

        override fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights")
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

        private val retrieveHandler: Handler<InsightTemplateDetail> =
            jsonHandler<InsightTemplateDetail>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateDetail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights", params._pathParam(0))
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

        private val updateHandler: Handler<InsightTemplateDetail> =
            jsonHandler<InsightTemplateDetail>(clientOptions.jsonMapper)

        override fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateDetail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights", params._pathParam(0))
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

        private val listHandler: Handler<InsightListResponse> =
            jsonHandler<InsightListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InsightListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights")
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
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("insightId", params.insightId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insights", params._pathParam(0))
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
