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
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointCreateResponse
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointDeleteResponse
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointListResponse
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveParams
import com.telnyx.api.models.dynamicemergencyendpoints.DynamicEmergencyEndpointRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DynamicEmergencyEndpointServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DynamicEmergencyEndpointService {

    private val withRawResponse: DynamicEmergencyEndpointService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DynamicEmergencyEndpointService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DynamicEmergencyEndpointService =
        DynamicEmergencyEndpointServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: DynamicEmergencyEndpointCreateParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyEndpointCreateResponse =
        // post /dynamic_emergency_endpoints
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DynamicEmergencyEndpointRetrieveParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyEndpointRetrieveResponse =
        // get /dynamic_emergency_endpoints/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DynamicEmergencyEndpointListParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyEndpointListResponse =
        // get /dynamic_emergency_endpoints
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DynamicEmergencyEndpointDeleteParams,
        requestOptions: RequestOptions,
    ): DynamicEmergencyEndpointDeleteResponse =
        // delete /dynamic_emergency_endpoints/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DynamicEmergencyEndpointService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DynamicEmergencyEndpointService.WithRawResponse =
            DynamicEmergencyEndpointServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DynamicEmergencyEndpointCreateResponse> =
            jsonHandler<DynamicEmergencyEndpointCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DynamicEmergencyEndpointCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyEndpointCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints")
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

        private val retrieveHandler: Handler<DynamicEmergencyEndpointRetrieveResponse> =
            jsonHandler<DynamicEmergencyEndpointRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DynamicEmergencyEndpointRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyEndpointRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints", params._pathParam(0))
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

        private val listHandler: Handler<DynamicEmergencyEndpointListResponse> =
            jsonHandler<DynamicEmergencyEndpointListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DynamicEmergencyEndpointListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyEndpointListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints")
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

        private val deleteHandler: Handler<DynamicEmergencyEndpointDeleteResponse> =
            jsonHandler<DynamicEmergencyEndpointDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DynamicEmergencyEndpointDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DynamicEmergencyEndpointDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dynamic_emergency_endpoints", params._pathParam(0))
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
