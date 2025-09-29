// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

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
import com.telnyx.api.core.prepare
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
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val withRawResponse: JobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService =
        JobServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions,
    ): JobRetrieveResponse =
        // get /phone_numbers/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: JobListParams, requestOptions: RequestOptions): JobListResponse =
        // get /phone_numbers/jobs
        withRawResponse().list(params, requestOptions).parse()

    override fun deleteBatch(
        params: JobDeleteBatchParams,
        requestOptions: RequestOptions,
    ): JobDeleteBatchResponse =
        // post /phone_numbers/jobs/delete_phone_numbers
        withRawResponse().deleteBatch(params, requestOptions).parse()

    override fun updateBatch(
        params: JobUpdateBatchParams,
        requestOptions: RequestOptions,
    ): JobUpdateBatchResponse =
        // post /phone_numbers/jobs/update_phone_numbers
        withRawResponse().updateBatch(params, requestOptions).parse()

    override fun updateEmergencySettingsBatch(
        params: JobUpdateEmergencySettingsBatchParams,
        requestOptions: RequestOptions,
    ): JobUpdateEmergencySettingsBatchResponse =
        // post /phone_numbers/jobs/update_emergency_settings
        withRawResponse().updateEmergencySettingsBatch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobService.WithRawResponse =
            JobServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<JobRetrieveResponse> =
            jsonHandler<JobRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<JobListResponse> =
            jsonHandler<JobListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs")
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

        private val deleteBatchHandler: Handler<JobDeleteBatchResponse> =
            jsonHandler<JobDeleteBatchResponse>(clientOptions.jsonMapper)

        override fun deleteBatch(
            params: JobDeleteBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobDeleteBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", "delete_phone_numbers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateBatchHandler: Handler<JobUpdateBatchResponse> =
            jsonHandler<JobUpdateBatchResponse>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: JobUpdateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JobUpdateBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", "update_phone_numbers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<JobUpdateEmergencySettingsBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_numbers", "jobs", "update_emergency_settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
