// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListPageAsync
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListPageResponse
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionListParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveParams
import com.telnyx.sdk.models.bulksimcardactions.BulkSimCardActionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** View SIM card actions, their progress and timestamps using the SIM Card Actions API */
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
    ): CompletableFuture<BulkSimCardActionListPageAsync> =
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

        private val listHandler: Handler<BulkSimCardActionListPageResponse> =
            jsonHandler<BulkSimCardActionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BulkSimCardActionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkSimCardActionListPageAsync>> {
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
                            .let {
                                BulkSimCardActionListPageAsync.builder()
                                    .service(BulkSimCardActionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
