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
import com.telnyx.sdk.models.notificationsettings.NotificationSettingCreateParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingCreateResponse
import com.telnyx.sdk.models.notificationsettings.NotificationSettingDeleteParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingDeleteResponse
import com.telnyx.sdk.models.notificationsettings.NotificationSettingListPage
import com.telnyx.sdk.models.notificationsettings.NotificationSettingListPageResponse
import com.telnyx.sdk.models.notificationsettings.NotificationSettingListParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingRetrieveParams
import com.telnyx.sdk.models.notificationsettings.NotificationSettingRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Notification settings operations */
class NotificationSettingServiceImpl
internal constructor(private val clientOptions: ClientOptions) : NotificationSettingService {

    private val withRawResponse: NotificationSettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationSettingService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NotificationSettingService =
        NotificationSettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NotificationSettingCreateParams,
        requestOptions: RequestOptions,
    ): NotificationSettingCreateResponse =
        // post /notification_settings
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NotificationSettingRetrieveParams,
        requestOptions: RequestOptions,
    ): NotificationSettingRetrieveResponse =
        // get /notification_settings/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: NotificationSettingListParams,
        requestOptions: RequestOptions,
    ): NotificationSettingListPage =
        // get /notification_settings
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: NotificationSettingDeleteParams,
        requestOptions: RequestOptions,
    ): NotificationSettingDeleteResponse =
        // delete /notification_settings/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationSettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationSettingService.WithRawResponse =
            NotificationSettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NotificationSettingCreateResponse> =
            jsonHandler<NotificationSettingCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NotificationSettingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationSettingCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_settings")
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

        private val retrieveHandler: Handler<NotificationSettingRetrieveResponse> =
            jsonHandler<NotificationSettingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NotificationSettingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationSettingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_settings", params._pathParam(0))
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

        private val listHandler: Handler<NotificationSettingListPageResponse> =
            jsonHandler<NotificationSettingListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationSettingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationSettingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_settings")
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
                        NotificationSettingListPage.builder()
                            .service(NotificationSettingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<NotificationSettingDeleteResponse> =
            jsonHandler<NotificationSettingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NotificationSettingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationSettingDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_settings", params._pathParam(0))
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
