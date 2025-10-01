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
import com.telnyx.sdk.models.wirelessblocklistvalues.WirelessBlocklistValueListParams
import com.telnyx.sdk.models.wirelessblocklistvalues.WirelessBlocklistValueListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class WirelessBlocklistValueServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    WirelessBlocklistValueServiceAsync {

    private val withRawResponse: WirelessBlocklistValueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WirelessBlocklistValueServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WirelessBlocklistValueServiceAsync =
        WirelessBlocklistValueServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: WirelessBlocklistValueListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WirelessBlocklistValueListResponse> =
        // get /wireless_blocklist_values
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WirelessBlocklistValueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WirelessBlocklistValueServiceAsync.WithRawResponse =
            WirelessBlocklistValueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<WirelessBlocklistValueListResponse> =
            jsonHandler<WirelessBlocklistValueListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WirelessBlocklistValueListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WirelessBlocklistValueListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireless_blocklist_values")
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
