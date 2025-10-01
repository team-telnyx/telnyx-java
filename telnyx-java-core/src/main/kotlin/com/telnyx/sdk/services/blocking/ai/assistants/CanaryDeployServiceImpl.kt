// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

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
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployCreateParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployDeleteParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployResponse
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployRetrieveParams
import com.telnyx.sdk.models.ai.assistants.canarydeploys.CanaryDeployUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CanaryDeployServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CanaryDeployService {

    private val withRawResponse: CanaryDeployService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CanaryDeployService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CanaryDeployService =
        CanaryDeployServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CanaryDeployCreateParams,
        requestOptions: RequestOptions,
    ): CanaryDeployResponse =
        // post /ai/assistants/{assistant_id}/canary-deploys
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CanaryDeployRetrieveParams,
        requestOptions: RequestOptions,
    ): CanaryDeployResponse =
        // get /ai/assistants/{assistant_id}/canary-deploys
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CanaryDeployUpdateParams,
        requestOptions: RequestOptions,
    ): CanaryDeployResponse =
        // put /ai/assistants/{assistant_id}/canary-deploys
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: CanaryDeployDeleteParams, requestOptions: RequestOptions) {
        // delete /ai/assistants/{assistant_id}/canary-deploys
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CanaryDeployService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CanaryDeployService.WithRawResponse =
            CanaryDeployServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CanaryDeployResponse> =
            jsonHandler<CanaryDeployResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CanaryDeployCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CanaryDeployResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "canary-deploys")
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

        private val retrieveHandler: Handler<CanaryDeployResponse> =
            jsonHandler<CanaryDeployResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CanaryDeployRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CanaryDeployResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "canary-deploys")
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

        private val updateHandler: Handler<CanaryDeployResponse> =
            jsonHandler<CanaryDeployResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CanaryDeployUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CanaryDeployResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "canary-deploys")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CanaryDeployDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "canary-deploys")
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
