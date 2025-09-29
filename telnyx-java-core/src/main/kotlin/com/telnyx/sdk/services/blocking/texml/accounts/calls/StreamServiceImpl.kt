// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.calls

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
import com.telnyx.sdk.models.texml.accounts.calls.streams.StreamStreamingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.streams.StreamStreamingSidJsonResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StreamServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamService {

    private val withRawResponse: StreamService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamService =
        StreamServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun streamingSidJson(
        params: StreamStreamingSidJsonParams,
        requestOptions: RequestOptions,
    ): StreamStreamingSidJsonResponse =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Streams/{streaming_sid}.json
        withRawResponse().streamingSidJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamService.WithRawResponse =
            StreamServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val streamingSidJsonHandler: Handler<StreamStreamingSidJsonResponse> =
            jsonHandler<StreamStreamingSidJsonResponse>(clientOptions.jsonMapper)

        override fun streamingSidJson(
            params: StreamStreamingSidJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamStreamingSidJsonResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("streamingSid", params.streamingSid().getOrNull())
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
                        "Streams",
                        "${params._pathParam(2)}.json",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { streamingSidJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
