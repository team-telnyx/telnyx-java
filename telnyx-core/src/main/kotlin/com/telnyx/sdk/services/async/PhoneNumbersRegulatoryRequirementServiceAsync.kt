// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbersregulatoryrequirements.PhoneNumbersRegulatoryRequirementRetrieveParams
import com.telnyx.sdk.models.phonenumbersregulatoryrequirements.PhoneNumbersRegulatoryRequirementRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Regulatory Requirements */
interface PhoneNumbersRegulatoryRequirementServiceAsync {

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
    ): PhoneNumbersRegulatoryRequirementServiceAsync

    /** Retrieve regulatory requirements for a list of phone numbers */
    fun retrieve(): CompletableFuture<PhoneNumbersRegulatoryRequirementRetrieveResponse> =
        retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumbersRegulatoryRequirementRetrieveParams =
            PhoneNumbersRegulatoryRequirementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumbersRegulatoryRequirementRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumbersRegulatoryRequirementRetrieveParams =
            PhoneNumbersRegulatoryRequirementRetrieveParams.none()
    ): CompletableFuture<PhoneNumbersRegulatoryRequirementRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        requestOptions: RequestOptions
    ): CompletableFuture<PhoneNumbersRegulatoryRequirementRetrieveResponse> =
        retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none(), requestOptions)

    /**
     * A view of [PhoneNumbersRegulatoryRequirementServiceAsync] that provides access to raw HTTP
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
        ): PhoneNumbersRegulatoryRequirementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /phone_numbers_regulatory_requirements`, but is
         * otherwise the same as [PhoneNumbersRegulatoryRequirementServiceAsync.retrieve].
         */
        fun retrieve():
            CompletableFuture<HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse>> =
            retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumbersRegulatoryRequirementRetrieveParams =
                PhoneNumbersRegulatoryRequirementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumbersRegulatoryRequirementRetrieveParams =
                PhoneNumbersRegulatoryRequirementRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumbersRegulatoryRequirementRetrieveResponse>> =
            retrieve(PhoneNumbersRegulatoryRequirementRetrieveParams.none(), requestOptions)
    }
}
