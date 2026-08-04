// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailtemplates.EmailTemplateCreateParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateDeleteParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateListParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateListResponse
import com.telnyx.sdk.models.emailtemplates.EmailTemplateRenderParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateRenderResponse
import com.telnyx.sdk.models.emailtemplates.EmailTemplateReplaceParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateResponse
import com.telnyx.sdk.models.emailtemplates.EmailTemplateRetrieveParams
import com.telnyx.sdk.models.emailtemplates.EmailTemplateUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create, list, retrieve, update, delete, and render Liquid email templates. */
interface EmailTemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailTemplateServiceAsync

    /** Creates a Liquid email template. Variables are auto-extracted when omitted. */
    fun create(params: EmailTemplateCreateParams): CompletableFuture<EmailTemplateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateResponse>

    /** Get an email template */
    fun retrieve(id: String): CompletableFuture<EmailTemplateResponse> =
        retrieve(id, EmailTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
    ): CompletableFuture<EmailTemplateResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateResponse>

    /** @see retrieve */
    fun retrieve(params: EmailTemplateRetrieveParams): CompletableFuture<EmailTemplateResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailTemplateResponse> =
        retrieve(id, EmailTemplateRetrieveParams.none(), requestOptions)

    /** Updates one or more template fields. */
    fun update(
        id: String,
        params: EmailTemplateUpdateParams,
    ): CompletableFuture<EmailTemplateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EmailTemplateUpdateParams): CompletableFuture<EmailTemplateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateResponse>

    /** Lists templates sorted newest first by `created_at desc, id desc`. */
    fun list(): CompletableFuture<EmailTemplateListResponse> = list(EmailTemplateListParams.none())

    /** @see list */
    fun list(
        params: EmailTemplateListParams = EmailTemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateListResponse>

    /** @see list */
    fun list(
        params: EmailTemplateListParams = EmailTemplateListParams.none()
    ): CompletableFuture<EmailTemplateListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailTemplateListResponse> =
        list(EmailTemplateListParams.none(), requestOptions)

    /** Delete an email template */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, EmailTemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmailTemplateDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EmailTemplateDeleteParams.none(), requestOptions)

    /**
     * Renders a template using the provided Liquid variables. Missing `template_variables` defaults
     * to `{}`.
     */
    fun render(id: String): CompletableFuture<EmailTemplateRenderResponse> =
        render(id, EmailTemplateRenderParams.none())

    /** @see render */
    fun render(
        id: String,
        params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateRenderResponse> =
        render(params.toBuilder().id(id).build(), requestOptions)

    /** @see render */
    fun render(
        id: String,
        params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
    ): CompletableFuture<EmailTemplateRenderResponse> = render(id, params, RequestOptions.none())

    /** @see render */
    fun render(
        params: EmailTemplateRenderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateRenderResponse>

    /** @see render */
    fun render(params: EmailTemplateRenderParams): CompletableFuture<EmailTemplateRenderResponse> =
        render(params, RequestOptions.none())

    /** @see render */
    fun render(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailTemplateRenderResponse> =
        render(id, EmailTemplateRenderParams.none(), requestOptions)

    /**
     * Replaces template fields. Behaves identically to PATCH; provided for compatibility with
     * Phoenix resource routes.
     */
    fun replace(
        id: String,
        params: EmailTemplateReplaceParams,
    ): CompletableFuture<EmailTemplateResponse> = replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: EmailTemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateResponse> =
        replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(params: EmailTemplateReplaceParams): CompletableFuture<EmailTemplateResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: EmailTemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailTemplateResponse>

    /**
     * A view of [EmailTemplateServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmailTemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_templates`, but is otherwise the same as
         * [EmailTemplateServiceAsync.create].
         */
        fun create(
            params: EmailTemplateCreateParams
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>>

        /**
         * Returns a raw HTTP response for `get /email_templates/{id}`, but is otherwise the same as
         * [EmailTemplateServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            retrieve(id, EmailTemplateRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmailTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmailTemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            retrieve(id, EmailTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email_templates/{id}`, but is otherwise the same
         * as [EmailTemplateServiceAsync.update].
         */
        fun update(
            id: String,
            params: EmailTemplateUpdateParams,
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: EmailTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: EmailTemplateUpdateParams
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EmailTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>>

        /**
         * Returns a raw HTTP response for `get /email_templates`, but is otherwise the same as
         * [EmailTemplateServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailTemplateListResponse>> =
            list(EmailTemplateListParams.none())

        /** @see list */
        fun list(
            params: EmailTemplateListParams = EmailTemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateListResponse>>

        /** @see list */
        fun list(
            params: EmailTemplateListParams = EmailTemplateListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailTemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailTemplateListResponse>> =
            list(EmailTemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_templates/{id}`, but is otherwise the same
         * as [EmailTemplateServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EmailTemplateDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmailTemplateDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EmailTemplateDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email_templates/{id}/render`, but is otherwise the
         * same as [EmailTemplateServiceAsync.render].
         */
        fun render(id: String): CompletableFuture<HttpResponseFor<EmailTemplateRenderResponse>> =
            render(id, EmailTemplateRenderParams.none())

        /** @see render */
        fun render(
            id: String,
            params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateRenderResponse>> =
            render(params.toBuilder().id(id).build(), requestOptions)

        /** @see render */
        fun render(
            id: String,
            params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateRenderResponse>> =
            render(id, params, RequestOptions.none())

        /** @see render */
        fun render(
            params: EmailTemplateRenderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateRenderResponse>>

        /** @see render */
        fun render(
            params: EmailTemplateRenderParams
        ): CompletableFuture<HttpResponseFor<EmailTemplateRenderResponse>> =
            render(params, RequestOptions.none())

        /** @see render */
        fun render(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailTemplateRenderResponse>> =
            render(id, EmailTemplateRenderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /email_templates/{id}`, but is otherwise the same as
         * [EmailTemplateServiceAsync.replace].
         */
        fun replace(
            id: String,
            params: EmailTemplateReplaceParams,
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            replace(id, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            id: String,
            params: EmailTemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: EmailTemplateReplaceParams
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: EmailTemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailTemplateResponse>>
    }
}
