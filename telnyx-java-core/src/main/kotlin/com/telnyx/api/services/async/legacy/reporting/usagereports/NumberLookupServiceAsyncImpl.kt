// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting.usagereports

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupCreateParams
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupDeleteParams
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupListParams
import com.telnyx.api.models.legacy.reporting.usagereports.numberlookup.NumberLookupRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberLookupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberLookupServiceAsync {

    private val withRawResponse: NumberLookupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberLookupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberLookupServiceAsync =
        NumberLookupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NumberLookupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /legacy/reporting/usage_reports/number_lookup
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: NumberLookupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /legacy/reporting/usage_reports/number_lookup/{id}
        withRawResponse().retrieve(params, requestOptions).thenAccept {}

    override fun list(
        params: NumberLookupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /legacy/reporting/usage_reports/number_lookup
        withRawResponse().list(params, requestOptions).thenAccept {}

    override fun delete(
        params: NumberLookupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /legacy/reporting/usage_reports/number_lookup/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberLookupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberLookupServiceAsync.WithRawResponse =
            NumberLookupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: NumberLookupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "number_lookup")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val retrieveHandler: Handler<Void?> = emptyHandler()

        override fun retrieve(
            params: NumberLookupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        "usage_reports",
                        "number_lookup",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: NumberLookupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "number_lookup")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listHandler.handle(it) }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: NumberLookupDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        "usage_reports",
                        "number_lookup",
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
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
