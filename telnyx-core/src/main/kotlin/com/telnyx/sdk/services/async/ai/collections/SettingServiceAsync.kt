// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.collections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.collections.settings.SettingCreateParams
import com.telnyx.sdk.models.ai.collections.settings.SettingListParams
import com.telnyx.sdk.models.ai.collections.settings.SettingPatchAllParams
import com.telnyx.sdk.models.ai.collections.settings.SettingsEnvelope
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
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

    /** Replaces the collection's retrieval settings. */
    fun create(uuid: String, params: SettingCreateParams): CompletableFuture<SettingsEnvelope> =
        create(uuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        uuid: String,
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsEnvelope> =
        create(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see create */
    fun create(params: SettingCreateParams): CompletableFuture<SettingsEnvelope> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsEnvelope>

    /** Returns the retrieval settings for a collection. */
    fun list(uuid: String): CompletableFuture<SettingsEnvelope> =
        list(uuid, SettingListParams.none())

    /** @see list */
    fun list(
        uuid: String,
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsEnvelope> =
        list(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see list */
    fun list(
        uuid: String,
        params: SettingListParams = SettingListParams.none(),
    ): CompletableFuture<SettingsEnvelope> = list(uuid, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SettingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsEnvelope>

    /** @see list */
    fun list(params: SettingListParams): CompletableFuture<SettingsEnvelope> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(uuid: String, requestOptions: RequestOptions): CompletableFuture<SettingsEnvelope> =
        list(uuid, SettingListParams.none(), requestOptions)

    /** Partially updates the collection's retrieval settings. */
    fun patchAll(uuid: String, params: SettingPatchAllParams): CompletableFuture<SettingsEnvelope> =
        patchAll(uuid, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        uuid: String,
        params: SettingPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsEnvelope> =
        patchAll(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(params: SettingPatchAllParams): CompletableFuture<SettingsEnvelope> =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: SettingPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsEnvelope>

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
         * Returns a raw HTTP response for `put /ai/collections/{uuid}/settings`, but is otherwise
         * the same as [SettingServiceAsync.create].
         */
        fun create(
            uuid: String,
            params: SettingCreateParams,
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            create(uuid, params, RequestOptions.none())

        /** @see create */
        fun create(
            uuid: String,
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            create(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see create */
        fun create(
            params: SettingCreateParams
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>>

        /**
         * Returns a raw HTTP response for `get /ai/collections/{uuid}/settings`, but is otherwise
         * the same as [SettingServiceAsync.list].
         */
        fun list(uuid: String): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            list(uuid, SettingListParams.none())

        /** @see list */
        fun list(
            uuid: String,
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            list(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see list */
        fun list(
            uuid: String,
            params: SettingListParams = SettingListParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            list(uuid, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SettingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>>

        /** @see list */
        fun list(params: SettingListParams): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            uuid: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            list(uuid, SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/collections/{uuid}/settings`, but is otherwise
         * the same as [SettingServiceAsync.patchAll].
         */
        fun patchAll(
            uuid: String,
            params: SettingPatchAllParams,
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            patchAll(uuid, params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            uuid: String,
            params: SettingPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            patchAll(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see patchAll */
        fun patchAll(
            params: SettingPatchAllParams
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            params: SettingPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsEnvelope>>
    }
}
