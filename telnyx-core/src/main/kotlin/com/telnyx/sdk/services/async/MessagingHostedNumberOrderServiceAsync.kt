// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderListPageAsync
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderListParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderRetrieveParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderRetrieveResponse
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesParams
import com.telnyx.sdk.models.messaginghostednumberorders.MessagingHostedNumberOrderValidateCodesResponse
import com.telnyx.sdk.services.async.messaginghostednumberorders.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessagingHostedNumberOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MessagingHostedNumberOrderServiceAsync

    fun actions(): ActionServiceAsync

    /** Create a messaging hosted number order */
    fun create(): CompletableFuture<MessagingHostedNumberOrderCreateResponse> =
        create(MessagingHostedNumberOrderCreateParams.none())

    /** @see create */
    fun create(
        params: MessagingHostedNumberOrderCreateParams =
            MessagingHostedNumberOrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderCreateResponse>

    /** @see create */
    fun create(
        params: MessagingHostedNumberOrderCreateParams =
            MessagingHostedNumberOrderCreateParams.none()
    ): CompletableFuture<MessagingHostedNumberOrderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<MessagingHostedNumberOrderCreateResponse> =
        create(MessagingHostedNumberOrderCreateParams.none(), requestOptions)

    /** Retrieve a messaging hosted number order */
    fun retrieve(id: String): CompletableFuture<MessagingHostedNumberOrderRetrieveResponse> =
        retrieve(id, MessagingHostedNumberOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberOrderRetrieveParams =
            MessagingHostedNumberOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingHostedNumberOrderRetrieveParams =
            MessagingHostedNumberOrderRetrieveParams.none(),
    ): CompletableFuture<MessagingHostedNumberOrderRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MessagingHostedNumberOrderRetrieveParams
    ): CompletableFuture<MessagingHostedNumberOrderRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingHostedNumberOrderRetrieveResponse> =
        retrieve(id, MessagingHostedNumberOrderRetrieveParams.none(), requestOptions)

    /** List messaging hosted number orders */
    fun list(): CompletableFuture<MessagingHostedNumberOrderListPageAsync> =
        list(MessagingHostedNumberOrderListParams.none())

    /** @see list */
    fun list(
        params: MessagingHostedNumberOrderListParams = MessagingHostedNumberOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderListPageAsync>

    /** @see list */
    fun list(
        params: MessagingHostedNumberOrderListParams = MessagingHostedNumberOrderListParams.none()
    ): CompletableFuture<MessagingHostedNumberOrderListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<MessagingHostedNumberOrderListPageAsync> =
        list(MessagingHostedNumberOrderListParams.none(), requestOptions)

    /** Delete a messaging hosted number order and all associated phone numbers. */
    fun delete(id: String): CompletableFuture<MessagingHostedNumberOrderDeleteResponse> =
        delete(id, MessagingHostedNumberOrderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberOrderDeleteParams =
            MessagingHostedNumberOrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingHostedNumberOrderDeleteParams =
            MessagingHostedNumberOrderDeleteParams.none(),
    ): CompletableFuture<MessagingHostedNumberOrderDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderDeleteResponse>

    /** @see delete */
    fun delete(
        params: MessagingHostedNumberOrderDeleteParams
    ): CompletableFuture<MessagingHostedNumberOrderDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingHostedNumberOrderDeleteResponse> =
        delete(id, MessagingHostedNumberOrderDeleteParams.none(), requestOptions)

    /** Check hosted messaging eligibility */
    fun checkEligibility(
        params: MessagingHostedNumberOrderCheckEligibilityParams
    ): CompletableFuture<MessagingHostedNumberOrderCheckEligibilityResponse> =
        checkEligibility(params, RequestOptions.none())

    /** @see checkEligibility */
    fun checkEligibility(
        params: MessagingHostedNumberOrderCheckEligibilityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderCheckEligibilityResponse>

    /**
     * Create verification codes to validate numbers of the hosted order. The verification codes
     * will be sent to the numbers of the hosted order.
     */
    fun createVerificationCodes(
        id: String,
        params: MessagingHostedNumberOrderCreateVerificationCodesParams,
    ): CompletableFuture<MessagingHostedNumberOrderCreateVerificationCodesResponse> =
        createVerificationCodes(id, params, RequestOptions.none())

    /** @see createVerificationCodes */
    fun createVerificationCodes(
        id: String,
        params: MessagingHostedNumberOrderCreateVerificationCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderCreateVerificationCodesResponse> =
        createVerificationCodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see createVerificationCodes */
    fun createVerificationCodes(
        params: MessagingHostedNumberOrderCreateVerificationCodesParams
    ): CompletableFuture<MessagingHostedNumberOrderCreateVerificationCodesResponse> =
        createVerificationCodes(params, RequestOptions.none())

    /** @see createVerificationCodes */
    fun createVerificationCodes(
        params: MessagingHostedNumberOrderCreateVerificationCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderCreateVerificationCodesResponse>

    /**
     * Validate the verification codes sent to the numbers of the hosted order. The verification
     * codes must be created in the verification codes endpoint.
     */
    fun validateCodes(
        id: String,
        params: MessagingHostedNumberOrderValidateCodesParams,
    ): CompletableFuture<MessagingHostedNumberOrderValidateCodesResponse> =
        validateCodes(id, params, RequestOptions.none())

    /** @see validateCodes */
    fun validateCodes(
        id: String,
        params: MessagingHostedNumberOrderValidateCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderValidateCodesResponse> =
        validateCodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see validateCodes */
    fun validateCodes(
        params: MessagingHostedNumberOrderValidateCodesParams
    ): CompletableFuture<MessagingHostedNumberOrderValidateCodesResponse> =
        validateCodes(params, RequestOptions.none())

    /** @see validateCodes */
    fun validateCodes(
        params: MessagingHostedNumberOrderValidateCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingHostedNumberOrderValidateCodesResponse>

    /**
     * A view of [MessagingHostedNumberOrderServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessagingHostedNumberOrderServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_hosted_number_orders`, but is otherwise
         * the same as [MessagingHostedNumberOrderServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderCreateResponse>> =
            create(MessagingHostedNumberOrderCreateParams.none())

        /** @see create */
        fun create(
            params: MessagingHostedNumberOrderCreateParams =
                MessagingHostedNumberOrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderCreateResponse>>

        /** @see create */
        fun create(
            params: MessagingHostedNumberOrderCreateParams =
                MessagingHostedNumberOrderCreateParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderCreateResponse>> =
            create(MessagingHostedNumberOrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_hosted_number_orders/{id}`, but is
         * otherwise the same as [MessagingHostedNumberOrderServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse>> =
            retrieve(id, MessagingHostedNumberOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingHostedNumberOrderRetrieveParams =
                MessagingHostedNumberOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingHostedNumberOrderRetrieveParams =
                MessagingHostedNumberOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessagingHostedNumberOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessagingHostedNumberOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderRetrieveResponse>> =
            retrieve(id, MessagingHostedNumberOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_hosted_number_orders`, but is otherwise
         * the same as [MessagingHostedNumberOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderListPageAsync>> =
            list(MessagingHostedNumberOrderListParams.none())

        /** @see list */
        fun list(
            params: MessagingHostedNumberOrderListParams =
                MessagingHostedNumberOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderListPageAsync>>

        /** @see list */
        fun list(
            params: MessagingHostedNumberOrderListParams =
                MessagingHostedNumberOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderListPageAsync>> =
            list(MessagingHostedNumberOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messaging_hosted_number_orders/{id}`, but is
         * otherwise the same as [MessagingHostedNumberOrderServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderDeleteResponse>> =
            delete(id, MessagingHostedNumberOrderDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingHostedNumberOrderDeleteParams =
                MessagingHostedNumberOrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingHostedNumberOrderDeleteParams =
                MessagingHostedNumberOrderDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MessagingHostedNumberOrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MessagingHostedNumberOrderDeleteParams
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderDeleteResponse>> =
            delete(id, MessagingHostedNumberOrderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/eligibility_numbers_check`, but is otherwise the same as
         * [MessagingHostedNumberOrderServiceAsync.checkEligibility].
         */
        fun checkEligibility(
            params: MessagingHostedNumberOrderCheckEligibilityParams
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderCheckEligibilityResponse>> =
            checkEligibility(params, RequestOptions.none())

        /** @see checkEligibility */
        fun checkEligibility(
            params: MessagingHostedNumberOrderCheckEligibilityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderCheckEligibilityResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/{id}/verification_codes`, but is otherwise the same as
         * [MessagingHostedNumberOrderServiceAsync.createVerificationCodes].
         */
        fun createVerificationCodes(
            id: String,
            params: MessagingHostedNumberOrderCreateVerificationCodesParams,
        ): CompletableFuture<
            HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse>
        > = createVerificationCodes(id, params, RequestOptions.none())

        /** @see createVerificationCodes */
        fun createVerificationCodes(
            id: String,
            params: MessagingHostedNumberOrderCreateVerificationCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse>
        > = createVerificationCodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see createVerificationCodes */
        fun createVerificationCodes(
            params: MessagingHostedNumberOrderCreateVerificationCodesParams
        ): CompletableFuture<
            HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse>
        > = createVerificationCodes(params, RequestOptions.none())

        /** @see createVerificationCodes */
        fun createVerificationCodes(
            params: MessagingHostedNumberOrderCreateVerificationCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<MessagingHostedNumberOrderCreateVerificationCodesResponse>
        >

        /**
         * Returns a raw HTTP response for `post
         * /messaging_hosted_number_orders/{id}/validation_codes`, but is otherwise the same as
         * [MessagingHostedNumberOrderServiceAsync.validateCodes].
         */
        fun validateCodes(
            id: String,
            params: MessagingHostedNumberOrderValidateCodesParams,
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse>> =
            validateCodes(id, params, RequestOptions.none())

        /** @see validateCodes */
        fun validateCodes(
            id: String,
            params: MessagingHostedNumberOrderValidateCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse>> =
            validateCodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see validateCodes */
        fun validateCodes(
            params: MessagingHostedNumberOrderValidateCodesParams
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse>> =
            validateCodes(params, RequestOptions.none())

        /** @see validateCodes */
        fun validateCodes(
            params: MessagingHostedNumberOrderValidateCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingHostedNumberOrderValidateCodesResponse>>
    }
}
