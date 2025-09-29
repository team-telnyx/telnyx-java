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
import com.telnyx.api.models.portabilitychecks.PortabilityCheckRunParams
import com.telnyx.api.models.portabilitychecks.PortabilityCheckRunResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PortabilityCheckServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PortabilityCheckServiceAsync {

    private val withRawResponse: PortabilityCheckServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortabilityCheckServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PortabilityCheckServiceAsync =
        PortabilityCheckServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun run(
        params: PortabilityCheckRunParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortabilityCheckRunResponse> =
        // post /portability_checks
        withRawResponse().run(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortabilityCheckServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortabilityCheckServiceAsync.WithRawResponse =
            PortabilityCheckServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val runHandler: Handler<PortabilityCheckRunResponse> =
            jsonHandler<PortabilityCheckRunResponse>(clientOptions.jsonMapper)

        override fun run(
            params: PortabilityCheckRunParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortabilityCheckRunResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("portability_checks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { runHandler.handle(it) }
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
