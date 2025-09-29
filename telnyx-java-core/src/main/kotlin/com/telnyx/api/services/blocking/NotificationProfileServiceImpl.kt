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
import com.telnyx.api.models.notificationprofiles.NotificationProfileCreateParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileCreateResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileDeleteParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileDeleteResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileListParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileListResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileRetrieveParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileRetrieveResponse
import com.telnyx.api.models.notificationprofiles.NotificationProfileUpdateParams
import com.telnyx.api.models.notificationprofiles.NotificationProfileUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NotificationProfileServiceImpl
internal constructor(private val clientOptions: ClientOptions) : NotificationProfileService {

    private val withRawResponse: NotificationProfileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotificationProfileService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NotificationProfileService =
        NotificationProfileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NotificationProfileCreateParams,
        requestOptions: RequestOptions,
    ): NotificationProfileCreateResponse =
        // post /notification_profiles
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NotificationProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): NotificationProfileRetrieveResponse =
        // get /notification_profiles/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: NotificationProfileUpdateParams,
        requestOptions: RequestOptions,
    ): NotificationProfileUpdateResponse =
        // patch /notification_profiles/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: NotificationProfileListParams,
        requestOptions: RequestOptions,
    ): NotificationProfileListResponse =
        // get /notification_profiles
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: NotificationProfileDeleteParams,
        requestOptions: RequestOptions,
    ): NotificationProfileDeleteResponse =
        // delete /notification_profiles/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationProfileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationProfileService.WithRawResponse =
            NotificationProfileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NotificationProfileCreateResponse> =
            jsonHandler<NotificationProfileCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NotificationProfileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationProfileCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles")
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

        private val retrieveHandler: Handler<NotificationProfileRetrieveResponse> =
            jsonHandler<NotificationProfileRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NotificationProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationProfileRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles", params._pathParam(0))
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

        private val updateHandler: Handler<NotificationProfileUpdateResponse> =
            jsonHandler<NotificationProfileUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NotificationProfileUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationProfileUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles", params._pathParam(0))
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

        private val listHandler: Handler<NotificationProfileListResponse> =
            jsonHandler<NotificationProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NotificationProfileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationProfileListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles")
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

        private val deleteHandler: Handler<NotificationProfileDeleteResponse> =
            jsonHandler<NotificationProfileDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NotificationProfileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationProfileDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("notification_profiles", params._pathParam(0))
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
