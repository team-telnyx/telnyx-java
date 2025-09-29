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
import com.telnyx.api.models.phonenumbers.voice.VoiceListParams
import com.telnyx.api.models.phonenumbers.voice.VoiceListResponse
import com.telnyx.api.models.phonenumbers.voice.VoiceRetrieveParams
import com.telnyx.api.models.phonenumbers.voice.VoiceRetrieveResponse
import com.telnyx.api.models.phonenumbers.voice.VoiceUpdateParams
import com.telnyx.api.models.phonenumbers.voice.VoiceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceServiceAsync {

    private val withRawResponse: VoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync =
        VoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceRetrieveResponse> =
        // get /phone_numbers/{id}/voice
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: VoiceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceUpdateResponse> =
        // patch /phone_numbers/{id}/voice
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VoiceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoiceListResponse> =
        // get /phone_numbers/voice
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceServiceAsync.WithRawResponse =
            VoiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<VoiceRetrieveResponse> =
            jsonHandler<VoiceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "voice")
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

        private val updateHandler: Handler<VoiceUpdateResponse> =
            jsonHandler<VoiceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VoiceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "voice")
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

        private val listHandler: Handler<VoiceListResponse> =
            jsonHandler<VoiceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VoiceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoiceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "voice")
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
