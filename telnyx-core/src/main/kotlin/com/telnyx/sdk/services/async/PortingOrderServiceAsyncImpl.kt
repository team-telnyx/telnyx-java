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
import com.telnyx.sdk.models.portingorders.PortingOrderCreateParams
import com.telnyx.sdk.models.portingorders.PortingOrderCreateResponse
import com.telnyx.sdk.models.portingorders.PortingOrderDeleteParams
import com.telnyx.sdk.models.portingorders.PortingOrderListPageAsync
import com.telnyx.sdk.models.portingorders.PortingOrderListPageResponse
import com.telnyx.sdk.models.portingorders.PortingOrderListParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveAllowedFocWindowsParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveAllowedFocWindowsResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveExceptionTypesParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveExceptionTypesResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveLoaTemplateParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveRequirementsPageAsync
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveRequirementsPageResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveRequirementsParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveSubRequestParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveSubRequestResponse
import com.telnyx.sdk.models.portingorders.PortingOrderUpdateParams
import com.telnyx.sdk.models.portingorders.PortingOrderUpdateResponse
import com.telnyx.sdk.services.async.portingorders.ActionRequirementServiceAsync
import com.telnyx.sdk.services.async.portingorders.ActionRequirementServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.ActionServiceAsync
import com.telnyx.sdk.services.async.portingorders.ActionServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.ActivationJobServiceAsync
import com.telnyx.sdk.services.async.portingorders.ActivationJobServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.AdditionalDocumentServiceAsync
import com.telnyx.sdk.services.async.portingorders.AdditionalDocumentServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.AssociatedPhoneNumberServiceAsync
import com.telnyx.sdk.services.async.portingorders.AssociatedPhoneNumberServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.CommentServiceAsync
import com.telnyx.sdk.services.async.portingorders.CommentServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.PhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.portingorders.PhoneNumberBlockServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.PhoneNumberConfigurationServiceAsync
import com.telnyx.sdk.services.async.portingorders.PhoneNumberConfigurationServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.PhoneNumberExtensionServiceAsync
import com.telnyx.sdk.services.async.portingorders.PhoneNumberExtensionServiceAsyncImpl
import com.telnyx.sdk.services.async.portingorders.VerificationCodeServiceAsync
import com.telnyx.sdk.services.async.portingorders.VerificationCodeServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Endpoints related to porting orders management. */
class PortingOrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PortingOrderServiceAsync {

