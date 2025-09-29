// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.storage

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
import com.telnyx.api.models.storage.migrations.MigrationCreateParams
import com.telnyx.api.models.storage.migrations.MigrationCreateResponse
import com.telnyx.api.models.storage.migrations.MigrationListParams
import com.telnyx.api.models.storage.migrations.MigrationListResponse
import com.telnyx.api.models.storage.migrations.MigrationRetrieveParams
import com.telnyx.api.models.storage.migrations.MigrationRetrieveResponse
import com.telnyx.api.services.blocking.storage.migrations.ActionService
import com.telnyx.api.services.blocking.storage.migrations.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MigrationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MigrationService {

    private val withRawResponse: MigrationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): MigrationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationService =
        MigrationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: MigrationCreateParams,
        requestOptions: RequestOptions,
    ): MigrationCreateResponse =
        // post /storage/migrations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MigrationRetrieveParams,
        requestOptions: RequestOptions,
    ): MigrationRetrieveResponse =
        // get /storage/migrations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MigrationListParams,
        requestOptions: RequestOptions,
    ): MigrationListResponse =
        // get /storage/migrations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MigrationService.WithRawResponse =
            MigrationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<MigrationCreateResponse> =
            jsonHandler<MigrationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MigrationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migrations")
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

        private val retrieveHandler: Handler<MigrationRetrieveResponse> =
            jsonHandler<MigrationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MigrationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migrations", params._pathParam(0))
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

        private val listHandler: Handler<MigrationListResponse> =
            jsonHandler<MigrationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MigrationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migrations")
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
