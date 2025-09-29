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
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateParams
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressCreateResponse
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteParams
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressDeleteResponse
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressListParams
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressListResponse
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveParams
import com.telnyx.api.models.dynamicemergencyaddresses.DynamicEmergencyAddressRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DynamicEmergencyAddressServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DynamicEmergencyAddressService {

    private val withRawResponse: DynamicEmergencyAddressService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DynamicEmergencyAddressService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DynamicEmergencyAddressService =
        DynamicEmergencyAddressServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: DynamicEmergencyAddressCreateParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyAddressCreateResponse =
        // post /dynamic_emergency_addresses
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DynamicEmergencyAddressRetrieveParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyAddressRetrieveResponse =
        // get /dynamic_emergency_addresses/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DynamicEmergencyAddressListParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyAddressListResponse =
        // get /dynamic_emergency_addresses
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DynamicEmergencyAddressDeleteParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyAddressDeleteResponse =
        // delete /dynamic_emergency_addresses/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DynamicEmergencyAddressService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DynamicEmergencyAddressService.WithRawResponse =
            DynamicEmergencyAddressServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DynamicEmergencyAddressCreateResponse> =
            jsonHandler<DynamicEmergencyAddressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DynamicEmergencyAddressCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyAddressCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses")
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

        private val retrieveHandler: Handler<DynamicEmergencyAddressRetrieveResponse> =
            jsonHandler<DynamicEmergencyAddressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DynamicEmergencyAddressRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyAddressRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses", params._pathParam(0))
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

        private val listHandler: Handler<DynamicEmergencyAddressListResponse> =
            jsonHandler<DynamicEmergencyAddressListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DynamicEmergencyAddressListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyAddressListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses")
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

        private val deleteHandler: Handler<DynamicEmergencyAddressDeleteResponse> =
            jsonHandler<DynamicEmergencyAddressDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DynamicEmergencyAddressDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyAddressDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_addresses", params._pathParam(0))
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
