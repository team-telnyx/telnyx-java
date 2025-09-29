// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
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
import com.telnyx.api.models.inboundchannels.InboundChannelListParams
import com.telnyx.api.models.inboundchannels.InboundChannelListResponse
import com.telnyx.api.models.inboundchannels.InboundChannelUpdateParams
import com.telnyx.api.models.inboundchannels.InboundChannelUpdateResponse
import java.util.function.Consumer

class InboundChannelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboundChannelService {

    private val withRawResponse: InboundChannelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundChannelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundChannelService =
        InboundChannelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: InboundChannelUpdateParams,
        requestOptions: RequestOptions,
    ): InboundChannelUpdateResponse =
        // patch /inbound_channels
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: InboundChannelListParams,
        requestOptions: RequestOptions,
    ): InboundChannelListResponse =
        // get /inbound_channels
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundChannelService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundChannelService.WithRawResponse =
            InboundChannelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<InboundChannelUpdateResponse> =
            jsonHandler<InboundChannelUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: InboundChannelUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundChannelUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_channels")
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

        private val listHandler: Handler<InboundChannelListResponse> =
            jsonHandler<InboundChannelListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InboundChannelListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundChannelListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_channels")
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
