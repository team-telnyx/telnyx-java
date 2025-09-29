// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texml.TexmlSecretsParams
import com.telnyx.api.models.texml.TexmlSecretsResponse
import com.telnyx.api.services.blocking.texml.AccountService
import com.telnyx.api.services.blocking.texml.CallService
import java.util.function.Consumer

interface TexmlService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlService

    fun accounts(): AccountService

    fun calls(): CallService

    /**
     * Create a TeXML secret which can be later used as a Dynamic Parameter for TeXML when using
     * Mustache Templates in your TeXML. In your TeXML you will be able to use your secret name, and
     * this name will be replaced by the actual secret value when processing the TeXML on Telnyx
     * side. The secrets are not visible in any logs.
     */
    fun secrets(params: TexmlSecretsParams): TexmlSecretsResponse =
        secrets(params, RequestOptions.none())

    /** @see secrets */
    fun secrets(
        params: TexmlSecretsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TexmlSecretsResponse

    /** A view of [TexmlService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TexmlService.WithRawResponse

        fun accounts(): AccountService.WithRawResponse

        fun calls(): CallService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /texml/secrets`, but is otherwise the same as
         * [TexmlService.secrets].
         */
        @MustBeClosed
        fun secrets(params: TexmlSecretsParams): HttpResponseFor<TexmlSecretsResponse> =
            secrets(params, RequestOptions.none())

        /** @see secrets */
        @MustBeClosed
        fun secrets(
            params: TexmlSecretsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TexmlSecretsResponse>
    }
}
