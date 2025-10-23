// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumberblocks

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
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockParams
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobDeletePhoneNumberBlockResponse
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobListParams
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobListResponse
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobRetrieveParams
import com.telnyx.sdk.models.phonenumberblocks.jobs.JobRetrieveResponse
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
        // get /phone_number_blocks/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: JobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobListResponse> =
        // get /phone_number_blocks/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun deletePhoneNumberBlock(
        params: JobDeletePhoneNumberBlockParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JobDeletePhoneNumberBlockResponse> =
        // post /phone_number_blocks/jobs/delete_phone_number_block
        withRawResponse().deletePhoneNumberBlock(params, requestOptions).thenApply { it.parse() }

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
                    .addPathSegments("phone_number_blocks", "jobs", params._pathParam(0))
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
                    .addPathSegments("phone_number_blocks", "jobs")
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

        private val deletePhoneNumberBlockHandler: Handler<JobDeletePhoneNumberBlockResponse> =
            jsonHandler<JobDeletePhoneNumberBlockResponse>(clientOptions.jsonMapper)

        override fun deletePhoneNumberBlock(
            params: JobDeletePhoneNumberBlockParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JobDeletePhoneNumberBlockResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("phone_number_blocks", "jobs", "delete_phone_number_block")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deletePhoneNumberBlockHandler.handle(it) }
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
