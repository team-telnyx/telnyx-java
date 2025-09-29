// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.messagingprofiles.MessagingProfileCreateParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileCreateResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileDeleteParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileDeleteResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileListParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileListPhoneNumbersParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileListPhoneNumbersResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileListResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileListShortCodesParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileListShortCodesResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileRetrieveParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileRetrieveResponse
import com.telnyx.api.models.messagingprofiles.MessagingProfileUpdateParams
import com.telnyx.api.models.messagingprofiles.MessagingProfileUpdateResponse
import com.telnyx.api.services.blocking.messagingprofiles.AutorespConfigService
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
    fun retrieve(id: String): MessagingProfileRetrieveResponse =
        retrieve(id, MessagingProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
    ): MessagingProfileRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: MessagingProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: MessagingProfileRetrieveParams): MessagingProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): MessagingProfileRetrieveResponse =
        retrieve(id, MessagingProfileRetrieveParams.none(), requestOptions)

    /** Update a messaging profile */
    fun update(pathId: String): MessagingProfileUpdateResponse =
        update(pathId, MessagingProfileUpdateParams.none())

    /** @see update */
    fun update(
        pathId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileUpdateResponse =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(
        pathId: String,
        params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
    ): MessagingProfileUpdateResponse = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessagingProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileUpdateResponse

    /** @see update */
    fun update(params: MessagingProfileUpdateParams): MessagingProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(pathId: String, requestOptions: RequestOptions): MessagingProfileUpdateResponse =
        update(pathId, MessagingProfileUpdateParams.none(), requestOptions)

    /** List messaging profiles */
    fun list(): MessagingProfileListResponse = list(MessagingProfileListParams.none())

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListResponse

    /** @see list */
    fun list(
        params: MessagingProfileListParams = MessagingProfileListParams.none()
    ): MessagingProfileListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): MessagingProfileListResponse =
        list(MessagingProfileListParams.none(), requestOptions)

    /** Delete a messaging profile */
    fun delete(id: String): MessagingProfileDeleteResponse =
        delete(id, MessagingProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
    ): MessagingProfileDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: MessagingProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileDeleteResponse

    /** @see delete */
    fun delete(params: MessagingProfileDeleteParams): MessagingProfileDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): MessagingProfileDeleteResponse =
        delete(id, MessagingProfileDeleteParams.none(), requestOptions)

    /** List phone numbers associated with a messaging profile */
    fun listPhoneNumbers(id: String): MessagingProfileListPhoneNumbersResponse =
        listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        id: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListPhoneNumbersResponse =
        listPhoneNumbers(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        id: String,
        params: MessagingProfileListPhoneNumbersParams =
            MessagingProfileListPhoneNumbersParams.none(),
    ): MessagingProfileListPhoneNumbersResponse =
        listPhoneNumbers(id, params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListPhoneNumbersResponse

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: MessagingProfileListPhoneNumbersParams
    ): MessagingProfileListPhoneNumbersResponse = listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        id: String,
        requestOptions: RequestOptions,
    ): MessagingProfileListPhoneNumbersResponse =
        listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none(), requestOptions)

    /** List short codes associated with a messaging profile */
    fun listShortCodes(id: String): MessagingProfileListShortCodesResponse =
        listShortCodes(id, MessagingProfileListShortCodesParams.none())

    /** @see listShortCodes */
    fun listShortCodes(
        id: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListShortCodesResponse =
        listShortCodes(params.toBuilder().id(id).build(), requestOptions)

    /** @see listShortCodes */
    fun listShortCodes(
        id: String,
        params: MessagingProfileListShortCodesParams = MessagingProfileListShortCodesParams.none(),
    ): MessagingProfileListShortCodesResponse = listShortCodes(id, params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessagingProfileListShortCodesResponse

    /** @see listShortCodes */
    fun listShortCodes(
        params: MessagingProfileListShortCodesParams
    ): MessagingProfileListShortCodesResponse = listShortCodes(params, RequestOptions.none())

    /** @see listShortCodes */
    fun listShortCodes(
        id: String,
        requestOptions: RequestOptions,
    ): MessagingProfileListShortCodesResponse =
        listShortCodes(id, MessagingProfileListShortCodesParams.none(), requestOptions)

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
        fun retrieve(id: String): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(id, MessagingProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: MessagingProfileRetrieveParams = MessagingProfileRetrieveParams.none(),
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

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
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileRetrieveResponse> =
            retrieve(id, MessagingProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileService.update].
         */
        @MustBeClosed
        fun update(pathId: String): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(pathId, MessagingProfileUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: MessagingProfileUpdateParams = MessagingProfileUpdateParams.none(),
        ): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(pathId, params, RequestOptions.none())

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
            pathId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileUpdateResponse> =
            update(pathId, MessagingProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles`, but is otherwise the same as
         * [MessagingProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<MessagingProfileListResponse> =
            list(MessagingProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessagingProfileListParams = MessagingProfileListParams.none()
        ): HttpResponseFor<MessagingProfileListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MessagingProfileListResponse> =
            list(MessagingProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /messaging_profiles/{id}`, but is otherwise the
         * same as [MessagingProfileService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(id, MessagingProfileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: MessagingProfileDeleteParams = MessagingProfileDeleteParams.none(),
        ): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(id, params, RequestOptions.none())

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
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileDeleteResponse> =
            delete(id, MessagingProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/phone_numbers`, but is
         * otherwise the same as [MessagingProfileService.listPhoneNumbers].
         */
        @MustBeClosed
        fun listPhoneNumbers(
            id: String
        ): HttpResponseFor<MessagingProfileListPhoneNumbersResponse> =
            listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            id: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListPhoneNumbersResponse> =
            listPhoneNumbers(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            id: String,
            params: MessagingProfileListPhoneNumbersParams =
                MessagingProfileListPhoneNumbersParams.none(),
        ): HttpResponseFor<MessagingProfileListPhoneNumbersResponse> =
            listPhoneNumbers(id, params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListPhoneNumbersResponse>

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: MessagingProfileListPhoneNumbersParams
        ): HttpResponseFor<MessagingProfileListPhoneNumbersResponse> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileListPhoneNumbersResponse> =
            listPhoneNumbers(id, MessagingProfileListPhoneNumbersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /messaging_profiles/{id}/short_codes`, but is
         * otherwise the same as [MessagingProfileService.listShortCodes].
         */
        @MustBeClosed
        fun listShortCodes(id: String): HttpResponseFor<MessagingProfileListShortCodesResponse> =
            listShortCodes(id, MessagingProfileListShortCodesParams.none())

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            id: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListShortCodesResponse> =
            listShortCodes(params.toBuilder().id(id).build(), requestOptions)

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            id: String,
            params: MessagingProfileListShortCodesParams =
                MessagingProfileListShortCodesParams.none(),
        ): HttpResponseFor<MessagingProfileListShortCodesResponse> =
            listShortCodes(id, params, RequestOptions.none())

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessagingProfileListShortCodesResponse>

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            params: MessagingProfileListShortCodesParams
        ): HttpResponseFor<MessagingProfileListShortCodesResponse> =
            listShortCodes(params, RequestOptions.none())

        /** @see listShortCodes */
        @MustBeClosed
        fun listShortCodes(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessagingProfileListShortCodesResponse> =
            listShortCodes(id, MessagingProfileListShortCodesParams.none(), requestOptions)
    }
}
