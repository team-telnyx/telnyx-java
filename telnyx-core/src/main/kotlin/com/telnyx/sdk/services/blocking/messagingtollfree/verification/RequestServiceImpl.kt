// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingtollfree.verification

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
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestCreateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestDeleteParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListPage
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListPageResponse
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestListParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestRetrieveParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.RequestUpdateParams
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestEgress
import com.telnyx.sdk.models.messagingtollfree.verification.requests.VerificationRequestStatus
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RequestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RequestService {

    private val withRawResponse: RequestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RequestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestService =
        RequestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RequestCreateParams,
        requestOptions: RequestOptions,
    ): VerificationRequestEgress =
        // post /messaging_tollfree/verification/requests
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RequestRetrieveParams,
        requestOptions: RequestOptions,
    ): VerificationRequestStatus =
        // get /messaging_tollfree/verification/requests/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RequestUpdateParams,
        requestOptions: RequestOptions,
    ): VerificationRequestEgress =
        // patch /messaging_tollfree/verification/requests/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: RequestListParams, requestOptions: RequestOptions): RequestListPage =
        // get /messaging_tollfree/verification/requests
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RequestDeleteParams, requestOptions: RequestOptions) {
        // delete /messaging_tollfree/verification/requests/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RequestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequestService.WithRawResponse =
            RequestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VerificationRequestEgress> =
            jsonHandler<VerificationRequestEgress>(clientOptions.jsonMapper)

        override fun create(
            params: RequestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRequestEgress> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_tollfree", "verification", "requests")
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

        private val retrieveHandler: Handler<VerificationRequestStatus> =
            jsonHandler<VerificationRequestStatus>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRequestStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_tollfree",
                        "verification",
                        "requests",
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

        private val updateHandler: Handler<VerificationRequestEgress> =
            jsonHandler<VerificationRequestEgress>(clientOptions.jsonMapper)

        override fun update(
            params: RequestUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationRequestEgress> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_tollfree",
                        "verification",
                        "requests",
                        params._pathParam(0),
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

        private val listHandler: Handler<RequestListPageResponse> =
            jsonHandler<RequestListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequestListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging_tollfree", "verification", "requests")
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
                        RequestListPage.builder()
                            .service(RequestServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: RequestDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging_tollfree",
                        "verification",
                        "requests",
                        params._pathParam(0),
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
