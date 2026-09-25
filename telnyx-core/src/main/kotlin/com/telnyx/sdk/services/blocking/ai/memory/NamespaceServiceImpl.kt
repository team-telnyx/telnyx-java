// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveParams
import com.telnyx.sdk.models.ai.memory.namespaces.NamespaceRetrieveResponse
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.ProfileService
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.ProfileServiceImpl
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.SettingService
import com.telnyx.sdk.services.blocking.ai.memory.namespaces.SettingServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Whether a write has finished. */
class NamespaceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NamespaceService {

    private val withRawResponse: NamespaceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val profiles: ProfileService by lazy { ProfileServiceImpl(clientOptions) }

    private val settings: SettingService by lazy { SettingServiceImpl(clientOptions) }

    override fun withRawResponse(): NamespaceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamespaceService =
        NamespaceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun profiles(): ProfileService = profiles

    /** How a namespace's summaries are written. */
    override fun settings(): SettingService = settings

    override fun retrieve(
        params: NamespaceRetrieveParams,
        requestOptions: RequestOptions,
    ): NamespaceRetrieveResponse =
        // get /ai/memory/namespaces/{namespace}/operations/{operation_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NamespaceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val profiles: ProfileService.WithRawResponse by lazy {
            ProfileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val settings: SettingService.WithRawResponse by lazy {
            SettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamespaceService.WithRawResponse =
            NamespaceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun profiles(): ProfileService.WithRawResponse = profiles

        /** How a namespace's summaries are written. */
        override fun settings(): SettingService.WithRawResponse = settings

        private val retrieveHandler: Handler<NamespaceRetrieveResponse> =
            jsonHandler<NamespaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NamespaceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NamespaceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("operationId", params.operationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ai",
                        "memory",
                        "namespaces",
                        params._pathParam(0),
                        "operations",
                        params._pathParam(1),
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
    }
}
