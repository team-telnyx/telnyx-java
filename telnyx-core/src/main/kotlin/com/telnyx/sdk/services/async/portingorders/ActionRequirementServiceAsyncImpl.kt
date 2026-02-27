// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementInitiateResponse
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementListPageAsync
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementListPageResponse
import com.telnyx.sdk.models.portingorders.actionrequirements.ActionRequirementListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Endpoints related to porting orders management. */
class ActionRequirementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ActionRequirementServiceAsync {

    private val withRawResponse: ActionRequirementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionRequirementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ActionRequirementServiceAsync =
        ActionRequirementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ActionRequirementListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRequirementListPageAsync> =
        // get /porting_orders/{porting_order_id}/action_requirements
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun initiate(
        params: ActionRequirementInitiateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRequirementInitiateResponse> =
        // post /porting_orders/{porting_order_id}/action_requirements/{id}/initiate
        withRawResponse().initiate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionRequirementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionRequirementServiceAsync.WithRawResponse =
            ActionRequirementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ActionRequirementListPageResponse> =
            jsonHandler<ActionRequirementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ActionRequirementListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRequirementListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "action_requirements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ActionRequirementListPageAsync.builder()
                                    .service(ActionRequirementServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val initiateHandler: Handler<ActionRequirementInitiateResponse> =
            jsonHandler<ActionRequirementInitiateResponse>(clientOptions.jsonMapper)

        override fun initiate(
            params: ActionRequirementInitiateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRequirementInitiateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
