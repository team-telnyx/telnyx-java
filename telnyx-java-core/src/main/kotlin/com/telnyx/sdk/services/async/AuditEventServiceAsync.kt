// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.auditevents.AuditEventListParams
import com.telnyx.sdk.models.auditevents.AuditEventListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuditEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventServiceAsync

    /**
     * Retrieve a list of audit log entries. Audit logs are a best-effort, eventually consistent
     * record of significant account-related changes.
     */
    fun list(): CompletableFuture<AuditEventListResponse> = list(AuditEventListParams.none())

    /** @see list */
    fun list(
        params: AuditEventListParams = AuditEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuditEventListResponse>

    /** @see list */
    fun list(
        params: AuditEventListParams = AuditEventListParams.none()
    ): CompletableFuture<AuditEventListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AuditEventListResponse> =
        list(AuditEventListParams.none(), requestOptions)

    /**
     * A view of [AuditEventServiceAsync] that provides access to raw HTTP responses for each
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
        ): AuditEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audit_events`, but is otherwise the same as
         * [AuditEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AuditEventListResponse>> =
            list(AuditEventListParams.none())

        /** @see list */
        fun list(
            params: AuditEventListParams = AuditEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuditEventListResponse>>

        /** @see list */
        fun list(
            params: AuditEventListParams = AuditEventListParams.none()
        ): CompletableFuture<HttpResponseFor<AuditEventListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuditEventListResponse>> =
            list(AuditEventListParams.none(), requestOptions)
    }
}
