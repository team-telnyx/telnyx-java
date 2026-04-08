// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

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
import com.telnyx.sdk.models.enterprises.reputation.ReputationCreateParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationCreateResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationDeleteAllParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationListParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationListResponse
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyParams
import com.telnyx.sdk.models.enterprises.reputation.ReputationUpdateFrequencyResponse
import com.telnyx.sdk.services.async.enterprises.reputation.NumberServiceAsync
import com.telnyx.sdk.services.async.enterprises.reputation.NumberServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage Number Reputation enrollment and check frequency settings for an enterprise */
class ReputationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReputationServiceAsync {

    private val withRawResponse: ReputationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val numbers: NumberServiceAsync by lazy { NumberServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ReputationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReputationServiceAsync =
        ReputationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Associate phone numbers with an enterprise for reputation monitoring and retrieve reputation
     * scores
     */
    override fun numbers(): NumberServiceAsync = numbers

    override fun create(
        params: ReputationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReputationCreateResponse> =
        // post /enterprises/{enterprise_id}/reputation
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ReputationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReputationListResponse> =
        // get /enterprises/{enterprise_id}/reputation
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: ReputationDeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /enterprises/{enterprise_id}/reputation
        withRawResponse().deleteAll(params, requestOptions).thenAccept {}

    override fun updateFrequency(
        params: ReputationUpdateFrequencyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReputationUpdateFrequencyResponse> =
        // patch /enterprises/{enterprise_id}/reputation/frequency
        withRawResponse().updateFrequency(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReputationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val numbers: NumberServiceAsync.WithRawResponse by lazy {
            NumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReputationServiceAsync.WithRawResponse =
            ReputationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Associate phone numbers with an enterprise for reputation monitoring and retrieve
         * reputation scores
         */
        override fun numbers(): NumberServiceAsync.WithRawResponse = numbers

        private val createHandler: Handler<ReputationCreateResponse> =
            jsonHandler<ReputationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ReputationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReputationCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation")
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

        private val listHandler: Handler<ReputationListResponse> =
            jsonHandler<ReputationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ReputationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReputationListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation")
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

        private val deleteAllHandler: Handler<Void?> = emptyHandler()

        override fun deleteAll(
            params: ReputationDeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteAllHandler.handle(it) }
                    }
                }
        }

        private val updateFrequencyHandler: Handler<ReputationUpdateFrequencyResponse> =
            jsonHandler<ReputationUpdateFrequencyResponse>(clientOptions.jsonMapper)

        override fun updateFrequency(
            params: ReputationUpdateFrequencyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReputationUpdateFrequencyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation", "frequency")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateFrequencyHandler.handle(it) }
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
