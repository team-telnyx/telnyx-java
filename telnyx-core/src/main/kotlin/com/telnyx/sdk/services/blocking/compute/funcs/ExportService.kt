// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.compute.funcs

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.compute.funcs.export.ExportCreateParams
import com.telnyx.sdk.models.compute.funcs.export.ExportDeleteAllParams
import com.telnyx.sdk.models.compute.funcs.export.ExportListParams
import com.telnyx.sdk.models.compute.funcs.export.FuncLogExportConfigResponse
import java.util.function.Consumer

interface ExportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportService

    /**
     * Configures the external OTLP endpoint a function's runtime and/or invocation logs are pushed
     * to as they happen. This operation is a **full replace, not a patch**: `endpoint`, `headers`,
     * `runtime_export_enabled`, and `invocation_export_enabled` are all required on every call —
     * omitting any of them is a 422, not "keep the current value". Headers are encrypted at rest
     * and never returned in any response.
     *
     * The endpoint must be an HTTPS URL. When export is configured, new log records are converted
     * to OTLP log records and delivered continuously; export never bypasses platform log storage,
     * and delivery retries with a bounded policy while the destination is unreachable. Only logs
     * generated after configuration are exported — there is no historical replay.
     */
    fun create(id: String, params: ExportCreateParams): FuncLogExportConfigResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncLogExportConfigResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ExportCreateParams): FuncLogExportConfigResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncLogExportConfigResponse

    /**
     * Returns the function's configured log export destination and which log types are exported.
     * Headers are never returned. Returns 404 (error code 10005) when no destination is configured
     * for the function.
     */
    fun list(id: String): FuncLogExportConfigResponse = list(id, ExportListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncLogExportConfigResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ExportListParams = ExportListParams.none(),
    ): FuncLogExportConfigResponse = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FuncLogExportConfigResponse

    /** @see list */
    fun list(params: ExportListParams): FuncLogExportConfigResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): FuncLogExportConfigResponse =
        list(id, ExportListParams.none(), requestOptions)

    /**
     * Stops exporting a function's logs and removes its destination configuration. Idempotent:
     * deleting when nothing is configured succeeds.
     */
    fun deleteAll(id: String) = deleteAll(id, ExportDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        id: String,
        params: ExportDeleteAllParams = ExportDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteAll(params.toBuilder().id(id).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(id: String, params: ExportDeleteAllParams = ExportDeleteAllParams.none()) =
        deleteAll(id, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ExportDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteAll */
    fun deleteAll(params: ExportDeleteAllParams) = deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(id: String, requestOptions: RequestOptions) =
        deleteAll(id, ExportDeleteAllParams.none(), requestOptions)

    /** A view of [ExportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /compute/funcs/{id}/logs/export`, but is otherwise
         * the same as [ExportService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: ExportCreateParams,
        ): HttpResponseFor<FuncLogExportConfigResponse> = create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncLogExportConfigResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ExportCreateParams): HttpResponseFor<FuncLogExportConfigResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncLogExportConfigResponse>

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/logs/export`, but is otherwise
         * the same as [ExportService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<FuncLogExportConfigResponse> =
            list(id, ExportListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ExportListParams = ExportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncLogExportConfigResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ExportListParams = ExportListParams.none(),
        ): HttpResponseFor<FuncLogExportConfigResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FuncLogExportConfigResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ExportListParams): HttpResponseFor<FuncLogExportConfigResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FuncLogExportConfigResponse> =
            list(id, ExportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/funcs/{id}/logs/export`, but is
         * otherwise the same as [ExportService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(id: String): HttpResponse = deleteAll(id, ExportDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            id: String,
            params: ExportDeleteAllParams = ExportDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteAll(params.toBuilder().id(id).build(), requestOptions)

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            id: String,
            params: ExportDeleteAllParams = ExportDeleteAllParams.none(),
        ): HttpResponse = deleteAll(id, params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: ExportDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(params: ExportDeleteAllParams): HttpResponse =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(id: String, requestOptions: RequestOptions): HttpResponse =
            deleteAll(id, ExportDeleteAllParams.none(), requestOptions)
    }
}
