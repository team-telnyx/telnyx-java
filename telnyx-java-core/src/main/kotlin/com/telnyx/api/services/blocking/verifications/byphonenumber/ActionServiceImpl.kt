// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.verifications.byphonenumber

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
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
import com.telnyx.api.models.verifications.byphonenumber.actions.ActionVerifyParams
import com.telnyx.api.models.verifications.byphonenumber.actions.VerifyVerificationCodeResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionService {

    private val withRawResponse: ActionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService =
        ActionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun verify(
        params: ActionVerifyParams,
        requestOptions: RequestOptions,
    ): VerifyVerificationCodeResponse =
        // post /verifications/by_phone_number/{phone_number}/actions/verify
        withRawResponse().verify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionService.WithRawResponse =
            ActionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val verifyHandler: Handler<VerifyVerificationCodeResponse> =
            jsonHandler<VerifyVerificationCodeResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: ActionVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyVerificationCodeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "verifications",
                        "by_phone_number",
                        params._pathParam(0),
                        "actions",
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
