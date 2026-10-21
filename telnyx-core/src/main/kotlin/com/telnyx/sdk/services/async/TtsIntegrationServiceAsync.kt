// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsEngine
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationCreateParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationDeleteParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationListParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationListResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationReplaceParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveConformanceRunsParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveConformanceRunsResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveDiscoverableParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveDiscoverableResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveVoicesParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveVoicesResponse
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationUpdateParams
import com.telnyx.sdk.services.async.ttsintegrations.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Register and manage text-to-speech (TTS) engines you publish, and find the public engines other
 * organizations published, so an AI Assistant, TeXML or Call Control can speak with one of their
 * voices, using your own key for it, instead of a Telnyx-integrated vendor.
 */
interface TtsIntegrationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TtsIntegrationServiceAsync

    /**
     * Register and manage text-to-speech (TTS) engines you publish, and find the public engines
     * other organizations published, so an AI Assistant, TeXML or Call Control can speak with one
     * of their voices, using your own key for it, instead of a Telnyx-integrated vendor.
     */
    fun actions(): ActionServiceAsync

    /**
     * Register a WebSocket text-to-speech engine. Telnyx reads the engine's `voices_url` while it
     * registers the engine and refuses the registration with a `422` if the list is unreachable or
     * invalid. The engine starts at `status: draft` and cannot serve other organizations' traffic
     * until Telnyx approves it (your own organization can try it with its own key meanwhile). It is
     * `visibility: private` unless you set `public`: a private engine can be used only by your
     * organization, a public one by any organization once it is `active`. See the
     * [Community TTS engines guide](/docs/voice/tts/community-engines) for the full review flow.
     *
     * `websocket_url` must be `wss://` and `voices_url` must be `https://`, both on a public host;
     * a plain `ws://` URL is rejected, and so is a credential embedded in either. Callers bring
     * their own key for your engine: Telnyx stores none, so there is nothing to register here for
     * synthesis. `voices_api_key_ref` is optional and used only to read your voice list.
     */
    fun create(params: TtsIntegrationCreateParams): CompletableFuture<CommunityTtsEngine> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TtsIntegrationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunityTtsEngine>

    /** Retrieve one of your own community TTS engines by ID. */
    fun retrieve(id: String): CompletableFuture<CommunityTtsEngine> =
        retrieve(id, TtsIntegrationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TtsIntegrationRetrieveParams = TtsIntegrationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunityTtsEngine> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TtsIntegrationRetrieveParams = TtsIntegrationRetrieveParams.none(),
    ): CompletableFuture<CommunityTtsEngine> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TtsIntegrationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunityTtsEngine>

    /** @see retrieve */
    fun retrieve(params: TtsIntegrationRetrieveParams): CompletableFuture<CommunityTtsEngine> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommunityTtsEngine> =
        retrieve(id, TtsIntegrationRetrieveParams.none(), requestOptions)

    /** Same as `PUT`: only the fields you send change. */
    fun update(
        id: String,
        params: TtsIntegrationUpdateParams,
    ): CompletableFuture<CommunityTtsEngine> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TtsIntegrationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunityTtsEngine> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TtsIntegrationUpdateParams): CompletableFuture<CommunityTtsEngine> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TtsIntegrationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunityTtsEngine>

    /**
     * List every community TTS engine your organization has registered, at any status or
     * visibility. Use `GET /tts_integrations/discoverable` instead to also see other organizations'
     * public, active engines.
     */
    fun list(): CompletableFuture<TtsIntegrationListResponse> =
        list(TtsIntegrationListParams.none())

    /** @see list */
    fun list(
        params: TtsIntegrationListParams = TtsIntegrationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtsIntegrationListResponse>

    /** @see list */
    fun list(
        params: TtsIntegrationListParams = TtsIntegrationListParams.none()
    ): CompletableFuture<TtsIntegrationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TtsIntegrationListResponse> =
        list(TtsIntegrationListParams.none(), requestOptions)

    /**
     * Delete one of your own community TTS engines. The engine disappears from every listing and
     * lookup and can no longer serve traffic, but its `name` stays reserved for your organization:
     * no other organization can register it, and you can register it again later. An assistant or
     * call still configured with one of its voices cannot use it until an engine with that name
     * exists again.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, TtsIntegrationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TtsIntegrationDeleteParams = TtsIntegrationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TtsIntegrationDeleteParams = TtsIntegrationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TtsIntegrationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TtsIntegrationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, TtsIntegrationDeleteParams.none(), requestOptions)

    /**
     * Change one of your own community TTS engines. Every field is optional: omit a field to leave
     * it unchanged. `name` cannot be changed. Telnyx reads the `voices_url` again and refuses an
     * update that leaves the engine with an unreadable list. Changing `websocket_url`,
     * `voices_url`, `supported_audio_formats` or `capabilities`, or making a `private` engine
     * `public`, sends the engine back to `status: draft` and clears its review. See the
     * [Community TTS engines guide](/docs/voice/tts/community-engines) for the full review flow.
     */
    fun replace(
        id: String,
        params: TtsIntegrationReplaceParams,
    ): CompletableFuture<CommunityTtsEngine> = replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: TtsIntegrationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunityTtsEngine> =
        replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(params: TtsIntegrationReplaceParams): CompletableFuture<CommunityTtsEngine> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TtsIntegrationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommunityTtsEngine>

    /**
     * The recorded runs of `test_connection` for one of your engines, newest first. Telnyx keeps
     * the latest 50.
     */
    fun retrieveConformanceRuns(
        id: String
    ): CompletableFuture<TtsIntegrationRetrieveConformanceRunsResponse> =
        retrieveConformanceRuns(id, TtsIntegrationRetrieveConformanceRunsParams.none())

    /** @see retrieveConformanceRuns */
    fun retrieveConformanceRuns(
        id: String,
        params: TtsIntegrationRetrieveConformanceRunsParams =
            TtsIntegrationRetrieveConformanceRunsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtsIntegrationRetrieveConformanceRunsResponse> =
        retrieveConformanceRuns(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveConformanceRuns */
    fun retrieveConformanceRuns(
        id: String,
        params: TtsIntegrationRetrieveConformanceRunsParams =
            TtsIntegrationRetrieveConformanceRunsParams.none(),
    ): CompletableFuture<TtsIntegrationRetrieveConformanceRunsResponse> =
        retrieveConformanceRuns(id, params, RequestOptions.none())

    /** @see retrieveConformanceRuns */
    fun retrieveConformanceRuns(
        params: TtsIntegrationRetrieveConformanceRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtsIntegrationRetrieveConformanceRunsResponse>

    /** @see retrieveConformanceRuns */
    fun retrieveConformanceRuns(
        params: TtsIntegrationRetrieveConformanceRunsParams
    ): CompletableFuture<TtsIntegrationRetrieveConformanceRunsResponse> =
        retrieveConformanceRuns(params, RequestOptions.none())

    /** @see retrieveConformanceRuns */
    fun retrieveConformanceRuns(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TtsIntegrationRetrieveConformanceRunsResponse> =
        retrieveConformanceRuns(
            id,
            TtsIntegrationRetrieveConformanceRunsParams.none(),
            requestOptions,
        )

    /**
     * List the engines you can use: your own, at any status, and other organizations' engines that
     * are `public` and `active`. Each entry carries what a caller needs to choose an engine: its
     * `name` (the first part of its voices, `<name>.<voice_id>`), `voices_count`, audio formats,
     * capabilities, and `documentation_url`. It never carries the publisher's contact details,
     * review notes, or `voices_api_key_ref`. Read an engine's voices with `GET
     * /tts_integrations/{id}/voices`.
     */
    fun retrieveDiscoverable(): CompletableFuture<TtsIntegrationRetrieveDiscoverableResponse> =
        retrieveDiscoverable(TtsIntegrationRetrieveDiscoverableParams.none())

    /** @see retrieveDiscoverable */
    fun retrieveDiscoverable(
        params: TtsIntegrationRetrieveDiscoverableParams =
            TtsIntegrationRetrieveDiscoverableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtsIntegrationRetrieveDiscoverableResponse>

    /** @see retrieveDiscoverable */
    fun retrieveDiscoverable(
        params: TtsIntegrationRetrieveDiscoverableParams =
            TtsIntegrationRetrieveDiscoverableParams.none()
    ): CompletableFuture<TtsIntegrationRetrieveDiscoverableResponse> =
        retrieveDiscoverable(params, RequestOptions.none())

    /** @see retrieveDiscoverable */
    fun retrieveDiscoverable(
        requestOptions: RequestOptions
    ): CompletableFuture<TtsIntegrationRetrieveDiscoverableResponse> =
        retrieveDiscoverable(TtsIntegrationRetrieveDiscoverableParams.none(), requestOptions)

    /**
     * The voices Telnyx last read from the engine's `voices_url`, in the shape the engine
     * published. A caller selects one as `<engine name>.<voice_id>`. The list is replaced only when
     * a new read succeeds, so an engine whose `voices_url` is down keeps serving its last list.
     * `[]` until the first read succeeds.
     */
    fun retrieveVoices(id: String): CompletableFuture<TtsIntegrationRetrieveVoicesResponse> =
        retrieveVoices(id, TtsIntegrationRetrieveVoicesParams.none())

    /** @see retrieveVoices */
    fun retrieveVoices(
        id: String,
        params: TtsIntegrationRetrieveVoicesParams = TtsIntegrationRetrieveVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtsIntegrationRetrieveVoicesResponse> =
        retrieveVoices(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveVoices */
    fun retrieveVoices(
        id: String,
        params: TtsIntegrationRetrieveVoicesParams = TtsIntegrationRetrieveVoicesParams.none(),
    ): CompletableFuture<TtsIntegrationRetrieveVoicesResponse> =
        retrieveVoices(id, params, RequestOptions.none())

    /** @see retrieveVoices */
    fun retrieveVoices(
        params: TtsIntegrationRetrieveVoicesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TtsIntegrationRetrieveVoicesResponse>

    /** @see retrieveVoices */
    fun retrieveVoices(
        params: TtsIntegrationRetrieveVoicesParams
    ): CompletableFuture<TtsIntegrationRetrieveVoicesResponse> =
        retrieveVoices(params, RequestOptions.none())

    /** @see retrieveVoices */
    fun retrieveVoices(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TtsIntegrationRetrieveVoicesResponse> =
        retrieveVoices(id, TtsIntegrationRetrieveVoicesParams.none(), requestOptions)

    /**
     * A view of [TtsIntegrationServiceAsync] that provides access to raw HTTP responses for each
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
        ): TtsIntegrationServiceAsync.WithRawResponse

        /**
         * Register and manage text-to-speech (TTS) engines you publish, and find the public engines
         * other organizations published, so an AI Assistant, TeXML or Call Control can speak with
         * one of their voices, using your own key for it, instead of a Telnyx-integrated vendor.
         */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tts_integrations`, but is otherwise the same as
         * [TtsIntegrationServiceAsync.create].
         */
        fun create(
            params: TtsIntegrationCreateParams
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TtsIntegrationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>>

        /**
         * Returns a raw HTTP response for `get /tts_integrations/{id}`, but is otherwise the same
         * as [TtsIntegrationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            retrieve(id, TtsIntegrationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TtsIntegrationRetrieveParams = TtsIntegrationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TtsIntegrationRetrieveParams = TtsIntegrationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TtsIntegrationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>>

        /** @see retrieve */
        fun retrieve(
            params: TtsIntegrationRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            retrieve(id, TtsIntegrationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /tts_integrations/{id}`, but is otherwise the same
         * as [TtsIntegrationServiceAsync.update].
         */
        fun update(
            id: String,
            params: TtsIntegrationUpdateParams,
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: TtsIntegrationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: TtsIntegrationUpdateParams
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TtsIntegrationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>>

        /**
         * Returns a raw HTTP response for `get /tts_integrations`, but is otherwise the same as
         * [TtsIntegrationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TtsIntegrationListResponse>> =
            list(TtsIntegrationListParams.none())

        /** @see list */
        fun list(
            params: TtsIntegrationListParams = TtsIntegrationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationListResponse>>

        /** @see list */
        fun list(
            params: TtsIntegrationListParams = TtsIntegrationListParams.none()
        ): CompletableFuture<HttpResponseFor<TtsIntegrationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TtsIntegrationListResponse>> =
            list(TtsIntegrationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /tts_integrations/{id}`, but is otherwise the
         * same as [TtsIntegrationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, TtsIntegrationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TtsIntegrationDeleteParams = TtsIntegrationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TtsIntegrationDeleteParams = TtsIntegrationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TtsIntegrationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TtsIntegrationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, TtsIntegrationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /tts_integrations/{id}`, but is otherwise the same
         * as [TtsIntegrationServiceAsync.replace].
         */
        fun replace(
            id: String,
            params: TtsIntegrationReplaceParams,
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            replace(id, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            id: String,
            params: TtsIntegrationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: TtsIntegrationReplaceParams
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: TtsIntegrationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommunityTtsEngine>>

        /**
         * Returns a raw HTTP response for `get /tts_integrations/{id}/conformance_runs`, but is
         * otherwise the same as [TtsIntegrationServiceAsync.retrieveConformanceRuns].
         */
        fun retrieveConformanceRuns(
            id: String
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse>> =
            retrieveConformanceRuns(id, TtsIntegrationRetrieveConformanceRunsParams.none())

        /** @see retrieveConformanceRuns */
        fun retrieveConformanceRuns(
            id: String,
            params: TtsIntegrationRetrieveConformanceRunsParams =
                TtsIntegrationRetrieveConformanceRunsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse>> =
            retrieveConformanceRuns(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveConformanceRuns */
        fun retrieveConformanceRuns(
            id: String,
            params: TtsIntegrationRetrieveConformanceRunsParams =
                TtsIntegrationRetrieveConformanceRunsParams.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse>> =
            retrieveConformanceRuns(id, params, RequestOptions.none())

        /** @see retrieveConformanceRuns */
        fun retrieveConformanceRuns(
            params: TtsIntegrationRetrieveConformanceRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse>>

        /** @see retrieveConformanceRuns */
        fun retrieveConformanceRuns(
            params: TtsIntegrationRetrieveConformanceRunsParams
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse>> =
            retrieveConformanceRuns(params, RequestOptions.none())

        /** @see retrieveConformanceRuns */
        fun retrieveConformanceRuns(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveConformanceRunsResponse>> =
            retrieveConformanceRuns(
                id,
                TtsIntegrationRetrieveConformanceRunsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /tts_integrations/discoverable`, but is otherwise
         * the same as [TtsIntegrationServiceAsync.retrieveDiscoverable].
         */
        fun retrieveDiscoverable():
            CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveDiscoverableResponse>> =
            retrieveDiscoverable(TtsIntegrationRetrieveDiscoverableParams.none())

        /** @see retrieveDiscoverable */
        fun retrieveDiscoverable(
            params: TtsIntegrationRetrieveDiscoverableParams =
                TtsIntegrationRetrieveDiscoverableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveDiscoverableResponse>>

        /** @see retrieveDiscoverable */
        fun retrieveDiscoverable(
            params: TtsIntegrationRetrieveDiscoverableParams =
                TtsIntegrationRetrieveDiscoverableParams.none()
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveDiscoverableResponse>> =
            retrieveDiscoverable(params, RequestOptions.none())

        /** @see retrieveDiscoverable */
        fun retrieveDiscoverable(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveDiscoverableResponse>> =
            retrieveDiscoverable(TtsIntegrationRetrieveDiscoverableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tts_integrations/{id}/voices`, but is otherwise the
         * same as [TtsIntegrationServiceAsync.retrieveVoices].
         */
        fun retrieveVoices(
            id: String
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveVoicesResponse>> =
            retrieveVoices(id, TtsIntegrationRetrieveVoicesParams.none())

        /** @see retrieveVoices */
        fun retrieveVoices(
            id: String,
            params: TtsIntegrationRetrieveVoicesParams = TtsIntegrationRetrieveVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveVoicesResponse>> =
            retrieveVoices(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveVoices */
        fun retrieveVoices(
            id: String,
            params: TtsIntegrationRetrieveVoicesParams = TtsIntegrationRetrieveVoicesParams.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveVoicesResponse>> =
            retrieveVoices(id, params, RequestOptions.none())

        /** @see retrieveVoices */
        fun retrieveVoices(
            params: TtsIntegrationRetrieveVoicesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveVoicesResponse>>

        /** @see retrieveVoices */
        fun retrieveVoices(
            params: TtsIntegrationRetrieveVoicesParams
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveVoicesResponse>> =
            retrieveVoices(params, RequestOptions.none())

        /** @see retrieveVoices */
        fun retrieveVoices(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TtsIntegrationRetrieveVoicesResponse>> =
            retrieveVoices(id, TtsIntegrationRetrieveVoicesParams.none(), requestOptions)
    }
}
