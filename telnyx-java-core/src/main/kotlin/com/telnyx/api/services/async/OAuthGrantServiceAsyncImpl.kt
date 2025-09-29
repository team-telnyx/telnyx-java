// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
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
import com.telnyx.api.models.oauthgrants.OAuthGrantDeleteParams
import com.telnyx.api.models.oauthgrants.OAuthGrantDeleteResponse
import com.telnyx.api.models.oauthgrants.OAuthGrantListParams
import com.telnyx.api.models.oauthgrants.OAuthGrantListResponse
import com.telnyx.api.models.oauthgrants.OAuthGrantRetrieveParams
import com.telnyx.api.models.oauthgrants.OAuthGrantRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OAuthGrantServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthGrantServiceAsync {

    private val withRawResponse: OAuthGrantServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthGrantServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthGrantServiceAsync =
        OAuthGrantServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: OAuthGrantRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthGrantRetrieveResponse> =
        // get /oauth_grants/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OAuthGrantListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthGrantListResponse> =
        // get /oauth_grants
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: OAuthGrantDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthGrantDeleteResponse> =
        // delete /oauth_grants/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthGrantServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OAuthGrantServiceAsync.WithRawResponse =
            OAuthGrantServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OAuthGrantRetrieveResponse> =
            jsonHandler<OAuthGrantRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OAuthGrantRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthGrantRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_grants", params._pathParam(0))
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

        private val listHandler: Handler<OAuthGrantListResponse> =
            jsonHandler<OAuthGrantListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OAuthGrantListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthGrantListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_grants")
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

        private val deleteHandler: Handler<OAuthGrantDeleteResponse> =
            jsonHandler<OAuthGrantDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: OAuthGrantDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthGrantDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_grants", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
