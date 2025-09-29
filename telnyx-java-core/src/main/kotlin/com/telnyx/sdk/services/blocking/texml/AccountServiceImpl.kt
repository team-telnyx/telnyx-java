// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonResponse
import com.telnyx.sdk.services.blocking.texml.accounts.CallService
import com.telnyx.sdk.services.blocking.texml.accounts.CallServiceImpl
import com.telnyx.sdk.services.blocking.texml.accounts.ConferenceService
import com.telnyx.sdk.services.blocking.texml.accounts.ConferenceServiceImpl
import com.telnyx.sdk.services.blocking.texml.accounts.RecordingService
import com.telnyx.sdk.services.blocking.texml.accounts.RecordingServiceImpl
import com.telnyx.sdk.services.blocking.texml.accounts.TranscriptionService
import com.telnyx.sdk.services.blocking.texml.accounts.TranscriptionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calls: CallService by lazy { CallServiceImpl(clientOptions) }

    private val conferences: ConferenceService by lazy { ConferenceServiceImpl(clientOptions) }

    private val recordings: RecordingService by lazy { RecordingServiceImpl(clientOptions) }

    private val transcriptions: TranscriptionService by lazy {
        TranscriptionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calls(): CallService = calls

    override fun conferences(): ConferenceService = conferences

    override fun recordings(): RecordingService = recordings

    override fun transcriptions(): TranscriptionService = transcriptions

    override fun retrieveRecordingsJson(
        params: AccountRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): AccountRetrieveRecordingsJsonResponse =
        // get /texml/Accounts/{account_sid}/Recordings.json
        withRawResponse().retrieveRecordingsJson(params, requestOptions).parse()

    override fun retrieveTranscriptionsJson(
        params: AccountRetrieveTranscriptionsJsonParams,
        requestOptions: RequestOptions,
    ): AccountRetrieveTranscriptionsJsonResponse =
        // get /texml/Accounts/{account_sid}/Transcriptions.json
        withRawResponse().retrieveTranscriptionsJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val calls: CallService.WithRawResponse by lazy {
            CallServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val conferences: ConferenceService.WithRawResponse by lazy {
            ConferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordings: RecordingService.WithRawResponse by lazy {
            RecordingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcriptions: TranscriptionService.WithRawResponse by lazy {
            TranscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calls(): CallService.WithRawResponse = calls

        override fun conferences(): ConferenceService.WithRawResponse = conferences

        override fun recordings(): RecordingService.WithRawResponse = recordings

        override fun transcriptions(): TranscriptionService.WithRawResponse = transcriptions

        private val retrieveRecordingsJsonHandler: Handler<AccountRetrieveRecordingsJsonResponse> =
            jsonHandler<AccountRetrieveRecordingsJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordingsJson(
            params: AccountRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveRecordingsJsonResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Recordings.json")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRecordingsJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveTranscriptionsJsonHandler:
            Handler<AccountRetrieveTranscriptionsJsonResponse> =
            jsonHandler<AccountRetrieveTranscriptionsJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveTranscriptionsJson(
            params: AccountRetrieveTranscriptionsJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Transcriptions.json",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveTranscriptionsJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
