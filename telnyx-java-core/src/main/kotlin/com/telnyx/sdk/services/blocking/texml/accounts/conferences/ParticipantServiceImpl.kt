// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.conferences

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantDeleteParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantParticipantsParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantParticipantsResponse
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveParticipantsParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveParticipantsResponse
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantUpdateParams
import com.telnyx.sdk.models.texml.accounts.conferences.participants.ParticipantUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** TeXML REST Commands */
class ParticipantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ParticipantService {

    private val withRawResponse: ParticipantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ParticipantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipantService =
        ParticipantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ParticipantRetrieveParams,
        requestOptions: RequestOptions,
    ): ParticipantRetrieveResponse =
        // get
        // /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ParticipantUpdateParams,
        requestOptions: RequestOptions,
    ): ParticipantUpdateResponse =
        // post
        // /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: ParticipantDeleteParams, requestOptions: RequestOptions) {
        // delete
        // /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants/{call_sid_or_participant_label}
        withRawResponse().delete(params, requestOptions)
    }

    override fun participants(
        params: ParticipantParticipantsParams,
        requestOptions: RequestOptions,
    ): ParticipantParticipantsResponse =
        // post /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants
        withRawResponse().participants(params, requestOptions).parse()

    override fun retrieveParticipants(
        params: ParticipantRetrieveParticipantsParams,
        requestOptions: RequestOptions,
    ): ParticipantRetrieveParticipantsResponse =
        // get /texml/Accounts/{account_sid}/Conferences/{conference_sid}/Participants
        withRawResponse().retrieveParticipants(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ParticipantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipantService.WithRawResponse =
            ParticipantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ParticipantRetrieveResponse> =
            jsonHandler<ParticipantRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ParticipantRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "callSidOrParticipantLabel",
                params.callSidOrParticipantLabel().getOrNull(),
            )
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
                        "Participants",
                        params._pathParam(2),
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

        private val updateHandler: Handler<ParticipantUpdateResponse> =
            jsonHandler<ParticipantUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ParticipantUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "callSidOrParticipantLabel",
                params.callSidOrParticipantLabel().getOrNull(),
            )
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
                        "Participants",
                        params._pathParam(2),
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ParticipantDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "callSidOrParticipantLabel",
                params.callSidOrParticipantLabel().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Conferences",
                        params._pathParam(1),
                        "Participants",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val participantsHandler: Handler<ParticipantParticipantsResponse> =
            jsonHandler<ParticipantParticipantsResponse>(clientOptions.jsonMapper)

        override fun participants(
            params: ParticipantParticipantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantParticipantsResponse> {
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
                        "Participants",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { participantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveParticipantsHandler: Handler<ParticipantRetrieveParticipantsResponse> =
            jsonHandler<ParticipantRetrieveParticipantsResponse>(clientOptions.jsonMapper)

        override fun retrieveParticipants(
            params: ParticipantRetrieveParticipantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipantRetrieveParticipantsResponse> {
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
                        "Participants",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveParticipantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
