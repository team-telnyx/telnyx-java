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
import com.telnyx.sdk.models.emailevents.EmailEventListPage
import com.telnyx.sdk.models.emailevents.EmailEventListPageResponse
import com.telnyx.sdk.models.emailevents.EmailEventListParams
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsParams
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsResponse
import java.util.function.Consumer

/** Retrieve account-level email events and event statistics. */
class EmailEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailEventService {

    private val withRawResponse: EmailEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailEventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailEventService =
        EmailEventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EmailEventListParams,
        requestOptions: RequestOptions,
    ): EmailEventListPage =
        // get /email_events
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveStats(
        params: EmailEventRetrieveStatsParams,
        requestOptions: RequestOptions,
    ): EmailEventRetrieveStatsResponse =
        // get /email_events/stats
        withRawResponse().retrieveStats(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailEventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailEventService.WithRawResponse =
            EmailEventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<EmailEventListPageResponse> =
            jsonHandler<EmailEventListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailEventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_events")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        EmailEventListPage.builder()
                            .service(EmailEventServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveStatsHandler: Handler<EmailEventRetrieveStatsResponse> =
            jsonHandler<EmailEventRetrieveStatsResponse>(clientOptions.jsonMapper)

        override fun retrieveStats(
            params: EmailEventRetrieveStatsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailEventRetrieveStatsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_events", "stats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveStatsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
