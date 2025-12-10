// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

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
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadListParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadListResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadPendingCountParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadPendingCountResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRefreshStatusParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRefreshStatusResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UploadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UploadService {

    private val withRawResponse: UploadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UploadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService =
        UploadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions,
    ): UploadCreateResponse =
        // post /external_connections/{id}/uploads
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: UploadRetrieveParams,
        requestOptions: RequestOptions,
    ): UploadRetrieveResponse =
        // get /external_connections/{id}/uploads/{ticket_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: UploadListParams,
        requestOptions: RequestOptions,
    ): UploadListResponse =
        // get /external_connections/{id}/uploads
        withRawResponse().list(params, requestOptions).parse()

    override fun pendingCount(
        params: UploadPendingCountParams,
        requestOptions: RequestOptions,
    ): UploadPendingCountResponse =
        // get /external_connections/{id}/uploads/status
        withRawResponse().pendingCount(params, requestOptions).parse()

    override fun refreshStatus(
        params: UploadRefreshStatusParams,
        requestOptions: RequestOptions,
    ): UploadRefreshStatusResponse =
        // post /external_connections/{id}/uploads/refresh
        withRawResponse().refreshStatus(params, requestOptions).parse()

    override fun retry(
        params: UploadRetryParams,
        requestOptions: RequestOptions,
    ): UploadRetryResponse =
        // post /external_connections/{id}/uploads/{ticket_id}/retry
        withRawResponse().retry(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UploadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UploadService.WithRawResponse =
            UploadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UploadCreateResponse> =
            jsonHandler<UploadCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0), "uploads")
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

        private val retrieveHandler: Handler<UploadRetrieveResponse> =
            jsonHandler<UploadRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UploadRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ticketId", params.ticketId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "uploads",
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

        private val listHandler: Handler<UploadListResponse> =
            jsonHandler<UploadListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UploadListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", params._pathParam(0), "uploads")
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

        private val pendingCountHandler: Handler<UploadPendingCountResponse> =
            jsonHandler<UploadPendingCountResponse>(clientOptions.jsonMapper)

        override fun pendingCount(
            params: UploadPendingCountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadPendingCountResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "uploads",
                        "status",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { pendingCountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val refreshStatusHandler: Handler<UploadRefreshStatusResponse> =
            jsonHandler<UploadRefreshStatusResponse>(clientOptions.jsonMapper)

        override fun refreshStatus(
            params: UploadRefreshStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadRefreshStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "uploads",
                        "refresh",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { refreshStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retryHandler: Handler<UploadRetryResponse> =
            jsonHandler<UploadRetryResponse>(clientOptions.jsonMapper)

        override fun retry(
            params: UploadRetryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadRetryResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("ticketId", params.ticketId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "uploads",
                        params._pathParam(1),
                        "retry",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
