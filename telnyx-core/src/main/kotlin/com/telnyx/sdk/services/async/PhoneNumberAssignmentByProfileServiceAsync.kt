// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignParams
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileAssignResponse
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusParams
import com.telnyx.sdk.models.phonenumberassignmentbyprofile.PhoneNumberAssignmentByProfileRetrieveStatusResponse
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
    fun retrievePhoneNumberStatus(
        taskId: String
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
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
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
        retrievePhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams =
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
        retrievePhoneNumberStatus(taskId, params, RequestOptions.none())

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
        retrievePhoneNumberStatus(params, RequestOptions.none())

    /** @see retrievePhoneNumberStatus */
    fun retrievePhoneNumberStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse> =
        retrievePhoneNumberStatus(
            taskId,
            PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
            requestOptions,
        )

    /**
     * Check the status of the task associated with assigning all phone numbers on a messaging
     * profile to a campaign by `taskId`.
     */
    fun retrieveStatus(
        taskId: String
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
        retrieveStatus(taskId, PhoneNumberAssignmentByProfileRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
            PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
        retrieveStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        taskId: String,
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
            PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
        retrieveStatus(taskId, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse>

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: PhoneNumberAssignmentByProfileRetrieveStatusParams
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberAssignmentByProfileRetrieveStatusResponse> =
        retrieveStatus(
            taskId,
            PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
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
         * as [PhoneNumberAssignmentByProfileServiceAsync.retrievePhoneNumberStatus].
         */
        fun retrievePhoneNumberStatus(
            taskId: String
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>
        > =
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
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>
        > = retrievePhoneNumberStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrievePhoneNumberStatus */
        fun retrievePhoneNumberStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams =
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>
        > = retrievePhoneNumberStatus(taskId, params, RequestOptions.none())

        /** @see retrievePhoneNumberStatus */
        fun retrievePhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>
        >

        /** @see retrievePhoneNumberStatus */
        fun retrievePhoneNumberStatus(
            params: PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>
        > = retrievePhoneNumberStatus(params, RequestOptions.none())

        /** @see retrievePhoneNumberStatus */
        fun retrievePhoneNumberStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusResponse>
        > =
            retrievePhoneNumberStatus(
                taskId,
                PhoneNumberAssignmentByProfileRetrievePhoneNumberStatusParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /10dlc/phoneNumberAssignmentByProfile/{taskId}`, but
         * is otherwise the same as [PhoneNumberAssignmentByProfileServiceAsync.retrieveStatus].
         */
        fun retrieveStatus(
            taskId: String
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>
        > = retrieveStatus(taskId, PhoneNumberAssignmentByProfileRetrieveStatusParams.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
                PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>
        > = retrieveStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieveStatus */
        fun retrieveStatus(
            taskId: String,
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams =
                PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>
        > = retrieveStatus(taskId, params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>>

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: PhoneNumberAssignmentByProfileRetrieveStatusParams
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>
        > = retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<PhoneNumberAssignmentByProfileRetrieveStatusResponse>
        > =
            retrieveStatus(
                taskId,
                PhoneNumberAssignmentByProfileRetrieveStatusParams.none(),
                requestOptions,
            )
    }
}
