// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaign
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignCreate
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignCreateParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignDeleteParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignListParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignListResponse
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignRetrieveParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignUpdateParams
import java.util.function.Consumer

interface PhoneNumberCampaignService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberCampaignService

    /** Create New Phone Number Campaign */
    fun create(params: PhoneNumberCampaignCreateParams): PhoneNumberCampaign =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhoneNumberCampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign

    /** @see create */
    fun create(
        phoneNumberCampaignCreate: PhoneNumberCampaignCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign =
        create(
            PhoneNumberCampaignCreateParams.builder()
                .phoneNumberCampaignCreate(phoneNumberCampaignCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(phoneNumberCampaignCreate: PhoneNumberCampaignCreate): PhoneNumberCampaign =
        create(phoneNumberCampaignCreate, RequestOptions.none())

    /** Retrieve an individual phone number/campaign assignment by `phoneNumber`. */
    fun retrieve(phoneNumber: String): PhoneNumberCampaign =
        retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
    ): PhoneNumberCampaign = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberCampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign

    /** @see retrieve */
    fun retrieve(params: PhoneNumberCampaignRetrieveParams): PhoneNumberCampaign =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(phoneNumber: String, requestOptions: RequestOptions): PhoneNumberCampaign =
        retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none(), requestOptions)

    /** Create New Phone Number Campaign */
    fun update(
        pathPhoneNumber: String,
        params: PhoneNumberCampaignUpdateParams,
    ): PhoneNumberCampaign = update(pathPhoneNumber, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathPhoneNumber: String,
        params: PhoneNumberCampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign =
        update(params.toBuilder().pathPhoneNumber(pathPhoneNumber).build(), requestOptions)

    /** @see update */
    fun update(params: PhoneNumberCampaignUpdateParams): PhoneNumberCampaign =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberCampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign

    /** Retrieve All Phone Number Campaigns */
    fun list(): PhoneNumberCampaignListResponse = list(PhoneNumberCampaignListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaignListResponse

    /** @see list */
    fun list(
        params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none()
    ): PhoneNumberCampaignListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PhoneNumberCampaignListResponse =
        list(PhoneNumberCampaignListParams.none(), requestOptions)

    /** This endpoint allows you to remove a campaign assignment from the supplied `phoneNumber`. */
    fun delete(phoneNumber: String): PhoneNumberCampaign =
        delete(phoneNumber, PhoneNumberCampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign =
        delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
    ): PhoneNumberCampaign = delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberCampaignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PhoneNumberCampaign

    /** @see delete */
    fun delete(params: PhoneNumberCampaignDeleteParams): PhoneNumberCampaign =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(phoneNumber: String, requestOptions: RequestOptions): PhoneNumberCampaign =
        delete(phoneNumber, PhoneNumberCampaignDeleteParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberCampaignService] that provides access to raw HTTP responses for each
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
        ): PhoneNumberCampaignService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /10dlc/phone_number_campaigns`, but is otherwise
         * the same as [PhoneNumberCampaignService.create].
         */
        @MustBeClosed
        fun create(params: PhoneNumberCampaignCreateParams): HttpResponseFor<PhoneNumberCampaign> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PhoneNumberCampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign>

        /** @see create */
        @MustBeClosed
        fun create(
            phoneNumberCampaignCreate: PhoneNumberCampaignCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign> =
            create(
                PhoneNumberCampaignCreateParams.builder()
                    .phoneNumberCampaignCreate(phoneNumberCampaignCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            phoneNumberCampaignCreate: PhoneNumberCampaignCreate
        ): HttpResponseFor<PhoneNumberCampaign> =
            create(phoneNumberCampaignCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /10dlc/phone_number_campaigns/{phoneNumber}`, but is
         * otherwise the same as [PhoneNumberCampaignService.retrieve].
         */
        @MustBeClosed
        fun retrieve(phoneNumber: String): HttpResponseFor<PhoneNumberCampaign> =
            retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
        ): HttpResponseFor<PhoneNumberCampaign> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberCampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PhoneNumberCampaignRetrieveParams
        ): HttpResponseFor<PhoneNumberCampaign> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberCampaign> =
            retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /10dlc/phone_number_campaigns/{phoneNumber}`, but is
         * otherwise the same as [PhoneNumberCampaignService.update].
         */
        @MustBeClosed
        fun update(
            pathPhoneNumber: String,
            params: PhoneNumberCampaignUpdateParams,
        ): HttpResponseFor<PhoneNumberCampaign> =
            update(pathPhoneNumber, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathPhoneNumber: String,
            params: PhoneNumberCampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign> =
            update(params.toBuilder().pathPhoneNumber(pathPhoneNumber).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PhoneNumberCampaignUpdateParams): HttpResponseFor<PhoneNumberCampaign> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PhoneNumberCampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign>

        /**
         * Returns a raw HTTP response for `get /10dlc/phone_number_campaigns`, but is otherwise the
         * same as [PhoneNumberCampaignService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PhoneNumberCampaignListResponse> =
            list(PhoneNumberCampaignListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaignListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none()
        ): HttpResponseFor<PhoneNumberCampaignListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PhoneNumberCampaignListResponse> =
            list(PhoneNumberCampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /10dlc/phone_number_campaigns/{phoneNumber}`, but
         * is otherwise the same as [PhoneNumberCampaignService.delete].
         */
        @MustBeClosed
        fun delete(phoneNumber: String): HttpResponseFor<PhoneNumberCampaign> =
            delete(phoneNumber, PhoneNumberCampaignDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign> =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
        ): HttpResponseFor<PhoneNumberCampaign> = delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PhoneNumberCampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PhoneNumberCampaign>

        /** @see delete */
        @MustBeClosed
        fun delete(params: PhoneNumberCampaignDeleteParams): HttpResponseFor<PhoneNumberCampaign> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhoneNumberCampaign> =
            delete(phoneNumber, PhoneNumberCampaignDeleteParams.none(), requestOptions)
    }
}
