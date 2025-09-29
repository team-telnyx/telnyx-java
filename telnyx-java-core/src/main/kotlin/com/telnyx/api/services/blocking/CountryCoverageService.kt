// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveCountryParams
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveCountryResponse
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveParams
import com.telnyx.api.models.countrycoverage.CountryCoverageRetrieveResponse
import java.util.function.Consumer

interface CountryCoverageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CountryCoverageService

    /** Get country coverage */
    fun retrieve(): CountryCoverageRetrieveResponse = retrieve(CountryCoverageRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryCoverageRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none()
    ): CountryCoverageRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CountryCoverageRetrieveResponse =
        retrieve(CountryCoverageRetrieveParams.none(), requestOptions)

    /** Get coverage for a specific country */
    fun retrieveCountry(countryCode: String): CountryCoverageRetrieveCountryResponse =
        retrieveCountry(countryCode, CountryCoverageRetrieveCountryParams.none())

    /** @see retrieveCountry */
    fun retrieveCountry(
        countryCode: String,
        params: CountryCoverageRetrieveCountryParams = CountryCoverageRetrieveCountryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryCoverageRetrieveCountryResponse =
        retrieveCountry(params.toBuilder().countryCode(countryCode).build(), requestOptions)

    /** @see retrieveCountry */
    fun retrieveCountry(
        countryCode: String,
        params: CountryCoverageRetrieveCountryParams = CountryCoverageRetrieveCountryParams.none(),
    ): CountryCoverageRetrieveCountryResponse =
        retrieveCountry(countryCode, params, RequestOptions.none())

    /** @see retrieveCountry */
    fun retrieveCountry(
        params: CountryCoverageRetrieveCountryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CountryCoverageRetrieveCountryResponse

    /** @see retrieveCountry */
    fun retrieveCountry(
        params: CountryCoverageRetrieveCountryParams
    ): CountryCoverageRetrieveCountryResponse = retrieveCountry(params, RequestOptions.none())

    /** @see retrieveCountry */
    fun retrieveCountry(
        countryCode: String,
        requestOptions: RequestOptions,
    ): CountryCoverageRetrieveCountryResponse =
        retrieveCountry(countryCode, CountryCoverageRetrieveCountryParams.none(), requestOptions)

    /**
     * A view of [CountryCoverageService] that provides access to raw HTTP responses for each
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
        ): CountryCoverageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /country_coverage`, but is otherwise the same as
         * [CountryCoverageService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<CountryCoverageRetrieveResponse> =
            retrieve(CountryCoverageRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryCoverageRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CountryCoverageRetrieveParams = CountryCoverageRetrieveParams.none()
        ): HttpResponseFor<CountryCoverageRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): HttpResponseFor<CountryCoverageRetrieveResponse> =
            retrieve(CountryCoverageRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /country_coverage/countries/{country_code}`, but is
         * otherwise the same as [CountryCoverageService.retrieveCountry].
         */
        @MustBeClosed
        fun retrieveCountry(
            countryCode: String
        ): HttpResponseFor<CountryCoverageRetrieveCountryResponse> =
            retrieveCountry(countryCode, CountryCoverageRetrieveCountryParams.none())

        /** @see retrieveCountry */
        @MustBeClosed
        fun retrieveCountry(
            countryCode: String,
            params: CountryCoverageRetrieveCountryParams =
                CountryCoverageRetrieveCountryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryCoverageRetrieveCountryResponse> =
            retrieveCountry(params.toBuilder().countryCode(countryCode).build(), requestOptions)

        /** @see retrieveCountry */
        @MustBeClosed
        fun retrieveCountry(
            countryCode: String,
            params: CountryCoverageRetrieveCountryParams =
                CountryCoverageRetrieveCountryParams.none(),
        ): HttpResponseFor<CountryCoverageRetrieveCountryResponse> =
            retrieveCountry(countryCode, params, RequestOptions.none())

        /** @see retrieveCountry */
        @MustBeClosed
        fun retrieveCountry(
            params: CountryCoverageRetrieveCountryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CountryCoverageRetrieveCountryResponse>

        /** @see retrieveCountry */
        @MustBeClosed
        fun retrieveCountry(
            params: CountryCoverageRetrieveCountryParams
        ): HttpResponseFor<CountryCoverageRetrieveCountryResponse> =
            retrieveCountry(params, RequestOptions.none())

        /** @see retrieveCountry */
        @MustBeClosed
        fun retrieveCountry(
            countryCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CountryCoverageRetrieveCountryResponse> =
            retrieveCountry(
                countryCode,
                CountryCoverageRetrieveCountryParams.none(),
                requestOptions,
            )
    }
}
