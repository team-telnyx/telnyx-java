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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.porting.PortingListUkCarriersParams
import com.telnyx.sdk.models.porting.PortingListUkCarriersResponse
import com.telnyx.sdk.services.async.porting.EventServiceAsync
import com.telnyx.sdk.services.async.porting.EventServiceAsyncImpl
import com.telnyx.sdk.services.async.porting.LoaConfigurationServiceAsync
import com.telnyx.sdk.services.async.porting.LoaConfigurationServiceAsyncImpl
import com.telnyx.sdk.services.async.porting.ReportServiceAsync
import com.telnyx.sdk.services.async.porting.ReportServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
class PortingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PortingServiceAsync {

    private val withRawResponse: PortingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val reports: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    private val loaConfigurations: LoaConfigurationServiceAsync by lazy {
        LoaConfigurationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PortingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingServiceAsync =
        PortingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Endpoints related to porting orders management. */
    override fun events(): EventServiceAsync = events

    /** Endpoints related to porting orders management. */
    override fun reports(): ReportServiceAsync = reports

    /** Endpoints related to porting orders management. */
    override fun loaConfigurations(): LoaConfigurationServiceAsync = loaConfigurations

    override fun listUkCarriers(
        params: PortingListUkCarriersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingListUkCarriersResponse> =
        // get /porting/uk_carriers
        withRawResponse().listUkCarriers(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val loaConfigurations: LoaConfigurationServiceAsync.WithRawResponse by lazy {
            LoaConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingServiceAsync.WithRawResponse =
            PortingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Endpoints related to porting orders management. */
        override fun events(): EventServiceAsync.WithRawResponse = events

        /** Endpoints related to porting orders management. */
        override fun reports(): ReportServiceAsync.WithRawResponse = reports

        /** Endpoints related to porting orders management. */
        override fun loaConfigurations(): LoaConfigurationServiceAsync.WithRawResponse =
            loaConfigurations

        private val listUkCarriersHandler: Handler<PortingListUkCarriersResponse> =
            jsonHandler<PortingListUkCarriersResponse>(clientOptions.jsonMapper)

        override fun listUkCarriers(
            params: PortingListUkCarriersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingListUkCarriersResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "uk_carriers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listUkCarriersHandler.handle(it) }
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
