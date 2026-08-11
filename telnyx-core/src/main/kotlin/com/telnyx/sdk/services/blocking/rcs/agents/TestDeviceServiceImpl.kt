// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs.agents

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceCreateParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceDeleteParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceListParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage RCS agent registration, testing, verification, and launch. */
class TestDeviceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TestDeviceService {

    private val withRawResponse: TestDeviceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TestDeviceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestDeviceService =
        TestDeviceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TestDeviceCreateParams,
        requestOptions: RequestOptions,
    ): TestDeviceResponse =
        // post /rcs/agents/{id}/test_devices
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: TestDeviceListParams,
        requestOptions: RequestOptions,
    ): List<TestDeviceResponse> =
        // get /rcs/agents/{id}/test_devices
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TestDeviceDeleteParams, requestOptions: RequestOptions) {
        // delete /rcs/agents/{id}/test_devices/{test_device_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TestDeviceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestDeviceService.WithRawResponse =
            TestDeviceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TestDeviceResponse> =
            jsonHandler<TestDeviceResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TestDeviceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TestDeviceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rcs", "agents", params._pathParam(0), "test_devices")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<TestDeviceResponse>> =
            jsonHandler<List<TestDeviceResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: TestDeviceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TestDeviceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("rcs", "agents", params._pathParam(0), "test_devices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TestDeviceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("testDeviceId", params.testDeviceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "rcs",
                        "agents",
                        params._pathParam(0),
                        "test_devices",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
