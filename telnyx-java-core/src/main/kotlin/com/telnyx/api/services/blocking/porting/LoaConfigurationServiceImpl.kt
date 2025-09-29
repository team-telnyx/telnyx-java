// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.porting

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationCreateParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationCreateResponse
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationDeleteParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationListParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationListResponse
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationPreview0Params
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationPreview1Params
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationRetrieveParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationRetrieveResponse
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationUpdateParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LoaConfigurationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LoaConfigurationService {

    private val withRawResponse: LoaConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LoaConfigurationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoaConfigurationService =
        LoaConfigurationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: LoaConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): LoaConfigurationCreateResponse =
        // post /porting/loa_configurations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LoaConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): LoaConfigurationRetrieveResponse =
        // get /porting/loa_configurations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LoaConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): LoaConfigurationUpdateResponse =
        // patch /porting/loa_configurations/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LoaConfigurationListParams,
        requestOptions: RequestOptions,
    ): LoaConfigurationListResponse =
        // get /porting/loa_configurations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LoaConfigurationDeleteParams, requestOptions: RequestOptions) {
        // delete /porting/loa_configurations/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun preview0(
        params: LoaConfigurationPreview0Params,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /porting/loa_configuration/preview
        withRawResponse().preview0(params, requestOptions)

    override fun preview1(
        params: LoaConfigurationPreview1Params,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /porting/loa_configurations/{id}/preview
        withRawResponse().preview1(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LoaConfigurationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LoaConfigurationService.WithRawResponse =
            LoaConfigurationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<LoaConfigurationCreateResponse> =
            jsonHandler<LoaConfigurationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LoaConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoaConfigurationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations")
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

        private val retrieveHandler: Handler<LoaConfigurationRetrieveResponse> =
            jsonHandler<LoaConfigurationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LoaConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoaConfigurationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations", params._pathParam(0))
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

        private val updateHandler: Handler<LoaConfigurationUpdateResponse> =
            jsonHandler<LoaConfigurationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LoaConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoaConfigurationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations", params._pathParam(0))
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

        private val listHandler: Handler<LoaConfigurationListResponse> =
            jsonHandler<LoaConfigurationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LoaConfigurationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoaConfigurationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: LoaConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configurations", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        override fun preview0(
            params: LoaConfigurationPreview0Params,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting", "loa_configuration", "preview")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun preview1(
            params: LoaConfigurationPreview1Params,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "porting",
                        "loa_configurations",
                        params._pathParam(0),
                        "preview",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
