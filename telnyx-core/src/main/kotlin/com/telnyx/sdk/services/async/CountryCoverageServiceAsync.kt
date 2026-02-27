// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveCountryParams
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveCountryResponse
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveParams
import com.telnyx.sdk.models.countrycoverage.CountryCoverageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Country Coverage */
interface CountryCoverageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryCoverageServiceAsync

    /** Get country coverage */
    fun retrieve(): CompletableFuture<CountryCoverageRetrieveResponse> =
        retrieve(CountryCoverageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryCoverageRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none()
    ): CompletableFuture<CountryCoverageRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        requestOptions: RequestOptions
    ): CompletableFuture<CountryCoverageRetrieveResponse> =
        retrieve(CountryCoverageRetrieveParams.none(), requestOptions)

    /** Get coverage for a specific country */
    fun retrieveCountry(
        countryCode: String
    ): CompletableFuture<CountryCoverageRetrieveCountryResponse> =
        retrieveCountry(countryCode, CountryCoverageRetrieveCountryParams.none())

    /** @see retrieveCountry */
    fun retrieveCountry(
        countryCode: String,
        params: CountryCoverageRetrieveCountryParams = CountryCoverageRetrieveCountryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryCoverageRetrieveCountryResponse> =
        retrieveCountry(params.toBuilder().countryCode(countryCode).build(), requestOptions)

    /** @see retrieveCountry */
    fun retrieveCountry(
        countryCode: String,
        params: CountryCoverageRetrieveCountryParams = CountryCoverageRetrieveCountryParams.none(),
    ): CompletableFuture<CountryCoverageRetrieveCountryResponse> =
        retrieveCountry(countryCode, params, RequestOptions.none())

    /** @see retrieveCountry */
    fun retrieveCountry(
        params: CountryCoverageRetrieveCountryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CountryCoverageRetrieveCountryResponse>

    /** @see retrieveCountry */
    fun retrieveCountry(
        params: CountryCoverageRetrieveCountryParams
    ): CompletableFuture<CountryCoverageRetrieveCountryResponse> =
        retrieveCountry(params, RequestOptions.none())

    /** @see retrieveCountry */
    fun retrieveCountry(
        countryCode: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CountryCoverageRetrieveCountryResponse> =
        retrieveCountry(countryCode, CountryCoverageRetrieveCountryParams.none(), requestOptions)

    /**
     * A view of [CountryCoverageServiceAsync] that provides access to raw HTTP responses for each
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
        ): CountryCoverageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /country_coverage`, but is otherwise the same as
         * [CountryCoverageServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveResponse>> =
            retrieve(CountryCoverageRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveResponse>> =
            retrieve(CountryCoverageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /country_coverage/countries/{country_code}`, but is
         * otherwise the same as [CountryCoverageServiceAsync.retrieveCountry].
         */
        fun retrieveCountry(
            countryCode: String
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveCountryResponse>> =
            retrieveCountry(countryCode, CountryCoverageRetrieveCountryParams.none())

        /** @see retrieveCountry */
        fun retrieveCountry(
            countryCode: String,
            params: CountryCoverageRetrieveCountryParams =
                CountryCoverageRetrieveCountryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveCountryResponse>> =
            retrieveCountry(params.toBuilder().countryCode(countryCode).build(), requestOptions)

        /** @see retrieveCountry */
        fun retrieveCountry(
            countryCode: String,
            params: CountryCoverageRetrieveCountryParams =
                CountryCoverageRetrieveCountryParams.none(),
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveCountryResponse>> =
            retrieveCountry(countryCode, params, RequestOptions.none())

        /** @see retrieveCountry */
        fun retrieveCountry(
            params: CountryCoverageRetrieveCountryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveCountryResponse>>

        /** @see retrieveCountry */
        fun retrieveCountry(
            params: CountryCoverageRetrieveCountryParams
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveCountryResponse>> =
            retrieveCountry(params, RequestOptions.none())

        /** @see retrieveCountry */
        fun retrieveCountry(
            countryCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CountryCoverageRetrieveCountryResponse>> =
            retrieveCountry(
                countryCode,
                CountryCoverageRetrieveCountryParams.none(),
                requestOptions,
            )
    }
}
