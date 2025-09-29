// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.legacy.reporting.usagereports

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
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceCreateParams
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceCreateResponse
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceDeleteParams
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceDeleteResponse
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceListParams
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceListResponse
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceRetrieveParams
import com.telnyx.api.models.legacy.reporting.usagereports.voice.VoiceRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VoiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceService {

    private val withRawResponse: VoiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VoiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService =
        VoiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VoiceCreateParams,
        requestOptions: RequestOptions,
    ): VoiceCreateResponse =
        // post /legacy/reporting/usage_reports/voice
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: VoiceRetrieveParams,
        requestOptions: RequestOptions,
    ): VoiceRetrieveResponse =
        // get /legacy/reporting/usage_reports/voice/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: VoiceListParams, requestOptions: RequestOptions): VoiceListResponse =
        // get /legacy/reporting/usage_reports/voice
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: VoiceDeleteParams,
        requestOptions: RequestOptions,
    ): VoiceDeleteResponse =
        // delete /legacy/reporting/usage_reports/voice/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceService.WithRawResponse =
            VoiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VoiceCreateResponse> =
            jsonHandler<VoiceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VoiceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "voice")
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

        private val retrieveHandler: Handler<VoiceRetrieveResponse> =
            jsonHandler<VoiceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VoiceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "usage_reports",
                        "voice",
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

        private val listHandler: Handler<VoiceListResponse> =
            jsonHandler<VoiceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VoiceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legacy", "reporting", "usage_reports", "voice")
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

        private val deleteHandler: Handler<VoiceDeleteResponse> =
            jsonHandler<VoiceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: VoiceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "legacy",
                        "reporting",
                        "usage_reports",
                        "voice",
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
    }
}
