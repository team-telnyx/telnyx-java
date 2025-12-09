// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.porting

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
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationCreateParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationCreateResponse
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationDeleteParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationListPageAsync
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationListPageResponse
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationListParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationPreview0Params
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationPreview1Params
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationRetrieveParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationRetrieveResponse
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationUpdateParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LoaConfigurationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LoaConfigurationServiceAsync {

    private val withRawResponse: LoaConfigurationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LoaConfigurationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LoaConfigurationServiceAsync =
        LoaConfigurationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LoaConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LoaConfigurationCreateResponse> =
        // post /porting/loa_configurations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: LoaConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LoaConfigurationRetrieveResponse> =
        // get /porting/loa_configurations/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LoaConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LoaConfigurationUpdateResponse> =
        // patch /porting/loa_configurations/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LoaConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LoaConfigurationListPageAsync> =
        // get /porting/loa_configurations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LoaConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /porting/loa_configurations/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun preview0(
        params: LoaConfigurationPreview0Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /porting/loa_configuration/preview
        withRawResponse().preview0(params, requestOptions)

    override fun preview1(
        params: LoaConfigurationPreview1Params,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /porting/loa_configurations/{id}/preview
        withRawResponse().preview1(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LoaConfigurationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LoaConfigurationServiceAsync.WithRawResponse =
            LoaConfigurationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LoaConfigurationCreateResponse> =
            jsonHandler<LoaConfigurationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LoaConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LoaConfigurationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations")
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

        private val retrieveHandler: Handler<LoaConfigurationRetrieveResponse> =
            jsonHandler<LoaConfigurationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LoaConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LoaConfigurationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations", params._pathParam(0))
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

        private val updateHandler: Handler<LoaConfigurationUpdateResponse> =
            jsonHandler<LoaConfigurationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LoaConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LoaConfigurationUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations", params._pathParam(0))
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

        private val listHandler: Handler<LoaConfigurationListPageResponse> =
            jsonHandler<LoaConfigurationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LoaConfigurationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LoaConfigurationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations")
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
                                LoaConfigurationListPageAsync.builder()
                                    .service(LoaConfigurationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LoaConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations", params._pathParam(0))
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

        override fun preview0(
            params: LoaConfigurationPreview0Params,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configuration", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun preview1(
            params: LoaConfigurationPreview1Params,
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
                        "porting",
                        "loa_configurations",
                        params._pathParam(0),
                        "preview",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
