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
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionCreateParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionCreateResponse
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionDeleteParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionListParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionListResponse
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionResponse
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionRetrieveParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionUpdateParams
import com.telnyx.sdk.models.calendarconnections.CalendarConnectionUpdateResponse
import com.telnyx.sdk.services.blocking.calendarconnections.MeetingService
import com.telnyx.sdk.services.blocking.calendarconnections.MeetingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Connect calendars and manage automatic meeting joins. */
class CalendarConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CalendarConnectionService {

    private val withRawResponse: CalendarConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val meetings: MeetingService by lazy { MeetingServiceImpl(clientOptions) }

    override fun withRawResponse(): CalendarConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CalendarConnectionService =
        CalendarConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Connect calendars and manage automatic meeting joins. */
    override fun meetings(): MeetingService = meetings

    override fun create(
        params: CalendarConnectionCreateParams,
        requestOptions: RequestOptions,
    ): CalendarConnectionCreateResponse =
        // post /calendar_connections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CalendarConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CalendarConnectionResponse =
        // get /calendar_connections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CalendarConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): CalendarConnectionUpdateResponse =
        // patch /calendar_connections/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CalendarConnectionListParams,
        requestOptions: RequestOptions,
    ): CalendarConnectionListResponse =
        // get /calendar_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CalendarConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): CalendarConnectionResponse =
        // delete /calendar_connections/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CalendarConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val meetings: MeetingService.WithRawResponse by lazy {
            MeetingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CalendarConnectionService.WithRawResponse =
            CalendarConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Connect calendars and manage automatic meeting joins. */
        override fun meetings(): MeetingService.WithRawResponse = meetings

        private val createHandler: Handler<CalendarConnectionCreateResponse> =
            jsonHandler<CalendarConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CalendarConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calendar_connections")
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

        private val retrieveHandler: Handler<CalendarConnectionResponse> =
            jsonHandler<CalendarConnectionResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CalendarConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calendar_connections", params._pathParam(0))
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

        private val updateHandler: Handler<CalendarConnectionUpdateResponse> =
            jsonHandler<CalendarConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CalendarConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calendar_connections", params._pathParam(0))
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

        private val listHandler: Handler<CalendarConnectionListResponse> =
            jsonHandler<CalendarConnectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CalendarConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calendar_connections")
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

        private val deleteHandler: Handler<CalendarConnectionResponse> =
            jsonHandler<CalendarConnectionResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CalendarConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CalendarConnectionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calendar_connections", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
