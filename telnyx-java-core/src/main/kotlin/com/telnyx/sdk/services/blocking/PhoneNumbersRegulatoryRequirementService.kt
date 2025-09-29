// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbersregulatoryrequirements.PhoneNumbersRegulatoryRequirementRetrieveParams
import com.telnyx.sdk.models.phonenumbersregulatoryrequirements.PhoneNumbersRegulatoryRequirementRetrieveResponse
import java.util.function.Consumer

interface PhoneNumbersRegulatoryRequirementService {

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
    ): PhoneNumbersRegulatoryRequirementService

    /** Retrieve regulatory requirements for a list of phone numbers */
    fun retrieve(): PhoneNumbersRegulatoryRequirementRetrieveResponse =
        retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumbersRegulatoryRequirementRetrieveParams =
            PhoneNumbersRegulatoryRequirementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumbersRegulatoryRequirementRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumbersRegulatoryRequirementRetrieveParams =
            PhoneNumbersRegulatoryRequirementRetrieveParams.none()
    ): PhoneNumbersRegulatoryRequirementRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        requestOptions: RequestOptions
    ): PhoneNumbersRegulatoryRequirementRetrieveResponse =
        retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none(), requestOptions)

    /**
     * A view of [PhoneNumbersRegulatoryRequirementService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumbersRegulatoryRequirementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers_regulatory_requirements`, but is
         * otherwise the same as [PhoneNumbersRegulatoryRequirementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse> =
            retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumbersRegulatoryRequirementRetrieveParams =
                PhoneNumbersRegulatoryRequirementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumbersRegulatoryRequirementRetrieveParams =
                PhoneNumbersRegulatoryRequirementRetrieveParams.none()
        ): HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse> =
            retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none(), requestOptions)
    }
}
