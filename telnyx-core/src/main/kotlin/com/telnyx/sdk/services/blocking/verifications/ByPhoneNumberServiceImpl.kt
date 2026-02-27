// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.verifications

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.verifications.byphonenumber.ByPhoneNumberListParams
import com.telnyx.sdk.models.verifications.byphonenumber.ByPhoneNumberListResponse
import com.telnyx.sdk.services.blocking.verifications.byphonenumber.ActionService
import com.telnyx.sdk.services.blocking.verifications.byphonenumber.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Two factor authentication API */
class ByPhoneNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ByPhoneNumberService {

    private val withRawResponse: ByPhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): ByPhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ByPhoneNumberService =
        ByPhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Two factor authentication API */
    override fun actions(): ActionService = actions

    override fun list(
        params: ByPhoneNumberListParams,
        requestOptions: RequestOptions,
    ): ByPhoneNumberListResponse =
        // get /verifications/by_phone_number/{phone_number}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ByPhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ByPhoneNumberService.WithRawResponse =
            ByPhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Two factor authentication API */
        override fun actions(): ActionService.WithRawResponse = actions

        private val listHandler: Handler<ByPhoneNumberListResponse> =
            jsonHandler<ByPhoneNumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ByPhoneNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ByPhoneNumberListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verifications", "by_phone_number", params._pathParam(0))
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
    }
}
