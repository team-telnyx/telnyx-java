// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateParams
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateCreateResponse
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveParams
import com.telnyx.api.models.messagingnumbersbulkupdates.MessagingNumbersBulkUpdateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingNumbersBulkUpdateServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    MessagingNumbersBulkUpdateServiceAsync {

    private val withRawResponse: MessagingNumbersBulkUpdateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingNumbersBulkUpdateServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingNumbersBulkUpdateServiceAsync =
        MessagingNumbersBulkUpdateServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: MessagingNumbersBulkUpdateCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingNumbersBulkUpdateCreateResponse> =
        // post /messaging_numbers_bulk_updates
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MessagingNumbersBulkUpdateRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingNumbersBulkUpdateRetrieveResponse> =
        // get /messaging_numbers_bulk_updates/{order_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingNumbersBulkUpdateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingNumbersBulkUpdateServiceAsync.WithRawResponse =
            MessagingNumbersBulkUpdateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MessagingNumbersBulkUpdateCreateResponse> =
            jsonHandler<MessagingNumbersBulkUpdateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MessagingNumbersBulkUpdateCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_numbers_bulk_updates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<MessagingNumbersBulkUpdateRetrieveResponse> =
            jsonHandler<MessagingNumbersBulkUpdateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingNumbersBulkUpdateRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingNumbersBulkUpdateRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_numbers_bulk_updates", params._pathParam(0))
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
    }
}
