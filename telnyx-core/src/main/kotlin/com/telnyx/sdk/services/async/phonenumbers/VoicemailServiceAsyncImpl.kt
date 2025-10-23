// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

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
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailCreateParams
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailCreateResponse
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailRetrieveParams
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailRetrieveResponse
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailUpdateParams
import com.telnyx.sdk.models.phonenumbers.voicemail.VoicemailUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VoicemailServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VoicemailServiceAsync {

    private val withRawResponse: VoicemailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VoicemailServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoicemailServiceAsync =
        VoicemailServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VoicemailCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoicemailCreateResponse> =
        // post /phone_numbers/{phone_number_id}/voicemail
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: VoicemailRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoicemailRetrieveResponse> =
        // get /phone_numbers/{phone_number_id}/voicemail
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: VoicemailUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VoicemailUpdateResponse> =
        // patch /phone_numbers/{phone_number_id}/voicemail
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoicemailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoicemailServiceAsync.WithRawResponse =
            VoicemailServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VoicemailCreateResponse> =
            jsonHandler<VoicemailCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VoicemailCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoicemailCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumberId", params.phoneNumberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "voicemail")
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

        private val retrieveHandler: Handler<VoicemailRetrieveResponse> =
            jsonHandler<VoicemailRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VoicemailRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoicemailRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumberId", params.phoneNumberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "voicemail")
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

        private val updateHandler: Handler<VoicemailUpdateResponse> =
            jsonHandler<VoicemailUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VoicemailUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VoicemailUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumberId", params.phoneNumberId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", params._pathParam(0), "voicemail")
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
    }
}
