// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.collections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.collections.settings.SettingCreateParams
import com.telnyx.sdk.models.ai.collections.settings.SettingListParams
import com.telnyx.sdk.models.ai.collections.settings.SettingPatchAllParams
import com.telnyx.sdk.models.ai.collections.settings.SettingsEnvelope
import java.util.function.Consumer

/**
 * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
 * sources, and run collection-scoped semantic search.
 */
interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService

    /** Replaces the collection's retrieval settings. */
    fun create(uuid: String, params: SettingCreateParams): SettingsEnvelope =
        create(uuid, params, RequestOptions.none())

    /** @see create */
    fun create(
        uuid: String,
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsEnvelope = create(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see create */
    fun create(params: SettingCreateParams): SettingsEnvelope =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsEnvelope

    /** Returns the retrieval settings for a collection. */
    fun list(uuid: String): SettingsEnvelope = list(uuid, SettingListParams.none())

    /** @see list */
    fun list(
        uuid: String,
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsEnvelope = list(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see list */
    fun list(uuid: String, params: SettingListParams = SettingListParams.none()): SettingsEnvelope =
        list(uuid, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SettingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsEnvelope

    /** @see list */
    fun list(params: SettingListParams): SettingsEnvelope = list(params, RequestOptions.none())

    /** @see list */
    fun list(uuid: String, requestOptions: RequestOptions): SettingsEnvelope =
        list(uuid, SettingListParams.none(), requestOptions)

    /** Partially updates the collection's retrieval settings. */
    fun patchAll(uuid: String, params: SettingPatchAllParams): SettingsEnvelope =
        patchAll(uuid, params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        uuid: String,
        params: SettingPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsEnvelope = patchAll(params.toBuilder().uuid(uuid).build(), requestOptions)

    /** @see patchAll */
    fun patchAll(params: SettingPatchAllParams): SettingsEnvelope =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(
        params: SettingPatchAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsEnvelope

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /ai/collections/{uuid}/settings`, but is otherwise
         * the same as [SettingService.create].
         */
        @MustBeClosed
        fun create(uuid: String, params: SettingCreateParams): HttpResponseFor<SettingsEnvelope> =
            create(uuid, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            uuid: String,
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsEnvelope> =
            create(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SettingCreateParams): HttpResponseFor<SettingsEnvelope> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsEnvelope>

        /**
         * Returns a raw HTTP response for `get /ai/collections/{uuid}/settings`, but is otherwise
         * the same as [SettingService.list].
         */
        @MustBeClosed
        fun list(uuid: String): HttpResponseFor<SettingsEnvelope> =
            list(uuid, SettingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            uuid: String,
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsEnvelope> =
            list(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            uuid: String,
            params: SettingListParams = SettingListParams.none(),
        ): HttpResponseFor<SettingsEnvelope> = list(uuid, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsEnvelope>

        /** @see list */
        @MustBeClosed
        fun list(params: SettingListParams): HttpResponseFor<SettingsEnvelope> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(uuid: String, requestOptions: RequestOptions): HttpResponseFor<SettingsEnvelope> =
            list(uuid, SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/collections/{uuid}/settings`, but is otherwise
         * the same as [SettingService.patchAll].
         */
        @MustBeClosed
        fun patchAll(
            uuid: String,
            params: SettingPatchAllParams,
        ): HttpResponseFor<SettingsEnvelope> = patchAll(uuid, params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            uuid: String,
            params: SettingPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsEnvelope> =
            patchAll(params.toBuilder().uuid(uuid).build(), requestOptions)

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(params: SettingPatchAllParams): HttpResponseFor<SettingsEnvelope> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: SettingPatchAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsEnvelope>
    }
}
