// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.sessionanalysis

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveParams
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveRecordTypeParams
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveRecordTypeResponse
import com.telnyx.sdk.models.sessionanalysis.metadata.MetadataRetrieveResponse
import java.util.function.Consumer

/** Analyze voice AI sessions, costs, and event hierarchies across Telnyx products. */
interface MetadataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetadataService

    /** Returns all available record types and supported query parameters for session analysis. */
    fun retrieve(): MetadataRetrieveResponse = retrieve(MetadataRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: MetadataRetrieveParams = MetadataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetadataRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: MetadataRetrieveParams = MetadataRetrieveParams.none()
    ): MetadataRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): MetadataRetrieveResponse =
        retrieve(MetadataRetrieveParams.none(), requestOptions)

    /**
     * Returns detailed metadata for a specific record type, including relationships and examples.
     */
    fun retrieveRecordType(recordType: String): MetadataRetrieveRecordTypeResponse =
        retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none())

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        recordType: String,
        params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetadataRetrieveRecordTypeResponse =
        retrieveRecordType(params.toBuilder().recordType(recordType).build(), requestOptions)

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        recordType: String,
        params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
    ): MetadataRetrieveRecordTypeResponse =
        retrieveRecordType(recordType, params, RequestOptions.none())

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        params: MetadataRetrieveRecordTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MetadataRetrieveRecordTypeResponse

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        params: MetadataRetrieveRecordTypeParams
    ): MetadataRetrieveRecordTypeResponse = retrieveRecordType(params, RequestOptions.none())

    /** @see retrieveRecordType */
    fun retrieveRecordType(
        recordType: String,
        requestOptions: RequestOptions,
    ): MetadataRetrieveRecordTypeResponse =
        retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none(), requestOptions)

    /** A view of [MetadataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetadataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /session_analysis/metadata`, but is otherwise the
         * same as [MetadataService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<MetadataRetrieveResponse> =
            retrieve(MetadataRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MetadataRetrieveParams = MetadataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetadataRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: MetadataRetrieveParams = MetadataRetrieveParams.none()
        ): HttpResponseFor<MetadataRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<MetadataRetrieveResponse> =
            retrieve(MetadataRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /session_analysis/metadata/{record_type}`, but is
         * otherwise the same as [MetadataService.retrieveRecordType].
         */
        @MustBeClosed
        fun retrieveRecordType(
            recordType: String
        ): HttpResponseFor<MetadataRetrieveRecordTypeResponse> =
            retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none())

        /** @see retrieveRecordType */
        @MustBeClosed
        fun retrieveRecordType(
            recordType: String,
            params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetadataRetrieveRecordTypeResponse> =
            retrieveRecordType(params.toBuilder().recordType(recordType).build(), requestOptions)

        /** @see retrieveRecordType */
        @MustBeClosed
        fun retrieveRecordType(
            recordType: String,
            params: MetadataRetrieveRecordTypeParams = MetadataRetrieveRecordTypeParams.none(),
        ): HttpResponseFor<MetadataRetrieveRecordTypeResponse> =
            retrieveRecordType(recordType, params, RequestOptions.none())

        /** @see retrieveRecordType */
        @MustBeClosed
        fun retrieveRecordType(
            params: MetadataRetrieveRecordTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MetadataRetrieveRecordTypeResponse>

        /** @see retrieveRecordType */
        @MustBeClosed
        fun retrieveRecordType(
            params: MetadataRetrieveRecordTypeParams
        ): HttpResponseFor<MetadataRetrieveRecordTypeResponse> =
            retrieveRecordType(params, RequestOptions.none())

        /** @see retrieveRecordType */
        @MustBeClosed
        fun retrieveRecordType(
            recordType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MetadataRetrieveRecordTypeResponse> =
            retrieveRecordType(recordType, MetadataRetrieveRecordTypeParams.none(), requestOptions)
    }
}
