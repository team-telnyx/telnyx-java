// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.verifications.CreateVerificationResponse
import com.telnyx.sdk.models.verifications.VerificationRetrieveParams
import com.telnyx.sdk.models.verifications.VerificationRetrieveResponse
import com.telnyx.sdk.models.verifications.VerificationTriggerCallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerFlashcallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerSmsParams
import com.telnyx.sdk.services.blocking.verifications.ActionService
import com.telnyx.sdk.services.blocking.verifications.ActionServiceImpl
import com.telnyx.sdk.services.blocking.verifications.ByPhoneNumberService
import com.telnyx.sdk.services.blocking.verifications.ByPhoneNumberServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationService {

    private val withRawResponse: VerificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val byPhoneNumber: ByPhoneNumberService by lazy {
        ByPhoneNumberServiceImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): VerificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationService =
        VerificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun byPhoneNumber(): ByPhoneNumberService = byPhoneNumber

    override fun actions(): ActionService = actions

    override fun retrieve(
        params: VerificationRetrieveParams,
        requestOptions: RequestOptions,
    ): VerificationRetrieveResponse =
        // get /verifications/{verification_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun triggerCall(
        params: VerificationTriggerCallParams,
        requestOptions: RequestOptions,
    ): CreateVerificationResponse =
        // post /verifications/call
        withRawResponse().triggerCall(params, requestOptions).parse()

    override fun triggerFlashcall(
        params: VerificationTriggerFlashcallParams,
        requestOptions: RequestOptions,
    ): CreateVerificationResponse =
        // post /verifications/flashcall
        withRawResponse().triggerFlashcall(params, requestOptions).parse()

    override fun triggerSms(
        params: VerificationTriggerSmsParams,
        requestOptions: RequestOptions,
    ): CreateVerificationResponse =
        // post /verifications/sms
        withRawResponse().triggerSms(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val byPhoneNumber: ByPhoneNumberService.WithRawResponse by lazy {
            ByPhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationService.WithRawResponse =
            VerificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun byPhoneNumber(): ByPhoneNumberService.WithRawResponse = byPhoneNumber

        override fun actions(): ActionService.WithRawResponse = actions

        private val retrieveHandler: Handler<VerificationRetrieveResponse> =
            jsonHandler<VerificationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerificationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("verificationId", params.verificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerCallHandler: Handler<CreateVerificationResponse> =
            jsonHandler<CreateVerificationResponse>(clientOptions.jsonMapper)

        override fun triggerCall(
            params: VerificationTriggerCallParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateVerificationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", "call")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { triggerCallHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerFlashcallHandler: Handler<CreateVerificationResponse> =
            jsonHandler<CreateVerificationResponse>(clientOptions.jsonMapper)

        override fun triggerFlashcall(
            params: VerificationTriggerFlashcallParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateVerificationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", "flashcall")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { triggerFlashcallHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val triggerSmsHandler: Handler<CreateVerificationResponse> =
            jsonHandler<CreateVerificationResponse>(clientOptions.jsonMapper)

        override fun triggerSms(
            params: VerificationTriggerSmsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreateVerificationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", "sms")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
