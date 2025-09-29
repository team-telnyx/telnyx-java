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
import com.telnyx.sdk.models.portingorders.PortingOrderCreateParams
import com.telnyx.sdk.models.portingorders.PortingOrderCreateResponse
import com.telnyx.sdk.models.portingorders.PortingOrderDeleteParams
import com.telnyx.sdk.models.portingorders.PortingOrderListParams
import com.telnyx.sdk.models.portingorders.PortingOrderListResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveAllowedFocWindowsParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveAllowedFocWindowsResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveExceptionTypesParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveExceptionTypesResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveLoaTemplateParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveRequirementsParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveRequirementsResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveSubRequestParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveSubRequestResponse
import com.telnyx.sdk.models.portingorders.PortingOrderUpdateParams
import com.telnyx.sdk.models.portingorders.PortingOrderUpdateResponse
import com.telnyx.sdk.services.blocking.portingorders.ActionRequirementService
import com.telnyx.sdk.services.blocking.portingorders.ActionRequirementServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.ActionService
import com.telnyx.sdk.services.blocking.portingorders.ActionServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.ActivationJobService
import com.telnyx.sdk.services.blocking.portingorders.ActivationJobServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.AdditionalDocumentService
import com.telnyx.sdk.services.blocking.portingorders.AdditionalDocumentServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.AssociatedPhoneNumberService
import com.telnyx.sdk.services.blocking.portingorders.AssociatedPhoneNumberServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.CommentService
import com.telnyx.sdk.services.blocking.portingorders.CommentServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberBlockService
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberBlockServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberConfigurationService
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberConfigurationServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberExtensionService
import com.telnyx.sdk.services.blocking.portingorders.PhoneNumberExtensionServiceImpl
import com.telnyx.sdk.services.blocking.portingorders.VerificationCodeService
import com.telnyx.sdk.services.blocking.portingorders.VerificationCodeServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PortingOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PortingOrderService {

    private val withRawResponse: PortingOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val phoneNumberConfigurations: PhoneNumberConfigurationService by lazy {
        PhoneNumberConfigurationServiceImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    private val activationJobs: ActivationJobService by lazy {
        ActivationJobServiceImpl(clientOptions)
    }

    private val additionalDocuments: AdditionalDocumentService by lazy {
        AdditionalDocumentServiceImpl(clientOptions)
    }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptions) }

    private val verificationCodes: VerificationCodeService by lazy {
        VerificationCodeServiceImpl(clientOptions)
    }

    private val actionRequirements: ActionRequirementService by lazy {
        ActionRequirementServiceImpl(clientOptions)
    }

    private val associatedPhoneNumbers: AssociatedPhoneNumberService by lazy {
        AssociatedPhoneNumberServiceImpl(clientOptions)
    }

    private val phoneNumberBlocks: PhoneNumberBlockService by lazy {
        PhoneNumberBlockServiceImpl(clientOptions)
    }

    private val phoneNumberExtensions: PhoneNumberExtensionService by lazy {
        PhoneNumberExtensionServiceImpl(clientOptions)
    }

    override fun withRawResponse(): PortingOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingOrderService =
        PortingOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun phoneNumberConfigurations(): PhoneNumberConfigurationService =
        phoneNumberConfigurations

    override fun actions(): ActionService = actions

    override fun activationJobs(): ActivationJobService = activationJobs

    override fun additionalDocuments(): AdditionalDocumentService = additionalDocuments

    override fun comments(): CommentService = comments

    override fun verificationCodes(): VerificationCodeService = verificationCodes

    override fun actionRequirements(): ActionRequirementService = actionRequirements

    override fun associatedPhoneNumbers(): AssociatedPhoneNumberService = associatedPhoneNumbers

    override fun phoneNumberBlocks(): PhoneNumberBlockService = phoneNumberBlocks

    override fun phoneNumberExtensions(): PhoneNumberExtensionService = phoneNumberExtensions

    override fun create(
        params: PortingOrderCreateParams,
        requestOptions: RequestOptions,
    ): PortingOrderCreateResponse =
        // post /porting_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PortingOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveResponse =
        // get /porting_orders/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PortingOrderUpdateParams,
        requestOptions: RequestOptions,
    ): PortingOrderUpdateResponse =
        // patch /porting_orders/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PortingOrderListParams,
        requestOptions: RequestOptions,
    ): PortingOrderListResponse =
        // get /porting_orders
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PortingOrderDeleteParams, requestOptions: RequestOptions) {
        // delete /porting_orders/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun retrieveAllowedFocWindows(
        params: PortingOrderRetrieveAllowedFocWindowsParams,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveAllowedFocWindowsResponse =
        // get /porting_orders/{id}/allowed_foc_windows
        withRawResponse().retrieveAllowedFocWindows(params, requestOptions).parse()

    override fun retrieveExceptionTypes(
        params: PortingOrderRetrieveExceptionTypesParams,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveExceptionTypesResponse =
        // get /porting_orders/exception_types
        withRawResponse().retrieveExceptionTypes(params, requestOptions).parse()

    override fun retrieveLoaTemplate(
        params: PortingOrderRetrieveLoaTemplateParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /porting_orders/{id}/loa_template
        withRawResponse().retrieveLoaTemplate(params, requestOptions)

    override fun retrieveRequirements(
        params: PortingOrderRetrieveRequirementsParams,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveRequirementsResponse =
        // get /porting_orders/{id}/requirements
        withRawResponse().retrieveRequirements(params, requestOptions).parse()

    override fun retrieveSubRequest(
        params: PortingOrderRetrieveSubRequestParams,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveSubRequestResponse =
        // get /porting_orders/{id}/sub_request
        withRawResponse().retrieveSubRequest(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PortingOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val phoneNumberConfigurations:
            PhoneNumberConfigurationService.WithRawResponse by lazy {
            PhoneNumberConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val activationJobs: ActivationJobService.WithRawResponse by lazy {
            ActivationJobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val additionalDocuments: AdditionalDocumentService.WithRawResponse by lazy {
            AdditionalDocumentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val comments: CommentService.WithRawResponse by lazy {
            CommentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val verificationCodes: VerificationCodeService.WithRawResponse by lazy {
            VerificationCodeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val actionRequirements: ActionRequirementService.WithRawResponse by lazy {
            ActionRequirementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val associatedPhoneNumbers: AssociatedPhoneNumberService.WithRawResponse by lazy {
            AssociatedPhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberBlocks: PhoneNumberBlockService.WithRawResponse by lazy {
            PhoneNumberBlockServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumberExtensions: PhoneNumberExtensionService.WithRawResponse by lazy {
            PhoneNumberExtensionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingOrderService.WithRawResponse =
            PortingOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun phoneNumberConfigurations(): PhoneNumberConfigurationService.WithRawResponse =
            phoneNumberConfigurations

        override fun actions(): ActionService.WithRawResponse = actions

        override fun activationJobs(): ActivationJobService.WithRawResponse = activationJobs

        override fun additionalDocuments(): AdditionalDocumentService.WithRawResponse =
            additionalDocuments

        override fun comments(): CommentService.WithRawResponse = comments

        override fun verificationCodes(): VerificationCodeService.WithRawResponse =
            verificationCodes

        override fun actionRequirements(): ActionRequirementService.WithRawResponse =
            actionRequirements

        override fun associatedPhoneNumbers(): AssociatedPhoneNumberService.WithRawResponse =
            associatedPhoneNumbers

        override fun phoneNumberBlocks(): PhoneNumberBlockService.WithRawResponse =
            phoneNumberBlocks

        override fun phoneNumberExtensions(): PhoneNumberExtensionService.WithRawResponse =
            phoneNumberExtensions

        private val createHandler: Handler<PortingOrderCreateResponse> =
            jsonHandler<PortingOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PortingOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders")
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

        private val retrieveHandler: Handler<PortingOrderRetrieveResponse> =
            jsonHandler<PortingOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PortingOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0))
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

        private val updateHandler: Handler<PortingOrderUpdateResponse> =
            jsonHandler<PortingOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: PortingOrderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderUpdateResponse> {
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

        private val listHandler: Handler<PortingOrderListResponse> =
            jsonHandler<PortingOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PortingOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders")
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
            params: PortingOrderDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val retrieveAllowedFocWindowsHandler:
            Handler<PortingOrderRetrieveAllowedFocWindowsResponse> =
            jsonHandler<PortingOrderRetrieveAllowedFocWindowsResponse>(clientOptions.jsonMapper)

        override fun retrieveAllowedFocWindows(
            params: PortingOrderRetrieveAllowedFocWindowsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "allowed_foc_windows")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveAllowedFocWindowsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", "exception_types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveExceptionTypesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        override fun retrieveLoaTemplate(
            params: PortingOrderRetrieveLoaTemplateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "loa_template")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val retrieveRequirementsHandler: Handler<PortingOrderRetrieveRequirementsResponse> =
            jsonHandler<PortingOrderRetrieveRequirementsResponse>(clientOptions.jsonMapper)

        override fun retrieveRequirements(
            params: PortingOrderRetrieveRequirementsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveRequirementsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "requirements")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRequirementsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSubRequestHandler: Handler<PortingOrderRetrieveSubRequestResponse> =
            jsonHandler<PortingOrderRetrieveSubRequestResponse>(clientOptions.jsonMapper)

        override fun retrieveSubRequest(
            params: PortingOrderRetrieveSubRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveSubRequestResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("porting_orders", params._pathParam(0), "sub_request")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
