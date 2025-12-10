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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListPage
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListPageResponse
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListParams
import java.util.function.Consumer

class PortingPhoneNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PortingPhoneNumberService {

    private val withRawResponse: PortingPhoneNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortingPhoneNumberService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingPhoneNumberService =
        PortingPhoneNumberServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: PortingPhoneNumberListParams,
        requestOptions: RequestOptions,
    ): PortingPhoneNumberListPage =
        // get /porting_phone_numbers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortingPhoneNumberService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingPhoneNumberService.WithRawResponse =
            PortingPhoneNumberServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PortingPhoneNumberListPageResponse> =
            jsonHandler<PortingPhoneNumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PortingPhoneNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingPhoneNumberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_phone_numbers")
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
                    .let {
                        PortingPhoneNumberListPage.builder()
                            .service(PortingPhoneNumberServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
