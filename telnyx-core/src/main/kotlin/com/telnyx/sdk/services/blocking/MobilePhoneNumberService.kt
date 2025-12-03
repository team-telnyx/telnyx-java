// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberListPage
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberListParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberRetrieveParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberRetrieveResponse
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateParams
import com.telnyx.sdk.models.mobilephonenumbers.MobilePhoneNumberUpdateResponse
import java.util.function.Consumer

interface MobilePhoneNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MobilePhoneNumberService

    /** Retrieve a Mobile Phone Number */
    fun retrieve(id: String): MobilePhoneNumberRetrieveResponse =
        retrieve(id, MobilePhoneNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobilePhoneNumberRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
    ): MobilePhoneNumberRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MobilePhoneNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobilePhoneNumberRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MobilePhoneNumberRetrieveParams): MobilePhoneNumberRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MobilePhoneNumberRetrieveResponse =
        retrieve(id, MobilePhoneNumberRetrieveParams.none(), requestOptions)

    /** Update a Mobile Phone Number */
    fun update(id: String): MobilePhoneNumberUpdateResponse =
        update(id, MobilePhoneNumberUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobilePhoneNumberUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
    ): MobilePhoneNumberUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MobilePhoneNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobilePhoneNumberUpdateResponse

    /** @see update */
    fun update(params: MobilePhoneNumberUpdateParams): MobilePhoneNumberUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): MobilePhoneNumberUpdateResponse =
        update(id, MobilePhoneNumberUpdateParams.none(), requestOptions)

    /** List Mobile Phone Numbers */
    fun list(): MobilePhoneNumberListPage = list(MobilePhoneNumberListParams.none())

    /** @see list */
    fun list(
        params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MobilePhoneNumberListPage

    /** @see list */
    fun list(
        params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none()
    ): MobilePhoneNumberListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MobilePhoneNumberListPage =
        list(MobilePhoneNumberListParams.none(), requestOptions)

    /**
     * A view of [MobilePhoneNumberService] that provides access to raw HTTP responses for each
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
        ): MobilePhoneNumberService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/mobile_phone_numbers/{id}`, but is otherwise the
         * same as [MobilePhoneNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<MobilePhoneNumberRetrieveResponse> =
            retrieve(id, MobilePhoneNumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobilePhoneNumberRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MobilePhoneNumberRetrieveParams = MobilePhoneNumberRetrieveParams.none(),
        ): HttpResponseFor<MobilePhoneNumberRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MobilePhoneNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobilePhoneNumberRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MobilePhoneNumberRetrieveParams
        ): HttpResponseFor<MobilePhoneNumberRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobilePhoneNumberRetrieveResponse> =
            retrieve(id, MobilePhoneNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/mobile_phone_numbers/{id}`, but is otherwise
         * the same as [MobilePhoneNumberService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<MobilePhoneNumberUpdateResponse> =
            update(id, MobilePhoneNumberUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobilePhoneNumberUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: MobilePhoneNumberUpdateParams = MobilePhoneNumberUpdateParams.none(),
        ): HttpResponseFor<MobilePhoneNumberUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MobilePhoneNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobilePhoneNumberUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: MobilePhoneNumberUpdateParams
        ): HttpResponseFor<MobilePhoneNumberUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MobilePhoneNumberUpdateResponse> =
            update(id, MobilePhoneNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/mobile_phone_numbers`, but is otherwise the same
         * as [MobilePhoneNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MobilePhoneNumberListPage> =
            list(MobilePhoneNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MobilePhoneNumberListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MobilePhoneNumberListParams = MobilePhoneNumberListParams.none()
        ): HttpResponseFor<MobilePhoneNumberListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MobilePhoneNumberListPage> =
            list(MobilePhoneNumberListParams.none(), requestOptions)
    }
}
