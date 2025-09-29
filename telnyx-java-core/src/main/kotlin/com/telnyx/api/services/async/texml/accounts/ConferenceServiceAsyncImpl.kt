// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts

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
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveConferencesParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveConferencesResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveRecordingsResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceRetrieveResponse
import com.telnyx.api.models.texml.accounts.conferences.ConferenceUpdateParams
import com.telnyx.api.models.texml.accounts.conferences.ConferenceUpdateResponse
import com.telnyx.api.services.async.texml.accounts.conferences.ParticipantServiceAsync
import com.telnyx.api.services.async.texml.accounts.conferences.ParticipantServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConferenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConferenceServiceAsync {

    private val withRawResponse: ConferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val participants: ParticipantServiceAsync by lazy {
        ParticipantServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ConferenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConferenceServiceAsync =
        ConferenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun participants(): ParticipantServiceAsync = participants

    override fun retrieve(
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceRetrieveResponse> =
        // get /texml/Accounts/{account_sid}/Conferences/{conference_sid}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ConferenceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceUpdateResponse> =
        // post /texml/Accounts/{account_sid}/Conferences/{conference_sid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun retrieveConferences(
        params: ConferenceRetrieveConferencesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceRetrieveConferencesResponse> =
        // get /texml/Accounts/{account_sid}/Conferences
        withRawResponse().retrieveConferences(params, requestOptions).thenApply { it.parse() }

    override fun retrieveRecordings(
        params: ConferenceRetrieveRecordingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceRetrieveRecordingsResponse> =
        // get /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings
        withRawResponse().retrieveRecordings(params, requestOptions).thenApply { it.parse() }

    override fun retrieveRecordingsJson(
        params: ConferenceRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConferenceRetrieveRecordingsJsonResponse> =
        // get /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings.json
        withRawResponse().retrieveRecordingsJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val participants: ParticipantServiceAsync.WithRawResponse by lazy {
            ParticipantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConferenceServiceAsync.WithRawResponse =
            ConferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun participants(): ParticipantServiceAsync.WithRawResponse = participants

        private val retrieveHandler: Handler<ConferenceRetrieveResponse> =
            jsonHandler<ConferenceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conferenceSid", params.conferenceSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Conferences",
                        params._pathParam(1),
                    )
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

        private val updateHandler: Handler<ConferenceUpdateResponse> =
            jsonHandler<ConferenceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConferenceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conferenceSid", params.conferenceSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Conferences",
                        params._pathParam(1),
                    )
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

        private val retrieveConferencesHandler: Handler<ConferenceRetrieveConferencesResponse> =
            jsonHandler<ConferenceRetrieveConferencesResponse>(clientOptions.jsonMapper)

        override fun retrieveConferences(
            params: ConferenceRetrieveConferencesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveConferencesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Conferences")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveConferencesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveRecordingsHandler: Handler<ConferenceRetrieveRecordingsResponse> =
            jsonHandler<ConferenceRetrieveRecordingsResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordings(
            params: ConferenceRetrieveRecordingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conferenceSid", params.conferenceSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Conferences",
                        params._pathParam(1),
                        "Recordings",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRecordingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveRecordingsJsonHandler:
            Handler<ConferenceRetrieveRecordingsJsonResponse> =
            jsonHandler<ConferenceRetrieveRecordingsJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordingsJson(
            params: ConferenceRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conferenceSid", params.conferenceSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Conferences",
                        params._pathParam(1),
                        "Recordings.json",
                    )
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
    }
}
