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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.mobilenetworkoperators.MobileNetworkOperatorListPageAsync
import com.telnyx.sdk.models.mobilenetworkoperators.MobileNetworkOperatorListPageResponse
import com.telnyx.sdk.models.mobilenetworkoperators.MobileNetworkOperatorListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MobileNetworkOperatorServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MobileNetworkOperatorServiceAsync {

    private val withRawResponse: MobileNetworkOperatorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MobileNetworkOperatorServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MobileNetworkOperatorServiceAsync =
        MobileNetworkOperatorServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: MobileNetworkOperatorListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MobileNetworkOperatorListPageAsync> =
        // get /mobile_network_operators
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MobileNetworkOperatorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MobileNetworkOperatorServiceAsync.WithRawResponse =
            MobileNetworkOperatorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<MobileNetworkOperatorListPageResponse> =
            jsonHandler<MobileNetworkOperatorListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobileNetworkOperatorListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MobileNetworkOperatorListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_network_operators")
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
                                MobileNetworkOperatorListPageAsync.builder()
                                    .service(MobileNetworkOperatorServiceAsyncImpl(clientOptions))
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
