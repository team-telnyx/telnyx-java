// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.whatsapp.templates.TemplateCreateParams
import com.telnyx.sdk.models.whatsapp.templates.TemplateCreateResponse
import com.telnyx.sdk.models.whatsapp.templates.TemplateListPageAsync
import com.telnyx.sdk.models.whatsapp.templates.TemplateListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage Whatsapp message templates */
interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /** Create a Whatsapp message template */
    fun create(params: TemplateCreateParams): CompletableFuture<TemplateCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateCreateResponse>

    /** List Whatsapp message templates */
    fun list(): CompletableFuture<TemplateListPageAsync> = list(TemplateListParams.none())

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateListPageAsync>

    /** @see list */
    fun list(
        params: TemplateListParams = TemplateListParams.none()
    ): CompletableFuture<TemplateListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TemplateListPageAsync> =
        list(TemplateListParams.none(), requestOptions)

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/whatsapp/message_templates`, but is otherwise
         * the same as [TemplateServiceAsync.create].
         */
        fun create(
            params: TemplateCreateParams
        ): CompletableFuture<HttpResponseFor<TemplateCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/whatsapp/message_templates`, but is otherwise
         * the same as [TemplateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TemplateListPageAsync>> =
            list(TemplateListParams.none())

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateListPageAsync>>

        /** @see list */
        fun list(
            params: TemplateListParams = TemplateListParams.none()
        ): CompletableFuture<HttpResponseFor<TemplateListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TemplateListPageAsync>> =
            list(TemplateListParams.none(), requestOptions)
    }
}
