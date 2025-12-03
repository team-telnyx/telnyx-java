// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.brand.BrandCreateParams
import com.telnyx.sdk.models.brand.BrandDeleteParams
import com.telnyx.sdk.models.brand.BrandGetFeedbackParams
import com.telnyx.sdk.models.brand.BrandGetFeedbackResponse
import com.telnyx.sdk.models.brand.BrandListParams
import com.telnyx.sdk.models.brand.BrandListResponse
import com.telnyx.sdk.models.brand.BrandResend2faEmailParams
import com.telnyx.sdk.models.brand.BrandRetrieveParams
import com.telnyx.sdk.models.brand.BrandRetrieveResponse
import com.telnyx.sdk.models.brand.BrandRevetParams
import com.telnyx.sdk.models.brand.BrandUpdateParams
import com.telnyx.sdk.models.brand.TelnyxBrand
import com.telnyx.sdk.services.async.brand.ExternalVettingServiceAsync
import com.telnyx.sdk.services.async.brand.ExternalVettingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BrandServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BrandServiceAsync {

    private val withRawResponse: BrandServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val externalVetting: ExternalVettingServiceAsync by lazy {
        ExternalVettingServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): BrandServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync =
        BrandServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun externalVetting(): ExternalVettingServiceAsync = externalVetting

    override fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxBrand> =
        // post /brand
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveResponse> =
        // get /brand/{brandId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxBrand> =
        // put /brand/{brandId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BrandListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandListResponse> =
        // get /brand
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: BrandDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /brand/{brandId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun getFeedback(
        params: BrandGetFeedbackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandGetFeedbackResponse> =
        // get /brand/feedback/{brandId}
        withRawResponse().getFeedback(params, requestOptions).thenApply { it.parse() }

    override fun resend2faEmail(
        params: BrandResend2faEmailParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /brand/{brandId}/2faEmail
        withRawResponse().resend2faEmail(params, requestOptions).thenAccept {}

    override fun revet(
        params: BrandRevetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TelnyxBrand> =
        // put /brand/{brandId}/revet
        withRawResponse().revet(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrandServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val externalVetting: ExternalVettingServiceAsync.WithRawResponse by lazy {
            ExternalVettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse =
            BrandServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun externalVetting(): ExternalVettingServiceAsync.WithRawResponse =
            externalVetting

        private val createHandler: Handler<TelnyxBrand> =
            jsonHandler<TelnyxBrand>(clientOptions.jsonMapper)

        override fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand")
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

        private val retrieveHandler: Handler<BrandRetrieveResponse> =
            jsonHandler<BrandRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0))
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

        private val updateHandler: Handler<TelnyxBrand> =
            jsonHandler<TelnyxBrand>(clientOptions.jsonMapper)

        override fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
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

        private val listHandler: Handler<BrandListResponse> =
            jsonHandler<BrandListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BrandListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BrandDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0))
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

        private val getFeedbackHandler: Handler<BrandGetFeedbackResponse> =
            jsonHandler<BrandGetFeedbackResponse>(clientOptions.jsonMapper)

        override fun getFeedback(
            params: BrandGetFeedbackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandGetFeedbackResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", "feedback", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFeedbackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val resend2faEmailHandler: Handler<Void?> = emptyHandler()

        override fun resend2faEmail(
            params: BrandResend2faEmailParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0), "2faEmail")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { resend2faEmailHandler.handle(it) }
                    }
                }
        }

        private val revetHandler: Handler<TelnyxBrand> =
            jsonHandler<TelnyxBrand>(clientOptions.jsonMapper)

        override fun revet(
            params: BrandRevetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TelnyxBrand>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0), "revet")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { revetHandler.handle(it) }
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
