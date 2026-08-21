// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.emailinboxes.threads.InboundThreadListResponse
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListPageAsync
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveResponse
import com.telnyx.sdk.services.async.emailinboxes.threads.LabelServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.threads.LabelServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
class ThreadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreadServiceAsync {

    private val withRawResponse: ThreadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val labels: LabelServiceAsync by lazy { LabelServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ThreadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync =
        ThreadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    override fun labels(): LabelServiceAsync = labels

    override fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadRetrieveResponse> =
        // get /email_inboxes/{inbox_id}/threads/{thread_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ThreadListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadListPageAsync> =
        // get /email_inboxes/{inbox_id}/threads
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val labels: LabelServiceAsync.WithRawResponse by lazy {
            LabelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse =
            ThreadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        override fun labels(): LabelServiceAsync.WithRawResponse = labels

        private val retrieveHandler: Handler<ThreadRetrieveResponse> =
            jsonHandler<ThreadRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "threads",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<InboundThreadListResponse> =
            jsonHandler<InboundThreadListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ThreadListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboxId", params.inboxId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_inboxes", params._pathParam(0), "threads")
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
                            .let {
                                ThreadListPageAsync.builder()
                                    .service(ThreadServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
