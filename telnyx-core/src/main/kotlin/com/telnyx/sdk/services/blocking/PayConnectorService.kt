// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.payconnectors.PayConnectorCreateParams
import com.telnyx.sdk.models.payconnectors.PayConnectorDeleteParams
import com.telnyx.sdk.models.payconnectors.PayConnectorListPage
import com.telnyx.sdk.models.payconnectors.PayConnectorListParams
import com.telnyx.sdk.models.payconnectors.PayConnectorResponse
import com.telnyx.sdk.models.payconnectors.PayConnectorRetrieveParams
import com.telnyx.sdk.models.payconnectors.PayConnectorUpdateParams
import java.util.function.Consumer

/** Generic payment connector configuration. */
interface PayConnectorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayConnectorService

    /**
     * Create a generic payment connector in the authenticated organization. The name must be unique
     * in that organization. Authentication supplies ownership; do not send user_id or
     * organization_id. Config is encrypted at rest; passwords and tokens are omitted from
     * responses. This operation stores configuration and does not initiate a payment. See the
     * [processor contract](/docs/voice/programmable-voice/pay#request-sent-to-the-payment-processor).
     */
    fun create(params: PayConnectorCreateParams): PayConnectorResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PayConnectorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayConnectorResponse

    /**
     * Retrieve a connector by name within the authenticated organization. Password and token are
     * omitted. A missing name or a connector owned by another organization returns 404.
     */
    fun retrieve(name: String): PayConnectorResponse =
        retrieve(name, PayConnectorRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PayConnectorRetrieveParams = PayConnectorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayConnectorResponse = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PayConnectorRetrieveParams = PayConnectorRetrieveParams.none(),
    ): PayConnectorResponse = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PayConnectorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayConnectorResponse

    /** @see retrieve */
    fun retrieve(params: PayConnectorRetrieveParams): PayConnectorResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): PayConnectorResponse =
        retrieve(name, PayConnectorRetrieveParams.none(), requestOptions)

    /**
     * Update a generic connector by name in the authenticated organization. Both test and live
     * connectors can be updated through the API. Omitted fields remain unchanged. Supplying config
     * replaces the entire config; it does not merge keys. Include endpoint_url and the credentials
     * required for the selected auth_type on every config replacement. Omitting config preserves
     * existing credentials, allowing a mode-only update. The path name cannot be renamed. Public
     * updates use PATCH.
     */
    fun update(name: String): PayConnectorResponse = update(name, PayConnectorUpdateParams.none())

    /** @see update */
    fun update(
        name: String,
        params: PayConnectorUpdateParams = PayConnectorUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayConnectorResponse = update(params.toBuilder().name(name).build(), requestOptions)

    /** @see update */
    fun update(
        name: String,
        params: PayConnectorUpdateParams = PayConnectorUpdateParams.none(),
    ): PayConnectorResponse = update(name, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PayConnectorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayConnectorResponse

    /** @see update */
    fun update(params: PayConnectorUpdateParams): PayConnectorResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(name: String, requestOptions: RequestOptions): PayConnectorResponse =
        update(name, PayConnectorUpdateParams.none(), requestOptions)

    /**
     * List connectors belonging to the authenticated organization, including connectors created by
     * other users in that organization. Set filter[type]=generic to restrict results to the type
     * covered here. Results default to newest created_at first. Use meta.end_cursor as page[after]
     * for the next page, or meta.start_cursor as page[before] for the preceding page. Omit both
     * cursors for the first page; if both are supplied, page[after] takes precedence. Responses
     * omit passwords and tokens.
     */
    fun list(): PayConnectorListPage = list(PayConnectorListParams.none())

    /** @see list */
    fun list(
        params: PayConnectorListParams = PayConnectorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayConnectorListPage

    /** @see list */
    fun list(params: PayConnectorListParams = PayConnectorListParams.none()): PayConnectorListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PayConnectorListPage =
        list(PayConnectorListParams.none(), requestOptions)

    /**
     * Delete a connector by name in the authenticated organization. Both test and live connectors
     * can be deleted. Returns no response body on success; a missing name or a connector in another
     * organization returns 404.
     */
    fun delete(name: String) = delete(name, PayConnectorDeleteParams.none())

    /** @see delete */
    fun delete(
        name: String,
        params: PayConnectorDeleteParams = PayConnectorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(name: String, params: PayConnectorDeleteParams = PayConnectorDeleteParams.none()) =
        delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PayConnectorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: PayConnectorDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(name: String, requestOptions: RequestOptions) =
        delete(name, PayConnectorDeleteParams.none(), requestOptions)

    /**
     * A view of [PayConnectorService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayConnectorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pay_connectors`, but is otherwise the same as
         * [PayConnectorService.create].
         */
        @MustBeClosed
        fun create(params: PayConnectorCreateParams): HttpResponseFor<PayConnectorResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PayConnectorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayConnectorResponse>

        /**
         * Returns a raw HTTP response for `get /pay_connectors/{name}`, but is otherwise the same
         * as [PayConnectorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(name: String): HttpResponseFor<PayConnectorResponse> =
            retrieve(name, PayConnectorRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: PayConnectorRetrieveParams = PayConnectorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayConnectorResponse> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: PayConnectorRetrieveParams = PayConnectorRetrieveParams.none(),
        ): HttpResponseFor<PayConnectorResponse> = retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PayConnectorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayConnectorResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PayConnectorRetrieveParams): HttpResponseFor<PayConnectorResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayConnectorResponse> =
            retrieve(name, PayConnectorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /pay_connectors/{name}`, but is otherwise the same
         * as [PayConnectorService.update].
         */
        @MustBeClosed
        fun update(name: String): HttpResponseFor<PayConnectorResponse> =
            update(name, PayConnectorUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            name: String,
            params: PayConnectorUpdateParams = PayConnectorUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayConnectorResponse> =
            update(params.toBuilder().name(name).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            name: String,
            params: PayConnectorUpdateParams = PayConnectorUpdateParams.none(),
        ): HttpResponseFor<PayConnectorResponse> = update(name, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PayConnectorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayConnectorResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: PayConnectorUpdateParams): HttpResponseFor<PayConnectorResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PayConnectorResponse> =
            update(name, PayConnectorUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pay_connectors`, but is otherwise the same as
         * [PayConnectorService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PayConnectorListPage> = list(PayConnectorListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PayConnectorListParams = PayConnectorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayConnectorListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PayConnectorListParams = PayConnectorListParams.none()
        ): HttpResponseFor<PayConnectorListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PayConnectorListPage> =
            list(PayConnectorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /pay_connectors/{name}`, but is otherwise the
         * same as [PayConnectorService.delete].
         */
        @MustBeClosed
        fun delete(name: String): HttpResponse = delete(name, PayConnectorDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: PayConnectorDeleteParams = PayConnectorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: PayConnectorDeleteParams = PayConnectorDeleteParams.none(),
        ): HttpResponse = delete(name, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PayConnectorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PayConnectorDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(name: String, requestOptions: RequestOptions): HttpResponse =
            delete(name, PayConnectorDeleteParams.none(), requestOptions)
    }
}
