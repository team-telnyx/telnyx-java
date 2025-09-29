// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.phonenumbers

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
import com.telnyx.api.models.phonenumbers.jobs.JobDeleteBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobDeleteBatchResponse
import com.telnyx.api.models.phonenumbers.jobs.JobListParams
import com.telnyx.api.models.phonenumbers.jobs.JobListResponse
import com.telnyx.api.models.phonenumbers.jobs.JobRetrieveParams
import com.telnyx.api.models.phonenumbers.jobs.JobRetrieveResponse
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateBatchResponse
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchParams
import com.telnyx.api.models.phonenumbers.jobs.JobUpdateEmergencySettingsBatchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync =
        JobServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobRetrieveResponse> =
        // get /phone_numbers/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: JobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobListResponse> =
        // get /phone_numbers/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deleteBatch(
        params: JobDeleteBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobDeleteBatchResponse> =
        // post /phone_numbers/jobs/delete_phone_numbers
        withRawResponse().deleteBatch(params, requestOptions).thenApply { it.parse() }

    override fun updateBatch(
        params: JobUpdateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobUpdateBatchResponse> =
        // post /phone_numbers/jobs/update_phone_numbers
        withRawResponse().updateBatch(params, requestOptions).thenApply { it.parse() }

    override fun updateEmergencySettingsBatch(
        params: JobUpdateEmergencySettingsBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobUpdateEmergencySettingsBatchResponse> =
        // post /phone_numbers/jobs/update_emergency_settings
        withRawResponse().updateEmergencySettingsBatch(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobServiceAsync.WithRawResponse =
            JobServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<JobRetrieveResponse> =
            jsonHandler<JobRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", params._pathParam(0))
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

        private val listHandler: Handler<JobListResponse> =
            jsonHandler<JobListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs")
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

        private val deleteBatchHandler: Handler<JobDeleteBatchResponse> =
            jsonHandler<JobDeleteBatchResponse>(clientOptions.jsonMapper)

        override fun deleteBatch(
            params: JobDeleteBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobDeleteBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", "delete_phone_numbers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateBatchHandler: Handler<JobUpdateBatchResponse> =
            jsonHandler<JobUpdateBatchResponse>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: JobUpdateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobUpdateBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", "update_phone_numbers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateEmergencySettingsBatchHandler:
            Handler<JobUpdateEmergencySettingsBatchResponse> =
            jsonHandler<JobUpdateEmergencySettingsBatchResponse>(clientOptions.jsonMapper)

        override fun updateEmergencySettingsBatch(
            params: JobUpdateEmergencySettingsBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobUpdateEmergencySettingsBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", "update_emergency_settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateEmergencySettingsBatchHandler.handle(it) }
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
