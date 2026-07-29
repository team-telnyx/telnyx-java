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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateParams
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateResponse
import com.telnyx.sdk.services.async.emailvalidations.BatchServiceAsync
import com.telnyx.sdk.services.async.emailvalidations.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Validate email addresses synchronously or in asynchronous batches. */
class EmailValidationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EmailValidationServiceAsync {

    private val withRawResponse: EmailValidationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EmailValidationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): EmailValidationServiceAsync =
        EmailValidationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Validate email addresses synchronously or in asynchronous batches. */
    override fun batch(): BatchServiceAsync = batch

    override fun create(
        params: EmailValidationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailValidationCreateResponse> =
        // post /email_validations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailValidationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailValidationServiceAsync.WithRawResponse =
            EmailValidationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Validate email addresses synchronously or in asynchronous batches. */
        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createHandler: Handler<EmailValidationCreateResponse> =
            jsonHandler<EmailValidationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailValidationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailValidationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_validations")
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
    }
}
