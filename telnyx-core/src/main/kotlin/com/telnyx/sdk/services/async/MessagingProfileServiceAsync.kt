// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateResponse
import com.telnyx.sdk.services.async.messagingprofiles.AutorespConfigServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MessagingProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingProfileServiceAsync

    fun autorespConfigs(): AutorespConfigServiceAsync

    /** Create a messaging profile */
    fun create(
        params: MessagingProfileCreateParams
    ): CompletableFuture<MessagingProfileCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessagingProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileCreateResponse>

    /** Retrieve a messaging profile */
    fun retrieve(id: String): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(id, MessagingProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
    ): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MessagingProfileRetrieveParams
    ): CompletableFuture<MessagingProfileRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(id, MessagingProfileRetrieveParams.none(), requestOptions)

    /** Update a messaging profile */
    fun update(pathId: String): CompletableFuture<MessagingProfileUpdateResponse> =
        update(pathId, MessagingProfileUpdateParams.none())

    /** @see update */
    fun update(
        pathId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileUpdateResponse> =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(
        pathId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
    ): CompletableFuture<MessagingProfileUpdateResponse> =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessagingProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileUpdateResponse>

    /** @see update */
    fun update(
        params: MessagingProfileUpdateParams
    ): CompletableFuture<MessagingProfileUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileUpdateResponse> =
        update(pathId, MessagingProfileUpdateParams.none(), requestOptions)

    /** List messaging profiles */
    fun list(): CompletableFuture<MessagingProfileListResponse> =
        list(MessagingProfileListParams.none())

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListResponse>

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none()
    ): CompletableFuture<MessagingProfileListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingProfileListResponse> =
        list(MessagingProfileListParams.none(), requestOptions)

    /** Delete a messaging profile */
    fun delete(id: String): CompletableFuture<MessagingProfileDeleteResponse> =
        delete(id, MessagingProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
    ): CompletableFuture<MessagingProfileDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileDeleteResponse>

    /** @see delete */
    fun delete(
        params: MessagingProfileDeleteParams
    ): CompletableFuture<MessagingProfileDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileDeleteResponse> =
        delete(id, MessagingProfileDeleteParams.none(), requestOptions)

    /** List phone numbers associated with a messaging profile */
    fun listPhoneNumbers(id: String): CompletableFuture<MessagingProfileListPhoneNumbersResponse> =
        listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        id: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListPhoneNumbersResponse> =
        listPhoneNumbers(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        id: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
    ): CompletableFuture<MessagingProfileListPhoneNumbersResponse> =
        listPhoneNumbers(id, params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListPhoneNumbersResponse>

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams
    ): CompletableFuture<MessagingProfileListPhoneNumbersResponse> =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListPhoneNumbersResponse> =
        listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none(), requestOptions)

    /** List short codes associated with a messaging profile */
    fun listShortCodes(id: String): CompletableFuture<MessagingProfileListShortCodesResponse> =
        listShortCodes(id, MessagingProfileListShortCodesParams.none())

    /** @see listShortCodes */
    fun listShortCodes(
        id: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListShortCodesResponse> =
        listShortCodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see listShortCodes */
    fun listShortCodes(
        id: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
    ): CompletableFuture<MessagingProfileListShortCodesResponse> =
        listShortCodes(id, params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListShortCodesResponse>

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams
    ): CompletableFuture<MessagingProfileListShortCodesResponse> =
        listShortCodes(params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListShortCodesResponse> =
        listShortCodes(id, MessagingProfileListShortCodesParams.none(), requestOptions)

    /**
     * A view of [MessagingProfileServiceAsync] that provides access to raw HTTP responses for each
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
        ): MessagingProfileServiceAsync.WithRawResponse

        fun autorespConfigs(): AutorespConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_profiles`, but is otherwise the same as
         * [MessagingProfileServiceAsync.create].
         */
        fun create(
            params: MessagingProfileCreateParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: MessagingProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}`, but is otherwise the same
         * as [MessagingProfileServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(id, MessagingProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: MessagingProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MessagingProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(id, MessagingProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileServiceAsync.update].
         */
        fun update(
            pathId: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(pathId, MessagingProfileUpdateParams.none())

        /** @see update */
        fun update(
            pathId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(
            pathId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MessagingProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>>

        /** @see update */
        fun update(
            params: MessagingProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(pathId, MessagingProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles`, but is otherwise the same as
         * [MessagingProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingProfileListResponse>> =
            list(MessagingProfileListParams.none())

        /** @see list */
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListResponse>>

        /** @see list */
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingProfileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingProfileListResponse>> =
            list(MessagingProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(id, MessagingProfileDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: MessagingProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>>

        /** @see delete */
        fun delete(
            params: MessagingProfileDeleteParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(id, MessagingProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/phone_numbers`, but is
         * otherwise the same as [MessagingProfileServiceAsync.listPhoneNumbers].
         */
        fun listPhoneNumbers(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersResponse>> =
            listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            id: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersResponse>> =
            listPhoneNumbers(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            id: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersResponse>> =
            listPhoneNumbers(id, params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersResponse>>

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersResponse>> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersResponse>> =
            listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/short_codes`, but is
         * otherwise the same as [MessagingProfileServiceAsync.listShortCodes].
         */
        fun listShortCodes(
            id: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesResponse>> =
            listShortCodes(id, MessagingProfileListShortCodesParams.none())

        /** @see listShortCodes */
        fun listShortCodes(
            id: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesResponse>> =
            listShortCodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see listShortCodes */
        fun listShortCodes(
            id: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesResponse>> =
            listShortCodes(id, params, RequestOptions.none())

        /** @see listShortCodes */
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesResponse>>

        /** @see listShortCodes */
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesResponse>> =
            listShortCodes(params, RequestOptions.none())

        /** @see listShortCodes */
        fun listShortCodes(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesResponse>> =
            listShortCodes(id, MessagingProfileListShortCodesParams.none(), requestOptions)
    }
}
