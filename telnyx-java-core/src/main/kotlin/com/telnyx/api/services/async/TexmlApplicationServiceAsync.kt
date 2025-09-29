// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texmlapplications.TexmlApplicationCreateParams
import com.telnyx.api.models.texmlapplications.TexmlApplicationCreateResponse
import com.telnyx.api.models.texmlapplications.TexmlApplicationDeleteParams
import com.telnyx.api.models.texmlapplications.TexmlApplicationDeleteResponse
import com.telnyx.api.models.texmlapplications.TexmlApplicationListParams
import com.telnyx.api.models.texmlapplications.TexmlApplicationListResponse
import com.telnyx.api.models.texmlapplications.TexmlApplicationRetrieveParams
import com.telnyx.api.models.texmlapplications.TexmlApplicationRetrieveResponse
import com.telnyx.api.models.texmlapplications.TexmlApplicationUpdateParams
import com.telnyx.api.models.texmlapplications.TexmlApplicationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TexmlApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlApplicationServiceAsync

    /** Creates a TeXML Application. */
    fun create(
        params: TexmlApplicationCreateParams
    ): CompletableFuture<TexmlApplicationCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TexmlApplicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationCreateResponse>

    /** Retrieves the details of an existing TeXML Application. */
    fun retrieve(id: String): CompletableFuture<TexmlApplicationRetrieveResponse> =
        retrieve(id, TexmlApplicationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
    ): CompletableFuture<TexmlApplicationRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TexmlApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TexmlApplicationRetrieveParams
    ): CompletableFuture<TexmlApplicationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TexmlApplicationRetrieveResponse> =
        retrieve(id, TexmlApplicationRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing TeXML Application. */
    fun update(
        id: String,
        params: TexmlApplicationUpdateParams,
    ): CompletableFuture<TexmlApplicationUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TexmlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: TexmlApplicationUpdateParams
    ): CompletableFuture<TexmlApplicationUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TexmlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationUpdateResponse>

    /** Returns a list of your TeXML Applications. */
    fun list(): CompletableFuture<TexmlApplicationListResponse> =
        list(TexmlApplicationListParams.none())

    /** @see list */
    fun list(
        params: TexmlApplicationListParams = TexmlApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationListResponse>

    /** @see list */
    fun list(
        params: TexmlApplicationListParams = TexmlApplicationListParams.none()
    ): CompletableFuture<TexmlApplicationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TexmlApplicationListResponse> =
        list(TexmlApplicationListParams.none(), requestOptions)

    /** Deletes a TeXML Application. */
    fun delete(id: String): CompletableFuture<TexmlApplicationDeleteResponse> =
        delete(id, TexmlApplicationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
    ): CompletableFuture<TexmlApplicationDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TexmlApplicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TexmlApplicationDeleteResponse>

    /** @see delete */
    fun delete(
        params: TexmlApplicationDeleteParams
    ): CompletableFuture<TexmlApplicationDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TexmlApplicationDeleteResponse> =
        delete(id, TexmlApplicationDeleteParams.none(), requestOptions)

    /**
     * A view of [TexmlApplicationServiceAsync] that provides access to raw HTTP responses for each
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
        ): TexmlApplicationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml_applications`, but is otherwise the same as
         * [TexmlApplicationServiceAsync.create].
         */
        fun create(
            params: TexmlApplicationCreateParams
        ): CompletableFuture<HttpResponseFor<TexmlApplicationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TexmlApplicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /texml_applications/{id}`, but is otherwise the same
         * as [TexmlApplicationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<TexmlApplicationRetrieveResponse>> =
            retrieve(id, TexmlApplicationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TexmlApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TexmlApplicationRetrieveParams
        ): CompletableFuture<HttpResponseFor<TexmlApplicationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TexmlApplicationRetrieveResponse>> =
            retrieve(id, TexmlApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /texml_applications/{id}`, but is otherwise the
         * same as [TexmlApplicationServiceAsync.update].
         */
        fun update(
            id: String,
            params: TexmlApplicationUpdateParams,
        ): CompletableFuture<HttpResponseFor<TexmlApplicationUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: TexmlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: TexmlApplicationUpdateParams
        ): CompletableFuture<HttpResponseFor<TexmlApplicationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TexmlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /texml_applications`, but is otherwise the same as
         * [TexmlApplicationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TexmlApplicationListResponse>> =
            list(TexmlApplicationListParams.none())

        /** @see list */
        fun list(
            params: TexmlApplicationListParams = TexmlApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationListResponse>>

        /** @see list */
        fun list(
            params: TexmlApplicationListParams = TexmlApplicationListParams.none()
        ): CompletableFuture<HttpResponseFor<TexmlApplicationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TexmlApplicationListResponse>> =
            list(TexmlApplicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /texml_applications/{id}`, but is otherwise the
         * same as [TexmlApplicationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<TexmlApplicationDeleteResponse>> =
            delete(id, TexmlApplicationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TexmlApplicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TexmlApplicationDeleteResponse>>

        /** @see delete */
        fun delete(
            params: TexmlApplicationDeleteParams
        ): CompletableFuture<HttpResponseFor<TexmlApplicationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TexmlApplicationDeleteResponse>> =
            delete(id, TexmlApplicationDeleteParams.none(), requestOptions)
    }
}
