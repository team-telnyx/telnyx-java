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
import com.telnyx.sdk.models.conferences.ConferenceCreateParams
import com.telnyx.sdk.models.conferences.ConferenceCreateResponse
import com.telnyx.sdk.models.conferences.ConferenceListPage
import com.telnyx.sdk.models.conferences.ConferenceListPageResponse
import com.telnyx.sdk.models.conferences.ConferenceListParams
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsPage
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsPageResponse
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParticipantParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParticipantResponse
import com.telnyx.sdk.models.conferences.ConferenceRetrieveResponse
import com.telnyx.sdk.models.conferences.ConferenceUpdateParticipantParams
import com.telnyx.sdk.models.conferences.ConferenceUpdateParticipantResponse
import com.telnyx.sdk.services.blocking.conferences.ActionService
import com.telnyx.sdk.services.blocking.conferences.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConferenceService {

    private val withRawResponse: ConferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): ConferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConferenceService =
        ConferenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: ConferenceCreateParams,
        requestOptions: RequestOptions,
    ): ConferenceCreateResponse =
        // post /conferences
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ConferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): ConferenceRetrieveResponse =
        // get /conferences/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ConferenceListParams,
        requestOptions: RequestOptions,
    ): ConferenceListPage =
        // get /conferences
        withRawResponse().list(params, requestOptions).parse()

    override fun listParticipants(
        params: ConferenceListParticipantsParams,
        requestOptions: RequestOptions,
    ): ConferenceListParticipantsPage =
        // get /conferences/{conference_id}/participants
        withRawResponse().listParticipants(params, requestOptions).parse()

    override fun retrieveParticipant(
        params: ConferenceRetrieveParticipantParams,
        requestOptions: RequestOptions,
    ): ConferenceRetrieveParticipantResponse =
        // get /conferences/{id}/participants/{participant_id}
        withRawResponse().retrieveParticipant(params, requestOptions).parse()

    override fun updateParticipant(
        params: ConferenceUpdateParticipantParams,
        requestOptions: RequestOptions,
    ): ConferenceUpdateParticipantResponse =
        // patch /conferences/{id}/participants/{participant_id}
        withRawResponse().updateParticipant(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConferenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConferenceService.WithRawResponse =
            ConferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<ConferenceCreateResponse> =
            jsonHandler<ConferenceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ConferenceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ConferenceRetrieveResponse> =
            jsonHandler<ConferenceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0))
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

        private val listHandler: Handler<ConferenceListPageResponse> =
            jsonHandler<ConferenceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConferenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ConferenceListPage.builder()
                            .service(ConferenceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listParticipantsHandler: Handler<ConferenceListParticipantsPageResponse> =
            jsonHandler<ConferenceListParticipantsPageResponse>(clientOptions.jsonMapper)

        override fun listParticipants(
            params: ConferenceListParticipantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceListParticipantsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("conferenceId", params.conferenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("conferences", params._pathParam(0), "participants")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listParticipantsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ConferenceListParticipantsPage.builder()
                            .service(ConferenceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveParticipantHandler: Handler<ConferenceRetrieveParticipantResponse> =
            jsonHandler<ConferenceRetrieveParticipantResponse>(clientOptions.jsonMapper)

        override fun retrieveParticipant(
            params: ConferenceRetrieveParticipantParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceRetrieveParticipantResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantId", params.participantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conferences",
                        params._pathParam(0),
                        "participants",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveParticipantHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateParticipantHandler: Handler<ConferenceUpdateParticipantResponse> =
            jsonHandler<ConferenceUpdateParticipantResponse>(clientOptions.jsonMapper)

        override fun updateParticipant(
            params: ConferenceUpdateParticipantParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceUpdateParticipantResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("participantId", params.participantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "conferences",
                        params._pathParam(0),
                        "participants",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateParticipantHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
