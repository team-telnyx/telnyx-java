// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailunsubscribegroups

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.emailblocks.EmailBlockResponse
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionCreateParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionDeleteParams
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListPageAsync
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListPageResponse
import com.telnyx.sdk.models.emailunsubscribegroups.suppressions.SuppressionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Named groups and group-scoped suppressions. */
class SuppressionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SuppressionServiceAsync {

    private val withRawResponse: SuppressionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SuppressionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuppressionServiceAsync =
        SuppressionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SuppressionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailBlockResponse> =
        // post /email_unsubscribe_groups/{id}/suppressions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SuppressionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SuppressionListPageAsync> =
        // get /email_unsubscribe_groups/{id}/suppressions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SuppressionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /email_unsubscribe_groups/{id}/suppressions/{email}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SuppressionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SuppressionServiceAsync.WithRawResponse =
            SuppressionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailBlockResponse> =
            jsonHandler<EmailBlockResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SuppressionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailBlockResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_unsubscribe_groups",
                        params._pathParam(0),
                        "suppressions",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<SuppressionListPageResponse> =
            jsonHandler<SuppressionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SuppressionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SuppressionListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_unsubscribe_groups",
                        params._pathParam(0),
                        "suppressions",
                    )
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
                                SuppressionListPageAsync.builder()
                                    .service(SuppressionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SuppressionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("email", params.email().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "email_unsubscribe_groups",
                        params._pathParam(0),
                        "suppressions",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
