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
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileCreateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileCreateResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileDeleteParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileDeleteResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileListPageAsync
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileListPageResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileListParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileRetrieveParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileRetrieveResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OutboundVoiceProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : OutboundVoiceProfileServiceAsync {

    private val withRawResponse: OutboundVoiceProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OutboundVoiceProfileServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): OutboundVoiceProfileServiceAsync =
        OutboundVoiceProfileServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: OutboundVoiceProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboundVoiceProfileCreateResponse> =
        // post /outbound_voice_profiles
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: OutboundVoiceProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboundVoiceProfileRetrieveResponse> =
        // get /outbound_voice_profiles/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: OutboundVoiceProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboundVoiceProfileUpdateResponse> =
        // patch /outbound_voice_profiles/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: OutboundVoiceProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboundVoiceProfileListPageAsync> =
        // get /outbound_voice_profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: OutboundVoiceProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboundVoiceProfileDeleteResponse> =
        // delete /outbound_voice_profiles/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OutboundVoiceProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OutboundVoiceProfileServiceAsync.WithRawResponse =
            OutboundVoiceProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<OutboundVoiceProfileCreateResponse> =
            jsonHandler<OutboundVoiceProfileCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: OutboundVoiceProfileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("outbound_voice_profiles")
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

        private val retrieveHandler: Handler<OutboundVoiceProfileRetrieveResponse> =
            jsonHandler<OutboundVoiceProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OutboundVoiceProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("outbound_voice_profiles", params._pathParam(0))
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

        private val updateHandler: Handler<OutboundVoiceProfileUpdateResponse> =
            jsonHandler<OutboundVoiceProfileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: OutboundVoiceProfileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("outbound_voice_profiles", params._pathParam(0))
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

        private val listHandler: Handler<OutboundVoiceProfileListPageResponse> =
            jsonHandler<OutboundVoiceProfileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OutboundVoiceProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("outbound_voice_profiles")
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
                                OutboundVoiceProfileListPageAsync.builder()
                                    .service(OutboundVoiceProfileServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<OutboundVoiceProfileDeleteResponse> =
            jsonHandler<OutboundVoiceProfileDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: OutboundVoiceProfileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("outbound_voice_profiles", params._pathParam(0))
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
