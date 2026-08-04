// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Create, list, retrieve, update, delete, and render Liquid email templates. */
interface EmailTemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailTemplateService

    /** Creates a Liquid email template. Variables are auto-extracted when omitted. */
    fun create(params: EmailTemplateCreateParams): EmailTemplateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateResponse

    /** Get an email template */
    fun retrieve(id: String): EmailTemplateResponse =
        retrieve(id, EmailTemplateRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
    ): EmailTemplateResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateResponse

    /** @see retrieve */
    fun retrieve(params: EmailTemplateRetrieveParams): EmailTemplateResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EmailTemplateResponse =
        retrieve(id, EmailTemplateRetrieveParams.none(), requestOptions)

    /** Updates one or more template fields. */
    fun update(id: String, params: EmailTemplateUpdateParams): EmailTemplateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EmailTemplateUpdateParams): EmailTemplateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateResponse

    /** Lists templates sorted newest first by `created_at desc, id desc`. */
    fun list(): EmailTemplateListResponse = list(EmailTemplateListParams.none())

    /** @see list */
    fun list(
        params: EmailTemplateListParams = EmailTemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateListResponse

    /** @see list */
    fun list(
        params: EmailTemplateListParams = EmailTemplateListParams.none()
    ): EmailTemplateListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailTemplateListResponse =
        list(EmailTemplateListParams.none(), requestOptions)

    /** Delete an email template */
    fun delete(id: String) = delete(id, EmailTemplateDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EmailTemplateDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EmailTemplateDeleteParams.none(), requestOptions)

    /**
     * Renders a template using the provided Liquid variables. Missing `template_variables` defaults
     * to `{}`.
     */
    fun render(id: String): EmailTemplateRenderResponse =
        render(id, EmailTemplateRenderParams.none())

    /** @see render */
    fun render(
        id: String,
        params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateRenderResponse = render(params.toBuilder().id(id).build(), requestOptions)

    /** @see render */
    fun render(
        id: String,
        params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
    ): EmailTemplateRenderResponse = render(id, params, RequestOptions.none())

    /** @see render */
    fun render(
        params: EmailTemplateRenderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateRenderResponse

    /** @see render */
    fun render(params: EmailTemplateRenderParams): EmailTemplateRenderResponse =
        render(params, RequestOptions.none())

    /** @see render */
    fun render(id: String, requestOptions: RequestOptions): EmailTemplateRenderResponse =
        render(id, EmailTemplateRenderParams.none(), requestOptions)

    /**
     * Replaces template fields. Behaves identically to PATCH; provided for compatibility with
     * Phoenix resource routes.
     */
    fun replace(id: String, params: EmailTemplateReplaceParams): EmailTemplateResponse =
        replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: EmailTemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateResponse = replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(params: EmailTemplateReplaceParams): EmailTemplateResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: EmailTemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailTemplateResponse

    /**
     * A view of [EmailTemplateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailTemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_templates`, but is otherwise the same as
         * [EmailTemplateService.create].
         */
        @MustBeClosed
        fun create(params: EmailTemplateCreateParams): HttpResponseFor<EmailTemplateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateResponse>

        /**
         * Returns a raw HTTP response for `get /email_templates/{id}`, but is otherwise the same as
         * [EmailTemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EmailTemplateResponse> =
            retrieve(id, EmailTemplateRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailTemplateRetrieveParams = EmailTemplateRetrieveParams.none(),
        ): HttpResponseFor<EmailTemplateResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EmailTemplateRetrieveParams): HttpResponseFor<EmailTemplateResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateResponse> =
            retrieve(id, EmailTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email_templates/{id}`, but is otherwise the same
         * as [EmailTemplateService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailTemplateUpdateParams,
        ): HttpResponseFor<EmailTemplateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EmailTemplateUpdateParams): HttpResponseFor<EmailTemplateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateResponse>

        /**
         * Returns a raw HTTP response for `get /email_templates`, but is otherwise the same as
         * [EmailTemplateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailTemplateListResponse> =
            list(EmailTemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailTemplateListParams = EmailTemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailTemplateListParams = EmailTemplateListParams.none()
        ): HttpResponseFor<EmailTemplateListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailTemplateListResponse> =
            list(EmailTemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_templates/{id}`, but is otherwise the same
         * as [EmailTemplateService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, EmailTemplateDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailTemplateDeleteParams = EmailTemplateDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailTemplateDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EmailTemplateDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email_templates/{id}/render`, but is otherwise the
         * same as [EmailTemplateService.render].
         */
        @MustBeClosed
        fun render(id: String): HttpResponseFor<EmailTemplateRenderResponse> =
            render(id, EmailTemplateRenderParams.none())

        /** @see render */
        @MustBeClosed
        fun render(
            id: String,
            params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateRenderResponse> =
            render(params.toBuilder().id(id).build(), requestOptions)

        /** @see render */
        @MustBeClosed
        fun render(
            id: String,
            params: EmailTemplateRenderParams = EmailTemplateRenderParams.none(),
        ): HttpResponseFor<EmailTemplateRenderResponse> = render(id, params, RequestOptions.none())

        /** @see render */
        @MustBeClosed
        fun render(
            params: EmailTemplateRenderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateRenderResponse>

        /** @see render */
        @MustBeClosed
        fun render(
            params: EmailTemplateRenderParams
        ): HttpResponseFor<EmailTemplateRenderResponse> = render(params, RequestOptions.none())

        /** @see render */
        @MustBeClosed
        fun render(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailTemplateRenderResponse> =
            render(id, EmailTemplateRenderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /email_templates/{id}`, but is otherwise the same as
         * [EmailTemplateService.replace].
         */
        @MustBeClosed
        fun replace(
            id: String,
            params: EmailTemplateReplaceParams,
        ): HttpResponseFor<EmailTemplateResponse> = replace(id, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            id: String,
            params: EmailTemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateResponse> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: EmailTemplateReplaceParams): HttpResponseFor<EmailTemplateResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: EmailTemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailTemplateResponse>
    }
}
