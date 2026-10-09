// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.spendlimits.SpendLimitCreateParams
import com.telnyx.sdk.models.spendlimits.SpendLimitDeleteParams
import com.telnyx.sdk.models.spendlimits.SpendLimitListParams
import com.telnyx.sdk.models.spendlimits.SpendLimitListResponse
import com.telnyx.sdk.models.spendlimits.SpendLimitResponse
import com.telnyx.sdk.models.spendlimits.SpendLimitUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Daily and monthly spend limits per product. A limit applies to the organization of the
 * authenticated user, or to the user's own account when they belong to no organization; every user
 * of the organization sees and changes the same limits.
 * - **Periods.** `daily` covers the current UTC day and `monthly` the current UTC calendar month.
 *   The two limits are independent: you can set either, both or neither.
 * - **Blocking.** When spend in a period goes above the limit (strictly greater), the product is
 *   blocked until the period ends: 00:00 UTC the next day for `daily`, 00:00 UTC on the 1st of the
 *   next month for `monthly`. A block appears within about 2 minutes (daily) or 10 minutes
 *   (monthly) of the spend being recorded.
 * - **Changes apply immediately.** Creating, updating or deleting a limit checks the period's spend
 *   in the same request: raising the limit above the spend, or removing it, lifts that period's
 *   block, and lowering it below the spend blocks the product at once. The `evaluation` object in
 *   the response says what happened.
 * - **Supported products.** Today only `inference` supports spend limits. A blocked account gets
 *   HTTP 403 with the error title `Inference spend limit reached` (code `10039`) on new billable
 *   chat completions, Responses, Anthropic Messages and classification requests; requests already
 *   running finish normally. Take the list of products from the list operation.
 * - **Limits set by Telnyx.** Telnyx support can also set a limit on your account. It is listed
 *   with `origin: operator` and you can update or delete it like your own.
 */
class SpendLimitServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendLimitServiceAsync {

    private val withRawResponse: SpendLimitServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendLimitServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendLimitServiceAsync =
        SpendLimitServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SpendLimitCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpendLimitResponse> =
        // post /spend_limits
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: SpendLimitUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpendLimitResponse> =
        // patch /spend_limits/{product}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: SpendLimitListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpendLimitListResponse> =
        // get /spend_limits
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: SpendLimitDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpendLimitResponse> =
        // delete /spend_limits/{product}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpendLimitServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpendLimitServiceAsync.WithRawResponse =
            SpendLimitServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SpendLimitResponse> =
            jsonHandler<SpendLimitResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SpendLimitCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("spend_limits")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val updateHandler: Handler<SpendLimitResponse> =
            jsonHandler<SpendLimitResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SpendLimitUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("product", params.product().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("spend_limits", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<SpendLimitListResponse> =
            jsonHandler<SpendLimitListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SpendLimitListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpendLimitListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("spend_limits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val deleteHandler: Handler<SpendLimitResponse> =
            jsonHandler<SpendLimitResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SpendLimitDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("product", params.product().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("spend_limits", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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
