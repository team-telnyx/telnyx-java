// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.payment

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
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
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefListParams
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefListResponse
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateParams
import com.telnyx.sdk.models.payment.autorechargeprefs.AutoRechargePrefUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AutoRechargePrefServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AutoRechargePrefServiceAsync {

    private val withRawResponse: AutoRechargePrefServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AutoRechargePrefServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AutoRechargePrefServiceAsync =
        AutoRechargePrefServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: AutoRechargePrefUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutoRechargePrefUpdateResponse> =
        // patch /payment/auto_recharge_prefs
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AutoRechargePrefListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutoRechargePrefListResponse> =
        // get /payment/auto_recharge_prefs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutoRechargePrefServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutoRechargePrefServiceAsync.WithRawResponse =
            AutoRechargePrefServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<AutoRechargePrefUpdateResponse> =
            jsonHandler<AutoRechargePrefUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AutoRechargePrefUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefUpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payment", "auto_recharge_prefs")
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

        private val listHandler: Handler<AutoRechargePrefListResponse> =
            jsonHandler<AutoRechargePrefListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AutoRechargePrefListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutoRechargePrefListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("payment", "auto_recharge_prefs")
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
