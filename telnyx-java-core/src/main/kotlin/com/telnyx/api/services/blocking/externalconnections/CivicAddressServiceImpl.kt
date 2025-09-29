// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.externalconnections

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
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.externalconnections.civicaddresses.CivicAddressListParams
import com.telnyx.api.models.externalconnections.civicaddresses.CivicAddressListResponse
import com.telnyx.api.models.externalconnections.civicaddresses.CivicAddressRetrieveParams
import com.telnyx.api.models.externalconnections.civicaddresses.CivicAddressRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CivicAddressServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CivicAddressService {

    private val withRawResponse: CivicAddressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CivicAddressService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CivicAddressService =
        CivicAddressServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CivicAddressRetrieveParams,
        requestOptions: RequestOptions,
    ): CivicAddressRetrieveResponse =
        // get /external_connections/{id}/civic_addresses/{address_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CivicAddressListParams,
        requestOptions: RequestOptions,
    ): CivicAddressListResponse =
        // get /external_connections/{id}/civic_addresses
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CivicAddressService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CivicAddressService.WithRawResponse =
            CivicAddressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CivicAddressRetrieveResponse> =
            jsonHandler<CivicAddressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CivicAddressRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CivicAddressRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("addressId", params.addressId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_connections",
                        params._pathParam(0),
                        "civic_addresses",
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

        private val listHandler: Handler<CivicAddressListResponse> =
            jsonHandler<CivicAddressListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CivicAddressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CivicAddressListResponse> {
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
                        "civic_addresses",
                    )
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
    }
}
