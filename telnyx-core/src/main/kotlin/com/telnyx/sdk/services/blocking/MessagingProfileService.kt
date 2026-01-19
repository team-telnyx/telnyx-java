// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileCreateResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileDeleteResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPage
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersPage
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListPhoneNumbersParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesPage
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileListShortCodesParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileRetrieveResponse
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateParams
import com.telnyx.sdk.models.messagingprofiles.MessagingProfileUpdateResponse
import com.telnyx.sdk.services.blocking.messagingprofiles.AutorespConfigService
import java.util.function.Consumer

interface MessagingProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessagingProfileService

    fun autorespConfigs(): AutorespConfigService

    /** Create a messaging profile */
    fun create(params: MessagingProfileCreateParams): MessagingProfileCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: MessagingProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileCreateResponse

    /** Retrieve a messaging profile */
    fun retrieve(messagingProfileId: String): MessagingProfileRetrieveResponse =
        retrieve(messagingProfileId, MessagingProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        messagingProfileId: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileRetrieveResponse =
        retrieve(params.toBuilder().messagingProfileId(messagingProfileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        messagingProfileId: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
    ): MessagingProfileRetrieveResponse =
        retrieve(messagingProfileId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessagingProfileRetrieveParams): MessagingProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): MessagingProfileRetrieveResponse =
        retrieve(messagingProfileId, MessagingProfileRetrieveParams.none(), requestOptions)

    /** Update a messaging profile */
    fun update(messagingProfileId: String): MessagingProfileUpdateResponse =
        update(messagingProfileId, MessagingProfileUpdateParams.none())

    /** @see update */
    fun update(
        messagingProfileId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileUpdateResponse =
        update(params.toBuilder().messagingProfileId(messagingProfileId).build(), requestOptions)

    /** @see update */
    fun update(
        messagingProfileId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
    ): MessagingProfileUpdateResponse = update(messagingProfileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessagingProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileUpdateResponse

    /** @see update */
    fun update(params: MessagingProfileUpdateParams): MessagingProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): MessagingProfileUpdateResponse =
        update(messagingProfileId, MessagingProfileUpdateParams.none(), requestOptions)

    /** List messaging profiles */
    fun list(): MessagingProfileListPage = list(MessagingProfileListParams.none())

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListPage

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none()
    ): MessagingProfileListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingProfileListPage =
        list(MessagingProfileListParams.none(), requestOptions)

    /** Delete a messaging profile */
    fun delete(messagingProfileId: String): MessagingProfileDeleteResponse =
        delete(messagingProfileId, MessagingProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        messagingProfileId: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileDeleteResponse =
        delete(params.toBuilder().messagingProfileId(messagingProfileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        messagingProfileId: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
    ): MessagingProfileDeleteResponse = delete(messagingProfileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileDeleteResponse

    /** @see delete */
    fun delete(params: MessagingProfileDeleteParams): MessagingProfileDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): MessagingProfileDeleteResponse =
        delete(messagingProfileId, MessagingProfileDeleteParams.none(), requestOptions)

    /** List phone numbers associated with a messaging profile */
    fun listPhoneNumbers(messagingProfileId: String): MessagingProfileListPhoneNumbersPage =
        listPhoneNumbers(messagingProfileId, MessagingProfileListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        messagingProfileId: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListPhoneNumbersPage =
        listPhoneNumbers(
            params.toBuilder().messagingProfileId(messagingProfileId).build(),
            requestOptions,
        )

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        messagingProfileId: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
    ): MessagingProfileListPhoneNumbersPage =
        listPhoneNumbers(messagingProfileId, params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListPhoneNumbersPage

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams
    ): MessagingProfileListPhoneNumbersPage = listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): MessagingProfileListPhoneNumbersPage =
        listPhoneNumbers(
            messagingProfileId,
            MessagingProfileListPhoneNumbersParams.none(),
            requestOptions,
        )

    /** List short codes associated with a messaging profile */
    fun listShortCodes(messagingProfileId: String): MessagingProfileListShortCodesPage =
        listShortCodes(messagingProfileId, MessagingProfileListShortCodesParams.none())

    /** @see listShortCodes */
    fun listShortCodes(
        messagingProfileId: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListShortCodesPage =
        listShortCodes(
            params.toBuilder().messagingProfileId(messagingProfileId).build(),
            requestOptions,
        )

    /** @see listShortCodes */
    fun listShortCodes(
        messagingProfileId: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
    ): MessagingProfileListShortCodesPage =
        listShortCodes(messagingProfileId, params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListShortCodesPage

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams
    ): MessagingProfileListShortCodesPage = listShortCodes(params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        messagingProfileId: String,
        requestOptions: RequestOptions,
    ): MessagingProfileListShortCodesPage =
        listShortCodes(
            messagingProfileId,
            MessagingProfileListShortCodesParams.none(),
            requestOptions,
        )

    /**
     * A view of [MessagingProfileService] that provides access to raw HTTP responses for each
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
        ): MessagingProfileService.WithRawResponse

        fun autorespConfigs(): AutorespConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messaging_profiles`, but is otherwise the same as
         * [MessagingProfileService.create].
         */
        @MustBeClosed
        fun create(
            params: MessagingProfileCreateParams
        ): HttpResponseFor<MessagingProfileCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: MessagingProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileCreateResponse>

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}`, but is otherwise the same
         * as [MessagingProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            messagingProfileId: String
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(messagingProfileId, MessagingProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messagingProfileId: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messagingProfileId: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(messagingProfileId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MessagingProfileRetrieveParams
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(messagingProfileId, MessagingProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileService.update].
         */
        @MustBeClosed
        fun update(messagingProfileId: String): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(messagingProfileId, MessagingProfileUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            messagingProfileId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            messagingProfileId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        ): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(messagingProfileId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessagingProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: MessagingProfileUpdateParams
        ): HttpResponseFor<MessagingProfileUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(messagingProfileId, MessagingProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles`, but is otherwise the same as
         * [MessagingProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingProfileListPage> =
            list(MessagingProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none()
        ): HttpResponseFor<MessagingProfileListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingProfileListPage> =
            list(MessagingProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileService.delete].
         */
        @MustBeClosed
        fun delete(messagingProfileId: String): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(messagingProfileId, MessagingProfileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            messagingProfileId: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see delete */
        @MustBeClosed
        fun delete(
            messagingProfileId: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        ): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(messagingProfileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: MessagingProfileDeleteParams
        ): HttpResponseFor<MessagingProfileDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(messagingProfileId, MessagingProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/phone_numbers`, but is
         * otherwise the same as [MessagingProfileService.listPhoneNumbers].
         */
        @MustBeClosed
        fun listPhoneNumbers(
            messagingProfileId: String
        ): HttpResponseFor<MessagingProfileListPhoneNumbersPage> =
            listPhoneNumbers(messagingProfileId, MessagingProfileListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            messagingProfileId: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListPhoneNumbersPage> =
            listPhoneNumbers(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            messagingProfileId: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
        ): HttpResponseFor<MessagingProfileListPhoneNumbersPage> =
            listPhoneNumbers(messagingProfileId, params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListPhoneNumbersPage>

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams
        ): HttpResponseFor<MessagingProfileListPhoneNumbersPage> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileListPhoneNumbersPage> =
            listPhoneNumbers(
                messagingProfileId,
                MessagingProfileListPhoneNumbersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/short_codes`, but is
         * otherwise the same as [MessagingProfileService.listShortCodes].
         */
        @MustBeClosed
        fun listShortCodes(
            messagingProfileId: String
        ): HttpResponseFor<MessagingProfileListShortCodesPage> =
            listShortCodes(messagingProfileId, MessagingProfileListShortCodesParams.none())

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            messagingProfileId: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListShortCodesPage> =
            listShortCodes(
                params.toBuilder().messagingProfileId(messagingProfileId).build(),
                requestOptions,
            )

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            messagingProfileId: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
        ): HttpResponseFor<MessagingProfileListShortCodesPage> =
            listShortCodes(messagingProfileId, params, RequestOptions.none())

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListShortCodesPage>

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams
        ): HttpResponseFor<MessagingProfileListShortCodesPage> =
            listShortCodes(params, RequestOptions.none())

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            messagingProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileListShortCodesPage> =
            listShortCodes(
                messagingProfileId,
                MessagingProfileListShortCodesParams.none(),
                requestOptions,
            )
    }
}
