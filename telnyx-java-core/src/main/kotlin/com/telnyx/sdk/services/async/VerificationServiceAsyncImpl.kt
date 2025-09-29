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
import com.telnyx.sdk.models.verifications.CreateVerificationResponse
import com.telnyx.sdk.models.verifications.VerificationRetrieveParams
import com.telnyx.sdk.models.verifications.VerificationRetrieveResponse
import com.telnyx.sdk.models.verifications.VerificationTriggerCallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerFlashcallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerSmsParams
import com.telnyx.sdk.services.async.verifications.ActionServiceAsync
import com.telnyx.sdk.services.async.verifications.ActionServiceAsyncImpl
import com.telnyx.sdk.services.async.verifications.ByPhoneNumberServiceAsync
import com.telnyx.sdk.services.async.verifications.ByPhoneNumberServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationServiceAsync {

    private val withRawResponse: VerificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val byPhoneNumber: ByPhoneNumberServiceAsync by lazy {
        ByPhoneNumberServiceAsyncImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VerificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationServiceAsync =
        VerificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun byPhoneNumber(): ByPhoneNumberServiceAsync = byPhoneNumber

    override fun actions(): ActionServiceAsync = actions

    override fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationRetrieveResponse> =
        // get /verifications/{verification_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun triggerCall(
        params: VerificationTriggerCallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateVerificationResponse> =
        // post /verifications/call
        withRawResponse().triggerCall(params, requestOptions).thenApply { it.parse() }

    override fun triggerFlashcall(
        params: VerificationTriggerFlashcallParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateVerificationResponse> =
        // post /verifications/flashcall
        withRawResponse().triggerFlashcall(params, requestOptions).thenApply { it.parse() }

    override fun triggerSms(
        params: VerificationTriggerSmsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreateVerificationResponse> =
        // post /verifications/sms
        withRawResponse().triggerSms(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val byPhoneNumber: ByPhoneNumberServiceAsync.WithRawResponse by lazy {
            ByPhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationServiceAsync.WithRawResponse =
            VerificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun byPhoneNumber(): ByPhoneNumberServiceAsync.WithRawResponse = byPhoneNumber

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val retrieveHandler: Handler<VerificationRetrieveResponse> =
            jsonHandler<VerificationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerificationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("verificationId", params.verificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", params._pathParam(0))
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

        private val triggerCallHandler: Handler<CreateVerificationResponse> =
            jsonHandler<CreateVerificationResponse>(clientOptions.jsonMapper)

        override fun triggerCall(
            params: VerificationTriggerCallParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", "call")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { triggerCallHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val triggerFlashcallHandler: Handler<CreateVerificationResponse> =
            jsonHandler<CreateVerificationResponse>(clientOptions.jsonMapper)

        override fun triggerFlashcall(
            params: VerificationTriggerFlashcallParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", "flashcall")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { triggerFlashcallHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val triggerSmsHandler: Handler<CreateVerificationResponse> =
            jsonHandler<CreateVerificationResponse>(clientOptions.jsonMapper)

        override fun triggerSms(
            params: VerificationTriggerSmsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreateVerificationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", "sms")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { triggerSmsHandler.handle(it) }
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
