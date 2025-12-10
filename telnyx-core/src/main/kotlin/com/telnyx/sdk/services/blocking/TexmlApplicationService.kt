// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationCreateParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationCreateResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationDeleteParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationDeleteResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationListParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationListResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationRetrieveParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationRetrieveResponse
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationUpdateParams
import com.telnyx.sdk.models.texmlapplications.TexmlApplicationUpdateResponse
import java.util.function.Consumer

interface TexmlApplicationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlApplicationService

    /** Creates a TeXML Application. */
    fun create(params: TexmlApplicationCreateParams): TexmlApplicationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TexmlApplicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationCreateResponse

    /** Retrieves the details of an existing TeXML Application. */
    fun retrieve(id: String): TexmlApplicationRetrieveResponse =
        retrieve(id, TexmlApplicationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
    ): TexmlApplicationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TexmlApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TexmlApplicationRetrieveParams): TexmlApplicationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TexmlApplicationRetrieveResponse =
        retrieve(id, TexmlApplicationRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing TeXML Application. */
    fun update(id: String, params: TexmlApplicationUpdateParams): TexmlApplicationUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: TexmlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: TexmlApplicationUpdateParams): TexmlApplicationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TexmlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationUpdateResponse

    /** Returns a list of your TeXML Applications. */
    fun list(): TexmlApplicationListResponse = list(TexmlApplicationListParams.none())

    /** @see list */
    fun list(
        params: TexmlApplicationListParams = TexmlApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationListResponse

    /** @see list */
    fun list(
        params: TexmlApplicationListParams = TexmlApplicationListParams.none()
    ): TexmlApplicationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TexmlApplicationListResponse =
        list(TexmlApplicationListParams.none(), requestOptions)

    /** Deletes a TeXML Application. */
    fun delete(id: String): TexmlApplicationDeleteResponse =
        delete(id, TexmlApplicationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
    ): TexmlApplicationDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TexmlApplicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlApplicationDeleteResponse

    /** @see delete */
    fun delete(params: TexmlApplicationDeleteParams): TexmlApplicationDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): TexmlApplicationDeleteResponse =
        delete(id, TexmlApplicationDeleteParams.none(), requestOptions)

    /**
     * A view of [TexmlApplicationService] that provides access to raw HTTP responses for each
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
        ): TexmlApplicationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml_applications`, but is otherwise the same as
         * [TexmlApplicationService.create].
         */
        @MustBeClosed
        fun create(
            params: TexmlApplicationCreateParams
        ): HttpResponseFor<TexmlApplicationCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TexmlApplicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /texml_applications/{id}`, but is otherwise the same
         * as [TexmlApplicationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TexmlApplicationRetrieveResponse> =
            retrieve(id, TexmlApplicationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TexmlApplicationRetrieveParams = TexmlApplicationRetrieveParams.none(),
        ): HttpResponseFor<TexmlApplicationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TexmlApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TexmlApplicationRetrieveParams
        ): HttpResponseFor<TexmlApplicationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlApplicationRetrieveResponse> =
            retrieve(id, TexmlApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /texml_applications/{id}`, but is otherwise the
         * same as [TexmlApplicationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: TexmlApplicationUpdateParams,
        ): HttpResponseFor<TexmlApplicationUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: TexmlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: TexmlApplicationUpdateParams
        ): HttpResponseFor<TexmlApplicationUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TexmlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /texml_applications`, but is otherwise the same as
         * [TexmlApplicationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TexmlApplicationListResponse> =
            list(TexmlApplicationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TexmlApplicationListParams = TexmlApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TexmlApplicationListParams = TexmlApplicationListParams.none()
        ): HttpResponseFor<TexmlApplicationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TexmlApplicationListResponse> =
            list(TexmlApplicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /texml_applications/{id}`, but is otherwise the
         * same as [TexmlApplicationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<TexmlApplicationDeleteResponse> =
            delete(id, TexmlApplicationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TexmlApplicationDeleteParams = TexmlApplicationDeleteParams.none(),
        ): HttpResponseFor<TexmlApplicationDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TexmlApplicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlApplicationDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TexmlApplicationDeleteParams
        ): HttpResponseFor<TexmlApplicationDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlApplicationDeleteResponse> =
            delete(id, TexmlApplicationDeleteParams.none(), requestOptions)
    }
}
