// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountDeleteParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountListPage
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountListParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountRetrieveParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountRetrieveResponse
import com.telnyx.sdk.services.blocking.whatsapp.businessaccounts.PhoneNumberService
import com.telnyx.sdk.services.blocking.whatsapp.businessaccounts.SettingService
import java.util.function.Consumer

/** Manage Whatsapp business accounts */
interface BusinessAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessAccountService

    fun phoneNumbers(): PhoneNumberService

    /** Manage Whatsapp business accounts */
    fun settings(): SettingService

    /** Get a single Whatsapp Business Account */
    fun retrieve(id: String): BusinessAccountRetrieveResponse =
        retrieve(id, BusinessAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessAccountRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
    ): BusinessAccountRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BusinessAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessAccountRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BusinessAccountRetrieveParams): BusinessAccountRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BusinessAccountRetrieveResponse =
        retrieve(id, BusinessAccountRetrieveParams.none(), requestOptions)

    /** List Whatsapp Business Accounts */
    fun list(): BusinessAccountListPage = list(BusinessAccountListParams.none())

    /** @see list */
    fun list(
        params: BusinessAccountListParams = BusinessAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BusinessAccountListPage

    /** @see list */
    fun list(
        params: BusinessAccountListParams = BusinessAccountListParams.none()
    ): BusinessAccountListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BusinessAccountListPage =
        list(BusinessAccountListParams.none(), requestOptions)

    /** Delete a Whatsapp Business Account */
    fun delete(id: String) = delete(id, BusinessAccountDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BusinessAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: BusinessAccountDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, BusinessAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [BusinessAccountService] that provides access to raw HTTP responses for each
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
        ): BusinessAccountService.WithRawResponse

        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        /** Manage Whatsapp business accounts */
        fun settings(): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts/{id}`, but is
         * otherwise the same as [BusinessAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BusinessAccountRetrieveResponse> =
            retrieve(id, BusinessAccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessAccountRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
        ): HttpResponseFor<BusinessAccountRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BusinessAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessAccountRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BusinessAccountRetrieveParams
        ): HttpResponseFor<BusinessAccountRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BusinessAccountRetrieveResponse> =
            retrieve(id, BusinessAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts`, but is otherwise
         * the same as [BusinessAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BusinessAccountListPage> =
            list(BusinessAccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BusinessAccountListParams = BusinessAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BusinessAccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BusinessAccountListParams = BusinessAccountListParams.none()
        ): HttpResponseFor<BusinessAccountListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BusinessAccountListPage> =
            list(BusinessAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp/business_accounts/{id}`, but is
         * otherwise the same as [BusinessAccountService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, BusinessAccountDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BusinessAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BusinessAccountDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, BusinessAccountDeleteParams.none(), requestOptions)
    }
}
