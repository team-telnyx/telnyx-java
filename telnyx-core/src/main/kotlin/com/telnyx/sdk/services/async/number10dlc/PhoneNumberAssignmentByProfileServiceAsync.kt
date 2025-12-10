// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberAssignmentByProfileServiceAsync {

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
    ): PhoneNumberAssignmentByProfileServiceAsync

    /**
     * Check the status of the task associated with assigning all phone numbers on a messaging
     * profile to a campaign by `taskId`.
     */
    fun retrieve(
        taskId: String
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveResponse> =
        retrieve(taskId, PhoneNumberAssignmentByProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveParams =
            PhoneNumberAssignmentByProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveResponse> =
        retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveParams =
            PhoneNumberAssignmentByProfileRetrieveParams.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveResponse> =
        retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberAssignmentByProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberAssignmentByProfileRetrieveParams
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveResponse> =
        retrieve(taskId, PhoneNumberAssignmentByProfileRetrieveParams.none(), requestOptions)

    /**
     * This endpoint allows you to link all phone numbers associated with a Messaging Profile to a
     * campaign. **Please note:** if you want to assign phone numbers to a campaign that you did not
     * create with Telnyx 10DLC services, this endpoint allows that provided that you've shared the
     * campaign with Telnyx. In this case, only provide the parameter, `tcrCampaignId`, and not
     * `campaignId`. In all other cases (where the campaign you're assigning was created with Telnyx
     * 10DLC services), only provide `campaignId`, not `tcrCampaignId`.
     */
    fun phoneNumberAssignmentByProfile(
        params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams
    ): CompletableFuture<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse> =
        phoneNumberAssignmentByProfile(params, RequestOptions.none())

    /** @see phoneNumberAssignmentByProfile */
    fun phoneNumberAssignmentByProfile(
        params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse>

    /**
     * Check the status of the individual phone number/campaign assignments associated with the
     * supplied `taskId`.
     */
    fun retrievePhoneNumbers(
        taskId: String
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
        retrievePhoneNumbers(
            taskId,
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
        )

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams =
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
        retrievePhoneNumbers(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams =
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
        retrievePhoneNumbers(taskId, params, RequestOptions.none())

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
        retrievePhoneNumbers(params, RequestOptions.none())

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
        retrievePhoneNumbers(
            taskId,
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
            requestOptions,
        )

    /**
     * A view of [PhoneNumberAssignmentByProfileServiceAsync] that provides access to raw HTTP
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
        ): PhoneNumberAssignmentByProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/phoneNumberAssignmentByProfile/{taskId}`, but
         * is otherwise the same as [PhoneNumberAssignmentByProfileServiceAsync.retrieve].
         */
        fun retrieve(
            taskId: String
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse>> =
            retrieve(taskId, PhoneNumberAssignmentByProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveParams =
                PhoneNumberAssignmentByProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse>> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveParams =
                PhoneNumberAssignmentByProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse>> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberAssignmentByProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberAssignmentByProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse>> =
            retrieve(taskId, PhoneNumberAssignmentByProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/phoneNumberAssignmentByProfile`, but is
         * otherwise the same as
         * [PhoneNumberAssignmentByProfileServiceAsync.phoneNumberAssignmentByProfile].
         */
        fun phoneNumberAssignmentByProfile(
            params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse>
        > = phoneNumberAssignmentByProfile(params, RequestOptions.none())

        /** @see phoneNumberAssignmentByProfile */
        fun phoneNumberAssignmentByProfile(
            params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse>
        >

        /**
         * Returns a raw HTTP response for `get
         * /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers`, but is otherwise the same
         * as [PhoneNumberAssignmentByProfileServiceAsync.retrievePhoneNumbers].
         */
        fun retrievePhoneNumbers(
            taskId: String
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>
        > =
            retrievePhoneNumbers(
                taskId,
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
            )

        /** @see retrievePhoneNumbers */
        fun retrievePhoneNumbers(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams =
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>
        > = retrievePhoneNumbers(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePhoneNumbers */
        fun retrievePhoneNumbers(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams =
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>
        > = retrievePhoneNumbers(taskId, params, RequestOptions.none())

        /** @see retrievePhoneNumbers */
        fun retrievePhoneNumbers(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>
        >

        /** @see retrievePhoneNumbers */
        fun retrievePhoneNumbers(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>
        > = retrievePhoneNumbers(params, RequestOptions.none())

        /** @see retrievePhoneNumbers */
        fun retrievePhoneNumbers(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>
        > =
            retrievePhoneNumbers(
                taskId,
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
                requestOptions,
            )
    }
}
