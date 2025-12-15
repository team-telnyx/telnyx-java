// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.messsages.MesssageRcsParams
import com.telnyx.sdk.models.messsages.MesssageRcsResponse
import com.telnyx.sdk.models.messsages.MesssageWhatsappParams
import com.telnyx.sdk.models.messsages.MesssageWhatsappResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MesssageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MesssageServiceAsync {

    private val withRawResponse: MesssageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MesssageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MesssageServiceAsync =
        MesssageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rcs(
        params: MesssageRcsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MesssageRcsResponse> =
        // post /messsages/rcs
        withRawResponse().rcs(params, requestOptions).thenApply { it.parse() }

    override fun whatsapp(
        params: MesssageWhatsappParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MesssageWhatsappResponse> =
        // post /messsages/whatsapp
        withRawResponse().whatsapp(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MesssageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MesssageServiceAsync.WithRawResponse =
            MesssageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val rcsHandler: Handler<MesssageRcsResponse> =
            jsonHandler<MesssageRcsResponse>(clientOptions.jsonMapper)

        override fun rcs(
            params: MesssageRcsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MesssageRcsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messsages", "rcs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { rcsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val whatsappHandler: Handler<MesssageWhatsappResponse> =
            jsonHandler<MesssageWhatsappResponse>(clientOptions.jsonMapper)

        override fun whatsapp(
            params: MesssageWhatsappParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MesssageWhatsappResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messsages", "whatsapp")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { whatsappHandler.handle(it) }
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
