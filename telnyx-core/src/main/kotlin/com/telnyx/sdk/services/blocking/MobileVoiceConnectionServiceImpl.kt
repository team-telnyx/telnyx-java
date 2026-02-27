// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionCreateResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionDeleteResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListPage
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListPageResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionListParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionRetrieveResponse
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateParams
import com.telnyx.sdk.models.mobilevoiceconnections.MobileVoiceConnectionUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Mobile voice connection operations */
class MobileVoiceConnectionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : MobileVoiceConnectionService {

    private val withRawResponse: MobileVoiceConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MobileVoiceConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MobileVoiceConnectionService =
        MobileVoiceConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MobileVoiceConnectionCreateParams,
        requestOptions: RequestOptions,
    ): MobileVoiceConnectionCreateResponse =
        // post /v2/mobile_voice_connections
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MobileVoiceConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): MobileVoiceConnectionRetrieveResponse =
        // get /v2/mobile_voice_connections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: MobileVoiceConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): MobileVoiceConnectionUpdateResponse =
        // patch /v2/mobile_voice_connections/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: MobileVoiceConnectionListParams,
        requestOptions: RequestOptions,
    ): MobileVoiceConnectionListPage =
        // get /v2/mobile_voice_connections
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MobileVoiceConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): MobileVoiceConnectionDeleteResponse =
        // delete /v2/mobile_voice_connections/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MobileVoiceConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MobileVoiceConnectionService.WithRawResponse =
            MobileVoiceConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MobileVoiceConnectionCreateResponse> =
            jsonHandler<MobileVoiceConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MobileVoiceConnectionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections")
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

        private val retrieveHandler: Handler<MobileVoiceConnectionRetrieveResponse> =
            jsonHandler<MobileVoiceConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MobileVoiceConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections", params._pathParam(0))
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

        private val updateHandler: Handler<MobileVoiceConnectionUpdateResponse> =
            jsonHandler<MobileVoiceConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: MobileVoiceConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections", params._pathParam(0))
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

        private val listHandler: Handler<MobileVoiceConnectionListPageResponse> =
            jsonHandler<MobileVoiceConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobileVoiceConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections")
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
                        MobileVoiceConnectionListPage.builder()
                            .service(MobileVoiceConnectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<MobileVoiceConnectionDeleteResponse> =
            jsonHandler<MobileVoiceConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MobileVoiceConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobileVoiceConnectionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "mobile_voice_connections", params._pathParam(0))
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
