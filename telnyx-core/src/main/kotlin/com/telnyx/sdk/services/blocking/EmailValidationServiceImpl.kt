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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateParams
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateResponse
import com.telnyx.sdk.services.blocking.emailvalidations.BatchService
import com.telnyx.sdk.services.blocking.emailvalidations.BatchServiceImpl
import java.util.function.Consumer

/** Validate email addresses synchronously or in asynchronous batches. */
class EmailValidationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailValidationService {

    private val withRawResponse: EmailValidationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): EmailValidationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailValidationService =
        EmailValidationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Validate email addresses synchronously or in asynchronous batches. */
    override fun batch(): BatchService = batch

    override fun create(
        params: EmailValidationCreateParams,
        requestOptions: RequestOptions,
    ): EmailValidationCreateResponse =
        // post /email_validations
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailValidationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailValidationService.WithRawResponse =
            EmailValidationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Validate email addresses synchronously or in asynchronous batches. */
        override fun batch(): BatchService.WithRawResponse = batch

        private val createHandler: Handler<EmailValidationCreateResponse> =
            jsonHandler<EmailValidationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailValidationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailValidationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_validations")
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
    }
}
