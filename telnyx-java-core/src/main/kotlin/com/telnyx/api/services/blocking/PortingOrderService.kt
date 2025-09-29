// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.portingorders.PortingOrderCreateParams
import com.telnyx.api.models.portingorders.PortingOrderCreateResponse
import com.telnyx.api.models.portingorders.PortingOrderDeleteParams
import com.telnyx.api.models.portingorders.PortingOrderListParams
import com.telnyx.api.models.portingorders.PortingOrderListResponse
import com.telnyx.api.models.portingorders.PortingOrderRetrieveAllowedFocWindowsParams
import com.telnyx.api.models.portingorders.PortingOrderRetrieveAllowedFocWindowsResponse
import com.telnyx.api.models.portingorders.PortingOrderRetrieveExceptionTypesParams
import com.telnyx.api.models.portingorders.PortingOrderRetrieveExceptionTypesResponse
import com.telnyx.api.models.portingorders.PortingOrderRetrieveLoaTemplateParams
import com.telnyx.api.models.portingorders.PortingOrderRetrieveParams
import com.telnyx.api.models.portingorders.PortingOrderRetrieveRequirementsParams
import com.telnyx.api.models.portingorders.PortingOrderRetrieveRequirementsResponse
import com.telnyx.api.models.portingorders.PortingOrderRetrieveResponse
import com.telnyx.api.models.portingorders.PortingOrderRetrieveSubRequestParams
import com.telnyx.api.models.portingorders.PortingOrderRetrieveSubRequestResponse
import com.telnyx.api.models.portingorders.PortingOrderUpdateParams
import com.telnyx.api.models.portingorders.PortingOrderUpdateResponse
import com.telnyx.api.services.blocking.portingorders.ActionRequirementService
import com.telnyx.api.services.blocking.portingorders.ActionService
import com.telnyx.api.services.blocking.portingorders.ActivationJobService
import com.telnyx.api.services.blocking.portingorders.AdditionalDocumentService
import com.telnyx.api.services.blocking.portingorders.AssociatedPhoneNumberService
import com.telnyx.api.services.blocking.portingorders.CommentService
import com.telnyx.api.services.blocking.portingorders.PhoneNumberBlockService
import com.telnyx.api.services.blocking.portingorders.PhoneNumberConfigurationService
import com.telnyx.api.services.blocking.portingorders.PhoneNumberExtensionService
import com.telnyx.api.services.blocking.portingorders.VerificationCodeService
import java.util.function.Consumer

