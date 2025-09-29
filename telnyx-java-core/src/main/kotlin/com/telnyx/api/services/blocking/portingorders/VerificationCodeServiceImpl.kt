// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeListParams
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeListResponse
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeSendParams
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeVerifyParams
import com.telnyx.api.models.portingorders.verificationcodes.VerificationCodeVerifyResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerificationCodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationCodeService {

    private val withRawResponse: VerificationCodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerificationCodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationCodeService =
        VerificationCodeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: VerificationCodeListParams,
        requestOptions: RequestOptions,
    ): VerificationCodeListResponse =
        // get /porting_orders/{id}/verification_codes
        withRawResponse().list(params, requestOptions).parse()

    override fun send(params: VerificationCodeSendParams, requestOptions: RequestOptions) {
        // post /porting_orders/{id}/verification_codes/send
        withRawResponse().send(params, requestOptions)
    }

    override fun verify(
        params: VerificationCodeVerifyParams,
        requestOptions: RequestOptions,
    ): VerificationCodeVerifyResponse =
        // post /porting_orders/{id}/verification_codes/verify
        withRawResponse().verify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationCodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationCodeService.WithRawResponse =
            VerificationCodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<VerificationCodeListResponse> =
            jsonHandler<VerificationCodeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerificationCodeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationCodeListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "verification_codes")
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
            }
        }

        private val sendHandler: Handler<Void?> = emptyHandler()

        override fun send(
            params: VerificationCodeSendParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "verification_codes",
                        "send",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { sendHandler.handle(it) }
            }
        }

        private val verifyHandler: Handler<VerificationCodeVerifyResponse> =
            jsonHandler<VerificationCodeVerifyResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: VerificationCodeVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationCodeVerifyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "verification_codes",
                        "verify",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
