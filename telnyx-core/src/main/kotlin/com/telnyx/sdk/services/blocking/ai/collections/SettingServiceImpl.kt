// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.collections

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
import com.telnyx.sdk.models.ai.collections.settings.SettingCreateParams
import com.telnyx.sdk.models.ai.collections.settings.SettingListParams
import com.telnyx.sdk.models.ai.collections.settings.SettingPatchAllParams
import com.telnyx.sdk.models.ai.collections.settings.SettingsEnvelope
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SettingCreateParams,
        requestOptions: RequestOptions,
    ): SettingsEnvelope =
        // put /ai/collections/{uuid}/settings
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: SettingListParams, requestOptions: RequestOptions): SettingsEnvelope =
        // get /ai/collections/{uuid}/settings
        withRawResponse().list(params, requestOptions).parse()

    override fun patchAll(
        params: SettingPatchAllParams,
        requestOptions: RequestOptions,
    ): SettingsEnvelope =
        // patch /ai/collections/{uuid}/settings
        withRawResponse().patchAll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingService.WithRawResponse =
            SettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SettingsEnvelope> =
            jsonHandler<SettingsEnvelope>(clientOptions.jsonMapper)

        override fun create(
            params: SettingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsEnvelope> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0), "settings")
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

        private val listHandler: Handler<SettingsEnvelope> =
            jsonHandler<SettingsEnvelope>(clientOptions.jsonMapper)

        override fun list(
            params: SettingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsEnvelope> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0), "settings")
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

        private val patchAllHandler: Handler<SettingsEnvelope> =
            jsonHandler<SettingsEnvelope>(clientOptions.jsonMapper)

        override fun patchAll(
            params: SettingPatchAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsEnvelope> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("uuid", params.uuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "collections", params._pathParam(0), "settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { patchAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
