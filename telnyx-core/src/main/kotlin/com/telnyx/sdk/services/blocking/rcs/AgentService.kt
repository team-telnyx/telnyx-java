// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.services.blocking.rcs.agents.TestDeviceService
import java.util.function.Consumer

/** Manage RCS agent registration, testing, verification, and launch. */
interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService

    /** Manage RCS agent registration, testing, verification, and launch. */
    fun testDevices(): TestDeviceService

    /**
     * Creates an editable RCS agent draft under a brand. The `Idempotency-Key` is scoped to the
     * authenticated organization. Reusing the key with the same request returns the original agent,
     * while reusing it with a different request returns a conflict.
     */
    fun create(params: AgentCreateParams): AgentResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse

    /**
     * Retrieves an RCS agent, section statuses, test devices, carrier approvals, and provider
     * capabilities.
     */
    fun retrieve(id: String): AgentResponse = retrieve(id, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): AgentResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): AgentResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AgentResponse =
        retrieve(id, AgentRetrieveParams.none(), requestOptions)

    /**
     * Updates one or more fields on an agent while its status is `CREATED`. Submitted agents cannot
     * be changed through this endpoint.
     */
    fun update(id: String): AgentResponse = update(id, AgentUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: AgentUpdateParams = AgentUpdateParams.none()): AgentResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse

    /** @see update */
    fun update(params: AgentUpdateParams): AgentResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): AgentResponse =
        update(id, AgentUpdateParams.none(), requestOptions)

    /** Lists RCS agents owned by the authenticated organization, optionally filtered by brand. */
    fun list(): List<AgentResponse> = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AgentResponse>

    /** @see list */
    fun list(params: AgentListParams = AgentListParams.none()): List<AgentResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<AgentResponse> =
        list(AgentListParams.none(), requestOptions)

    /**
     * Adds the campaign and testing configuration, then starts asynchronous carrier launch. Agent
     * basics must already be submitted. Repeating a launch that is already in progress returns the
     * current agent without creating new work.
     */
    fun launch(id: String, params: AgentLaunchParams): AgentResponse =
        launch(id, params, RequestOptions.none())

    /** @see launch */
    fun launch(
        id: String,
        params: AgentLaunchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse = launch(params.toBuilder().id(id).build(), requestOptions)

    /** @see launch */
    fun launch(params: AgentLaunchParams): AgentResponse = launch(params, RequestOptions.none())

    /** @see launch */
    fun launch(
        params: AgentLaunchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse

    /**
     * Lists carrier approval records for an RCS agent. The provider may expose per-carrier,
     * hub-level, or bot-level approval status.
     */
    fun retrieveCarrierApprovals(id: String): List<CarrierApprovalResponse> =
        retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none())

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        id: String,
        params: AgentRetrieveCarrierApprovalsParams = AgentRetrieveCarrierApprovalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CarrierApprovalResponse> =
        retrieveCarrierApprovals(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        id: String,
        params: AgentRetrieveCarrierApprovalsParams = AgentRetrieveCarrierApprovalsParams.none(),
    ): List<CarrierApprovalResponse> = retrieveCarrierApprovals(id, params, RequestOptions.none())

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        params: AgentRetrieveCarrierApprovalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<CarrierApprovalResponse>

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        params: AgentRetrieveCarrierApprovalsParams
    ): List<CarrierApprovalResponse> = retrieveCarrierApprovals(params, RequestOptions.none())

    /** @see retrieveCarrierApprovals */
    fun retrieveCarrierApprovals(
        id: String,
        requestOptions: RequestOptions,
    ): List<CarrierApprovalResponse> =
        retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none(), requestOptions)

    /**
     * Starts asynchronous provider provisioning and submits the agent's basic configuration. The
     * brand must be `VERIFIED`. Repeating this request for an in-progress agent returns its current
     * state without creating new work.
     */
    fun submit(id: String): AgentResponse = submit(id, AgentSubmitParams.none())

    /** @see submit */
    fun submit(
        id: String,
        params: AgentSubmitParams = AgentSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse = submit(params.toBuilder().id(id).build(), requestOptions)

    /** @see submit */
    fun submit(id: String, params: AgentSubmitParams = AgentSubmitParams.none()): AgentResponse =
        submit(id, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: AgentSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentResponse

    /** @see submit */
    fun submit(params: AgentSubmitParams): AgentResponse = submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(id: String, requestOptions: RequestOptions): AgentResponse =
        submit(id, AgentSubmitParams.none(), requestOptions)

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService.WithRawResponse

        /** Manage RCS agent registration, testing, verification, and launch. */
        fun testDevices(): TestDeviceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rcs/agents`, but is otherwise the same as
         * [AgentService.create].
         */
        @MustBeClosed
        fun create(params: AgentCreateParams): HttpResponseFor<AgentResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse>

        /**
         * Returns a raw HTTP response for `get /rcs/agents/{id}`, but is otherwise the same as
         * [AgentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AgentResponse> =
            retrieve(id, AgentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): HttpResponseFor<AgentResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AgentRetrieveParams): HttpResponseFor<AgentResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<AgentResponse> =
            retrieve(id, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rcs/agents/{id}`, but is otherwise the same as
         * [AgentService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<AgentResponse> =
            update(id, AgentUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): HttpResponseFor<AgentResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AgentUpdateParams): HttpResponseFor<AgentResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<AgentResponse> =
            update(id, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rcs/agents`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<AgentResponse>> = list(AgentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AgentResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): HttpResponseFor<List<AgentResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<AgentResponse>> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rcs/agents/{id}/launch`, but is otherwise the same
         * as [AgentService.launch].
         */
        @MustBeClosed
        fun launch(id: String, params: AgentLaunchParams): HttpResponseFor<AgentResponse> =
            launch(id, params, RequestOptions.none())

        /** @see launch */
        @MustBeClosed
        fun launch(
            id: String,
            params: AgentLaunchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse> =
            launch(params.toBuilder().id(id).build(), requestOptions)

        /** @see launch */
        @MustBeClosed
        fun launch(params: AgentLaunchParams): HttpResponseFor<AgentResponse> =
            launch(params, RequestOptions.none())

        /** @see launch */
        @MustBeClosed
        fun launch(
            params: AgentLaunchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse>

        /**
         * Returns a raw HTTP response for `get /rcs/agents/{id}/carrier_approvals`, but is
         * otherwise the same as [AgentService.retrieveCarrierApprovals].
         */
        @MustBeClosed
        fun retrieveCarrierApprovals(id: String): HttpResponseFor<List<CarrierApprovalResponse>> =
            retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none())

        /** @see retrieveCarrierApprovals */
        @MustBeClosed
        fun retrieveCarrierApprovals(
            id: String,
            params: AgentRetrieveCarrierApprovalsParams =
                AgentRetrieveCarrierApprovalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CarrierApprovalResponse>> =
            retrieveCarrierApprovals(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveCarrierApprovals */
        @MustBeClosed
        fun retrieveCarrierApprovals(
            id: String,
            params: AgentRetrieveCarrierApprovalsParams = AgentRetrieveCarrierApprovalsParams.none(),
        ): HttpResponseFor<List<CarrierApprovalResponse>> =
            retrieveCarrierApprovals(id, params, RequestOptions.none())

        /** @see retrieveCarrierApprovals */
        @MustBeClosed
        fun retrieveCarrierApprovals(
            params: AgentRetrieveCarrierApprovalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<CarrierApprovalResponse>>

        /** @see retrieveCarrierApprovals */
        @MustBeClosed
        fun retrieveCarrierApprovals(
            params: AgentRetrieveCarrierApprovalsParams
        ): HttpResponseFor<List<CarrierApprovalResponse>> =
            retrieveCarrierApprovals(params, RequestOptions.none())

        /** @see retrieveCarrierApprovals */
        @MustBeClosed
        fun retrieveCarrierApprovals(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CarrierApprovalResponse>> =
            retrieveCarrierApprovals(id, AgentRetrieveCarrierApprovalsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /rcs/agents/{id}/submit`, but is otherwise the same
         * as [AgentService.submit].
         */
        @MustBeClosed
        fun submit(id: String): HttpResponseFor<AgentResponse> =
            submit(id, AgentSubmitParams.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            id: String,
            params: AgentSubmitParams = AgentSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse> =
            submit(params.toBuilder().id(id).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        fun submit(
            id: String,
            params: AgentSubmitParams = AgentSubmitParams.none(),
        ): HttpResponseFor<AgentResponse> = submit(id, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: AgentSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentResponse>

        /** @see submit */
        @MustBeClosed
        fun submit(params: AgentSubmitParams): HttpResponseFor<AgentResponse> =
            submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(id: String, requestOptions: RequestOptions): HttpResponseFor<AgentResponse> =
            submit(id, AgentSubmitParams.none(), requestOptions)
    }
}
