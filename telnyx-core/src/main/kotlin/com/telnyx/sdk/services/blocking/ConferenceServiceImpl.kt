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
import com.telnyx.sdk.models.conferences.ConferenceListParams
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsParams
import com.telnyx.sdk.models.conferences.ConferenceListParticipantsResponse
import com.telnyx.sdk.models.conferences.ConferenceListResponse
import com.telnyx.sdk.models.conferences.ConferenceRetrieveParams
import com.telnyx.sdk.models.conferences.ConferenceRetrieveResponse
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
    ): ConferenceListResponse =
        // get /conferences
        withRawResponse().list(params, requestOptions).parse()

    override fun listParticipants(
        params: ConferenceListParticipantsParams,
        requestOptions: RequestOptions,
    ): ConferenceListParticipantsResponse =
        // get /conferences/{conference_id}/participants
        withRawResponse().listParticipants(params, requestOptions).parse()

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

        private val listHandler: Handler<ConferenceListResponse> =
            jsonHandler<ConferenceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConferenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceListResponse> {
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
            }
        }

        private val listParticipantsHandler: Handler<ConferenceListParticipantsResponse> =
            jsonHandler<ConferenceListParticipantsResponse>(clientOptions.jsonMapper)

        override fun listParticipants(
            params: ConferenceListParticipantsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConferenceListParticipantsResponse> {
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
            }
        }
    }
}
