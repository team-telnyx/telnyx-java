// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReport
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReportListPageAsync
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReportListParams
import com.telnyx.sdk.models.voicesdkcallreports.VoiceSdkCallReportRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Retrieve raw Voice SDK call report stats payloads for WebRTC call troubleshooting. */
interface VoiceSdkCallReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceSdkCallReportServiceAsync

    /**
     * Returns raw call report stats JSON payloads stored for the authenticated user and `call_id`.
     * The user is derived from Telnyx authentication, not from request parameters.
     */
    fun retrieve(callId: String): CompletableFuture<List<VoiceSdkCallReport>> =
        retrieve(callId, VoiceSdkCallReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        callId: String,
        params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<VoiceSdkCallReport>> =
        retrieve(params.toBuilder().callId(callId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        callId: String,
        params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
    ): CompletableFuture<List<VoiceSdkCallReport>> = retrieve(callId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VoiceSdkCallReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<VoiceSdkCallReport>>

    /** @see retrieve */
    fun retrieve(
        params: VoiceSdkCallReportRetrieveParams
    ): CompletableFuture<List<VoiceSdkCallReport>> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        callId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<VoiceSdkCallReport>> =
        retrieve(callId, VoiceSdkCallReportRetrieveParams.none(), requestOptions)

    /**
     * Returns paginated raw call report stats JSON payloads stored for the authenticated user. The
     * user is derived from Telnyx authentication, not from request parameters.
     */
    fun list(): CompletableFuture<VoiceSdkCallReportListPageAsync> =
        list(VoiceSdkCallReportListParams.none())

    /** @see list */
    fun list(
        params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VoiceSdkCallReportListPageAsync>

    /** @see list */
    fun list(
        params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none()
    ): CompletableFuture<VoiceSdkCallReportListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VoiceSdkCallReportListPageAsync> =
        list(VoiceSdkCallReportListParams.none(), requestOptions)

    /**
     * A view of [VoiceSdkCallReportServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceSdkCallReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /voice_sdk_call_reports/{call_id}`, but is otherwise
         * the same as [VoiceSdkCallReportServiceAsync.retrieve].
         */
        fun retrieve(callId: String): CompletableFuture<HttpResponseFor<List<VoiceSdkCallReport>>> =
            retrieve(callId, VoiceSdkCallReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            callId: String,
            params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<VoiceSdkCallReport>>> =
            retrieve(params.toBuilder().callId(callId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            callId: String,
            params: VoiceSdkCallReportRetrieveParams = VoiceSdkCallReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<List<VoiceSdkCallReport>>> =
            retrieve(callId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VoiceSdkCallReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<VoiceSdkCallReport>>>

        /** @see retrieve */
        fun retrieve(
            params: VoiceSdkCallReportRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<VoiceSdkCallReport>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            callId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<VoiceSdkCallReport>>> =
            retrieve(callId, VoiceSdkCallReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /voice_sdk_call_reports`, but is otherwise the same
         * as [VoiceSdkCallReportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VoiceSdkCallReportListPageAsync>> =
            list(VoiceSdkCallReportListParams.none())

        /** @see list */
        fun list(
            params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VoiceSdkCallReportListPageAsync>>

        /** @see list */
        fun list(
            params: VoiceSdkCallReportListParams = VoiceSdkCallReportListParams.none()
        ): CompletableFuture<HttpResponseFor<VoiceSdkCallReportListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VoiceSdkCallReportListPageAsync>> =
            list(VoiceSdkCallReportListParams.none(), requestOptions)
    }
}
