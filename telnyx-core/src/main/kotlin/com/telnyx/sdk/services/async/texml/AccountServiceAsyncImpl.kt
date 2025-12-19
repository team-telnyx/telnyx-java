// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonParams
import com.telnyx.sdk.models.texml.accounts.AccountRetrieveTranscriptionsJsonResponse
import com.telnyx.sdk.services.async.texml.accounts.CallServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.CallServiceAsyncImpl
import com.telnyx.sdk.services.async.texml.accounts.ConferenceServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.ConferenceServiceAsyncImpl
import com.telnyx.sdk.services.async.texml.accounts.QueueServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.QueueServiceAsyncImpl
import com.telnyx.sdk.services.async.texml.accounts.RecordingServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.RecordingServiceAsyncImpl
import com.telnyx.sdk.services.async.texml.accounts.TranscriptionServiceAsync
import com.telnyx.sdk.services.async.texml.accounts.TranscriptionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val calls: CallServiceAsync by lazy { CallServiceAsyncImpl(clientOptions) }

    private val conferences: ConferenceServiceAsync by lazy {
        ConferenceServiceAsyncImpl(clientOptions)
    }

    private val recordings: RecordingServiceAsync by lazy {
        RecordingServiceAsyncImpl(clientOptions)
    }

    private val transcriptions: TranscriptionServiceAsync by lazy {
        TranscriptionServiceAsyncImpl(clientOptions)
    }

    private val queues: QueueServiceAsync by lazy { QueueServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun calls(): CallServiceAsync = calls

    override fun conferences(): ConferenceServiceAsync = conferences

    override fun recordings(): RecordingServiceAsync = recordings

    override fun transcriptions(): TranscriptionServiceAsync = transcriptions

    override fun queues(): QueueServiceAsync = queues

    override fun retrieveRecordingsJson(
        params: AccountRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveRecordingsJsonResponse> =
        // get /texml/Accounts/{account_sid}/Recordings.json
        withRawResponse().retrieveRecordingsJson(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTranscriptionsJson(
        params: AccountRetrieveTranscriptionsJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountRetrieveTranscriptionsJsonResponse> =
        // get /texml/Accounts/{account_sid}/Transcriptions.json
        withRawResponse().retrieveTranscriptionsJson(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val calls: CallServiceAsync.WithRawResponse by lazy {
            CallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conferences: ConferenceServiceAsync.WithRawResponse by lazy {
            ConferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordings: RecordingServiceAsync.WithRawResponse by lazy {
            RecordingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcriptions: TranscriptionServiceAsync.WithRawResponse by lazy {
            TranscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val queues: QueueServiceAsync.WithRawResponse by lazy {
            QueueServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun calls(): CallServiceAsync.WithRawResponse = calls

        override fun conferences(): ConferenceServiceAsync.WithRawResponse = conferences

        override fun recordings(): RecordingServiceAsync.WithRawResponse = recordings

        override fun transcriptions(): TranscriptionServiceAsync.WithRawResponse = transcriptions

        override fun queues(): QueueServiceAsync.WithRawResponse = queues

        private val retrieveRecordingsJsonHandler: Handler<AccountRetrieveRecordingsJsonResponse> =
            jsonHandler<AccountRetrieveRecordingsJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordingsJson(
            params: AccountRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountRetrieveRecordingsJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Recordings.json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRecordingsJsonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<AccountRetrieveTranscriptionsJsonResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
