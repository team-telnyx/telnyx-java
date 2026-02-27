// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Requirement Groups */
interface RequirementGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequirementGroupService

    /** Create a new requirement group */
    fun create(params: RequirementGroupCreateParams): RequirementGroup =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RequirementGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup

    /** Get a single requirement group by ID */
    fun retrieve(id: String): RequirementGroup = retrieve(id, RequirementGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
    ): RequirementGroup = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RequirementGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup

    /** @see retrieve */
    fun retrieve(params: RequirementGroupRetrieveParams): RequirementGroup =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RequirementGroup =
        retrieve(id, RequirementGroupRetrieveParams.none(), requestOptions)

    /** Update requirement values in requirement group */
    fun update(id: String): RequirementGroup = update(id, RequirementGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
    ): RequirementGroup = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RequirementGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup

    /** @see update */
    fun update(params: RequirementGroupUpdateParams): RequirementGroup =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): RequirementGroup =
        update(id, RequirementGroupUpdateParams.none(), requestOptions)

    /** List requirement groups */
    fun list(): List<RequirementGroup> = list(RequirementGroupListParams.none())

    /** @see list */
    fun list(
        params: RequirementGroupListParams = RequirementGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RequirementGroup>

    /** @see list */
    fun list(
        params: RequirementGroupListParams = RequirementGroupListParams.none()
    ): List<RequirementGroup> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<RequirementGroup> =
        list(RequirementGroupListParams.none(), requestOptions)

    /** Delete a requirement group by ID */
    fun delete(id: String): RequirementGroup = delete(id, RequirementGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
    ): RequirementGroup = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RequirementGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup

    /** @see delete */
    fun delete(params: RequirementGroupDeleteParams): RequirementGroup =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): RequirementGroup =
        delete(id, RequirementGroupDeleteParams.none(), requestOptions)

    /** Submit a Requirement Group for Approval */
    fun submitForApproval(id: String): RequirementGroup =
        submitForApproval(id, RequirementGroupSubmitForApprovalParams.none())

    /** @see submitForApproval */
    fun submitForApproval(
        id: String,
        params: RequirementGroupSubmitForApprovalParams =
            RequirementGroupSubmitForApprovalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup = submitForApproval(params.toBuilder().id(id).build(), requestOptions)

    /** @see submitForApproval */
    fun submitForApproval(
        id: String,
        params: RequirementGroupSubmitForApprovalParams =
            RequirementGroupSubmitForApprovalParams.none(),
    ): RequirementGroup = submitForApproval(id, params, RequestOptions.none())

    /** @see submitForApproval */
    fun submitForApproval(
        params: RequirementGroupSubmitForApprovalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RequirementGroup

    /** @see submitForApproval */
    fun submitForApproval(params: RequirementGroupSubmitForApprovalParams): RequirementGroup =
        submitForApproval(params, RequestOptions.none())

    /** @see submitForApproval */
    fun submitForApproval(id: String, requestOptions: RequestOptions): RequirementGroup =
        submitForApproval(id, RequirementGroupSubmitForApprovalParams.none(), requestOptions)

    /**
     * A view of [RequirementGroupService] that provides access to raw HTTP responses for each
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
        ): RequirementGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /requirement_groups`, but is otherwise the same as
         * [RequirementGroupService.create].
         */
        @MustBeClosed
        fun create(params: RequirementGroupCreateParams): HttpResponseFor<RequirementGroup> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RequirementGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup>

        /**
         * Returns a raw HTTP response for `get /requirement_groups/{id}`, but is otherwise the same
         * as [RequirementGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<RequirementGroup> =
            retrieve(id, RequirementGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RequirementGroupRetrieveParams = RequirementGroupRetrieveParams.none(),
        ): HttpResponseFor<RequirementGroup> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RequirementGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RequirementGroupRetrieveParams): HttpResponseFor<RequirementGroup> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementGroup> =
            retrieve(id, RequirementGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /requirement_groups/{id}`, but is otherwise the
         * same as [RequirementGroupService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<RequirementGroup> =
            update(id, RequirementGroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: RequirementGroupUpdateParams = RequirementGroupUpdateParams.none(),
        ): HttpResponseFor<RequirementGroup> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RequirementGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup>

        /** @see update */
        @MustBeClosed
        fun update(params: RequirementGroupUpdateParams): HttpResponseFor<RequirementGroup> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<RequirementGroup> =
            update(id, RequirementGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /requirement_groups`, but is otherwise the same as
         * [RequirementGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<RequirementGroup>> =
            list(RequirementGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RequirementGroupListParams = RequirementGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RequirementGroup>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RequirementGroupListParams = RequirementGroupListParams.none()
        ): HttpResponseFor<List<RequirementGroup>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<RequirementGroup>> =
            list(RequirementGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /requirement_groups/{id}`, but is otherwise the
         * same as [RequirementGroupService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<RequirementGroup> =
            delete(id, RequirementGroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: RequirementGroupDeleteParams = RequirementGroupDeleteParams.none(),
        ): HttpResponseFor<RequirementGroup> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RequirementGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup>

        /** @see delete */
        @MustBeClosed
        fun delete(params: RequirementGroupDeleteParams): HttpResponseFor<RequirementGroup> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<RequirementGroup> =
            delete(id, RequirementGroupDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /requirement_groups/{id}/submit_for_approval`, but
         * is otherwise the same as [RequirementGroupService.submitForApproval].
         */
        @MustBeClosed
        fun submitForApproval(id: String): HttpResponseFor<RequirementGroup> =
            submitForApproval(id, RequirementGroupSubmitForApprovalParams.none())

        /** @see submitForApproval */
        @MustBeClosed
        fun submitForApproval(
            id: String,
            params: RequirementGroupSubmitForApprovalParams =
                RequirementGroupSubmitForApprovalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup> =
            submitForApproval(params.toBuilder().id(id).build(), requestOptions)

        /** @see submitForApproval */
        @MustBeClosed
        fun submitForApproval(
            id: String,
            params: RequirementGroupSubmitForApprovalParams =
                RequirementGroupSubmitForApprovalParams.none(),
        ): HttpResponseFor<RequirementGroup> = submitForApproval(id, params, RequestOptions.none())

        /** @see submitForApproval */
        @MustBeClosed
        fun submitForApproval(
            params: RequirementGroupSubmitForApprovalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RequirementGroup>

        /** @see submitForApproval */
        @MustBeClosed
        fun submitForApproval(
            params: RequirementGroupSubmitForApprovalParams
        ): HttpResponseFor<RequirementGroup> = submitForApproval(params, RequestOptions.none())

        /** @see submitForApproval */
        @MustBeClosed
        fun submitForApproval(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RequirementGroup> =
            submitForApproval(id, RequirementGroupSubmitForApprovalParams.none(), requestOptions)
    }
}
