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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.requirementtypes.RequirementTypeListParams
import com.telnyx.sdk.models.requirementtypes.RequirementTypeListResponse
import com.telnyx.sdk.models.requirementtypes.RequirementTypeRetrieveParams
import com.telnyx.sdk.models.requirementtypes.RequirementTypeRetrieveResponse
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
