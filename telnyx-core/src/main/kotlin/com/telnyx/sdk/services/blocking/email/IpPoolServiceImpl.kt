// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email

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
import com.telnyx.sdk.models.email.ippools.IpPoolCreateParams
import com.telnyx.sdk.models.email.ippools.IpPoolDeleteParams
import com.telnyx.sdk.models.email.ippools.IpPoolListParams
import com.telnyx.sdk.models.email.ippools.IpPoolListResponse
import com.telnyx.sdk.models.email.ippools.IpPoolRetrieveParams
import com.telnyx.sdk.models.email.ippools.IpPoolShowResponse
import com.telnyx.sdk.models.email.ippools.IpPoolUpdateParams
import com.telnyx.sdk.services.blocking.email.ippools.IpService
import com.telnyx.sdk.services.blocking.email.ippools.IpServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Group dedicated IPs into pools for sending. */
class IpPoolServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IpPoolService {

    private val withRawResponse: IpPoolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ips: IpService by lazy { IpServiceImpl(clientOptions) }

    override fun withRawResponse(): IpPoolService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IpPoolService =
        IpPoolServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Group dedicated IPs into pools for sending. */
    override fun ips(): IpService = ips

    override fun create(
        params: IpPoolCreateParams,
        requestOptions: RequestOptions,
    ): IpPoolShowResponse =
        // post /email/ip_pools
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: IpPoolRetrieveParams,
        requestOptions: RequestOptions,
    ): IpPoolShowResponse =
        // get /email/ip_pools/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: IpPoolUpdateParams,
        requestOptions: RequestOptions,
    ): IpPoolShowResponse =
        // patch /email/ip_pools/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: IpPoolListParams,
        requestOptions: RequestOptions,
    ): IpPoolListResponse =
        // get /email/ip_pools
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IpPoolDeleteParams, requestOptions: RequestOptions) {
        // delete /email/ip_pools/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IpPoolService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val ips: IpService.WithRawResponse by lazy {
            IpServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IpPoolService.WithRawResponse =
            IpPoolServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Group dedicated IPs into pools for sending. */
        override fun ips(): IpService.WithRawResponse = ips

        private val createHandler: Handler<IpPoolShowResponse> =
            jsonHandler<IpPoolShowResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IpPoolCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpPoolShowResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools")
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

        private val retrieveHandler: Handler<IpPoolShowResponse> =
            jsonHandler<IpPoolShowResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: IpPoolRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpPoolShowResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools", params._pathParam(0))
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

        private val updateHandler: Handler<IpPoolShowResponse> =
            jsonHandler<IpPoolShowResponse>(clientOptions.jsonMapper)

        override fun update(
            params: IpPoolUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpPoolShowResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools", params._pathParam(0))
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

        private val listHandler: Handler<IpPoolListResponse> =
            jsonHandler<IpPoolListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IpPoolListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IpPoolListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: IpPoolDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email", "ip_pools", params._pathParam(0))
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
