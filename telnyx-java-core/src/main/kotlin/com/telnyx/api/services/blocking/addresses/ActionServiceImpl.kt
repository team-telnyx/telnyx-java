// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.addresses

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
import com.telnyx.api.models.addresses.actions.ActionAcceptSuggestionsParams
import com.telnyx.api.models.addresses.actions.ActionAcceptSuggestionsResponse
import com.telnyx.api.models.addresses.actions.ActionValidateParams
import com.telnyx.api.models.addresses.actions.ActionValidateResponse
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

    override fun acceptSuggestions(
        params: ActionAcceptSuggestionsParams,
        requestOptions: RequestOptions,
    ): ActionAcceptSuggestionsResponse =
        // post /addresses/{id}/actions/accept_suggestions
        withRawResponse().acceptSuggestions(params, requestOptions).parse()

    override fun validate(
        params: ActionValidateParams,
        requestOptions: RequestOptions,
    ): ActionValidateResponse =
        // post /addresses/actions/validate
        withRawResponse().validate(params, requestOptions).parse()

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

        private val acceptSuggestionsHandler: Handler<ActionAcceptSuggestionsResponse> =
            jsonHandler<ActionAcceptSuggestionsResponse>(clientOptions.jsonMapper)

        override fun acceptSuggestions(
            params: ActionAcceptSuggestionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionAcceptSuggestionsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "addresses",
                        params._pathParam(0),
                        "actions",
                        "accept_suggestions",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { acceptSuggestionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val validateHandler: Handler<ActionValidateResponse> =
            jsonHandler<ActionValidateResponse>(clientOptions.jsonMapper)

        override fun validate(
            params: ActionValidateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionValidateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses", "actions", "validate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { validateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
