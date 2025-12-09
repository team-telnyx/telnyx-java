// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.porting

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationCreateParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationCreateResponse
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationDeleteParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationListPage
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationListParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationPreview0Params
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationPreview1Params
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationRetrieveParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationRetrieveResponse
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationUpdateParams
import com.telnyx.sdk.models.porting.loaconfigurations.LoaConfigurationUpdateResponse
import java.util.function.Consumer

interface LoaConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoaConfigurationService

    /** Create a LOA configuration. */
    fun create(params: LoaConfigurationCreateParams): LoaConfigurationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LoaConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoaConfigurationCreateResponse

    /** Retrieve a specific LOA configuration. */
    fun retrieve(id: String): LoaConfigurationRetrieveResponse =
        retrieve(id, LoaConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoaConfigurationRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
    ): LoaConfigurationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LoaConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoaConfigurationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: LoaConfigurationRetrieveParams): LoaConfigurationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LoaConfigurationRetrieveResponse =
        retrieve(id, LoaConfigurationRetrieveParams.none(), requestOptions)

    /** Update a specific LOA configuration. */
    fun update(id: String, params: LoaConfigurationUpdateParams): LoaConfigurationUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LoaConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoaConfigurationUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: LoaConfigurationUpdateParams): LoaConfigurationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LoaConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoaConfigurationUpdateResponse

    /** List the LOA configurations. */
    fun list(): LoaConfigurationListPage = list(LoaConfigurationListParams.none())

    /** @see list */
    fun list(
        params: LoaConfigurationListParams = LoaConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoaConfigurationListPage

    /** @see list */
    fun list(
        params: LoaConfigurationListParams = LoaConfigurationListParams.none()
    ): LoaConfigurationListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LoaConfigurationListPage =
        list(LoaConfigurationListParams.none(), requestOptions)

    /** Delete a specific LOA configuration. */
    fun delete(id: String) = delete(id, LoaConfigurationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
    ) = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LoaConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LoaConfigurationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, LoaConfigurationDeleteParams.none(), requestOptions)

    /**
     * Preview the LOA template that would be generated without need to create LOA configuration.
     */
    @MustBeClosed
    fun preview0(params: LoaConfigurationPreview0Params): HttpResponse =
        preview0(params, RequestOptions.none())

    /** @see preview0 */
    @MustBeClosed
    fun preview0(
        params: LoaConfigurationPreview0Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** Preview a specific LOA configuration. */
    @MustBeClosed
    fun preview1(id: String): HttpResponse = preview1(id, LoaConfigurationPreview1Params.none())

    /** @see preview1 */
    @MustBeClosed
    fun preview1(
        id: String,
        params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = preview1(params.toBuilder().id(id).build(), requestOptions)

    /** @see preview1 */
    @MustBeClosed
    fun preview1(
        id: String,
        params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
    ): HttpResponse = preview1(id, params, RequestOptions.none())

    /** @see preview1 */
    @MustBeClosed
    fun preview1(
        params: LoaConfigurationPreview1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see preview1 */
    @MustBeClosed
    fun preview1(params: LoaConfigurationPreview1Params): HttpResponse =
        preview1(params, RequestOptions.none())

    /** @see preview1 */
    @MustBeClosed
    fun preview1(id: String, requestOptions: RequestOptions): HttpResponse =
        preview1(id, LoaConfigurationPreview1Params.none(), requestOptions)

    /**
     * A view of [LoaConfigurationService] that provides access to raw HTTP responses for each
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
        ): LoaConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting/loa_configurations`, but is otherwise the
         * same as [LoaConfigurationService.create].
         */
        @MustBeClosed
        fun create(
            params: LoaConfigurationCreateParams
        ): HttpResponseFor<LoaConfigurationCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LoaConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoaConfigurationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /porting/loa_configurations/{id}`, but is otherwise
         * the same as [LoaConfigurationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LoaConfigurationRetrieveResponse> =
            retrieve(id, LoaConfigurationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoaConfigurationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
        ): HttpResponseFor<LoaConfigurationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LoaConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoaConfigurationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LoaConfigurationRetrieveParams
        ): HttpResponseFor<LoaConfigurationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoaConfigurationRetrieveResponse> =
            retrieve(id, LoaConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /porting/loa_configurations/{id}`, but is
         * otherwise the same as [LoaConfigurationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LoaConfigurationUpdateParams,
        ): HttpResponseFor<LoaConfigurationUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: LoaConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoaConfigurationUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: LoaConfigurationUpdateParams
        ): HttpResponseFor<LoaConfigurationUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LoaConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoaConfigurationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /porting/loa_configurations`, but is otherwise the
         * same as [LoaConfigurationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LoaConfigurationListPage> =
            list(LoaConfigurationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LoaConfigurationListParams = LoaConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoaConfigurationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LoaConfigurationListParams = LoaConfigurationListParams.none()
        ): HttpResponseFor<LoaConfigurationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LoaConfigurationListPage> =
            list(LoaConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /porting/loa_configurations/{id}`, but is
         * otherwise the same as [LoaConfigurationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, LoaConfigurationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LoaConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LoaConfigurationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, LoaConfigurationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting/loa_configuration/preview`, but is
         * otherwise the same as [LoaConfigurationService.preview0].
         */
        @MustBeClosed
        fun preview0(params: LoaConfigurationPreview0Params): HttpResponse =
            preview0(params, RequestOptions.none())

        /** @see preview0 */
        @MustBeClosed
        fun preview0(
            params: LoaConfigurationPreview0Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /porting/loa_configurations/{id}/preview`, but is
         * otherwise the same as [LoaConfigurationService.preview1].
         */
        @MustBeClosed
        fun preview1(id: String): HttpResponse = preview1(id, LoaConfigurationPreview1Params.none())

        /** @see preview1 */
        @MustBeClosed
        fun preview1(
            id: String,
            params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = preview1(params.toBuilder().id(id).build(), requestOptions)

        /** @see preview1 */
        @MustBeClosed
        fun preview1(
            id: String,
            params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
        ): HttpResponse = preview1(id, params, RequestOptions.none())

        /** @see preview1 */
        @MustBeClosed
        fun preview1(
            params: LoaConfigurationPreview1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see preview1 */
        @MustBeClosed
        fun preview1(params: LoaConfigurationPreview1Params): HttpResponse =
            preview1(params, RequestOptions.none())

        /** @see preview1 */
        @MustBeClosed
        fun preview1(id: String, requestOptions: RequestOptions): HttpResponse =
            preview1(id, LoaConfigurationPreview1Params.none(), requestOptions)
    }
}
