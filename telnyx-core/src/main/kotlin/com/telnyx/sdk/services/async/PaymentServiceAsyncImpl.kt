// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionParams
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionResponse
import com.telnyx.sdk.services.async.payment.AutoRechargePrefServiceAsync
import com.telnyx.sdk.services.async.payment.AutoRechargePrefServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Operations for managing stored payment transactions. */
class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoRechargePrefs: AutoRechargePrefServiceAsync by lazy {
        AutoRechargePrefServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentServiceAsync =
        PaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** V2 Auto Recharge Preferences API */
    override fun autoRechargePrefs(): AutoRechargePrefServiceAsync = autoRechargePrefs

    override fun createStoredPaymentTransaction(
        params: PaymentCreateStoredPaymentTransactionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentCreateStoredPaymentTransactionResponse> =
        // post /v2/payment/stored_payment_transactions
        withRawResponse().createStoredPaymentTransaction(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val autoRechargePrefs: AutoRechargePrefServiceAsync.WithRawResponse by lazy {
            AutoRechargePrefServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentServiceAsync.WithRawResponse =
            PaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** V2 Auto Recharge Preferences API */
        override fun autoRechargePrefs(): AutoRechargePrefServiceAsync.WithRawResponse =
            autoRechargePrefs

        private val createStoredPaymentTransactionHandler:
            Handler<PaymentCreateStoredPaymentTransactionResponse> =
            jsonHandler<PaymentCreateStoredPaymentTransactionResponse>(clientOptions.jsonMapper)

        override fun createStoredPaymentTransaction(
            params: PaymentCreateStoredPaymentTransactionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentCreateStoredPaymentTransactionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "payment", "stored_payment_transactions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createStoredPaymentTransactionHandler.handle(it) }
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
