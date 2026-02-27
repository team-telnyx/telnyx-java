// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialCreateParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialCreateResponse
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialDeleteParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialRetrieveParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialRetrieveResponse
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialUpdateParams
import com.telnyx.sdk.models.customstoragecredentials.CustomStorageCredentialUpdateResponse
import java.util.function.Consumer

/** Call Recordings operations. */
interface CustomStorageCredentialService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomStorageCredentialService

    /** Creates a custom storage credentials configuration. */
    fun create(
        connectionId: String,
        params: CustomStorageCredentialCreateParams,
    ): CustomStorageCredentialCreateResponse = create(connectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        connectionId: String,
        params: CustomStorageCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomStorageCredentialCreateResponse =
        create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see create */
    fun create(params: CustomStorageCredentialCreateParams): CustomStorageCredentialCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomStorageCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomStorageCredentialCreateResponse

    /** Returns the information about custom storage credentials. */
    fun retrieve(connectionId: String): CustomStorageCredentialRetrieveResponse =
        retrieve(connectionId, CustomStorageCredentialRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: CustomStorageCredentialRetrieveParams =
            CustomStorageCredentialRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomStorageCredentialRetrieveResponse =
        retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: CustomStorageCredentialRetrieveParams = CustomStorageCredentialRetrieveParams.none(),
    ): CustomStorageCredentialRetrieveResponse =
        retrieve(connectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomStorageCredentialRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomStorageCredentialRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: CustomStorageCredentialRetrieveParams
    ): CustomStorageCredentialRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        requestOptions: RequestOptions,
    ): CustomStorageCredentialRetrieveResponse =
        retrieve(connectionId, CustomStorageCredentialRetrieveParams.none(), requestOptions)

    /** Updates a stored custom credentials configuration. */
    fun update(
        connectionId: String,
        params: CustomStorageCredentialUpdateParams,
    ): CustomStorageCredentialUpdateResponse = update(connectionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        connectionId: String,
        params: CustomStorageCredentialUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomStorageCredentialUpdateResponse =
        update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see update */
    fun update(params: CustomStorageCredentialUpdateParams): CustomStorageCredentialUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomStorageCredentialUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomStorageCredentialUpdateResponse

    /** Deletes a stored custom credentials configuration. */
    fun delete(connectionId: String) =
        delete(connectionId, CustomStorageCredentialDeleteParams.none())

    /** @see delete */
    fun delete(
        connectionId: String,
        params: CustomStorageCredentialDeleteParams = CustomStorageCredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        connectionId: String,
        params: CustomStorageCredentialDeleteParams = CustomStorageCredentialDeleteParams.none(),
    ) = delete(connectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomStorageCredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: CustomStorageCredentialDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(connectionId: String, requestOptions: RequestOptions) =
        delete(connectionId, CustomStorageCredentialDeleteParams.none(), requestOptions)

    /**
     * A view of [CustomStorageCredentialService] that provides access to raw HTTP responses for
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
        ): CustomStorageCredentialService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /custom_storage_credentials/{connection_id}`, but
         * is otherwise the same as [CustomStorageCredentialService.create].
         */
        @MustBeClosed
        fun create(
            connectionId: String,
            params: CustomStorageCredentialCreateParams,
        ): HttpResponseFor<CustomStorageCredentialCreateResponse> =
            create(connectionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            connectionId: String,
            params: CustomStorageCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomStorageCredentialCreateResponse> =
            create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomStorageCredentialCreateParams
        ): HttpResponseFor<CustomStorageCredentialCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomStorageCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomStorageCredentialCreateResponse>

        /**
         * Returns a raw HTTP response for `get /custom_storage_credentials/{connection_id}`, but is
         * otherwise the same as [CustomStorageCredentialService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            connectionId: String
        ): HttpResponseFor<CustomStorageCredentialRetrieveResponse> =
            retrieve(connectionId, CustomStorageCredentialRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectionId: String,
            params: CustomStorageCredentialRetrieveParams =
                CustomStorageCredentialRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomStorageCredentialRetrieveResponse> =
            retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectionId: String,
            params: CustomStorageCredentialRetrieveParams =
                CustomStorageCredentialRetrieveParams.none(),
        ): HttpResponseFor<CustomStorageCredentialRetrieveResponse> =
            retrieve(connectionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomStorageCredentialRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomStorageCredentialRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomStorageCredentialRetrieveParams
        ): HttpResponseFor<CustomStorageCredentialRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomStorageCredentialRetrieveResponse> =
            retrieve(connectionId, CustomStorageCredentialRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /custom_storage_credentials/{connection_id}`, but is
         * otherwise the same as [CustomStorageCredentialService.update].
         */
        @MustBeClosed
        fun update(
            connectionId: String,
            params: CustomStorageCredentialUpdateParams,
        ): HttpResponseFor<CustomStorageCredentialUpdateResponse> =
            update(connectionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            connectionId: String,
            params: CustomStorageCredentialUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomStorageCredentialUpdateResponse> =
            update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomStorageCredentialUpdateParams
        ): HttpResponseFor<CustomStorageCredentialUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CustomStorageCredentialUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomStorageCredentialUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /custom_storage_credentials/{connection_id}`, but
         * is otherwise the same as [CustomStorageCredentialService.delete].
         */
        @MustBeClosed
        fun delete(connectionId: String): HttpResponse =
            delete(connectionId, CustomStorageCredentialDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            connectionId: String,
            params: CustomStorageCredentialDeleteParams =
                CustomStorageCredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            connectionId: String,
            params: CustomStorageCredentialDeleteParams = CustomStorageCredentialDeleteParams.none(),
        ): HttpResponse = delete(connectionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomStorageCredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CustomStorageCredentialDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(connectionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(connectionId, CustomStorageCredentialDeleteParams.none(), requestOptions)
    }
}
