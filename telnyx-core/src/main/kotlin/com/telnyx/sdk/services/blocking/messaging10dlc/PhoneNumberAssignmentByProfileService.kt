// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignResponse
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileListPhoneNumberStatusParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusParams
import com.telnyx.sdk.models.messaging10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusResponse
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
     * This endpoint allows you to link all phone numbers associated with a Messaging Profile to a
     * campaign. **Please note:** if you want to assign phone numbers to a campaign that you did not
     * create with Telnyx 10DLC services, this endpoint allows that provided that you've shared the
     * campaign with Telnyx. In this case, only provide the parameter, `tcrCampaignId`, and not
     * `campaignId`. In all other cases (where the campaign you're assigning was created with Telnyx
     * 10DLC services), only provide `campaignId`, not `tcrCampaignId`.
     */
    fun assign(
        params: PhoneNumberAssignmentByProfileAssignParams
    ): PhoneNumberAssignmentByProfileAssignResponse = assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: PhoneNumberAssignmentByProfileAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileAssignResponse

    /**
     * Check the status of the individual phone number/campaign assignments associated with the
     * supplied `taskId`.
     */
    fun listPhoneNumberStatus(
        taskId: String
    ): PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
        listPhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
        )

    /** @see listPhoneNumberStatus */
    fun listPhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
        listPhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see listPhoneNumberStatus */
    fun listPhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
    ): PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
        listPhoneNumberStatus(taskId, params, RequestOptions.none())

    /** @see listPhoneNumberStatus */
    fun listPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse

    /** @see listPhoneNumberStatus */
    fun listPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams
    ): PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
        listPhoneNumberStatus(params, RequestOptions.none())

    /** @see listPhoneNumberStatus */
    fun listPhoneNumberStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse =
        listPhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
            requestOptions,
        )

    /**
     * Check the status of the individual phone number/campaign assignments associated with the
     * supplied `taskId`.
     */
    fun retrievePhoneNumberStatus(
        taskId: String
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
        retrievePhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
        )

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
        retrievePhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
        retrievePhoneNumberStatus(taskId, params, RequestOptions.none())

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
        retrievePhoneNumberStatus(params, RequestOptions.none())

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse =
        retrievePhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
            requestOptions,
        )

    /**
     * Check the status of the task associated with assigning all phone numbers on a messaging
     * profile to a campaign by `taskId`.
     */
    fun retrieveStatus(taskId: String): PhoneNumberAssignmentByProfileRetrieveStatusResponse =
        retrieveStatus(taskId, PhoneNumberAssignmentByProfileRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
            PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileRetrieveStatusResponse =
        retrieveStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
            PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
    ): PhoneNumberAssignmentByProfileRetrieveStatusResponse =
        retrieveStatus(taskId, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileRetrieveStatusResponse

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams
    ): PhoneNumberAssignmentByProfileRetrieveStatusResponse =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileRetrieveStatusResponse =
        retrieveStatus(
            taskId,
            PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
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
         * Returns a raw HTTP response for `post /10dlc/phoneNumberAssignmentByProfile`, but is
         * otherwise the same as [PhoneNumberAssignmentByProfileService.assign].
         */
        @MustBeClosed
        fun assign(
            params: PhoneNumberAssignmentByProfileAssignParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileAssignResponse> =
            assign(params, RequestOptions.none())

        /** @see assign */
        @MustBeClosed
        fun assign(
            params: PhoneNumberAssignmentByProfileAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileAssignResponse>

        /**
         * Returns a raw HTTP response for `get
         * /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers`, but is otherwise the same
         * as [PhoneNumberAssignmentByProfileService.listPhoneNumberStatus].
         */
        @MustBeClosed
        fun listPhoneNumberStatus(
            taskId: String
        ): HttpResponseFor<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse> =
            listPhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
            )

        /** @see listPhoneNumberStatus */
        @MustBeClosed
        fun listPhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse> =
            listPhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see listPhoneNumberStatus */
        @MustBeClosed
        fun listPhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse> =
            listPhoneNumberStatus(taskId, params, RequestOptions.none())

        /** @see listPhoneNumberStatus */
        @MustBeClosed
        fun listPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse>

        /** @see listPhoneNumberStatus */
        @MustBeClosed
        fun listPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileListPhoneNumberStatusParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse> =
            listPhoneNumberStatus(params, RequestOptions.none())

        /** @see listPhoneNumberStatus */
        @MustBeClosed
        fun listPhoneNumberStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileListPhoneNumberStatusResponse> =
            listPhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileListPhoneNumberStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers`, but is otherwise the same
         * as [PhoneNumberAssignmentByProfileService.retrievePhoneNumberStatus].
         */
        @MustBeClosed
        fun retrievePhoneNumberStatus(
            taskId: String
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
            retrievePhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
            )

        /** @see retrievePhoneNumberStatus */
        @MustBeClosed
        fun retrievePhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
            retrievePhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePhoneNumberStatus */
        @MustBeClosed
        fun retrievePhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
            retrievePhoneNumberStatus(taskId, params, RequestOptions.none())

        /** @see retrievePhoneNumberStatus */
        @MustBeClosed
        fun retrievePhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>

        /** @see retrievePhoneNumberStatus */
        @MustBeClosed
        fun retrievePhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
            retrievePhoneNumberStatus(params, RequestOptions.none())

        /** @see retrievePhoneNumberStatus */
        @MustBeClosed
        fun retrievePhoneNumberStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
            retrievePhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/phoneNumberAssignmentByProfile/{taskId}`, but
         * is otherwise the same as [PhoneNumberAssignmentByProfileService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(
            taskId: String
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
            retrieveStatus(taskId, PhoneNumberAssignmentByProfileRetrieveStatusParams.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
                PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
            retrieveStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
                PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
            retrieveStatus(taskId, params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
            retrieveStatus(
                taskId,
                PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
                requestOptions,
            )
    }
}
