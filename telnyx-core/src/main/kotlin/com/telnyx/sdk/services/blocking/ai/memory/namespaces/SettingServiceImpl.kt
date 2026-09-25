// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces

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
import com.telnyx.sdk.models.ai.memory.namespaces.settings.NamespaceSettingsResponse
import com.telnyx.sdk.models.ai.memory.namespaces.settings.SettingListParams
import com.telnyx.sdk.models.ai.memory.namespaces.settings.SettingPatchAllParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** How a namespace's summaries are written. */
class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SettingListParams,
        requestOptions: RequestOptions,
    ): NamespaceSettingsResponse =
        // get /ai/memory/namespaces/{namespace}/settings
        withRawResponse().list(params, requestOptions).parse()

    override fun patchAll(
        params: SettingPatchAllParams,
        requestOptions: RequestOptions,
    ): NamespaceSettingsResponse =
        // patch /ai/memory/namespaces/{namespace}/settings
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

        private val listHandler: Handler<NamespaceSettingsResponse> =
            jsonHandler<NamespaceSettingsResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SettingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NamespaceSettingsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("namespace", params.namespace().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "memory", "namespaces", params._pathParam(0), "settings")
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

        private val patchAllHandler: Handler<NamespaceSettingsResponse> =
            jsonHandler<NamespaceSettingsResponse>(clientOptions.jsonMapper)

        override fun patchAll(
            params: SettingPatchAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NamespaceSettingsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("namespace", params.namespace().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "memory", "namespaces", params._pathParam(0), "settings")
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
