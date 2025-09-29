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
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.otaupdates.OtaUpdateListParams
import com.telnyx.api.models.otaupdates.OtaUpdateListResponse
import com.telnyx.api.models.otaupdates.OtaUpdateRetrieveParams
import com.telnyx.api.models.otaupdates.OtaUpdateRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OtaUpdateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OtaUpdateService {

    private val withRawResponse: OtaUpdateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OtaUpdateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OtaUpdateService =
        OtaUpdateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: OtaUpdateRetrieveParams,
        requestOptions: RequestOptions,
    ): OtaUpdateRetrieveResponse =
        // get /ota_updates/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: OtaUpdateListParams,
        requestOptions: RequestOptions,
    ): OtaUpdateListResponse =
        // get /ota_updates
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OtaUpdateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OtaUpdateService.WithRawResponse =
            OtaUpdateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OtaUpdateRetrieveResponse> =
            jsonHandler<OtaUpdateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OtaUpdateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OtaUpdateRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ota_updates", params._pathParam(0))
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

        private val listHandler: Handler<OtaUpdateListResponse> =
            jsonHandler<OtaUpdateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OtaUpdateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OtaUpdateListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ota_updates")
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
