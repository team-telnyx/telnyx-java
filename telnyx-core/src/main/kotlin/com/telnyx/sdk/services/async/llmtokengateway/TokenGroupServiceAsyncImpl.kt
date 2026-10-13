// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.llmtokengateway

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupCreateParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupDeleteParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupListPageAsync
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupListPageResponse
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupListParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupResponse
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupRetrieveParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage and report AI Gateway usage. */
class TokenGroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenGroupServiceAsync {

    private val withRawResponse: TokenGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenGroupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenGroupServiceAsync =
        TokenGroupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TokenGroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenGroupResponse> =
        // post /llm_token_gateway/token_groups
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: TokenGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenGroupResponse> =
        // get /llm_token_gateway/token_groups/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: TokenGroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenGroupResponse> =
        // patch /llm_token_gateway/token_groups/{id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: TokenGroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenGroupListPageAsync> =
        // get /llm_token_gateway/token_groups
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: TokenGroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /llm_token_gateway/token_groups/{id}
        withRawResponse().delete(params, requestOptions).mapCancellable { null }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenGroupServiceAsync.WithRawResponse =
            TokenGroupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TokenGroupResponse> =
            jsonHandler<TokenGroupResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TokenGroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm_token_gateway", "token_groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val retrieveHandler: Handler<TokenGroupResponse> =
            jsonHandler<TokenGroupResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TokenGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm_token_gateway", "token_groups", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val updateHandler: Handler<TokenGroupResponse> =
            jsonHandler<TokenGroupResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TokenGroupUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenGroupResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm_token_gateway", "token_groups", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TokenGroupListPageResponse> =
            jsonHandler<TokenGroupListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TokenGroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenGroupListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm_token_gateway", "token_groups")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TokenGroupListPageAsync.builder()
                                    .service(TokenGroupServiceAsyncImpl(clientOptions))
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
            params: TokenGroupDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm_token_gateway", "token_groups", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
