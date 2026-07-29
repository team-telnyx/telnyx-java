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
import com.telnyx.sdk.models.emailevents.EmailEventListParams
import com.telnyx.sdk.models.emailevents.EmailEventListResponse
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsParams
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve account-level email events and event statistics. */
class EmailEventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailEventServiceAsync {

    private val withRawResponse: EmailEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailEventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailEventServiceAsync =
        EmailEventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: EmailEventListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailEventListResponse> =
        // get /email_events
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieveStats(
        params: EmailEventRetrieveStatsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailEventRetrieveStatsResponse> =
        // get /email_events/stats
        withRawResponse().retrieveStats(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailEventServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailEventServiceAsync.WithRawResponse =
            EmailEventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<EmailEventListResponse> =
            jsonHandler<EmailEventListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailEventListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailEventListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_events")
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

        private val retrieveStatsHandler: Handler<EmailEventRetrieveStatsResponse> =
            jsonHandler<EmailEventRetrieveStatsResponse>(clientOptions.jsonMapper)

        override fun retrieveStats(
            params: EmailEventRetrieveStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailEventRetrieveStatsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_events", "stats")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
