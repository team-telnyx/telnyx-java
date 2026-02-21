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
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateResponse
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdDeleteParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdDeleteResponse
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdListPage
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdListPageResponse
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdListParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdRetrieveParams
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AlphanumericSenderIdServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AlphanumericSenderIdService {

    private val withRawResponse: AlphanumericSenderIdService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AlphanumericSenderIdService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AlphanumericSenderIdService =
        AlphanumericSenderIdServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AlphanumericSenderIdCreateParams,
        requestOptions: RequestOptions,
    ): AlphanumericSenderIdCreateResponse =
        // post /alphanumeric_sender_ids
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AlphanumericSenderIdRetrieveParams,
        requestOptions: RequestOptions,
    ): AlphanumericSenderIdRetrieveResponse =
        // get /alphanumeric_sender_ids/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AlphanumericSenderIdListParams,
        requestOptions: RequestOptions,
    ): AlphanumericSenderIdListPage =
        // get /alphanumeric_sender_ids
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AlphanumericSenderIdDeleteParams,
        requestOptions: RequestOptions,
    ): AlphanumericSenderIdDeleteResponse =
        // delete /alphanumeric_sender_ids/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AlphanumericSenderIdService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AlphanumericSenderIdService.WithRawResponse =
            AlphanumericSenderIdServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AlphanumericSenderIdCreateResponse> =
            jsonHandler<AlphanumericSenderIdCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AlphanumericSenderIdCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlphanumericSenderIdCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alphanumeric_sender_ids")
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

        private val retrieveHandler: Handler<AlphanumericSenderIdRetrieveResponse> =
            jsonHandler<AlphanumericSenderIdRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AlphanumericSenderIdRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlphanumericSenderIdRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alphanumeric_sender_ids", params._pathParam(0))
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

        private val listHandler: Handler<AlphanumericSenderIdListPageResponse> =
            jsonHandler<AlphanumericSenderIdListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AlphanumericSenderIdListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlphanumericSenderIdListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alphanumeric_sender_ids")
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
                        AlphanumericSenderIdListPage.builder()
                            .service(AlphanumericSenderIdServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<AlphanumericSenderIdDeleteResponse> =
            jsonHandler<AlphanumericSenderIdDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AlphanumericSenderIdDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AlphanumericSenderIdDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("alphanumeric_sender_ids", params._pathParam(0))
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
