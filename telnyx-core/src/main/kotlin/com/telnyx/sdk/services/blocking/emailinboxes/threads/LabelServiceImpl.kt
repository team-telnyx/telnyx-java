// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes.threads

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
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelCreateParams
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelCreateResponse
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelDeleteAllResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
class LabelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LabelService {

    private val withRawResponse: LabelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LabelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LabelService =
        LabelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LabelCreateParams,
        requestOptions: RequestOptions,
    ): LabelCreateResponse =
        // post /email_inboxes/{inbox_id}/threads/{thread_id}/labels
        withRawResponse().create(params, requestOptions).parse()

    override fun deleteAll(
        params: LabelDeleteAllParams,
        requestOptions: RequestOptions,
    ): LabelDeleteAllResponse =
        // delete /email_inboxes/{inbox_id}/threads/{thread_id}/labels
        withRawResponse().deleteAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LabelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LabelService.WithRawResponse =
            LabelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LabelCreateResponse> =
            jsonHandler<LabelCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LabelCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LabelCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "threads",
                        params._pathParam(1),
                        "labels",
                    )
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

        private val deleteAllHandler: Handler<LabelDeleteAllResponse> =
            jsonHandler<LabelDeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: LabelDeleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LabelDeleteAllResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("threadId", params.threadId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_inboxes",
                        params._pathParam(0),
                        "threads",
                        params._pathParam(1),
                        "labels",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
