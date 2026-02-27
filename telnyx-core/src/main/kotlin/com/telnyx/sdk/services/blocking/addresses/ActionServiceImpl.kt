// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.addresses

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.addresses.actions.ActionAcceptSuggestionsParams
import com.telnyx.sdk.models.addresses.actions.ActionAcceptSuggestionsResponse
import com.telnyx.sdk.models.addresses.actions.ActionValidateParams
import com.telnyx.sdk.models.addresses.actions.ActionValidateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Operations to work with Address records. Address records are emergency-validated addresses meant
 * to be associated with phone numbers. They are validated for emergency usage purposes at creation
 * time, although you may validate them separately with a custom workflow using the ValidateAddress
 * operation separately. Address records are not usable for physical orders, such as for Telnyx SIM
 * cards, please use UserAddress for that. It is not possible to entirely skip emergency service
 * validation for Address records; if an emergency provider for a phone number rejects the address
 * then it cannot be used on a phone number. To prevent records from getting out of sync, Address
 * records are immutable and cannot be altered once created. If you realize you need to alter an
 * address, a new record must be created with the differing address.
 */
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
            checkRequired("addressUuid", params.addressUuid().getOrNull())
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
