// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.enterprises.EnterpriseCreateParams
import com.telnyx.sdk.models.enterprises.EnterpriseCreateResponse
import com.telnyx.sdk.models.enterprises.EnterpriseDeleteParams
import com.telnyx.sdk.models.enterprises.EnterpriseListPageAsync
import com.telnyx.sdk.models.enterprises.EnterpriseListParams
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveParams
import com.telnyx.sdk.models.enterprises.EnterpriseRetrieveResponse
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateParams
import com.telnyx.sdk.models.enterprises.EnterpriseUpdateResponse
import com.telnyx.sdk.services.async.enterprises.ReputationServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Enterprise management for Branded Calling and Number Reputation services */
interface EnterpriseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnterpriseServiceAsync

    /** Manage Number Reputation enrollment and check frequency settings for an enterprise */
    fun reputation(): ReputationServiceAsync

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
    fun create(params: EnterpriseCreateParams): CompletableFuture<EnterpriseCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EnterpriseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseCreateResponse>

    /** Retrieve details of a specific enterprise by ID. */
    fun retrieve(enterpriseId: String): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
    ): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(enterpriseId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EnterpriseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: EnterpriseRetrieveParams): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseRetrieveResponse> =
        retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

    /**
     * Update enterprise information. All fields are optional — only the provided fields will be
     * updated.
     */
    fun update(enterpriseId: String): CompletableFuture<EnterpriseUpdateResponse> =
        update(enterpriseId, EnterpriseUpdateParams.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseUpdateResponse> =
        update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see update */
    fun update(
        enterpriseId: String,
        params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
    ): CompletableFuture<EnterpriseUpdateResponse> =
        update(enterpriseId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EnterpriseUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseUpdateResponse>

    /** @see update */
    fun update(params: EnterpriseUpdateParams): CompletableFuture<EnterpriseUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        enterpriseId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnterpriseUpdateResponse> =
        update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

    /** Retrieve a paginated list of enterprises associated with your account. */
    fun list(): CompletableFuture<EnterpriseListPageAsync> = list(EnterpriseListParams.none())

    /** @see list */
    fun list(
        params: EnterpriseListParams = EnterpriseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnterpriseListPageAsync>

    /** @see list */
    fun list(
        params: EnterpriseListParams = EnterpriseListParams.none()
    ): CompletableFuture<EnterpriseListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EnterpriseListPageAsync> =
        list(EnterpriseListParams.none(), requestOptions)

    /** Delete an enterprise and all associated resources. This action is irreversible. */
    fun delete(enterpriseId: String): CompletableFuture<Void?> =
        delete(enterpriseId, EnterpriseDeleteParams.none())

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

    /** @see delete */
    fun delete(
        enterpriseId: String,
        params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(enterpriseId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EnterpriseDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EnterpriseDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(enterpriseId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)

    /**
     * A view of [EnterpriseServiceAsync] that provides access to raw HTTP responses for each
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
        ): EnterpriseServiceAsync.WithRawResponse

        /** Manage Number Reputation enrollment and check frequency settings for an enterprise */
        fun reputation(): ReputationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /enterprises`, but is otherwise the same as
         * [EnterpriseServiceAsync.create].
         */
        fun create(
            params: EnterpriseCreateParams
        ): CompletableFuture<HttpResponseFor<EnterpriseCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EnterpriseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseServiceAsync.retrieve].
         */
        fun retrieve(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            params: EnterpriseRetrieveParams = EnterpriseRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(enterpriseId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EnterpriseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EnterpriseRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseRetrieveResponse>> =
            retrieve(enterpriseId, EnterpriseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /enterprises/{enterprise_id}`, but is otherwise the
         * same as [EnterpriseServiceAsync.update].
         */
        fun update(
            enterpriseId: String
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(enterpriseId, EnterpriseUpdateParams.none())

        /** @see update */
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see update */
        fun update(
            enterpriseId: String,
            params: EnterpriseUpdateParams = EnterpriseUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(enterpriseId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EnterpriseUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>>

        /** @see update */
        fun update(
            params: EnterpriseUpdateParams
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnterpriseUpdateResponse>> =
            update(enterpriseId, EnterpriseUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /enterprises`, but is otherwise the same as
         * [EnterpriseServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>> =
            list(EnterpriseListParams.none())

        /** @see list */
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>>

        /** @see list */
        fun list(
            params: EnterpriseListParams = EnterpriseListParams.none()
        ): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EnterpriseListPageAsync>> =
            list(EnterpriseListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /enterprises/{enterprise_id}`, but is otherwise
         * the same as [EnterpriseServiceAsync.delete].
         */
        fun delete(enterpriseId: String): CompletableFuture<HttpResponse> =
            delete(enterpriseId, EnterpriseDeleteParams.none())

        /** @see delete */
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().enterpriseId(enterpriseId).build(), requestOptions)

        /** @see delete */
        fun delete(
            enterpriseId: String,
            params: EnterpriseDeleteParams = EnterpriseDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(enterpriseId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EnterpriseDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EnterpriseDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            enterpriseId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(enterpriseId, EnterpriseDeleteParams.none(), requestOptions)
    }
}
