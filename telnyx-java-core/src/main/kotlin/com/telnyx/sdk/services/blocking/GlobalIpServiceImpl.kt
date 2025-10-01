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
import com.telnyx.sdk.models.globalips.GlobalIpCreateParams
import com.telnyx.sdk.models.globalips.GlobalIpCreateResponse
import com.telnyx.sdk.models.globalips.GlobalIpDeleteParams
import com.telnyx.sdk.models.globalips.GlobalIpDeleteResponse
import com.telnyx.sdk.models.globalips.GlobalIpListParams
import com.telnyx.sdk.models.globalips.GlobalIpListResponse
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveParams
import com.telnyx.sdk.models.globalips.GlobalIpRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GlobalIpServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GlobalIpService {

    private val withRawResponse: GlobalIpService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpService =
        GlobalIpServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GlobalIpCreateParams,
        requestOptions: RequestOptions,
    ): GlobalIpCreateResponse =
        // post /global_ips
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: GlobalIpRetrieveParams,
        requestOptions: RequestOptions,
    ): GlobalIpRetrieveResponse =
        // get /global_ips/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: GlobalIpListParams,
        requestOptions: RequestOptions,
    ): GlobalIpListResponse =
        // get /global_ips
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: GlobalIpDeleteParams,
        requestOptions: RequestOptions,
    ): GlobalIpDeleteResponse =
        // delete /global_ips/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpService.WithRawResponse =
            GlobalIpServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GlobalIpCreateResponse> =
            jsonHandler<GlobalIpCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GlobalIpCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips")
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

        private val retrieveHandler: Handler<GlobalIpRetrieveResponse> =
            jsonHandler<GlobalIpRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalIpRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips", params._pathParam(0))
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

        private val listHandler: Handler<GlobalIpListResponse> =
            jsonHandler<GlobalIpListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips")
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

        private val deleteHandler: Handler<GlobalIpDeleteResponse> =
            jsonHandler<GlobalIpDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: GlobalIpDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ips", params._pathParam(0))
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
