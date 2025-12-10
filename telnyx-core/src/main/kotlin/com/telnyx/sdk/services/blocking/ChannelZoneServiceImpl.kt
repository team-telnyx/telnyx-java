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
import com.telnyx.sdk.models.channelzones.ChannelZoneListParams
import com.telnyx.sdk.models.channelzones.ChannelZoneListResponse
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateParams
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChannelZoneServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChannelZoneService {

    private val withRawResponse: ChannelZoneService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChannelZoneService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChannelZoneService =
        ChannelZoneServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: ChannelZoneUpdateParams,
        requestOptions: RequestOptions,
    ): ChannelZoneUpdateResponse =
        // put /channel_zones/{channel_zone_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ChannelZoneListParams,
        requestOptions: RequestOptions,
    ): ChannelZoneListResponse =
        // get /channel_zones
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChannelZoneService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChannelZoneService.WithRawResponse =
            ChannelZoneServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ChannelZoneUpdateResponse> =
            jsonHandler<ChannelZoneUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ChannelZoneUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelZoneUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("channelZoneId", params.channelZoneId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("channel_zones", params._pathParam(0))
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

        private val listHandler: Handler<ChannelZoneListResponse> =
            jsonHandler<ChannelZoneListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ChannelZoneListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChannelZoneListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("channel_zones")
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
