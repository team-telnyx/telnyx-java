// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email.dedicatedips

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpShowResponse
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionCompleteWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionPauseWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionResumeWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionStartWarmupParams
import java.util.function.Consumer

/** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

    /**
     * Manually complete the warm-up ramp (`warming_up` to `active`), bypassing the schedule. Use
     * only for an IP already warmed elsewhere. Completion sets `warmup.progress` to `100`, clears
     * `warmup.daily_cap`, and applies the ramp-complete allowance to the current UTC day:
     * `warmup.today.cap` becomes `100000000`, `warmup.today.granted` keeps the sends already
     * released today, and `warmup.today.remaining` becomes `cap` minus `granted`. Once completion
     * applies this allowance, an exhausted stage allowance does not block the next eligible
     * first-attempt send. The response reports these values. On an `active` IP, `warmup.progress`
     * and `warmup.daily_cap` are informational: they can keep earlier values after a suspension is
     * lifted and do not limit sending.
     */
    fun completeWarmup(id: String): DedicatedIpShowResponse =
        completeWarmup(id, ActionCompleteWarmupParams.none())

    /** @see completeWarmup */
    fun completeWarmup(
        id: String,
        params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse = completeWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see completeWarmup */
    fun completeWarmup(
        id: String,
        params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
    ): DedicatedIpShowResponse = completeWarmup(id, params, RequestOptions.none())

    /** @see completeWarmup */
    fun completeWarmup(
        params: ActionCompleteWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /** @see completeWarmup */
    fun completeWarmup(params: ActionCompleteWarmupParams): DedicatedIpShowResponse =
        completeWarmup(params, RequestOptions.none())

    /** @see completeWarmup */
    fun completeWarmup(id: String, requestOptions: RequestOptions): DedicatedIpShowResponse =
        completeWarmup(id, ActionCompleteWarmupParams.none(), requestOptions)

    /**
     * Pause the warm-up ramp at its current stage. While paused, the IP releases no first-attempt
     * sends from hold and the ramp does not advance. Only a `warming_up` IP can be paused; pausing
     * an already paused IP refreshes `paused_at`.
     */
    fun pauseWarmup(id: String): DedicatedIpShowResponse =
        pauseWarmup(id, ActionPauseWarmupParams.none())

    /** @see pauseWarmup */
    fun pauseWarmup(
        id: String,
        params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse = pauseWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see pauseWarmup */
    fun pauseWarmup(
        id: String,
        params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
    ): DedicatedIpShowResponse = pauseWarmup(id, params, RequestOptions.none())

    /** @see pauseWarmup */
    fun pauseWarmup(
        params: ActionPauseWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /** @see pauseWarmup */
    fun pauseWarmup(params: ActionPauseWarmupParams): DedicatedIpShowResponse =
        pauseWarmup(params, RequestOptions.none())

    /** @see pauseWarmup */
    fun pauseWarmup(id: String, requestOptions: RequestOptions): DedicatedIpShowResponse =
        pauseWarmup(id, ActionPauseWarmupParams.none(), requestOptions)

    /**
     * Resume a paused warm-up ramp from its held stage. Only a `warming_up` IP can be resumed;
     * resuming a ramp that is not paused returns the IP unchanged.
     */
    fun resumeWarmup(id: String): DedicatedIpShowResponse =
        resumeWarmup(id, ActionResumeWarmupParams.none())

    /** @see resumeWarmup */
    fun resumeWarmup(
        id: String,
        params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse = resumeWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see resumeWarmup */
    fun resumeWarmup(
        id: String,
        params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
    ): DedicatedIpShowResponse = resumeWarmup(id, params, RequestOptions.none())

    /** @see resumeWarmup */
    fun resumeWarmup(
        params: ActionResumeWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /** @see resumeWarmup */
    fun resumeWarmup(params: ActionResumeWarmupParams): DedicatedIpShowResponse =
        resumeWarmup(params, RequestOptions.none())

    /** @see resumeWarmup */
    fun resumeWarmup(id: String, requestOptions: RequestOptions): DedicatedIpShowResponse =
        resumeWarmup(id, ActionResumeWarmupParams.none(), requestOptions)

    /**
     * Start the warm-up ramp (`provisioning` to `warming_up`). The ramp never starts automatically.
     * Only a `provisioning` IP can be started; a `suspended` IP returns `409`. Starting does not
     * check DNS: the IP carries mail only while `dns_confirmed_at` is set and the IP is in a pool
     * that routes mail.
     */
    fun startWarmup(id: String): DedicatedIpShowResponse =
        startWarmup(id, ActionStartWarmupParams.none())

    /** @see startWarmup */
    fun startWarmup(
        id: String,
        params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse = startWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see startWarmup */
    fun startWarmup(
        id: String,
        params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
    ): DedicatedIpShowResponse = startWarmup(id, params, RequestOptions.none())

    /** @see startWarmup */
    fun startWarmup(
        params: ActionStartWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /** @see startWarmup */
    fun startWarmup(params: ActionStartWarmupParams): DedicatedIpShowResponse =
        startWarmup(params, RequestOptions.none())

    /** @see startWarmup */
    fun startWarmup(id: String, requestOptions: RequestOptions): DedicatedIpShowResponse =
        startWarmup(id, ActionStartWarmupParams.none(), requestOptions)

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/complete_warmup`,
         * but is otherwise the same as [ActionService.completeWarmup].
         */
        @MustBeClosed
        fun completeWarmup(id: String): HttpResponseFor<DedicatedIpShowResponse> =
            completeWarmup(id, ActionCompleteWarmupParams.none())

        /** @see completeWarmup */
        @MustBeClosed
        fun completeWarmup(
            id: String,
            params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            completeWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see completeWarmup */
        @MustBeClosed
        fun completeWarmup(
            id: String,
            params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            completeWarmup(id, params, RequestOptions.none())

        /** @see completeWarmup */
        @MustBeClosed
        fun completeWarmup(
            params: ActionCompleteWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /** @see completeWarmup */
        @MustBeClosed
        fun completeWarmup(
            params: ActionCompleteWarmupParams
        ): HttpResponseFor<DedicatedIpShowResponse> = completeWarmup(params, RequestOptions.none())

        /** @see completeWarmup */
        @MustBeClosed
        fun completeWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DedicatedIpShowResponse> =
            completeWarmup(id, ActionCompleteWarmupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/pause_warmup`,
         * but is otherwise the same as [ActionService.pauseWarmup].
         */
        @MustBeClosed
        fun pauseWarmup(id: String): HttpResponseFor<DedicatedIpShowResponse> =
            pauseWarmup(id, ActionPauseWarmupParams.none())

        /** @see pauseWarmup */
        @MustBeClosed
        fun pauseWarmup(
            id: String,
            params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            pauseWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see pauseWarmup */
        @MustBeClosed
        fun pauseWarmup(
            id: String,
            params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> = pauseWarmup(id, params, RequestOptions.none())

        /** @see pauseWarmup */
        @MustBeClosed
        fun pauseWarmup(
            params: ActionPauseWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /** @see pauseWarmup */
        @MustBeClosed
        fun pauseWarmup(params: ActionPauseWarmupParams): HttpResponseFor<DedicatedIpShowResponse> =
            pauseWarmup(params, RequestOptions.none())

        /** @see pauseWarmup */
        @MustBeClosed
        fun pauseWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DedicatedIpShowResponse> =
            pauseWarmup(id, ActionPauseWarmupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/resume_warmup`,
         * but is otherwise the same as [ActionService.resumeWarmup].
         */
        @MustBeClosed
        fun resumeWarmup(id: String): HttpResponseFor<DedicatedIpShowResponse> =
            resumeWarmup(id, ActionResumeWarmupParams.none())

        /** @see resumeWarmup */
        @MustBeClosed
        fun resumeWarmup(
            id: String,
            params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            resumeWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see resumeWarmup */
        @MustBeClosed
        fun resumeWarmup(
            id: String,
            params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            resumeWarmup(id, params, RequestOptions.none())

        /** @see resumeWarmup */
        @MustBeClosed
        fun resumeWarmup(
            params: ActionResumeWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /** @see resumeWarmup */
        @MustBeClosed
        fun resumeWarmup(
            params: ActionResumeWarmupParams
        ): HttpResponseFor<DedicatedIpShowResponse> = resumeWarmup(params, RequestOptions.none())

        /** @see resumeWarmup */
        @MustBeClosed
        fun resumeWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DedicatedIpShowResponse> =
            resumeWarmup(id, ActionResumeWarmupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/start_warmup`,
         * but is otherwise the same as [ActionService.startWarmup].
         */
        @MustBeClosed
        fun startWarmup(id: String): HttpResponseFor<DedicatedIpShowResponse> =
            startWarmup(id, ActionStartWarmupParams.none())

        /** @see startWarmup */
        @MustBeClosed
        fun startWarmup(
            id: String,
            params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            startWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see startWarmup */
        @MustBeClosed
        fun startWarmup(
            id: String,
            params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> = startWarmup(id, params, RequestOptions.none())

        /** @see startWarmup */
        @MustBeClosed
        fun startWarmup(
            params: ActionStartWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /** @see startWarmup */
        @MustBeClosed
        fun startWarmup(params: ActionStartWarmupParams): HttpResponseFor<DedicatedIpShowResponse> =
            startWarmup(params, RequestOptions.none())

        /** @see startWarmup */
        @MustBeClosed
        fun startWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DedicatedIpShowResponse> =
            startWarmup(id, ActionStartWarmupParams.none(), requestOptions)
    }
}
