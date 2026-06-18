// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordCreateResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListPageAsync
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListPageResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordListParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordRetrieveParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordRetrieveResponse
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageParams
import com.telnyx.sdk.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Customer Service Record operations */
class CustomerServiceRecordServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CustomerServiceRecordServiceAsync {

    private val withRawResponse: CustomerServiceRecordServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomerServiceRecordServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CustomerServiceRecordServiceAsync =
        CustomerServiceRecordServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: CustomerServiceRecordCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerServiceRecordCreateResponse> =
        // post /customer_service_records
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CustomerServiceRecordRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerServiceRecordRetrieveResponse> =
        // get /customer_service_records/{customer_service_record_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CustomerServiceRecordListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerServiceRecordListPageAsync> =
        // get /customer_service_records
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun verifyPhoneNumberCoverage(
        params: CustomerServiceRecordVerifyPhoneNumberCoverageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerServiceRecordVerifyPhoneNumberCoverageResponse> =
        // post /customer_service_records/phone_number_coverages
        withRawResponse().verifyPhoneNumberCoverage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomerServiceRecordServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceRecordServiceAsync.WithRawResponse =
            CustomerServiceRecordServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CustomerServiceRecordCreateResponse> =
            jsonHandler<CustomerServiceRecordCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CustomerServiceRecordCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer_service_records")
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

        private val retrieveHandler: Handler<CustomerServiceRecordRetrieveResponse> =
            jsonHandler<CustomerServiceRecordRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CustomerServiceRecordRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerServiceRecordId", params.customerServiceRecordId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer_service_records", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CustomerServiceRecordListPageResponse> =
            jsonHandler<CustomerServiceRecordListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerServiceRecordListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer_service_records")
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
                                CustomerServiceRecordListPageAsync.builder()
                                    .service(CustomerServiceRecordServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val verifyPhoneNumberCoverageHandler:
            Handler<CustomerServiceRecordVerifyPhoneNumberCoverageResponse> =
            jsonHandler<CustomerServiceRecordVerifyPhoneNumberCoverageResponse>(
                clientOptions.jsonMapper
            )

        override fun verifyPhoneNumberCoverage(
            params: CustomerServiceRecordVerifyPhoneNumberCoverageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<CustomerServiceRecordVerifyPhoneNumberCoverageResponse>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customer_service_records", "phone_number_coverages")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { verifyPhoneNumberCoverageHandler.handle(it) }
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
