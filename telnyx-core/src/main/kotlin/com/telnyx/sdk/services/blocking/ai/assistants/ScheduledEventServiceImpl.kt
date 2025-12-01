// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

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
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventCreateParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventDeleteParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventListParams
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventListResponse
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventResponse
import com.telnyx.sdk.models.ai.assistants.scheduledevents.ScheduledEventRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ScheduledEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduledEventService {

    private val withRawResponse: ScheduledEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduledEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduledEventService =
        ScheduledEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ScheduledEventCreateParams,
        requestOptions: RequestOptions,
    ): ScheduledEventResponse =
        // post /ai/assistants/{assistant_id}/scheduled_events
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ScheduledEventRetrieveParams,
        requestOptions: RequestOptions,
    ): ScheduledEventResponse =
        // get /ai/assistants/{assistant_id}/scheduled_events/{event_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ScheduledEventListParams,
        requestOptions: RequestOptions,
    ): ScheduledEventListResponse =
        // get /ai/assistants/{assistant_id}/scheduled_events
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ScheduledEventDeleteParams, requestOptions: RequestOptions) {
        // delete /ai/assistants/{assistant_id}/scheduled_events/{event_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduledEventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduledEventService.WithRawResponse =
            ScheduledEventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ScheduledEventResponse> =
            jsonHandler<ScheduledEventResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ScheduledEventCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "scheduled_events")
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

        private val retrieveHandler: Handler<ScheduledEventResponse> =
            jsonHandler<ScheduledEventResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ScheduledEventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "scheduled_events",
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

        private val listHandler: Handler<ScheduledEventListResponse> =
            jsonHandler<ScheduledEventListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ScheduledEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledEventListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "scheduled_events")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ScheduledEventDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "assistants",
                        params._pathParam(0),
                        "scheduled_events",
                        params._pathParam(1),
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
    }
}
