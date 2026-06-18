// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.legacy.reporting.batchdetailrecords

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
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceCreateParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceCreateResponse
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceDeleteParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceDeleteResponse
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceListParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceListResponse
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveFieldsParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveFieldsResponse
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.voice.VoiceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Voice batch detail records */
class VoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceServiceAsync {

    private val withRawResponse: VoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync =
        VoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VoiceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceCreateResponse> =
        // post /legacy/reporting/batch_detail_records/voice
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceRetrieveResponse> =
        // get /legacy/reporting/batch_detail_records/voice/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VoiceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceListResponse> =
        // get /legacy/reporting/batch_detail_records/voice
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VoiceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceDeleteResponse> =
        // delete /legacy/reporting/batch_detail_records/voice/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveFields(
        params: VoiceRetrieveFieldsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceRetrieveFieldsResponse> =
        // get /legacy/reporting/batch_detail_records/voice/fields
        withRawResponse().retrieveFields(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceServiceAsync.WithRawResponse =
            VoiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VoiceCreateResponse> =
            jsonHandler<VoiceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VoiceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "batch_detail_records", "voice")
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

        private val retrieveHandler: Handler<VoiceRetrieveResponse> =
            jsonHandler<VoiceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> {
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
                        "voice",
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

        private val listHandler: Handler<VoiceListResponse> =
            jsonHandler<VoiceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VoiceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "batch_detail_records", "voice")
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

        private val deleteHandler: Handler<VoiceDeleteResponse> =
            jsonHandler<VoiceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: VoiceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceDeleteResponse>> {
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
                        "voice",
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

        private val retrieveFieldsHandler: Handler<VoiceRetrieveFieldsResponse> =
            jsonHandler<VoiceRetrieveFieldsResponse>(clientOptions.jsonMapper)

        override fun retrieveFields(
            params: VoiceRetrieveFieldsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveFieldsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "batch_detail_records",
                        "voice",
                        "fields",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveFieldsHandler.handle(it) }
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
