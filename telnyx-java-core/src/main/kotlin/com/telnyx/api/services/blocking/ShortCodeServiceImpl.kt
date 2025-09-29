// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.models.shortcodes.ShortCodeListParams
import com.telnyx.api.models.shortcodes.ShortCodeListResponse
import com.telnyx.api.models.shortcodes.ShortCodeRetrieveParams
import com.telnyx.api.models.shortcodes.ShortCodeRetrieveResponse
import com.telnyx.api.models.shortcodes.ShortCodeUpdateParams
import com.telnyx.api.models.shortcodes.ShortCodeUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ShortCodeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ShortCodeService {

    private val withRawResponse: ShortCodeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShortCodeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ShortCodeService =
        ShortCodeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ShortCodeRetrieveParams,
        requestOptions: RequestOptions,
    ): ShortCodeRetrieveResponse =
        // get /short_codes/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ShortCodeUpdateParams,
        requestOptions: RequestOptions,
    ): ShortCodeUpdateResponse =
        // patch /short_codes/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ShortCodeListParams,
        requestOptions: RequestOptions,
    ): ShortCodeListResponse =
        // get /short_codes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShortCodeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ShortCodeService.WithRawResponse =
            ShortCodeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ShortCodeRetrieveResponse> =
            jsonHandler<ShortCodeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ShortCodeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShortCodeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("short_codes", params._pathParam(0))
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

        private val updateHandler: Handler<ShortCodeUpdateResponse> =
            jsonHandler<ShortCodeUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ShortCodeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShortCodeUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("short_codes", params._pathParam(0))
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

        private val listHandler: Handler<ShortCodeListResponse> =
            jsonHandler<ShortCodeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ShortCodeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ShortCodeListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("short_codes")
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
    }
}
