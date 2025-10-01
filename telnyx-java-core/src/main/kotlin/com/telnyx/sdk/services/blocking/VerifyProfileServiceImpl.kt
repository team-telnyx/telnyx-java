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
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerifyProfileServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerifyProfileService {

    private val withRawResponse: VerifyProfileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerifyProfileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyProfileService =
        VerifyProfileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: VerifyProfileCreateParams,
        requestOptions: RequestOptions,
    ): VerifyProfileData =
        // post /verify_profiles
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: VerifyProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): VerifyProfileData =
        // get /verify_profiles/{verify_profile_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: VerifyProfileUpdateParams,
        requestOptions: RequestOptions,
    ): VerifyProfileData =
        // patch /verify_profiles/{verify_profile_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: VerifyProfileListParams,
        requestOptions: RequestOptions,
    ): VerifyProfileListResponse =
        // get /verify_profiles
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: VerifyProfileDeleteParams,
        requestOptions: RequestOptions,
    ): VerifyProfileData =
        // delete /verify_profiles/{verify_profile_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun createTemplate(
        params: VerifyProfileCreateTemplateParams,
        requestOptions: RequestOptions,
    ): VerifyProfileCreateTemplateResponse =
        // post /verify_profiles/templates
        withRawResponse().createTemplate(params, requestOptions).parse()

    override fun retrieveTemplates(
        params: VerifyProfileRetrieveTemplatesParams,
        requestOptions: RequestOptions,
    ): VerifyProfileRetrieveTemplatesResponse =
        // get /verify_profiles/templates
        withRawResponse().retrieveTemplates(params, requestOptions).parse()

    override fun updateTemplate(
        params: VerifyProfileUpdateTemplateParams,
        requestOptions: RequestOptions,
    ): VerifyProfileUpdateTemplateResponse =
        // patch /verify_profiles/templates/{template_id}
        withRawResponse().updateTemplate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerifyProfileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyProfileService.WithRawResponse =
            VerifyProfileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun create(
            params: VerifyProfileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileData> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles")
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

        private val retrieveHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerifyProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileData> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("verifyProfileId", params.verifyProfileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", params._pathParam(0))
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

        private val updateHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun update(
            params: VerifyProfileUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileData> {
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

        private val listHandler: Handler<VerifyProfileListResponse> =
            jsonHandler<VerifyProfileListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerifyProfileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles")
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

        private val deleteHandler: Handler<VerifyProfileData> =
            jsonHandler<VerifyProfileData>(clientOptions.jsonMapper)

        override fun delete(
            params: VerifyProfileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileData> {
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

        private val createTemplateHandler: Handler<VerifyProfileCreateTemplateResponse> =
            jsonHandler<VerifyProfileCreateTemplateResponse>(clientOptions.jsonMapper)

        override fun createTemplate(
            params: VerifyProfileCreateTemplateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileCreateTemplateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", "templates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createTemplateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveTemplatesHandler: Handler<VerifyProfileRetrieveTemplatesResponse> =
            jsonHandler<VerifyProfileRetrieveTemplatesResponse>(clientOptions.jsonMapper)

        override fun retrieveTemplates(
            params: VerifyProfileRetrieveTemplatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileRetrieveTemplatesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verify_profiles", "templates")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveTemplatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateTemplateHandler: Handler<VerifyProfileUpdateTemplateResponse> =
            jsonHandler<VerifyProfileUpdateTemplateResponse>(clientOptions.jsonMapper)

        override fun updateTemplate(
            params: VerifyProfileUpdateTemplateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileUpdateTemplateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
