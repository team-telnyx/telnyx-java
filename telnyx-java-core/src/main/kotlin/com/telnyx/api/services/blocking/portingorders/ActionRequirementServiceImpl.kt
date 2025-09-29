// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

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
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementInitiateResponse
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementListParams
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionRequirementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionRequirementService {

    private val withRawResponse: ActionRequirementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionRequirementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionRequirementService =
        ActionRequirementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ActionRequirementListParams,
        requestOptions: RequestOptions,
    ): ActionRequirementListResponse =
        // get /porting_orders/{porting_order_id}/action_requirements
        withRawResponse().list(params, requestOptions).parse()

    override fun initiate(
        params: ActionRequirementInitiateParams,
        requestOptions: RequestOptions,
    ): ActionRequirementInitiateResponse =
        // post /porting_orders/{porting_order_id}/action_requirements/{id}/initiate
        withRawResponse().initiate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionRequirementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionRequirementService.WithRawResponse =
            ActionRequirementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ActionRequirementListResponse> =
            jsonHandler<ActionRequirementListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ActionRequirementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRequirementListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "action_requirements")
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

        private val initiateHandler: Handler<ActionRequirementInitiateResponse> =
            jsonHandler<ActionRequirementInitiateResponse>(clientOptions.jsonMapper)

        override fun initiate(
            params: ActionRequirementInitiateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRequirementInitiateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "action_requirements",
                        params._pathParam(1),
                        "initiate",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initiateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
