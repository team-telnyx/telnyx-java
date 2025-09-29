// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.legacy.reporting

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextParams
import com.telnyx.api.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextResponse
import com.telnyx.api.services.async.legacy.reporting.usagereports.MessagingServiceAsync
import com.telnyx.api.services.async.legacy.reporting.usagereports.MessagingServiceAsyncImpl
import com.telnyx.api.services.async.legacy.reporting.usagereports.NumberLookupServiceAsync
import com.telnyx.api.services.async.legacy.reporting.usagereports.NumberLookupServiceAsyncImpl
import com.telnyx.api.services.async.legacy.reporting.usagereports.VoiceServiceAsync
import com.telnyx.api.services.async.legacy.reporting.usagereports.VoiceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class UsageReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageReportServiceAsync {

    private val withRawResponse: UsageReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messaging: MessagingServiceAsync by lazy {
        MessagingServiceAsyncImpl(clientOptions)
    }

    private val numberLookup: NumberLookupServiceAsync by lazy {
        NumberLookupServiceAsyncImpl(clientOptions)
    }

    private val voice: VoiceServiceAsync by lazy { VoiceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): UsageReportServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageReportServiceAsync =
        UsageReportServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messaging(): MessagingServiceAsync = messaging

    override fun numberLookup(): NumberLookupServiceAsync = numberLookup

    override fun voice(): VoiceServiceAsync = voice

    override fun retrieveSpeechToText(
        params: UsageReportRetrieveSpeechToTextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageReportRetrieveSpeechToTextResponse> =
        // get /legacy/reporting/usage_reports/speech_to_text
        withRawResponse().retrieveSpeechToText(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messaging: MessagingServiceAsync.WithRawResponse by lazy {
            MessagingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberLookup: NumberLookupServiceAsync.WithRawResponse by lazy {
            NumberLookupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceServiceAsync.WithRawResponse by lazy {
            VoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageReportServiceAsync.WithRawResponse =
            UsageReportServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messaging(): MessagingServiceAsync.WithRawResponse = messaging

        override fun numberLookup(): NumberLookupServiceAsync.WithRawResponse = numberLookup

        override fun voice(): VoiceServiceAsync.WithRawResponse = voice

        private val retrieveSpeechToTextHandler: Handler<UsageReportRetrieveSpeechToTextResponse> =
            jsonHandler<UsageReportRetrieveSpeechToTextResponse>(clientOptions.jsonMapper)

        override fun retrieveSpeechToText(
            params: UsageReportRetrieveSpeechToTextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageReportRetrieveSpeechToTextResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "speech_to_text")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSpeechToTextHandler.handle(it) }
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
