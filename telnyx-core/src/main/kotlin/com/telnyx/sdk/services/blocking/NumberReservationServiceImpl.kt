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
import com.telnyx.sdk.models.numberreservations.NumberReservationCreateParams
import com.telnyx.sdk.models.numberreservations.NumberReservationCreateResponse
import com.telnyx.sdk.models.numberreservations.NumberReservationListPage
import com.telnyx.sdk.models.numberreservations.NumberReservationListPageResponse
import com.telnyx.sdk.models.numberreservations.NumberReservationListParams
import com.telnyx.sdk.models.numberreservations.NumberReservationRetrieveParams
import com.telnyx.sdk.models.numberreservations.NumberReservationRetrieveResponse
import com.telnyx.sdk.services.blocking.numberreservations.ActionService
import com.telnyx.sdk.services.blocking.numberreservations.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberReservationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberReservationService {

    private val withRawResponse: NumberReservationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): NumberReservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberReservationService =
        NumberReservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: NumberReservationCreateParams,
        requestOptions: RequestOptions,
    ): NumberReservationCreateResponse =
        // post /number_reservations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NumberReservationRetrieveParams,
        requestOptions: RequestOptions,
    ): NumberReservationRetrieveResponse =
        // get /number_reservations/{number_reservation_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: NumberReservationListParams,
        requestOptions: RequestOptions,
    ): NumberReservationListPage =
        // get /number_reservations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberReservationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberReservationService.WithRawResponse =
            NumberReservationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<NumberReservationCreateResponse> =
            jsonHandler<NumberReservationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NumberReservationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberReservationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_reservations")
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

        private val retrieveHandler: Handler<NumberReservationRetrieveResponse> =
            jsonHandler<NumberReservationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberReservationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberReservationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberReservationId", params.numberReservationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_reservations", params._pathParam(0))
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

        private val listHandler: Handler<NumberReservationListPageResponse> =
            jsonHandler<NumberReservationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberReservationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberReservationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_reservations")
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
                        NumberReservationListPage.builder()
                            .service(NumberReservationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
