// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalrequirements

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
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveResponse
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Requirement Groups */
class SubNumberOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubNumberOrderService {

    private val withRawResponse: SubNumberOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubNumberOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubNumberOrderService =
        SubNumberOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SubNumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): SubNumberOrderRetrieveResponse =
        // get
        // /external_requirements/{regulatory_requirement_id}/sub_number_orders/{sub_number_order_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SubNumberOrderUpdateParams,
        requestOptions: RequestOptions,
    ): SubNumberOrderUpdateResponse =
        // post
        // /external_requirements/{regulatory_requirement_id}/sub_number_orders/{sub_number_order_id}
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubNumberOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubNumberOrderService.WithRawResponse =
            SubNumberOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SubNumberOrderRetrieveResponse> =
            jsonHandler<SubNumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubNumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subNumberOrderId", params.subNumberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_requirements",
                        params._pathParam(0),
                        "sub_number_orders",
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

        private val updateHandler: Handler<SubNumberOrderUpdateResponse> =
            jsonHandler<SubNumberOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SubNumberOrderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subNumberOrderId", params.subNumberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "external_requirements",
                        params._pathParam(0),
                        "sub_number_orders",
                        params._pathParam(1),
                    )
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
    }
}
