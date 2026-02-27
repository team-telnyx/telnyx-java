// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.auditevents.AuditEventListPage
import com.telnyx.sdk.models.auditevents.AuditEventListParams
import java.util.function.Consumer

/** Audit log operations. */
interface AuditEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventService

    /**
     * Retrieve a list of audit log entries. Audit logs are a best-effort, eventually consistent
     * record of significant account-related changes.
     */
    fun list(): AuditEventListPage = list(AuditEventListParams.none())

    /** @see list */
    fun list(
        params: AuditEventListParams = AuditEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditEventListPage

    /** @see list */
    fun list(params: AuditEventListParams = AuditEventListParams.none()): AuditEventListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuditEventListPage =
        list(AuditEventListParams.none(), requestOptions)

    /** A view of [AuditEventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audit_events`, but is otherwise the same as
         * [AuditEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuditEventListPage> = list(AuditEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditEventListParams = AuditEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditEventListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditEventListParams = AuditEventListParams.none()
        ): HttpResponseFor<AuditEventListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuditEventListPage> =
            list(AuditEventListParams.none(), requestOptions)
    }
}
