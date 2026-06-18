// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.businessaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingRetrieveParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingRetrieveResponse
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateResponse
import java.util.function.Consumer

/** Manage Whatsapp business accounts */
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

    /** Get WABA settings */
    fun retrieve(id: String): SettingRetrieveResponse = retrieve(id, SettingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SettingRetrieveParams = SettingRetrieveParams.none(),
    ): SettingRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SettingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SettingRetrieveParams): SettingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SettingRetrieveResponse =
        retrieve(id, SettingRetrieveParams.none(), requestOptions)

    /** Update WABA settings */
    fun update(id: String): SettingUpdateResponse = update(id, SettingUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SettingUpdateParams = SettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SettingUpdateParams = SettingUpdateParams.none(),
    ): SettingUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingUpdateResponse

    /** @see update */
    fun update(params: SettingUpdateParams): SettingUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): SettingUpdateResponse =
        update(id, SettingUpdateParams.none(), requestOptions)

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts/{id}/settings`, but
         * is otherwise the same as [SettingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SettingRetrieveResponse> =
            retrieve(id, SettingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SettingRetrieveParams = SettingRetrieveParams.none(),
        ): HttpResponseFor<SettingRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SettingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SettingRetrieveParams): HttpResponseFor<SettingRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingRetrieveResponse> =
            retrieve(id, SettingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp/business_accounts/{id}/settings`, but
         * is otherwise the same as [SettingService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<SettingUpdateResponse> =
            update(id, SettingUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SettingUpdateParams = SettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SettingUpdateParams = SettingUpdateParams.none(),
        ): HttpResponseFor<SettingUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: SettingUpdateParams): HttpResponseFor<SettingUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingUpdateResponse> =
            update(id, SettingUpdateParams.none(), requestOptions)
    }
}
