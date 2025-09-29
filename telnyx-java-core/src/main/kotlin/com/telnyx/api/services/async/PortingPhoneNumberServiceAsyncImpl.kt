// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.portingphonenumbers.PortingPhoneNumberListParams
import com.telnyx.api.models.portingphonenumbers.PortingPhoneNumberListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PortingPhoneNumberServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PortingPhoneNumberServiceAsync {

    private val withRawResponse: PortingPhoneNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PortingPhoneNumberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PortingPhoneNumberServiceAsync =
        PortingPhoneNumberServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: PortingPhoneNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingPhoneNumberListResponse> =
        // get /porting_phone_numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortingPhoneNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingPhoneNumberServiceAsync.WithRawResponse =
            PortingPhoneNumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<PortingPhoneNumberListResponse> =
            jsonHandler<PortingPhoneNumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PortingPhoneNumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingPhoneNumberListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_phone_numbers")
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
                    }
                }
        }
    }
}
