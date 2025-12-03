// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.buckets

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateResponse
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateDeleteParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateDeleteResponse
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateRetrieveParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SslCertificateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SslCertificateServiceAsync

    /**
     * Uploads an SSL certificate and its matching secret so that you can use Telnyx's storage as
     * your CDN.
     */
    fun create(bucketName: String): CompletableFuture<SslCertificateCreateResponse> =
        create(bucketName, SslCertificateCreateParams.none())

    /** @see create */
    fun create(
        bucketName: String,
        params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SslCertificateCreateResponse> =
        create(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see create */
    fun create(
        bucketName: String,
        params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
    ): CompletableFuture<SslCertificateCreateResponse> =
        create(bucketName, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SslCertificateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SslCertificateCreateResponse>

    /** @see create */
    fun create(
        params: SslCertificateCreateParams
    ): CompletableFuture<SslCertificateCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        bucketName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SslCertificateCreateResponse> =
        create(bucketName, SslCertificateCreateParams.none(), requestOptions)

    /** Returns the stored certificate detail of a bucket, if applicable. */
    fun retrieve(bucketName: String): CompletableFuture<SslCertificateRetrieveResponse> =
        retrieve(bucketName, SslCertificateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SslCertificateRetrieveResponse> =
        retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
    ): CompletableFuture<SslCertificateRetrieveResponse> =
        retrieve(bucketName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SslCertificateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SslCertificateRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SslCertificateRetrieveParams
    ): CompletableFuture<SslCertificateRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SslCertificateRetrieveResponse> =
        retrieve(bucketName, SslCertificateRetrieveParams.none(), requestOptions)

    /** Deletes an SSL certificate and its matching secret. */
    fun delete(bucketName: String): CompletableFuture<SslCertificateDeleteResponse> =
        delete(bucketName, SslCertificateDeleteParams.none())

    /** @see delete */
    fun delete(
        bucketName: String,
        params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SslCertificateDeleteResponse> =
        delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see delete */
    fun delete(
        bucketName: String,
        params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
    ): CompletableFuture<SslCertificateDeleteResponse> =
        delete(bucketName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SslCertificateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SslCertificateDeleteResponse>

    /** @see delete */
    fun delete(
        params: SslCertificateDeleteParams
    ): CompletableFuture<SslCertificateDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        bucketName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SslCertificateDeleteResponse> =
        delete(bucketName, SslCertificateDeleteParams.none(), requestOptions)

    /**
     * A view of [SslCertificateServiceAsync] that provides access to raw HTTP responses for each
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
        ): SslCertificateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /storage/buckets/{bucketName}/ssl_certificate`, but
         * is otherwise the same as [SslCertificateServiceAsync.create].
         */
        fun create(
            bucketName: String
        ): CompletableFuture<HttpResponseFor<SslCertificateCreateResponse>> =
            create(bucketName, SslCertificateCreateParams.none())

        /** @see create */
        fun create(
            bucketName: String,
            params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateCreateResponse>> =
            create(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see create */
        fun create(
            bucketName: String,
            params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateCreateResponse>> =
            create(bucketName, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SslCertificateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateCreateResponse>>

        /** @see create */
        fun create(
            params: SslCertificateCreateParams
        ): CompletableFuture<HttpResponseFor<SslCertificateCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            bucketName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SslCertificateCreateResponse>> =
            create(bucketName, SslCertificateCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/buckets/{bucketName}/ssl_certificate`, but
         * is otherwise the same as [SslCertificateServiceAsync.retrieve].
         */
        fun retrieve(
            bucketName: String
        ): CompletableFuture<HttpResponseFor<SslCertificateRetrieveResponse>> =
            retrieve(bucketName, SslCertificateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            bucketName: String,
            params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateRetrieveResponse>> =
            retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            bucketName: String,
            params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateRetrieveResponse>> =
            retrieve(bucketName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SslCertificateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SslCertificateRetrieveParams
        ): CompletableFuture<HttpResponseFor<SslCertificateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            bucketName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SslCertificateRetrieveResponse>> =
            retrieve(bucketName, SslCertificateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/buckets/{bucketName}/ssl_certificate`,
         * but is otherwise the same as [SslCertificateServiceAsync.delete].
         */
        fun delete(
            bucketName: String
        ): CompletableFuture<HttpResponseFor<SslCertificateDeleteResponse>> =
            delete(bucketName, SslCertificateDeleteParams.none())

        /** @see delete */
        fun delete(
            bucketName: String,
            params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateDeleteResponse>> =
            delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see delete */
        fun delete(
            bucketName: String,
            params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateDeleteResponse>> =
            delete(bucketName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SslCertificateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SslCertificateDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SslCertificateDeleteParams
        ): CompletableFuture<HttpResponseFor<SslCertificateDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            bucketName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SslCertificateDeleteResponse>> =
            delete(bucketName, SslCertificateDeleteParams.none(), requestOptions)
    }
}
