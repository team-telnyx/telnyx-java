// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.notificationchannels.NotificationChannelCreateParams
import com.telnyx.api.models.notificationchannels.NotificationChannelCreateResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelDeleteParams
import com.telnyx.api.models.notificationchannels.NotificationChannelDeleteResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelListParams
import com.telnyx.api.models.notificationchannels.NotificationChannelListResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelRetrieveParams
import com.telnyx.api.models.notificationchannels.NotificationChannelRetrieveResponse
import com.telnyx.api.models.notificationchannels.NotificationChannelUpdateParams
import com.telnyx.api.models.notificationchannels.NotificationChannelUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationChannelServiceImpl
internal constructor(private val clientOptions: ClientOptions) : NotificationChannelService {

    private val withRawResponse: NotificationChannelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationChannelService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NotificationChannelService =
        NotificationChannelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NotificationChannelCreateParams,
        requestOptions: RequestOptions,
    ): NotificationChannelCreateResponse =
        // post /notification_channels
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NotificationChannelRetrieveParams,
        requestOptions: RequestOptions,
    ): NotificationChannelRetrieveResponse =
        // get /notification_channels/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: NotificationChannelUpdateParams,
        requestOptions: RequestOptions,
    ): NotificationChannelUpdateResponse =
        // patch /notification_channels/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: NotificationChannelListParams,
        requestOptions: RequestOptions,
    ): NotificationChannelListResponse =
        // get /notification_channels
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: NotificationChannelDeleteParams,
        requestOptions: RequestOptions,
    ): NotificationChannelDeleteResponse =
        // delete /notification_channels/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationChannelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationChannelService.WithRawResponse =
            NotificationChannelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NotificationChannelCreateResponse> =
            jsonHandler<NotificationChannelCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NotificationChannelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationChannelCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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

        private val retrieveHandler: Handler<NotificationChannelRetrieveResponse> =
            jsonHandler<NotificationChannelRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NotificationChannelRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationChannelRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels", params._pathParam(0))
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

        private val updateHandler: Handler<NotificationChannelUpdateResponse> =
            jsonHandler<NotificationChannelUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NotificationChannelUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationChannelUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels", params._pathParam(0))
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

        private val listHandler: Handler<NotificationChannelListResponse> =
            jsonHandler<NotificationChannelListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationChannelListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationChannelListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels")
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

        private val deleteHandler: Handler<NotificationChannelDeleteResponse> =
            jsonHandler<NotificationChannelDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NotificationChannelDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationChannelDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_channels", params._pathParam(0))
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
