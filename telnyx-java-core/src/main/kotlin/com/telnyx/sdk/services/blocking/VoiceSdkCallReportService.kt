// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReportListPage
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReportListParams
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReportRetrieveParams
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReportRetrieveResponse
import java.util.function.Consumer

/** Retrieve raw Voice SDK call report stats payloads for WebRTC call troubleshooting. */
interface VoiceSdkCallReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceSdkCallReportService

    /**
     * Returns raw call report stats JSON payloads stored for the authenticated user and `call_id`.
     * The user is derived from Telnyx authentication, not from request parameters.
     */
    fun retrieve(callId: String): List<VoiceSdkCallReportRetrieveResponse> =
        retrieve(callId, VoiceSdkCallReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        callId: String,
        params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<VoiceSdkCallReportRetrieveResponse> =
        retrieve(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        callId: String,
        params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
    ): List<VoiceSdkCallReportRetrieveResponse> = retrieve(callId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceSdkCallReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<VoiceSdkCallReportRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: VoiceSdkCallReportRetrieveParams
    ): List<VoiceSdkCallReportRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callId: String,
        requestOptions: RequestOptions,
    ): List<VoiceSdkCallReportRetrieveResponse> =
        retrieve(callId, VoiceSdkCallReportRetrieveParams.none(), requestOptions)

    /**
     * Returns paginated raw call report stats JSON payloads stored for the authenticated user. The
     * user is derived from Telnyx authentication, not from request parameters.
     */
    fun list(): VoiceSdkCallReportListPage = list(VoiceSdkCallReportListParams.none())

    /** @see list */
    fun list(
        params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VoiceSdkCallReportListPage

    /** @see list */
    fun list(
        params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none()
    ): VoiceSdkCallReportListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VoiceSdkCallReportListPage =
        list(VoiceSdkCallReportListParams.none(), requestOptions)

    /**
     * A view of [VoiceSdkCallReportService] that provides access to raw HTTP responses for each
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
        ): VoiceSdkCallReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /voice_sdk_call_reports/{call_id}`, but is otherwise
         * the same as [VoiceSdkCallReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(callId: String): HttpResponseFor<List<VoiceSdkCallReportRetrieveResponse>> =
            retrieve(callId, VoiceSdkCallReportRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callId: String,
            params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<VoiceSdkCallReportRetrieveResponse>> =
            retrieve(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callId: String,
            params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
        ): HttpResponseFor<List<VoiceSdkCallReportRetrieveResponse>> =
            retrieve(callId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoiceSdkCallReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<VoiceSdkCallReportRetrieveResponse>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VoiceSdkCallReportRetrieveParams
        ): HttpResponseFor<List<VoiceSdkCallReportRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            callId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<VoiceSdkCallReportRetrieveResponse>> =
            retrieve(callId, VoiceSdkCallReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /voice_sdk_call_reports`, but is otherwise the same
         * as [VoiceSdkCallReportService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VoiceSdkCallReportListPage> =
            list(VoiceSdkCallReportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VoiceSdkCallReportListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none()
        ): HttpResponseFor<VoiceSdkCallReportListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VoiceSdkCallReportListPage> =
            list(VoiceSdkCallReportListParams.none(), requestOptions)
    }
}
