// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetTaskStatusParams
import com.telnyx.sdk.models.number10dlc.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileGetTaskStatusResponse
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
     * This endpoint allows you to link all phone numbers associated with a Messaging Profile to a
     * campaign. **Please note:** if you want to assign phone numbers to a campaign that you did not
     * create with Telnyx 10DLC services, this endpoint allows that provided that you've shared the
     * campaign with Telnyx. In this case, only provide the parameter, `tcrCampaignId`, and not
     * `campaignId`. In all other cases (where the campaign you're assigning was created with Telnyx
     * 10DLC services), only provide `campaignId`, not `tcrCampaignId`.
     */
    fun assign(
        params: PhoneNumberAssignmentByProfileAssignParams
    ): CompletableFuture<PhoneNumberAssignmentByProfileAssignResponse> =
        assign(params, RequestOptions.none())

    /** @see assign */
    fun assign(
        params: PhoneNumberAssignmentByProfileAssignParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileAssignResponse>

    /**
     * Check the status of the individual phone number/campaign assignments associated with the
     * supplied `taskId`.
     */
    fun getPhoneNumberStatus(
        taskId: String
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
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
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
        getPhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
        getPhoneNumberStatus(taskId, params, RequestOptions.none())

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
        getPhoneNumberStatus(params, RequestOptions.none())

    /** @see getPhoneNumberStatus */
    fun getPhoneNumberStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse> =
        getPhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
            requestOptions,
        )

    /**
     * Check the status of the task associated with assigning all phone numbers on a messaging
     * profile to a campaign by `taskId`.
     */
    fun getTaskStatus(
        taskId: String
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
        getTaskStatus(taskId, PhoneNumberAssignmentByProfileGetTaskStatusParams.none())

    /** @see getTaskStatus */
    fun getTaskStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
            PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
        getTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getTaskStatus */
    fun getTaskStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
            PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
        getTaskStatus(taskId, params, RequestOptions.none())

    /** @see getTaskStatus */
    fun getTaskStatus(
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetTaskStatusResponse>

    /** @see getTaskStatus */
    fun getTaskStatus(
        params: PhoneNumberAssignmentByProfileGetTaskStatusParams
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
        getTaskStatus(params, RequestOptions.none())

    /** @see getTaskStatus */
    fun getTaskStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileGetTaskStatusResponse> =
        getTaskStatus(
            taskId,
            PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
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
         * Returns a raw HTTP response for `post /10dlc/phoneNumberAssignmentByProfile`, but is
         * otherwise the same as [PhoneNumberAssignmentByProfileServiceAsync.assign].
         */
        fun assign(
            params: PhoneNumberAssignmentByProfileAssignParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileAssignResponse>> =
            assign(params, RequestOptions.none())

        /** @see assign */
        fun assign(
            params: PhoneNumberAssignmentByProfileAssignParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileAssignResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /10dlc/phoneNumberAssignmentByProfile/{taskId}/phoneNumbers`, but is otherwise the same
         * as [PhoneNumberAssignmentByProfileServiceAsync.getPhoneNumberStatus].
         */
        fun getPhoneNumberStatus(
            taskId: String
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>
        > =
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
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>
        > = getPhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getPhoneNumberStatus */
        fun getPhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>
        > = getPhoneNumberStatus(taskId, params, RequestOptions.none())

        /** @see getPhoneNumberStatus */
        fun getPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>
        >

        /** @see getPhoneNumberStatus */
        fun getPhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>
        > = getPhoneNumberStatus(params, RequestOptions.none())

        /** @see getPhoneNumberStatus */
        fun getPhoneNumberStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileGetPhoneNumberStatusResponse>
        > =
            getPhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileGetPhoneNumberStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/phoneNumberAssignmentByProfile/{taskId}`, but
         * is otherwise the same as [PhoneNumberAssignmentByProfileServiceAsync.getTaskStatus].
         */
        fun getTaskStatus(
            taskId: String
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>> =
            getTaskStatus(taskId, PhoneNumberAssignmentByProfileGetTaskStatusParams.none())

        /** @see getTaskStatus */
        fun getTaskStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
                PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>> =
            getTaskStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getTaskStatus */
        fun getTaskStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams =
                PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>> =
            getTaskStatus(taskId, params, RequestOptions.none())

        /** @see getTaskStatus */
        fun getTaskStatus(
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>>

        /** @see getTaskStatus */
        fun getTaskStatus(
            params: PhoneNumberAssignmentByProfileGetTaskStatusParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>> =
            getTaskStatus(params, RequestOptions.none())

        /** @see getTaskStatus */
        fun getTaskStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileGetTaskStatusResponse>> =
            getTaskStatus(
                taskId,
                PhoneNumberAssignmentByProfileGetTaskStatusParams.none(),
                requestOptions,
            )
    }
}
