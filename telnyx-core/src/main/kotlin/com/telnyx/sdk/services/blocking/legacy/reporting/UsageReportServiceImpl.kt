// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.UsageReportRetrieveSpeechToTextResponse
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.MessagingService
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.MessagingServiceImpl
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.NumberLookupService
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.NumberLookupServiceImpl
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.VoiceService
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.VoiceServiceImpl
import java.util.function.Consumer

class UsageReportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageReportService {

    private val withRawResponse: UsageReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val messaging: MessagingService by lazy { MessagingServiceImpl(clientOptions) }

    private val numberLookup: NumberLookupService by lazy { NumberLookupServiceImpl(clientOptions) }

    private val voice: VoiceService by lazy { VoiceServiceImpl(clientOptions) }

    override fun withRawResponse(): UsageReportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageReportService =
        UsageReportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun messaging(): MessagingService = messaging

    override fun numberLookup(): NumberLookupService = numberLookup

    override fun voice(): VoiceService = voice

    override fun retrieveSpeechToText(
        params: UsageReportRetrieveSpeechToTextParams,
        requestOptions: RequestOptions,
    ): UsageReportRetrieveSpeechToTextResponse =
        // get /legacy/reporting/usage_reports/speech_to_text
        withRawResponse().retrieveSpeechToText(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val messaging: MessagingService.WithRawResponse by lazy {
            MessagingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val numberLookup: NumberLookupService.WithRawResponse by lazy {
            NumberLookupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceService.WithRawResponse by lazy {
            VoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageReportService.WithRawResponse =
            UsageReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun messaging(): MessagingService.WithRawResponse = messaging

        override fun numberLookup(): NumberLookupService.WithRawResponse = numberLookup

        override fun voice(): VoiceService.WithRawResponse = voice

        private val retrieveSpeechToTextHandler: Handler<UsageReportRetrieveSpeechToTextResponse> =
            jsonHandler<UsageReportRetrieveSpeechToTextResponse>(clientOptions.jsonMapper)

        override fun retrieveSpeechToText(
            params: UsageReportRetrieveSpeechToTextParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageReportRetrieveSpeechToTextResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "speech_to_text")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
