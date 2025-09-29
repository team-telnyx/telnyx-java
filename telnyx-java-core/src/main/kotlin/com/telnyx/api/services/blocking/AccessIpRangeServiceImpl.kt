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
import com.telnyx.api.models.accessipranges.AccessIpRange
import com.telnyx.api.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.api.models.accessipranges.AccessIpRangeDeleteParams
import com.telnyx.api.models.accessipranges.AccessIpRangeListParams
import com.telnyx.api.models.accessipranges.AccessIpRangeListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccessIpRangeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccessIpRangeService {

    private val withRawResponse: AccessIpRangeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccessIpRangeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccessIpRangeService =
        AccessIpRangeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AccessIpRangeCreateParams,
        requestOptions: RequestOptions,
    ): AccessIpRange =
        // post /access_ip_ranges
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: AccessIpRangeListParams,
        requestOptions: RequestOptions,
    ): AccessIpRangeListResponse =
        // get /access_ip_ranges
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AccessIpRangeDeleteParams,
        requestOptions: RequestOptions,
    ): AccessIpRange =
        // delete /access_ip_ranges/{access_ip_range_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccessIpRangeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccessIpRangeService.WithRawResponse =
            AccessIpRangeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AccessIpRange> =
            jsonHandler<AccessIpRange>(clientOptions.jsonMapper)

        override fun create(
            params: AccessIpRangeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpRange> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_ranges")
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

        private val listHandler: Handler<AccessIpRangeListResponse> =
            jsonHandler<AccessIpRangeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccessIpRangeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpRangeListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_ranges")
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

        private val deleteHandler: Handler<AccessIpRange> =
            jsonHandler<AccessIpRange>(clientOptions.jsonMapper)

        override fun delete(
            params: AccessIpRangeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpRange> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accessIpRangeId", params.accessIpRangeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("access_ip_ranges", params._pathParam(0))
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
