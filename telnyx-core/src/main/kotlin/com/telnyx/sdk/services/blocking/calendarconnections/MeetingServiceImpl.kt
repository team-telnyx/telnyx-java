// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.calendarconnections

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
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingListParams
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingListResponse
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingUpdateParams
import com.telnyx.sdk.models.calendarconnections.meetings.MeetingUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Connect calendars and manage automatic meeting joins. */
class MeetingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MeetingService {

    private val withRawResponse: MeetingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MeetingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MeetingService =
        MeetingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: MeetingUpdateParams,
        requestOptions: RequestOptions,
    ): MeetingUpdateResponse =
        // patch /calendar_connections/{id}/meetings/{meeting_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MeetingListParams,
        requestOptions: RequestOptions,
    ): MeetingListResponse =
        // get /calendar_connections/{id}/meetings
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeetingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MeetingService.WithRawResponse =
            MeetingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<MeetingUpdateResponse> =
            jsonHandler<MeetingUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MeetingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("meetingId", params.meetingId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "calendar_connections",
                        params._pathParam(0),
                        "meetings",
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

        private val listHandler: Handler<MeetingListResponse> =
            jsonHandler<MeetingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MeetingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeetingListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("calendar_connections", params._pathParam(0), "meetings")
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
    }
}
