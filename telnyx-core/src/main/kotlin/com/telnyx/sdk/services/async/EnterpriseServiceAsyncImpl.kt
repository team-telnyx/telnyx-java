// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.enterprises.EnterpriseBrandedCallingParams
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseDeleteParams
import com.telnyx.sdk.models.enterprises.EnterpriseListPageAsync
import com.telnyx.sdk.models.enterprises.EnterpriseListPageResponse
import com.telnyx.sdk.models.enterprises.EnterpriseListParams
import com.telnyx.sdk.models.enterprises.EnterprisePublicWrapped
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import com.telnyx.sdk.services.async.enterprises.DirServiceAsync
import com.telnyx.sdk.services.async.enterprises.DirServiceAsyncImpl
import com.telnyx.sdk.services.async.enterprises.ReputationServiceAsync
import com.telnyx.sdk.services.async.enterprises.ReputationServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Manage the legal-entity record that owns your DIRs and phone numbers. */
class EnterpriseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EnterpriseServiceAsync {

    private val withRawResponse: EnterpriseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reputation: ReputationServiceAsync by lazy {
        ReputationServiceAsyncImpl(clientOptions)
    }

    private val dir: DirServiceAsync by lazy { DirServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EnterpriseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnterpriseServiceAsync =
        EnterpriseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Phone-number reputation monitoring (spam-score lookup and tracking). */
    override fun reputation(): ReputationServiceAsync = reputation

    /**
     * A Display Identity Record (DIR) is the verified calling identity (display name, logo, call
     * reasons) shown to recipients on outbound calls.
     */
    override fun dir(): DirServiceAsync = dir

    override fun create(
        params: EnterpriseCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterprisePublicWrapped> =
        // post /enterprises
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EnterpriseRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterprisePublicWrapped> =
        // get /enterprises/{enterprise_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EnterpriseUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterprisePublicWrapped> =
        // put /enterprises/{enterprise_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EnterpriseListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseListPageAsync> =
        // get /enterprises
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EnterpriseDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /enterprises/{enterprise_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun brandedCalling(
        params: EnterpriseBrandedCallingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterprisePublicWrapped> =
        // post /enterprises/{enterprise_id}/branded_calling
        withRawResponse().brandedCalling(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnterpriseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val reputation: ReputationServiceAsync.WithRawResponse by lazy {
            ReputationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dir: DirServiceAsync.WithRawResponse by lazy {
            DirServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnterpriseServiceAsync.WithRawResponse =
            EnterpriseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Phone-number reputation monitoring (spam-score lookup and tracking). */
        override fun reputation(): ReputationServiceAsync.WithRawResponse = reputation

        /**
         * A Display Identity Record (DIR) is the verified calling identity (display name, logo,
         * call reasons) shown to recipients on outbound calls.
         */
        override fun dir(): DirServiceAsync.WithRawResponse = dir

        private val createHandler: Handler<EnterprisePublicWrapped> =
            jsonHandler<EnterprisePublicWrapped>(clientOptions.jsonMapper)

        override fun create(
            params: EnterpriseCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises")
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

        private val retrieveHandler: Handler<EnterprisePublicWrapped> =
            jsonHandler<EnterprisePublicWrapped>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EnterpriseRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0))
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

        private val updateHandler: Handler<EnterprisePublicWrapped> =
            jsonHandler<EnterprisePublicWrapped>(clientOptions.jsonMapper)

        override fun update(
            params: EnterpriseUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0))
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

        private val listHandler: Handler<EnterpriseListPageResponse> =
            jsonHandler<EnterpriseListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EnterpriseListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises")
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
                                EnterpriseListPageAsync.builder()
                                    .service(EnterpriseServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: EnterpriseDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val brandedCallingHandler: Handler<EnterprisePublicWrapped> =
            jsonHandler<EnterprisePublicWrapped>(clientOptions.jsonMapper)

        override fun brandedCalling(
            params: EnterpriseBrandedCallingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterprisePublicWrapped>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("enterpriseId", params.enterpriseId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("enterprises", params._pathParam(0), "branded_calling")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { brandedCallingHandler.handle(it) }
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
