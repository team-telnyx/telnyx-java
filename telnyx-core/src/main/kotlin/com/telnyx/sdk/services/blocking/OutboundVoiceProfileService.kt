// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileCreateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileCreateResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileDeleteParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileDeleteResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileListParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileListResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileRetrieveParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileRetrieveResponse
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateParams
import com.telnyx.sdk.models.outboundvoiceprofiles.OutboundVoiceProfileUpdateResponse
import java.util.function.Consumer

interface OutboundVoiceProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OutboundVoiceProfileService

    /** Create an outbound voice profile. */
    fun create(params: OutboundVoiceProfileCreateParams): OutboundVoiceProfileCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OutboundVoiceProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileCreateResponse

    /** Retrieves the details of an existing outbound voice profile. */
    fun retrieve(id: String): OutboundVoiceProfileRetrieveResponse =
        retrieve(id, OutboundVoiceProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
    ): OutboundVoiceProfileRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OutboundVoiceProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: OutboundVoiceProfileRetrieveParams): OutboundVoiceProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): OutboundVoiceProfileRetrieveResponse =
        retrieve(id, OutboundVoiceProfileRetrieveParams.none(), requestOptions)

    /** Updates an existing outbound voice profile. */
    fun update(
        id: String,
        params: OutboundVoiceProfileUpdateParams,
    ): OutboundVoiceProfileUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: OutboundVoiceProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: OutboundVoiceProfileUpdateParams): OutboundVoiceProfileUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OutboundVoiceProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileUpdateResponse

    /** Get all outbound voice profiles belonging to the user that match the given filters. */
    fun list(): OutboundVoiceProfileListResponse = list(OutboundVoiceProfileListParams.none())

    /** @see list */
    fun list(
        params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileListResponse

    /** @see list */
    fun list(
        params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none()
    ): OutboundVoiceProfileListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OutboundVoiceProfileListResponse =
        list(OutboundVoiceProfileListParams.none(), requestOptions)

    /** Deletes an existing outbound voice profile. */
    fun delete(id: String): OutboundVoiceProfileDeleteResponse =
        delete(id, OutboundVoiceProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
    ): OutboundVoiceProfileDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OutboundVoiceProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OutboundVoiceProfileDeleteResponse

    /** @see delete */
    fun delete(params: OutboundVoiceProfileDeleteParams): OutboundVoiceProfileDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): OutboundVoiceProfileDeleteResponse =
        delete(id, OutboundVoiceProfileDeleteParams.none(), requestOptions)

    /**
     * A view of [OutboundVoiceProfileService] that provides access to raw HTTP responses for each
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
        ): OutboundVoiceProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /outbound_voice_profiles`, but is otherwise the
         * same as [OutboundVoiceProfileService.create].
         */
        @MustBeClosed
        fun create(
            params: OutboundVoiceProfileCreateParams
        ): HttpResponseFor<OutboundVoiceProfileCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: OutboundVoiceProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileCreateResponse>

        /**
         * Returns a raw HTTP response for `get /outbound_voice_profiles/{id}`, but is otherwise the
         * same as [OutboundVoiceProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<OutboundVoiceProfileRetrieveResponse> =
            retrieve(id, OutboundVoiceProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
        ): HttpResponseFor<OutboundVoiceProfileRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OutboundVoiceProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OutboundVoiceProfileRetrieveParams
        ): HttpResponseFor<OutboundVoiceProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OutboundVoiceProfileRetrieveResponse> =
            retrieve(id, OutboundVoiceProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /outbound_voice_profiles/{id}`, but is otherwise
         * the same as [OutboundVoiceProfileService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: OutboundVoiceProfileUpdateParams,
        ): HttpResponseFor<OutboundVoiceProfileUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: OutboundVoiceProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: OutboundVoiceProfileUpdateParams
        ): HttpResponseFor<OutboundVoiceProfileUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OutboundVoiceProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /outbound_voice_profiles`, but is otherwise the same
         * as [OutboundVoiceProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<OutboundVoiceProfileListResponse> =
            list(OutboundVoiceProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none()
        ): HttpResponseFor<OutboundVoiceProfileListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<OutboundVoiceProfileListResponse> =
            list(OutboundVoiceProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /outbound_voice_profiles/{id}`, but is otherwise
         * the same as [OutboundVoiceProfileService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<OutboundVoiceProfileDeleteResponse> =
            delete(id, OutboundVoiceProfileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
        ): HttpResponseFor<OutboundVoiceProfileDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OutboundVoiceProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OutboundVoiceProfileDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OutboundVoiceProfileDeleteParams
        ): HttpResponseFor<OutboundVoiceProfileDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OutboundVoiceProfileDeleteResponse> =
            delete(id, OutboundVoiceProfileDeleteParams.none(), requestOptions)
    }
}
