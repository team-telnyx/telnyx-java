// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email.dedicatedips

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpShowResponse
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionCompleteWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionPauseWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionResumeWarmupParams
import com.telnyx.sdk.models.email.dedicatedips.actions.ActionStartWarmupParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

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
    fun completeWarmup(id: String): CompletableFuture<DedicatedIpShowResponse> =
        completeWarmup(id, ActionCompleteWarmupParams.none())

    /** @see completeWarmup */
    fun completeWarmup(
        id: String,
        params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        completeWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see completeWarmup */
    fun completeWarmup(
        id: String,
        params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        completeWarmup(id, params, RequestOptions.none())

    /** @see completeWarmup */
    fun completeWarmup(
        params: ActionCompleteWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /** @see completeWarmup */
    fun completeWarmup(
        params: ActionCompleteWarmupParams
    ): CompletableFuture<DedicatedIpShowResponse> = completeWarmup(params, RequestOptions.none())

    /** @see completeWarmup */
    fun completeWarmup(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        completeWarmup(id, ActionCompleteWarmupParams.none(), requestOptions)

    /**
     * Pause the warm-up ramp at its current stage. While paused, the IP releases no first-attempt
     * sends from hold and the ramp does not advance. Only a `warming_up` IP can be paused; pausing
     * an already paused IP refreshes `paused_at`.
     */
    fun pauseWarmup(id: String): CompletableFuture<DedicatedIpShowResponse> =
        pauseWarmup(id, ActionPauseWarmupParams.none())

    /** @see pauseWarmup */
    fun pauseWarmup(
        id: String,
        params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        pauseWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see pauseWarmup */
    fun pauseWarmup(
        id: String,
        params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
    ): CompletableFuture<DedicatedIpShowResponse> = pauseWarmup(id, params, RequestOptions.none())

    /** @see pauseWarmup */
    fun pauseWarmup(
        params: ActionPauseWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /** @see pauseWarmup */
    fun pauseWarmup(params: ActionPauseWarmupParams): CompletableFuture<DedicatedIpShowResponse> =
        pauseWarmup(params, RequestOptions.none())

    /** @see pauseWarmup */
    fun pauseWarmup(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        pauseWarmup(id, ActionPauseWarmupParams.none(), requestOptions)

    /**
     * Resume a paused warm-up ramp from its held stage. Only a `warming_up` IP can be resumed;
     * resuming a ramp that is not paused returns the IP unchanged.
     */
    fun resumeWarmup(id: String): CompletableFuture<DedicatedIpShowResponse> =
        resumeWarmup(id, ActionResumeWarmupParams.none())

    /** @see resumeWarmup */
    fun resumeWarmup(
        id: String,
        params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        resumeWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see resumeWarmup */
    fun resumeWarmup(
        id: String,
        params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
    ): CompletableFuture<DedicatedIpShowResponse> = resumeWarmup(id, params, RequestOptions.none())

    /** @see resumeWarmup */
    fun resumeWarmup(
        params: ActionResumeWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /** @see resumeWarmup */
    fun resumeWarmup(params: ActionResumeWarmupParams): CompletableFuture<DedicatedIpShowResponse> =
        resumeWarmup(params, RequestOptions.none())

    /** @see resumeWarmup */
    fun resumeWarmup(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        resumeWarmup(id, ActionResumeWarmupParams.none(), requestOptions)

    /**
     * Start the warm-up ramp (`provisioning` to `warming_up`). The ramp never starts automatically.
     * Only a `provisioning` IP can be started; a `suspended` IP returns `409`. Starting does not
     * check DNS: the IP carries mail only while `dns_confirmed_at` is set and the IP is in a pool
     * that routes mail.
     */
    fun startWarmup(id: String): CompletableFuture<DedicatedIpShowResponse> =
        startWarmup(id, ActionStartWarmupParams.none())

    /** @see startWarmup */
    fun startWarmup(
        id: String,
        params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        startWarmup(params.toBuilder().id(id).build(), requestOptions)

    /** @see startWarmup */
    fun startWarmup(
        id: String,
        params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
    ): CompletableFuture<DedicatedIpShowResponse> = startWarmup(id, params, RequestOptions.none())

    /** @see startWarmup */
    fun startWarmup(
        params: ActionStartWarmupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /** @see startWarmup */
    fun startWarmup(params: ActionStartWarmupParams): CompletableFuture<DedicatedIpShowResponse> =
        startWarmup(params, RequestOptions.none())

    /** @see startWarmup */
    fun startWarmup(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        startWarmup(id, ActionStartWarmupParams.none(), requestOptions)

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/complete_warmup`,
         * but is otherwise the same as [ActionServiceAsync.completeWarmup].
         */
        fun completeWarmup(
            id: String
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            completeWarmup(id, ActionCompleteWarmupParams.none())

        /** @see completeWarmup */
        fun completeWarmup(
            id: String,
            params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            completeWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see completeWarmup */
        fun completeWarmup(
            id: String,
            params: ActionCompleteWarmupParams = ActionCompleteWarmupParams.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            completeWarmup(id, params, RequestOptions.none())

        /** @see completeWarmup */
        fun completeWarmup(
            params: ActionCompleteWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /** @see completeWarmup */
        fun completeWarmup(
            params: ActionCompleteWarmupParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            completeWarmup(params, RequestOptions.none())

        /** @see completeWarmup */
        fun completeWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            completeWarmup(id, ActionCompleteWarmupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/pause_warmup`,
         * but is otherwise the same as [ActionServiceAsync.pauseWarmup].
         */
        fun pauseWarmup(id: String): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            pauseWarmup(id, ActionPauseWarmupParams.none())

        /** @see pauseWarmup */
        fun pauseWarmup(
            id: String,
            params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            pauseWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see pauseWarmup */
        fun pauseWarmup(
            id: String,
            params: ActionPauseWarmupParams = ActionPauseWarmupParams.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            pauseWarmup(id, params, RequestOptions.none())

        /** @see pauseWarmup */
        fun pauseWarmup(
            params: ActionPauseWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /** @see pauseWarmup */
        fun pauseWarmup(
            params: ActionPauseWarmupParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            pauseWarmup(params, RequestOptions.none())

        /** @see pauseWarmup */
        fun pauseWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            pauseWarmup(id, ActionPauseWarmupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/resume_warmup`,
         * but is otherwise the same as [ActionServiceAsync.resumeWarmup].
         */
        fun resumeWarmup(id: String): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            resumeWarmup(id, ActionResumeWarmupParams.none())

        /** @see resumeWarmup */
        fun resumeWarmup(
            id: String,
            params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            resumeWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see resumeWarmup */
        fun resumeWarmup(
            id: String,
            params: ActionResumeWarmupParams = ActionResumeWarmupParams.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            resumeWarmup(id, params, RequestOptions.none())

        /** @see resumeWarmup */
        fun resumeWarmup(
            params: ActionResumeWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /** @see resumeWarmup */
        fun resumeWarmup(
            params: ActionResumeWarmupParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            resumeWarmup(params, RequestOptions.none())

        /** @see resumeWarmup */
        fun resumeWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            resumeWarmup(id, ActionResumeWarmupParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips/{id}/actions/start_warmup`,
         * but is otherwise the same as [ActionServiceAsync.startWarmup].
         */
        fun startWarmup(id: String): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            startWarmup(id, ActionStartWarmupParams.none())

        /** @see startWarmup */
        fun startWarmup(
            id: String,
            params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            startWarmup(params.toBuilder().id(id).build(), requestOptions)

        /** @see startWarmup */
        fun startWarmup(
            id: String,
            params: ActionStartWarmupParams = ActionStartWarmupParams.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            startWarmup(id, params, RequestOptions.none())

        /** @see startWarmup */
        fun startWarmup(
            params: ActionStartWarmupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /** @see startWarmup */
        fun startWarmup(
            params: ActionStartWarmupParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            startWarmup(params, RequestOptions.none())

        /** @see startWarmup */
        fun startWarmup(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            startWarmup(id, ActionStartWarmupParams.none(), requestOptions)
    }
}
