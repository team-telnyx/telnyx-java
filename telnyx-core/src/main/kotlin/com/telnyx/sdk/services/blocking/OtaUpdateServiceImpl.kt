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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.otaupdates.OtaUpdateListPage
import com.telnyx.sdk.models.otaupdates.OtaUpdateListPageResponse
import com.telnyx.sdk.models.otaupdates.OtaUpdateListParams
import com.telnyx.sdk.models.otaupdates.OtaUpdateRetrieveParams
import com.telnyx.sdk.models.otaupdates.OtaUpdateRetrieveResponse
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
    ): OtaUpdateListPage =
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

        private val listHandler: Handler<OtaUpdateListPageResponse> =
            jsonHandler<OtaUpdateListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OtaUpdateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OtaUpdateListPage> {
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
                    .let {
                        OtaUpdateListPage.builder()
                            .service(OtaUpdateServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