interface PortingOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingOrderService

    fun phoneNumberConfigurations(): PhoneNumberConfigurationService

    fun actions(): ActionService

    fun activationJobs(): ActivationJobService

    fun additionalDocuments(): AdditionalDocumentService

    fun comments(): CommentService

    fun verificationCodes(): VerificationCodeService

    fun actionRequirements(): ActionRequirementService

    fun associatedPhoneNumbers(): AssociatedPhoneNumberService

    fun phoneNumberBlocks(): PhoneNumberBlockService

    fun phoneNumberExtensions(): PhoneNumberExtensionService

    /** Creates a new porting order object. */
    fun create(params: PortingOrderCreateParams): PortingOrderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PortingOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderCreateResponse

    /** Retrieves the details of an existing porting order. */
    fun retrieve(id: String): PortingOrderRetrieveResponse =
        retrieve(id, PortingOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
    ): PortingOrderRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PortingOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PortingOrderRetrieveParams): PortingOrderRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PortingOrderRetrieveResponse =
        retrieve(id, PortingOrderRetrieveParams.none(), requestOptions)

    /**
     * Edits the details of an existing porting order.
     *
     * Any or all of a porting orders attributes may be included in the resource object included in
     * a PATCH request.
     *
     * If a request does not include all of the attributes for a resource, the system will interpret
     * the missing attributes as if they were included with their current values. To explicitly set
     * something to null, it must be included in the request with a null value.
     */
    fun update(id: String): PortingOrderUpdateResponse = update(id, PortingOrderUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
    ): PortingOrderUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PortingOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderUpdateResponse

    /** @see update */
    fun update(params: PortingOrderUpdateParams): PortingOrderUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): PortingOrderUpdateResponse =
        update(id, PortingOrderUpdateParams.none(), requestOptions)

    /** Returns a list of your porting order. */
    fun list(): PortingOrderListResponse = list(PortingOrderListParams.none())

    /** @see list */
    fun list(
        params: PortingOrderListParams = PortingOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderListResponse

    /** @see list */
    fun list(
        params: PortingOrderListParams = PortingOrderListParams.none()
    ): PortingOrderListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PortingOrderListResponse =
        list(PortingOrderListParams.none(), requestOptions)

    /**
     * Deletes an existing porting order. This operation is restrict to porting orders in draft
     * state.
     */
    fun delete(id: String) = delete(id, PortingOrderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PortingOrderDeleteParams = PortingOrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: PortingOrderDeleteParams = PortingOrderDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PortingOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: PortingOrderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, PortingOrderDeleteParams.none(), requestOptions)

    /** Returns a list of allowed FOC dates for a porting order. */
    fun retrieveAllowedFocWindows(id: String): PortingOrderRetrieveAllowedFocWindowsResponse =
        retrieveAllowedFocWindows(id, PortingOrderRetrieveAllowedFocWindowsParams.none())

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        id: String,
        params: PortingOrderRetrieveAllowedFocWindowsParams =
            PortingOrderRetrieveAllowedFocWindowsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveAllowedFocWindowsResponse =
        retrieveAllowedFocWindows(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        id: String,
        params: PortingOrderRetrieveAllowedFocWindowsParams =
            PortingOrderRetrieveAllowedFocWindowsParams.none(),
    ): PortingOrderRetrieveAllowedFocWindowsResponse =
        retrieveAllowedFocWindows(id, params, RequestOptions.none())

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        params: PortingOrderRetrieveAllowedFocWindowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveAllowedFocWindowsResponse

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        params: PortingOrderRetrieveAllowedFocWindowsParams
    ): PortingOrderRetrieveAllowedFocWindowsResponse =
        retrieveAllowedFocWindows(params, RequestOptions.none())

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        id: String,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveAllowedFocWindowsResponse =
        retrieveAllowedFocWindows(
            id,
            PortingOrderRetrieveAllowedFocWindowsParams.none(),
            requestOptions,
        )

    /** Returns a list of all possible exception types for a porting order. */
    fun retrieveExceptionTypes(): PortingOrderRetrieveExceptionTypesResponse =
        retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none())

    /** @see retrieveExceptionTypes */
    fun retrieveExceptionTypes(
        params: PortingOrderRetrieveExceptionTypesParams =
            PortingOrderRetrieveExceptionTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveExceptionTypesResponse

    /** @see retrieveExceptionTypes */
    fun retrieveExceptionTypes(
        params: PortingOrderRetrieveExceptionTypesParams =
            PortingOrderRetrieveExceptionTypesParams.none()
    ): PortingOrderRetrieveExceptionTypesResponse =
        retrieveExceptionTypes(params, RequestOptions.none())

    /** @see retrieveExceptionTypes */
    fun retrieveExceptionTypes(
        requestOptions: RequestOptions
    ): PortingOrderRetrieveExceptionTypesResponse =
        retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none(), requestOptions)

    /** Download a porting order loa template */
    @MustBeClosed
    fun retrieveLoaTemplate(id: String): HttpResponse =
        retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none())

    /** @see retrieveLoaTemplate */
    @MustBeClosed
    fun retrieveLoaTemplate(
        id: String,
        params: PortingOrderRetrieveLoaTemplateParams =
            PortingOrderRetrieveLoaTemplateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = retrieveLoaTemplate(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveLoaTemplate */
    @MustBeClosed
    fun retrieveLoaTemplate(
        id: String,
        params: PortingOrderRetrieveLoaTemplateParams = PortingOrderRetrieveLoaTemplateParams.none(),
    ): HttpResponse = retrieveLoaTemplate(id, params, RequestOptions.none())

    /** @see retrieveLoaTemplate */
    @MustBeClosed
    fun retrieveLoaTemplate(
        params: PortingOrderRetrieveLoaTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see retrieveLoaTemplate */
    @MustBeClosed
    fun retrieveLoaTemplate(params: PortingOrderRetrieveLoaTemplateParams): HttpResponse =
        retrieveLoaTemplate(params, RequestOptions.none())

    /** @see retrieveLoaTemplate */
    @MustBeClosed
    fun retrieveLoaTemplate(id: String, requestOptions: RequestOptions): HttpResponse =
        retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none(), requestOptions)

    /** Returns a list of all requirements based on country/number type for this porting order. */
    fun retrieveRequirements(id: String): PortingOrderRetrieveRequirementsResponse =
        retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none())

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        id: String,
        params: PortingOrderRetrieveRequirementsParams =
            PortingOrderRetrieveRequirementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveRequirementsResponse =
        retrieveRequirements(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        id: String,
        params: PortingOrderRetrieveRequirementsParams =
            PortingOrderRetrieveRequirementsParams.none(),
    ): PortingOrderRetrieveRequirementsResponse =
        retrieveRequirements(id, params, RequestOptions.none())

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        params: PortingOrderRetrieveRequirementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveRequirementsResponse

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        params: PortingOrderRetrieveRequirementsParams
    ): PortingOrderRetrieveRequirementsResponse =
        retrieveRequirements(params, RequestOptions.none())

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        id: String,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveRequirementsResponse =
        retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none(), requestOptions)

    /** Retrieve the associated V1 sub_request_id and port_request_id */
    fun retrieveSubRequest(id: String): PortingOrderRetrieveSubRequestResponse =
        retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none())

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        id: String,
        params: PortingOrderRetrieveSubRequestParams = PortingOrderRetrieveSubRequestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveSubRequestResponse =
        retrieveSubRequest(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        id: String,
        params: PortingOrderRetrieveSubRequestParams = PortingOrderRetrieveSubRequestParams.none(),
    ): PortingOrderRetrieveSubRequestResponse =
        retrieveSubRequest(id, params, RequestOptions.none())

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        params: PortingOrderRetrieveSubRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortingOrderRetrieveSubRequestResponse

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        params: PortingOrderRetrieveSubRequestParams
    ): PortingOrderRetrieveSubRequestResponse = retrieveSubRequest(params, RequestOptions.none())

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        id: String,
        requestOptions: RequestOptions,
    ): PortingOrderRetrieveSubRequestResponse =
        retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none(), requestOptions)

    /**
     * A view of [PortingOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingOrderService.WithRawResponse

        fun phoneNumberConfigurations(): PhoneNumberConfigurationService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        fun activationJobs(): ActivationJobService.WithRawResponse

        fun additionalDocuments(): AdditionalDocumentService.WithRawResponse

        fun comments(): CommentService.WithRawResponse

        fun verificationCodes(): VerificationCodeService.WithRawResponse

        fun actionRequirements(): ActionRequirementService.WithRawResponse

        fun associatedPhoneNumbers(): AssociatedPhoneNumberService.WithRawResponse

        fun phoneNumberBlocks(): PhoneNumberBlockService.WithRawResponse

        fun phoneNumberExtensions(): PhoneNumberExtensionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting_orders`, but is otherwise the same as
         * [PortingOrderService.create].
         */
        @MustBeClosed
        fun create(params: PortingOrderCreateParams): HttpResponseFor<PortingOrderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PortingOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}`, but is otherwise the same as
         * [PortingOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PortingOrderRetrieveResponse> =
            retrieve(id, PortingOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
        ): HttpResponseFor<PortingOrderRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PortingOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PortingOrderRetrieveParams
        ): HttpResponseFor<PortingOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveResponse> =
            retrieve(id, PortingOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /porting_orders/{id}`, but is otherwise the same
         * as [PortingOrderService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<PortingOrderUpdateResponse> =
            update(id, PortingOrderUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
        ): HttpResponseFor<PortingOrderUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PortingOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: PortingOrderUpdateParams): HttpResponseFor<PortingOrderUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderUpdateResponse> =
            update(id, PortingOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders`, but is otherwise the same as
         * [PortingOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PortingOrderListResponse> = list(PortingOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortingOrderListParams = PortingOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortingOrderListParams = PortingOrderListParams.none()
        ): HttpResponseFor<PortingOrderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PortingOrderListResponse> =
            list(PortingOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /porting_orders/{id}`, but is otherwise the same
         * as [PortingOrderService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, PortingOrderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PortingOrderDeleteParams = PortingOrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PortingOrderDeleteParams = PortingOrderDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PortingOrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PortingOrderDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, PortingOrderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/allowed_foc_windows`, but is
         * otherwise the same as [PortingOrderService.retrieveAllowedFocWindows].
         */
        @MustBeClosed
        fun retrieveAllowedFocWindows(
            id: String
        ): HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse> =
            retrieveAllowedFocWindows(id, PortingOrderRetrieveAllowedFocWindowsParams.none())

        /** @see retrieveAllowedFocWindows */
        @MustBeClosed
        fun retrieveAllowedFocWindows(
            id: String,
            params: PortingOrderRetrieveAllowedFocWindowsParams =
                PortingOrderRetrieveAllowedFocWindowsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse> =
            retrieveAllowedFocWindows(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAllowedFocWindows */
        @MustBeClosed
        fun retrieveAllowedFocWindows(
            id: String,
            params: PortingOrderRetrieveAllowedFocWindowsParams =
                PortingOrderRetrieveAllowedFocWindowsParams.none(),
        ): HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse> =
            retrieveAllowedFocWindows(id, params, RequestOptions.none())

        /** @see retrieveAllowedFocWindows */
        @MustBeClosed
        fun retrieveAllowedFocWindows(
            params: PortingOrderRetrieveAllowedFocWindowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>

        /** @see retrieveAllowedFocWindows */
        @MustBeClosed
        fun retrieveAllowedFocWindows(
            params: PortingOrderRetrieveAllowedFocWindowsParams
        ): HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse> =
            retrieveAllowedFocWindows(params, RequestOptions.none())

        /** @see retrieveAllowedFocWindows */
        @MustBeClosed
        fun retrieveAllowedFocWindows(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse> =
            retrieveAllowedFocWindows(
                id,
                PortingOrderRetrieveAllowedFocWindowsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /porting_orders/exception_types`, but is otherwise
         * the same as [PortingOrderService.retrieveExceptionTypes].
         */
        @MustBeClosed
        fun retrieveExceptionTypes(): HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse> =
            retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none())

        /** @see retrieveExceptionTypes */
        @MustBeClosed
        fun retrieveExceptionTypes(
            params: PortingOrderRetrieveExceptionTypesParams =
                PortingOrderRetrieveExceptionTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse>

        /** @see retrieveExceptionTypes */
        @MustBeClosed
        fun retrieveExceptionTypes(
            params: PortingOrderRetrieveExceptionTypesParams =
                PortingOrderRetrieveExceptionTypesParams.none()
        ): HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse> =
            retrieveExceptionTypes(params, RequestOptions.none())

        /** @see retrieveExceptionTypes */
        @MustBeClosed
        fun retrieveExceptionTypes(
            requestOptions: RequestOptions
        ): HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse> =
            retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/loa_template`, but is otherwise
         * the same as [PortingOrderService.retrieveLoaTemplate].
         */
        @MustBeClosed
        fun retrieveLoaTemplate(id: String): HttpResponse =
            retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none())

        /** @see retrieveLoaTemplate */
        @MustBeClosed
        fun retrieveLoaTemplate(
            id: String,
            params: PortingOrderRetrieveLoaTemplateParams =
                PortingOrderRetrieveLoaTemplateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieveLoaTemplate(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveLoaTemplate */
        @MustBeClosed
        fun retrieveLoaTemplate(
            id: String,
            params: PortingOrderRetrieveLoaTemplateParams =
                PortingOrderRetrieveLoaTemplateParams.none(),
        ): HttpResponse = retrieveLoaTemplate(id, params, RequestOptions.none())

        /** @see retrieveLoaTemplate */
        @MustBeClosed
        fun retrieveLoaTemplate(
            params: PortingOrderRetrieveLoaTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieveLoaTemplate */
        @MustBeClosed
        fun retrieveLoaTemplate(params: PortingOrderRetrieveLoaTemplateParams): HttpResponse =
            retrieveLoaTemplate(params, RequestOptions.none())

        /** @see retrieveLoaTemplate */
        @MustBeClosed
        fun retrieveLoaTemplate(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/requirements`, but is otherwise
         * the same as [PortingOrderService.retrieveRequirements].
         */
        @MustBeClosed
        fun retrieveRequirements(
            id: String
        ): HttpResponseFor<PortingOrderRetrieveRequirementsResponse> =
            retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none())

        /** @see retrieveRequirements */
        @MustBeClosed
        fun retrieveRequirements(
            id: String,
            params: PortingOrderRetrieveRequirementsParams =
                PortingOrderRetrieveRequirementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveRequirementsResponse> =
            retrieveRequirements(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveRequirements */
        @MustBeClosed
        fun retrieveRequirements(
            id: String,
            params: PortingOrderRetrieveRequirementsParams =
                PortingOrderRetrieveRequirementsParams.none(),
        ): HttpResponseFor<PortingOrderRetrieveRequirementsResponse> =
            retrieveRequirements(id, params, RequestOptions.none())

        /** @see retrieveRequirements */
        @MustBeClosed
        fun retrieveRequirements(
            params: PortingOrderRetrieveRequirementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveRequirementsResponse>

        /** @see retrieveRequirements */
        @MustBeClosed
        fun retrieveRequirements(
            params: PortingOrderRetrieveRequirementsParams
        ): HttpResponseFor<PortingOrderRetrieveRequirementsResponse> =
            retrieveRequirements(params, RequestOptions.none())

        /** @see retrieveRequirements */
        @MustBeClosed
        fun retrieveRequirements(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveRequirementsResponse> =
            retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/sub_request`, but is otherwise
         * the same as [PortingOrderService.retrieveSubRequest].
         */
        @MustBeClosed
        fun retrieveSubRequest(
            id: String
        ): HttpResponseFor<PortingOrderRetrieveSubRequestResponse> =
            retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none())

        /** @see retrieveSubRequest */
        @MustBeClosed
        fun retrieveSubRequest(
            id: String,
            params: PortingOrderRetrieveSubRequestParams =
                PortingOrderRetrieveSubRequestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveSubRequestResponse> =
            retrieveSubRequest(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveSubRequest */
        @MustBeClosed
        fun retrieveSubRequest(
            id: String,
            params: PortingOrderRetrieveSubRequestParams =
                PortingOrderRetrieveSubRequestParams.none(),
        ): HttpResponseFor<PortingOrderRetrieveSubRequestResponse> =
            retrieveSubRequest(id, params, RequestOptions.none())

        /** @see retrieveSubRequest */
        @MustBeClosed
        fun retrieveSubRequest(
            params: PortingOrderRetrieveSubRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortingOrderRetrieveSubRequestResponse>

        /** @see retrieveSubRequest */
        @MustBeClosed
        fun retrieveSubRequest(
            params: PortingOrderRetrieveSubRequestParams
        ): HttpResponseFor<PortingOrderRetrieveSubRequestResponse> =
            retrieveSubRequest(params, RequestOptions.none())

        /** @see retrieveSubRequest */
        @MustBeClosed
        fun retrieveSubRequest(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortingOrderRetrieveSubRequestResponse> =
            retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none(), requestOptions)
    }
}
