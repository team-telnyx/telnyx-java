// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialCreateParams
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialCreateResponse
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialCreateTokenParams
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialDeleteParams
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialDeleteResponse
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialListParams
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialListResponse
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialRetrieveParams
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialRetrieveResponse
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialUpdateParams
import com.telnyx.sdk.models.telephonycredentials.TelephonyCredentialUpdateResponse
import java.util.function.Consumer

interface TelephonyCredentialService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TelephonyCredentialService

    /** Create a credential. */
    fun create(params: TelephonyCredentialCreateParams): TelephonyCredentialCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TelephonyCredentialCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialCreateResponse

    /** Get the details of an existing On-demand Credential. */
    fun retrieve(id: String): TelephonyCredentialRetrieveResponse =
        retrieve(id, TelephonyCredentialRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
    ): TelephonyCredentialRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TelephonyCredentialRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TelephonyCredentialRetrieveParams): TelephonyCredentialRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TelephonyCredentialRetrieveResponse =
        retrieve(id, TelephonyCredentialRetrieveParams.none(), requestOptions)

    /** Update an existing credential. */
    fun update(id: String): TelephonyCredentialUpdateResponse =
        update(id, TelephonyCredentialUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
    ): TelephonyCredentialUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TelephonyCredentialUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialUpdateResponse

    /** @see update */
    fun update(params: TelephonyCredentialUpdateParams): TelephonyCredentialUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): TelephonyCredentialUpdateResponse =
        update(id, TelephonyCredentialUpdateParams.none(), requestOptions)

    /** List all On-demand Credentials. */
    fun list(): TelephonyCredentialListResponse = list(TelephonyCredentialListParams.none())

    /** @see list */
    fun list(
        params: TelephonyCredentialListParams = TelephonyCredentialListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialListResponse

    /** @see list */
    fun list(
        params: TelephonyCredentialListParams = TelephonyCredentialListParams.none()
    ): TelephonyCredentialListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TelephonyCredentialListResponse =
        list(TelephonyCredentialListParams.none(), requestOptions)

    /** Delete an existing credential. */
    fun delete(id: String): TelephonyCredentialDeleteResponse =
        delete(id, TelephonyCredentialDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
    ): TelephonyCredentialDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TelephonyCredentialDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelephonyCredentialDeleteResponse

    /** @see delete */
    fun delete(params: TelephonyCredentialDeleteParams): TelephonyCredentialDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): TelephonyCredentialDeleteResponse =
        delete(id, TelephonyCredentialDeleteParams.none(), requestOptions)

    /** Create an Access Token (JWT) for the credential. */
    fun createToken(id: String): String =
        createToken(id, TelephonyCredentialCreateTokenParams.none())

    /** @see createToken */
    fun createToken(
        id: String,
        params: TelephonyCredentialCreateTokenParams = TelephonyCredentialCreateTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = createToken(params.toBuilder().id(id).build(), requestOptions)

    /** @see createToken */
    fun createToken(
        id: String,
        params: TelephonyCredentialCreateTokenParams = TelephonyCredentialCreateTokenParams.none(),
    ): String = createToken(id, params, RequestOptions.none())

    /** @see createToken */
    fun createToken(
        params: TelephonyCredentialCreateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see createToken */
    fun createToken(params: TelephonyCredentialCreateTokenParams): String =
        createToken(params, RequestOptions.none())

    /** @see createToken */
    fun createToken(id: String, requestOptions: RequestOptions): String =
        createToken(id, TelephonyCredentialCreateTokenParams.none(), requestOptions)

    /**
     * A view of [TelephonyCredentialService] that provides access to raw HTTP responses for each
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
        ): TelephonyCredentialService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /telephony_credentials`, but is otherwise the same
         * as [TelephonyCredentialService.create].
         */
        @MustBeClosed
        fun create(
            params: TelephonyCredentialCreateParams
        ): HttpResponseFor<TelephonyCredentialCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TelephonyCredentialCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialCreateResponse>

        /**
         * Returns a raw HTTP response for `get /telephony_credentials/{id}`, but is otherwise the
         * same as [TelephonyCredentialService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TelephonyCredentialRetrieveResponse> =
            retrieve(id, TelephonyCredentialRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TelephonyCredentialRetrieveParams = TelephonyCredentialRetrieveParams.none(),
        ): HttpResponseFor<TelephonyCredentialRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TelephonyCredentialRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TelephonyCredentialRetrieveParams
        ): HttpResponseFor<TelephonyCredentialRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelephonyCredentialRetrieveResponse> =
            retrieve(id, TelephonyCredentialRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /telephony_credentials/{id}`, but is otherwise the
         * same as [TelephonyCredentialService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<TelephonyCredentialUpdateResponse> =
            update(id, TelephonyCredentialUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TelephonyCredentialUpdateParams = TelephonyCredentialUpdateParams.none(),
        ): HttpResponseFor<TelephonyCredentialUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TelephonyCredentialUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: TelephonyCredentialUpdateParams
        ): HttpResponseFor<TelephonyCredentialUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelephonyCredentialUpdateResponse> =
            update(id, TelephonyCredentialUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /telephony_credentials`, but is otherwise the same
         * as [TelephonyCredentialService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TelephonyCredentialListResponse> =
            list(TelephonyCredentialListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TelephonyCredentialListParams = TelephonyCredentialListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TelephonyCredentialListParams = TelephonyCredentialListParams.none()
        ): HttpResponseFor<TelephonyCredentialListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TelephonyCredentialListResponse> =
            list(TelephonyCredentialListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /telephony_credentials/{id}`, but is otherwise
         * the same as [TelephonyCredentialService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<TelephonyCredentialDeleteResponse> =
            delete(id, TelephonyCredentialDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TelephonyCredentialDeleteParams = TelephonyCredentialDeleteParams.none(),
        ): HttpResponseFor<TelephonyCredentialDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TelephonyCredentialDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelephonyCredentialDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TelephonyCredentialDeleteParams
        ): HttpResponseFor<TelephonyCredentialDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelephonyCredentialDeleteResponse> =
            delete(id, TelephonyCredentialDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /telephony_credentials/{id}/token`, but is
         * otherwise the same as [TelephonyCredentialService.createToken].
         */
        @MustBeClosed
        fun createToken(id: String): HttpResponseFor<String> =
            createToken(id, TelephonyCredentialCreateTokenParams.none())

        /** @see createToken */
        @MustBeClosed
        fun createToken(
            id: String,
            params: TelephonyCredentialCreateTokenParams =
                TelephonyCredentialCreateTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> = createToken(params.toBuilder().id(id).build(), requestOptions)

        /** @see createToken */
        @MustBeClosed
        fun createToken(
            id: String,
            params: TelephonyCredentialCreateTokenParams =
                TelephonyCredentialCreateTokenParams.none(),
        ): HttpResponseFor<String> = createToken(id, params, RequestOptions.none())

        /** @see createToken */
        @MustBeClosed
        fun createToken(
            params: TelephonyCredentialCreateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see createToken */
        @MustBeClosed
        fun createToken(params: TelephonyCredentialCreateTokenParams): HttpResponseFor<String> =
            createToken(params, RequestOptions.none())

        /** @see createToken */
        @MustBeClosed
        fun createToken(id: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            createToken(id, TelephonyCredentialCreateTokenParams.none(), requestOptions)
    }
}
