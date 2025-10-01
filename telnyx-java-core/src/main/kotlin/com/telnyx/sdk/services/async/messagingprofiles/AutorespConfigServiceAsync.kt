// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messagingprofiles

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutoRespConfigResponse
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigCreateParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigDeleteParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigDeleteResponse
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigListParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigListResponse
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigRetrieveParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutorespConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutorespConfigServiceAsync

    /** Create Auto-Reponse Setting */
    fun create(
        profileId: String,
        params: AutorespConfigCreateParams,
    ): CompletableFuture<AutoRespConfigResponse> = create(profileId, params, RequestOptions.none())

    /** @see create */
    fun create(
        profileId: String,
        params: AutorespConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRespConfigResponse> =
        create(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see create */
    fun create(params: AutorespConfigCreateParams): CompletableFuture<AutoRespConfigResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AutorespConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRespConfigResponse>

    /** Get Auto-Response Setting */
    fun retrieve(
        autorespCfgId: String,
        params: AutorespConfigRetrieveParams,
    ): CompletableFuture<AutoRespConfigResponse> =
        retrieve(autorespCfgId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        autorespCfgId: String,
        params: AutorespConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRespConfigResponse> =
        retrieve(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: AutorespConfigRetrieveParams): CompletableFuture<AutoRespConfigResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AutorespConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRespConfigResponse>

    /** Update Auto-Response Setting */
    fun update(
        autorespCfgId: String,
        params: AutorespConfigUpdateParams,
    ): CompletableFuture<AutoRespConfigResponse> =
        update(autorespCfgId, params, RequestOptions.none())

    /** @see update */
    fun update(
        autorespCfgId: String,
        params: AutorespConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRespConfigResponse> =
        update(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

    /** @see update */
    fun update(params: AutorespConfigUpdateParams): CompletableFuture<AutoRespConfigResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AutorespConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutoRespConfigResponse>

    /** List Auto-Response Settings */
    fun list(profileId: String): CompletableFuture<AutorespConfigListResponse> =
        list(profileId, AutorespConfigListParams.none())

    /** @see list */
    fun list(
        profileId: String,
        params: AutorespConfigListParams = AutorespConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutorespConfigListResponse> =
        list(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see list */
    fun list(
        profileId: String,
        params: AutorespConfigListParams = AutorespConfigListParams.none(),
    ): CompletableFuture<AutorespConfigListResponse> =
        list(profileId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AutorespConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutorespConfigListResponse>

    /** @see list */
    fun list(params: AutorespConfigListParams): CompletableFuture<AutorespConfigListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        profileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutorespConfigListResponse> =
        list(profileId, AutorespConfigListParams.none(), requestOptions)

    /** Delete Auto-Response Setting */
    fun delete(
        autorespCfgId: String,
        params: AutorespConfigDeleteParams,
    ): CompletableFuture<AutorespConfigDeleteResponse> =
        delete(autorespCfgId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        autorespCfgId: String,
        params: AutorespConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutorespConfigDeleteResponse> =
        delete(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: AutorespConfigDeleteParams
    ): CompletableFuture<AutorespConfigDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AutorespConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutorespConfigDeleteResponse>

    /**
     * A view of [AutorespConfigServiceAsync] that provides access to raw HTTP responses for each
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
        ): AutorespConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_profiles/{profile_id}/autoresp_configs`,
         * but is otherwise the same as [AutorespConfigServiceAsync.create].
         */
        fun create(
            profileId: String,
            params: AutorespConfigCreateParams,
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            create(profileId, params, RequestOptions.none())

        /** @see create */
        fun create(
            profileId: String,
            params: AutorespConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            create(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see create */
        fun create(
            params: AutorespConfigCreateParams
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AutorespConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}`, but is otherwise
         * the same as [AutorespConfigServiceAsync.retrieve].
         */
        fun retrieve(
            autorespCfgId: String,
            params: AutorespConfigRetrieveParams,
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            retrieve(autorespCfgId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            autorespCfgId: String,
            params: AutorespConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            retrieve(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: AutorespConfigRetrieveParams
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AutorespConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}`, but is otherwise
         * the same as [AutorespConfigServiceAsync.update].
         */
        fun update(
            autorespCfgId: String,
            params: AutorespConfigUpdateParams,
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            update(autorespCfgId, params, RequestOptions.none())

        /** @see update */
        fun update(
            autorespCfgId: String,
            params: AutorespConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            update(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

        /** @see update */
        fun update(
            params: AutorespConfigUpdateParams
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AutorespConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutoRespConfigResponse>>

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{profile_id}/autoresp_configs`,
         * but is otherwise the same as [AutorespConfigServiceAsync.list].
         */
        fun list(
            profileId: String
        ): CompletableFuture<HttpResponseFor<AutorespConfigListResponse>> =
            list(profileId, AutorespConfigListParams.none())

        /** @see list */
        fun list(
            profileId: String,
            params: AutorespConfigListParams = AutorespConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutorespConfigListResponse>> =
            list(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see list */
        fun list(
            profileId: String,
            params: AutorespConfigListParams = AutorespConfigListParams.none(),
        ): CompletableFuture<HttpResponseFor<AutorespConfigListResponse>> =
            list(profileId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AutorespConfigListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutorespConfigListResponse>>

        /** @see list */
        fun list(
            params: AutorespConfigListParams
        ): CompletableFuture<HttpResponseFor<AutorespConfigListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            profileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutorespConfigListResponse>> =
            list(profileId, AutorespConfigListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}`, but is otherwise
         * the same as [AutorespConfigServiceAsync.delete].
         */
        fun delete(
            autorespCfgId: String,
            params: AutorespConfigDeleteParams,
        ): CompletableFuture<HttpResponseFor<AutorespConfigDeleteResponse>> =
            delete(autorespCfgId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            autorespCfgId: String,
            params: AutorespConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutorespConfigDeleteResponse>> =
            delete(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: AutorespConfigDeleteParams
        ): CompletableFuture<HttpResponseFor<AutorespConfigDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AutorespConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutorespConfigDeleteResponse>>
    }
}
