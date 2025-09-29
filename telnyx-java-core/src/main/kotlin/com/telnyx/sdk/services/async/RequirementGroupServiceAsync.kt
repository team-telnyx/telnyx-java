// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.requirementgroups.RequirementGroup
import com.telnyx.sdk.models.requirementgroups.RequirementGroupCreateParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupDeleteParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupListParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupRetrieveParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupSubmitForApprovalParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RequirementGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementGroupServiceAsync

    /** Create a new requirement group */
    fun create(params: RequirementGroupCreateParams): CompletableFuture<RequirementGroup> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RequirementGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup>

    /** Get a single requirement group by ID */
    fun retrieve(id: String): CompletableFuture<RequirementGroup> =
        retrieve(id, RequirementGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
    ): CompletableFuture<RequirementGroup> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequirementGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup>

    /** @see retrieve */
    fun retrieve(params: RequirementGroupRetrieveParams): CompletableFuture<RequirementGroup> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<RequirementGroup> =
        retrieve(id, RequirementGroupRetrieveParams.none(), requestOptions)

    /** Update requirement values in requirement group */
    fun update(id: String): CompletableFuture<RequirementGroup> =
        update(id, RequirementGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
    ): CompletableFuture<RequirementGroup> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RequirementGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup>

    /** @see update */
    fun update(params: RequirementGroupUpdateParams): CompletableFuture<RequirementGroup> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<RequirementGroup> =
        update(id, RequirementGroupUpdateParams.none(), requestOptions)

    /** List requirement groups */
    fun list(): CompletableFuture<List<RequirementGroup>> = list(RequirementGroupListParams.none())

    /** @see list */
    fun list(
        params: RequirementGroupListParams = RequirementGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<RequirementGroup>>

    /** @see list */
    fun list(
        params: RequirementGroupListParams = RequirementGroupListParams.none()
    ): CompletableFuture<List<RequirementGroup>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<RequirementGroup>> =
        list(RequirementGroupListParams.none(), requestOptions)

    /** Delete a requirement group by ID */
    fun delete(id: String): CompletableFuture<RequirementGroup> =
        delete(id, RequirementGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
    ): CompletableFuture<RequirementGroup> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RequirementGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup>

    /** @see delete */
    fun delete(params: RequirementGroupDeleteParams): CompletableFuture<RequirementGroup> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<RequirementGroup> =
        delete(id, RequirementGroupDeleteParams.none(), requestOptions)

    /** Submit a Requirement Group for Approval */
    fun submitForApproval(id: String): CompletableFuture<RequirementGroup> =
        submitForApproval(id, RequirementGroupSubmitForApprovalParams.none())

    /** @see submitForApproval */
    fun submitForApproval(
        id: String,
        params: RequirementGroupSubmitForApprovalParams =
            RequirementGroupSubmitForApprovalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup> =
        submitForApproval(params.toBuilder().id(id).build(), requestOptions)

    /** @see submitForApproval */
    fun submitForApproval(
        id: String,
        params: RequirementGroupSubmitForApprovalParams =
            RequirementGroupSubmitForApprovalParams.none(),
    ): CompletableFuture<RequirementGroup> = submitForApproval(id, params, RequestOptions.none())

    /** @see submitForApproval */
    fun submitForApproval(
        params: RequirementGroupSubmitForApprovalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RequirementGroup>

    /** @see submitForApproval */
    fun submitForApproval(
        params: RequirementGroupSubmitForApprovalParams
    ): CompletableFuture<RequirementGroup> = submitForApproval(params, RequestOptions.none())

    /** @see submitForApproval */
    fun submitForApproval(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RequirementGroup> =
        submitForApproval(id, RequirementGroupSubmitForApprovalParams.none(), requestOptions)

    /**
     * A view of [RequirementGroupServiceAsync] that provides access to raw HTTP responses for each
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
        ): RequirementGroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /requirement_groups`, but is otherwise the same as
         * [RequirementGroupServiceAsync.create].
         */
        fun create(
            params: RequirementGroupCreateParams
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RequirementGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>>

        /**
         * Returns a raw HTTP response for `get /requirement_groups/{id}`, but is otherwise the same
         * as [RequirementGroupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            retrieve(id, RequirementGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RequirementGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>>

        /** @see retrieve */
        fun retrieve(
            params: RequirementGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            retrieve(id, RequirementGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /requirement_groups/{id}`, but is otherwise the
         * same as [RequirementGroupServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            update(id, RequirementGroupUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RequirementGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>>

        /** @see update */
        fun update(
            params: RequirementGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            update(id, RequirementGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /requirement_groups`, but is otherwise the same as
         * [RequirementGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<RequirementGroup>>> =
            list(RequirementGroupListParams.none())

        /** @see list */
        fun list(
            params: RequirementGroupListParams = RequirementGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<RequirementGroup>>>

        /** @see list */
        fun list(
            params: RequirementGroupListParams = RequirementGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<List<RequirementGroup>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<RequirementGroup>>> =
            list(RequirementGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /requirement_groups/{id}`, but is otherwise the
         * same as [RequirementGroupServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            delete(id, RequirementGroupDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RequirementGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>>

        /** @see delete */
        fun delete(
            params: RequirementGroupDeleteParams
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            delete(id, RequirementGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /requirement_groups/{id}/submit_for_approval`, but
         * is otherwise the same as [RequirementGroupServiceAsync.submitForApproval].
         */
        fun submitForApproval(id: String): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            submitForApproval(id, RequirementGroupSubmitForApprovalParams.none())

        /** @see submitForApproval */
        fun submitForApproval(
            id: String,
            params: RequirementGroupSubmitForApprovalParams =
                RequirementGroupSubmitForApprovalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            submitForApproval(params.toBuilder().id(id).build(), requestOptions)

        /** @see submitForApproval */
        fun submitForApproval(
            id: String,
            params: RequirementGroupSubmitForApprovalParams =
                RequirementGroupSubmitForApprovalParams.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            submitForApproval(id, params, RequestOptions.none())

        /** @see submitForApproval */
        fun submitForApproval(
            params: RequirementGroupSubmitForApprovalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RequirementGroup>>

        /** @see submitForApproval */
        fun submitForApproval(
            params: RequirementGroupSubmitForApprovalParams
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            submitForApproval(params, RequestOptions.none())

        /** @see submitForApproval */
        fun submitForApproval(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RequirementGroup>> =
            submitForApproval(id, RequirementGroupSubmitForApprovalParams.none(), requestOptions)
    }
}
