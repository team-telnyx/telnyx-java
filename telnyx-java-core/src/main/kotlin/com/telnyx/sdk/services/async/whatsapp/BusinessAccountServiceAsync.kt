// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountDeleteParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountListPageAsync
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountListParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountRetrieveParams
import com.telnyx.sdk.models.whatsapp.businessaccounts.BusinessAccountRetrieveResponse
import com.telnyx.sdk.services.async.whatsapp.businessaccounts.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.whatsapp.businessaccounts.SettingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp business accounts */
interface BusinessAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessAccountServiceAsync

    fun phoneNumbers(): PhoneNumberServiceAsync

    /** Manage Whatsapp business accounts */
    fun settings(): SettingServiceAsync

    /** Get a single Whatsapp Business Account */
    fun retrieve(id: String): CompletableFuture<BusinessAccountRetrieveResponse> =
        retrieve(id, BusinessAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessAccountRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
    ): CompletableFuture<BusinessAccountRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BusinessAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessAccountRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: BusinessAccountRetrieveParams
    ): CompletableFuture<BusinessAccountRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BusinessAccountRetrieveResponse> =
        retrieve(id, BusinessAccountRetrieveParams.none(), requestOptions)

    /** List Whatsapp Business Accounts */
    fun list(): CompletableFuture<BusinessAccountListPageAsync> =
        list(BusinessAccountListParams.none())

    /** @see list */
    fun list(
        params: BusinessAccountListParams = BusinessAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BusinessAccountListPageAsync>

    /** @see list */
    fun list(
        params: BusinessAccountListParams = BusinessAccountListParams.none()
    ): CompletableFuture<BusinessAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BusinessAccountListPageAsync> =
        list(BusinessAccountListParams.none(), requestOptions)

    /** Delete a Whatsapp Business Account */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, BusinessAccountDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BusinessAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BusinessAccountDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, BusinessAccountDeleteParams.none(), requestOptions)

    /**
     * A view of [BusinessAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): BusinessAccountServiceAsync.WithRawResponse

        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse

        /** Manage Whatsapp business accounts */
        fun settings(): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts/{id}`, but is
         * otherwise the same as [BusinessAccountServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<BusinessAccountRetrieveResponse>> =
            retrieve(id, BusinessAccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessAccountRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BusinessAccountRetrieveParams = BusinessAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BusinessAccountRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BusinessAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessAccountRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BusinessAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<BusinessAccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BusinessAccountRetrieveResponse>> =
            retrieve(id, BusinessAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/business_accounts`, but is otherwise
         * the same as [BusinessAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BusinessAccountListPageAsync>> =
            list(BusinessAccountListParams.none())

        /** @see list */
        fun list(
            params: BusinessAccountListParams = BusinessAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BusinessAccountListPageAsync>>

        /** @see list */
        fun list(
            params: BusinessAccountListParams = BusinessAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<BusinessAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BusinessAccountListPageAsync>> =
            list(BusinessAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/whatsapp/business_accounts/{id}`, but is
         * otherwise the same as [BusinessAccountServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, BusinessAccountDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: BusinessAccountDeleteParams = BusinessAccountDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BusinessAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BusinessAccountDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, BusinessAccountDeleteParams.none(), requestOptions)
    }
}
