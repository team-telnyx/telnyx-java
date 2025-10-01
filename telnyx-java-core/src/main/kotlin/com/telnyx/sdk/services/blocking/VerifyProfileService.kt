// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateTemplateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileCreateTemplateResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileData
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileDeleteParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileListParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileListResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveTemplatesParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileRetrieveTemplatesResponse
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateTemplateParams
import com.telnyx.sdk.models.verifyprofiles.VerifyProfileUpdateTemplateResponse
import java.util.function.Consumer

interface VerifyProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerifyProfileService

    /** Creates a new Verify profile to associate verifications with. */
    fun create(params: VerifyProfileCreateParams): VerifyProfileData =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VerifyProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileData

    /** Gets a single Verify profile. */
    fun retrieve(verifyProfileId: String): VerifyProfileData =
        retrieve(verifyProfileId, VerifyProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        verifyProfileId: String,
        params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileData =
        retrieve(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        verifyProfileId: String,
        params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
    ): VerifyProfileData = retrieve(verifyProfileId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VerifyProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileData

    /** @see retrieve */
    fun retrieve(params: VerifyProfileRetrieveParams): VerifyProfileData =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(verifyProfileId: String, requestOptions: RequestOptions): VerifyProfileData =
        retrieve(verifyProfileId, VerifyProfileRetrieveParams.none(), requestOptions)

    /** Update Verify profile */
    fun update(verifyProfileId: String): VerifyProfileData =
        update(verifyProfileId, VerifyProfileUpdateParams.none())

    /** @see update */
    fun update(
        verifyProfileId: String,
        params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileData =
        update(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

    /** @see update */
    fun update(
        verifyProfileId: String,
        params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
    ): VerifyProfileData = update(verifyProfileId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VerifyProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileData

    /** @see update */
    fun update(params: VerifyProfileUpdateParams): VerifyProfileData =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(verifyProfileId: String, requestOptions: RequestOptions): VerifyProfileData =
        update(verifyProfileId, VerifyProfileUpdateParams.none(), requestOptions)

    /** Gets a paginated list of Verify profiles. */
    fun list(): VerifyProfileListResponse = list(VerifyProfileListParams.none())

    /** @see list */
    fun list(
        params: VerifyProfileListParams = VerifyProfileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileListResponse

    /** @see list */
    fun list(
        params: VerifyProfileListParams = VerifyProfileListParams.none()
    ): VerifyProfileListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VerifyProfileListResponse =
        list(VerifyProfileListParams.none(), requestOptions)

    /** Delete Verify profile */
    fun delete(verifyProfileId: String): VerifyProfileData =
        delete(verifyProfileId, VerifyProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        verifyProfileId: String,
        params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileData =
        delete(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

    /** @see delete */
    fun delete(
        verifyProfileId: String,
        params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
    ): VerifyProfileData = delete(verifyProfileId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VerifyProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileData

    /** @see delete */
    fun delete(params: VerifyProfileDeleteParams): VerifyProfileData =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(verifyProfileId: String, requestOptions: RequestOptions): VerifyProfileData =
        delete(verifyProfileId, VerifyProfileDeleteParams.none(), requestOptions)

    /** Create a new Verify profile message template. */
    fun createTemplate(
        params: VerifyProfileCreateTemplateParams
    ): VerifyProfileCreateTemplateResponse = createTemplate(params, RequestOptions.none())

    /** @see createTemplate */
    fun createTemplate(
        params: VerifyProfileCreateTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileCreateTemplateResponse

    /** List all Verify profile message templates. */
    fun retrieveTemplates(): VerifyProfileRetrieveTemplatesResponse =
        retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none())

    /** @see retrieveTemplates */
    fun retrieveTemplates(
        params: VerifyProfileRetrieveTemplatesParams = VerifyProfileRetrieveTemplatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileRetrieveTemplatesResponse

    /** @see retrieveTemplates */
    fun retrieveTemplates(
        params: VerifyProfileRetrieveTemplatesParams = VerifyProfileRetrieveTemplatesParams.none()
    ): VerifyProfileRetrieveTemplatesResponse = retrieveTemplates(params, RequestOptions.none())

    /** @see retrieveTemplates */
    fun retrieveTemplates(requestOptions: RequestOptions): VerifyProfileRetrieveTemplatesResponse =
        retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none(), requestOptions)

    /** Update an existing Verify profile message template. */
    fun updateTemplate(
        templateId: String,
        params: VerifyProfileUpdateTemplateParams,
    ): VerifyProfileUpdateTemplateResponse =
        updateTemplate(templateId, params, RequestOptions.none())

    /** @see updateTemplate */
    fun updateTemplate(
        templateId: String,
        params: VerifyProfileUpdateTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileUpdateTemplateResponse =
        updateTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see updateTemplate */
    fun updateTemplate(
        params: VerifyProfileUpdateTemplateParams
    ): VerifyProfileUpdateTemplateResponse = updateTemplate(params, RequestOptions.none())

    /** @see updateTemplate */
    fun updateTemplate(
        params: VerifyProfileUpdateTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerifyProfileUpdateTemplateResponse

    /**
     * A view of [VerifyProfileService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifyProfileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /verify_profiles`, but is otherwise the same as
         * [VerifyProfileService.create].
         */
        @MustBeClosed
        fun create(params: VerifyProfileCreateParams): HttpResponseFor<VerifyProfileData> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VerifyProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileData>

        /**
         * Returns a raw HTTP response for `get /verify_profiles/{verify_profile_id}`, but is
         * otherwise the same as [VerifyProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(verifyProfileId: String): HttpResponseFor<VerifyProfileData> =
            retrieve(verifyProfileId, VerifyProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            verifyProfileId: String,
            params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileData> =
            retrieve(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            verifyProfileId: String,
            params: VerifyProfileRetrieveParams = VerifyProfileRetrieveParams.none(),
        ): HttpResponseFor<VerifyProfileData> =
            retrieve(verifyProfileId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerifyProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileData>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VerifyProfileRetrieveParams): HttpResponseFor<VerifyProfileData> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            verifyProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileData> =
            retrieve(verifyProfileId, VerifyProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /verify_profiles/{verify_profile_id}`, but is
         * otherwise the same as [VerifyProfileService.update].
         */
        @MustBeClosed
        fun update(verifyProfileId: String): HttpResponseFor<VerifyProfileData> =
            update(verifyProfileId, VerifyProfileUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            verifyProfileId: String,
            params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileData> =
            update(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            verifyProfileId: String,
            params: VerifyProfileUpdateParams = VerifyProfileUpdateParams.none(),
        ): HttpResponseFor<VerifyProfileData> =
            update(verifyProfileId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VerifyProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileData>

        /** @see update */
        @MustBeClosed
        fun update(params: VerifyProfileUpdateParams): HttpResponseFor<VerifyProfileData> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            verifyProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileData> =
            update(verifyProfileId, VerifyProfileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /verify_profiles`, but is otherwise the same as
         * [VerifyProfileService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VerifyProfileListResponse> =
            list(VerifyProfileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerifyProfileListParams = VerifyProfileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerifyProfileListParams = VerifyProfileListParams.none()
        ): HttpResponseFor<VerifyProfileListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VerifyProfileListResponse> =
            list(VerifyProfileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /verify_profiles/{verify_profile_id}`, but is
         * otherwise the same as [VerifyProfileService.delete].
         */
        @MustBeClosed
        fun delete(verifyProfileId: String): HttpResponseFor<VerifyProfileData> =
            delete(verifyProfileId, VerifyProfileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            verifyProfileId: String,
            params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileData> =
            delete(params.toBuilder().verifyProfileId(verifyProfileId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            verifyProfileId: String,
            params: VerifyProfileDeleteParams = VerifyProfileDeleteParams.none(),
        ): HttpResponseFor<VerifyProfileData> =
            delete(verifyProfileId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VerifyProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileData>

        /** @see delete */
        @MustBeClosed
        fun delete(params: VerifyProfileDeleteParams): HttpResponseFor<VerifyProfileData> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            verifyProfileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerifyProfileData> =
            delete(verifyProfileId, VerifyProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /verify_profiles/templates`, but is otherwise the
         * same as [VerifyProfileService.createTemplate].
         */
        @MustBeClosed
        fun createTemplate(
            params: VerifyProfileCreateTemplateParams
        ): HttpResponseFor<VerifyProfileCreateTemplateResponse> =
            createTemplate(params, RequestOptions.none())

        /** @see createTemplate */
        @MustBeClosed
        fun createTemplate(
            params: VerifyProfileCreateTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileCreateTemplateResponse>

        /**
         * Returns a raw HTTP response for `get /verify_profiles/templates`, but is otherwise the
         * same as [VerifyProfileService.retrieveTemplates].
         */
        @MustBeClosed
        fun retrieveTemplates(): HttpResponseFor<VerifyProfileRetrieveTemplatesResponse> =
            retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none())

        /** @see retrieveTemplates */
        @MustBeClosed
        fun retrieveTemplates(
            params: VerifyProfileRetrieveTemplatesParams =
                VerifyProfileRetrieveTemplatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileRetrieveTemplatesResponse>

        /** @see retrieveTemplates */
        @MustBeClosed
        fun retrieveTemplates(
            params: VerifyProfileRetrieveTemplatesParams =
                VerifyProfileRetrieveTemplatesParams.none()
        ): HttpResponseFor<VerifyProfileRetrieveTemplatesResponse> =
            retrieveTemplates(params, RequestOptions.none())

        /** @see retrieveTemplates */
        @MustBeClosed
        fun retrieveTemplates(
            requestOptions: RequestOptions
        ): HttpResponseFor<VerifyProfileRetrieveTemplatesResponse> =
            retrieveTemplates(VerifyProfileRetrieveTemplatesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /verify_profiles/templates/{template_id}`, but is
         * otherwise the same as [VerifyProfileService.updateTemplate].
         */
        @MustBeClosed
        fun updateTemplate(
            templateId: String,
            params: VerifyProfileUpdateTemplateParams,
        ): HttpResponseFor<VerifyProfileUpdateTemplateResponse> =
            updateTemplate(templateId, params, RequestOptions.none())

        /** @see updateTemplate */
        @MustBeClosed
        fun updateTemplate(
            templateId: String,
            params: VerifyProfileUpdateTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileUpdateTemplateResponse> =
            updateTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see updateTemplate */
        @MustBeClosed
        fun updateTemplate(
            params: VerifyProfileUpdateTemplateParams
        ): HttpResponseFor<VerifyProfileUpdateTemplateResponse> =
            updateTemplate(params, RequestOptions.none())

        /** @see updateTemplate */
        @MustBeClosed
        fun updateTemplate(
            params: VerifyProfileUpdateTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerifyProfileUpdateTemplateResponse>
    }
}
