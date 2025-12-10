// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OutboundVoiceProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OutboundVoiceProfileServiceAsync

    /** Create an outbound voice profile. */
    fun create(
        params: OutboundVoiceProfileCreateParams
    ): CompletableFuture<OutboundVoiceProfileCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: OutboundVoiceProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileCreateResponse>

    /** Retrieves the details of an existing outbound voice profile. */
    fun retrieve(id: String): CompletableFuture<OutboundVoiceProfileRetrieveResponse> =
        retrieve(id, OutboundVoiceProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
    ): CompletableFuture<OutboundVoiceProfileRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OutboundVoiceProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: OutboundVoiceProfileRetrieveParams
    ): CompletableFuture<OutboundVoiceProfileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboundVoiceProfileRetrieveResponse> =
        retrieve(id, OutboundVoiceProfileRetrieveParams.none(), requestOptions)

    /** Updates an existing outbound voice profile. */
    fun update(
        id: String,
        params: OutboundVoiceProfileUpdateParams,
    ): CompletableFuture<OutboundVoiceProfileUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: OutboundVoiceProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: OutboundVoiceProfileUpdateParams
    ): CompletableFuture<OutboundVoiceProfileUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OutboundVoiceProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileUpdateResponse>

    /** Get all outbound voice profiles belonging to the user that match the given filters. */
    fun list(): CompletableFuture<OutboundVoiceProfileListResponse> =
        list(OutboundVoiceProfileListParams.none())

    /** @see list */
    fun list(
        params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileListResponse>

    /** @see list */
    fun list(
        params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none()
    ): CompletableFuture<OutboundVoiceProfileListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OutboundVoiceProfileListResponse> =
        list(OutboundVoiceProfileListParams.none(), requestOptions)

    /** Deletes an existing outbound voice profile. */
    fun delete(id: String): CompletableFuture<OutboundVoiceProfileDeleteResponse> =
        delete(id, OutboundVoiceProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
    ): CompletableFuture<OutboundVoiceProfileDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OutboundVoiceProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OutboundVoiceProfileDeleteResponse>

    /** @see delete */
    fun delete(
        params: OutboundVoiceProfileDeleteParams
    ): CompletableFuture<OutboundVoiceProfileDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OutboundVoiceProfileDeleteResponse> =
        delete(id, OutboundVoiceProfileDeleteParams.none(), requestOptions)

    /**
     * A view of [OutboundVoiceProfileServiceAsync] that provides access to raw HTTP responses for
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
        ): OutboundVoiceProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /outbound_voice_profiles`, but is otherwise the
         * same as [OutboundVoiceProfileServiceAsync.create].
         */
        fun create(
            params: OutboundVoiceProfileCreateParams
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: OutboundVoiceProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /outbound_voice_profiles/{id}`, but is otherwise the
         * same as [OutboundVoiceProfileServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileRetrieveResponse>> =
            retrieve(id, OutboundVoiceProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: OutboundVoiceProfileRetrieveParams = OutboundVoiceProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OutboundVoiceProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: OutboundVoiceProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileRetrieveResponse>> =
            retrieve(id, OutboundVoiceProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /outbound_voice_profiles/{id}`, but is otherwise
         * the same as [OutboundVoiceProfileServiceAsync.update].
         */
        fun update(
            id: String,
            params: OutboundVoiceProfileUpdateParams,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: OutboundVoiceProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: OutboundVoiceProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OutboundVoiceProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /outbound_voice_profiles`, but is otherwise the same
         * as [OutboundVoiceProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OutboundVoiceProfileListResponse>> =
            list(OutboundVoiceProfileListParams.none())

        /** @see list */
        fun list(
            params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileListResponse>>

        /** @see list */
        fun list(
            params: OutboundVoiceProfileListParams = OutboundVoiceProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileListResponse>> =
            list(OutboundVoiceProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /outbound_voice_profiles/{id}`, but is otherwise
         * the same as [OutboundVoiceProfileServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileDeleteResponse>> =
            delete(id, OutboundVoiceProfileDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: OutboundVoiceProfileDeleteParams = OutboundVoiceProfileDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OutboundVoiceProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileDeleteResponse>>

        /** @see delete */
        fun delete(
            params: OutboundVoiceProfileDeleteParams
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OutboundVoiceProfileDeleteResponse>> =
            delete(id, OutboundVoiceProfileDeleteParams.none(), requestOptions)
    }
}
