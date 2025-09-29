// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryListParams
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryListResponse
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryRetrieveParams
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WebhookDeliveryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookDeliveryService {

    private val withRawResponse: WebhookDeliveryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookDeliveryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookDeliveryService =
        WebhookDeliveryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: WebhookDeliveryRetrieveParams,
        requestOptions: RequestOptions,
    ): WebhookDeliveryRetrieveResponse =
        // get /webhook_deliveries/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: WebhookDeliveryListParams,
        requestOptions: RequestOptions,
    ): WebhookDeliveryListResponse =
        // get /webhook_deliveries
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookDeliveryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookDeliveryService.WithRawResponse =
            WebhookDeliveryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<WebhookDeliveryRetrieveResponse> =
            jsonHandler<WebhookDeliveryRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WebhookDeliveryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDeliveryRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_deliveries", params._pathParam(0))
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

        private val listHandler: Handler<WebhookDeliveryListResponse> =
            jsonHandler<WebhookDeliveryListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookDeliveryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDeliveryListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_deliveries")
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
    }
}
