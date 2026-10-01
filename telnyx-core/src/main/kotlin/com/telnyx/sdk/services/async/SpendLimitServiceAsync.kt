// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.spendlimits.SpendLimitCreateParams
import com.telnyx.sdk.models.spendlimits.SpendLimitDeleteParams
import com.telnyx.sdk.models.spendlimits.SpendLimitListParams
import com.telnyx.sdk.models.spendlimits.SpendLimitListResponse
import com.telnyx.sdk.models.spendlimits.SpendLimitResponse
import com.telnyx.sdk.models.spendlimits.SpendLimitUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Daily and monthly spend limits per product. A limit applies to the organization of the
 * authenticated user, or to the user's own account when they belong to no organization; every user
 * of the organization sees and changes the same limits.
 * - **Periods.** `daily` covers the current UTC day and `monthly` the current UTC calendar month.
 *   The two limits are independent: you can set either, both or neither.
 * - **Blocking.** When spend in a period goes above the limit (strictly greater), the product is
 *   blocked until the period ends: 00:00 UTC the next day for `daily`, 00:00 UTC on the 1st of the
 *   next month for `monthly`. A block appears within about 2 minutes (daily) or 10 minutes
 *   (monthly) of the spend being recorded.
 * - **Changes apply immediately.** Creating, updating or deleting a limit checks the period's spend
 *   in the same request: raising the limit above the spend, or removing it, lifts that period's
 *   block, and lowering it below the spend blocks the product at once. The `evaluation` object in
 *   the response says what happened.
 * - **Supported products.** Today only `inference` supports spend limits. A blocked account gets
 *   HTTP 403 with the error title `Inference spend limit reached` (code `10039`) on new billable
 *   chat completions, Responses, Anthropic Messages and classification requests; requests already
 *   running finish normally. Take the list of products from the list operation.
 * - **Limits set by Telnyx.** Telnyx support can also set a limit on your account. It is listed
 *   with `origin: operator` and you can update or delete it like your own.
 */
