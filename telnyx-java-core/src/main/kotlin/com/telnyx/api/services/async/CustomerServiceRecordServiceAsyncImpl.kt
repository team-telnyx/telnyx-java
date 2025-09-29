// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordCreateParams
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordCreateResponse
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordListParams
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordListResponse
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordRetrieveParams
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordRetrieveResponse
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageParams
import com.telnyx.api.models.customerservicerecords.CustomerServiceRecordVerifyPhoneNumberCoverageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

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
    ): CompletableFuture<CustomerServiceRecordListResponse> =
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

        private val listHandler: Handler<CustomerServiceRecordListResponse> =
            jsonHandler<CustomerServiceRecordListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CustomerServiceRecordListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerServiceRecordListResponse>> {
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
