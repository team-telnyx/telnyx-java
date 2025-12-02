// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.models.campaignbuilder.CampaignBuilderCreateParams
import com.telnyx.sdk.services.async.campaignbuilder.BrandServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CampaignBuilderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignBuilderServiceAsync

    fun brand(): BrandServiceAsync

    /**
     * Before creating a campaign, use the
     * [Qualify By Usecase endpoint](https://developers.telnyx.com/api/messaging/10dlc/get-usecase-qualification)
     * to ensure that the brand you want to assign a new campaign to is qualified for the desired
     * use case of that campaign. **Please note:** After campaign creation, you'll only be able to
     * edit the campaign's sample messages. Creating a campaign will entail an upfront,
     * non-refundable three month's cost that will depend on the campaign's use case ([see 10DLC
     * Costs section for
     * details](https://developers.telnyx.com/docs/messaging/10dlc/concepts#10dlc-costs)).
     */
    fun create(params: CampaignBuilderCreateParams): CompletableFuture<TelnyxCampaignCsp> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignBuilderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TelnyxCampaignCsp>

    /**
     * A view of [CampaignBuilderServiceAsync] that provides access to raw HTTP responses for each
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
        ): CampaignBuilderServiceAsync.WithRawResponse

        fun brand(): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /campaignBuilder`, but is otherwise the same as
         * [CampaignBuilderServiceAsync.create].
         */
        fun create(
            params: CampaignBuilderCreateParams
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CampaignBuilderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TelnyxCampaignCsp>>
    }
}
