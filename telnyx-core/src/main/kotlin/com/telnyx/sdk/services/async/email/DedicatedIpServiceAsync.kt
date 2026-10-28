// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.email

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
import com.telnyx.sdk.services.async.email.dedicatedips.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
interface DedicatedIpServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DedicatedIpServiceAsync

    /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
    fun actions(): ActionServiceAsync

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
    fun create(params: DedicatedIpCreateParams): CompletableFuture<DedicatedIpShowResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DedicatedIpCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /**
     * Retrieve a single dedicated IP by its identifier, including warm-up state, billing state, and
     * the DNS/PTR provisioning checklist.
     */
    fun retrieve(id: String): CompletableFuture<DedicatedIpShowResponse> =
        retrieve(id, DedicatedIpRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
    ): CompletableFuture<DedicatedIpShowResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DedicatedIpRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /** @see retrieve */
    fun retrieve(params: DedicatedIpRetrieveParams): CompletableFuture<DedicatedIpShowResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        retrieve(id, DedicatedIpRetrieveParams.none(), requestOptions)

    /**
     * Move the IP to another pool, or pause/resume its warm-up ramp. One change applies per
     * request. `pool_id` takes precedence over warm-up changes. Otherwise, use `warmup_paused` or
     * `warmup.paused`; a Boolean `warmup_paused` takes precedence. Moving the last IP out of a pool
     * requires `force: true` and `drain: true`. The PTR hostname is managed by Telnyx: a request
     * that includes `ptr_hostname` returns `422` unless `pool_id` or a warm-up field is present, in
     * which case `ptr_hostname` is ignored.
     */
    fun update(id: String): CompletableFuture<DedicatedIpShowResponse> =
        update(id, DedicatedIpUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
    ): CompletableFuture<DedicatedIpShowResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DedicatedIpUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /** @see update */
    fun update(params: DedicatedIpUpdateParams): CompletableFuture<DedicatedIpShowResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        update(id, DedicatedIpUpdateParams.none(), requestOptions)

    /**
     * List the dedicated sending IPs owned by the account, newest first. Narrow the list with
     * `filter[status]`, `filter[pool_id]`, and `filter[region]`; supplied filters combine, so an IP
     * must match every one. An empty value, or a nested or array value such as
     * `filter[status][]=active`, applies no filter, and other `filter[...]` keys are ignored. A
     * value that no IP can match (an unknown status, a `pool_id` that is not a UUID, or a value
     * containing a NUL byte) returns an empty list, not an error.
     */
    fun list(): CompletableFuture<DedicatedIpListResponse> = list(DedicatedIpListParams.none())

    /** @see list */
    fun list(
        params: DedicatedIpListParams = DedicatedIpListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpListResponse>

    /** @see list */
    fun list(
        params: DedicatedIpListParams = DedicatedIpListParams.none()
    ): CompletableFuture<DedicatedIpListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DedicatedIpListResponse> =
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
    fun delete(id: String): CompletableFuture<DedicatedIpShowResponse> =
        delete(id, DedicatedIpDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
    ): CompletableFuture<DedicatedIpShowResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DedicatedIpDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DedicatedIpShowResponse>

    /** @see delete */
    fun delete(params: DedicatedIpDeleteParams): CompletableFuture<DedicatedIpShowResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DedicatedIpShowResponse> =
        delete(id, DedicatedIpDeleteParams.none(), requestOptions)

    /**
     * A view of [DedicatedIpServiceAsync] that provides access to raw HTTP responses for each
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
        ): DedicatedIpServiceAsync.WithRawResponse

        /** Purchase and manage dedicated sending IP addresses for your Telnyx email traffic. */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email/dedicated_ips`, but is otherwise the same as
         * [DedicatedIpServiceAsync.create].
         */
        fun create(
            params: DedicatedIpCreateParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DedicatedIpCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /**
         * Returns a raw HTTP response for `get /email/dedicated_ips/{id}`, but is otherwise the
         * same as [DedicatedIpServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            retrieve(id, DedicatedIpRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DedicatedIpRetrieveParams = DedicatedIpRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DedicatedIpRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DedicatedIpRetrieveParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            retrieve(id, DedicatedIpRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email/dedicated_ips/{id}`, but is otherwise the
         * same as [DedicatedIpServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            update(id, DedicatedIpUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: DedicatedIpUpdateParams = DedicatedIpUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DedicatedIpUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /** @see update */
        fun update(
            params: DedicatedIpUpdateParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            update(id, DedicatedIpUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email/dedicated_ips`, but is otherwise the same as
         * [DedicatedIpServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DedicatedIpListResponse>> =
            list(DedicatedIpListParams.none())

        /** @see list */
        fun list(
            params: DedicatedIpListParams = DedicatedIpListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpListResponse>>

        /** @see list */
        fun list(
            params: DedicatedIpListParams = DedicatedIpListParams.none()
        ): CompletableFuture<HttpResponseFor<DedicatedIpListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DedicatedIpListResponse>> =
            list(DedicatedIpListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email/dedicated_ips/{id}`, but is otherwise the
         * same as [DedicatedIpServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            delete(id, DedicatedIpDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DedicatedIpDeleteParams = DedicatedIpDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DedicatedIpDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>>

        /** @see delete */
        fun delete(
            params: DedicatedIpDeleteParams
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DedicatedIpShowResponse>> =
            delete(id, DedicatedIpDeleteParams.none(), requestOptions)
    }
}
