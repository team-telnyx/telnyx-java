// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseCreateResponse
import com.telnyx.sdk.models.enterprises.EnterpriseDeleteParams
import com.telnyx.sdk.models.enterprises.EnterpriseListPage
import com.telnyx.sdk.models.enterprises.EnterpriseListParams
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveParams
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveResponse
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateResponse
import com.telnyx.sdk.services.blocking.enterprises.ReputationService
import java.util.function.Consumer

/** Enterprise management for Branded Calling and Number Reputation services */
interface EnterpriseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnterpriseService

    /** Manage Number Reputation enrollment and check frequency settings for an enterprise */
    fun reputation(): ReputationService

    /**
     * Create a new enterprise for Branded Calling / Number Reputation services.
     *
     * Registers the enterprise in the Branded Calling / Number Reputation services, enabling it to
     * create Display Identity Records (DIRs) or enroll in Number Reputation monitoring.
     *
     * **Required Fields:** `legal_name`, `doing_business_as`, `organization_type`, `country_code`,
     * `website`, `fein`, `industry`, `number_of_employees`, `organization_legal_type`,
     * `organization_contact`, `billing_contact`, `organization_physical_address`, `billing_address`
     */
    fun create(params: EnterpriseCreateParams): EnterpriseCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EnterpriseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseCreateResponse

    /** Retrieve details of a specific enterprise by ID. */
    fun retrieve(enterpriseId: String): EnterpriseRetrieveResponse =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseRetrieveResponse =
        retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
    ): EnterpriseRetrieveResponse = retrieve(enterpriseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnterpriseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: EnterpriseRetrieveParams): EnterpriseRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(enterpriseId: String, requestOptions: RequestOptions): EnterpriseRetrieveResponse =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

    /**
     * Update enterprise information. All fields are optional — only the provided fields will be
     * updated.
     */
    fun update(enterpriseId: String): EnterpriseUpdateResponse =
        update(enterpriseId, EnterpriseUpdateParams.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseUpdateResponse =
        update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
    ): EnterpriseUpdateResponse = update(enterpriseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EnterpriseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseUpdateResponse

    /** @see update */
    fun update(params: EnterpriseUpdateParams): EnterpriseUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(enterpriseId: String, requestOptions: RequestOptions): EnterpriseUpdateResponse =
        update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

    /** Retrieve a paginated list of enterprises associated with your account. */
    fun list(): EnterpriseListPage = list(EnterpriseListParams.none())

    /** @see list */
    fun list(
        params: EnterpriseListParams = EnterpriseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnterpriseListPage

    /** @see list */
    fun list(params: EnterpriseListParams = EnterpriseListParams.none()): EnterpriseListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EnterpriseListPage =
        list(EnterpriseListParams.none(), requestOptions)

    /** Delete an enterprise and all associated resources. This action is irreversible. */
    fun delete(enterpriseId: String) = delete(enterpriseId, EnterpriseDeleteParams.none())

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
    ) = delete(enterpriseId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EnterpriseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EnterpriseDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(enterpriseId: String, requestOptions: RequestOptions) =
        delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)

    /** A view of [EnterpriseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnterpriseService.WithRawResponse

        /** Manage Number Reputation enrollment and check frequency settings for an enterprise */
        fun reputation(): ReputationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /enterprises`, but is otherwise the same as
         * [EnterpriseService.create].
         */
        @MustBeClosed
        fun create(params: EnterpriseCreateParams): HttpResponseFor<EnterpriseCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EnterpriseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseCreateResponse>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(enterpriseId: String): HttpResponseFor<EnterpriseRetrieveResponse> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseRetrieveResponse> =
            retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        ): HttpResponseFor<EnterpriseRetrieveResponse> =
            retrieve(enterpriseId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnterpriseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EnterpriseRetrieveParams
        ): HttpResponseFor<EnterpriseRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnterpriseRetrieveResponse> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseService.update].
         */
        @MustBeClosed
        fun update(enterpriseId: String): HttpResponseFor<EnterpriseUpdateResponse> =
            update(enterpriseId, EnterpriseUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseUpdateResponse> =
            update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        ): HttpResponseFor<EnterpriseUpdateResponse> =
            update(enterpriseId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EnterpriseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: EnterpriseUpdateParams): HttpResponseFor<EnterpriseUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnterpriseUpdateResponse> =
            update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /enterprises`, but is otherwise the same as
         * [EnterpriseService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EnterpriseListPage> = list(EnterpriseListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnterpriseListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none()
        ): HttpResponseFor<EnterpriseListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EnterpriseListPage> =
            list(EnterpriseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}`, but is otherwise
         * the same as [EnterpriseService.delete].
         */
        @MustBeClosed
        fun delete(enterpriseId: String): HttpResponse =
            delete(enterpriseId, EnterpriseDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        ): HttpResponse = delete(enterpriseId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EnterpriseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EnterpriseDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(enterpriseId: String, requestOptions: RequestOptions): HttpResponse =
            delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)
    }
}
