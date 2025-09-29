// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.verifiednumbers.VerifiedNumberCreateParams
import com.telnyx.api.models.verifiednumbers.VerifiedNumberCreateResponse
import com.telnyx.api.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.api.models.verifiednumbers.VerifiedNumberDeleteParams
import com.telnyx.api.models.verifiednumbers.VerifiedNumberListParams
import com.telnyx.api.models.verifiednumbers.VerifiedNumberListResponse
import com.telnyx.api.models.verifiednumbers.VerifiedNumberRetrieveParams
import com.telnyx.api.services.blocking.verifiednumbers.ActionService
import java.util.function.Consumer

interface VerifiedNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifiedNumberService

    fun actions(): ActionService

    /**
     * Initiates phone number verification procedure. Supports DTMF extension dialing for voice
     * calls to numbers behind IVR systems.
     */
    fun create(params: VerifiedNumberCreateParams): VerifiedNumberCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifiedNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberCreateResponse

    /** Retrieve a verified number */
    fun retrieve(phoneNumber: String): VerifiedNumberDataWrapper =
        retrieve(phoneNumber, VerifiedNumberRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberDataWrapper =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
    ): VerifiedNumberDataWrapper = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VerifiedNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberDataWrapper

    /** @see retrieve */
    fun retrieve(params: VerifiedNumberRetrieveParams): VerifiedNumberDataWrapper =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(phoneNumber: String, requestOptions: RequestOptions): VerifiedNumberDataWrapper =
        retrieve(phoneNumber, VerifiedNumberRetrieveParams.none(), requestOptions)

    /** Gets a paginated list of Verified Numbers. */
    fun list(): VerifiedNumberListResponse = list(VerifiedNumberListParams.none())

    /** @see list */
    fun list(
        params: VerifiedNumberListParams = VerifiedNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberListResponse

    /** @see list */
    fun list(
        params: VerifiedNumberListParams = VerifiedNumberListParams.none()
    ): VerifiedNumberListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VerifiedNumberListResponse =
        list(VerifiedNumberListParams.none(), requestOptions)

    /** Delete a verified number */
    fun delete(phoneNumber: String): VerifiedNumberDataWrapper =
        delete(phoneNumber, VerifiedNumberDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberDataWrapper =
        delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
    ): VerifiedNumberDataWrapper = delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VerifiedNumberDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifiedNumberDataWrapper

    /** @see delete */
    fun delete(params: VerifiedNumberDeleteParams): VerifiedNumberDataWrapper =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions): VerifiedNumberDataWrapper =
        delete(phoneNumber, VerifiedNumberDeleteParams.none(), requestOptions)

    /**
     * A view of [VerifiedNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifiedNumberService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /verified_numbers`, but is otherwise the same as
         * [VerifiedNumberService.create].
         */
        @MustBeClosed
        fun create(
            params: VerifiedNumberCreateParams
        ): HttpResponseFor<VerifiedNumberCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifiedNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberCreateResponse>

        /**
         * Returns a raw HTTP response for `get /verified_numbers/{phone_number}`, but is otherwise
         * the same as [VerifiedNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumber: String): HttpResponseFor<VerifiedNumberDataWrapper> =
            retrieve(phoneNumber, VerifiedNumberRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: VerifiedNumberRetrieveParams = VerifiedNumberRetrieveParams.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerifiedNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerifiedNumberRetrieveParams
        ): HttpResponseFor<VerifiedNumberDataWrapper> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            retrieve(phoneNumber, VerifiedNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /verified_numbers`, but is otherwise the same as
         * [VerifiedNumberService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VerifiedNumberListResponse> =
            list(VerifiedNumberListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerifiedNumberListParams = VerifiedNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerifiedNumberListParams = VerifiedNumberListParams.none()
        ): HttpResponseFor<VerifiedNumberListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VerifiedNumberListResponse> =
            list(VerifiedNumberListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /verified_numbers/{phone_number}`, but is
         * otherwise the same as [VerifiedNumberService.delete].
         */
        @MustBeClosed
        fun delete(phoneNumber: String): HttpResponseFor<VerifiedNumberDataWrapper> =
            delete(phoneNumber, VerifiedNumberDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: VerifiedNumberDeleteParams = VerifiedNumberDeleteParams.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VerifiedNumberDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifiedNumberDataWrapper>

        /** @see delete */
        @MustBeClosed
        fun delete(params: VerifiedNumberDeleteParams): HttpResponseFor<VerifiedNumberDataWrapper> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifiedNumberDataWrapper> =
            delete(phoneNumber, VerifiedNumberDeleteParams.none(), requestOptions)
    }
}
