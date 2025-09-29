// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
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
import com.telnyx.api.models.messsages.MesssageRcsParams
import com.telnyx.api.models.messsages.MesssageRcsResponse
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
    }
}
