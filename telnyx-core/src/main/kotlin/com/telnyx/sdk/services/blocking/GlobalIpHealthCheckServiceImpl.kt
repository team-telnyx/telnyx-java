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
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckCreateParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckCreateResponse
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckDeleteParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckDeleteResponse
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckListPage
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckListPageResponse
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckListParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckRetrieveParams
import com.telnyx.sdk.models.globaliphealthchecks.GlobalIpHealthCheckRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GlobalIpHealthCheckServiceImpl
internal constructor(private val clientOptions: ClientOptions) : GlobalIpHealthCheckService {

    private val withRawResponse: GlobalIpHealthCheckService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpHealthCheckService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): GlobalIpHealthCheckService =
        GlobalIpHealthCheckServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GlobalIpHealthCheckCreateParams,
        requestOptions: RequestOptions,
    ): GlobalIpHealthCheckCreateResponse =
        // post /global_ip_health_checks
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: GlobalIpHealthCheckRetrieveParams,
        requestOptions: RequestOptions,
    ): GlobalIpHealthCheckRetrieveResponse =
        // get /global_ip_health_checks/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: GlobalIpHealthCheckListParams,
        requestOptions: RequestOptions,
    ): GlobalIpHealthCheckListPage =
        // get /global_ip_health_checks
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: GlobalIpHealthCheckDeleteParams,
        requestOptions: RequestOptions,
    ): GlobalIpHealthCheckDeleteResponse =
        // delete /global_ip_health_checks/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpHealthCheckService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpHealthCheckService.WithRawResponse =
            GlobalIpHealthCheckServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GlobalIpHealthCheckCreateResponse> =
            jsonHandler<GlobalIpHealthCheckCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GlobalIpHealthCheckCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpHealthCheckCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_health_checks")
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

        private val retrieveHandler: Handler<GlobalIpHealthCheckRetrieveResponse> =
            jsonHandler<GlobalIpHealthCheckRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalIpHealthCheckRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpHealthCheckRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_health_checks", params._pathParam(0))
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

        private val listHandler: Handler<GlobalIpHealthCheckListPageResponse> =
            jsonHandler<GlobalIpHealthCheckListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpHealthCheckListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpHealthCheckListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_health_checks")
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
                        GlobalIpHealthCheckListPage.builder()
                            .service(GlobalIpHealthCheckServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<GlobalIpHealthCheckDeleteResponse> =
            jsonHandler<GlobalIpHealthCheckDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: GlobalIpHealthCheckDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpHealthCheckDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_health_checks", params._pathParam(0))
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
