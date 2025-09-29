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
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.requirementtypes.RequirementTypeListParams
import com.telnyx.api.models.requirementtypes.RequirementTypeListResponse
import com.telnyx.api.models.requirementtypes.RequirementTypeRetrieveParams
import com.telnyx.api.models.requirementtypes.RequirementTypeRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RequirementTypeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RequirementTypeService {

    private val withRawResponse: RequirementTypeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RequirementTypeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementTypeService =
        RequirementTypeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RequirementTypeRetrieveParams,
        requestOptions: RequestOptions,
    ): RequirementTypeRetrieveResponse =
        // get /requirement_types/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RequirementTypeListParams,
        requestOptions: RequestOptions,
    ): RequirementTypeListResponse =
        // get /requirement_types
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RequirementTypeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequirementTypeService.WithRawResponse =
            RequirementTypeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RequirementTypeRetrieveResponse> =
            jsonHandler<RequirementTypeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RequirementTypeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementTypeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_types", params._pathParam(0))
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

        private val listHandler: Handler<RequirementTypeListResponse> =
            jsonHandler<RequirementTypeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RequirementTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementTypeListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_types")
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
