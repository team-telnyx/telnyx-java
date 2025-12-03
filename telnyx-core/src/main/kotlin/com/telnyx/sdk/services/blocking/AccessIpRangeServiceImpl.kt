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
import com.telnyx.sdk.models.accessipranges.AccessIpRange
import com.telnyx.sdk.models.accessipranges.AccessIpRangeCreateParams
import com.telnyx.sdk.models.accessipranges.AccessIpRangeDeleteParams
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListPage
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListPageResponse
import com.telnyx.sdk.models.accessipranges.AccessIpRangeListParams
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
    ): AccessIpRangeListPage =
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

        private val listHandler: Handler<AccessIpRangeListPageResponse> =
            jsonHandler<AccessIpRangeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccessIpRangeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccessIpRangeListPage> {
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
                    .let {
                        AccessIpRangeListPage.builder()
                            .service(AccessIpRangeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
