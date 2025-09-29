// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionListParams
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionListResponse
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionRetrieveParams
import com.telnyx.api.models.bulksimcardactions.BulkSimCardActionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BulkSimCardActionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BulkSimCardActionServiceAsync {

    private val withRawResponse: BulkSimCardActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkSimCardActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BulkSimCardActionServiceAsync =
        BulkSimCardActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BulkSimCardActionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkSimCardActionRetrieveResponse> =
        // get /bulk_sim_card_actions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BulkSimCardActionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkSimCardActionListResponse> =
        // get /bulk_sim_card_actions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkSimCardActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkSimCardActionServiceAsync.WithRawResponse =
            BulkSimCardActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BulkSimCardActionRetrieveResponse> =
            jsonHandler<BulkSimCardActionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BulkSimCardActionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk_sim_card_actions", params._pathParam(0))
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

        private val listHandler: Handler<BulkSimCardActionListResponse> =
            jsonHandler<BulkSimCardActionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BulkSimCardActionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bulk_sim_card_actions")
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
                    }
                }
        }
    }
}