interface SpendLimitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendLimitServiceAsync

    /**
     * Sets a limit for a product and period that has none. Send exactly one of `amount` and
     * `unlimited: true`. The period's spend is checked at once: if it is already above the new
     * limit, the product is blocked immediately (`evaluation.blocked_now`). Returns 409 when a
     * limit already exists for the product and period; update it instead.
     */
    fun create(params: SpendLimitCreateParams): CompletableFuture<SpendLimitResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SpendLimitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse>

    /** @see create */
    fun create(
        body: SpendLimitCreateParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse> =
        create(SpendLimitCreateParams.builder().body(body).build(), requestOptions)

    /** @see create */
    fun create(body: SpendLimitCreateParams.Body): CompletableFuture<SpendLimitResponse> =
        create(body, RequestOptions.none())

    /** @see create */
    fun create(
        createSpendLimitWithAmount: SpendLimitCreateParams.Body.CreateSpendLimitWithAmount,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse> =
        create(
            SpendLimitCreateParams.Body.ofCreateSpendLimitWithAmount(createSpendLimitWithAmount),
            requestOptions,
        )

    /** @see create */
    fun create(
        createSpendLimitWithAmount: SpendLimitCreateParams.Body.CreateSpendLimitWithAmount
    ): CompletableFuture<SpendLimitResponse> =
        create(createSpendLimitWithAmount, RequestOptions.none())

    /** @see create */
    fun create(
        createSpendLimitUnlimited: SpendLimitCreateParams.Body.CreateSpendLimitUnlimited,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse> =
        create(
            SpendLimitCreateParams.Body.ofCreateSpendLimitUnlimited(createSpendLimitUnlimited),
            requestOptions,
        )

    /** @see create */
    fun create(
        createSpendLimitUnlimited: SpendLimitCreateParams.Body.CreateSpendLimitUnlimited
    ): CompletableFuture<SpendLimitResponse> =
        create(createSpendLimitUnlimited, RequestOptions.none())

    /**
     * Replaces the value of the existing limit for the product and period. Send exactly one of
     * `amount` and `unlimited: true`. The period's spend is checked at once: raising the limit
     * above the spend lifts the period's block (`evaluation.released`), and lowering it below the
     * spend blocks the product (`evaluation.blocked_now`). Returns 404 when no limit is set; create
     * it instead.
     */
    fun update(
        product: String,
        params: SpendLimitUpdateParams,
    ): CompletableFuture<SpendLimitResponse> = update(product, params, RequestOptions.none())

    /** @see update */
    fun update(
        product: String,
        params: SpendLimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse> =
        update(params.toBuilder().product(product).build(), requestOptions)

    /** @see update */
    fun update(params: SpendLimitUpdateParams): CompletableFuture<SpendLimitResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SpendLimitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse>

    /**
     * Returns one entry per product and period you can set a limit on, with the limit, the spend so
     * far in the period and whether the product is blocked. An entry without a limit is still
     * listed (`limit: null`). When the spend cannot be read, the entry is returned with `spend_usd:
     * null` and `spend_error` set. The list is not paginated.
     */
    fun list(): CompletableFuture<SpendLimitListResponse> = list(SpendLimitListParams.none())

    /** @see list */
    fun list(
        params: SpendLimitListParams = SpendLimitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitListResponse>

    /** @see list */
    fun list(
        params: SpendLimitListParams = SpendLimitListParams.none()
    ): CompletableFuture<SpendLimitListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SpendLimitListResponse> =
        list(SpendLimitListParams.none(), requestOptions)

    /**
     * Removes the limit for the product and period. For `inference`, which has no default limit,
     * the product becomes unlimited for the period and the period's block is lifted
     * (`evaluation.released`). The response carries `limit: null` and the `effective_limit_usd`
     * that applies after the removal. Returns 404 when no limit is set.
     */
    fun delete(product: String): CompletableFuture<SpendLimitResponse> =
        delete(product, SpendLimitDeleteParams.none())

    /** @see delete */
    fun delete(
        product: String,
        params: SpendLimitDeleteParams = SpendLimitDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse> =
        delete(params.toBuilder().product(product).build(), requestOptions)

    /** @see delete */
    fun delete(
        product: String,
        params: SpendLimitDeleteParams = SpendLimitDeleteParams.none(),
    ): CompletableFuture<SpendLimitResponse> = delete(product, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SpendLimitDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpendLimitResponse>

    /** @see delete */
    fun delete(params: SpendLimitDeleteParams): CompletableFuture<SpendLimitResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        product: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SpendLimitResponse> =
        delete(product, SpendLimitDeleteParams.none(), requestOptions)

    /**
     * A view of [SpendLimitServiceAsync] that provides access to raw HTTP responses for each
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
        ): SpendLimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /spend_limits`, but is otherwise the same as
         * [SpendLimitServiceAsync.create].
         */
        fun create(
            params: SpendLimitCreateParams
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SpendLimitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>>

        /** @see create */
        fun create(
            body: SpendLimitCreateParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            create(SpendLimitCreateParams.builder().body(body).build(), requestOptions)

        /** @see create */
        fun create(
            body: SpendLimitCreateParams.Body
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            create(body, RequestOptions.none())

        /** @see create */
        fun create(
            createSpendLimitWithAmount: SpendLimitCreateParams.Body.CreateSpendLimitWithAmount,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            create(
                SpendLimitCreateParams.Body.ofCreateSpendLimitWithAmount(
                    createSpendLimitWithAmount
                ),
                requestOptions,
            )

        /** @see create */
        fun create(
            createSpendLimitWithAmount: SpendLimitCreateParams.Body.CreateSpendLimitWithAmount
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            create(createSpendLimitWithAmount, RequestOptions.none())

        /** @see create */
        fun create(
            createSpendLimitUnlimited: SpendLimitCreateParams.Body.CreateSpendLimitUnlimited,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            create(
                SpendLimitCreateParams.Body.ofCreateSpendLimitUnlimited(createSpendLimitUnlimited),
                requestOptions,
            )

        /** @see create */
        fun create(
            createSpendLimitUnlimited: SpendLimitCreateParams.Body.CreateSpendLimitUnlimited
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            create(createSpendLimitUnlimited, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /spend_limits/{product}`, but is otherwise the
         * same as [SpendLimitServiceAsync.update].
         */
        fun update(
            product: String,
            params: SpendLimitUpdateParams,
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            update(product, params, RequestOptions.none())

        /** @see update */
        fun update(
            product: String,
            params: SpendLimitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            update(params.toBuilder().product(product).build(), requestOptions)

        /** @see update */
        fun update(
            params: SpendLimitUpdateParams
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SpendLimitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>>

        /**
         * Returns a raw HTTP response for `get /spend_limits`, but is otherwise the same as
         * [SpendLimitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SpendLimitListResponse>> =
            list(SpendLimitListParams.none())

        /** @see list */
        fun list(
            params: SpendLimitListParams = SpendLimitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitListResponse>>

        /** @see list */
        fun list(
            params: SpendLimitListParams = SpendLimitListParams.none()
        ): CompletableFuture<HttpResponseFor<SpendLimitListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpendLimitListResponse>> =
            list(SpendLimitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /spend_limits/{product}`, but is otherwise the
         * same as [SpendLimitServiceAsync.delete].
         */
        fun delete(product: String): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            delete(product, SpendLimitDeleteParams.none())

        /** @see delete */
        fun delete(
            product: String,
            params: SpendLimitDeleteParams = SpendLimitDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            delete(params.toBuilder().product(product).build(), requestOptions)

        /** @see delete */
        fun delete(
            product: String,
            params: SpendLimitDeleteParams = SpendLimitDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            delete(product, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SpendLimitDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>>

        /** @see delete */
        fun delete(
            params: SpendLimitDeleteParams
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            product: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SpendLimitResponse>> =
            delete(product, SpendLimitDeleteParams.none(), requestOptions)
    }
}
