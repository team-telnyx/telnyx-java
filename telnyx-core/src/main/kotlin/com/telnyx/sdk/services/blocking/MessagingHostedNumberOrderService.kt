// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCheckEligibilityParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCheckEligibilityResponse
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateResponse
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateVerificationCodesParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderCreateVerificationCodesResponse
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderDeleteParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderDeleteResponse
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderListPage
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderListParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderRetrieveParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderRetrieveResponse
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesResponse
import com.telnyx.sdk.services.blocking.messaginghostednumberorders.ActionService
import java.util.function.Consumer

/** Manage your messaging hosted numbers */
interface MessagingHostedNumberOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingHostedNumberOrderService

    /** Manage your messaging hosted numbers */
    fun actions(): ActionService

    /** Create a messaging hosted number order */
    fun create(): MessagingHostedNumberOrderCreateResponse =
        create(MessagingHostedNumberOrderCreateParams.none())

    /** @see create */
    fun create(
        params: MessagingHostedNumberOrderCreateParams =
            MessagingHostedNumberOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderCreateResponse

    /** @see create */
    fun create(
        params: MessagingHostedNumberOrderCreateParams =
            MessagingHostedNumberOrderCreateParams.none()
    ): MessagingHostedNumberOrderCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): MessagingHostedNumberOrderCreateResponse =
        create(MessagingHostedNumberOrderCreateParams.none(), requestOptions)

    /** Retrieve a messaging hosted number order */
    fun retrieve(id: String): MessagingHostedNumberOrderRetrieveResponse =
        retrieve(id, MessagingHostedNumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberOrderRetrieveParams =
            MessagingHostedNumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberOrderRetrieveParams =
            MessagingHostedNumberOrderRetrieveParams.none(),
    ): MessagingHostedNumberOrderRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberOrderRetrieveParams
    ): MessagingHostedNumberOrderRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderRetrieveResponse =
        retrieve(id, MessagingHostedNumberOrderRetrieveParams.none(), requestOptions)

    /** List messaging hosted number orders */
    fun list(): MessagingHostedNumberOrderListPage =
        list(MessagingHostedNumberOrderListParams.none())

    /** @see list */
    fun list(
        params: MessagingHostedNumberOrderListParams = MessagingHostedNumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderListPage

    /** @see list */
    fun list(
        params: MessagingHostedNumberOrderListParams = MessagingHostedNumberOrderListParams.none()
    ): MessagingHostedNumberOrderListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingHostedNumberOrderListPage =
        list(MessagingHostedNumberOrderListParams.none(), requestOptions)

    /** Delete a messaging hosted number order and all associated phone numbers. */
    fun delete(id: String): MessagingHostedNumberOrderDeleteResponse =
        delete(id, MessagingHostedNumberOrderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberOrderDeleteParams =
            MessagingHostedNumberOrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberOrderDeleteParams =
            MessagingHostedNumberOrderDeleteParams.none(),
    ): MessagingHostedNumberOrderDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderDeleteResponse

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberOrderDeleteParams
    ): MessagingHostedNumberOrderDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): MessagingHostedNumberOrderDeleteResponse =
        delete(id, MessagingHostedNumberOrderDeleteParams.none(), requestOptions)

    /** Check hosted messaging eligibility */
    fun checkEligibility(
        params: MessagingHostedNumberOrderCheckEligibilityParams
    ): MessagingHostedNumberOrderCheckEligibilityResponse =
        checkEligibility(params, RequestOptions.none())

    /** @see checkEligibility */
    fun checkEligibility(
        params: MessagingHostedNumberOrderCheckEligibilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderCheckEligibilityResponse

    /**
     * Create verification codes to validate numbers of the hosted order. The verification codes
     * will be sent to the numbers of the hosted order.
     */
    fun createVerificationCodes(
        id: String,
        params: MessagingHostedNumberOrderCreateVerificationCodesParams,
    ): MessagingHostedNumberOrderCreateVerificationCodesResponse =
        createVerificationCodes(id, params, RequestOptions.none())

    /** @see createVerificationCodes */
    fun createVerificationCodes(
        id: String,
        params: MessagingHostedNumberOrderCreateVerificationCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderCreateVerificationCodesResponse =
        createVerificationCodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see createVerificationCodes */
    fun createVerificationCodes(
        params: MessagingHostedNumberOrderCreateVerificationCodesParams
    ): MessagingHostedNumberOrderCreateVerificationCodesResponse =
        createVerificationCodes(params, RequestOptions.none())

    /** @see createVerificationCodes */
    fun createVerificationCodes(
        params: MessagingHostedNumberOrderCreateVerificationCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderCreateVerificationCodesResponse

    /**
     * Validate the verification codes sent to the numbers of the hosted order. The verification
     * codes must be created in the verification codes endpoint.
     */
    fun validateCodes(
        id: String,
        params: MessagingHostedNumberOrderValidateCodesParams,
    ): MessagingHostedNumberOrderValidateCodesResponse =
        validateCodes(id, params, RequestOptions.none())

    /** @see validateCodes */
    fun validateCodes(
        id: String,
        params: MessagingHostedNumberOrderValidateCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderValidateCodesResponse =
        validateCodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see validateCodes */
    fun validateCodes(
        params: MessagingHostedNumberOrderValidateCodesParams
    ): MessagingHostedNumberOrderValidateCodesResponse =
        validateCodes(params, RequestOptions.none())

    /** @see validateCodes */
    fun validateCodes(
        params: MessagingHostedNumberOrderValidateCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingHostedNumberOrderValidateCodesResponse

    /**
     * A view of [MessagingHostedNumberOrderService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingHostedNumberOrderService.WithRawResponse

        /** Manage your messaging hosted numbers */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_hosted_number_orders`, but is otherwise
         * the same as [MessagingHostedNumberOrderService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<MessagingHostedNumberOrderCreateResponse> =
            create(MessagingHostedNumberOrderCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessagingHostedNumberOrderCreateParams =
                MessagingHostedNumberOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessagingHostedNumberOrderCreateParams =
                MessagingHostedNumberOrderCreateParams.none()
        ): HttpResponseFor<MessagingHostedNumberOrderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<MessagingHostedNumberOrderCreateResponse> =
            create(MessagingHostedNumberOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_hosted_number_orders/{id}`, but is
         * otherwise the same as [MessagingHostedNumberOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse> =
            retrieve(id, MessagingHostedNumberOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingHostedNumberOrderRetrieveParams =
                MessagingHostedNumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingHostedNumberOrderRetrieveParams =
                MessagingHostedNumberOrderRetrieveParams.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingHostedNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingHostedNumberOrderRetrieveParams
        ): HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse> =
            retrieve(id, MessagingHostedNumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_hosted_number_orders`, but is otherwise
         * the same as [MessagingHostedNumberOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingHostedNumberOrderListPage> =
            list(MessagingHostedNumberOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingHostedNumberOrderListParams =
                MessagingHostedNumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingHostedNumberOrderListParams =
                MessagingHostedNumberOrderListParams.none()
        ): HttpResponseFor<MessagingHostedNumberOrderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<MessagingHostedNumberOrderListPage> =
            list(MessagingHostedNumberOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messaging_hosted_number_orders/{id}`, but is
         * otherwise the same as [MessagingHostedNumberOrderService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MessagingHostedNumberOrderDeleteResponse> =
            delete(id, MessagingHostedNumberOrderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingHostedNumberOrderDeleteParams =
                MessagingHostedNumberOrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingHostedNumberOrderDeleteParams =
                MessagingHostedNumberOrderDeleteParams.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingHostedNumberOrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingHostedNumberOrderDeleteParams
        ): HttpResponseFor<MessagingHostedNumberOrderDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingHostedNumberOrderDeleteResponse> =
            delete(id, MessagingHostedNumberOrderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/eligibility_numbers_check`, but is otherwise the same as
         * [MessagingHostedNumberOrderService.checkEligibility].
         */
        @MustBeClosed
        fun checkEligibility(
            params: MessagingHostedNumberOrderCheckEligibilityParams
        ): HttpResponseFor<MessagingHostedNumberOrderCheckEligibilityResponse> =
            checkEligibility(params, RequestOptions.none())

        /** @see checkEligibility */
        @MustBeClosed
        fun checkEligibility(
            params: MessagingHostedNumberOrderCheckEligibilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderCheckEligibilityResponse>

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/{id}/verification_codes`, but is otherwise the same as
         * [MessagingHostedNumberOrderService.createVerificationCodes].
         */
        @MustBeClosed
        fun createVerificationCodes(
            id: String,
            params: MessagingHostedNumberOrderCreateVerificationCodesParams,
        ): HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse> =
            createVerificationCodes(id, params, RequestOptions.none())

        /** @see createVerificationCodes */
        @MustBeClosed
        fun createVerificationCodes(
            id: String,
            params: MessagingHostedNumberOrderCreateVerificationCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse> =
            createVerificationCodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see createVerificationCodes */
        @MustBeClosed
        fun createVerificationCodes(
            params: MessagingHostedNumberOrderCreateVerificationCodesParams
        ): HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse> =
            createVerificationCodes(params, RequestOptions.none())

        /** @see createVerificationCodes */
        @MustBeClosed
        fun createVerificationCodes(
            params: MessagingHostedNumberOrderCreateVerificationCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse>

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/{id}/validation_codes`, but is otherwise the same as
         * [MessagingHostedNumberOrderService.validateCodes].
         */
        @MustBeClosed
        fun validateCodes(
            id: String,
            params: MessagingHostedNumberOrderValidateCodesParams,
        ): HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse> =
            validateCodes(id, params, RequestOptions.none())

        /** @see validateCodes */
        @MustBeClosed
        fun validateCodes(
            id: String,
            params: MessagingHostedNumberOrderValidateCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse> =
            validateCodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see validateCodes */
        @MustBeClosed
        fun validateCodes(
            params: MessagingHostedNumberOrderValidateCodesParams
        ): HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse> =
            validateCodes(params, RequestOptions.none())

        /** @see validateCodes */
        @MustBeClosed
        fun validateCodes(
            params: MessagingHostedNumberOrderValidateCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse>
    }
}
