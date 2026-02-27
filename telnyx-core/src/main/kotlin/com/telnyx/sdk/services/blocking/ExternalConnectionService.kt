// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionCreateResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionDeleteResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListPage
import com.telnyx.sdk.models.externalconnections.ExternalConnectionListParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionRetrieveResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateLocationResponse
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateParams
import com.telnyx.sdk.models.externalconnections.ExternalConnectionUpdateResponse
import com.telnyx.sdk.services.blocking.externalconnections.CivicAddressService
import com.telnyx.sdk.services.blocking.externalconnections.LogMessageService
import com.telnyx.sdk.services.blocking.externalconnections.PhoneNumberService
import com.telnyx.sdk.services.blocking.externalconnections.ReleaseService
import com.telnyx.sdk.services.blocking.externalconnections.UploadService
import java.util.function.Consumer

/** External Connections operations */
interface ExternalConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalConnectionService

    /** External Connections operations */
    fun logMessages(): LogMessageService

    /** External Connections operations */
    fun civicAddresses(): CivicAddressService

    /** External Connections operations */
    fun phoneNumbers(): PhoneNumberService

    /** External Connections operations */
    fun releases(): ReleaseService

    /** External Connections operations */
    fun uploads(): UploadService

    /**
     * Creates a new External Connection based on the parameters sent in the request. The
     * external_sip_connection and outbound voice profile id are required. Once created, you can
     * assign phone numbers to your application using the `/phone_numbers` endpoint.
     */
    fun create(params: ExternalConnectionCreateParams): ExternalConnectionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionCreateResponse

    /**
     * Return the details of an existing External Connection inside the 'data' attribute of the
     * response.
     */
    fun retrieve(id: String): ExternalConnectionRetrieveResponse =
        retrieve(id, ExternalConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
    ): ExternalConnectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExternalConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ExternalConnectionRetrieveParams): ExternalConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ExternalConnectionRetrieveResponse =
        retrieve(id, ExternalConnectionRetrieveParams.none(), requestOptions)

    /**
     * Updates settings of an existing External Connection based on the parameters of the request.
     */
    fun update(
        id: String,
        params: ExternalConnectionUpdateParams,
    ): ExternalConnectionUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ExternalConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ExternalConnectionUpdateParams): ExternalConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExternalConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionUpdateResponse

    /**
     * This endpoint returns a list of your External Connections inside the 'data' attribute of the
     * response. External Connections are used by Telnyx customers to seamless configure SIP
     * trunking integrations with Telnyx Partners, through External Voice Integrations in Mission
     * Control Portal.
     */
    fun list(): ExternalConnectionListPage = list(ExternalConnectionListParams.none())

    /** @see list */
    fun list(
        params: ExternalConnectionListParams = ExternalConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionListPage

    /** @see list */
    fun list(
        params: ExternalConnectionListParams = ExternalConnectionListParams.none()
    ): ExternalConnectionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ExternalConnectionListPage =
        list(ExternalConnectionListParams.none(), requestOptions)

    /**
     * Permanently deletes an External Connection. Deletion may be prevented if the application is
     * in use by phone numbers, is active, or if it is an Operator Connect connection. To remove an
     * Operator Connect integration please contact Telnyx support.
     */
    fun delete(id: String): ExternalConnectionDeleteResponse =
        delete(id, ExternalConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
    ): ExternalConnectionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ExternalConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionDeleteResponse

    /** @see delete */
    fun delete(params: ExternalConnectionDeleteParams): ExternalConnectionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): ExternalConnectionDeleteResponse =
        delete(id, ExternalConnectionDeleteParams.none(), requestOptions)

    /** Update a location's static emergency address */
    fun updateLocation(
        locationId: String,
        params: ExternalConnectionUpdateLocationParams,
    ): ExternalConnectionUpdateLocationResponse =
        updateLocation(locationId, params, RequestOptions.none())

    /** @see updateLocation */
    fun updateLocation(
        locationId: String,
        params: ExternalConnectionUpdateLocationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionUpdateLocationResponse =
        updateLocation(params.toBuilder().locationId(locationId).build(), requestOptions)

    /** @see updateLocation */
    fun updateLocation(
        params: ExternalConnectionUpdateLocationParams
    ): ExternalConnectionUpdateLocationResponse = updateLocation(params, RequestOptions.none())

    /** @see updateLocation */
    fun updateLocation(
        params: ExternalConnectionUpdateLocationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalConnectionUpdateLocationResponse

    /**
     * A view of [ExternalConnectionService] that provides access to raw HTTP responses for each
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
        ): ExternalConnectionService.WithRawResponse

        /** External Connections operations */
        fun logMessages(): LogMessageService.WithRawResponse

        /** External Connections operations */
        fun civicAddresses(): CivicAddressService.WithRawResponse

        /** External Connections operations */
        fun phoneNumbers(): PhoneNumberService.WithRawResponse

        /** External Connections operations */
        fun releases(): ReleaseService.WithRawResponse

        /** External Connections operations */
        fun uploads(): UploadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /external_connections`, but is otherwise the same
         * as [ExternalConnectionService.create].
         */
        @MustBeClosed
        fun create(
            params: ExternalConnectionCreateParams
        ): HttpResponseFor<ExternalConnectionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExternalConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}`, but is otherwise the
         * same as [ExternalConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ExternalConnectionRetrieveResponse> =
            retrieve(id, ExternalConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ExternalConnectionRetrieveParams = ExternalConnectionRetrieveParams.none(),
        ): HttpResponseFor<ExternalConnectionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ExternalConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ExternalConnectionRetrieveParams
        ): HttpResponseFor<ExternalConnectionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionRetrieveResponse> =
            retrieve(id, ExternalConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /external_connections/{id}`, but is otherwise the
         * same as [ExternalConnectionService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ExternalConnectionUpdateParams,
        ): HttpResponseFor<ExternalConnectionUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ExternalConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExternalConnectionUpdateParams
        ): HttpResponseFor<ExternalConnectionUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExternalConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /external_connections`, but is otherwise the same as
         * [ExternalConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExternalConnectionListPage> =
            list(ExternalConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExternalConnectionListParams = ExternalConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExternalConnectionListParams = ExternalConnectionListParams.none()
        ): HttpResponseFor<ExternalConnectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalConnectionListPage> =
            list(ExternalConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /external_connections/{id}`, but is otherwise the
         * same as [ExternalConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ExternalConnectionDeleteResponse> =
            delete(id, ExternalConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExternalConnectionDeleteParams = ExternalConnectionDeleteParams.none(),
        ): HttpResponseFor<ExternalConnectionDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExternalConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExternalConnectionDeleteParams
        ): HttpResponseFor<ExternalConnectionDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalConnectionDeleteResponse> =
            delete(id, ExternalConnectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /external_connections/{id}/locations/{location_id}`, but is otherwise the same as
         * [ExternalConnectionService.updateLocation].
         */
        @MustBeClosed
        fun updateLocation(
            locationId: String,
            params: ExternalConnectionUpdateLocationParams,
        ): HttpResponseFor<ExternalConnectionUpdateLocationResponse> =
            updateLocation(locationId, params, RequestOptions.none())

        /** @see updateLocation */
        @MustBeClosed
        fun updateLocation(
            locationId: String,
            params: ExternalConnectionUpdateLocationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionUpdateLocationResponse> =
            updateLocation(params.toBuilder().locationId(locationId).build(), requestOptions)

        /** @see updateLocation */
        @MustBeClosed
        fun updateLocation(
            params: ExternalConnectionUpdateLocationParams
        ): HttpResponseFor<ExternalConnectionUpdateLocationResponse> =
            updateLocation(params, RequestOptions.none())

        /** @see updateLocation */
        @MustBeClosed
        fun updateLocation(
            params: ExternalConnectionUpdateLocationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalConnectionUpdateLocationResponse>
    }
}
