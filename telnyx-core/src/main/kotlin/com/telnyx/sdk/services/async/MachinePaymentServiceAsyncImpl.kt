// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditParams
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Machine payment (MPP) account-credit operations. Fund your Telnyx account programmatically from a
 * machine or agent using the Machine Payment Protocol, an HTTP-402 flow settled via Stripe or
 * Tempo.
 */
class MachinePaymentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MachinePaymentServiceAsync {

    private val withRawResponse: MachinePaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MachinePaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MachinePaymentServiceAsync =
        MachinePaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accountCredit(
        params: MachinePaymentAccountCreditParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MachinePaymentAccountCreditResponse> =
        // post /machine-payments/account-credit
        withRawResponse().accountCredit(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MachinePaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MachinePaymentServiceAsync.WithRawResponse =
            MachinePaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val accountCreditHandler: Handler<MachinePaymentAccountCreditResponse> =
            jsonHandler<MachinePaymentAccountCreditResponse>(clientOptions.jsonMapper)

        override fun accountCredit(
            params: MachinePaymentAccountCreditParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MachinePaymentAccountCreditResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("machine-payments", "account-credit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
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
}
