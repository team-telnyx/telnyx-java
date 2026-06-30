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
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialCreateParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialDeleteParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListPage
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListPageResponse
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialListParams
import com.telnyx.sdk.models.mobilepushcredentials.MobilePushCredentialRetrieveParams
import com.telnyx.sdk.models.mobilepushcredentials.PushCredentialResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Mobile push credential management */
class MobilePushCredentialServiceImpl
internal constructor(private val clientOptions: ClientOptions) : MobilePushCredentialService {

    private val withRawResponse: MobilePushCredentialService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MobilePushCredentialService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MobilePushCredentialService =
        MobilePushCredentialServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MobilePushCredentialCreateParams,
        requestOptions: RequestOptions,
    ): PushCredentialResponse =
        // post /mobile_push_credentials
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MobilePushCredentialRetrieveParams,
        requestOptions: RequestOptions,
    ): PushCredentialResponse =
        // get /mobile_push_credentials/{push_credential_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MobilePushCredentialListParams,
        requestOptions: RequestOptions,
    ): MobilePushCredentialListPage =
        // get /mobile_push_credentials
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MobilePushCredentialDeleteParams, requestOptions: RequestOptions) {
        // delete /mobile_push_credentials/{push_credential_id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MobilePushCredentialService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MobilePushCredentialService.WithRawResponse =
            MobilePushCredentialServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PushCredentialResponse> =
            jsonHandler<PushCredentialResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MobilePushCredentialCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PushCredentialResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials")
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

        private val retrieveHandler: Handler<PushCredentialResponse> =
            jsonHandler<PushCredentialResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MobilePushCredentialRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PushCredentialResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pushCredentialId", params.pushCredentialId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials", params._pathParam(0))
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

        private val listHandler: Handler<MobilePushCredentialListPageResponse> =
            jsonHandler<MobilePushCredentialListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MobilePushCredentialListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobilePushCredentialListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials")
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
                        MobilePushCredentialListPage.builder()
                            .service(MobilePushCredentialServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MobilePushCredentialDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pushCredentialId", params.pushCredentialId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("mobile_push_credentials", params._pathParam(0))
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
