// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateResponse
import com.telnyx.sdk.services.blocking.simcardgroups.ActionService
import java.util.function.Consumer

interface SimCardGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardGroupService

    fun actions(): ActionService

    /** Creates a new SIM card group object */
    fun create(params: SimCardGroupCreateParams): SimCardGroupCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SimCardGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupCreateResponse

    /** Returns the details regarding a specific SIM card group */
    fun retrieve(id: String): SimCardGroupRetrieveResponse =
        retrieve(id, SimCardGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
    ): SimCardGroupRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: SimCardGroupRetrieveParams): SimCardGroupRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): SimCardGroupRetrieveResponse =
        retrieve(id, SimCardGroupRetrieveParams.none(), requestOptions)

    /** Updates a SIM card group */
    fun update(id: String): SimCardGroupUpdateResponse = update(id, SimCardGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
    ): SimCardGroupUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SimCardGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupUpdateResponse

    /** @see update */
    fun update(params: SimCardGroupUpdateParams): SimCardGroupUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): SimCardGroupUpdateResponse =
        update(id, SimCardGroupUpdateParams.none(), requestOptions)

    /** Get all SIM card groups belonging to the user that match the given filters. */
    fun list(): SimCardGroupListResponse = list(SimCardGroupListParams.none())

    /** @see list */
    fun list(
        params: SimCardGroupListParams = SimCardGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupListResponse

    /** @see list */
    fun list(
        params: SimCardGroupListParams = SimCardGroupListParams.none()
    ): SimCardGroupListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SimCardGroupListResponse =
        list(SimCardGroupListParams.none(), requestOptions)

    /** Permanently deletes a SIM card group */
    fun delete(id: String): SimCardGroupDeleteResponse = delete(id, SimCardGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
    ): SimCardGroupDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SimCardGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimCardGroupDeleteResponse

    /** @see delete */
    fun delete(params: SimCardGroupDeleteParams): SimCardGroupDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): SimCardGroupDeleteResponse =
        delete(id, SimCardGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [SimCardGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardGroupService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sim_card_groups`, but is otherwise the same as
         * [SimCardGroupService.create].
         */
        @MustBeClosed
        fun create(params: SimCardGroupCreateParams): HttpResponseFor<SimCardGroupCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SimCardGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupCreateResponse>

        /**
         * Returns a raw HTTP response for `get /sim_card_groups/{id}`, but is otherwise the same as
         * [SimCardGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<SimCardGroupRetrieveResponse> =
            retrieve(id, SimCardGroupRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
        ): HttpResponseFor<SimCardGroupRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SimCardGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SimCardGroupRetrieveParams
        ): HttpResponseFor<SimCardGroupRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupRetrieveResponse> =
            retrieve(id, SimCardGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sim_card_groups/{id}`, but is otherwise the same
         * as [SimCardGroupService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<SimCardGroupUpdateResponse> =
            update(id, SimCardGroupUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
        ): HttpResponseFor<SimCardGroupUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SimCardGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: SimCardGroupUpdateParams): HttpResponseFor<SimCardGroupUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupUpdateResponse> =
            update(id, SimCardGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_card_groups`, but is otherwise the same as
         * [SimCardGroupService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SimCardGroupListResponse> = list(SimCardGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardGroupListParams = SimCardGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SimCardGroupListParams = SimCardGroupListParams.none()
        ): HttpResponseFor<SimCardGroupListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SimCardGroupListResponse> =
            list(SimCardGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /sim_card_groups/{id}`, but is otherwise the same
         * as [SimCardGroupService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<SimCardGroupDeleteResponse> =
            delete(id, SimCardGroupDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
        ): HttpResponseFor<SimCardGroupDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SimCardGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimCardGroupDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SimCardGroupDeleteParams): HttpResponseFor<SimCardGroupDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardGroupDeleteResponse> =
            delete(id, SimCardGroupDeleteParams.none(), requestOptions)
    }
}
