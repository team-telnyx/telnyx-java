// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateResponse
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretDeleteParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListPageAsync
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListPageResponse
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Store and retrieve integration secrets */
class IntegrationSecretServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IntegrationSecretServiceAsync {

    private val withRawResponse: IntegrationSecretServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntegrationSecretServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): IntegrationSecretServiceAsync =
        IntegrationSecretServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: IntegrationSecretCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationSecretCreateResponse> =
        // post /integration_secrets
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: IntegrationSecretListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationSecretListPageAsync> =
        // get /integration_secrets
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: IntegrationSecretDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /integration_secrets/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegrationSecretServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationSecretServiceAsync.WithRawResponse =
            IntegrationSecretServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<IntegrationSecretCreateResponse> =
            jsonHandler<IntegrationSecretCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IntegrationSecretCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationSecretCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integration_secrets")
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

        private val listHandler: Handler<IntegrationSecretListPageResponse> =
            jsonHandler<IntegrationSecretListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IntegrationSecretListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationSecretListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integration_secrets")
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
                                IntegrationSecretListPageAsync.builder()
                                    .service(IntegrationSecretServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: IntegrationSecretDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integration_secrets", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
