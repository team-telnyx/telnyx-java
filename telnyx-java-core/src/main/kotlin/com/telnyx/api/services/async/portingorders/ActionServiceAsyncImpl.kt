// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

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
import com.telnyx.api.models.portingorders.actions.ActionActivateParams
import com.telnyx.api.models.portingorders.actions.ActionActivateResponse
import com.telnyx.api.models.portingorders.actions.ActionCancelParams
import com.telnyx.api.models.portingorders.actions.ActionCancelResponse
import com.telnyx.api.models.portingorders.actions.ActionConfirmParams
import com.telnyx.api.models.portingorders.actions.ActionConfirmResponse
import com.telnyx.api.models.portingorders.actions.ActionShareParams
import com.telnyx.api.models.portingorders.actions.ActionShareResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun activate(
        params: ActionActivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionActivateResponse> =
        // post /porting_orders/{id}/actions/activate
        withRawResponse().activate(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: ActionCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionCancelResponse> =
        // post /porting_orders/{id}/actions/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun confirm(
        params: ActionConfirmParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionConfirmResponse> =
        // post /porting_orders/{id}/actions/confirm
        withRawResponse().confirm(params, requestOptions).thenApply { it.parse() }

    override fun share(
        params: ActionShareParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionShareResponse> =
        // post /porting_orders/{id}/actions/share
        withRawResponse().share(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val activateHandler: Handler<ActionActivateResponse> =
            jsonHandler<ActionActivateResponse>(clientOptions.jsonMapper)

        override fun activate(
            params: ActionActivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionActivateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "actions", "activate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { activateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelHandler: Handler<ActionCancelResponse> =
            jsonHandler<ActionCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: ActionCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionCancelResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "actions", "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val confirmHandler: Handler<ActionConfirmResponse> =
            jsonHandler<ActionConfirmResponse>(clientOptions.jsonMapper)

        override fun confirm(
            params: ActionConfirmParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionConfirmResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "actions", "confirm")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { confirmHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val shareHandler: Handler<ActionShareResponse> =
            jsonHandler<ActionShareResponse>(clientOptions.jsonMapper)

        override fun share(
            params: ActionShareParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionShareResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "actions", "share")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { shareHandler.handle(it) }
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
