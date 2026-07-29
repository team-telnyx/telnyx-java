// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

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
import com.telnyx.sdk.models.emailinboxes.filters.FilterAddParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterAddResponse
import com.telnyx.sdk.models.emailinboxes.filters.FilterDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterDeleteAllResponse
import com.telnyx.sdk.models.emailinboxes.filters.FilterListParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterListResponse
import com.telnyx.sdk.models.emailinboxes.filters.FilterReplaceParams
import com.telnyx.sdk.models.emailinboxes.filters.FilterReplaceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
class FilterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FilterServiceAsync {

    private val withRawResponse: FilterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FilterServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FilterServiceAsync =
        FilterServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: FilterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterListResponse> =
        // get /email_inboxes/{inbox_id}/filters
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun add(
        params: FilterAddParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterAddResponse> =
        // post /email_inboxes/{inbox_id}/filters
        withRawResponse().add(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: FilterDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterDeleteAllResponse> =
        // delete /email_inboxes/{inbox_id}/filters
        withRawResponse().deleteAll(params, requestOptions).thenApply { it.parse() }

    override fun replace(
        params: FilterReplaceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FilterReplaceResponse> =
        // put /email_inboxes/{inbox_id}/filters
        withRawResponse().replace(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FilterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FilterServiceAsync.WithRawResponse =
            FilterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<FilterListResponse> =
            jsonHandler<FilterListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FilterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "filters")
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

        private val addHandler: Handler<FilterAddResponse> =
            jsonHandler<FilterAddResponse>(clientOptions.jsonMapper)

        override fun add(
            params: FilterAddParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterAddResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "filters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAllHandler: Handler<FilterDeleteAllResponse> =
            jsonHandler<FilterDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: FilterDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterDeleteAllResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "filters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replaceHandler: Handler<FilterReplaceResponse> =
            jsonHandler<FilterReplaceResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: FilterReplaceParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FilterReplaceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "filters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { replaceHandler.handle(it) }
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
