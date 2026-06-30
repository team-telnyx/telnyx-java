// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

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
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailSendResponse
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailStatusParams
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailStatusResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Verify ownership of a DIR's authorizer email. A short code is emailed and confirmed; the email
 * must be verified before references can be submitted.
 */
class VerifyEmailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerifyEmailService {

    private val withRawResponse: VerifyEmailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerifyEmailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyEmailService =
        VerifyEmailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun confirm(
        params: VerifyEmailConfirmParams,
        requestOptions: RequestOptions,
    ): VerifyEmailConfirmResponse =
        // post /dir/{dir_id}/verify_email/confirm
        withRawResponse().confirm(params, requestOptions).parse()

    override fun send(
        params: VerifyEmailSendParams,
        requestOptions: RequestOptions,
    ): VerifyEmailSendResponse =
        // post /dir/{dir_id}/verify_email
        withRawResponse().send(params, requestOptions).parse()

    override fun status(
        params: VerifyEmailStatusParams,
        requestOptions: RequestOptions,
    ): VerifyEmailStatusResponse =
        // get /dir/{dir_id}/verify_email
        withRawResponse().status(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerifyEmailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyEmailService.WithRawResponse =
            VerifyEmailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val confirmHandler: Handler<VerifyEmailConfirmResponse> =
            jsonHandler<VerifyEmailConfirmResponse>(clientOptions.jsonMapper)

        override fun confirm(
            params: VerifyEmailConfirmParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyEmailConfirmResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "verify_email", "confirm")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { confirmHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<VerifyEmailSendResponse> =
            jsonHandler<VerifyEmailSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: VerifyEmailSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyEmailSendResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "verify_email")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val statusHandler: Handler<VerifyEmailStatusResponse> =
            jsonHandler<VerifyEmailStatusResponse>(clientOptions.jsonMapper)

        override fun status(
            params: VerifyEmailStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyEmailStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("dirId", params.dirId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("dir", params._pathParam(0), "verify_email")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { statusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
