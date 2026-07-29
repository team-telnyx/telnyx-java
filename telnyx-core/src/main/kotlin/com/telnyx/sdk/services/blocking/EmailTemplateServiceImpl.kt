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
import com.telnyx.sdk.models.emailtemplates.EmailTemplateCreateParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateDeleteParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateListParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateListResponse
import com.telnyx.sdk.models.emailtemplates.EmailTemplateRenderParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateRenderResponse
import com.telnyx.sdk.models.emailtemplates.EmailTemplateReplaceParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateResponse
import com.telnyx.sdk.models.emailtemplates.EmailTemplateRetrieveParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create, list, retrieve, update, delete, and render Liquid email templates. */
class EmailTemplateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailTemplateService {

    private val withRawResponse: EmailTemplateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmailTemplateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailTemplateService =
        EmailTemplateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EmailTemplateCreateParams,
        requestOptions: RequestOptions,
    ): EmailTemplateResponse =
        // post /email_templates
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EmailTemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): EmailTemplateResponse =
        // get /email_templates/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EmailTemplateUpdateParams,
        requestOptions: RequestOptions,
    ): EmailTemplateResponse =
        // patch /email_templates/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EmailTemplateListParams,
        requestOptions: RequestOptions,
    ): EmailTemplateListResponse =
        // get /email_templates
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: EmailTemplateDeleteParams, requestOptions: RequestOptions) {
        // delete /email_templates/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun render(
        params: EmailTemplateRenderParams,
        requestOptions: RequestOptions,
    ): EmailTemplateRenderResponse =
        // post /email_templates/{id}/render
        withRawResponse().render(params, requestOptions).parse()

    override fun replace(
        params: EmailTemplateReplaceParams,
        requestOptions: RequestOptions,
    ): EmailTemplateResponse =
        // put /email_templates/{id}
        withRawResponse().replace(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailTemplateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailTemplateService.WithRawResponse =
            EmailTemplateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmailTemplateResponse> =
            jsonHandler<EmailTemplateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailTemplateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_templates")
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

        private val retrieveHandler: Handler<EmailTemplateResponse> =
            jsonHandler<EmailTemplateResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailTemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_templates", params._pathParam(0))
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

        private val updateHandler: Handler<EmailTemplateResponse> =
            jsonHandler<EmailTemplateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EmailTemplateUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_templates", params._pathParam(0))
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

        private val listHandler: Handler<EmailTemplateListResponse> =
            jsonHandler<EmailTemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailTemplateListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_templates")
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
            params: EmailTemplateDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_templates", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val renderHandler: Handler<EmailTemplateRenderResponse> =
            jsonHandler<EmailTemplateRenderResponse>(clientOptions.jsonMapper)

        override fun render(
            params: EmailTemplateRenderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateRenderResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_templates", params._pathParam(0), "render")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { renderHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceHandler: Handler<EmailTemplateResponse> =
            jsonHandler<EmailTemplateResponse>(clientOptions.jsonMapper)

        override fun replace(
            params: EmailTemplateReplaceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_templates", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
