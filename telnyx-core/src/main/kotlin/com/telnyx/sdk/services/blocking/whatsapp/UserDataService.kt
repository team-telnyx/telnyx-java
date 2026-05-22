// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.userdata.UserDataRetrieveParams
import com.telnyx.sdk.models.whatsapp.userdata.UserDataRetrieveResponse
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateParams
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateResponse
import java.util.function.Consumer

/** Manage Whatsapp business accounts */
interface UserDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserDataService

    /** Fetch Whatsapp user data */
    fun retrieve(): UserDataRetrieveResponse = retrieve(UserDataRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: UserDataRetrieveParams = UserDataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserDataRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: UserDataRetrieveParams = UserDataRetrieveParams.none()
    ): UserDataRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): UserDataRetrieveResponse =
        retrieve(UserDataRetrieveParams.none(), requestOptions)

    /** Update Whatsapp user data */
    fun update(): UserDataUpdateResponse = update(UserDataUpdateParams.none())

    /** @see update */
    fun update(
        params: UserDataUpdateParams = UserDataUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserDataUpdateResponse

    /** @see update */
    fun update(params: UserDataUpdateParams = UserDataUpdateParams.none()): UserDataUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(requestOptions: RequestOptions): UserDataUpdateResponse =
        update(UserDataUpdateParams.none(), requestOptions)

    /** A view of [UserDataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserDataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/user_data`, but is otherwise the same
         * as [UserDataService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<UserDataRetrieveResponse> =
            retrieve(UserDataRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserDataRetrieveParams = UserDataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserDataRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserDataRetrieveParams = UserDataRetrieveParams.none()
        ): HttpResponseFor<UserDataRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<UserDataRetrieveResponse> =
            retrieve(UserDataRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/whatsapp/user_data`, but is otherwise the same
         * as [UserDataService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<UserDataUpdateResponse> = update(UserDataUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserDataUpdateParams = UserDataUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserDataUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserDataUpdateParams = UserDataUpdateParams.none()
        ): HttpResponseFor<UserDataUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<UserDataUpdateResponse> =
            update(UserDataUpdateParams.none(), requestOptions)
    }
}
