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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.porting.PortingListUkCarriersParams
import com.telnyx.sdk.models.porting.PortingListUkCarriersResponse
import com.telnyx.sdk.services.blocking.porting.EventService
import com.telnyx.sdk.services.blocking.porting.EventServiceImpl
import com.telnyx.sdk.services.blocking.porting.LoaConfigurationService
import com.telnyx.sdk.services.blocking.porting.LoaConfigurationServiceImpl
import com.telnyx.sdk.services.blocking.porting.ReportService
import com.telnyx.sdk.services.blocking.porting.ReportServiceImpl
import java.util.function.Consumer

/** Endpoints related to porting orders management. */
class PortingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PortingService {

    private val withRawResponse: PortingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    private val loaConfigurations: LoaConfigurationService by lazy {
        LoaConfigurationServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PortingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingService =
        PortingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Endpoints related to porting orders management. */
    override fun events(): EventService = events

    /** Endpoints related to porting orders management. */
    override fun reports(): ReportService = reports

    /** Endpoints related to porting orders management. */
    override fun loaConfigurations(): LoaConfigurationService = loaConfigurations

    override fun listUkCarriers(
        params: PortingListUkCarriersParams,
        requestOptions: RequestOptions,
    ): PortingListUkCarriersResponse =
        // get /porting/uk_carriers
        withRawResponse().listUkCarriers(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val loaConfigurations: LoaConfigurationService.WithRawResponse by lazy {
            LoaConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingService.WithRawResponse =
            PortingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Endpoints related to porting orders management. */
        override fun events(): EventService.WithRawResponse = events

        /** Endpoints related to porting orders management. */
        override fun reports(): ReportService.WithRawResponse = reports

        /** Endpoints related to porting orders management. */
        override fun loaConfigurations(): LoaConfigurationService.WithRawResponse =
            loaConfigurations

        private val listUkCarriersHandler: Handler<PortingListUkCarriersResponse> =
            jsonHandler<PortingListUkCarriersResponse>(clientOptions.jsonMapper)

        override fun listUkCarriers(
            params: PortingListUkCarriersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingListUkCarriersResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "uk_carriers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
