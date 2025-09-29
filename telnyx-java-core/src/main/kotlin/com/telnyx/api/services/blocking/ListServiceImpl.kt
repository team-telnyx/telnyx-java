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
import com.telnyx.api.models.list.ListRetrieveAllParams
import com.telnyx.api.models.list.ListRetrieveAllResponse
import com.telnyx.api.models.list.ListRetrieveByZoneParams
import com.telnyx.api.models.list.ListRetrieveByZoneResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ListServiceImpl internal constructor(private val clientOptions: ClientOptions) : ListService {

    private val withRawResponse: ListService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ListService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService =
        ListServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveAll(
        params: ListRetrieveAllParams,
        requestOptions: RequestOptions,
    ): ListRetrieveAllResponse =
        // get /list
        withRawResponse().retrieveAll(params, requestOptions).parse()

    override fun retrieveByZone(
        params: ListRetrieveByZoneParams,
        requestOptions: RequestOptions,
    ): ListRetrieveByZoneResponse =
        // get /list/{channel_zone_id}
        withRawResponse().retrieveByZone(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListService.WithRawResponse =
            ListServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveAllHandler: Handler<ListRetrieveAllResponse> =
            jsonHandler<ListRetrieveAllResponse>(clientOptions.jsonMapper)

        override fun retrieveAll(
            params: ListRetrieveAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListRetrieveAllResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("list")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveByZoneHandler: Handler<ListRetrieveByZoneResponse> =
            jsonHandler<ListRetrieveByZoneResponse>(clientOptions.jsonMapper)

        override fun retrieveByZone(
            params: ListRetrieveByZoneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListRetrieveByZoneResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelZoneId", params.channelZoneId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("list", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveByZoneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
