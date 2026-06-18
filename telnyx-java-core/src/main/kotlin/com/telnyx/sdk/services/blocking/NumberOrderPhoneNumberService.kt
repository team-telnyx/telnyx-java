// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface NumberOrderPhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberOrderPhoneNumberService

    /** Get an existing phone number in number order. */
    fun retrieve(numberOrderPhoneNumberId: String): NumberOrderPhoneNumberRetrieveResponse =
        retrieve(numberOrderPhoneNumberId, NumberOrderPhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderPhoneNumberId: String,
        params: NumberOrderPhoneNumberRetrieveParams = NumberOrderPhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderPhoneNumberRetrieveResponse =
        retrieve(
            params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        numberOrderPhoneNumberId: String,
        params: NumberOrderPhoneNumberRetrieveParams = NumberOrderPhoneNumberRetrieveParams.none(),
    ): NumberOrderPhoneNumberRetrieveResponse =
        retrieve(numberOrderPhoneNumberId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NumberOrderPhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderPhoneNumberRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: NumberOrderPhoneNumberRetrieveParams
    ): NumberOrderPhoneNumberRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        numberOrderPhoneNumberId: String,
        requestOptions: RequestOptions,
    ): NumberOrderPhoneNumberRetrieveResponse =
        retrieve(
            numberOrderPhoneNumberId,
            NumberOrderPhoneNumberRetrieveParams.none(),
            requestOptions,
        )

    /** Get a list of phone numbers associated to orders. */
    fun list(): NumberOrderPhoneNumberListResponse = list(NumberOrderPhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderPhoneNumberListResponse

    /** @see list */
    fun list(
        params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none()
    ): NumberOrderPhoneNumberListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NumberOrderPhoneNumberListResponse =
        list(NumberOrderPhoneNumberListParams.none(), requestOptions)

    /** Update requirement group for a phone number order */
    fun updateRequirementGroup(
        id: String,
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
    ): NumberOrderPhoneNumberUpdateRequirementGroupResponse =
        updateRequirementGroup(id, params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        id: String,
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderPhoneNumberUpdateRequirementGroupResponse =
        updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams
    ): NumberOrderPhoneNumberUpdateRequirementGroupResponse =
        updateRequirementGroup(params, RequestOptions.none())

    /** @see updateRequirementGroup */
    fun updateRequirementGroup(
        params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderPhoneNumberUpdateRequirementGroupResponse

    /** Updates requirements for a single phone number within a number order. */
    fun updateRequirements(
        numberOrderPhoneNumberId: String
    ): NumberOrderPhoneNumberUpdateRequirementsResponse =
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
    ): NumberOrderPhoneNumberUpdateRequirementsResponse =
        updateRequirements(
            params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
            requestOptions,
        )

    /** @see updateRequirements */
    fun updateRequirements(
        numberOrderPhoneNumberId: String,
        params: NumberOrderPhoneNumberUpdateRequirementsParams =
            NumberOrderPhoneNumberUpdateRequirementsParams.none(),
    ): NumberOrderPhoneNumberUpdateRequirementsResponse =
        updateRequirements(numberOrderPhoneNumberId, params, RequestOptions.none())

    /** @see updateRequirements */
    fun updateRequirements(
        params: NumberOrderPhoneNumberUpdateRequirementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NumberOrderPhoneNumberUpdateRequirementsResponse

    /** @see updateRequirements */
    fun updateRequirements(
        params: NumberOrderPhoneNumberUpdateRequirementsParams
    ): NumberOrderPhoneNumberUpdateRequirementsResponse =
        updateRequirements(params, RequestOptions.none())

    /** @see updateRequirements */
    fun updateRequirements(
        numberOrderPhoneNumberId: String,
        requestOptions: RequestOptions,
    ): NumberOrderPhoneNumberUpdateRequirementsResponse =
        updateRequirements(
            numberOrderPhoneNumberId,
            NumberOrderPhoneNumberUpdateRequirementsParams.none(),
            requestOptions,
        )

    /**
     * A view of [NumberOrderPhoneNumberService] that provides access to raw HTTP responses for each
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
        ): NumberOrderPhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /number_order_phone_numbers/{number_order_phone_number_id}`, but is otherwise the same as
         * [NumberOrderPhoneNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            numberOrderPhoneNumberId: String
        ): HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse> =
            retrieve(numberOrderPhoneNumberId, NumberOrderPhoneNumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberRetrieveParams =
                NumberOrderPhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse> =
            retrieve(
                params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberRetrieveParams =
                NumberOrderPhoneNumberRetrieveParams.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse> =
            retrieve(numberOrderPhoneNumberId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberOrderPhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NumberOrderPhoneNumberRetrieveParams
        ): HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            numberOrderPhoneNumberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderPhoneNumberRetrieveResponse> =
            retrieve(
                numberOrderPhoneNumberId,
                NumberOrderPhoneNumberRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /number_order_phone_numbers`, but is otherwise the
         * same as [NumberOrderPhoneNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NumberOrderPhoneNumberListResponse> =
            list(NumberOrderPhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NumberOrderPhoneNumberListParams = NumberOrderPhoneNumberListParams.none()
        ): HttpResponseFor<NumberOrderPhoneNumberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<NumberOrderPhoneNumberListResponse> =
            list(NumberOrderPhoneNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /number_order_phone_numbers/{id}/requirement_group`, but is otherwise the same as
         * [NumberOrderPhoneNumberService.updateRequirementGroup].
         */
        @MustBeClosed
        fun updateRequirementGroup(
            id: String,
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
            updateRequirementGroup(id, params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            id: String,
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
            updateRequirementGroup(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse> =
            updateRequirementGroup(params, RequestOptions.none())

        /** @see updateRequirementGroup */
        @MustBeClosed
        fun updateRequirementGroup(
            params: NumberOrderPhoneNumberUpdateRequirementGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementGroupResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /number_order_phone_numbers/{number_order_phone_number_id}`, but is otherwise the same as
         * [NumberOrderPhoneNumberService.updateRequirements].
         */
        @MustBeClosed
        fun updateRequirements(
            numberOrderPhoneNumberId: String
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse> =
            updateRequirements(
                numberOrderPhoneNumberId,
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
            )

        /** @see updateRequirements */
        @MustBeClosed
        fun updateRequirements(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberUpdateRequirementsParams =
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse> =
            updateRequirements(
                params.toBuilder().numberOrderPhoneNumberId(numberOrderPhoneNumberId).build(),
                requestOptions,
            )

        /** @see updateRequirements */
        @MustBeClosed
        fun updateRequirements(
            numberOrderPhoneNumberId: String,
            params: NumberOrderPhoneNumberUpdateRequirementsParams =
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse> =
            updateRequirements(numberOrderPhoneNumberId, params, RequestOptions.none())

        /** @see updateRequirements */
        @MustBeClosed
        fun updateRequirements(
            params: NumberOrderPhoneNumberUpdateRequirementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse>

        /** @see updateRequirements */
        @MustBeClosed
        fun updateRequirements(
            params: NumberOrderPhoneNumberUpdateRequirementsParams
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse> =
            updateRequirements(params, RequestOptions.none())

        /** @see updateRequirements */
        @MustBeClosed
        fun updateRequirements(
            numberOrderPhoneNumberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderPhoneNumberUpdateRequirementsResponse> =
            updateRequirements(
                numberOrderPhoneNumberId,
                NumberOrderPhoneNumberUpdateRequirementsParams.none(),
                requestOptions,
            )
    }
}
