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
import com.telnyx.sdk.models.enum_.EnumRetrieveParams
import com.telnyx.sdk.models.enum_.EnumRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EnumServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EnumServiceAsync {

    private val withRawResponse: EnumServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnumServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnumServiceAsync =
        EnumServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: EnumRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnumRetrieveResponse> =
        // get /enum/{endpoint}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnumServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnumServiceAsync.WithRawResponse =
            EnumServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<EnumRetrieveResponse> =
            jsonHandler<EnumRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EnumRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnumRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("endpoint", params.endpoint().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enum", params._pathParam(0))
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
