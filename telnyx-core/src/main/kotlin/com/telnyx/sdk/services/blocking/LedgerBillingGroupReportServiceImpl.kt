// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateParams
import com.telnyx.sdk.models.ledgerbillinggroupreports.LedgerBillingGroupReportCreateResponse
import com.telnyx.sdk.models.ledgerbillinggroupreports.LedgerBillingGroupReportRetrieveParams
import com.telnyx.sdk.models.ledgerbillinggroupreports.LedgerBillingGroupReportRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LedgerBillingGroupReportServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerBillingGroupReportService {

    private val withRawResponse: LedgerBillingGroupReportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerBillingGroupReportService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LedgerBillingGroupReportService =
        LedgerBillingGroupReportServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: LedgerBillingGroupReportCreateParams,
        requestOptions: RequestOptions,
    ): LedgerBillingGroupReportCreateResponse =
        // post /ledger_billing_group_reports
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LedgerBillingGroupReportRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerBillingGroupReportRetrieveResponse =
        // get /ledger_billing_group_reports/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerBillingGroupReportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerBillingGroupReportService.WithRawResponse =
            LedgerBillingGroupReportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LedgerBillingGroupReportCreateResponse> =
            jsonHandler<LedgerBillingGroupReportCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LedgerBillingGroupReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerBillingGroupReportCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ledger_billing_group_reports")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<LedgerBillingGroupReportRetrieveResponse> =
            jsonHandler<LedgerBillingGroupReportRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LedgerBillingGroupReportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerBillingGroupReportRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ledger_billing_group_reports", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
