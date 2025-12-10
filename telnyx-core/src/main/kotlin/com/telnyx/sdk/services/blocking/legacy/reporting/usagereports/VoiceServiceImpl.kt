// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.legacy.reporting.usagereports

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
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceCreateParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceCreateResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceDeleteParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceDeleteResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceListPage
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceListPageResponse
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceListParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceRetrieveParams
import com.telnyx.sdk.models.legacy.reporting.usagereports.voice.VoiceRetrieveResponse
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

    override fun list(params: VoiceListParams, requestOptions: RequestOptions): VoiceListPage =
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

        private val listHandler: Handler<VoiceListPageResponse> =
            jsonHandler<VoiceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VoiceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VoiceListPage> {
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
                    .let {
                        VoiceListPage.builder()
                            .service(VoiceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
