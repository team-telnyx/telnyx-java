// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises.reputation

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
import com.telnyx.sdk.models.enterprises.reputation.EnterpriseReputationPublicWrapped
import com.telnyx.sdk.models.enterprises.reputation.loa.LoaRenderParams
import com.telnyx.sdk.models.enterprises.reputation.loa.LoaUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Phone-number reputation monitoring (spam-score lookup and tracking). */
class LoaServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LoaServiceAsync {

    private val withRawResponse: LoaServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LoaServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoaServiceAsync =
        LoaServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: LoaUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseReputationPublicWrapped> =
        // patch /enterprises/{enterprise_id}/reputation/loa
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun render(
        params: LoaRenderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /enterprises/{enterprise_id}/reputation/loa
        withRawResponse().render(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LoaServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LoaServiceAsync.WithRawResponse =
            LoaServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<EnterpriseReputationPublicWrapped> =
            jsonHandler<EnterpriseReputationPublicWrapped>(clientOptions.jsonMapper)

        override fun update(
            params: LoaUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseReputationPublicWrapped>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation", "loa")
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

        override fun render(
            params: LoaRenderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "reputation", "loa")
                    .putHeader("Accept", "application/pdf")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
