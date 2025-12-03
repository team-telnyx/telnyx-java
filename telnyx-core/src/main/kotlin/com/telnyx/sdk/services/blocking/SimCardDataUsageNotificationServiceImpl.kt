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
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationCreateResponse
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationDeleteResponse
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationListPage
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationListPageResponse
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationListParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationRetrieveResponse
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateParams
import com.telnyx.sdk.models.simcarddatausagenotifications.SimCardDataUsageNotificationUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SimCardDataUsageNotificationServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    SimCardDataUsageNotificationService {

    private val withRawResponse: SimCardDataUsageNotificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SimCardDataUsageNotificationService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SimCardDataUsageNotificationService =
        SimCardDataUsageNotificationServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: SimCardDataUsageNotificationCreateParams,
        requestOptions: RequestOptions,
    ): SimCardDataUsageNotificationCreateResponse =
        // post /sim_card_data_usage_notifications
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SimCardDataUsageNotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): SimCardDataUsageNotificationRetrieveResponse =
        // get /sim_card_data_usage_notifications/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SimCardDataUsageNotificationUpdateParams,
        requestOptions: RequestOptions,
    ): SimCardDataUsageNotificationUpdateResponse =
        // patch /sim_card_data_usage_notifications/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SimCardDataUsageNotificationListParams,
        requestOptions: RequestOptions,
    ): SimCardDataUsageNotificationListPage =
        // get /sim_card_data_usage_notifications
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: SimCardDataUsageNotificationDeleteParams,
        requestOptions: RequestOptions,
    ): SimCardDataUsageNotificationDeleteResponse =
        // delete /sim_card_data_usage_notifications/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardDataUsageNotificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardDataUsageNotificationService.WithRawResponse =
            SimCardDataUsageNotificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SimCardDataUsageNotificationCreateResponse> =
            jsonHandler<SimCardDataUsageNotificationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SimCardDataUsageNotificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDataUsageNotificationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications")
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

        private val retrieveHandler: Handler<SimCardDataUsageNotificationRetrieveResponse> =
            jsonHandler<SimCardDataUsageNotificationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardDataUsageNotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDataUsageNotificationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications", params._pathParam(0))
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

        private val updateHandler: Handler<SimCardDataUsageNotificationUpdateResponse> =
            jsonHandler<SimCardDataUsageNotificationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SimCardDataUsageNotificationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDataUsageNotificationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "simCardDataUsageNotificationId",
                params.simCardDataUsageNotificationId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications", params._pathParam(0))
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

        private val listHandler: Handler<SimCardDataUsageNotificationListPageResponse> =
            jsonHandler<SimCardDataUsageNotificationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardDataUsageNotificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDataUsageNotificationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications")
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
                        SimCardDataUsageNotificationListPage.builder()
                            .service(SimCardDataUsageNotificationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<SimCardDataUsageNotificationDeleteResponse> =
            jsonHandler<SimCardDataUsageNotificationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SimCardDataUsageNotificationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardDataUsageNotificationDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_data_usage_notifications", params._pathParam(0))
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
