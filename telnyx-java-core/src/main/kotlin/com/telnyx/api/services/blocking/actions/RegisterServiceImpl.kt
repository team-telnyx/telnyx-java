// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.actions

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
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
import com.telnyx.api.models.actions.register.RegisterCreateParams
import com.telnyx.api.models.actions.register.RegisterCreateResponse
import java.util.function.Consumer

class RegisterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegisterService {

    private val withRawResponse: RegisterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RegisterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegisterService =
        RegisterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RegisterCreateParams,
        requestOptions: RequestOptions,
    ): RegisterCreateResponse =
        // post /actions/register/sim_cards
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegisterService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegisterService.WithRawResponse =
            RegisterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RegisterCreateResponse> =
            jsonHandler<RegisterCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RegisterCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RegisterCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("actions", "register", "sim_cards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
