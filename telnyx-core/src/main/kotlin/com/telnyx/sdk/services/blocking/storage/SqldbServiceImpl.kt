// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

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
import com.telnyx.sdk.models.storage.sqldbs.SqlDatabaseResponseWrapper
import com.telnyx.sdk.models.storage.sqldbs.SqldbCreateParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbDeleteParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbListPage
import com.telnyx.sdk.models.storage.sqldbs.SqldbListPageResponse
import com.telnyx.sdk.models.storage.sqldbs.SqldbListParams
import com.telnyx.sdk.models.storage.sqldbs.SqldbRetrieveParams
import com.telnyx.sdk.services.blocking.storage.sqldbs.ActionService
import com.telnyx.sdk.services.blocking.storage.sqldbs.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage SQL databases and run SQL against them */
class SqldbServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SqldbService {

    private val withRawResponse: SqldbService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): SqldbService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SqldbService =
        SqldbServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage SQL databases and run SQL against them */
    override fun actions(): ActionService = actions

    override fun create(
        params: SqldbCreateParams,
        requestOptions: RequestOptions,
    ): SqlDatabaseResponseWrapper =
        // post /storage/sqldbs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SqldbRetrieveParams,
        requestOptions: RequestOptions,
    ): SqlDatabaseResponseWrapper =
        // get /storage/sqldbs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: SqldbListParams, requestOptions: RequestOptions): SqldbListPage =
        // get /storage/sqldbs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SqldbDeleteParams, requestOptions: RequestOptions) {
        // delete /storage/sqldbs/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SqldbService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SqldbService.WithRawResponse =
            SqldbServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage SQL databases and run SQL against them */
        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<SqlDatabaseResponseWrapper> =
            jsonHandler<SqlDatabaseResponseWrapper>(clientOptions.jsonMapper)

        override fun create(
            params: SqldbCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SqlDatabaseResponseWrapper> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "sqldbs")
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

        private val retrieveHandler: Handler<SqlDatabaseResponseWrapper> =
            jsonHandler<SqlDatabaseResponseWrapper>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SqldbRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SqlDatabaseResponseWrapper> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "sqldbs", params._pathParam(0))
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

        private val listHandler: Handler<SqldbListPageResponse> =
            jsonHandler<SqldbListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SqldbListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SqldbListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "sqldbs")
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
                        SqldbListPage.builder()
                            .service(SqldbServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SqldbDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "sqldbs", params._pathParam(0))
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
