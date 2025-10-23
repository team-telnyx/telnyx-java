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
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionCreateParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionCreateResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionDeleteParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionDeleteResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionListParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionListResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionRetrieveParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionRetrieveResponse
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionUpdateParams
import com.telnyx.sdk.models.fqdnconnections.FqdnConnectionUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FqdnConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FqdnConnectionService {

    private val withRawResponse: FqdnConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FqdnConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnConnectionService =
        FqdnConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FqdnConnectionCreateParams,
        requestOptions: RequestOptions,
    ): FqdnConnectionCreateResponse =
        // post /fqdn_connections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FqdnConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): FqdnConnectionRetrieveResponse =
        // get /fqdn_connections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FqdnConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): FqdnConnectionUpdateResponse =
        // patch /fqdn_connections/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: FqdnConnectionListParams,
        requestOptions: RequestOptions,
    ): FqdnConnectionListResponse =
        // get /fqdn_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: FqdnConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): FqdnConnectionDeleteResponse =
        // delete /fqdn_connections/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FqdnConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FqdnConnectionService.WithRawResponse =
            FqdnConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FqdnConnectionCreateResponse> =
            jsonHandler<FqdnConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FqdnConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdn_connections")
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

        private val retrieveHandler: Handler<FqdnConnectionRetrieveResponse> =
            jsonHandler<FqdnConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FqdnConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdn_connections", params._pathParam(0))
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

        private val updateHandler: Handler<FqdnConnectionUpdateResponse> =
            jsonHandler<FqdnConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FqdnConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdn_connections", params._pathParam(0))
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

        private val listHandler: Handler<FqdnConnectionListResponse> =
            jsonHandler<FqdnConnectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FqdnConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdn_connections")
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

        private val deleteHandler: Handler<FqdnConnectionDeleteResponse> =
            jsonHandler<FqdnConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FqdnConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FqdnConnectionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdn_connections", params._pathParam(0))
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
