// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.templates.TemplateCreateParams
import com.telnyx.sdk.models.whatsapp.templates.TemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.templates.TemplateListPage
import com.telnyx.sdk.models.whatsapp.templates.TemplateListParams
import java.util.function.Consumer

/** Manage Whatsapp message templates */
interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /** Create a Whatsapp message template */
    fun create(params: TemplateCreateParams): TemplateCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateCreateResponse

    /** List Whatsapp message templates */
    fun list(): TemplateListPage = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateListPage

    /** @see list */
    fun list(params: TemplateListParams = TemplateListParams.none()): TemplateListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TemplateListPage =
        list(TemplateListParams.none(), requestOptions)

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/message_templates`, but is otherwise
         * the same as [TemplateService.create].
         */
        @MustBeClosed
        fun create(params: TemplateCreateParams): HttpResponseFor<TemplateCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/message_templates`, but is otherwise
         * the same as [TemplateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TemplateListPage> = list(TemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams = TemplateListParams.none()
        ): HttpResponseFor<TemplateListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TemplateListPage> =
            list(TemplateListParams.none(), requestOptions)
    }
}
