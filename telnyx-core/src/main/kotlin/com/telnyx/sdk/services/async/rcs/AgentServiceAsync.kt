// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rcs

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rcs.agents.AgentCreateParams
import com.telnyx.sdk.models.rcs.agents.AgentLaunchParams
import com.telnyx.sdk.models.rcs.agents.AgentListParams
import com.telnyx.sdk.models.rcs.agents.AgentResponse
import com.telnyx.sdk.models.rcs.agents.AgentRetrieveCarrierApprovalsParams
import com.telnyx.sdk.models.rcs.agents.AgentRetrieveParams
import com.telnyx.sdk.models.rcs.agents.AgentSubmitParams
import com.telnyx.sdk.models.rcs.agents.AgentUpdateParams
import com.telnyx.sdk.models.rcs.agents.CarrierApprovalResponse
import com.telnyx.sdk.services.async.rcs.agents.TestDeviceServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage RCS agent registration, testing, verification, and launch. */
interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync

    /** Manage RCS agent registration, testing, verification, and launch. */
    fun testDevices(): TestDeviceServiceAsync

    /**
     * Creates an editable RCS agent draft under a brand. The `Idempotency-Key` is scoped to the
     * authenticated organization. Reusing the key with the same request returns the original agent,
     * while reusing it with a different request returns a conflict.
     */
    fun create(params: AgentCreateParams): CompletableFuture<AgentResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /**
     * Retrieves an RCS agent, section statuses, test devices, carrier approvals, and provider
     * capabilities.
     */
    fun retrieve(id: String): CompletableFuture<AgentResponse> =
        retrieve(id, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): CompletableFuture<AgentResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): CompletableFuture<AgentResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AgentResponse> =
        retrieve(id, AgentRetrieveParams.none(), requestOptions)

    /**
     * Updates one or more fields on an agent while its status is `CREATED`. Submitted agents cannot
     * be changed through this endpoint.
     */
    fun update(id: String): CompletableFuture<AgentResponse> = update(id, AgentUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): CompletableFuture<AgentResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /** @see update */
    fun update(params: AgentUpdateParams): CompletableFuture<AgentResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<AgentResponse> =
        update(id, AgentUpdateParams.none(), requestOptions)

    /** Lists RCS agents owned by the authenticated organization, optionally filtered by brand. */
    fun list(): CompletableFuture<List<AgentResponse>> = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AgentResponse>>

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none()
    ): CompletableFuture<List<AgentResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<AgentResponse>> =
        list(AgentListParams.none(), requestOptions)

    /**
     * Adds the campaign and testing configuration, then starts asynchronous carrier launch. Agent
     * basics must already be submitted. Repeating a launch that is already in progress returns the
     * current agent without creating new work.
     */
    fun launch(id: String, params: AgentLaunchParams): CompletableFuture<AgentResponse> =
        launch(id, params, RequestOptions.none())

    /** @see launch */
    fun launch(
        id: String,
        params: AgentLaunchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse> = launch(params.toBuilder().id(id).build(), requestOptions)

    /** @see launch */
    fun launch(params: AgentLaunchParams): CompletableFuture<AgentResponse> =
        launch(params, RequestOptions.none())

    /** @see launch */
    fun launch(
        params: AgentLaunchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /**
     * Lists carrier approval records for an RCS agent. The provider may expose per-carrier,
     * hub-level, or bot-level approval status.
     */
    fun retrieveCarrierApprovals(id: String): CompletableFuture<List<CarrierApprovalResponse>> =
        retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none())

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        id: String,
        params: AgentRetrieveCarrierApprovalsParams = AgentRetrieveCarrierApprovalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CarrierApprovalResponse>> =
        retrieveCarrierApprovals(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        id: String,
        params: AgentRetrieveCarrierApprovalsParams = AgentRetrieveCarrierApprovalsParams.none(),
    ): CompletableFuture<List<CarrierApprovalResponse>> =
        retrieveCarrierApprovals(id, params, RequestOptions.none())

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        params: AgentRetrieveCarrierApprovalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CarrierApprovalResponse>>

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        params: AgentRetrieveCarrierApprovalsParams
    ): CompletableFuture<List<CarrierApprovalResponse>> =
        retrieveCarrierApprovals(params, RequestOptions.none())

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CarrierApprovalResponse>> =
        retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none(), requestOptions)

    /**
     * Starts asynchronous provider provisioning and submits the agent's basic configuration. The
     * brand must be `VERIFIED`. Repeating this request for an in-progress agent returns its current
     * state without creating new work.
     */
    fun submit(id: String): CompletableFuture<AgentResponse> = submit(id, AgentSubmitParams.none())

    /** @see submit */
    fun submit(
        id: String,
        params: AgentSubmitParams = AgentSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse> = submit(params.toBuilder().id(id).build(), requestOptions)

    /** @see submit */
    fun submit(
        id: String,
        params: AgentSubmitParams = AgentSubmitParams.none(),
    ): CompletableFuture<AgentResponse> = submit(id, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: AgentSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentResponse>

    /** @see submit */
    fun submit(params: AgentSubmitParams): CompletableFuture<AgentResponse> =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(id: String, requestOptions: RequestOptions): CompletableFuture<AgentResponse> =
        submit(id, AgentSubmitParams.none(), requestOptions)

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse

        /** Manage RCS agent registration, testing, verification, and launch. */
        fun testDevices(): TestDeviceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rcs/agents`, but is otherwise the same as
         * [AgentServiceAsync.create].
         */
        fun create(params: AgentCreateParams): CompletableFuture<HttpResponseFor<AgentResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /**
         * Returns a raw HTTP response for `get /rcs/agents/{id}`, but is otherwise the same as
         * [AgentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(id, AgentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            retrieve(id, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rcs/agents/{id}`, but is otherwise the same as
         * [AgentServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(id, AgentUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /** @see update */
        fun update(params: AgentUpdateParams): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            update(id, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rcs/agents`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<AgentResponse>>> =
            list(AgentListParams.none())

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AgentResponse>>>

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): CompletableFuture<HttpResponseFor<List<AgentResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<AgentResponse>>> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rcs/agents/{id}/launch`, but is otherwise the same
         * as [AgentServiceAsync.launch].
         */
        fun launch(
            id: String,
            params: AgentLaunchParams,
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            launch(id, params, RequestOptions.none())

        /** @see launch */
        fun launch(
            id: String,
            params: AgentLaunchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            launch(params.toBuilder().id(id).build(), requestOptions)

        /** @see launch */
        fun launch(params: AgentLaunchParams): CompletableFuture<HttpResponseFor<AgentResponse>> =
            launch(params, RequestOptions.none())

        /** @see launch */
        fun launch(
            params: AgentLaunchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /**
         * Returns a raw HTTP response for `get /rcs/agents/{id}/carrier_approvals`, but is
         * otherwise the same as [AgentServiceAsync.retrieveCarrierApprovals].
         */
        fun retrieveCarrierApprovals(
            id: String
        ): CompletableFuture<HttpResponseFor<List<CarrierApprovalResponse>>> =
            retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none())

        /** @see retrieveCarrierApprovals */
        fun retrieveCarrierApprovals(
            id: String,
            params: AgentRetrieveCarrierApprovalsParams =
                AgentRetrieveCarrierApprovalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CarrierApprovalResponse>>> =
            retrieveCarrierApprovals(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveCarrierApprovals */
        fun retrieveCarrierApprovals(
            id: String,
            params: AgentRetrieveCarrierApprovalsParams = AgentRetrieveCarrierApprovalsParams.none(),
        ): CompletableFuture<HttpResponseFor<List<CarrierApprovalResponse>>> =
            retrieveCarrierApprovals(id, params, RequestOptions.none())

        /** @see retrieveCarrierApprovals */
        fun retrieveCarrierApprovals(
            params: AgentRetrieveCarrierApprovalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CarrierApprovalResponse>>>

        /** @see retrieveCarrierApprovals */
        fun retrieveCarrierApprovals(
            params: AgentRetrieveCarrierApprovalsParams
        ): CompletableFuture<HttpResponseFor<List<CarrierApprovalResponse>>> =
            retrieveCarrierApprovals(params, RequestOptions.none())

        /** @see retrieveCarrierApprovals */
        fun retrieveCarrierApprovals(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CarrierApprovalResponse>>> =
            retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rcs/agents/{id}/submit`, but is otherwise the same
         * as [AgentServiceAsync.submit].
         */
        fun submit(id: String): CompletableFuture<HttpResponseFor<AgentResponse>> =
            submit(id, AgentSubmitParams.none())

        /** @see submit */
        fun submit(
            id: String,
            params: AgentSubmitParams = AgentSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            submit(params.toBuilder().id(id).build(), requestOptions)

        /** @see submit */
        fun submit(
            id: String,
            params: AgentSubmitParams = AgentSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            submit(id, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: AgentSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentResponse>>

        /** @see submit */
        fun submit(params: AgentSubmitParams): CompletableFuture<HttpResponseFor<AgentResponse>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentResponse>> =
            submit(id, AgentSubmitParams.none(), requestOptions)
    }
}
