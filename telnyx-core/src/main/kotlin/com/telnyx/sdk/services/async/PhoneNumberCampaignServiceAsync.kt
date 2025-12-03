// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaign
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignCreate
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignCreateParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignDeleteParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignListPageAsync
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignListParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignRetrieveParams
import com.telnyx.sdk.models.phonenumbercampaigns.PhoneNumberCampaignUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PhoneNumberCampaignServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberCampaignServiceAsync

    /** Create New Phone Number Campaign */
    fun create(params: PhoneNumberCampaignCreateParams): CompletableFuture<PhoneNumberCampaign> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PhoneNumberCampaignCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign>

    /** @see create */
    fun create(
        phoneNumberCampaignCreate: PhoneNumberCampaignCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign> =
        create(
            PhoneNumberCampaignCreateParams.builder()
                .phoneNumberCampaignCreate(phoneNumberCampaignCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        phoneNumberCampaignCreate: PhoneNumberCampaignCreate
    ): CompletableFuture<PhoneNumberCampaign> =
        create(phoneNumberCampaignCreate, RequestOptions.none())

    /** Retrieve an individual phone number/campaign assignment by `phoneNumber`. */
    fun retrieve(phoneNumber: String): CompletableFuture<PhoneNumberCampaign> =
        retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign> =
        retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
    ): CompletableFuture<PhoneNumberCampaign> = retrieve(phoneNumber, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberCampaignRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign>

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberCampaignRetrieveParams
    ): CompletableFuture<PhoneNumberCampaign> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberCampaign> =
        retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none(), requestOptions)

    /** Create New Phone Number Campaign */
    fun update(
        campaignPhoneNumber: String,
        params: PhoneNumberCampaignUpdateParams,
    ): CompletableFuture<PhoneNumberCampaign> =
        update(campaignPhoneNumber, params, RequestOptions.none())

    /** @see update */
    fun update(
        campaignPhoneNumber: String,
        params: PhoneNumberCampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign> =
        update(params.toBuilder().campaignPhoneNumber(campaignPhoneNumber).build(), requestOptions)

    /** @see update */
    fun update(params: PhoneNumberCampaignUpdateParams): CompletableFuture<PhoneNumberCampaign> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PhoneNumberCampaignUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign>

    /** Retrieve All Phone Number Campaigns */
    fun list(): CompletableFuture<PhoneNumberCampaignListPageAsync> =
        list(PhoneNumberCampaignListParams.none())

    /** @see list */
    fun list(
        params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaignListPageAsync>

    /** @see list */
    fun list(
        params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none()
    ): CompletableFuture<PhoneNumberCampaignListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PhoneNumberCampaignListPageAsync> =
        list(PhoneNumberCampaignListParams.none(), requestOptions)

    /** This endpoint allows you to remove a campaign assignment from the supplied `phoneNumber`. */
    fun delete(phoneNumber: String): CompletableFuture<PhoneNumberCampaign> =
        delete(phoneNumber, PhoneNumberCampaignDeleteParams.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign> =
        delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see delete */
    fun delete(
        phoneNumber: String,
        params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
    ): CompletableFuture<PhoneNumberCampaign> = delete(phoneNumber, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PhoneNumberCampaignDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberCampaign>

    /** @see delete */
    fun delete(params: PhoneNumberCampaignDeleteParams): CompletableFuture<PhoneNumberCampaign> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberCampaign> =
        delete(phoneNumber, PhoneNumberCampaignDeleteParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberCampaignServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneNumberCampaignServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /phone_number_campaigns`, but is otherwise the same
         * as [PhoneNumberCampaignServiceAsync.create].
         */
        fun create(
            params: PhoneNumberCampaignCreateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PhoneNumberCampaignCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>>

        /** @see create */
        fun create(
            phoneNumberCampaignCreate: PhoneNumberCampaignCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            create(
                PhoneNumberCampaignCreateParams.builder()
                    .phoneNumberCampaignCreate(phoneNumberCampaignCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            phoneNumberCampaignCreate: PhoneNumberCampaignCreate
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            create(phoneNumberCampaignCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /phone_number_campaigns/{phoneNumber}`, but is
         * otherwise the same as [PhoneNumberCampaignServiceAsync.retrieve].
         */
        fun retrieve(phoneNumber: String): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            retrieve(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            params: PhoneNumberCampaignRetrieveParams = PhoneNumberCampaignRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            retrieve(phoneNumber, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberCampaignRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>>

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberCampaignRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            retrieve(phoneNumber, PhoneNumberCampaignRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /phone_number_campaigns/{phoneNumber}`, but is
         * otherwise the same as [PhoneNumberCampaignServiceAsync.update].
         */
        fun update(
            campaignPhoneNumber: String,
            params: PhoneNumberCampaignUpdateParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            update(campaignPhoneNumber, params, RequestOptions.none())

        /** @see update */
        fun update(
            campaignPhoneNumber: String,
            params: PhoneNumberCampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            update(
                params.toBuilder().campaignPhoneNumber(campaignPhoneNumber).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            params: PhoneNumberCampaignUpdateParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PhoneNumberCampaignUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>>

        /**
         * Returns a raw HTTP response for `get /phone_number_campaigns`, but is otherwise the same
         * as [PhoneNumberCampaignServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PhoneNumberCampaignListPageAsync>> =
            list(PhoneNumberCampaignListParams.none())

        /** @see list */
        fun list(
            params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaignListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberCampaignListParams = PhoneNumberCampaignListParams.none()
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaignListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaignListPageAsync>> =
            list(PhoneNumberCampaignListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /phone_number_campaigns/{phoneNumber}`, but is
         * otherwise the same as [PhoneNumberCampaignServiceAsync.delete].
         */
        fun delete(phoneNumber: String): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            delete(phoneNumber, PhoneNumberCampaignDeleteParams.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            delete(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see delete */
        fun delete(
            phoneNumber: String,
            params: PhoneNumberCampaignDeleteParams = PhoneNumberCampaignDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            delete(phoneNumber, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PhoneNumberCampaignDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>>

        /** @see delete */
        fun delete(
            params: PhoneNumberCampaignDeleteParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberCampaign>> =
            delete(phoneNumber, PhoneNumberCampaignDeleteParams.none(), requestOptions)
    }
}
