// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rooms

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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.rooms.actions.ActionGenerateJoinClientTokenParams
import com.telnyx.sdk.models.rooms.actions.ActionGenerateJoinClientTokenResponse
import com.telnyx.sdk.models.rooms.actions.ActionRefreshClientTokenParams
import com.telnyx.sdk.models.rooms.actions.ActionRefreshClientTokenResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Rooms Client Tokens operations. */
class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun generateJoinClientToken(
        params: ActionGenerateJoinClientTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionGenerateJoinClientTokenResponse> =
        // post /rooms/{room_id}/actions/generate_join_client_token
        withRawResponse().generateJoinClientToken(params, requestOptions).thenApply { it.parse() }

    override fun refreshClientToken(
        params: ActionRefreshClientTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRefreshClientTokenResponse> =
        // post /rooms/{room_id}/actions/refresh_client_token
        withRawResponse().refreshClientToken(params, requestOptions).thenApply { it.parse() }

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

        private val generateJoinClientTokenHandler: Handler<ActionGenerateJoinClientTokenResponse> =
            jsonHandler<ActionGenerateJoinClientTokenResponse>(clientOptions.jsonMapper)

        override fun generateJoinClientToken(
            params: ActionGenerateJoinClientTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionGenerateJoinClientTokenResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomId", params.roomId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "rooms",
                        params._pathParam(0),
                        "actions",
                        "generate_join_client_token",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateJoinClientTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val refreshClientTokenHandler: Handler<ActionRefreshClientTokenResponse> =
            jsonHandler<ActionRefreshClientTokenResponse>(clientOptions.jsonMapper)

        override fun refreshClientToken(
            params: ActionRefreshClientTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRefreshClientTokenResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomId", params.roomId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "rooms",
                        params._pathParam(0),
                        "actions",
                        "refresh_client_token",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { refreshClientTokenHandler.handle(it) }
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
