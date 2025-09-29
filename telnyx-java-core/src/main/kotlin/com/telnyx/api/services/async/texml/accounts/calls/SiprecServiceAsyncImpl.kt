// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts.calls

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
import com.telnyx.api.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonParams
import com.telnyx.api.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SiprecServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SiprecServiceAsync {

    private val withRawResponse: SiprecServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SiprecServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SiprecServiceAsync =
        SiprecServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun siprecSidJson(
        params: SiprecSiprecSidJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SiprecSiprecSidJsonResponse> =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec/{siprec_sid}.json
        withRawResponse().siprecSidJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SiprecServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SiprecServiceAsync.WithRawResponse =
            SiprecServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val siprecSidJsonHandler: Handler<SiprecSiprecSidJsonResponse> =
            jsonHandler<SiprecSiprecSidJsonResponse>(clientOptions.jsonMapper)

        override fun siprecSidJson(
            params: SiprecSiprecSidJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SiprecSiprecSidJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("siprecSid", params.siprecSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Calls",
                        params._pathParam(1),
                        "Siprec",
                        "${params._pathParam(2)}.json",
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
                            .use { siprecSidJsonHandler.handle(it) }
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
