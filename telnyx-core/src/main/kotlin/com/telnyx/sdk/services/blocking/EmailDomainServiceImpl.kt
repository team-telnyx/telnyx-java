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
import com.telnyx.sdk.models.emaildomains.EmailDomainCreateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainDeleteParams
import com.telnyx.sdk.models.emaildomains.EmailDomainListPage
import com.telnyx.sdk.models.emaildomains.EmailDomainListPageResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainListParams
import com.telnyx.sdk.models.emaildomains.EmailDomainResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveDnsRecordsParams
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveDnsRecordsResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveHealthParams
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveHealthResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveParams
import com.telnyx.sdk.models.emaildomains.EmailDomainUpdateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainVerifyParams
import com.telnyx.sdk.services.blocking.emaildomains.WebhookService
import com.telnyx.sdk.services.blocking.emaildomains.WebhookServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmailDomainServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailDomainService {

    private val withRawResponse: EmailDomainService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    override fun withRawResponse(): EmailDomainService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailDomainService =
        EmailDomainServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Per-domain webhook endpoints with event subscriptions */
    override fun webhooks(): WebhookService = webhooks

    override fun create(
        params: EmailDomainCreateParams,
        requestOptions: RequestOptions,
    ): EmailDomainResponse =
        // post /email_domains
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EmailDomainRetrieveParams,
        requestOptions: RequestOptions,
    ): EmailDomainResponse =
        // get /email_domains/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EmailDomainUpdateParams,
        requestOptions: RequestOptions,
    ): EmailDomainResponse =
        // patch /email_domains/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EmailDomainListParams,
        requestOptions: RequestOptions,
    ): EmailDomainListPage =
        // get /email_domains
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: EmailDomainDeleteParams,
        requestOptions: RequestOptions,
    ): EmailDomainResponse =
        // delete /email_domains/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveDnsRecords(
        params: EmailDomainRetrieveDnsRecordsParams,
        requestOptions: RequestOptions,
    ): EmailDomainRetrieveDnsRecordsResponse =
        // get /email_domains/{domain_id}/dns_records
        withRawResponse().retrieveDnsRecords(params, requestOptions).parse()

    override fun retrieveHealth(
        params: EmailDomainRetrieveHealthParams,
        requestOptions: RequestOptions,
    ): EmailDomainRetrieveHealthResponse =
        // get /email_domains/{id}/health
        withRawResponse().retrieveHealth(params, requestOptions).parse()

    override fun verify(
        params: EmailDomainVerifyParams,
        requestOptions: RequestOptions,
    ): EmailDomainResponse =
        // post /email_domains/{domain_id}/verify
        withRawResponse().verify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailDomainService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailDomainService.WithRawResponse =
            EmailDomainServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Per-domain webhook endpoints with event subscriptions */
        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        private val createHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailDomainCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains")
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

        private val retrieveHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailDomainRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0))
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

        private val updateHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EmailDomainUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0))
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

        private val listHandler: Handler<EmailDomainListPageResponse> =
            jsonHandler<EmailDomainListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailDomainListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains")
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
                        EmailDomainListPage.builder()
                            .service(EmailDomainServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: EmailDomainDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0))
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

        private val retrieveDnsRecordsHandler: Handler<EmailDomainRetrieveDnsRecordsResponse> =
            jsonHandler<EmailDomainRetrieveDnsRecordsResponse>(clientOptions.jsonMapper)

        override fun retrieveDnsRecords(
            params: EmailDomainRetrieveDnsRecordsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domainId", params.domainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0), "dns_records")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveDnsRecordsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHealthHandler: Handler<EmailDomainRetrieveHealthResponse> =
            jsonHandler<EmailDomainRetrieveHealthResponse>(clientOptions.jsonMapper)

        override fun retrieveHealth(
            params: EmailDomainRetrieveHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainRetrieveHealthResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0), "health")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHealthHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: EmailDomainVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domainId", params.domainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0), "verify")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
