// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portingorders.PortingOrderCreateParams
import com.telnyx.sdk.models.portingorders.PortingOrderCreateResponse
import com.telnyx.sdk.models.portingorders.PortingOrderDeleteParams
import com.telnyx.sdk.models.portingorders.PortingOrderListPageAsync
import com.telnyx.sdk.models.portingorders.PortingOrderListParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveAllowedFocWindowsParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveAllowedFocWindowsResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveExceptionTypesParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveExceptionTypesResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveLoaTemplateParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveRequirementsPageAsync
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveRequirementsParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveResponse
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveSubRequestParams
import com.telnyx.sdk.models.portingorders.PortingOrderRetrieveSubRequestResponse
import com.telnyx.sdk.models.portingorders.PortingOrderUpdateParams
import com.telnyx.sdk.models.portingorders.PortingOrderUpdateResponse
import com.telnyx.sdk.services.async.portingorders.ActionRequirementServiceAsync
import com.telnyx.sdk.services.async.portingorders.ActionServiceAsync
import com.telnyx.sdk.services.async.portingorders.ActivationJobServiceAsync
import com.telnyx.sdk.services.async.portingorders.AdditionalDocumentServiceAsync
import com.telnyx.sdk.services.async.portingorders.AssociatedPhoneNumberServiceAsync
import com.telnyx.sdk.services.async.portingorders.CommentServiceAsync
import com.telnyx.sdk.services.async.portingorders.PhoneNumberBlockServiceAsync
import com.telnyx.sdk.services.async.portingorders.PhoneNumberConfigurationServiceAsync
import com.telnyx.sdk.services.async.portingorders.PhoneNumberExtensionServiceAsync
import com.telnyx.sdk.services.async.portingorders.VerificationCodeServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PortingOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortingOrderServiceAsync

    fun phoneNumberConfigurations(): PhoneNumberConfigurationServiceAsync

    fun actions(): ActionServiceAsync

    fun activationJobs(): ActivationJobServiceAsync

    fun additionalDocuments(): AdditionalDocumentServiceAsync

    fun comments(): CommentServiceAsync

    fun verificationCodes(): VerificationCodeServiceAsync

    fun actionRequirements(): ActionRequirementServiceAsync

    fun associatedPhoneNumbers(): AssociatedPhoneNumberServiceAsync

    fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync

    fun phoneNumberExtensions(): PhoneNumberExtensionServiceAsync

    /** Creates a new porting order object. */
    fun create(params: PortingOrderCreateParams): CompletableFuture<PortingOrderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PortingOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderCreateResponse>

    /** Retrieves the details of an existing porting order. */
    fun retrieve(id: String): CompletableFuture<PortingOrderRetrieveResponse> =
        retrieve(id, PortingOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
    ): CompletableFuture<PortingOrderRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PortingOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PortingOrderRetrieveParams
    ): CompletableFuture<PortingOrderRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveResponse> =
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
    fun update(id: String): CompletableFuture<PortingOrderUpdateResponse> =
        update(id, PortingOrderUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
    ): CompletableFuture<PortingOrderUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PortingOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderUpdateResponse>

    /** @see update */
    fun update(params: PortingOrderUpdateParams): CompletableFuture<PortingOrderUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderUpdateResponse> =
        update(id, PortingOrderUpdateParams.none(), requestOptions)

    /** Returns a list of your porting order. */
    fun list(): CompletableFuture<PortingOrderListPageAsync> = list(PortingOrderListParams.none())

    /** @see list */
    fun list(
        params: PortingOrderListParams = PortingOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderListPageAsync>

    /** @see list */
    fun list(
        params: PortingOrderListParams = PortingOrderListParams.none()
    ): CompletableFuture<PortingOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PortingOrderListPageAsync> =
        list(PortingOrderListParams.none(), requestOptions)

    /**
     * Deletes an existing porting order. This operation is restrict to porting orders in draft
     * state.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, PortingOrderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PortingOrderDeleteParams = PortingOrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PortingOrderDeleteParams = PortingOrderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PortingOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PortingOrderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, PortingOrderDeleteParams.none(), requestOptions)

    /** Returns a list of allowed FOC dates for a porting order. */
    fun retrieveAllowedFocWindows(
        id: String
    ): CompletableFuture<PortingOrderRetrieveAllowedFocWindowsResponse> =
        retrieveAllowedFocWindows(id, PortingOrderRetrieveAllowedFocWindowsParams.none())

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        id: String,
        params: PortingOrderRetrieveAllowedFocWindowsParams =
            PortingOrderRetrieveAllowedFocWindowsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveAllowedFocWindowsResponse> =
        retrieveAllowedFocWindows(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        id: String,
        params: PortingOrderRetrieveAllowedFocWindowsParams =
            PortingOrderRetrieveAllowedFocWindowsParams.none(),
    ): CompletableFuture<PortingOrderRetrieveAllowedFocWindowsResponse> =
        retrieveAllowedFocWindows(id, params, RequestOptions.none())

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        params: PortingOrderRetrieveAllowedFocWindowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveAllowedFocWindowsResponse>

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        params: PortingOrderRetrieveAllowedFocWindowsParams
    ): CompletableFuture<PortingOrderRetrieveAllowedFocWindowsResponse> =
        retrieveAllowedFocWindows(params, RequestOptions.none())

    /** @see retrieveAllowedFocWindows */
    fun retrieveAllowedFocWindows(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveAllowedFocWindowsResponse> =
        retrieveAllowedFocWindows(
            id,
            PortingOrderRetrieveAllowedFocWindowsParams.none(),
            requestOptions,
        )

    /** Returns a list of all possible exception types for a porting order. */
    fun retrieveExceptionTypes(): CompletableFuture<PortingOrderRetrieveExceptionTypesResponse> =
        retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none())

    /** @see retrieveExceptionTypes */
    fun retrieveExceptionTypes(
        params: PortingOrderRetrieveExceptionTypesParams =
            PortingOrderRetrieveExceptionTypesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveExceptionTypesResponse>

    /** @see retrieveExceptionTypes */
    fun retrieveExceptionTypes(
        params: PortingOrderRetrieveExceptionTypesParams =
            PortingOrderRetrieveExceptionTypesParams.none()
    ): CompletableFuture<PortingOrderRetrieveExceptionTypesResponse> =
        retrieveExceptionTypes(params, RequestOptions.none())

    /** @see retrieveExceptionTypes */
    fun retrieveExceptionTypes(
        requestOptions: RequestOptions
    ): CompletableFuture<PortingOrderRetrieveExceptionTypesResponse> =
        retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none(), requestOptions)

    /** Download a porting order loa template */
    fun retrieveLoaTemplate(id: String): CompletableFuture<HttpResponse> =
        retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none())

    /** @see retrieveLoaTemplate */
    fun retrieveLoaTemplate(
        id: String,
        params: PortingOrderRetrieveLoaTemplateParams =
            PortingOrderRetrieveLoaTemplateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        retrieveLoaTemplate(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveLoaTemplate */
    fun retrieveLoaTemplate(
        id: String,
        params: PortingOrderRetrieveLoaTemplateParams = PortingOrderRetrieveLoaTemplateParams.none(),
    ): CompletableFuture<HttpResponse> = retrieveLoaTemplate(id, params, RequestOptions.none())

    /** @see retrieveLoaTemplate */
    fun retrieveLoaTemplate(
        params: PortingOrderRetrieveLoaTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see retrieveLoaTemplate */
    fun retrieveLoaTemplate(
        params: PortingOrderRetrieveLoaTemplateParams
    ): CompletableFuture<HttpResponse> = retrieveLoaTemplate(params, RequestOptions.none())

    /** @see retrieveLoaTemplate */
    fun retrieveLoaTemplate(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none(), requestOptions)

    /** Returns a list of all requirements based on country/number type for this porting order. */
    fun retrieveRequirements(
        id: String
    ): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync> =
        retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none())

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        id: String,
        params: PortingOrderRetrieveRequirementsParams =
            PortingOrderRetrieveRequirementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync> =
        retrieveRequirements(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        id: String,
        params: PortingOrderRetrieveRequirementsParams =
            PortingOrderRetrieveRequirementsParams.none(),
    ): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync> =
        retrieveRequirements(id, params, RequestOptions.none())

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        params: PortingOrderRetrieveRequirementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync>

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        params: PortingOrderRetrieveRequirementsParams
    ): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync> =
        retrieveRequirements(params, RequestOptions.none())

    /** @see retrieveRequirements */
    fun retrieveRequirements(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveRequirementsPageAsync> =
        retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none(), requestOptions)

    /** Retrieve the associated V1 sub_request_id and port_request_id */
    fun retrieveSubRequest(id: String): CompletableFuture<PortingOrderRetrieveSubRequestResponse> =
        retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none())

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        id: String,
        params: PortingOrderRetrieveSubRequestParams = PortingOrderRetrieveSubRequestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveSubRequestResponse> =
        retrieveSubRequest(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        id: String,
        params: PortingOrderRetrieveSubRequestParams = PortingOrderRetrieveSubRequestParams.none(),
    ): CompletableFuture<PortingOrderRetrieveSubRequestResponse> =
        retrieveSubRequest(id, params, RequestOptions.none())

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        params: PortingOrderRetrieveSubRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortingOrderRetrieveSubRequestResponse>

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        params: PortingOrderRetrieveSubRequestParams
    ): CompletableFuture<PortingOrderRetrieveSubRequestResponse> =
        retrieveSubRequest(params, RequestOptions.none())

    /** @see retrieveSubRequest */
    fun retrieveSubRequest(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortingOrderRetrieveSubRequestResponse> =
        retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none(), requestOptions)

    /**
     * A view of [PortingOrderServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortingOrderServiceAsync.WithRawResponse

        fun phoneNumberConfigurations(): PhoneNumberConfigurationServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        fun activationJobs(): ActivationJobServiceAsync.WithRawResponse

        fun additionalDocuments(): AdditionalDocumentServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        fun verificationCodes(): VerificationCodeServiceAsync.WithRawResponse

        fun actionRequirements(): ActionRequirementServiceAsync.WithRawResponse

        fun associatedPhoneNumbers(): AssociatedPhoneNumberServiceAsync.WithRawResponse

        fun phoneNumberBlocks(): PhoneNumberBlockServiceAsync.WithRawResponse

        fun phoneNumberExtensions(): PhoneNumberExtensionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting_orders`, but is otherwise the same as
         * [PortingOrderServiceAsync.create].
         */
        fun create(
            params: PortingOrderCreateParams
        ): CompletableFuture<HttpResponseFor<PortingOrderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PortingOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}`, but is otherwise the same as
         * [PortingOrderServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PortingOrderRetrieveResponse>> =
            retrieve(id, PortingOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PortingOrderRetrieveParams = PortingOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PortingOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PortingOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveResponse>> =
            retrieve(id, PortingOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /porting_orders/{id}`, but is otherwise the same
         * as [PortingOrderServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<PortingOrderUpdateResponse>> =
            update(id, PortingOrderUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: PortingOrderUpdateParams = PortingOrderUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PortingOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderUpdateResponse>>

        /** @see update */
        fun update(
            params: PortingOrderUpdateParams
        ): CompletableFuture<HttpResponseFor<PortingOrderUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderUpdateResponse>> =
            update(id, PortingOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders`, but is otherwise the same as
         * [PortingOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PortingOrderListPageAsync>> =
            list(PortingOrderListParams.none())

        /** @see list */
        fun list(
            params: PortingOrderListParams = PortingOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderListPageAsync>>

        /** @see list */
        fun list(
            params: PortingOrderListParams = PortingOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<PortingOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortingOrderListPageAsync>> =
            list(PortingOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /porting_orders/{id}`, but is otherwise the same
         * as [PortingOrderServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, PortingOrderDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PortingOrderDeleteParams = PortingOrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PortingOrderDeleteParams = PortingOrderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PortingOrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PortingOrderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, PortingOrderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/allowed_foc_windows`, but is
         * otherwise the same as [PortingOrderServiceAsync.retrieveAllowedFocWindows].
         */
        fun retrieveAllowedFocWindows(
            id: String
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>> =
            retrieveAllowedFocWindows(id, PortingOrderRetrieveAllowedFocWindowsParams.none())

        /** @see retrieveAllowedFocWindows */
        fun retrieveAllowedFocWindows(
            id: String,
            params: PortingOrderRetrieveAllowedFocWindowsParams =
                PortingOrderRetrieveAllowedFocWindowsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>> =
            retrieveAllowedFocWindows(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveAllowedFocWindows */
        fun retrieveAllowedFocWindows(
            id: String,
            params: PortingOrderRetrieveAllowedFocWindowsParams =
                PortingOrderRetrieveAllowedFocWindowsParams.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>> =
            retrieveAllowedFocWindows(id, params, RequestOptions.none())

        /** @see retrieveAllowedFocWindows */
        fun retrieveAllowedFocWindows(
            params: PortingOrderRetrieveAllowedFocWindowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>>

        /** @see retrieveAllowedFocWindows */
        fun retrieveAllowedFocWindows(
            params: PortingOrderRetrieveAllowedFocWindowsParams
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>> =
            retrieveAllowedFocWindows(params, RequestOptions.none())

        /** @see retrieveAllowedFocWindows */
        fun retrieveAllowedFocWindows(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveAllowedFocWindowsResponse>> =
            retrieveAllowedFocWindows(
                id,
                PortingOrderRetrieveAllowedFocWindowsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /porting_orders/exception_types`, but is otherwise
         * the same as [PortingOrderServiceAsync.retrieveExceptionTypes].
         */
        fun retrieveExceptionTypes():
            CompletableFuture<HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse>> =
            retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none())

        /** @see retrieveExceptionTypes */
        fun retrieveExceptionTypes(
            params: PortingOrderRetrieveExceptionTypesParams =
                PortingOrderRetrieveExceptionTypesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse>>

        /** @see retrieveExceptionTypes */
        fun retrieveExceptionTypes(
            params: PortingOrderRetrieveExceptionTypesParams =
                PortingOrderRetrieveExceptionTypesParams.none()
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse>> =
            retrieveExceptionTypes(params, RequestOptions.none())

        /** @see retrieveExceptionTypes */
        fun retrieveExceptionTypes(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveExceptionTypesResponse>> =
            retrieveExceptionTypes(PortingOrderRetrieveExceptionTypesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/loa_template`, but is otherwise
         * the same as [PortingOrderServiceAsync.retrieveLoaTemplate].
         */
        fun retrieveLoaTemplate(id: String): CompletableFuture<HttpResponse> =
            retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none())

        /** @see retrieveLoaTemplate */
        fun retrieveLoaTemplate(
            id: String,
            params: PortingOrderRetrieveLoaTemplateParams =
                PortingOrderRetrieveLoaTemplateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieveLoaTemplate(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveLoaTemplate */
        fun retrieveLoaTemplate(
            id: String,
            params: PortingOrderRetrieveLoaTemplateParams =
                PortingOrderRetrieveLoaTemplateParams.none(),
        ): CompletableFuture<HttpResponse> = retrieveLoaTemplate(id, params, RequestOptions.none())

        /** @see retrieveLoaTemplate */
        fun retrieveLoaTemplate(
            params: PortingOrderRetrieveLoaTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieveLoaTemplate */
        fun retrieveLoaTemplate(
            params: PortingOrderRetrieveLoaTemplateParams
        ): CompletableFuture<HttpResponse> = retrieveLoaTemplate(params, RequestOptions.none())

        /** @see retrieveLoaTemplate */
        fun retrieveLoaTemplate(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieveLoaTemplate(id, PortingOrderRetrieveLoaTemplateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/requirements`, but is otherwise
         * the same as [PortingOrderServiceAsync.retrieveRequirements].
         */
        fun retrieveRequirements(
            id: String
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveRequirementsPageAsync>> =
            retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none())

        /** @see retrieveRequirements */
        fun retrieveRequirements(
            id: String,
            params: PortingOrderRetrieveRequirementsParams =
                PortingOrderRetrieveRequirementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveRequirementsPageAsync>> =
            retrieveRequirements(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveRequirements */
        fun retrieveRequirements(
            id: String,
            params: PortingOrderRetrieveRequirementsParams =
                PortingOrderRetrieveRequirementsParams.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveRequirementsPageAsync>> =
            retrieveRequirements(id, params, RequestOptions.none())

        /** @see retrieveRequirements */
        fun retrieveRequirements(
            params: PortingOrderRetrieveRequirementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveRequirementsPageAsync>>

        /** @see retrieveRequirements */
        fun retrieveRequirements(
            params: PortingOrderRetrieveRequirementsParams
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveRequirementsPageAsync>> =
            retrieveRequirements(params, RequestOptions.none())

        /** @see retrieveRequirements */
        fun retrieveRequirements(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveRequirementsPageAsync>> =
            retrieveRequirements(id, PortingOrderRetrieveRequirementsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /porting_orders/{id}/sub_request`, but is otherwise
         * the same as [PortingOrderServiceAsync.retrieveSubRequest].
         */
        fun retrieveSubRequest(
            id: String
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveSubRequestResponse>> =
            retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none())

        /** @see retrieveSubRequest */
        fun retrieveSubRequest(
            id: String,
            params: PortingOrderRetrieveSubRequestParams =
                PortingOrderRetrieveSubRequestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveSubRequestResponse>> =
            retrieveSubRequest(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveSubRequest */
        fun retrieveSubRequest(
            id: String,
            params: PortingOrderRetrieveSubRequestParams =
                PortingOrderRetrieveSubRequestParams.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveSubRequestResponse>> =
            retrieveSubRequest(id, params, RequestOptions.none())

        /** @see retrieveSubRequest */
        fun retrieveSubRequest(
            params: PortingOrderRetrieveSubRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveSubRequestResponse>>

        /** @see retrieveSubRequest */
        fun retrieveSubRequest(
            params: PortingOrderRetrieveSubRequestParams
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveSubRequestResponse>> =
            retrieveSubRequest(params, RequestOptions.none())

        /** @see retrieveSubRequest */
        fun retrieveSubRequest(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortingOrderRetrieveSubRequestResponse>> =
            retrieveSubRequest(id, PortingOrderRetrieveSubRequestParams.none(), requestOptions)
    }
}
