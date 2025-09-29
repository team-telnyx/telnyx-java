// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.notificationevents.NotificationEventListParams
import com.telnyx.api.models.notificationevents.NotificationEventListResponse
import java.util.function.Consumer

class NotificationEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationEventService {

    private val withRawResponse: NotificationEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationEventService =
        NotificationEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: NotificationEventListParams,
        requestOptions: RequestOptions,
    ): NotificationEventListResponse =
        // get /notification_events
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationEventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationEventService.WithRawResponse =
            NotificationEventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<NotificationEventListResponse> =
            jsonHandler<NotificationEventListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationEventListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_events")
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
