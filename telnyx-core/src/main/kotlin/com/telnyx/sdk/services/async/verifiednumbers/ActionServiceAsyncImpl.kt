// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.verifiednumbers

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
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.sdk.models.verifiednumbers.actions.ActionSubmitVerificationCodeParams
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

    override fun submitVerificationCode(
        params: ActionSubmitVerificationCodeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        // post /verified_numbers/{phone_number}/actions/verify
        withRawResponse().submitVerificationCode(params, requestOptions).thenApply { it.parse() }

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

        private val submitVerificationCodeHandler: Handler<VerifiedNumberDataWrapper> =
            jsonHandler<VerifiedNumberDataWrapper>(clientOptions.jsonMapper)

        override fun submitVerificationCode(
            params: ActionSubmitVerificationCodeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers", params._pathParam(0), "actions", "verify")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitVerificationCodeHandler.handle(it) }
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
