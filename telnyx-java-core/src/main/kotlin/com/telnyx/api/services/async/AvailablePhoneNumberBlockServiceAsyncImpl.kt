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
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListParams
import com.telnyx.api.models.availablephonenumberblocks.AvailablePhoneNumberBlockListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AvailablePhoneNumberBlockServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    AvailablePhoneNumberBlockServiceAsync {

    private val withRawResponse: AvailablePhoneNumberBlockServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AvailablePhoneNumberBlockServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AvailablePhoneNumberBlockServiceAsync =
        AvailablePhoneNumberBlockServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun list(
        params: AvailablePhoneNumberBlockListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AvailablePhoneNumberBlockListResponse> =
        // get /available_phone_number_blocks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvailablePhoneNumberBlockServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvailablePhoneNumberBlockServiceAsync.WithRawResponse =
            AvailablePhoneNumberBlockServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AvailablePhoneNumberBlockListResponse> =
            jsonHandler<AvailablePhoneNumberBlockListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AvailablePhoneNumberBlockListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AvailablePhoneNumberBlockListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("available_phone_number_blocks")
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
