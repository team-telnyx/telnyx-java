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
import com.telnyx.api.models.notificationeventconditions.NotificationEventConditionListParams
import com.telnyx.api.models.notificationeventconditions.NotificationEventConditionListResponse
import java.util.function.Consumer

class NotificationEventConditionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : NotificationEventConditionService {

    private val withRawResponse: NotificationEventConditionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationEventConditionService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NotificationEventConditionService =
        NotificationEventConditionServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: NotificationEventConditionListParams,
        requestOptions: RequestOptions,
    ): NotificationEventConditionListResponse =
        // get /notification_event_conditions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationEventConditionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationEventConditionService.WithRawResponse =
            NotificationEventConditionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<NotificationEventConditionListResponse> =
            jsonHandler<NotificationEventConditionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationEventConditionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationEventConditionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_event_conditions")
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
