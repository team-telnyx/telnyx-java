// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.batchdetailrecords

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
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextCreateResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextDeleteParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextDeleteResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextListParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextListResponse
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextRetrieveParams
import com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext.SpeechToTextRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SpeechToTextServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SpeechToTextServiceAsync {

    private val withRawResponse: SpeechToTextServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpeechToTextServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechToTextServiceAsync =
        SpeechToTextServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SpeechToTextCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpeechToTextCreateResponse> =
        // post /legacy/reporting/batch_detail_records/speech_to_text
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SpeechToTextRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpeechToTextRetrieveResponse> =
        // get /legacy/reporting/batch_detail_records/speech_to_text/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SpeechToTextListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpeechToTextListResponse> =
        // get /legacy/reporting/batch_detail_records/speech_to_text
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SpeechToTextDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpeechToTextDeleteResponse> =
        // delete /legacy/reporting/batch_detail_records/speech_to_text/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpeechToTextServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeechToTextServiceAsync.WithRawResponse =
            SpeechToTextServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SpeechToTextCreateResponse> =
            jsonHandler<SpeechToTextCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SpeechToTextCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpeechToTextCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "batch_detail_records",
                        "speech_to_text",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<SpeechToTextRetrieveResponse> =
            jsonHandler<SpeechToTextRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SpeechToTextRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpeechToTextRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "batch_detail_records",
                        "speech_to_text",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<SpeechToTextListResponse> =
            jsonHandler<SpeechToTextListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SpeechToTextListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpeechToTextListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "batch_detail_records",
                        "speech_to_text",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<SpeechToTextDeleteResponse> =
            jsonHandler<SpeechToTextDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SpeechToTextDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpeechToTextDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "batch_detail_records",
                        "speech_to_text",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