    private val withRawResponse: PortingOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val phoneNumberConfigurations: PhoneNumberConfigurationServiceAsync by lazy {
        PhoneNumberConfigurationServiceAsyncImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    private val activationJobs: ActivationJobServiceAsync by lazy {
        ActivationJobServiceAsyncImpl(clientOptions)
    }

    private val additionalDocuments: AdditionalDocumentServiceAsync by lazy {
        AdditionalDocumentServiceAsyncImpl(clientOptions)
    }

    private val comments: CommentServiceAsync by lazy { CommentServiceAsyncImpl(clientOptions) }

    private val verificationCodes: VerificationCodeServiceAsync by lazy {
        VerificationCodeServiceAsyncImpl(clientOptions)
    }

    private val actionRequirements: ActionRequirementServiceAsync by lazy {
        ActionRequirementServiceAsyncImpl(clientOptions)
    }

    private val associatedPhoneNumbers: AssociatedPhoneNumberServiceAsync by lazy {
        AssociatedPhoneNumberServiceAsyncImpl(clientOptions)
    }

    private val phoneNumberBlocks: PhoneNumberBlockServiceAsync by lazy {
        PhoneNumberBlockServiceAsyncImpl(clientOptions)
    }

    private val phoneNumberExtensions: PhoneNumberExtensionServiceAsync by lazy {
        PhoneNumberExtensionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PortingOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingOrderServiceAsync =
        PortingOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Endpoints related to porting orders management. */
    override fun phoneNumberConfigurations(): PhoneNumberConfigurationServiceAsync =
        phoneNumberConfigurations

    /** Endpoints related to porting orders management. */
    override fun actions(): ActionServiceAsync = actions

    /** Endpoints related to porting orders management. */
    override fun activationJobs(): ActivationJobServiceAsync = activationJobs

    /** Endpoints related to porting orders management. */
    override fun additionalDocuments(): AdditionalDocumentServiceAsync = additionalDocuments

    /** Endpoints related to porting orders management. */
    override fun comments(): CommentServiceAsync = comments

    /** Endpoints related to porting orders management. */
    override fun verificationCodes(): VerificationCodeServiceAsync = verificationCodes

    /** Endpoints related to porting orders management. */
    override fun actionRequirements(): ActionRequirementServiceAsync = actionRequirements

    /** Endpoints related to porting orders management. */
    override fun associatedPhoneNumbers(): AssociatedPhoneNumberServiceAsync =
        associatedPhoneNumbers

    /** Endpoints related to porting orders management. */
    override fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync = phoneNumberBlocks

    /** Endpoints related to porting orders management. */
    override fun phoneNumberExtensions(): PhoneNumberExtensionServiceAsync = phoneNumberExtensions

    override fun create(
        params: PortingOrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderCreateResponse> =
        // post /porting_orders
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PortingOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveResponse> =
        // get /porting_orders/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PortingOrderUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderUpdateResponse> =
        // patch /porting_orders/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PortingOrderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderListPageAsync> =
        // get /porting_orders
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PortingOrderDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /porting_orders/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun retrieveAllowedFocWindows(
        params: PortingOrderRetrieveAllowedFocWindowsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveAllowedFocWindowsResponse> =
        // get /porting_orders/{id}/allowed_foc_windows
        withRawResponse().retrieveAllowedFocWindows(params, requestOptions).thenApply { it.parse() }

    override fun retrieveExceptionTypes(
        params: PortingOrderRetrieveExceptionTypesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveExceptionTypesResponse> =
        // get /porting_orders/exception_types
        withRawResponse().retrieveExceptionTypes(params, requestOptions).thenApply { it.parse() }

    override fun retrieveLoaTemplate(
        params: PortingOrderRetrieveLoaTemplateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /porting_orders/{id}/loa_template
        withRawResponse().retrieveLoaTemplate(params, requestOptions)

    override fun retrieveRequirements(
        params: PortingOrderRetrieveRequirementsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync> =
        // get /porting_orders/{id}/requirements
        withRawResponse().retrieveRequirements(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSubRequest(
        params: PortingOrderRetrieveSubRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveSubRequestResponse> =
        // get /porting_orders/{id}/sub_request
        withRawResponse().retrieveSubRequest(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortingOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val phoneNumberConfigurations:
            PhoneNumberConfigurationServiceAsync.WithRawResponse by lazy {
            PhoneNumberConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val activationJobs: ActivationJobServiceAsync.WithRawResponse by lazy {
            ActivationJobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val additionalDocuments: AdditionalDocumentServiceAsync.WithRawResponse by lazy {
            AdditionalDocumentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentServiceAsync.WithRawResponse by lazy {
            CommentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val verificationCodes: VerificationCodeServiceAsync.WithRawResponse by lazy {
            VerificationCodeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val actionRequirements: ActionRequirementServiceAsync.WithRawResponse by lazy {
            ActionRequirementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val associatedPhoneNumbers:
            AssociatedPhoneNumberServiceAsync.WithRawResponse by lazy {
            AssociatedPhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberBlocks: PhoneNumberBlockServiceAsync.WithRawResponse by lazy {
            PhoneNumberBlockServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberExtensions:
            PhoneNumberExtensionServiceAsync.WithRawResponse by lazy {
            PhoneNumberExtensionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingOrderServiceAsync.WithRawResponse =
            PortingOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Endpoints related to porting orders management. */
        override fun phoneNumberConfigurations():
            PhoneNumberConfigurationServiceAsync.WithRawResponse = phoneNumberConfigurations

        /** Endpoints related to porting orders management. */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        /** Endpoints related to porting orders management. */
        override fun activationJobs(): ActivationJobServiceAsync.WithRawResponse = activationJobs

        /** Endpoints related to porting orders management. */
        override fun additionalDocuments(): AdditionalDocumentServiceAsync.WithRawResponse =
            additionalDocuments

        /** Endpoints related to porting orders management. */
        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        /** Endpoints related to porting orders management. */
        override fun verificationCodes(): VerificationCodeServiceAsync.WithRawResponse =
            verificationCodes

        /** Endpoints related to porting orders management. */
        override fun actionRequirements(): ActionRequirementServiceAsync.WithRawResponse =
            actionRequirements

        /** Endpoints related to porting orders management. */
        override fun associatedPhoneNumbers(): AssociatedPhoneNumberServiceAsync.WithRawResponse =
            associatedPhoneNumbers

        /** Endpoints related to porting orders management. */
        override fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync.WithRawResponse =
            phoneNumberBlocks

        /** Endpoints related to porting orders management. */
        override fun phoneNumberExtensions(): PhoneNumberExtensionServiceAsync.WithRawResponse =
            phoneNumberExtensions

        private val createHandler: Handler<PortingOrderCreateResponse> =
            jsonHandler<PortingOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PortingOrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders")
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

        private val retrieveHandler: Handler<PortingOrderRetrieveResponse> =
            jsonHandler<PortingOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PortingOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0))
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

        private val updateHandler: Handler<PortingOrderUpdateResponse> =
            jsonHandler<PortingOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PortingOrderUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0))
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

        private val listHandler: Handler<PortingOrderListPageResponse> =
            jsonHandler<PortingOrderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PortingOrderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders")
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
                                PortingOrderListPageAsync.builder()
                                    .service(PortingOrderServiceAsyncImpl(clientOptions))
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
            params: PortingOrderDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0))
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

        private val retrieveAllowedFocWindowsHandler:
            Handler<PortingOrderRetrieveAllowedFocWindowsResponse> =
            jsonHandler<PortingOrderRetrieveAllowedFocWindowsResponse>(clientOptions.jsonMapper)

        override fun retrieveAllowedFocWindows(
            params: PortingOrderRetrieveAllowedFocWindowsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "allowed_foc_windows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveAllowedFocWindowsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveExceptionTypesHandler:
            Handler<PortingOrderRetrieveExceptionTypesResponse> =
            jsonHandler<PortingOrderRetrieveExceptionTypesResponse>(clientOptions.jsonMapper)

        override fun retrieveExceptionTypes(
            params: PortingOrderRetrieveExceptionTypesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", "exception_types")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveExceptionTypesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        override fun retrieveLoaTemplate(
            params: PortingOrderRetrieveLoaTemplateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "loa_template")
                    .putHeader("Accept", "application/pdf")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val retrieveRequirementsHandler:
            Handler<PortingOrderRetrieveRequirementsPageResponse> =
            jsonHandler<PortingOrderRetrieveRequirementsPageResponse>(clientOptions.jsonMapper)

        override fun retrieveRequirements(
            params: PortingOrderRetrieveRequirementsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveRequirementsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "requirements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRequirementsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PortingOrderRetrieveRequirementsPageAsync.builder()
                                    .service(PortingOrderServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveSubRequestHandler: Handler<PortingOrderRetrieveSubRequestResponse> =
            jsonHandler<PortingOrderRetrieveSubRequestResponse>(clientOptions.jsonMapper)

        override fun retrieveSubRequest(
            params: PortingOrderRetrieveSubRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveSubRequestResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "sub_request")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSubRequestHandler.handle(it) }
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
