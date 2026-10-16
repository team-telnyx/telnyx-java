// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.avatars.AvatarCreateParams
import com.telnyx.sdk.models.ai.avatars.AvatarListPage
import com.telnyx.sdk.models.ai.avatars.AvatarListParams
import com.telnyx.sdk.models.ai.avatars.AvatarResponse
import com.telnyx.sdk.models.ai.avatars.AvatarRetrieveParams
import com.telnyx.sdk.models.ai.avatars.AvatarUpdateParams
import java.util.function.Consumer

/** Create and manage real-time AI avatars */
interface AvatarService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvatarService

    /**
     * Uploads an image, validates its file type, size, safe decoding, and resolution, stores it in
     * Telnyx-managed private storage, and creates an avatar owned by the authenticated
     * organization. Creating an avatar does not update an AI Assistant; use the returned ID
     * separately wherever the avatar is consumed. The avatar image is stored independently from the
     * rendering model and background, which are selected where the avatar is consumed. Supported
     * image types are JPEG, PNG, and WebP. Images may be up to 10 MiB, must be between 256 and 8192
     * pixels on each side, and may contain at most 40 megapixels. Each organization may have up to
     * 20 custom avatars. For best results, use a 16:9 landscape image, preferably 1920 by 1080
     * pixels and at least 1280 by 720 pixels. Show one centered, front-facing person from the
     * shoulders up, keep the full head and hair visible with space around it, and use a sharp,
     * evenly lit image with unobstructed eyes and mouth. Use a transparent PNG or WebP when the
     * avatar will be combined with a selectable background. These composition recommendations are
     * not enforced in the first release; the first release does not validate the number of faces,
     * pose, or image content.
     */
    fun create(params: AvatarCreateParams): AvatarResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AvatarCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvatarResponse

    /**
     * Returns a Telnyx stock avatar or a custom avatar owned by the authenticated organization. A
     * custom avatar belonging to another organization is returned as not found.
     */
    fun retrieve(avatarId: String): AvatarResponse = retrieve(avatarId, AvatarRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        avatarId: String,
        params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvatarResponse = retrieve(params.toBuilder().avatarId(avatarId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        avatarId: String,
        params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
    ): AvatarResponse = retrieve(avatarId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AvatarRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvatarResponse

    /** @see retrieve */
    fun retrieve(params: AvatarRetrieveParams): AvatarResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(avatarId: String, requestOptions: RequestOptions): AvatarResponse =
        retrieve(avatarId, AvatarRetrieveParams.none(), requestOptions)

    /**
     * Updates the customer-facing name of a custom avatar owned by the authenticated organization.
     * Stock avatars cannot be modified. To replace the image, create a new custom avatar so
     * existing references keep their original content.
     */
    fun update(avatarId: String, params: AvatarUpdateParams): AvatarResponse =
        update(avatarId, params, RequestOptions.none())

    /** @see update */
    fun update(
        avatarId: String,
        params: AvatarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvatarResponse = update(params.toBuilder().avatarId(avatarId).build(), requestOptions)

    /** @see update */
    fun update(params: AvatarUpdateParams): AvatarResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AvatarUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvatarResponse

    /**
     * Returns a paginated list of the Telnyx stock avatars and custom avatars available to the
     * authenticated organization. Custom avatars owned by other organizations are never returned.
     * The `image_url` value is suitable for displaying a thumbnail and may be refreshed by listing
     * or retrieving the avatar again. `suggested_voice_id` recommends a compatible Telnyx voice for
     * stock avatars and is an empty string for custom avatars; it does not change an AI Assistant's
     * voice automatically.
     */
    fun list(): AvatarListPage = list(AvatarListParams.none())

    /** @see list */
    fun list(
        params: AvatarListParams = AvatarListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AvatarListPage

    /** @see list */
    fun list(params: AvatarListParams = AvatarListParams.none()): AvatarListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AvatarListPage =
        list(AvatarListParams.none(), requestOptions)

    /** A view of [AvatarService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AvatarService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/avatars`, but is otherwise the same as
         * [AvatarService.create].
         */
        @MustBeClosed
        fun create(params: AvatarCreateParams): HttpResponseFor<AvatarResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AvatarCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvatarResponse>

        /**
         * Returns a raw HTTP response for `get /ai/avatars/{avatar_id}`, but is otherwise the same
         * as [AvatarService.retrieve].
         */
        @MustBeClosed
        fun retrieve(avatarId: String): HttpResponseFor<AvatarResponse> =
            retrieve(avatarId, AvatarRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            avatarId: String,
            params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvatarResponse> =
            retrieve(params.toBuilder().avatarId(avatarId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            avatarId: String,
            params: AvatarRetrieveParams = AvatarRetrieveParams.none(),
        ): HttpResponseFor<AvatarResponse> = retrieve(avatarId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AvatarRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvatarResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AvatarRetrieveParams): HttpResponseFor<AvatarResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            avatarId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AvatarResponse> =
            retrieve(avatarId, AvatarRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /ai/avatars/{avatar_id}`, but is otherwise the
         * same as [AvatarService.update].
         */
        @MustBeClosed
        fun update(avatarId: String, params: AvatarUpdateParams): HttpResponseFor<AvatarResponse> =
            update(avatarId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            avatarId: String,
            params: AvatarUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvatarResponse> =
            update(params.toBuilder().avatarId(avatarId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AvatarUpdateParams): HttpResponseFor<AvatarResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AvatarUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvatarResponse>

        /**
         * Returns a raw HTTP response for `get /ai/avatars`, but is otherwise the same as
         * [AvatarService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AvatarListPage> = list(AvatarListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AvatarListParams = AvatarListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AvatarListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AvatarListParams = AvatarListParams.none()
        ): HttpResponseFor<AvatarListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AvatarListPage> =
            list(AvatarListParams.none(), requestOptions)
    }
}
