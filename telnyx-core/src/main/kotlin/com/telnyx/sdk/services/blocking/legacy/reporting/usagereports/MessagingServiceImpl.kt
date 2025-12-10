// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.usagereports

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
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingCreateParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingCreateResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingDeleteParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingDeleteResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingListParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingListResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.MessagingRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessagingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessagingService {

    private val withRawResponse: MessagingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessagingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingService =
        MessagingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MessagingCreateParams,
        requestOptions: RequestOptions,
    ): MessagingCreateResponse =
        // post /legacy/reporting/usage_reports/messaging
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MessagingRetrieveParams,
        requestOptions: RequestOptions,
    ): MessagingRetrieveResponse =
        // get /legacy/reporting/usage_reports/messaging/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MessagingListParams,
        requestOptions: RequestOptions,
    ): MessagingListResponse =
        // get /legacy/reporting/usage_reports/messaging
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MessagingDeleteParams,
        requestOptions: RequestOptions,
    ): MessagingDeleteResponse =
        // delete /legacy/reporting/usage_reports/messaging/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessagingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingService.WithRawResponse =
            MessagingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MessagingCreateResponse> =
            jsonHandler<MessagingCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MessagingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "messaging")
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

        private val retrieveHandler: Handler<MessagingRetrieveResponse> =
            jsonHandler<MessagingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessagingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "usage_reports",
                        "messaging",
                        params._pathParam(0),
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

        private val listHandler: Handler<MessagingListResponse> =
            jsonHandler<MessagingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessagingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "messaging")
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

        private val deleteHandler: Handler<MessagingDeleteResponse> =
            jsonHandler<MessagingDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MessagingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "usage_reports",
                        "messaging",
                        params._pathParam(0),
                    )
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
