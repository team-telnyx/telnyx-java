// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListPageAsync
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateResponse
import com.telnyx.sdk.services.async.externalconnections.CivicAddressServiceAsync
import com.telnyx.sdk.services.async.externalconnections.LogMessageServiceAsync
import com.telnyx.sdk.services.async.externalconnections.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.externalconnections.ReleaseServiceAsync
import com.telnyx.sdk.services.async.externalconnections.UploadServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** External Connections operations */
interface ExternalConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalConnectionServiceAsync

    /** External Connections operations */
    fun logMessages(): LogMessageServiceAsync

    /** External Connections operations */
    fun civicAddresses(): CivicAddressServiceAsync

    /** External Connections operations */
    fun phoneNumbers(): PhoneNumberServiceAsync

    /** External Connections operations */
    fun releases(): ReleaseServiceAsync

    /** External Connections operations */
    fun uploads(): UploadServiceAsync

    /**
     * Creates a new External Connection based on the parameters sent in the request. The
     * external_sip_connection and outbound voice profile id are required. Once created, you can
     * assign phone numbers to your application using the `/phone_numbers` endpoint.
     */
    fun create(
        params: ExternalConnectionCreateParams
    ): CompletableFuture<ExternalConnectionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionCreateResponse>

    /**
     * Return the details of an existing External Connection inside the 'data' attribute of the
     * response.
     */
    fun retrieve(id: String): CompletableFuture<ExternalConnectionRetrieveResponse> =
        retrieve(id, ExternalConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
    ): CompletableFuture<ExternalConnectionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExternalConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ExternalConnectionRetrieveParams
    ): CompletableFuture<ExternalConnectionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionRetrieveResponse> =
        retrieve(id, ExternalConnectionRetrieveParams.none(), requestOptions)

    /**
     * Updates settings of an existing External Connection based on the parameters of the request.
     */
    fun update(
        id: String,
        params: ExternalConnectionUpdateParams,
    ): CompletableFuture<ExternalConnectionUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ExternalConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: ExternalConnectionUpdateParams
    ): CompletableFuture<ExternalConnectionUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExternalConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionUpdateResponse>

    /**
     * This endpoint returns a list of your External Connections inside the 'data' attribute of the
     * response. External Connections are used by Telnyx customers to seamless configure SIP
     * trunking integrations with Telnyx Partners, through External Voice Integrations in Mission
     * Control Portal.
     */
    fun list(): CompletableFuture<ExternalConnectionListPageAsync> =
        list(ExternalConnectionListParams.none())

    /** @see list */
    fun list(
        params: ExternalConnectionListParams = ExternalConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionListPageAsync>

    /** @see list */
    fun list(
        params: ExternalConnectionListParams = ExternalConnectionListParams.none()
    ): CompletableFuture<ExternalConnectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalConnectionListPageAsync> =
        list(ExternalConnectionListParams.none(), requestOptions)

    /**
     * Permanently deletes an External Connection. Deletion may be prevented if the application is
     * in use by phone numbers, is active, or if it is an Operator Connect connection. To remove an
     * Operator Connect integration please contact Telnyx support.
     */
    fun delete(id: String): CompletableFuture<ExternalConnectionDeleteResponse> =
        delete(id, ExternalConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
    ): CompletableFuture<ExternalConnectionDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExternalConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionDeleteResponse>

    /** @see delete */
    fun delete(
        params: ExternalConnectionDeleteParams
    ): CompletableFuture<ExternalConnectionDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalConnectionDeleteResponse> =
        delete(id, ExternalConnectionDeleteParams.none(), requestOptions)

    /** Update a location's static emergency address */
    fun updateLocation(
        locationId: String,
        params: ExternalConnectionUpdateLocationParams,
    ): CompletableFuture<ExternalConnectionUpdateLocationResponse> =
        updateLocation(locationId, params, RequestOptions.none())

    /** @see updateLocation */
    fun updateLocation(
        locationId: String,
        params: ExternalConnectionUpdateLocationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionUpdateLocationResponse> =
        updateLocation(params.toBuilder().locationId(locationId).build(), requestOptions)

    /** @see updateLocation */
    fun updateLocation(
        params: ExternalConnectionUpdateLocationParams
    ): CompletableFuture<ExternalConnectionUpdateLocationResponse> =
        updateLocation(params, RequestOptions.none())

    /** @see updateLocation */
    fun updateLocation(
        params: ExternalConnectionUpdateLocationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalConnectionUpdateLocationResponse>

    /**
     * A view of [ExternalConnectionServiceAsync] that provides access to raw HTTP responses for
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
        ): ExternalConnectionServiceAsync.WithRawResponse

        /** External Connections operations */
        fun logMessages(): LogMessageServiceAsync.WithRawResponse

        /** External Connections operations */
        fun civicAddresses(): CivicAddressServiceAsync.WithRawResponse

        /** External Connections operations */
        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse

        /** External Connections operations */
        fun releases(): ReleaseServiceAsync.WithRawResponse

        /** External Connections operations */
        fun uploads(): UploadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /external_connections`, but is otherwise the same
         * as [ExternalConnectionServiceAsync.create].
         */
        fun create(
            params: ExternalConnectionCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalConnectionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExternalConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}`, but is otherwise the
         * same as [ExternalConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<ExternalConnectionRetrieveResponse>> =
            retrieve(id, ExternalConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExternalConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ExternalConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalConnectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionRetrieveResponse>> =
            retrieve(id, ExternalConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /external_connections/{id}`, but is otherwise the
         * same as [ExternalConnectionServiceAsync.update].
         */
        fun update(
            id: String,
            params: ExternalConnectionUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ExternalConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: ExternalConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ExternalConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /external_connections`, but is otherwise the same as
         * [ExternalConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExternalConnectionListPageAsync>> =
            list(ExternalConnectionListParams.none())

        /** @see list */
        fun list(
            params: ExternalConnectionListParams = ExternalConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionListPageAsync>>

        /** @see list */
        fun list(
            params: ExternalConnectionListParams = ExternalConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalConnectionListPageAsync>> =
            list(ExternalConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /external_connections/{id}`, but is otherwise the
         * same as [ExternalConnectionServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<ExternalConnectionDeleteResponse>> =
            delete(id, ExternalConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ExternalConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ExternalConnectionDeleteParams
        ): CompletableFuture<HttpResponseFor<ExternalConnectionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionDeleteResponse>> =
            delete(id, ExternalConnectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /external_connections/{id}/locations/{location_id}`, but is otherwise the same as
         * [ExternalConnectionServiceAsync.updateLocation].
         */
        fun updateLocation(
            locationId: String,
            params: ExternalConnectionUpdateLocationParams,
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateLocationResponse>> =
            updateLocation(locationId, params, RequestOptions.none())

        /** @see updateLocation */
        fun updateLocation(
            locationId: String,
            params: ExternalConnectionUpdateLocationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateLocationResponse>> =
            updateLocation(params.toBuilder().locationId(locationId).build(), requestOptions)

        /** @see updateLocation */
        fun updateLocation(
            params: ExternalConnectionUpdateLocationParams
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateLocationResponse>> =
            updateLocation(params, RequestOptions.none())

        /** @see updateLocation */
        fun updateLocation(
            params: ExternalConnectionUpdateLocationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalConnectionUpdateLocationResponse>>
    }
}
