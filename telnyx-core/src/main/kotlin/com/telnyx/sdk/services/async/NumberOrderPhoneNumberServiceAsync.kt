// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberListParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberListResponse
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberRetrieveParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberRetrieveResponse
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementGroupResponse
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsParams
import com.telnyx.sdk.models.numberorderphonenumbers.NumberOrderPhoneNumberUpdateRequirementsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NumberOrderPhoneNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberOrderPhoneNumberServiceAsync

    /** Get an existing phone number in number order. */
    fun retrieve(
        numberOrderPhoneNumberId: String
    ): CompletableFuture<NumberOrderPhoneNumberRetrieveResponse> =
        retrieve(numberOrderPhoneNumberId, NumberOrderPhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderPhoneNumberId: String,
        params: NumberOrderPhoneNumberRetrieveParams = NumberOrderPhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderPhoneNumberRetrieveResponse> =
        retrieve(
            params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        numberOrderPhoneNumberId: String,
        params: NumberOrderPhoneNumberRetrieveParams = NumberOrderPhoneNumberRetrieveParams.none(),
    ): CompletableFuture<NumberOrderPhoneNumberRetrieveResponse> =
        retrieve(numberOrderPhoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberOrderPhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderPhoneNumberRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NumberOrderPhoneNumberRetrieveParams
    ): CompletableFuture<NumberOrderPhoneNumberRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderPhoneNumberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderPhoneNumberRetrieveResponse> =
        retrieve(
            numberOrderPhoneNumberId,
            NumberOrderPhoneNumberRetrieveParams.none(),
            requestOptions,
        )

    /** Get a list of phone numbers associated to orders. */
    fun list(): CompletableFuture<NumberOrderPhoneNumberListResponse> =
        list(NumberOrderPhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderPhoneNumberListResponse>

    /** @see list */
    fun list(
        params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none()
    ): CompletableFuture<NumberOrderPhoneNumberListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<NumberOrderPhoneNumberListResponse> =
        list(NumberOrderPhoneNumberListParams.none(), requestOptions)

    /** Update requirement group for a phone number order */
    fun updateRequirementGroup(
        id: String,
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
        updateRequirementGroup(id, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        id: String,
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
        updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
        updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementGroupResponse>

    /** Updates requirements for a single phone number within a number order. */
    fun updateRequirements(
        numberOrderPhoneNumberId: String
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementsResponse> =
        updateRequirements(
            numberOrderPhoneNumberId,
            NumberOrderPhoneNumberUpdateRequirementsParams.none(),
        )

    /** @see updateRequirements */
    fun updateRequirements(
        numberOrderPhoneNumberId: String,
        params: NumberOrderPhoneNumberUpdateRequirementsParams =
            NumberOrderPhoneNumberUpdateRequirementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementsResponse> =
        updateRequirements(
            params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
            requestOptions,
        )

    /** @see updateRequirements */
    fun updateRequirements(
        numberOrderPhoneNumberId: String,
        params: NumberOrderPhoneNumberUpdateRequirementsParams =
            NumberOrderPhoneNumberUpdateRequirementsParams.none(),
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementsResponse> =
        updateRequirements(numberOrderPhoneNumberId, params, RequestOptions.none())

    /** @see updateRequirements */
    fun updateRequirements(
        params: NumberOrderPhoneNumberUpdateRequirementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementsResponse>

    /** @see updateRequirements */
    fun updateRequirements(
        params: NumberOrderPhoneNumberUpdateRequirementsParams
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementsResponse> =
        updateRequirements(params, RequestOptions.none())

    /** @see updateRequirements */
    fun updateRequirements(
        numberOrderPhoneNumberId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderPhoneNumberUpdateRequirementsResponse> =
        updateRequirements(
            numberOrderPhoneNumberId,
            NumberOrderPhoneNumberUpdateRequirementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [NumberOrderPhoneNumberServiceAsync] that provides access to raw HTTP responses for
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
        ): NumberOrderPhoneNumberServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /number_order_phone_numbers/{number_order_phone_number_id}`, but is otherwise the same as
         * [NumberOrderPhoneNumberServiceAsync.retrieve].
         */
        fun retrieve(
            numberOrderPhoneNumberId: String
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>> =
            retrieve(numberOrderPhoneNumberId, NumberOrderPhoneNumberRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberRetrieveParams =
                NumberOrderPhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>> =
            retrieve(
                params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberRetrieveParams =
                NumberOrderPhoneNumberRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>> =
            retrieve(numberOrderPhoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NumberOrderPhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NumberOrderPhoneNumberRetrieveParams
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            numberOrderPhoneNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>> =
            retrieve(
                numberOrderPhoneNumberId,
                NumberOrderPhoneNumberRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /number_order_phone_numbers`, but is otherwise the
         * same as [NumberOrderPhoneNumberServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberListResponse>> =
            list(NumberOrderPhoneNumberListParams.none())

        /** @see list */
        fun list(
            params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberListResponse>>

        /** @see list */
        fun list(
            params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none()
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberListResponse>> =
            list(NumberOrderPhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /number_order_phone_numbers/{id}/requirement_group`, but is otherwise the same as
         * [NumberOrderPhoneNumberServiceAsync.updateRequirementGroup].
         */
        fun updateRequirementGroup(
            id: String,
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        ): CompletableFuture<
            HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse>
        > = updateRequirementGroup(id, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            id: String,
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse>
        > = updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams
        ): CompletableFuture<
            HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse>
        > = updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        fun updateRequirementGroup(
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /number_order_phone_numbers/{number_order_phone_number_id}`, but is otherwise the same as
         * [NumberOrderPhoneNumberServiceAsync.updateRequirements].
         */
        fun updateRequirements(
            numberOrderPhoneNumberId: String
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>> =
            updateRequirements(
                numberOrderPhoneNumberId,
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
            )

        /** @see updateRequirements */
        fun updateRequirements(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberUpdateRequirementsParams =
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>> =
            updateRequirements(
                params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
                requestOptions,
            )

        /** @see updateRequirements */
        fun updateRequirements(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberUpdateRequirementsParams =
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>> =
            updateRequirements(numberOrderPhoneNumberId, params, RequestOptions.none())

        /** @see updateRequirements */
        fun updateRequirements(
            params: NumberOrderPhoneNumberUpdateRequirementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>>

        /** @see updateRequirements */
        fun updateRequirements(
            params: NumberOrderPhoneNumberUpdateRequirementsParams
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>> =
            updateRequirements(params, RequestOptions.none())

        /** @see updateRequirements */
        fun updateRequirements(
            numberOrderPhoneNumberId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>> =
            updateRequirements(
                numberOrderPhoneNumberId,
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
                requestOptions,
            )
    }
}
