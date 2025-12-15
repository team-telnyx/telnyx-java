// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingprofiles

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutoRespConfigResponse
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigCreateParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigDeleteParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigListParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigListResponse
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigRetrieveParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigUpdateParams
import java.util.function.Consumer

interface AutorespConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutorespConfigService

    /** Create auto-response setting */
    fun create(profileId: String, params: AutorespConfigCreateParams): AutoRespConfigResponse =
        create(profileId, params, RequestOptions.none())

    /** @see create */
    fun create(
        profileId: String,
        params: AutorespConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRespConfigResponse =
        create(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see create */
    fun create(params: AutorespConfigCreateParams): AutoRespConfigResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AutorespConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRespConfigResponse

    /** Get Auto-Response Setting */
    fun retrieve(
        autorespCfgId: String,
        params: AutorespConfigRetrieveParams,
    ): AutoRespConfigResponse = retrieve(autorespCfgId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        autorespCfgId: String,
        params: AutorespConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRespConfigResponse =
        retrieve(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: AutorespConfigRetrieveParams): AutoRespConfigResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AutorespConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRespConfigResponse

    /** Update Auto-Response Setting */
    fun update(autorespCfgId: String, params: AutorespConfigUpdateParams): AutoRespConfigResponse =
        update(autorespCfgId, params, RequestOptions.none())

    /** @see update */
    fun update(
        autorespCfgId: String,
        params: AutorespConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRespConfigResponse =
        update(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

    /** @see update */
    fun update(params: AutorespConfigUpdateParams): AutoRespConfigResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AutorespConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutoRespConfigResponse

    /** List Auto-Response Settings */
    fun list(profileId: String): AutorespConfigListResponse =
        list(profileId, AutorespConfigListParams.none())

    /** @see list */
    fun list(
        profileId: String,
        params: AutorespConfigListParams = AutorespConfigListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutorespConfigListResponse =
        list(params.toBuilder().profileId(profileId).build(), requestOptions)

    /** @see list */
    fun list(
        profileId: String,
        params: AutorespConfigListParams = AutorespConfigListParams.none(),
    ): AutorespConfigListResponse = list(profileId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AutorespConfigListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutorespConfigListResponse

    /** @see list */
    fun list(params: AutorespConfigListParams): AutorespConfigListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(profileId: String, requestOptions: RequestOptions): AutorespConfigListResponse =
        list(profileId, AutorespConfigListParams.none(), requestOptions)

    /** Delete Auto-Response Setting */
    fun delete(autorespCfgId: String, params: AutorespConfigDeleteParams): String =
        delete(autorespCfgId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        autorespCfgId: String,
        params: AutorespConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = delete(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AutorespConfigDeleteParams): String = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AutorespConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * A view of [AutorespConfigService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutorespConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_profiles/{profile_id}/autoresp_configs`,
         * but is otherwise the same as [AutorespConfigService.create].
         */
        @MustBeClosed
        fun create(
            profileId: String,
            params: AutorespConfigCreateParams,
        ): HttpResponseFor<AutoRespConfigResponse> =
            create(profileId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            profileId: String,
            params: AutorespConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRespConfigResponse> =
            create(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: AutorespConfigCreateParams): HttpResponseFor<AutoRespConfigResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AutorespConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRespConfigResponse>

        /**
         * Returns a raw HTTP response for `get
         * /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}`, but is otherwise
         * the same as [AutorespConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            autorespCfgId: String,
            params: AutorespConfigRetrieveParams,
        ): HttpResponseFor<AutoRespConfigResponse> =
            retrieve(autorespCfgId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            autorespCfgId: String,
            params: AutorespConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRespConfigResponse> =
            retrieve(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AutorespConfigRetrieveParams
        ): HttpResponseFor<AutoRespConfigResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AutorespConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRespConfigResponse>

        /**
         * Returns a raw HTTP response for `put
         * /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}`, but is otherwise
         * the same as [AutorespConfigService.update].
         */
        @MustBeClosed
        fun update(
            autorespCfgId: String,
            params: AutorespConfigUpdateParams,
        ): HttpResponseFor<AutoRespConfigResponse> =
            update(autorespCfgId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            autorespCfgId: String,
            params: AutorespConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRespConfigResponse> =
            update(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AutorespConfigUpdateParams): HttpResponseFor<AutoRespConfigResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AutorespConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutoRespConfigResponse>

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{profile_id}/autoresp_configs`,
         * but is otherwise the same as [AutorespConfigService.list].
         */
        @MustBeClosed
        fun list(profileId: String): HttpResponseFor<AutorespConfigListResponse> =
            list(profileId, AutorespConfigListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            profileId: String,
            params: AutorespConfigListParams = AutorespConfigListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutorespConfigListResponse> =
            list(params.toBuilder().profileId(profileId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            profileId: String,
            params: AutorespConfigListParams = AutorespConfigListParams.none(),
        ): HttpResponseFor<AutorespConfigListResponse> =
            list(profileId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AutorespConfigListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutorespConfigListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: AutorespConfigListParams): HttpResponseFor<AutorespConfigListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            profileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutorespConfigListResponse> =
            list(profileId, AutorespConfigListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /messaging_profiles/{profile_id}/autoresp_configs/{autoresp_cfg_id}`, but is otherwise
         * the same as [AutorespConfigService.delete].
         */
        @MustBeClosed
        fun delete(
            autorespCfgId: String,
            params: AutorespConfigDeleteParams,
        ): HttpResponseFor<String> = delete(autorespCfgId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            autorespCfgId: String,
            params: AutorespConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            delete(params.toBuilder().autorespCfgId(autorespCfgId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AutorespConfigDeleteParams): HttpResponseFor<String> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AutorespConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>
    }
}
