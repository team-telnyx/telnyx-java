// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretCreateResponse
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretDeleteParams
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListPage
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListPageResponse
import com.telnyx.sdk.models.integrationsecrets.IntegrationSecretListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Store and retrieve integration secrets */
class IntegrationSecretServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IntegrationSecretService {

    private val withRawResponse: IntegrationSecretService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntegrationSecretService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationSecretService =
        IntegrationSecretServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: IntegrationSecretCreateParams,
        requestOptions: RequestOptions,
    ): IntegrationSecretCreateResponse =
        // post /integration_secrets
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: IntegrationSecretListParams,
        requestOptions: RequestOptions,
    ): IntegrationSecretListPage =
        // get /integration_secrets
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: IntegrationSecretDeleteParams, requestOptions: RequestOptions) {
        // delete /integration_secrets/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegrationSecretService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationSecretService.WithRawResponse =
            IntegrationSecretServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<IntegrationSecretCreateResponse> =
            jsonHandler<IntegrationSecretCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: IntegrationSecretCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationSecretCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integration_secrets")
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

        private val listHandler: Handler<IntegrationSecretListPageResponse> =
            jsonHandler<IntegrationSecretListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: IntegrationSecretListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationSecretListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integration_secrets")
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
                        IntegrationSecretListPage.builder()
                            .service(IntegrationSecretServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: IntegrationSecretDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("integration_secrets", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
