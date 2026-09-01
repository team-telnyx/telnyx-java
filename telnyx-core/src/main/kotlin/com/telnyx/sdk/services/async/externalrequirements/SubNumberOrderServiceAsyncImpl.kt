// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalrequirements

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
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderRetrieveResponse
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateParams
import com.telnyx.sdk.models.externalrequirements.subnumberorders.SubNumberOrderUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Requirement Groups */
class SubNumberOrderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SubNumberOrderServiceAsync {

    private val withRawResponse: SubNumberOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubNumberOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SubNumberOrderServiceAsync =
        SubNumberOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SubNumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrderRetrieveResponse> =
        // get
        // /external_requirements/{regulatory_requirement_id}/sub_number_orders/{sub_number_order_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SubNumberOrderUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubNumberOrderUpdateResponse> =
        // post
        // /external_requirements/{regulatory_requirement_id}/sub_number_orders/{sub_number_order_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubNumberOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubNumberOrderServiceAsync.WithRawResponse =
            SubNumberOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SubNumberOrderRetrieveResponse> =
            jsonHandler<SubNumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubNumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrderRetrieveResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<SubNumberOrderUpdateResponse> =
            jsonHandler<SubNumberOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SubNumberOrderUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubNumberOrderUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
