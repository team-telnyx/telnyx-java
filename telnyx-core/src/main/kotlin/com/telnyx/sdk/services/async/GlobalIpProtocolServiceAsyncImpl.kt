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
import com.telnyx.sdk.models.globalipprotocols.GlobalIpProtocolListParams
import com.telnyx.sdk.models.globalipprotocols.GlobalIpProtocolListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Global IPs */
class GlobalIpProtocolServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : GlobalIpProtocolServiceAsync {

    private val withRawResponse: GlobalIpProtocolServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpProtocolServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GlobalIpProtocolServiceAsync =
        GlobalIpProtocolServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: GlobalIpProtocolListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GlobalIpProtocolListResponse> =
        // get /global_ip_protocols
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpProtocolServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpProtocolServiceAsync.WithRawResponse =
            GlobalIpProtocolServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<GlobalIpProtocolListResponse> =
            jsonHandler<GlobalIpProtocolListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpProtocolListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GlobalIpProtocolListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_protocols")
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
                    }
                }
        }
    }
}
