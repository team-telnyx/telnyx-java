// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.addresses.AddressCreateParams
import com.telnyx.sdk.models.addresses.AddressCreateResponse
import com.telnyx.sdk.models.addresses.AddressDeleteParams
import com.telnyx.sdk.models.addresses.AddressDeleteResponse
import com.telnyx.sdk.models.addresses.AddressListPage
import com.telnyx.sdk.models.addresses.AddressListParams
import com.telnyx.sdk.models.addresses.AddressRetrieveParams
import com.telnyx.sdk.models.addresses.AddressRetrieveResponse
import com.telnyx.sdk.services.blocking.addresses.ActionService
import java.util.function.Consumer

/**
 * Operations to work with Address records. Address records are emergency-validated addresses meant
 * to be associated with phone numbers. They are validated for emergency usage purposes at creation
 * time, although you may validate them separately with a custom workflow using the ValidateAddress
 * operation separately. Address records are not usable for physical orders, such as for Telnyx SIM
 * cards, please use UserAddress for that. It is not possible to entirely skip emergency service
 * validation for Address records; if an emergency provider for a phone number rejects the address
 * then it cannot be used on a phone number. To prevent records from getting out of sync, Address
 * records are immutable and cannot be altered once created. If you realize you need to alter an
 * address, a new record must be created with the differing address.
 */
interface AddressService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressService

    /**
     * Operations to work with Address records. Address records are emergency-validated addresses
     * meant to be associated with phone numbers. They are validated for emergency usage purposes at
     * creation time, although you may validate them separately with a custom workflow using the
     * ValidateAddress operation separately. Address records are not usable for physical orders,
     * such as for Telnyx SIM cards, please use UserAddress for that. It is not possible to entirely
     * skip emergency service validation for Address records; if an emergency provider for a phone
     * number rejects the address then it cannot be used on a phone number. To prevent records from
     * getting out of sync, Address records are immutable and cannot be altered once created. If you
     * realize you need to alter an address, a new record must be created with the differing
     * address.
     */
    fun actions(): ActionService

    /** Creates an address. */
    fun create(params: AddressCreateParams): AddressCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressCreateResponse

    /** Retrieves the details of an existing address. */
    fun retrieve(id: String): AddressRetrieveResponse = retrieve(id, AddressRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AddressRetrieveParams = AddressRetrieveParams.none(),
    ): AddressRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AddressRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AddressRetrieveParams): AddressRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AddressRetrieveResponse =
        retrieve(id, AddressRetrieveParams.none(), requestOptions)

    /** Returns a list of your addresses. */
    fun list(): AddressListPage = list(AddressListParams.none())

    /** @see list */
    fun list(
        params: AddressListParams = AddressListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressListPage

    /** @see list */
    fun list(params: AddressListParams = AddressListParams.none()): AddressListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AddressListPage =
        list(AddressListParams.none(), requestOptions)

    /** Deletes an existing address. */
    fun delete(id: String): AddressDeleteResponse = delete(id, AddressDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AddressDeleteParams = AddressDeleteParams.none(),
    ): AddressDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AddressDeleteResponse

    /** @see delete */
    fun delete(params: AddressDeleteParams): AddressDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AddressDeleteResponse =
        delete(id, AddressDeleteParams.none(), requestOptions)

    /** A view of [AddressService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressService.WithRawResponse

        /**
         * Operations to work with Address records. Address records are emergency-validated
         * addresses meant to be associated with phone numbers. They are validated for emergency
         * usage purposes at creation time, although you may validate them separately with a custom
         * workflow using the ValidateAddress operation separately. Address records are not usable
         * for physical orders, such as for Telnyx SIM cards, please use UserAddress for that. It is
         * not possible to entirely skip emergency service validation for Address records; if an
         * emergency provider for a phone number rejects the address then it cannot be used on a
         * phone number. To prevent records from getting out of sync, Address records are immutable
         * and cannot be altered once created. If you realize you need to alter an address, a new
         * record must be created with the differing address.
         */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /addresses`, but is otherwise the same as
         * [AddressService.create].
         */
        @MustBeClosed
        fun create(params: AddressCreateParams): HttpResponseFor<AddressCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressCreateResponse>

        /**
         * Returns a raw HTTP response for `get /addresses/{id}`, but is otherwise the same as
         * [AddressService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(id, AddressRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AddressRetrieveParams = AddressRetrieveParams.none(),
        ): HttpResponseFor<AddressRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AddressRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AddressRetrieveParams): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressRetrieveResponse> =
            retrieve(id, AddressRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /addresses`, but is otherwise the same as
         * [AddressService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AddressListPage> = list(AddressListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AddressListParams = AddressListParams.none()
        ): HttpResponseFor<AddressListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AddressListPage> =
            list(AddressListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /addresses/{id}`, but is otherwise the same as
         * [AddressService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<AddressDeleteResponse> =
            delete(id, AddressDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AddressDeleteParams = AddressDeleteParams.none(),
        ): HttpResponseFor<AddressDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AddressDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AddressDeleteParams): HttpResponseFor<AddressDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AddressDeleteResponse> =
            delete(id, AddressDeleteParams.none(), requestOptions)
    }
}
