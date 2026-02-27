// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryListPageAsync
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryListPageResponse
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryListParams
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryRetrieveParams
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Webhooks operations */
class WebhookDeliveryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WebhookDeliveryServiceAsync {

    private val withRawResponse: WebhookDeliveryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookDeliveryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WebhookDeliveryServiceAsync =
        WebhookDeliveryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: WebhookDeliveryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeliveryRetrieveResponse> =
        // get /webhook_deliveries/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WebhookDeliveryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeliveryListPageAsync> =
        // get /webhook_deliveries
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookDeliveryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookDeliveryServiceAsync.WithRawResponse =
            WebhookDeliveryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<WebhookDeliveryRetrieveResponse> =
            jsonHandler<WebhookDeliveryRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WebhookDeliveryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_deliveries", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<WebhookDeliveryListPageResponse> =
            jsonHandler<WebhookDeliveryListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WebhookDeliveryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhook_deliveries")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                WebhookDeliveryListPageAsync.builder()
                                    .service(WebhookDeliveryServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
