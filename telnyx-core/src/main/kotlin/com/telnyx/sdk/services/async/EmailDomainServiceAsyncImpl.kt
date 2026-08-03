// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.emaildomains.EmailDomainCreateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainDeleteParams
import com.telnyx.sdk.models.emaildomains.EmailDomainListPageAsync
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
import com.telnyx.sdk.services.async.emaildomains.WebhookServiceAsync
import com.telnyx.sdk.services.async.emaildomains.WebhookServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmailDomainServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmailDomainServiceAsync {

    private val withRawResponse: EmailDomainServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EmailDomainServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailDomainServiceAsync =
        EmailDomainServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Per-domain webhook endpoints with event subscriptions */
    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun create(
        params: EmailDomainCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainResponse> =
        // post /email_domains
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EmailDomainRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainResponse> =
        // get /email_domains/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EmailDomainUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainResponse> =
        // patch /email_domains/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmailDomainListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainListPageAsync> =
        // get /email_domains
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EmailDomainDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainResponse> =
        // delete /email_domains/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun retrieveDnsRecords(
        params: EmailDomainRetrieveDnsRecordsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainRetrieveDnsRecordsResponse> =
        // get /email_domains/{domain_id}/dns_records
        withRawResponse().retrieveDnsRecords(params, requestOptions).thenApply { it.parse() }

    override fun retrieveHealth(
        params: EmailDomainRetrieveHealthParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainRetrieveHealthResponse> =
        // get /email_domains/{id}/health
        withRawResponse().retrieveHealth(params, requestOptions).thenApply { it.parse() }

    override fun verify(
        params: EmailDomainVerifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainResponse> =
        // post /email_domains/{domain_id}/verify
        withRawResponse().verify(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmailDomainServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailDomainServiceAsync.WithRawResponse =
            EmailDomainServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Per-domain webhook endpoints with event subscriptions */
        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks

        private val createHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmailDomainCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmailDomainRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun update(
            params: EmailDomainUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<EmailDomainListPageResponse> =
            jsonHandler<EmailDomainListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmailDomainListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EmailDomainListPageAsync.builder()
                                    .service(EmailDomainServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: EmailDomainDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveDnsRecordsHandler: Handler<EmailDomainRetrieveDnsRecordsResponse> =
            jsonHandler<EmailDomainRetrieveDnsRecordsResponse>(clientOptions.jsonMapper)

        override fun retrieveDnsRecords(
            params: EmailDomainRetrieveDnsRecordsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domainId", params.domainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0), "dns_records")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveDnsRecordsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHealthHandler: Handler<EmailDomainRetrieveHealthResponse> =
            jsonHandler<EmailDomainRetrieveHealthResponse>(clientOptions.jsonMapper)

        override fun retrieveHealth(
            params: EmailDomainRetrieveHealthParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveHealthResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("email_domains", params._pathParam(0), "health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHealthHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val verifyHandler: Handler<EmailDomainResponse> =
            jsonHandler<EmailDomainResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: EmailDomainVerifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
