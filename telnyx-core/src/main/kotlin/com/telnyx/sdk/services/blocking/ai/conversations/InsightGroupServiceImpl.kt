// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations

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
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupDeleteParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupDeleteResponse
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupInsightGroupsParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveInsightGroupsResponse
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupRetrieveParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightGroupUpdateParams
import com.telnyx.sdk.models.ai.conversations.insightgroups.InsightTemplateGroupDetail
import com.telnyx.sdk.services.blocking.ai.conversations.insightgroups.InsightService
import com.telnyx.sdk.services.blocking.ai.conversations.insightgroups.InsightServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InsightGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InsightGroupService {

    private val withRawResponse: InsightGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val insights: InsightService by lazy { InsightServiceImpl(clientOptions) }

    override fun withRawResponse(): InsightGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightGroupService =
        InsightGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun insights(): InsightService = insights

    override fun retrieve(
        params: InsightGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): InsightTemplateGroupDetail =
        // get /ai/conversations/insight-groups/{group_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: InsightGroupUpdateParams,
        requestOptions: RequestOptions,
    ): InsightTemplateGroupDetail =
        // put /ai/conversations/insight-groups/{group_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: InsightGroupDeleteParams,
        requestOptions: RequestOptions,
    ): InsightGroupDeleteResponse =
        // delete /ai/conversations/insight-groups/{group_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun insightGroups(
        params: InsightGroupInsightGroupsParams,
        requestOptions: RequestOptions,
    ): InsightTemplateGroupDetail =
        // post /ai/conversations/insight-groups
        withRawResponse().insightGroups(params, requestOptions).parse()

    override fun retrieveInsightGroups(
        params: InsightGroupRetrieveInsightGroupsParams,
        requestOptions: RequestOptions,
    ): InsightGroupRetrieveInsightGroupsResponse =
        // get /ai/conversations/insight-groups
        withRawResponse().retrieveInsightGroups(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InsightGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val insights: InsightService.WithRawResponse by lazy {
            InsightServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightGroupService.WithRawResponse =
            InsightGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun insights(): InsightService.WithRawResponse = insights

        private val retrieveHandler: Handler<InsightTemplateGroupDetail> =
            jsonHandler<InsightTemplateGroupDetail>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InsightGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateGroupDetail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups", params._pathParam(0))
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

        private val updateHandler: Handler<InsightTemplateGroupDetail> =
            jsonHandler<InsightTemplateGroupDetail>(clientOptions.jsonMapper)

        override fun update(
            params: InsightGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateGroupDetail> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups", params._pathParam(0))
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

        private val deleteHandler: Handler<InsightGroupDeleteResponse> =
            jsonHandler<InsightGroupDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: InsightGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightGroupDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupId", params.groupId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups", params._pathParam(0))
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

        private val insightGroupsHandler: Handler<InsightTemplateGroupDetail> =
            jsonHandler<InsightTemplateGroupDetail>(clientOptions.jsonMapper)

        override fun insightGroups(
            params: InsightGroupInsightGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightTemplateGroupDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { insightGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveInsightGroupsHandler:
            Handler<InsightGroupRetrieveInsightGroupsResponse> =
            jsonHandler<InsightGroupRetrieveInsightGroupsResponse>(clientOptions.jsonMapper)

        override fun retrieveInsightGroups(
            params: InsightGroupRetrieveInsightGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightGroupRetrieveInsightGroupsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "conversations", "insight-groups")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveInsightGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
