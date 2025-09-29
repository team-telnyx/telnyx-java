// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.buckets

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateResponse
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateDeleteParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateDeleteResponse
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateRetrieveParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateRetrieveResponse
import java.util.function.Consumer

interface SslCertificateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SslCertificateService

    /**
     * Uploads an SSL certificate and its matching secret so that you can use Telnyx’s storage as
     * your CDN.
     */
    fun create(bucketName: String): SslCertificateCreateResponse =
        create(bucketName, SslCertificateCreateParams.none())

    /** @see create */
    fun create(
        bucketName: String,
        params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SslCertificateCreateResponse =
        create(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see create */
    fun create(
        bucketName: String,
        params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
    ): SslCertificateCreateResponse = create(bucketName, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SslCertificateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SslCertificateCreateResponse

    /** @see create */
    fun create(params: SslCertificateCreateParams): SslCertificateCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(bucketName: String, requestOptions: RequestOptions): SslCertificateCreateResponse =
        create(bucketName, SslCertificateCreateParams.none(), requestOptions)

    /** Returns the stored certificate detail of a bucket, if applicable. */
    fun retrieve(bucketName: String): SslCertificateRetrieveResponse =
        retrieve(bucketName, SslCertificateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SslCertificateRetrieveResponse =
        retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
    ): SslCertificateRetrieveResponse = retrieve(bucketName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SslCertificateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SslCertificateRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SslCertificateRetrieveParams): SslCertificateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        requestOptions: RequestOptions,
    ): SslCertificateRetrieveResponse =
        retrieve(bucketName, SslCertificateRetrieveParams.none(), requestOptions)

    /** Deletes an SSL certificate and its matching secret. */
    fun delete(bucketName: String): SslCertificateDeleteResponse =
        delete(bucketName, SslCertificateDeleteParams.none())

    /** @see delete */
    fun delete(
        bucketName: String,
        params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SslCertificateDeleteResponse =
        delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see delete */
    fun delete(
        bucketName: String,
        params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
    ): SslCertificateDeleteResponse = delete(bucketName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SslCertificateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SslCertificateDeleteResponse

    /** @see delete */
    fun delete(params: SslCertificateDeleteParams): SslCertificateDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(bucketName: String, requestOptions: RequestOptions): SslCertificateDeleteResponse =
        delete(bucketName, SslCertificateDeleteParams.none(), requestOptions)

    /**
     * A view of [SslCertificateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SslCertificateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /storage/buckets/{bucketName}/ssl_certificate`, but
         * is otherwise the same as [SslCertificateService.create].
         */
        @MustBeClosed
        fun create(bucketName: String): HttpResponseFor<SslCertificateCreateResponse> =
            create(bucketName, SslCertificateCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            bucketName: String,
            params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SslCertificateCreateResponse> =
            create(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            bucketName: String,
            params: SslCertificateCreateParams = SslCertificateCreateParams.none(),
        ): HttpResponseFor<SslCertificateCreateResponse> =
            create(bucketName, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SslCertificateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SslCertificateCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: SslCertificateCreateParams
        ): HttpResponseFor<SslCertificateCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            bucketName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SslCertificateCreateResponse> =
            create(bucketName, SslCertificateCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /storage/buckets/{bucketName}/ssl_certificate`, but
         * is otherwise the same as [SslCertificateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(bucketName: String): HttpResponseFor<SslCertificateRetrieveResponse> =
            retrieve(bucketName, SslCertificateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bucketName: String,
            params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SslCertificateRetrieveResponse> =
            retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bucketName: String,
            params: SslCertificateRetrieveParams = SslCertificateRetrieveParams.none(),
        ): HttpResponseFor<SslCertificateRetrieveResponse> =
            retrieve(bucketName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SslCertificateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SslCertificateRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SslCertificateRetrieveParams
        ): HttpResponseFor<SslCertificateRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bucketName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SslCertificateRetrieveResponse> =
            retrieve(bucketName, SslCertificateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /storage/buckets/{bucketName}/ssl_certificate`,
         * but is otherwise the same as [SslCertificateService.delete].
         */
        @MustBeClosed
        fun delete(bucketName: String): HttpResponseFor<SslCertificateDeleteResponse> =
            delete(bucketName, SslCertificateDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            bucketName: String,
            params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SslCertificateDeleteResponse> =
            delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            bucketName: String,
            params: SslCertificateDeleteParams = SslCertificateDeleteParams.none(),
        ): HttpResponseFor<SslCertificateDeleteResponse> =
            delete(bucketName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SslCertificateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SslCertificateDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SslCertificateDeleteParams
        ): HttpResponseFor<SslCertificateDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            bucketName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SslCertificateDeleteResponse> =
            delete(bucketName, SslCertificateDeleteParams.none(), requestOptions)
    }
}
