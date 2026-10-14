// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedAssistant
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedGetParams
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedListPage
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedListPageResponse
import com.telnyx.sdk.models.ai.assistants.deleted.DeletedListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Configure AI assistant specifications */
class DeletedServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DeletedService {

    private val withRawResponse: DeletedService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeletedService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeletedService =
        DeletedServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: DeletedListParams, requestOptions: RequestOptions): DeletedListPage =
        // get /ai/assistants/deleted
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: DeletedGetParams, requestOptions: RequestOptions): DeletedAssistant =
        // get /ai/assistants/{assistant_id}/deleted
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeletedService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeletedService.WithRawResponse =
            DeletedServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<DeletedListPageResponse> =
            jsonHandler<DeletedListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DeletedListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeletedListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", "deleted")
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
                        DeletedListPage.builder()
                            .service(DeletedServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<DeletedAssistant> =
            jsonHandler<DeletedAssistant>(clientOptions.jsonMapper)

        override fun get(
            params: DeletedGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeletedAssistant> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("assistantId", params.assistantId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "assistants", params._pathParam(0), "deleted")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
