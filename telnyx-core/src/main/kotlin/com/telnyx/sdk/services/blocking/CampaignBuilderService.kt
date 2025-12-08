// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.campaign.TelnyxCampaignCsp
import com.telnyx.sdk.models.campaignbuilder.CampaignBuilderCreateParams
import com.telnyx.sdk.services.blocking.campaignbuilder.BrandService
import java.util.function.Consumer

interface CampaignBuilderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignBuilderService

    fun brand(): BrandService

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
    fun create(params: CampaignBuilderCreateParams): TelnyxCampaignCsp =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CampaignBuilderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelnyxCampaignCsp

    /**
     * A view of [CampaignBuilderService] that provides access to raw HTTP responses for each
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
        ): CampaignBuilderService.WithRawResponse

        fun brand(): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /10dlc/campaignBuilder`, but is otherwise the same
         * as [CampaignBuilderService.create].
         */
        @MustBeClosed
        fun create(params: CampaignBuilderCreateParams): HttpResponseFor<TelnyxCampaignCsp> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CampaignBuilderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelnyxCampaignCsp>
    }
}
