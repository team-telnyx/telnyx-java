// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

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
import com.telnyx.sdk.models.ai.integrations.IntegrationListParams
import com.telnyx.sdk.models.ai.integrations.IntegrationListResponse
import com.telnyx.sdk.models.ai.integrations.IntegrationRetrieveParams
import com.telnyx.sdk.models.ai.integrations.IntegrationRetrieveResponse
import com.telnyx.sdk.services.async.ai.integrations.ConnectionServiceAsync
import com.telnyx.sdk.services.async.ai.integrations.ConnectionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IntegrationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IntegrationServiceAsync {

    private val withRawResponse: IntegrationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val connections: ConnectionServiceAsync by lazy {
        ConnectionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): IntegrationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationServiceAsync =
        IntegrationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun connections(): ConnectionServiceAsync = connections

    override fun retrieve(
        params: IntegrationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationRetrieveResponse> =
        // get /ai/integrations/{integration_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IntegrationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationListResponse> =
        // get /ai/integrations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegrationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val connections: ConnectionServiceAsync.WithRawResponse by lazy {
            ConnectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationServiceAsync.WithRawResponse =
            IntegrationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun connections(): ConnectionServiceAsync.WithRawResponse = connections

        private val retrieveHandler: Handler<IntegrationRetrieveResponse> =
            jsonHandler<IntegrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IntegrationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("integrationId", params.integrationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "integrations", params._pathParam(0))
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

        private val listHandler: Handler<IntegrationListResponse> =
            jsonHandler<IntegrationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IntegrationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "integrations")
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
