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
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateTemplateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateTemplateResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileData
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileDeleteParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileListParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileListResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveTemplatesParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveTemplatesResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateTemplateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateTemplateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerifyProfileServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VerifyProfileServiceAsync {

    private val withRawResponse: VerifyProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerifyProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyProfileServiceAsync =
        VerifyProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VerifyProfileCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileData> =
        // post /verify_profiles
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: VerifyProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileData> =
        // get /verify_profiles/{verify_profile_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: VerifyProfileUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileData> =
        // patch /verify_profiles/{verify_profile_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VerifyProfileListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileListResponse> =
        // get /verify_profiles
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VerifyProfileDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileData> =
        // delete /verify_profiles/{verify_profile_id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun createTemplate(
        params: VerifyProfileCreateTemplateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileCreateTemplateResponse> =
        // post /verify_profiles/templates
        withRawResponse().createTemplate(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTemplates(
        params: VerifyProfileRetrieveTemplatesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileRetrieveTemplatesResponse> =
        // get /verify_profiles/templates
        withRawResponse().retrieveTemplates(params, requestOptions).thenApply { it.parse() }

    override fun updateTemplate(
        params: VerifyProfileUpdateTemplateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileUpdateTemplateResponse> =
        // patch /verify_profiles/templates/{template_id}
        withRawResponse().updateTemplate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerifyProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyProfileServiceAsync.WithRawResponse =
            VerifyProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun create(
            params: VerifyProfileCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles")
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

        private val retrieveHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerifyProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("verifyProfileId", params.verifyProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", params._pathParam(0))
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

        private val updateHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun update(
            params: VerifyProfileUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("verifyProfileId", params.verifyProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", params._pathParam(0))
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

        private val listHandler: Handler<VerifyProfileListResponse> =
            jsonHandler<VerifyProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerifyProfileListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles")
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
                    }
                }
        }

        private val deleteHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun delete(
            params: VerifyProfileDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("verifyProfileId", params.verifyProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", params._pathParam(0))
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

        private val createTemplateHandler: Handler<VerifyProfileCreateTemplateResponse> =
            jsonHandler<VerifyProfileCreateTemplateResponse>(clientOptions.jsonMapper)

        override fun createTemplate(
            params: VerifyProfileCreateTemplateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileCreateTemplateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", "templates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createTemplateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveTemplatesHandler: Handler<VerifyProfileRetrieveTemplatesResponse> =
            jsonHandler<VerifyProfileRetrieveTemplatesResponse>(clientOptions.jsonMapper)

        override fun retrieveTemplates(
            params: VerifyProfileRetrieveTemplatesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileRetrieveTemplatesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", "templates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTemplatesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateTemplateHandler: Handler<VerifyProfileUpdateTemplateResponse> =
            jsonHandler<VerifyProfileUpdateTemplateResponse>(clientOptions.jsonMapper)

        override fun updateTemplate(
            params: VerifyProfileUpdateTemplateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileUpdateTemplateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("templateId", params.templateId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", "templates", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateTemplateHandler.handle(it) }
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
