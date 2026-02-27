// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionParams
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionResponse
import com.telnyx.sdk.services.blocking.payment.AutoRechargePrefService
import com.telnyx.sdk.services.blocking.payment.AutoRechargePrefServiceImpl
import java.util.function.Consumer

/** Operations for managing stored payment transactions. */
class PaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentService {

    private val withRawResponse: PaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autoRechargePrefs: AutoRechargePrefService by lazy {
        AutoRechargePrefServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService =
        PaymentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** V2 Auto Recharge Preferences API */
    override fun autoRechargePrefs(): AutoRechargePrefService = autoRechargePrefs

    override fun createStoredPaymentTransaction(
        params: PaymentCreateStoredPaymentTransactionParams,
        requestOptions: RequestOptions,
    ): PaymentCreateStoredPaymentTransactionResponse =
        // post /v2/payment/stored_payment_transactions
        withRawResponse().createStoredPaymentTransaction(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val autoRechargePrefs: AutoRechargePrefService.WithRawResponse by lazy {
            AutoRechargePrefServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentService.WithRawResponse =
            PaymentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** V2 Auto Recharge Preferences API */
        override fun autoRechargePrefs(): AutoRechargePrefService.WithRawResponse =
            autoRechargePrefs

        private val createStoredPaymentTransactionHandler:
            Handler<PaymentCreateStoredPaymentTransactionResponse> =
            jsonHandler<PaymentCreateStoredPaymentTransactionResponse>(clientOptions.jsonMapper)

        override fun createStoredPaymentTransaction(
            params: PaymentCreateStoredPaymentTransactionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentCreateStoredPaymentTransactionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "payment", "stored_payment_transactions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
