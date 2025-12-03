// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

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
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadCreateParams
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadCreateResponse
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadListPageAsync
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadListPageResponse
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadListParams
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadRetrieveParams
import com.telnyx.sdk.models.phonenumbers.csvdownloads.CsvDownloadRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CsvDownloadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CsvDownloadServiceAsync {

    private val withRawResponse: CsvDownloadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CsvDownloadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CsvDownloadServiceAsync =
        CsvDownloadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CsvDownloadCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CsvDownloadCreateResponse> =
        // post /phone_numbers/csv_downloads
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CsvDownloadRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CsvDownloadRetrieveResponse> =
        // get /phone_numbers/csv_downloads/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CsvDownloadListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CsvDownloadListPageAsync> =
        // get /phone_numbers/csv_downloads
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CsvDownloadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CsvDownloadServiceAsync.WithRawResponse =
            CsvDownloadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CsvDownloadCreateResponse> =
            jsonHandler<CsvDownloadCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CsvDownloadCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CsvDownloadCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "csv_downloads")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val retrieveHandler: Handler<CsvDownloadRetrieveResponse> =
            jsonHandler<CsvDownloadRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CsvDownloadRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CsvDownloadRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "csv_downloads", params._pathParam(0))
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

        private val listHandler: Handler<CsvDownloadListPageResponse> =
            jsonHandler<CsvDownloadListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CsvDownloadListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CsvDownloadListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "csv_downloads")
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
                            .let {
                                CsvDownloadListPageAsync.builder()
                                    .service(CsvDownloadServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
