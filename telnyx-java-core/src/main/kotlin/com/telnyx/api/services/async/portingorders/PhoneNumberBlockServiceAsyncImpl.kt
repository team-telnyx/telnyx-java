// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.portingorders

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateParams
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockCreateResponse
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteParams
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockDeleteResponse
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockListParams
import com.telnyx.api.models.portingorders.phonenumberblocks.PhoneNumberBlockListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhoneNumberBlockServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhoneNumberBlockServiceAsync {

    private val withRawResponse: PhoneNumberBlockServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhoneNumberBlockServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PhoneNumberBlockServiceAsync =
        PhoneNumberBlockServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PhoneNumberBlockCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBlockCreateResponse> =
        // post /porting_orders/{porting_order_id}/phone_number_blocks
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PhoneNumberBlockListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBlockListResponse> =
        // get /porting_orders/{porting_order_id}/phone_number_blocks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PhoneNumberBlockDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBlockDeleteResponse> =
        // delete /porting_orders/{porting_order_id}/phone_number_blocks/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneNumberBlockServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberBlockServiceAsync.WithRawResponse =
            PhoneNumberBlockServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhoneNumberBlockCreateResponse> =
            jsonHandler<PhoneNumberBlockCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PhoneNumberBlockCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "phone_number_blocks")
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

        private val listHandler: Handler<PhoneNumberBlockListResponse> =
            jsonHandler<PhoneNumberBlockListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhoneNumberBlockListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("portingOrderId", params.portingOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "phone_number_blocks")
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

        private val deleteHandler: Handler<PhoneNumberBlockDeleteResponse> =
            jsonHandler<PhoneNumberBlockDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: PhoneNumberBlockDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBlockDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting_orders",
                        params._pathParam(0),
                        "phone_number_blocks",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
