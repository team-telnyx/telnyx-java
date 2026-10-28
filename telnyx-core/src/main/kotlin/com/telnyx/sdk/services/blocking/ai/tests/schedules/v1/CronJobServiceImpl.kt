// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.schedules.v1

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobDeleteParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobDeleteResponse
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobRetrieveCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobRetrieveParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobUpdateParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.ScheduledTestJob
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Test agents, evaluator scenarios, metrics, and run results for the AI test framework. */
class CronJobServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CronJobService {

    private val withRawResponse: CronJobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CronJobService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CronJobService =
        CronJobServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CronJobRetrieveParams,
        requestOptions: RequestOptions,
    ): ScheduledTestJob =
        // get /ai/tests/schedules/v1/cron-jobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CronJobUpdateParams,
        requestOptions: RequestOptions,
    ): ScheduledTestJob =
        // patch /ai/tests/schedules/v1/cron-jobs/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: CronJobDeleteParams,
        requestOptions: RequestOptions,
    ): CronJobDeleteResponse =
        // delete /ai/tests/schedules/v1/cron-jobs/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun cronJobs(
        params: CronJobCronJobsParams,
        requestOptions: RequestOptions,
    ): ScheduledTestJob =
        // post /ai/tests/schedules/v1/cron-jobs
        withRawResponse().cronJobs(params, requestOptions).parse()

    override fun retrieveCronJobs(
        params: CronJobRetrieveCronJobsParams,
        requestOptions: RequestOptions,
    ): List<ScheduledTestJob> =
        // get /ai/tests/schedules/v1/cron-jobs
        withRawResponse().retrieveCronJobs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CronJobService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CronJobService.WithRawResponse =
            CronJobServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ScheduledTestJob> =
            jsonHandler<ScheduledTestJob>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CronJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledTestJob> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "schedules",
                        "v1",
                        "cron-jobs",
                        params._pathParam(0),
                    )
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

        private val updateHandler: Handler<ScheduledTestJob> =
            jsonHandler<ScheduledTestJob>(clientOptions.jsonMapper)

        override fun update(
            params: CronJobUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledTestJob> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "schedules",
                        "v1",
                        "cron-jobs",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<CronJobDeleteResponse> =
            jsonHandler<CronJobDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CronJobDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CronJobDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "tests",
                        "schedules",
                        "v1",
                        "cron-jobs",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cronJobsHandler: Handler<ScheduledTestJob> =
            jsonHandler<ScheduledTestJob>(clientOptions.jsonMapper)

        override fun cronJobs(
            params: CronJobCronJobsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduledTestJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "schedules", "v1", "cron-jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cronJobsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveCronJobsHandler: Handler<List<ScheduledTestJob>> =
            jsonHandler<List<ScheduledTestJob>>(clientOptions.jsonMapper)

        override fun retrieveCronJobs(
            params: CronJobRetrieveCronJobsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ScheduledTestJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "tests", "schedules", "v1", "cron-jobs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCronJobsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
