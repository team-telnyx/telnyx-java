// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.memory.namespaces.settings.NamespaceSettingsResponse
import com.telnyx.sdk.models.ai.memory.namespaces.settings.SettingListParams
import com.telnyx.sdk.models.ai.memory.namespaces.settings.SettingPatchAllParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** How a namespace's summaries are written. */
interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

    /**
     * What is currently set for this namespace. `instructions: null` means none are set and
     * summaries use the neutral default.
     */
    fun list(namespace: String): CompletableFuture<NamespaceSettingsResponse> =
        list(namespace, SettingListParams.none())

    /** @see list */
    fun list(
        namespace: String,
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceSettingsResponse> =
        list(params.toBuilder().namespace(namespace).build(), requestOptions)

    /** @see list */
    fun list(
        namespace: String,
        params: SettingListParams = SettingListParams.none(),
    ): CompletableFuture<NamespaceSettingsResponse> = list(namespace, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SettingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceSettingsResponse>

    /** @see list */
    fun list(params: SettingListParams): CompletableFuture<NamespaceSettingsResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        namespace: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamespaceSettingsResponse> =
        list(namespace, SettingListParams.none(), requestOptions)

    /**
     * Only the fields you send are changed; anything omitted is left as it is, so `{}` changes
     * nothing. Sending `instructions: null`, or an empty or whitespace-only string, clears them and
     * returns summaries to the neutral default.
     *
     * Instructions are capped at 2000 characters. A longer note is refused rather than truncated,
     * because a note cut mid-sentence is a worse steer than none. A change reaches each summary the
     * next time that summary is regenerated, not immediately.
     */
    fun patchAll(namespace: String): CompletableFuture<NamespaceSettingsResponse> =
        patchAll(namespace, SettingPatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        namespace: String,
        params: SettingPatchAllParams = SettingPatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceSettingsResponse> =
        patchAll(params.toBuilder().namespace(namespace).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(
        namespace: String,
        params: SettingPatchAllParams = SettingPatchAllParams.none(),
    ): CompletableFuture<NamespaceSettingsResponse> =
        patchAll(namespace, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: SettingPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NamespaceSettingsResponse>

    /** @see patchAll */
    fun patchAll(params: SettingPatchAllParams): CompletableFuture<NamespaceSettingsResponse> =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        namespace: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NamespaceSettingsResponse> =
        patchAll(namespace, SettingPatchAllParams.none(), requestOptions)

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/memory/namespaces/{namespace}/settings`, but is
         * otherwise the same as [SettingServiceAsync.list].
         */
        fun list(namespace: String): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            list(namespace, SettingListParams.none())

        /** @see list */
        fun list(
            namespace: String,
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            list(params.toBuilder().namespace(namespace).build(), requestOptions)

        /** @see list */
        fun list(
            namespace: String,
            params: SettingListParams = SettingListParams.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            list(namespace, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SettingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>>

        /** @see list */
        fun list(
            params: SettingListParams
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            namespace: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            list(namespace, SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/memory/namespaces/{namespace}/settings`, but
         * is otherwise the same as [SettingServiceAsync.patchAll].
         */
        fun patchAll(
            namespace: String
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            patchAll(namespace, SettingPatchAllParams.none())

        /** @see patchAll */
        fun patchAll(
            namespace: String,
            params: SettingPatchAllParams = SettingPatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            patchAll(params.toBuilder().namespace(namespace).build(), requestOptions)

        /** @see patchAll */
        fun patchAll(
            namespace: String,
            params: SettingPatchAllParams = SettingPatchAllParams.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            patchAll(namespace, params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            params: SettingPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>>

        /** @see patchAll */
        fun patchAll(
            params: SettingPatchAllParams
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            namespace: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NamespaceSettingsResponse>> =
            patchAll(namespace, SettingPatchAllParams.none(), requestOptions)
    }
}
