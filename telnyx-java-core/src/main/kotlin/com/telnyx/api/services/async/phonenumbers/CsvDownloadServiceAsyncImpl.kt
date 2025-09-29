// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

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
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadCreateParams
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadCreateResponse
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadListParams
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadListResponse
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadRetrieveParams
import com.telnyx.api.models.phonenumbers.csvdownloads.CsvDownloadRetrieveResponse
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
    ): CompletableFuture<CsvDownloadListResponse> =
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

        private val listHandler: Handler<CsvDownloadListResponse> =
            jsonHandler<CsvDownloadListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CsvDownloadListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CsvDownloadListResponse>> {
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
                    }
                }
        }
    }
}
