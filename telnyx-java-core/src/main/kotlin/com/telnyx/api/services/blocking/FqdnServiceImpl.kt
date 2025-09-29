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
import com.telnyx.api.models.fqdns.FqdnCreateParams
import com.telnyx.api.models.fqdns.FqdnCreateResponse
import com.telnyx.api.models.fqdns.FqdnDeleteParams
import com.telnyx.api.models.fqdns.FqdnDeleteResponse
import com.telnyx.api.models.fqdns.FqdnListParams
import com.telnyx.api.models.fqdns.FqdnListResponse
import com.telnyx.api.models.fqdns.FqdnRetrieveParams
import com.telnyx.api.models.fqdns.FqdnRetrieveResponse
import com.telnyx.api.models.fqdns.FqdnUpdateParams
import com.telnyx.api.models.fqdns.FqdnUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FqdnServiceImpl internal constructor(private val clientOptions: ClientOptions) : FqdnService {

    private val withRawResponse: FqdnService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FqdnService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnService =
        FqdnServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FqdnCreateParams,
        requestOptions: RequestOptions,
    ): FqdnCreateResponse =
        // post /fqdns
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FqdnRetrieveParams,
        requestOptions: RequestOptions,
    ): FqdnRetrieveResponse =
        // get /fqdns/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FqdnUpdateParams,
        requestOptions: RequestOptions,
    ): FqdnUpdateResponse =
        // patch /fqdns/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: FqdnListParams, requestOptions: RequestOptions): FqdnListResponse =
        // get /fqdns
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: FqdnDeleteParams,
        requestOptions: RequestOptions,
    ): FqdnDeleteResponse =
        // delete /fqdns/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FqdnService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FqdnService.WithRawResponse =
            FqdnServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FqdnCreateResponse> =
            jsonHandler<FqdnCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FqdnCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns")
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

        private val retrieveHandler: Handler<FqdnRetrieveResponse> =
            jsonHandler<FqdnRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FqdnRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns", params._pathParam(0))
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

        private val updateHandler: Handler<FqdnUpdateResponse> =
            jsonHandler<FqdnUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FqdnUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns", params._pathParam(0))
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

        private val listHandler: Handler<FqdnListResponse> =
            jsonHandler<FqdnListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FqdnListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns")
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

        private val deleteHandler: Handler<FqdnDeleteResponse> =
            jsonHandler<FqdnDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FqdnDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns", params._pathParam(0))
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
