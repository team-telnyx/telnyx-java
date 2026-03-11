// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
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
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateParams
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPage
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListPageResponse
import com.telnyx.sdk.models.whatsapp.messagetemplates.MessageTemplateListParams
import java.util.function.Consumer

/** Manage Whatsapp message templates */
class MessageTemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageTemplateService {

    private val withRawResponse: MessageTemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MessageTemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageTemplateService =
        MessageTemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MessageTemplateCreateParams,
        requestOptions: RequestOptions,
    ): MessageTemplateCreateResponse =
        // post /v2/whatsapp/message_templates
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: MessageTemplateListParams,
        requestOptions: RequestOptions,
    ): MessageTemplateListPage =
        // get /v2/whatsapp/message_templates
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageTemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageTemplateService.WithRawResponse =
            MessageTemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MessageTemplateCreateResponse> =
            jsonHandler<MessageTemplateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MessageTemplateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageTemplateCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "message_templates")
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

        private val listHandler: Handler<MessageTemplateListPageResponse> =
            jsonHandler<MessageTemplateListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MessageTemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageTemplateListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "whatsapp", "message_templates")
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
                        MessageTemplateListPage.builder()
                            .service(MessageTemplateServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
