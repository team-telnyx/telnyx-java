// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

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
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveConferencesParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveConferencesResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveRecordingsResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceUpdateParams
import com.telnyx.sdk.models.texml.accounts.conferences.ConferenceUpdateResponse
import com.telnyx.sdk.services.blocking.texml.accounts.conferences.ParticipantService
import com.telnyx.sdk.services.blocking.texml.accounts.conferences.ParticipantServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConferenceService {

    private val withRawResponse: ConferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val participants: ParticipantService by lazy { ParticipantServiceImpl(clientOptions) }

    override fun withRawResponse(): ConferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConferenceService =
        ConferenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun participants(): ParticipantService = participants

    override fun retrieve(
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): ConferenceRetrieveResponse =
        // get /texml/Accounts/{account_sid}/Conferences/{conference_sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ConferenceUpdateParams,
        requestOptions: RequestOptions,
    ): ConferenceUpdateResponse =
        // post /texml/Accounts/{account_sid}/Conferences/{conference_sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun retrieveConferences(
        params: ConferenceRetrieveConferencesParams,
        requestOptions: RequestOptions,
    ): ConferenceRetrieveConferencesResponse =
        // get /texml/Accounts/{account_sid}/Conferences
        withRawResponse().retrieveConferences(params, requestOptions).parse()

    override fun retrieveRecordings(
        params: ConferenceRetrieveRecordingsParams,
        requestOptions: RequestOptions,
    ): ConferenceRetrieveRecordingsResponse =
        // get /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings
        withRawResponse().retrieveRecordings(params, requestOptions).parse()

    override fun retrieveRecordingsJson(
        params: ConferenceRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): ConferenceRetrieveRecordingsJsonResponse =
        // get /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Recordings.json
        withRawResponse().retrieveRecordingsJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConferenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val participants: ParticipantService.WithRawResponse by lazy {
            ParticipantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConferenceService.WithRawResponse =
            ConferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun participants(): ParticipantService.WithRawResponse = participants

        private val retrieveHandler: Handler<ConferenceRetrieveResponse> =
            jsonHandler<ConferenceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceRetrieveResponse> {
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

        private val updateHandler: Handler<ConferenceUpdateResponse> =
            jsonHandler<ConferenceUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConferenceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveConferencesHandler: Handler<ConferenceRetrieveConferencesResponse> =
            jsonHandler<ConferenceRetrieveConferencesResponse>(clientOptions.jsonMapper)

        override fun retrieveConferences(
            params: ConferenceRetrieveConferencesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceRetrieveConferencesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Conferences")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveConferencesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveRecordingsHandler: Handler<ConferenceRetrieveRecordingsResponse> =
            jsonHandler<ConferenceRetrieveRecordingsResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordings(
            params: ConferenceRetrieveRecordingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceRetrieveRecordingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRecordingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<ConferenceRetrieveRecordingsJsonResponse> {
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
    }
}
