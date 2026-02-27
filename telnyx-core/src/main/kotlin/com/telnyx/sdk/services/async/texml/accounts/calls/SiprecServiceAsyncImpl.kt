// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.calls

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
import com.telnyx.sdk.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** TeXML REST Commands */
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
