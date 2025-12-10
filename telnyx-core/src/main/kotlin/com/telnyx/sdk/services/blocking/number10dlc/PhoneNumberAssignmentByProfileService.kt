// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveResponse
import java.util.function.Consumer

interface PhoneNumberAssignmentByProfileService {

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
    ): PhoneNumberAssignmentByProfileService

    /**
     * Check the status of the task associated with assigning all phone numbers on a messaging
     * profile to a campaign by `taskId`.
     */
    fun retrieve(taskId: String): PhoneNumberAssignmentByProfileRetrieveResponse =
        retrieve(taskId, PhoneNumberAssignmentByProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveParams =
            PhoneNumberAssignmentByProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileRetrieveResponse =
        retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveParams =
            PhoneNumberAssignmentByProfileRetrieveParams.none(),
    ): PhoneNumberAssignmentByProfileRetrieveResponse =
        retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberAssignmentByProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberAssignmentByProfileRetrieveParams
    ): PhoneNumberAssignmentByProfileRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileRetrieveResponse =
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
    ): PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse =
        phoneNumberAssignmentByProfile(params, RequestOptions.none())

    /** @see phoneNumberAssignmentByProfile */
    fun phoneNumberAssignmentByProfile(
        params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse

    /**
     * Check the status of the individual phone number/campaign assignments associated with the
     * supplied `taskId`.
     */
    fun retrievePhoneNumbers(
        taskId: String
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
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
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
        retrievePhoneNumbers(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams =
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
        retrievePhoneNumbers(taskId, params, RequestOptions.none())

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
        retrievePhoneNumbers(params, RequestOptions.none())

    /** @see retrievePhoneNumbers */
    fun retrievePhoneNumbers(
        taskId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse =
        retrievePhoneNumbers(
            taskId,
            PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
            requestOptions,
        )

    /**
     * A view of [PhoneNumberAssignmentByProfileService] that provides access to raw HTTP responses
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
        ): PhoneNumberAssignmentByProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/phoneNumberAssignmentByProfile/{taskId}`, but
         * is otherwise the same as [PhoneNumberAssignmentByProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            taskId: String
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse> =
            retrieve(taskId, PhoneNumberAssignmentByProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveParams =
                PhoneNumberAssignmentByProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveParams =
                PhoneNumberAssignmentByProfileRetrieveParams.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberAssignmentByProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberAssignmentByProfileRetrieveParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveResponse> =
            retrieve(taskId, PhoneNumberAssignmentByProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /10dlc/phoneNumberAssignmentByProfile`, but is
         * otherwise the same as
         * [PhoneNumberAssignmentByProfileService.phoneNumberAssignmentByProfile].
         */
        @MustBeClosed
        fun phoneNumberAssignmentByProfile(
            params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse> =
            phoneNumberAssignmentByProfile(params, RequestOptions.none())

        /** @see phoneNumberAssignmentByProfile */
        @MustBeClosed
        fun phoneNumberAssignmentByProfile(
            params: PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfilePhoneNumberAssignmentByProfileResponse>

        /**
         * Returns a raw HTTP response for `get
         * /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers`, but is otherwise the same
         * as [PhoneNumberAssignmentByProfileService.retrievePhoneNumbers].
         */
        @MustBeClosed
        fun retrievePhoneNumbers(
            taskId: String
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
            retrievePhoneNumbers(
                taskId,
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
            )

        /** @see retrievePhoneNumbers */
        @MustBeClosed
        fun retrievePhoneNumbers(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams =
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
            retrievePhoneNumbers(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePhoneNumbers */
        @MustBeClosed
        fun retrievePhoneNumbers(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams =
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
            retrievePhoneNumbers(taskId, params, RequestOptions.none())

        /** @see retrievePhoneNumbers */
        @MustBeClosed
        fun retrievePhoneNumbers(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse>

        /** @see retrievePhoneNumbers */
        @MustBeClosed
        fun retrievePhoneNumbers(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
            retrievePhoneNumbers(params, RequestOptions.none())

        /** @see retrievePhoneNumbers */
        @MustBeClosed
        fun retrievePhoneNumbers(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumbersResponse> =
            retrievePhoneNumbers(
                taskId,
                PhoneNumberAssignmentByProfileRetrievePhoneNumbersParams.none(),
                requestOptions,
            )
    }
}
