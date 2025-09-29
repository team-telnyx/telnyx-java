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
import com.telnyx.api.models.requirementgroups.RequirementGroup
import com.telnyx.api.models.requirementgroups.RequirementGroupCreateParams
import com.telnyx.api.models.requirementgroups.RequirementGroupDeleteParams
import com.telnyx.api.models.requirementgroups.RequirementGroupListParams
import com.telnyx.api.models.requirementgroups.RequirementGroupRetrieveParams
import com.telnyx.api.models.requirementgroups.RequirementGroupSubmitForApprovalParams
import com.telnyx.api.models.requirementgroups.RequirementGroupUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RequirementGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RequirementGroupService {

    private val withRawResponse: RequirementGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RequirementGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementGroupService =
        RequirementGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RequirementGroupCreateParams,
        requestOptions: RequestOptions,
    ): RequirementGroup =
        // post /requirement_groups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RequirementGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): RequirementGroup =
        // get /requirement_groups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: RequirementGroupUpdateParams,
        requestOptions: RequestOptions,
    ): RequirementGroup =
        // patch /requirement_groups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: RequirementGroupListParams,
        requestOptions: RequestOptions,
    ): List<RequirementGroup> =
        // get /requirement_groups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: RequirementGroupDeleteParams,
        requestOptions: RequestOptions,
    ): RequirementGroup =
        // delete /requirement_groups/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun submitForApproval(
        params: RequirementGroupSubmitForApprovalParams,
        requestOptions: RequestOptions,
    ): RequirementGroup =
        // post /requirement_groups/{id}/submit_for_approval
        withRawResponse().submitForApproval(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RequirementGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequirementGroupService.WithRawResponse =
            RequirementGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun create(
            params: RequirementGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementGroup> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups")
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

        private val retrieveHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RequirementGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups", params._pathParam(0))
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

        private val updateHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun update(
            params: RequirementGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups", params._pathParam(0))
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

        private val listHandler: Handler<List<RequirementGroup>> =
            jsonHandler<List<RequirementGroup>>(clientOptions.jsonMapper)

        override fun list(
            params: RequirementGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RequirementGroup>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun delete(
            params: RequirementGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("requirement_groups", params._pathParam(0))
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

        private val submitForApprovalHandler: Handler<RequirementGroup> =
            jsonHandler<RequirementGroup>(clientOptions.jsonMapper)

        override fun submitForApproval(
            params: RequirementGroupSubmitForApprovalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "requirement_groups",
                        params._pathParam(0),
                        "submit_for_approval",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitForApprovalHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
