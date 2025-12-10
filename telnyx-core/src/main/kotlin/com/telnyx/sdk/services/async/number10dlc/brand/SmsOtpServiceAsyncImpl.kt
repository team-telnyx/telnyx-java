// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.brand

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
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpGetStatusParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpGetStatusResponse
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpTriggerParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpTriggerResponse
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpVerifyParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SmsOtpServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SmsOtpServiceAsync {

    private val withRawResponse: SmsOtpServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SmsOtpServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmsOtpServiceAsync =
        SmsOtpServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getStatus(
        params: SmsOtpGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmsOtpGetStatusResponse> =
        // get /10dlc/brand/smsOtp/{referenceId}
        withRawResponse().getStatus(params, requestOptions).thenApply { it.parse() }

    override fun trigger(
        params: SmsOtpTriggerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmsOtpTriggerResponse> =
        // post /10dlc/brand/{brandId}/smsOtp
        withRawResponse().trigger(params, requestOptions).thenApply { it.parse() }

    override fun verify(
        params: SmsOtpVerifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /10dlc/brand/{brandId}/smsOtp
        withRawResponse().verify(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SmsOtpServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmsOtpServiceAsync.WithRawResponse =
            SmsOtpServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getStatusHandler: Handler<SmsOtpGetStatusResponse> =
            jsonHandler<SmsOtpGetStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: SmsOtpGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmsOtpGetStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("referenceId", params.referenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "brand", "smsOtp", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val triggerHandler: Handler<SmsOtpTriggerResponse> =
            jsonHandler<SmsOtpTriggerResponse>(clientOptions.jsonMapper)

        override fun trigger(
            params: SmsOtpTriggerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmsOtpTriggerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "brand", params._pathParam(0), "smsOtp")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { triggerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val verifyHandler: Handler<Void?> = emptyHandler()

        override fun verify(
            params: SmsOtpVerifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "brand", params._pathParam(0), "smsOtp")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { verifyHandler.handle(it) }
                    }
                }
        }
    }
}
