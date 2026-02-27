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
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressCreateParams
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressDeleteParams
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressListPage
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressListPageResponse
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressListParams
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressResponse
import com.telnyx.sdk.models.accessipaddress.AccessIpAddressRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** IP Address Operations */
class AccessIpAddressServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessIpAddressService {

    private val withRawResponse: AccessIpAddressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccessIpAddressService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessIpAddressService =
        AccessIpAddressServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AccessIpAddressCreateParams,
        requestOptions: RequestOptions,
    ): AccessIpAddressResponse =
        // post /access_ip_address
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccessIpAddressRetrieveParams,
        requestOptions: RequestOptions,
    ): AccessIpAddressResponse =
        // get /access_ip_address/{access_ip_address_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AccessIpAddressListParams,
        requestOptions: RequestOptions,
    ): AccessIpAddressListPage =
        // get /access_ip_address
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AccessIpAddressDeleteParams,
        requestOptions: RequestOptions,
    ): AccessIpAddressResponse =
        // delete /access_ip_address/{access_ip_address_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccessIpAddressService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessIpAddressService.WithRawResponse =
            AccessIpAddressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AccessIpAddressResponse> =
            jsonHandler<AccessIpAddressResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AccessIpAddressCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpAddressResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_address")
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

        private val retrieveHandler: Handler<AccessIpAddressResponse> =
            jsonHandler<AccessIpAddressResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AccessIpAddressRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpAddressResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accessIpAddressId", params.accessIpAddressId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_address", params._pathParam(0))
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

        private val listHandler: Handler<AccessIpAddressListPageResponse> =
            jsonHandler<AccessIpAddressListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccessIpAddressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpAddressListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_address")
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
                        AccessIpAddressListPage.builder()
                            .service(AccessIpAddressServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<AccessIpAddressResponse> =
            jsonHandler<AccessIpAddressResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AccessIpAddressDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpAddressResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accessIpAddressId", params.accessIpAddressId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_address", params._pathParam(0))
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
