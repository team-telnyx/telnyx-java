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
import com.telnyx.api.models.messages.MessageCancelScheduledParams
import com.telnyx.api.models.messages.MessageCancelScheduledResponse
import com.telnyx.api.models.messages.MessageRetrieveParams
import com.telnyx.api.models.messages.MessageRetrieveResponse
import com.telnyx.api.models.messages.MessageScheduleParams
import com.telnyx.api.models.messages.MessageScheduleResponse
import com.telnyx.api.models.messages.MessageSendGroupMmsParams
import com.telnyx.api.models.messages.MessageSendGroupMmsResponse
import com.telnyx.api.models.messages.MessageSendLongCodeParams
import com.telnyx.api.models.messages.MessageSendLongCodeResponse
import com.telnyx.api.models.messages.MessageSendNumberPoolParams
import com.telnyx.api.models.messages.MessageSendNumberPoolResponse
import com.telnyx.api.models.messages.MessageSendParams
import com.telnyx.api.models.messages.MessageSendResponse
import com.telnyx.api.models.messages.MessageSendShortCodeParams
import com.telnyx.api.models.messages.MessageSendShortCodeResponse
import com.telnyx.api.services.blocking.messages.RcService
import com.telnyx.api.services.blocking.messages.RcServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MessageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MessageService {

    private val withRawResponse: MessageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val rcs: RcService by lazy { RcServiceImpl(clientOptions) }

    override fun withRawResponse(): MessageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService =
        MessageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun rcs(): RcService = rcs

    override fun retrieve(
        params: MessageRetrieveParams,
        requestOptions: RequestOptions,
    ): MessageRetrieveResponse =
        // get /messages/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun cancelScheduled(
        params: MessageCancelScheduledParams,
        requestOptions: RequestOptions,
    ): MessageCancelScheduledResponse =
        // delete /messages/{id}
        withRawResponse().cancelScheduled(params, requestOptions).parse()

    override fun schedule(
        params: MessageScheduleParams,
        requestOptions: RequestOptions,
    ): MessageScheduleResponse =
        // post /messages/schedule
        withRawResponse().schedule(params, requestOptions).parse()

    override fun send(
        params: MessageSendParams,
        requestOptions: RequestOptions,
    ): MessageSendResponse =
        // post /messages
        withRawResponse().send(params, requestOptions).parse()

    override fun sendGroupMms(
        params: MessageSendGroupMmsParams,
        requestOptions: RequestOptions,
    ): MessageSendGroupMmsResponse =
        // post /messages/group_mms
        withRawResponse().sendGroupMms(params, requestOptions).parse()

    override fun sendLongCode(
        params: MessageSendLongCodeParams,
        requestOptions: RequestOptions,
    ): MessageSendLongCodeResponse =
        // post /messages/long_code
        withRawResponse().sendLongCode(params, requestOptions).parse()

    override fun sendNumberPool(
        params: MessageSendNumberPoolParams,
        requestOptions: RequestOptions,
    ): MessageSendNumberPoolResponse =
        // post /messages/number_pool
        withRawResponse().sendNumberPool(params, requestOptions).parse()

    override fun sendShortCode(
        params: MessageSendShortCodeParams,
        requestOptions: RequestOptions,
    ): MessageSendShortCodeResponse =
        // post /messages/short_code
        withRawResponse().sendShortCode(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MessageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val rcs: RcService.WithRawResponse by lazy {
            RcServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageService.WithRawResponse =
            MessageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun rcs(): RcService.WithRawResponse = rcs

        private val retrieveHandler: Handler<MessageRetrieveResponse> =
            jsonHandler<MessageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MessageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", params._pathParam(0))
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

        private val cancelScheduledHandler: Handler<MessageCancelScheduledResponse> =
            jsonHandler<MessageCancelScheduledResponse>(clientOptions.jsonMapper)

        override fun cancelScheduled(
            params: MessageCancelScheduledParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageCancelScheduledResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelScheduledHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val scheduleHandler: Handler<MessageScheduleResponse> =
            jsonHandler<MessageScheduleResponse>(clientOptions.jsonMapper)

        override fun schedule(
            params: MessageScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageScheduleResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { scheduleHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<MessageSendResponse> =
            jsonHandler<MessageSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: MessageSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageSendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendGroupMmsHandler: Handler<MessageSendGroupMmsResponse> =
            jsonHandler<MessageSendGroupMmsResponse>(clientOptions.jsonMapper)

        override fun sendGroupMms(
            params: MessageSendGroupMmsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageSendGroupMmsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "group_mms")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendGroupMmsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendLongCodeHandler: Handler<MessageSendLongCodeResponse> =
            jsonHandler<MessageSendLongCodeResponse>(clientOptions.jsonMapper)

        override fun sendLongCode(
            params: MessageSendLongCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageSendLongCodeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "long_code")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendLongCodeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendNumberPoolHandler: Handler<MessageSendNumberPoolResponse> =
            jsonHandler<MessageSendNumberPoolResponse>(clientOptions.jsonMapper)

        override fun sendNumberPool(
            params: MessageSendNumberPoolParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageSendNumberPoolResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "number_pool")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendNumberPoolHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendShortCodeHandler: Handler<MessageSendShortCodeResponse> =
            jsonHandler<MessageSendShortCodeResponse>(clientOptions.jsonMapper)

        override fun sendShortCode(
            params: MessageSendShortCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageSendShortCodeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "short_code")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendShortCodeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
