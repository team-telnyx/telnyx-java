// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.usagereports

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupCreateParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupDeleteParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupListParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup.NumberLookupRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberLookupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberLookupService {

    private val withRawResponse: NumberLookupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberLookupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberLookupService =
        NumberLookupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: NumberLookupCreateParams, requestOptions: RequestOptions) {
        // post /legacy/reporting/usage_reports/number_lookup
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: NumberLookupRetrieveParams, requestOptions: RequestOptions) {
        // get /legacy/reporting/usage_reports/number_lookup/{id}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun list(params: NumberLookupListParams, requestOptions: RequestOptions) {
        // get /legacy/reporting/usage_reports/number_lookup
        withRawResponse().list(params, requestOptions)
    }

    override fun delete(params: NumberLookupDeleteParams, requestOptions: RequestOptions) {
        // delete /legacy/reporting/usage_reports/number_lookup/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberLookupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberLookupService.WithRawResponse =
            NumberLookupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: NumberLookupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "number_lookup")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<Void?> = emptyHandler()

        override fun retrieve(
            params: NumberLookupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "usage_reports",
                        "number_lookup",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
            }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: NumberLookupListParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "number_lookup")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listHandler.handle(it) }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: NumberLookupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "usage_reports",
                        "number_lookup",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
