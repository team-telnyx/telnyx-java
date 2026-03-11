// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.businessaccounts

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingRetrieveParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingRetrieveResponse
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp business accounts */
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

    /** Get WABA settings */
    fun retrieve(id: String): CompletableFuture<SettingRetrieveResponse> =
        retrieve(id, SettingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
    ): CompletableFuture<SettingRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SettingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SettingRetrieveParams): CompletableFuture<SettingRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingRetrieveResponse> =
        retrieve(id, SettingRetrieveParams.none(), requestOptions)

    /** Update WABA settings */
    fun update(id: String): CompletableFuture<SettingUpdateResponse> =
        update(id, SettingUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SettingUpdateParams = SettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SettingUpdateParams = SettingUpdateParams.none(),
    ): CompletableFuture<SettingUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingUpdateResponse>

    /** @see update */
    fun update(params: SettingUpdateParams): CompletableFuture<SettingUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingUpdateResponse> =
        update(id, SettingUpdateParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts/{id}/settings`, but
         * is otherwise the same as [SettingServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(id, SettingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SettingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SettingRetrieveParams
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingRetrieveResponse>> =
            retrieve(id, SettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp/business_accounts/{id}/settings`, but
         * is otherwise the same as [SettingServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<SettingUpdateResponse>> =
            update(id, SettingUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: SettingUpdateParams = SettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: SettingUpdateParams = SettingUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingUpdateResponse>>

        /** @see update */
        fun update(
            params: SettingUpdateParams
        ): CompletableFuture<HttpResponseFor<SettingUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingUpdateResponse>> =
            update(id, SettingUpdateParams.none(), requestOptions)
    }
}
