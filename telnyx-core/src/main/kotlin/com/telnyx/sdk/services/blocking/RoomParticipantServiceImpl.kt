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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.roomparticipants.RoomParticipantListPage
import com.telnyx.sdk.models.roomparticipants.RoomParticipantListPageResponse
import com.telnyx.sdk.models.roomparticipants.RoomParticipantListParams
import com.telnyx.sdk.models.roomparticipants.RoomParticipantRetrieveParams
import com.telnyx.sdk.models.roomparticipants.RoomParticipantRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Rooms Participants operations. */
class RoomParticipantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RoomParticipantService {

    private val withRawResponse: RoomParticipantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoomParticipantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomParticipantService =
        RoomParticipantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RoomParticipantRetrieveParams,
        requestOptions: RequestOptions,
    ): RoomParticipantRetrieveResponse =
        // get /room_participants/{room_participant_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RoomParticipantListParams,
        requestOptions: RequestOptions,
    ): RoomParticipantListPage =
        // get /room_participants
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoomParticipantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoomParticipantService.WithRawResponse =
            RoomParticipantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RoomParticipantRetrieveResponse> =
            jsonHandler<RoomParticipantRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RoomParticipantRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomParticipantRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("roomParticipantId", params.roomParticipantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_participants", params._pathParam(0))
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

        private val listHandler: Handler<RoomParticipantListPageResponse> =
            jsonHandler<RoomParticipantListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RoomParticipantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomParticipantListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("room_participants")
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
                        RoomParticipantListPage.builder()
                            .service(RoomParticipantServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
