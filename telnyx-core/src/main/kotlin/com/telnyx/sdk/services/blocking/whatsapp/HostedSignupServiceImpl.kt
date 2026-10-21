// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

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
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupCreateResponse
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupListPage
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupListPageResponse
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupListParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupRetrieveParams
import com.telnyx.sdk.models.whatsapp.hostedsignups.HostedSignupRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HostedSignupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HostedSignupService {

    private val withRawResponse: HostedSignupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HostedSignupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HostedSignupService =
        HostedSignupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: HostedSignupCreateParams,
        requestOptions: RequestOptions,
    ): HostedSignupCreateResponse =
        // post /whatsapp/hosted_signups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: HostedSignupRetrieveParams,
        requestOptions: RequestOptions,
    ): HostedSignupRetrieveResponse =
        // get /whatsapp/hosted_signups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: HostedSignupListParams,
        requestOptions: RequestOptions,
    ): HostedSignupListPage =
        // get /whatsapp/hosted_signups
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HostedSignupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HostedSignupService.WithRawResponse =
            HostedSignupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<HostedSignupCreateResponse> =
            jsonHandler<HostedSignupCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: HostedSignupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HostedSignupCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("whatsapp", "hosted_signups")
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

        private val retrieveHandler: Handler<HostedSignupRetrieveResponse> =
            jsonHandler<HostedSignupRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HostedSignupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HostedSignupRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("whatsapp", "hosted_signups", params._pathParam(0))
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

        private val listHandler: Handler<HostedSignupListPageResponse> =
            jsonHandler<HostedSignupListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: HostedSignupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HostedSignupListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("whatsapp", "hosted_signups")
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
                        HostedSignupListPage.builder()
                            .service(HostedSignupServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
