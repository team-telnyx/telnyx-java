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
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentCreateParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentCreateResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentDeleteParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentDeleteResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListPage
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListPageResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentListParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentRetrieveParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentRetrieveResponse
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateParams
import com.telnyx.sdk.models.globalipassignments.GlobalIpAssignmentUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GlobalIpAssignmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GlobalIpAssignmentService {

    private val withRawResponse: GlobalIpAssignmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GlobalIpAssignmentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalIpAssignmentService =
        GlobalIpAssignmentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: GlobalIpAssignmentCreateParams,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentCreateResponse =
        // post /global_ip_assignments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: GlobalIpAssignmentRetrieveParams,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentRetrieveResponse =
        // get /global_ip_assignments/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: GlobalIpAssignmentUpdateParams,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentUpdateResponse =
        // patch /global_ip_assignments/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: GlobalIpAssignmentListParams,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentListPage =
        // get /global_ip_assignments
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: GlobalIpAssignmentDeleteParams,
        requestOptions: RequestOptions,
    ): GlobalIpAssignmentDeleteResponse =
        // delete /global_ip_assignments/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GlobalIpAssignmentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GlobalIpAssignmentService.WithRawResponse =
            GlobalIpAssignmentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<GlobalIpAssignmentCreateResponse> =
            jsonHandler<GlobalIpAssignmentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: GlobalIpAssignmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_assignments")
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

        private val retrieveHandler: Handler<GlobalIpAssignmentRetrieveResponse> =
            jsonHandler<GlobalIpAssignmentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: GlobalIpAssignmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_assignments", params._pathParam(0))
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

        private val updateHandler: Handler<GlobalIpAssignmentUpdateResponse> =
            jsonHandler<GlobalIpAssignmentUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: GlobalIpAssignmentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("globalIpAssignmentId", params.globalIpAssignmentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_assignments", params._pathParam(0))
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

        private val listHandler: Handler<GlobalIpAssignmentListPageResponse> =
            jsonHandler<GlobalIpAssignmentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: GlobalIpAssignmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_assignments")
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
                        GlobalIpAssignmentListPage.builder()
                            .service(GlobalIpAssignmentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<GlobalIpAssignmentDeleteResponse> =
            jsonHandler<GlobalIpAssignmentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: GlobalIpAssignmentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GlobalIpAssignmentDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("global_ip_assignments", params._pathParam(0))
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
