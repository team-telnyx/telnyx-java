// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPageAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersPageAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesPageAsync
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesParams
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
    fun retrieve(messagingProfileId: String): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(messagingProfileId, MessagingProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messagingProfileId: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(params.toBuilder().messagingProfileId(messagingProfileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messagingProfileId: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
    ): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(messagingProfileId, params, RequestOptions.none())

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
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileRetrieveResponse> =
        retrieve(messagingProfileId, MessagingProfileRetrieveParams.none(), requestOptions)

    /** Update a messaging profile */
    fun update(messagingProfileId: String): CompletableFuture<MessagingProfileUpdateResponse> =
        update(messagingProfileId, MessagingProfileUpdateParams.none())

    /** @see update */
    fun update(
        messagingProfileId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileUpdateResponse> =
        update(params.toBuilder().messagingProfileId(messagingProfileId).build(), requestOptions)

    /** @see update */
    fun update(
        messagingProfileId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
    ): CompletableFuture<MessagingProfileUpdateResponse> =
        update(messagingProfileId, params, RequestOptions.none())

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
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileUpdateResponse> =
        update(messagingProfileId, MessagingProfileUpdateParams.none(), requestOptions)

    /** List messaging profiles */
    fun list(): CompletableFuture<MessagingProfileListPageAsync> =
        list(MessagingProfileListParams.none())

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListPageAsync>

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none()
    ): CompletableFuture<MessagingProfileListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<MessagingProfileListPageAsync> =
        list(MessagingProfileListParams.none(), requestOptions)

    /** Delete a messaging profile */
    fun delete(messagingProfileId: String): CompletableFuture<MessagingProfileDeleteResponse> =
        delete(messagingProfileId, MessagingProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        messagingProfileId: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileDeleteResponse> =
        delete(params.toBuilder().messagingProfileId(messagingProfileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        messagingProfileId: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
    ): CompletableFuture<MessagingProfileDeleteResponse> =
        delete(messagingProfileId, params, RequestOptions.none())

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
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileDeleteResponse> =
        delete(messagingProfileId, MessagingProfileDeleteParams.none(), requestOptions)

    /** List phone numbers associated with a messaging profile */
    fun listPhoneNumbers(
        messagingProfileId: String
    ): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync> =
        listPhoneNumbers(messagingProfileId, MessagingProfileListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        messagingProfileId: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync> =
        listPhoneNumbers(
            params.toBuilder().messagingProfileId(messagingProfileId).build(),
            requestOptions,
        )

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        messagingProfileId: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
    ): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync> =
        listPhoneNumbers(messagingProfileId, params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync>

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams
    ): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync> =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListPhoneNumbersPageAsync> =
        listPhoneNumbers(
            messagingProfileId,
            MessagingProfileListPhoneNumbersParams.none(),
            requestOptions,
        )

    /** List short codes associated with a messaging profile */
    fun listShortCodes(
        messagingProfileId: String
    ): CompletableFuture<MessagingProfileListShortCodesPageAsync> =
        listShortCodes(messagingProfileId, MessagingProfileListShortCodesParams.none())

    /** @see listShortCodes */
    fun listShortCodes(
        messagingProfileId: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListShortCodesPageAsync> =
        listShortCodes(
            params.toBuilder().messagingProfileId(messagingProfileId).build(),
            requestOptions,
        )

    /** @see listShortCodes */
    fun listShortCodes(
        messagingProfileId: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
    ): CompletableFuture<MessagingProfileListShortCodesPageAsync> =
        listShortCodes(messagingProfileId, params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessagingProfileListShortCodesPageAsync>

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams
    ): CompletableFuture<MessagingProfileListShortCodesPageAsync> =
        listShortCodes(params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessagingProfileListShortCodesPageAsync> =
        listShortCodes(
            messagingProfileId,
            MessagingProfileListShortCodesParams.none(),
            requestOptions,
        )

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
            messagingProfileId: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(messagingProfileId, MessagingProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            messagingProfileId: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            messagingProfileId: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(messagingProfileId, params, RequestOptions.none())

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
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileRetrieveResponse>> =
            retrieve(messagingProfileId, MessagingProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileServiceAsync.update].
         */
        fun update(
            messagingProfileId: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(messagingProfileId, MessagingProfileUpdateParams.none())

        /** @see update */
        fun update(
            messagingProfileId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            messagingProfileId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(messagingProfileId, params, RequestOptions.none())

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
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileUpdateResponse>> =
            update(messagingProfileId, MessagingProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles`, but is otherwise the same as
         * [MessagingProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<MessagingProfileListPageAsync>> =
            list(MessagingProfileListParams.none())

        /** @see list */
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPageAsync>>

        /** @see list */
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPageAsync>> =
            list(MessagingProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileServiceAsync.delete].
         */
        fun delete(
            messagingProfileId: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(messagingProfileId, MessagingProfileDeleteParams.none())

        /** @see delete */
        fun delete(
            messagingProfileId: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see delete */
        fun delete(
            messagingProfileId: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(messagingProfileId, params, RequestOptions.none())

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
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileDeleteResponse>> =
            delete(messagingProfileId, MessagingProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/phone_numbers`, but is
         * otherwise the same as [MessagingProfileServiceAsync.listPhoneNumbers].
         */
        fun listPhoneNumbers(
            messagingProfileId: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersPageAsync>> =
            listPhoneNumbers(messagingProfileId, MessagingProfileListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            messagingProfileId: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersPageAsync>> =
            listPhoneNumbers(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            messagingProfileId: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersPageAsync>> =
            listPhoneNumbers(messagingProfileId, params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersPageAsync>>

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersPageAsync>> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListPhoneNumbersPageAsync>> =
            listPhoneNumbers(
                messagingProfileId,
                MessagingProfileListPhoneNumbersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/short_codes`, but is
         * otherwise the same as [MessagingProfileServiceAsync.listShortCodes].
         */
        fun listShortCodes(
            messagingProfileId: String
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesPageAsync>> =
            listShortCodes(messagingProfileId, MessagingProfileListShortCodesParams.none())

        /** @see listShortCodes */
        fun listShortCodes(
            messagingProfileId: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesPageAsync>> =
            listShortCodes(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see listShortCodes */
        fun listShortCodes(
            messagingProfileId: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesPageAsync>> =
            listShortCodes(messagingProfileId, params, RequestOptions.none())

        /** @see listShortCodes */
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesPageAsync>>

        /** @see listShortCodes */
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesPageAsync>> =
            listShortCodes(params, RequestOptions.none())

        /** @see listShortCodes */
        fun listShortCodes(
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessagingProfileListShortCodesPageAsync>> =
            listShortCodes(
                messagingProfileId,
                MessagingProfileListShortCodesParams.none(),
                requestOptions,
            )
    }
}
