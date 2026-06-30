// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.sessionanalysis

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveParams
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveRecordTypeParams
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveRecordTypeResponse
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
interface MetadataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetadataServiceAsync

    /** Returns all available record types and supported query parameters for session analysis. */
    fun retrieve(): CompletableFuture<MetadataRetrieveResponse> =
        retrieve(MetadataRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: MetadataRetrieveParams = MetadataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetadataRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: MetadataRetrieveParams = MetadataRetrieveParams.none()
    ): CompletableFuture<MetadataRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<MetadataRetrieveResponse> =
        retrieve(MetadataRetrieveParams.none(), requestOptions)

    /**
     * Returns detailed metadata for a specific record type, including relationships and examples.
     */
    fun retrieveRecordType(
        recordType: String
    ): CompletableFuture<MetadataRetrieveRecordTypeResponse> =
        retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none())

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        recordType: String,
        params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetadataRetrieveRecordTypeResponse> =
        retrieveRecordType(params.toBuilder().recordType(recordType).build(), requestOptions)

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        recordType: String,
        params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
    ): CompletableFuture<MetadataRetrieveRecordTypeResponse> =
        retrieveRecordType(recordType, params, RequestOptions.none())

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        params: MetadataRetrieveRecordTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MetadataRetrieveRecordTypeResponse>

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        params: MetadataRetrieveRecordTypeParams
    ): CompletableFuture<MetadataRetrieveRecordTypeResponse> =
        retrieveRecordType(params, RequestOptions.none())

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        recordType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MetadataRetrieveRecordTypeResponse> =
        retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none(), requestOptions)

    /**
     * A view of [MetadataServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetadataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /session_analysis/metadata`, but is otherwise the
         * same as [MetadataServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<MetadataRetrieveResponse>> =
            retrieve(MetadataRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: MetadataRetrieveParams = MetadataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: MetadataRetrieveParams = MetadataRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveResponse>> =
            retrieve(MetadataRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /session_analysis/metadata/{record_type}`, but is
         * otherwise the same as [MetadataServiceAsync.retrieveRecordType].
         */
        fun retrieveRecordType(
            recordType: String
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveRecordTypeResponse>> =
            retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none())

        /** @see retrieveRecordType */
        fun retrieveRecordType(
            recordType: String,
            params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveRecordTypeResponse>> =
            retrieveRecordType(params.toBuilder().recordType(recordType).build(), requestOptions)

        /** @see retrieveRecordType */
        fun retrieveRecordType(
            recordType: String,
            params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveRecordTypeResponse>> =
            retrieveRecordType(recordType, params, RequestOptions.none())

        /** @see retrieveRecordType */
        fun retrieveRecordType(
            params: MetadataRetrieveRecordTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveRecordTypeResponse>>

        /** @see retrieveRecordType */
        fun retrieveRecordType(
            params: MetadataRetrieveRecordTypeParams
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveRecordTypeResponse>> =
            retrieveRecordType(params, RequestOptions.none())

        /** @see retrieveRecordType */
        fun retrieveRecordType(
            recordType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MetadataRetrieveRecordTypeResponse>> =
            retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none(), requestOptions)
    }
}
