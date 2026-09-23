// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.compute.funcs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.compute.funcs.export.ExportCreateParams
import com.telnyx.sdk.models.compute.funcs.export.ExportDeleteAllParams
import com.telnyx.sdk.models.compute.funcs.export.ExportListParams
import com.telnyx.sdk.models.compute.funcs.export.FuncLogExportConfigResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportServiceAsync

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
    fun create(
        id: String,
        params: ExportCreateParams,
    ): CompletableFuture<FuncLogExportConfigResponse> = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncLogExportConfigResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: ExportCreateParams): CompletableFuture<FuncLogExportConfigResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncLogExportConfigResponse>

    /**
     * Returns the function's configured log export destination and which log types are exported.
     * Headers are never returned. Returns 404 (error code 10005) when no destination is configured
     * for the function.
     */
    fun list(id: String): CompletableFuture<FuncLogExportConfigResponse> =
        list(id, ExportListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncLogExportConfigResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ExportListParams = ExportListParams.none(),
    ): CompletableFuture<FuncLogExportConfigResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FuncLogExportConfigResponse>

    /** @see list */
    fun list(params: ExportListParams): CompletableFuture<FuncLogExportConfigResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FuncLogExportConfigResponse> =
        list(id, ExportListParams.none(), requestOptions)

    /**
     * Stops exporting a function's logs and removes its destination configuration. Idempotent:
     * deleting when nothing is configured succeeds.
     */
    fun deleteAll(id: String): CompletableFuture<Void?> =
        deleteAll(id, ExportDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        id: String,
        params: ExportDeleteAllParams = ExportDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = deleteAll(params.toBuilder().id(id).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(
        id: String,
        params: ExportDeleteAllParams = ExportDeleteAllParams.none(),
    ): CompletableFuture<Void?> = deleteAll(id, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: ExportDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteAll */
    fun deleteAll(params: ExportDeleteAllParams): CompletableFuture<Void?> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteAll(id, ExportDeleteAllParams.none(), requestOptions)

    /**
     * A view of [ExportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /compute/funcs/{id}/logs/export`, but is otherwise
         * the same as [ExportServiceAsync.create].
         */
        fun create(
            id: String,
            params: ExportCreateParams,
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: ExportCreateParams
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>>

        /**
         * Returns a raw HTTP response for `get /compute/funcs/{id}/logs/export`, but is otherwise
         * the same as [ExportServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            list(id, ExportListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: ExportListParams = ExportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: ExportListParams = ExportListParams.none(),
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ExportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>>

        /** @see list */
        fun list(
            params: ExportListParams
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FuncLogExportConfigResponse>> =
            list(id, ExportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /compute/funcs/{id}/logs/export`, but is
         * otherwise the same as [ExportServiceAsync.deleteAll].
         */
        fun deleteAll(id: String): CompletableFuture<HttpResponse> =
            deleteAll(id, ExportDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            id: String,
            params: ExportDeleteAllParams = ExportDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteAll(params.toBuilder().id(id).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            id: String,
            params: ExportDeleteAllParams = ExportDeleteAllParams.none(),
        ): CompletableFuture<HttpResponse> = deleteAll(id, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: ExportDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteAll */
        fun deleteAll(params: ExportDeleteAllParams): CompletableFuture<HttpResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            deleteAll(id, ExportDeleteAllParams.none(), requestOptions)
    }
}
