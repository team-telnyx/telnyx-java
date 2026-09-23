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
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditParams
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditResponse
import java.util.function.Consumer

/**
 * Machine payment (MPP) account-credit operations. Fund your Telnyx account programmatically from a
 * machine or agent using the Machine Payment Protocol, an HTTP-402 flow settled via Stripe or
 * Tempo.
 */
class MachinePaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MachinePaymentService {

    private val withRawResponse: MachinePaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MachinePaymentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MachinePaymentService =
        MachinePaymentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accountCredit(
        params: MachinePaymentAccountCreditParams,
        requestOptions: RequestOptions,
    ): MachinePaymentAccountCreditResponse =
        // post /machine-payments/account-credit
        withRawResponse().accountCredit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MachinePaymentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MachinePaymentService.WithRawResponse =
            MachinePaymentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val accountCreditHandler: Handler<MachinePaymentAccountCreditResponse> =
            jsonHandler<MachinePaymentAccountCreditResponse>(clientOptions.jsonMapper)

        override fun accountCredit(
            params: MachinePaymentAccountCreditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MachinePaymentAccountCreditResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("machine-payments", "account-credit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { accountCreditHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
