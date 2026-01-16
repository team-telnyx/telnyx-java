// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.embeddings.EmbeddingCreateParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingListParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingListResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingRetrieveParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingRetrieveResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingSimilaritySearchParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingSimilaritySearchResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingUrlParams
import com.telnyx.sdk.services.async.ai.embeddings.BucketServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmbeddingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingServiceAsync

    fun buckets(): BucketServiceAsync

    /**
     * Perform embedding on a Telnyx Storage Bucket using the a embedding model. The current
     * supported file types are:
     * - PDF
     * - HTML
     * - txt/unstructured text files
     * - json
     * - csv
     * - audio / video (mp3, mp4, mpeg, mpga, m4a, wav, or webm ) - Max of 100mb file size.
     *
     * Any files not matching the above types will be attempted to be embedded as unstructured text.
     *
     * This process can be slow, so it runs in the background and the user can check the status of
     * the task using the endpoint `/ai/embeddings/{task_id}`.
     *
     * **Important Note**: When you update documents in a Telnyx Storage bucket, their associated
     * embeddings are automatically kept up to date. If you add or update a file, it is
     * automatically embedded. If you delete a file, the embeddings are deleted for that particular
     * file.
     *
     * You can also specify a custom `loader` param. Currently the only supported loader value is
     * `intercom` which loads Intercom article jsons as specified by
     * [the Intercom article API](https://developers.intercom.com/docs/references/rest-api/api.intercom.io/Articles/article/)
     * This loader will split each article into paragraphs and save additional parameters relevant
     * to Intercom docs, such as `article_url` and `heading`. These values will be returned by the
     * `/v2/ai/embeddings/similarity-search` endpoint in the `loader_metadata` field.
     */
    fun create(params: EmbeddingCreateParams): CompletableFuture<EmbeddingResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmbeddingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingResponse>

    /**
     * Check the status of a current embedding task. Will be one of the following:
     * - `queued` - Task is waiting to be picked up by a worker
     * - `processing` - The embedding task is running
     * - `success` - Task completed successfully and the bucket is embedded
     * - `failure` - Task failed and no files were embedded successfully
     * - `partial_success` - Some files were embedded successfully, but at least one failed
     */
    fun retrieve(taskId: String): CompletableFuture<EmbeddingRetrieveResponse> =
        retrieve(taskId, EmbeddingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: EmbeddingRetrieveParams = EmbeddingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingRetrieveResponse> =
        retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        params: EmbeddingRetrieveParams = EmbeddingRetrieveParams.none(),
    ): CompletableFuture<EmbeddingRetrieveResponse> =
        retrieve(taskId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmbeddingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: EmbeddingRetrieveParams): CompletableFuture<EmbeddingRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        taskId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingRetrieveResponse> =
        retrieve(taskId, EmbeddingRetrieveParams.none(), requestOptions)

    /**
     * Retrieve tasks for the user that are either `queued`, `processing`, `failed`, `success` or
     * `partial_success` based on the query string. Defaults to `queued` and `processing`.
     */
    fun list(): CompletableFuture<EmbeddingListResponse> = list(EmbeddingListParams.none())

    /** @see list */
    fun list(
        params: EmbeddingListParams = EmbeddingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingListResponse>

    /** @see list */
    fun list(
        params: EmbeddingListParams = EmbeddingListParams.none()
    ): CompletableFuture<EmbeddingListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmbeddingListResponse> =
        list(EmbeddingListParams.none(), requestOptions)

    /**
     * Perform a similarity search on a Telnyx Storage Bucket, returning the most similar `num_docs`
     * document chunks to the query.
     *
     * Currently the only available distance metric is cosine similarity which will return a
     * `distance` between 0 and 1. The lower the distance, the more similar the returned document
     * chunks are to the query. A `certainty` will also be returned, which is a value between 0 and
     * 1 where the higher the certainty, the more similar the document. You can read more about
     * Weaviate distance metrics here:
     * [Weaviate Docs](https://weaviate.io/developers/weaviate/config-refs/distances)
     *
     * If a bucket was embedded using a custom loader, such as `intercom`, the additional metadata
     * will be returned in the `loader_metadata` field.
     */
    fun similaritySearch(
        params: EmbeddingSimilaritySearchParams
    ): CompletableFuture<EmbeddingSimilaritySearchResponse> =
        similaritySearch(params, RequestOptions.none())

    /** @see similaritySearch */
    fun similaritySearch(
        params: EmbeddingSimilaritySearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingSimilaritySearchResponse>

    /**
     * Embed website content from a specified URL, including child pages up to 5 levels deep within
     * the same domain. The process crawls and loads content from the main URL and its linked pages
     * into a Telnyx Cloud Storage bucket. As soon as each webpage is added to the bucket, its
     * content is immediately processed for embeddings, that can be used for
     * [similarity search](https://developers.telnyx.com/api-reference/embeddings/search-for-documents)
     * and [clustering](https://developers.telnyx.com/docs/inference/clusters).
     */
    fun url(params: EmbeddingUrlParams): CompletableFuture<EmbeddingResponse> =
        url(params, RequestOptions.none())

    /** @see url */
    fun url(
        params: EmbeddingUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddingResponse>

    /**
     * A view of [EmbeddingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmbeddingServiceAsync.WithRawResponse

        fun buckets(): BucketServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/embeddings`, but is otherwise the same as
         * [EmbeddingServiceAsync.create].
         */
        fun create(
            params: EmbeddingCreateParams
        ): CompletableFuture<HttpResponseFor<EmbeddingResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmbeddingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/embeddings/{task_id}`, but is otherwise the same
         * as [EmbeddingServiceAsync.retrieve].
         */
        fun retrieve(
            taskId: String
        ): CompletableFuture<HttpResponseFor<EmbeddingRetrieveResponse>> =
            retrieve(taskId, EmbeddingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: EmbeddingRetrieveParams = EmbeddingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingRetrieveResponse>> =
            retrieve(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            params: EmbeddingRetrieveParams = EmbeddingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingRetrieveResponse>> =
            retrieve(taskId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmbeddingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmbeddingRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmbeddingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            taskId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingRetrieveResponse>> =
            retrieve(taskId, EmbeddingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/embeddings`, but is otherwise the same as
         * [EmbeddingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmbeddingListResponse>> =
            list(EmbeddingListParams.none())

        /** @see list */
        fun list(
            params: EmbeddingListParams = EmbeddingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingListResponse>>

        /** @see list */
        fun list(
            params: EmbeddingListParams = EmbeddingListParams.none()
        ): CompletableFuture<HttpResponseFor<EmbeddingListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmbeddingListResponse>> =
            list(EmbeddingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/embeddings/similarity-search`, but is otherwise
         * the same as [EmbeddingServiceAsync.similaritySearch].
         */
        fun similaritySearch(
            params: EmbeddingSimilaritySearchParams
        ): CompletableFuture<HttpResponseFor<EmbeddingSimilaritySearchResponse>> =
            similaritySearch(params, RequestOptions.none())

        /** @see similaritySearch */
        fun similaritySearch(
            params: EmbeddingSimilaritySearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingSimilaritySearchResponse>>

        /**
         * Returns a raw HTTP response for `post /ai/embeddings/url`, but is otherwise the same as
         * [EmbeddingServiceAsync.url].
         */
        fun url(params: EmbeddingUrlParams): CompletableFuture<HttpResponseFor<EmbeddingResponse>> =
            url(params, RequestOptions.none())

        /** @see url */
        fun url(
            params: EmbeddingUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddingResponse>>
    }
}
