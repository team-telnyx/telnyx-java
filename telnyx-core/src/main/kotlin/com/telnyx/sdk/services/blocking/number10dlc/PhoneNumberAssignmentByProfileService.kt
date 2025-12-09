// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetTaskStatusParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetTaskStatusResponse
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
    fun getPhoneNumberStatus(
        taskId: String
    ): PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse =
        getPhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
        )

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse =
        getPhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
    ): PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse =
        getPhoneNumberStatus(taskId, params, RequestOptions.none())

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
    ): PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse =
        getPhoneNumberStatus(params, RequestOptions.none())

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse =
        getPhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
            requestOptions,
        )

    /**
     * Check the status of the task associated with assigning all phone numbers on a messaging
     * profile to a campaign by `taskId`.
     */
    fun getTaskStatus(taskId: String): PhoneNumberAssignmentByProfileGetTaskStatusResponse =
        getTaskStatus(taskId, PhoneNumberAssignmentByProfileGetTaskStatusParams.none())

    /** @see getTaskStatus */
    fun getTaskStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
            PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileGetTaskStatusResponse =
        getTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getTaskStatus */
    fun getTaskStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
            PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
    ): PhoneNumberAssignmentByProfileGetTaskStatusResponse =
        getTaskStatus(taskId, params, RequestOptions.none())

    /** @see getTaskStatus */
    fun getTaskStatus(
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberAssignmentByProfileGetTaskStatusResponse

    /** @see getTaskStatus */
    fun getTaskStatus(
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams
    ): PhoneNumberAssignmentByProfileGetTaskStatusResponse =
        getTaskStatus(params, RequestOptions.none())

    /** @see getTaskStatus */
    fun getTaskStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): PhoneNumberAssignmentByProfileGetTaskStatusResponse =
        getTaskStatus(
            taskId,
            PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
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
         * as [PhoneNumberAssignmentByProfileService.getPhoneNumberStatus].
         */
        @MustBeClosed
        fun getPhoneNumberStatus(
            taskId: String
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
            getPhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
            )

        /** @see getPhoneNumberStatus */
        @MustBeClosed
        fun getPhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
            getPhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getPhoneNumberStatus */
        @MustBeClosed
        fun getPhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
            getPhoneNumberStatus(taskId, params, RequestOptions.none())

        /** @see getPhoneNumberStatus */
        @MustBeClosed
        fun getPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>

        /** @see getPhoneNumberStatus */
        @MustBeClosed
        fun getPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
            getPhoneNumberStatus(params, RequestOptions.none())

        /** @see getPhoneNumberStatus */
        @MustBeClosed
        fun getPhoneNumberStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
            getPhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/phoneNumberAssignmentByProfile/{taskId}`, but
         * is otherwise the same as [PhoneNumberAssignmentByProfileService.getTaskStatus].
         */
        @MustBeClosed
        fun getTaskStatus(
            taskId: String
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
            getTaskStatus(taskId, PhoneNumberAssignmentByProfileGetTaskStatusParams.none())

        /** @see getTaskStatus */
        @MustBeClosed
        fun getTaskStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
                PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
            getTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getTaskStatus */
        @MustBeClosed
        fun getTaskStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
                PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
            getTaskStatus(taskId, params, RequestOptions.none())

        /** @see getTaskStatus */
        @MustBeClosed
        fun getTaskStatus(
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>

        /** @see getTaskStatus */
        @MustBeClosed
        fun getTaskStatus(
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
            getTaskStatus(params, RequestOptions.none())

        /** @see getTaskStatus */
        @MustBeClosed
        fun getTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
            getTaskStatus(
                taskId,
                PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
                requestOptions,
            )
    }
}
