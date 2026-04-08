// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictCreateParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictCreateResponse
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictDeleteParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictListPage
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictListParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictRetrieveParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictRetrieveResponse
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictUpdateParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictUpdateResponse
import java.util.function.Consumer

/**
 * Manage pronunciation dictionaries for text-to-speech synthesis. Dictionaries contain alias items
 * (text replacement) and phoneme items (IPA pronunciation notation) that control how specific words
 * are spoken.
 */
interface PronunciationDictService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PronunciationDictService

    /**
     * Create a new pronunciation dictionary for the authenticated organization. Each dictionary
     * contains a list of items that control how specific words are spoken. Items can be alias type
     * (text replacement) or phoneme type (IPA pronunciation notation).
     *
     * As an alternative to providing items directly as JSON, you can upload a dictionary file
     * (PLS/XML or plain text format, max 1MB) using multipart/form-data. PLS files use the standard
     * W3C Pronunciation Lexicon Specification XML format. Text files use a line-based format:
     * `word=alias` for aliases, `word:/phoneme/` for IPA phonemes.
     *
     * Limits:
     * - Maximum 50 dictionaries per organization
     * - Maximum 100 items per dictionary
     * - Text: max 200 characters
     * - Alias/phoneme value: max 500 characters
     * - File upload: max 1MB (1,048,576 bytes)
     */
    fun create(params: PronunciationDictCreateParams): PronunciationDictCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PronunciationDictCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PronunciationDictCreateResponse

    /** Retrieve a single pronunciation dictionary by ID. */
    fun retrieve(id: String): PronunciationDictRetrieveResponse =
        retrieve(id, PronunciationDictRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PronunciationDictRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
    ): PronunciationDictRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PronunciationDictRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PronunciationDictRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PronunciationDictRetrieveParams): PronunciationDictRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PronunciationDictRetrieveResponse =
        retrieve(id, PronunciationDictRetrieveParams.none(), requestOptions)

    /**
     * Update the name and/or items of an existing pronunciation dictionary. Uses optimistic locking
     * — if the dictionary was modified concurrently, the request returns 409 Conflict.
     */
    fun update(id: String): PronunciationDictUpdateResponse =
        update(id, PronunciationDictUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PronunciationDictUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
    ): PronunciationDictUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PronunciationDictUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PronunciationDictUpdateResponse

    /** @see update */
    fun update(params: PronunciationDictUpdateParams): PronunciationDictUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): PronunciationDictUpdateResponse =
        update(id, PronunciationDictUpdateParams.none(), requestOptions)

    /**
     * List all pronunciation dictionaries for the authenticated organization. Results are paginated
     * using offset-based pagination.
     */
    fun list(): PronunciationDictListPage = list(PronunciationDictListParams.none())

    /** @see list */
    fun list(
        params: PronunciationDictListParams = PronunciationDictListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PronunciationDictListPage

    /** @see list */
    fun list(
        params: PronunciationDictListParams = PronunciationDictListParams.none()
    ): PronunciationDictListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PronunciationDictListPage =
        list(PronunciationDictListParams.none(), requestOptions)

    /** Permanently delete a pronunciation dictionary. */
    fun delete(id: String) = delete(id, PronunciationDictDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PronunciationDictDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: PronunciationDictDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, PronunciationDictDeleteParams.none(), requestOptions)

    /**
     * A view of [PronunciationDictService] that provides access to raw HTTP responses for each
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
        ): PronunciationDictService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pronunciation_dicts`, but is otherwise the same as
         * [PronunciationDictService.create].
         */
        @MustBeClosed
        fun create(
            params: PronunciationDictCreateParams
        ): HttpResponseFor<PronunciationDictCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PronunciationDictCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PronunciationDictCreateResponse>

        /**
         * Returns a raw HTTP response for `get /pronunciation_dicts/{id}`, but is otherwise the
         * same as [PronunciationDictService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PronunciationDictRetrieveResponse> =
            retrieve(id, PronunciationDictRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PronunciationDictRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
        ): HttpResponseFor<PronunciationDictRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PronunciationDictRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PronunciationDictRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PronunciationDictRetrieveParams
        ): HttpResponseFor<PronunciationDictRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PronunciationDictRetrieveResponse> =
            retrieve(id, PronunciationDictRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /pronunciation_dicts/{id}`, but is otherwise the
         * same as [PronunciationDictService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<PronunciationDictUpdateResponse> =
            update(id, PronunciationDictUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PronunciationDictUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
        ): HttpResponseFor<PronunciationDictUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PronunciationDictUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PronunciationDictUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            params: PronunciationDictUpdateParams
        ): HttpResponseFor<PronunciationDictUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PronunciationDictUpdateResponse> =
            update(id, PronunciationDictUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pronunciation_dicts`, but is otherwise the same as
         * [PronunciationDictService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PronunciationDictListPage> =
            list(PronunciationDictListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PronunciationDictListParams = PronunciationDictListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PronunciationDictListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PronunciationDictListParams = PronunciationDictListParams.none()
        ): HttpResponseFor<PronunciationDictListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PronunciationDictListPage> =
            list(PronunciationDictListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /pronunciation_dicts/{id}`, but is otherwise the
         * same as [PronunciationDictService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, PronunciationDictDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PronunciationDictDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PronunciationDictDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, PronunciationDictDeleteParams.none(), requestOptions)
    }
}
