// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListPageAsync
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateResponse
import com.telnyx.sdk.services.async.simcardgroups.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SimCardGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardGroupServiceAsync

    fun actions(): ActionServiceAsync

    /** Creates a new SIM card group object */
    fun create(params: SimCardGroupCreateParams): CompletableFuture<SimCardGroupCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SimCardGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupCreateResponse>

    /** Returns the details regarding a specific SIM card group */
    fun retrieve(id: String): CompletableFuture<SimCardGroupRetrieveResponse> =
        retrieve(id, SimCardGroupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
    ): CompletableFuture<SimCardGroupRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SimCardGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: SimCardGroupRetrieveParams
    ): CompletableFuture<SimCardGroupRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupRetrieveResponse> =
        retrieve(id, SimCardGroupRetrieveParams.none(), requestOptions)

    /** Updates a SIM card group */
    fun update(id: String): CompletableFuture<SimCardGroupUpdateResponse> =
        update(id, SimCardGroupUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
    ): CompletableFuture<SimCardGroupUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SimCardGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupUpdateResponse>

    /** @see update */
    fun update(params: SimCardGroupUpdateParams): CompletableFuture<SimCardGroupUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupUpdateResponse> =
        update(id, SimCardGroupUpdateParams.none(), requestOptions)

    /** Get all SIM card groups belonging to the user that match the given filters. */
    fun list(): CompletableFuture<SimCardGroupListPageAsync> = list(SimCardGroupListParams.none())

    /** @see list */
    fun list(
        params: SimCardGroupListParams = SimCardGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupListPageAsync>

    /** @see list */
    fun list(
        params: SimCardGroupListParams = SimCardGroupListParams.none()
    ): CompletableFuture<SimCardGroupListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SimCardGroupListPageAsync> =
        list(SimCardGroupListParams.none(), requestOptions)

    /** Permanently deletes a SIM card group */
    fun delete(id: String): CompletableFuture<SimCardGroupDeleteResponse> =
        delete(id, SimCardGroupDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
    ): CompletableFuture<SimCardGroupDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SimCardGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SimCardGroupDeleteResponse>

    /** @see delete */
    fun delete(params: SimCardGroupDeleteParams): CompletableFuture<SimCardGroupDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupDeleteResponse> =
        delete(id, SimCardGroupDeleteParams.none(), requestOptions)

    /**
     * A view of [SimCardGroupServiceAsync] that provides access to raw HTTP responses for each
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
        ): SimCardGroupServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sim_card_groups`, but is otherwise the same as
         * [SimCardGroupServiceAsync.create].
         */
        fun create(
            params: SimCardGroupCreateParams
        ): CompletableFuture<HttpResponseFor<SimCardGroupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SimCardGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /sim_card_groups/{id}`, but is otherwise the same as
         * [SimCardGroupServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<SimCardGroupRetrieveResponse>> =
            retrieve(id, SimCardGroupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: SimCardGroupRetrieveParams = SimCardGroupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SimCardGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SimCardGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<SimCardGroupRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupRetrieveResponse>> =
            retrieve(id, SimCardGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /sim_card_groups/{id}`, but is otherwise the same
         * as [SimCardGroupServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<SimCardGroupUpdateResponse>> =
            update(id, SimCardGroupUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: SimCardGroupUpdateParams = SimCardGroupUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SimCardGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupUpdateResponse>>

        /** @see update */
        fun update(
            params: SimCardGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<SimCardGroupUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupUpdateResponse>> =
            update(id, SimCardGroupUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /sim_card_groups`, but is otherwise the same as
         * [SimCardGroupServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SimCardGroupListPageAsync>> =
            list(SimCardGroupListParams.none())

        /** @see list */
        fun list(
            params: SimCardGroupListParams = SimCardGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupListPageAsync>>

        /** @see list */
        fun list(
            params: SimCardGroupListParams = SimCardGroupListParams.none()
        ): CompletableFuture<HttpResponseFor<SimCardGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SimCardGroupListPageAsync>> =
            list(SimCardGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /sim_card_groups/{id}`, but is otherwise the same
         * as [SimCardGroupServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<SimCardGroupDeleteResponse>> =
            delete(id, SimCardGroupDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SimCardGroupDeleteParams = SimCardGroupDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SimCardGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SimCardGroupDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SimCardGroupDeleteParams
        ): CompletableFuture<HttpResponseFor<SimCardGroupDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupDeleteResponse>> =
            delete(id, SimCardGroupDeleteParams.none(), requestOptions)
    }
}
