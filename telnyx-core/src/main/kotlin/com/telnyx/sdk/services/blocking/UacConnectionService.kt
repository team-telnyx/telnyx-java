// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteParams
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionListPage
import com.telnyx.sdk.models.uacconnections.UacConnectionListParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateResponse
import com.telnyx.sdk.services.blocking.uacconnections.ActionService
import java.util.function.Consumer

/** UAC connection operations */
interface UacConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UacConnectionService

    /** UAC connection operations */
    fun actions(): ActionService

    /**
     * Creates a UAC connection. A UAC (User Agent Client) Connection registers Telnyx to your PBX —
     * the opposite of a standard SIP trunk, where the PBX registers to Telnyx. Use UAC when your
     * PBX doesn’t support outbound SIP registration or you need Telnyx to maintain the
     * registration.
     */
    fun create(params: UacConnectionCreateParams): UacConnectionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UacConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionCreateResponse

    /** Retrieves the details of an existing UAC connection. */
    fun retrieve(id: String): UacConnectionRetrieveResponse =
        retrieve(id, UacConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
    ): UacConnectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UacConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: UacConnectionRetrieveParams): UacConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): UacConnectionRetrieveResponse =
        retrieve(id, UacConnectionRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing UAC connection. */
    fun update(id: String): UacConnectionUpdateResponse =
        update(id, UacConnectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
    ): UacConnectionUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: UacConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionUpdateResponse

    /** @see update */
    fun update(params: UacConnectionUpdateParams): UacConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): UacConnectionUpdateResponse =
        update(id, UacConnectionUpdateParams.none(), requestOptions)

    /**
     * Returns a list of your UAC connections. A UAC (User Agent Client) Connection registers Telnyx
     * to your PBX — the opposite of a standard SIP trunk, where the PBX registers to Telnyx. Use
     * UAC when your PBX doesn’t support outbound SIP registration or you need Telnyx to maintain
     * the registration.
     */
    fun list(): UacConnectionListPage = list(UacConnectionListParams.none())

    /** @see list */
    fun list(
        params: UacConnectionListParams = UacConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionListPage

    /** @see list */
    fun list(
        params: UacConnectionListParams = UacConnectionListParams.none()
    ): UacConnectionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): UacConnectionListPage =
        list(UacConnectionListParams.none(), requestOptions)

    /** Deletes an existing UAC connection. */
    fun delete(id: String): UacConnectionDeleteResponse =
        delete(id, UacConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
    ): UacConnectionDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: UacConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UacConnectionDeleteResponse

    /** @see delete */
    fun delete(params: UacConnectionDeleteParams): UacConnectionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): UacConnectionDeleteResponse =
        delete(id, UacConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [UacConnectionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UacConnectionService.WithRawResponse

        /** UAC connection operations */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /uac_connections`, but is otherwise the same as
         * [UacConnectionService.create].
         */
        @MustBeClosed
        fun create(
            params: UacConnectionCreateParams
        ): HttpResponseFor<UacConnectionCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UacConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /uac_connections/{id}`, but is otherwise the same as
         * [UacConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<UacConnectionRetrieveResponse> =
            retrieve(id, UacConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UacConnectionRetrieveParams = UacConnectionRetrieveParams.none(),
        ): HttpResponseFor<UacConnectionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UacConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UacConnectionRetrieveParams
        ): HttpResponseFor<UacConnectionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionRetrieveResponse> =
            retrieve(id, UacConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /uac_connections/{id}`, but is otherwise the same
         * as [UacConnectionService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<UacConnectionUpdateResponse> =
            update(id, UacConnectionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: UacConnectionUpdateParams = UacConnectionUpdateParams.none(),
        ): HttpResponseFor<UacConnectionUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: UacConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: UacConnectionUpdateParams
        ): HttpResponseFor<UacConnectionUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionUpdateResponse> =
            update(id, UacConnectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /uac_connections`, but is otherwise the same as
         * [UacConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UacConnectionListPage> = list(UacConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UacConnectionListParams = UacConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: UacConnectionListParams = UacConnectionListParams.none()
        ): HttpResponseFor<UacConnectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UacConnectionListPage> =
            list(UacConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /uac_connections/{id}`, but is otherwise the same
         * as [UacConnectionService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<UacConnectionDeleteResponse> =
            delete(id, UacConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: UacConnectionDeleteParams = UacConnectionDeleteParams.none(),
        ): HttpResponseFor<UacConnectionDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UacConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UacConnectionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UacConnectionDeleteParams
        ): HttpResponseFor<UacConnectionDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UacConnectionDeleteResponse> =
            delete(id, UacConnectionDeleteParams.none(), requestOptions)
    }
}
