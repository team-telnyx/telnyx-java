// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.rooms

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.rooms.actions.ActionGenerateJoinClientTokenParams
import com.telnyx.api.models.rooms.actions.ActionGenerateJoinClientTokenResponse
import com.telnyx.api.models.rooms.actions.ActionRefreshClientTokenParams
import com.telnyx.api.models.rooms.actions.ActionRefreshClientTokenResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun generateJoinClientToken(
        params: ActionGenerateJoinClientTokenParams,
        requestOptions: RequestOptions,
    ): ActionGenerateJoinClientTokenResponse =
        // post /rooms/{room_id}/actions/generate_join_client_token
        withRawResponse().generateJoinClientToken(params, requestOptions).parse()

    override fun refreshClientToken(
        params: ActionRefreshClientTokenParams,
        requestOptions: RequestOptions,
    ): ActionRefreshClientTokenResponse =
        // post /rooms/{room_id}/actions/refresh_client_token
        withRawResponse().refreshClientToken(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val generateJoinClientTokenHandler: Handler<ActionGenerateJoinClientTokenResponse> =
            jsonHandler<ActionGenerateJoinClientTokenResponse>(clientOptions.jsonMapper)

        override fun generateJoinClientToken(
            params: ActionGenerateJoinClientTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionGenerateJoinClientTokenResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateJoinClientTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val refreshClientTokenHandler: Handler<ActionRefreshClientTokenResponse> =
            jsonHandler<ActionRefreshClientTokenResponse>(clientOptions.jsonMapper)

        override fun refreshClientToken(
            params: ActionRefreshClientTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRefreshClientTokenResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
