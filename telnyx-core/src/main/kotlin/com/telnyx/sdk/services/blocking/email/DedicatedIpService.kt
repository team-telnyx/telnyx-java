// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.email

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpCreateParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpDeleteParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpListParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpListResponse
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpRetrieveParams
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpShowResponse
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIpUpdateParams
import com.telnyx.sdk.services.blocking.email.dedicatedips.ActionService
import java.util.function.Consumer

/** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
interface DedicatedIpService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DedicatedIpService

    /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
    fun actions(): ActionService

    /**
     * Purchase a dedicated sending IP. Requires a verified, enterprise, or legacy account, and an
     * `Idempotency-Key` header: a request without the header returns `400` (code `10015`) and
     * allocates nothing. Telnyx allocates the next available IP from stock. The optional `region`
     * and `ip_version` fields each restrict which stock IP is allocated; they never change the
     * allocated IP's metadata. An omitted field applies no restriction for that field, and omitting
     * the body applies neither restriction. An unsupported selector value returns `422`; a
     * supported value that matches no available IP returns `429` and records the request on the
     * waitlist. Billing: $14/month/IP, charged as a monthly recurring charge (MRC) from purchase.
     * The IP is returned in `provisioning` status with a Telnyx-managed PTR hostname and carries no
     * mail until you call `start_warmup` and add it to a pool that routes mail.
     */
    fun create(params: DedicatedIpCreateParams): DedicatedIpShowResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DedicatedIpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /**
     * Retrieve a single dedicated IP by its identifier, including warm-up state, billing state, and
     * the DNS/PTR provisioning checklist.
     */
    fun retrieve(id: String): DedicatedIpShowResponse =
        retrieve(id, DedicatedIpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
    ): DedicatedIpShowResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DedicatedIpRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /** @see retrieve */
    fun retrieve(params: DedicatedIpRetrieveParams): DedicatedIpShowResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DedicatedIpShowResponse =
        retrieve(id, DedicatedIpRetrieveParams.none(), requestOptions)

    /**
     * Move the IP to another pool, or pause/resume its warm-up ramp. One change applies per
     * request. `pool_id` takes precedence over warm-up changes. Otherwise, use `warmup_paused` or
     * `warmup.paused`; a Boolean `warmup_paused` takes precedence. Moving the last IP out of a pool
     * requires `force: true` and `drain: true`. The PTR hostname is managed by Telnyx: a request
     * that includes `ptr_hostname` returns `422` unless `pool_id` or a warm-up field is present, in
     * which case `ptr_hostname` is ignored.
     */
    fun update(id: String): DedicatedIpShowResponse = update(id, DedicatedIpUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
    ): DedicatedIpShowResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DedicatedIpUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /** @see update */
    fun update(params: DedicatedIpUpdateParams): DedicatedIpShowResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): DedicatedIpShowResponse =
        update(id, DedicatedIpUpdateParams.none(), requestOptions)

    /**
     * List the dedicated sending IPs owned by the account, newest first. Narrow the list with
     * `filter[status]`, `filter[pool_id]`, and `filter[region]`; supplied filters combine, so an IP
     * must match every one. An empty value, or a nested or array value such as
     * `filter[status][]=active`, applies no filter, and other `filter[...]` keys are ignored. A
     * value that no IP can match (an unknown status, a `pool_id` that is not a UUID, or a value
     * containing a NUL byte) returns an empty list, not an error.
     */
    fun list(): DedicatedIpListResponse = list(DedicatedIpListParams.none())

    /** @see list */
    fun list(
        params: DedicatedIpListParams = DedicatedIpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpListResponse

    /** @see list */
    fun list(
        params: DedicatedIpListParams = DedicatedIpListParams.none()
    ): DedicatedIpListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DedicatedIpListResponse =
        list(DedicatedIpListParams.none(), requestOptions)

    /**
     * Release the dedicated IP to Telnyx. The IP stops carrying mail immediately, leaves its pool,
     * and moves to `released`. Telnyx sets `quarantine_until` to 30 days after release. Release
     * requests that the MRC stop asynchronously. Check `billing`: `stopping` means the stop is
     * pending, `stopped` means it completed, and `stop_failed` means the charge remains. If the
     * charge was never created or its creation has not completed, `billing` keeps showing the
     * creation status (`not_started`, `pending`, `in_progress`, or `failed`). Any status except
     * `released` can be released. Releasing the last IP in a pool requires `force=true` and
     * `drain=true`.
     */
    fun delete(id: String): DedicatedIpShowResponse = delete(id, DedicatedIpDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
    ): DedicatedIpShowResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DedicatedIpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DedicatedIpShowResponse

    /** @see delete */
    fun delete(params: DedicatedIpDeleteParams): DedicatedIpShowResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): DedicatedIpShowResponse =
        delete(id, DedicatedIpDeleteParams.none(), requestOptions)

    /**
     * A view of [DedicatedIpService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DedicatedIpService.WithRawResponse

        /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips`, but is otherwise the same as
         * [DedicatedIpService.create].
         */
        @MustBeClosed
        fun create(params: DedicatedIpCreateParams): HttpResponseFor<DedicatedIpShowResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DedicatedIpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /**
         * Returns a raw HTTP response for `get /email/dedicated_ips/{id}`, but is otherwise the
         * same as [DedicatedIpService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DedicatedIpShowResponse> =
            retrieve(id, DedicatedIpRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DedicatedIpRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DedicatedIpRetrieveParams): HttpResponseFor<DedicatedIpShowResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DedicatedIpShowResponse> =
            retrieve(id, DedicatedIpRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email/dedicated_ips/{id}`, but is otherwise the
         * same as [DedicatedIpService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<DedicatedIpShowResponse> =
            update(id, DedicatedIpUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DedicatedIpUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: DedicatedIpUpdateParams): HttpResponseFor<DedicatedIpShowResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DedicatedIpShowResponse> =
            update(id, DedicatedIpUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email/dedicated_ips`, but is otherwise the same as
         * [DedicatedIpService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DedicatedIpListResponse> = list(DedicatedIpListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DedicatedIpListParams = DedicatedIpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DedicatedIpListParams = DedicatedIpListParams.none()
        ): HttpResponseFor<DedicatedIpListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DedicatedIpListResponse> =
            list(DedicatedIpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email/dedicated_ips/{id}`, but is otherwise the
         * same as [DedicatedIpService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<DedicatedIpShowResponse> =
            delete(id, DedicatedIpDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
        ): HttpResponseFor<DedicatedIpShowResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DedicatedIpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DedicatedIpShowResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: DedicatedIpDeleteParams): HttpResponseFor<DedicatedIpShowResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DedicatedIpShowResponse> =
            delete(id, DedicatedIpDeleteParams.none(), requestOptions)
    }
}
