// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

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
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.avatars.AvatarCreateParams
import com.telnyx.sdk.models.ai.avatars.AvatarListPage
import com.telnyx.sdk.models.ai.avatars.AvatarListPageResponse
import com.telnyx.sdk.models.ai.avatars.AvatarListParams
import com.telnyx.sdk.models.ai.avatars.AvatarResponse
import com.telnyx.sdk.models.ai.avatars.AvatarRetrieveParams
import com.telnyx.sdk.models.ai.avatars.AvatarUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and manage real-time AI avatars */
class AvatarServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AvatarService {

    private val withRawResponse: AvatarService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AvatarService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvatarService =
        AvatarServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AvatarCreateParams,
        requestOptions: RequestOptions,
    ): AvatarResponse =
        // post /ai/avatars
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AvatarRetrieveParams,
        requestOptions: RequestOptions,
    ): AvatarResponse =
        // get /ai/avatars/{avatar_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AvatarUpdateParams,
        requestOptions: RequestOptions,
    ): AvatarResponse =
        // patch /ai/avatars/{avatar_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: AvatarListParams, requestOptions: RequestOptions): AvatarListPage =
        // get /ai/avatars
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AvatarService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvatarService.WithRawResponse =
            AvatarServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AvatarResponse> =
            jsonHandler<AvatarResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AvatarCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvatarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "avatars")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<AvatarResponse> =
            jsonHandler<AvatarResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AvatarRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvatarResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("avatarId", params.avatarId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "avatars", params._pathParam(0))
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

        private val updateHandler: Handler<AvatarResponse> =
            jsonHandler<AvatarResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AvatarUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvatarResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("avatarId", params.avatarId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "avatars", params._pathParam(0))
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

        private val listHandler: Handler<AvatarListPageResponse> =
            jsonHandler<AvatarListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AvatarListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvatarListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "avatars")
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
                        AvatarListPage.builder()
                            .service(AvatarServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
