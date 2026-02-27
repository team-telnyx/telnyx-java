// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.recordings

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.texml.accounts.TexmlGetCallRecordingResponseBody
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** TeXML REST Commands */
class JsonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JsonServiceAsync {

    private val withRawResponse: JsonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JsonServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonServiceAsync =
        JsonServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun deleteRecordingSidJson(
        params: JsonDeleteRecordingSidJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json
        withRawResponse().deleteRecordingSidJson(params, requestOptions).thenAccept {}

    override fun retrieveRecordingSidJson(
        params: JsonRetrieveRecordingSidJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TexmlGetCallRecordingResponseBody> =
        // get /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json
        withRawResponse().retrieveRecordingSidJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JsonServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JsonServiceAsync.WithRawResponse =
            JsonServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteRecordingSidJsonHandler: Handler<Void?> = emptyHandler()

        override fun deleteRecordingSidJson(
            params: JsonDeleteRecordingSidJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingSid", params.recordingSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Recordings",
                        "${params._pathParam(1)}.json",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteRecordingSidJsonHandler.handle(it) }
                    }
                }
        }

        private val retrieveRecordingSidJsonHandler: Handler<TexmlGetCallRecordingResponseBody> =
            jsonHandler<TexmlGetCallRecordingResponseBody>(clientOptions.jsonMapper)

        override fun retrieveRecordingSidJson(
            params: JsonRetrieveRecordingSidJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TexmlGetCallRecordingResponseBody>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingSid", params.recordingSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Recordings",
                        "${params._pathParam(1)}.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRecordingSidJsonHandler.handle(it) }
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
