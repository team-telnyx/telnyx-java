// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictCreateParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictCreateResponse
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictDeleteParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictListPageAsync
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictListParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictRetrieveParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictRetrieveResponse
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictUpdateParams
import com.telnyx.sdk.models.pronunciationdicts.PronunciationDictUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Manage pronunciation dictionaries for text-to-speech synthesis. Dictionaries contain alias items
 * (text replacement) and phoneme items (IPA pronunciation notation) that control how specific words
 * are spoken.
 */
interface PronunciationDictServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PronunciationDictServiceAsync

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
    fun create(
        params: PronunciationDictCreateParams
    ): CompletableFuture<PronunciationDictCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PronunciationDictCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PronunciationDictCreateResponse>

    /** Retrieve a single pronunciation dictionary by ID. */
    fun retrieve(id: String): CompletableFuture<PronunciationDictRetrieveResponse> =
        retrieve(id, PronunciationDictRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PronunciationDictRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
    ): CompletableFuture<PronunciationDictRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PronunciationDictRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PronunciationDictRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PronunciationDictRetrieveParams
    ): CompletableFuture<PronunciationDictRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PronunciationDictRetrieveResponse> =
        retrieve(id, PronunciationDictRetrieveParams.none(), requestOptions)

    /**
     * Update the name and/or items of an existing pronunciation dictionary. Uses optimistic locking
     * — if the dictionary was modified concurrently, the request returns 409 Conflict.
     */
    fun update(id: String): CompletableFuture<PronunciationDictUpdateResponse> =
        update(id, PronunciationDictUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PronunciationDictUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
    ): CompletableFuture<PronunciationDictUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PronunciationDictUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PronunciationDictUpdateResponse>

    /** @see update */
    fun update(
        params: PronunciationDictUpdateParams
    ): CompletableFuture<PronunciationDictUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PronunciationDictUpdateResponse> =
        update(id, PronunciationDictUpdateParams.none(), requestOptions)

    /**
     * List all pronunciation dictionaries for the authenticated organization. Results are paginated
     * using offset-based pagination.
     */
    fun list(): CompletableFuture<PronunciationDictListPageAsync> =
        list(PronunciationDictListParams.none())

    /** @see list */
    fun list(
        params: PronunciationDictListParams = PronunciationDictListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PronunciationDictListPageAsync>

    /** @see list */
    fun list(
        params: PronunciationDictListParams = PronunciationDictListParams.none()
    ): CompletableFuture<PronunciationDictListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PronunciationDictListPageAsync> =
        list(PronunciationDictListParams.none(), requestOptions)

    /** Permanently delete a pronunciation dictionary. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, PronunciationDictDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PronunciationDictDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PronunciationDictDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, PronunciationDictDeleteParams.none(), requestOptions)

    /**
     * A view of [PronunciationDictServiceAsync] that provides access to raw HTTP responses for each
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
        ): PronunciationDictServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pronunciation_dicts`, but is otherwise the same as
         * [PronunciationDictServiceAsync.create].
         */
        fun create(
            params: PronunciationDictCreateParams
        ): CompletableFuture<HttpResponseFor<PronunciationDictCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PronunciationDictCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /pronunciation_dicts/{id}`, but is otherwise the
         * same as [PronunciationDictServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<PronunciationDictRetrieveResponse>> =
            retrieve(id, PronunciationDictRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PronunciationDictRetrieveParams = PronunciationDictRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PronunciationDictRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PronunciationDictRetrieveParams
        ): CompletableFuture<HttpResponseFor<PronunciationDictRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PronunciationDictRetrieveResponse>> =
            retrieve(id, PronunciationDictRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /pronunciation_dicts/{id}`, but is otherwise the
         * same as [PronunciationDictServiceAsync.update].
         */
        fun update(
            id: String
        ): CompletableFuture<HttpResponseFor<PronunciationDictUpdateResponse>> =
            update(id, PronunciationDictUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: PronunciationDictUpdateParams = PronunciationDictUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PronunciationDictUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictUpdateResponse>>

        /** @see update */
        fun update(
            params: PronunciationDictUpdateParams
        ): CompletableFuture<HttpResponseFor<PronunciationDictUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PronunciationDictUpdateResponse>> =
            update(id, PronunciationDictUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pronunciation_dicts`, but is otherwise the same as
         * [PronunciationDictServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PronunciationDictListPageAsync>> =
            list(PronunciationDictListParams.none())

        /** @see list */
        fun list(
            params: PronunciationDictListParams = PronunciationDictListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PronunciationDictListPageAsync>>

        /** @see list */
        fun list(
            params: PronunciationDictListParams = PronunciationDictListParams.none()
        ): CompletableFuture<HttpResponseFor<PronunciationDictListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PronunciationDictListPageAsync>> =
            list(PronunciationDictListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /pronunciation_dicts/{id}`, but is otherwise the
         * same as [PronunciationDictServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, PronunciationDictDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PronunciationDictDeleteParams = PronunciationDictDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PronunciationDictDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PronunciationDictDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, PronunciationDictDeleteParams.none(), requestOptions)
    }
}
