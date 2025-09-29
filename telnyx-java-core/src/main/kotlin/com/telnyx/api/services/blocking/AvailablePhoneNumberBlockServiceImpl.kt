// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListParams
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListResponse
import java.util.function.Consumer

class AvailablePhoneNumberBlockServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AvailablePhoneNumberBlockService {

    private val withRawResponse: AvailablePhoneNumberBlockService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AvailablePhoneNumberBlockService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AvailablePhoneNumberBlockService =
        AvailablePhoneNumberBlockServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: AvailablePhoneNumberBlockListParams,
        requestOptions: RequestOptions,
    ): AvailablePhoneNumberBlockListResponse =
        // get /available_phone_number_blocks
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvailablePhoneNumberBlockService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvailablePhoneNumberBlockService.WithRawResponse =
            AvailablePhoneNumberBlockServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AvailablePhoneNumberBlockListResponse> =
            jsonHandler<AvailablePhoneNumberBlockListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AvailablePhoneNumberBlockListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvailablePhoneNumberBlockListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("available_phone_number_blocks")
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
