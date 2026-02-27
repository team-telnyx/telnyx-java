// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.accessipranges.AccessIpRange
import com.telnyx.sdk.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.sdk.models.accessipranges.AccessIpRangeDeleteParams
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListPageAsync
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListPageResponse
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** IP Range Operations */
class AccessIpRangeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessIpRangeServiceAsync {

    private val withRawResponse: AccessIpRangeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccessIpRangeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessIpRangeServiceAsync =
        AccessIpRangeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AccessIpRangeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessIpRange> =
        // post /access_ip_ranges
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AccessIpRangeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessIpRangeListPageAsync> =
        // get /access_ip_ranges
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AccessIpRangeDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccessIpRange> =
        // delete /access_ip_ranges/{access_ip_range_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccessIpRangeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessIpRangeServiceAsync.WithRawResponse =
            AccessIpRangeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AccessIpRange> =
            jsonHandler<AccessIpRange>(clientOptions.jsonMapper)

        override fun create(
            params: AccessIpRangeCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessIpRange>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_ranges")
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

        private val listHandler: Handler<AccessIpRangeListPageResponse> =
            jsonHandler<AccessIpRangeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccessIpRangeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessIpRangeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_ranges")
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
                                AccessIpRangeListPageAsync.builder()
                                    .service(AccessIpRangeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AccessIpRange> =
            jsonHandler<AccessIpRange>(clientOptions.jsonMapper)

        override fun delete(
            params: AccessIpRangeDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccessIpRange>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accessIpRangeId", params.accessIpRangeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_ranges", params._pathParam(0))
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
