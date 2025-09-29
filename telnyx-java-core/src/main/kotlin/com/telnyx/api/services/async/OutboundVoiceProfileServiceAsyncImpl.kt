// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileCreateParams
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileCreateResponse
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileDeleteParams
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileDeleteResponse
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileListParams
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileListResponse
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileRetrieveParams
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileRetrieveResponse
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateParams
import com.telnyx.api.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateResponse
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
    ): CompletableFuture<OutboundVoiceProfileListResponse> =
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

        private val listHandler: Handler<OutboundVoiceProfileListResponse> =
            jsonHandler<OutboundVoiceProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OutboundVoiceProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileListResponse>> {
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
