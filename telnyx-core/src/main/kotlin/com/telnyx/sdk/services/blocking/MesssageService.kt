// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.messsages.MesssageRcsParams
import com.telnyx.sdk.models.messsages.MesssageRcsResponse
import com.telnyx.sdk.models.messsages.MesssageWhatsappParams
import com.telnyx.sdk.models.messsages.MesssageWhatsappResponse
import java.util.function.Consumer

interface MesssageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MesssageService

    /** Send an RCS message */
    fun rcs(params: MesssageRcsParams): MesssageRcsResponse = rcs(params, RequestOptions.none())

    /** @see rcs */
    fun rcs(
        params: MesssageRcsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MesssageRcsResponse

    /** Send a Whatsapp message */
    fun whatsapp(params: MesssageWhatsappParams): MesssageWhatsappResponse =
        whatsapp(params, RequestOptions.none())

    /** @see whatsapp */
    fun whatsapp(
        params: MesssageWhatsappParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MesssageWhatsappResponse

    /** A view of [MesssageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MesssageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /messsages/rcs`, but is otherwise the same as
         * [MesssageService.rcs].
         */
        @MustBeClosed
        fun rcs(params: MesssageRcsParams): HttpResponseFor<MesssageRcsResponse> =
            rcs(params, RequestOptions.none())

        /** @see rcs */
        @MustBeClosed
        fun rcs(
            params: MesssageRcsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MesssageRcsResponse>

        /**
         * Returns a raw HTTP response for `post /messsages/whatsapp`, but is otherwise the same as
         * [MesssageService.whatsapp].
         */
        @MustBeClosed
        fun whatsapp(params: MesssageWhatsappParams): HttpResponseFor<MesssageWhatsappResponse> =
            whatsapp(params, RequestOptions.none())

        /** @see whatsapp */
        @MustBeClosed
        fun whatsapp(
            params: MesssageWhatsappParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MesssageWhatsappResponse>
    }
}
