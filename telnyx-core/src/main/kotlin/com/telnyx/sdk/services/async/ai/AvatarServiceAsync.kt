// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.avatars.AvatarCreateParams
import com.telnyx.sdk.models.ai.avatars.AvatarListPageAsync
import com.telnyx.sdk.models.ai.avatars.AvatarListParams
import com.telnyx.sdk.models.ai.avatars.AvatarResponse
import com.telnyx.sdk.models.ai.avatars.AvatarRetrieveParams
import com.telnyx.sdk.models.ai.avatars.AvatarUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create and manage real-time AI avatars */
interface AvatarServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvatarServiceAsync

    /**
     * Uploads an image, validates its file type, size, safe decoding, and resolution, stores it in
     * Telnyx-managed private storage, and creates an avatar owned by the authenticated
     * organization. Creating an avatar does not update an AI Assistant; use the returned ID
     * separately wherever the avatar is consumed. The avatar image is stored independently from the
     * rendering model and background, which are selected where the avatar is consumed. Supported
     * image types are JPEG, PNG, and WebP. Images may be up to 10 MiB, must be between 256 and 8192
     * pixels on each side, and may contain at most 40 megapixels. A per-organization custom-avatar
     * quota applies; the create request returns an error when the quota is reached. For best
     * results, use a 16:9 landscape image, preferably 1920 by 1080 pixels and at least 1280 by 720
     * pixels. Show one centered, front-facing person from the shoulders up, keep the full head and
     * hair visible with space around it, and use a sharp, evenly lit image with unobstructed eyes
     * and mouth. Use a transparent PNG or WebP when the avatar will be combined with a selectable
     * background. These composition recommendations are not enforced in the first release; the
     * first release does not validate the number of faces, pose, or image content.
     */
    fun create(params: AvatarCreateParams): CompletableFuture<AvatarResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AvatarCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvatarResponse>

    /**
     * Returns a Telnyx stock avatar or a custom avatar owned by the authenticated organization. A
     * custom avatar belonging to another organization is returned as not found.
     */
    fun retrieve(avatarId: String): CompletableFuture<AvatarResponse> =
        retrieve(avatarId, AvatarRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        avatarId: String,
        params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvatarResponse> =
        retrieve(params.toBuilder().avatarId(avatarId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        avatarId: String,
        params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
    ): CompletableFuture<AvatarResponse> = retrieve(avatarId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AvatarRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvatarResponse>

    /** @see retrieve */
    fun retrieve(params: AvatarRetrieveParams): CompletableFuture<AvatarResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        avatarId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AvatarResponse> =
        retrieve(avatarId, AvatarRetrieveParams.none(), requestOptions)

    /**
     * Updates the customer-facing name of a custom avatar owned by the authenticated organization.
     * Stock avatars cannot be modified. To replace the image, create a new custom avatar so
     * existing references keep their original content.
     */
    fun update(avatarId: String, params: AvatarUpdateParams): CompletableFuture<AvatarResponse> =
        update(avatarId, params, RequestOptions.none())

    /** @see update */
    fun update(
        avatarId: String,
        params: AvatarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvatarResponse> =
        update(params.toBuilder().avatarId(avatarId).build(), requestOptions)

    /** @see update */
    fun update(params: AvatarUpdateParams): CompletableFuture<AvatarResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AvatarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvatarResponse>

    /**
     * Returns a paginated list of the Telnyx stock avatars and custom avatars available to the
     * authenticated organization. Custom avatars owned by other organizations are never returned.
     * The `image_url` value is suitable for displaying a thumbnail and may be refreshed by listing
     * or retrieving the avatar again. `suggested_voice_id` recommends a compatible Telnyx voice for
     * stock avatars and is an empty string for custom avatars; it does not change an AI Assistant's
     * voice automatically.
     */
    fun list(): CompletableFuture<AvatarListPageAsync> = list(AvatarListParams.none())

    /** @see list */
    fun list(
        params: AvatarListParams = AvatarListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AvatarListPageAsync>

    /** @see list */
    fun list(
        params: AvatarListParams = AvatarListParams.none()
    ): CompletableFuture<AvatarListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AvatarListPageAsync> =
        list(AvatarListParams.none(), requestOptions)

    /**
     * A view of [AvatarServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AvatarServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/avatars`, but is otherwise the same as
         * [AvatarServiceAsync.create].
         */
        fun create(params: AvatarCreateParams): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AvatarCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvatarResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/avatars/{avatar_id}`, but is otherwise the same
         * as [AvatarServiceAsync.retrieve].
         */
        fun retrieve(avatarId: String): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            retrieve(avatarId, AvatarRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            avatarId: String,
            params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            retrieve(params.toBuilder().avatarId(avatarId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            avatarId: String,
            params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            retrieve(avatarId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AvatarRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvatarResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AvatarRetrieveParams
        ): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            avatarId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            retrieve(avatarId, AvatarRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/avatars/{avatar_id}`, but is otherwise the
         * same as [AvatarServiceAsync.update].
         */
        fun update(
            avatarId: String,
            params: AvatarUpdateParams,
        ): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            update(avatarId, params, RequestOptions.none())

        /** @see update */
        fun update(
            avatarId: String,
            params: AvatarUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            update(params.toBuilder().avatarId(avatarId).build(), requestOptions)

        /** @see update */
        fun update(params: AvatarUpdateParams): CompletableFuture<HttpResponseFor<AvatarResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AvatarUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvatarResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/avatars`, but is otherwise the same as
         * [AvatarServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AvatarListPageAsync>> =
            list(AvatarListParams.none())

        /** @see list */
        fun list(
            params: AvatarListParams = AvatarListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AvatarListPageAsync>>

        /** @see list */
        fun list(
            params: AvatarListParams = AvatarListParams.none()
        ): CompletableFuture<HttpResponseFor<AvatarListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AvatarListPageAsync>> =
            list(AvatarListParams.none(), requestOptions)
    }
}
