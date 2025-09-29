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
import com.telnyx.api.models.ips.IpCreateParams
import com.telnyx.api.models.ips.IpCreateResponse
import com.telnyx.api.models.ips.IpDeleteParams
import com.telnyx.api.models.ips.IpDeleteResponse
import com.telnyx.api.models.ips.IpListParams
import com.telnyx.api.models.ips.IpListResponse
import com.telnyx.api.models.ips.IpRetrieveParams
import com.telnyx.api.models.ips.IpRetrieveResponse
import com.telnyx.api.models.ips.IpUpdateParams
import com.telnyx.api.models.ips.IpUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IpServiceImpl internal constructor(private val clientOptions: ClientOptions) : IpService {

    private val withRawResponse: IpService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IpService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpService =
        IpServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: IpCreateParams, requestOptions: RequestOptions): IpCreateResponse =
        // post /ips
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: IpRetrieveParams,
        requestOptions: RequestOptions,
    ): IpRetrieveResponse =
        // get /ips/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: IpUpdateParams, requestOptions: RequestOptions): IpUpdateResponse =
        // patch /ips/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: IpListParams, requestOptions: RequestOptions): IpListResponse =
        // get /ips
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IpDeleteParams, requestOptions: RequestOptions): IpDeleteResponse =
        // delete /ips/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IpService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpService.WithRawResponse =
            IpServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<IpCreateResponse> =
            jsonHandler<IpCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IpCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ips")
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

        private val retrieveHandler: Handler<IpRetrieveResponse> =
            jsonHandler<IpRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IpRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ips", params._pathParam(0))
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

        private val updateHandler: Handler<IpUpdateResponse> =
            jsonHandler<IpUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: IpUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ips", params._pathParam(0))
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

        private val listHandler: Handler<IpListResponse> =
            jsonHandler<IpListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IpListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ips")
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

        private val deleteHandler: Handler<IpDeleteResponse> =
            jsonHandler<IpDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: IpDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ips", params._pathParam(0))
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
