// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portingorders

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
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateParams
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationCreateResponse
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListPageAsync
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListPageResponse
import com.telnyx.sdk.models.portingorders.phonenumberconfigurations.PhoneNumberConfigurationListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PhoneNumberConfigurationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    PhoneNumberConfigurationServiceAsync {

    private val withRawResponse: PhoneNumberConfigurationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberConfigurationServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberConfigurationServiceAsync =
        PhoneNumberConfigurationServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: PhoneNumberConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberConfigurationCreateResponse> =
        // post /porting_orders/phone_number_configurations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PhoneNumberConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberConfigurationListPageAsync> =
        // get /porting_orders/phone_number_configurations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberConfigurationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberConfigurationServiceAsync.WithRawResponse =
            PhoneNumberConfigurationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberConfigurationCreateResponse> =
            jsonHandler<PhoneNumberConfigurationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PhoneNumberConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", "phone_number_configurations")
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

        private val listHandler: Handler<PhoneNumberConfigurationListPageResponse> =
            jsonHandler<PhoneNumberConfigurationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberConfigurationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberConfigurationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", "phone_number_configurations")
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
                            .let {
                                PhoneNumberConfigurationListPageAsync.builder()
                                    .service(
                                        PhoneNumberConfigurationServiceAsyncImpl(clientOptions)
                                    )
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
