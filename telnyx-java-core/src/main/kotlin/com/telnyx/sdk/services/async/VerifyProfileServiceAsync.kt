// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifyprofiles.MessageTemplate
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateTemplateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileData
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileDeleteParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileListParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileListResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveTemplatesParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveTemplatesResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateTemplateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VerifyProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyProfileServiceAsync

    /** Creates a new Verify profile to associate verifications with. */
    fun create(params: VerifyProfileCreateParams): CompletableFuture<VerifyProfileData> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifyProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileData>

    /** Gets a single Verify profile. */
    fun retrieve(verifyProfileId: String): CompletableFuture<VerifyProfileData> =
        retrieve(verifyProfileId, VerifyProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        verifyProfileId: String,
        params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileData> =
        retrieve(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        verifyProfileId: String,
        params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
    ): CompletableFuture<VerifyProfileData> =
        retrieve(verifyProfileId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VerifyProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileData>

    /** @see retrieve */
    fun retrieve(params: VerifyProfileRetrieveParams): CompletableFuture<VerifyProfileData> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        verifyProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileData> =
        retrieve(verifyProfileId, VerifyProfileRetrieveParams.none(), requestOptions)

    /** Update Verify profile */
    fun update(verifyProfileId: String): CompletableFuture<VerifyProfileData> =
        update(verifyProfileId, VerifyProfileUpdateParams.none())

    /** @see update */
    fun update(
        verifyProfileId: String,
        params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileData> =
        update(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

    /** @see update */
    fun update(
        verifyProfileId: String,
        params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
    ): CompletableFuture<VerifyProfileData> = update(verifyProfileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VerifyProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileData>

    /** @see update */
    fun update(params: VerifyProfileUpdateParams): CompletableFuture<VerifyProfileData> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        verifyProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileData> =
        update(verifyProfileId, VerifyProfileUpdateParams.none(), requestOptions)

    /** Gets a paginated list of Verify profiles. */
    fun list(): CompletableFuture<VerifyProfileListResponse> = list(VerifyProfileListParams.none())

    /** @see list */
    fun list(
        params: VerifyProfileListParams = VerifyProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileListResponse>

    /** @see list */
    fun list(
        params: VerifyProfileListParams = VerifyProfileListParams.none()
    ): CompletableFuture<VerifyProfileListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VerifyProfileListResponse> =
        list(VerifyProfileListParams.none(), requestOptions)

    /** Delete Verify profile */
    fun delete(verifyProfileId: String): CompletableFuture<VerifyProfileData> =
        delete(verifyProfileId, VerifyProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        verifyProfileId: String,
        params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileData> =
        delete(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        verifyProfileId: String,
        params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
    ): CompletableFuture<VerifyProfileData> = delete(verifyProfileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VerifyProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileData>

    /** @see delete */
    fun delete(params: VerifyProfileDeleteParams): CompletableFuture<VerifyProfileData> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        verifyProfileId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifyProfileData> =
        delete(verifyProfileId, VerifyProfileDeleteParams.none(), requestOptions)

    /** Create a new Verify profile message template. */
    fun createTemplate(
        params: VerifyProfileCreateTemplateParams
    ): CompletableFuture<MessageTemplate> = createTemplate(params, RequestOptions.none())

    /** @see createTemplate */
    fun createTemplate(
        params: VerifyProfileCreateTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplate>

    /** List all Verify profile message templates. */
    fun retrieveTemplates(): CompletableFuture<VerifyProfileRetrieveTemplatesResponse> =
        retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none())

    /** @see retrieveTemplates */
    fun retrieveTemplates(
        params: VerifyProfileRetrieveTemplatesParams = VerifyProfileRetrieveTemplatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerifyProfileRetrieveTemplatesResponse>

    /** @see retrieveTemplates */
    fun retrieveTemplates(
        params: VerifyProfileRetrieveTemplatesParams = VerifyProfileRetrieveTemplatesParams.none()
    ): CompletableFuture<VerifyProfileRetrieveTemplatesResponse> =
        retrieveTemplates(params, RequestOptions.none())

    /** @see retrieveTemplates */
    fun retrieveTemplates(
        requestOptions: RequestOptions
    ): CompletableFuture<VerifyProfileRetrieveTemplatesResponse> =
        retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none(), requestOptions)

    /** Update an existing Verify profile message template. */
    fun updateTemplate(
        templateId: String,
        params: VerifyProfileUpdateTemplateParams,
    ): CompletableFuture<MessageTemplate> =
        updateTemplate(templateId, params, RequestOptions.none())

    /** @see updateTemplate */
    fun updateTemplate(
        templateId: String,
        params: VerifyProfileUpdateTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplate> =
        updateTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see updateTemplate */
    fun updateTemplate(
        params: VerifyProfileUpdateTemplateParams
    ): CompletableFuture<MessageTemplate> = updateTemplate(params, RequestOptions.none())

    /** @see updateTemplate */
    fun updateTemplate(
        params: VerifyProfileUpdateTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageTemplate>

    /**
     * A view of [VerifyProfileServiceAsync] that provides access to raw HTTP responses for each
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
        ): VerifyProfileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /verify_profiles`, but is otherwise the same as
         * [VerifyProfileServiceAsync.create].
         */
        fun create(
            params: VerifyProfileCreateParams
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VerifyProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>>

        /**
         * Returns a raw HTTP response for `get /verify_profiles/{verify_profile_id}`, but is
         * otherwise the same as [VerifyProfileServiceAsync.retrieve].
         */
        fun retrieve(
            verifyProfileId: String
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            retrieve(verifyProfileId, VerifyProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            verifyProfileId: String,
            params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            retrieve(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            verifyProfileId: String,
            params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            retrieve(verifyProfileId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VerifyProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>>

        /** @see retrieve */
        fun retrieve(
            params: VerifyProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            verifyProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            retrieve(verifyProfileId, VerifyProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /verify_profiles/{verify_profile_id}`, but is
         * otherwise the same as [VerifyProfileServiceAsync.update].
         */
        fun update(verifyProfileId: String): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            update(verifyProfileId, VerifyProfileUpdateParams.none())

        /** @see update */
        fun update(
            verifyProfileId: String,
            params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            update(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

        /** @see update */
        fun update(
            verifyProfileId: String,
            params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            update(verifyProfileId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VerifyProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>>

        /** @see update */
        fun update(
            params: VerifyProfileUpdateParams
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            verifyProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            update(verifyProfileId, VerifyProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /verify_profiles`, but is otherwise the same as
         * [VerifyProfileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VerifyProfileListResponse>> =
            list(VerifyProfileListParams.none())

        /** @see list */
        fun list(
            params: VerifyProfileListParams = VerifyProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileListResponse>>

        /** @see list */
        fun list(
            params: VerifyProfileListParams = VerifyProfileListParams.none()
        ): CompletableFuture<HttpResponseFor<VerifyProfileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VerifyProfileListResponse>> =
            list(VerifyProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /verify_profiles/{verify_profile_id}`, but is
         * otherwise the same as [VerifyProfileServiceAsync.delete].
         */
        fun delete(verifyProfileId: String): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            delete(verifyProfileId, VerifyProfileDeleteParams.none())

        /** @see delete */
        fun delete(
            verifyProfileId: String,
            params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            delete(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

        /** @see delete */
        fun delete(
            verifyProfileId: String,
            params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            delete(verifyProfileId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VerifyProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>>

        /** @see delete */
        fun delete(
            params: VerifyProfileDeleteParams
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            verifyProfileId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifyProfileData>> =
            delete(verifyProfileId, VerifyProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /verify_profiles/templates`, but is otherwise the
         * same as [VerifyProfileServiceAsync.createTemplate].
         */
        fun createTemplate(
            params: VerifyProfileCreateTemplateParams
        ): CompletableFuture<HttpResponseFor<MessageTemplate>> =
            createTemplate(params, RequestOptions.none())

        /** @see createTemplate */
        fun createTemplate(
            params: VerifyProfileCreateTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplate>>

        /**
         * Returns a raw HTTP response for `get /verify_profiles/templates`, but is otherwise the
         * same as [VerifyProfileServiceAsync.retrieveTemplates].
         */
        fun retrieveTemplates():
            CompletableFuture<HttpResponseFor<VerifyProfileRetrieveTemplatesResponse>> =
            retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none())

        /** @see retrieveTemplates */
        fun retrieveTemplates(
            params: VerifyProfileRetrieveTemplatesParams =
                VerifyProfileRetrieveTemplatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerifyProfileRetrieveTemplatesResponse>>

        /** @see retrieveTemplates */
        fun retrieveTemplates(
            params: VerifyProfileRetrieveTemplatesParams =
                VerifyProfileRetrieveTemplatesParams.none()
        ): CompletableFuture<HttpResponseFor<VerifyProfileRetrieveTemplatesResponse>> =
            retrieveTemplates(params, RequestOptions.none())

        /** @see retrieveTemplates */
        fun retrieveTemplates(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VerifyProfileRetrieveTemplatesResponse>> =
            retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /verify_profiles/templates/{template_id}`, but is
         * otherwise the same as [VerifyProfileServiceAsync.updateTemplate].
         */
        fun updateTemplate(
            templateId: String,
            params: VerifyProfileUpdateTemplateParams,
        ): CompletableFuture<HttpResponseFor<MessageTemplate>> =
            updateTemplate(templateId, params, RequestOptions.none())

        /** @see updateTemplate */
        fun updateTemplate(
            templateId: String,
            params: VerifyProfileUpdateTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplate>> =
            updateTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see updateTemplate */
        fun updateTemplate(
            params: VerifyProfileUpdateTemplateParams
        ): CompletableFuture<HttpResponseFor<MessageTemplate>> =
            updateTemplate(params, RequestOptions.none())

        /** @see updateTemplate */
        fun updateTemplate(
            params: VerifyProfileUpdateTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageTemplate>>
    }
}
