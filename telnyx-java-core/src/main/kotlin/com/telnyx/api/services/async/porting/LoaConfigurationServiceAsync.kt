// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.porting

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationCreateParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationCreateResponse
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationDeleteParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationListParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationListResponse
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationPreview0Params
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationPreview1Params
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationRetrieveParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationRetrieveResponse
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationUpdateParams
import com.telnyx.api.models.porting.loaconfigurations.LoaConfigurationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LoaConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoaConfigurationServiceAsync

    /** Create a LOA configuration. */
    fun create(
        params: LoaConfigurationCreateParams
    ): CompletableFuture<LoaConfigurationCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LoaConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoaConfigurationCreateResponse>

    /** Retrieve a specific LOA configuration. */
    fun retrieve(id: String): CompletableFuture<LoaConfigurationRetrieveResponse> =
        retrieve(id, LoaConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoaConfigurationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
    ): CompletableFuture<LoaConfigurationRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LoaConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoaConfigurationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: LoaConfigurationRetrieveParams
    ): CompletableFuture<LoaConfigurationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LoaConfigurationRetrieveResponse> =
        retrieve(id, LoaConfigurationRetrieveParams.none(), requestOptions)

    /** Update a specific LOA configuration. */
    fun update(
        id: String,
        params: LoaConfigurationUpdateParams,
    ): CompletableFuture<LoaConfigurationUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: LoaConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoaConfigurationUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: LoaConfigurationUpdateParams
    ): CompletableFuture<LoaConfigurationUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LoaConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoaConfigurationUpdateResponse>

    /** List the LOA configurations. */
    fun list(): CompletableFuture<LoaConfigurationListResponse> =
        list(LoaConfigurationListParams.none())

    /** @see list */
    fun list(
        params: LoaConfigurationListParams = LoaConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoaConfigurationListResponse>

    /** @see list */
    fun list(
        params: LoaConfigurationListParams = LoaConfigurationListParams.none()
    ): CompletableFuture<LoaConfigurationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LoaConfigurationListResponse> =
        list(LoaConfigurationListParams.none(), requestOptions)

    /** Delete a specific LOA configuration. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, LoaConfigurationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LoaConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LoaConfigurationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, LoaConfigurationDeleteParams.none(), requestOptions)

    /**
     * Preview the LOA template that would be generated without need to create LOA configuration.
     */
    fun preview0(params: LoaConfigurationPreview0Params): CompletableFuture<HttpResponse> =
        preview0(params, RequestOptions.none())

    /** @see preview0 */
    fun preview0(
        params: LoaConfigurationPreview0Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** Preview a specific LOA configuration. */
    fun preview1(id: String): CompletableFuture<HttpResponse> =
        preview1(id, LoaConfigurationPreview1Params.none())

    /** @see preview1 */
    fun preview1(
        id: String,
        params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> = preview1(params.toBuilder().id(id).build(), requestOptions)

    /** @see preview1 */
    fun preview1(
        id: String,
        params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
    ): CompletableFuture<HttpResponse> = preview1(id, params, RequestOptions.none())

    /** @see preview1 */
    fun preview1(
        params: LoaConfigurationPreview1Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see preview1 */
    fun preview1(params: LoaConfigurationPreview1Params): CompletableFuture<HttpResponse> =
        preview1(params, RequestOptions.none())

    /** @see preview1 */
    fun preview1(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        preview1(id, LoaConfigurationPreview1Params.none(), requestOptions)

    /**
     * A view of [LoaConfigurationServiceAsync] that provides access to raw HTTP responses for each
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
        ): LoaConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /porting/loa_configurations`, but is otherwise the
         * same as [LoaConfigurationServiceAsync.create].
         */
        fun create(
            params: LoaConfigurationCreateParams
        ): CompletableFuture<HttpResponseFor<LoaConfigurationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LoaConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoaConfigurationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /porting/loa_configurations/{id}`, but is otherwise
         * the same as [LoaConfigurationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<LoaConfigurationRetrieveResponse>> =
            retrieve(id, LoaConfigurationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoaConfigurationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LoaConfigurationRetrieveParams = LoaConfigurationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LoaConfigurationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LoaConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoaConfigurationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: LoaConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<LoaConfigurationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LoaConfigurationRetrieveResponse>> =
            retrieve(id, LoaConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /porting/loa_configurations/{id}`, but is
         * otherwise the same as [LoaConfigurationServiceAsync.update].
         */
        fun update(
            id: String,
            params: LoaConfigurationUpdateParams,
        ): CompletableFuture<HttpResponseFor<LoaConfigurationUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: LoaConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoaConfigurationUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: LoaConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<LoaConfigurationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LoaConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoaConfigurationUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /porting/loa_configurations`, but is otherwise the
         * same as [LoaConfigurationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LoaConfigurationListResponse>> =
            list(LoaConfigurationListParams.none())

        /** @see list */
        fun list(
            params: LoaConfigurationListParams = LoaConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoaConfigurationListResponse>>

        /** @see list */
        fun list(
            params: LoaConfigurationListParams = LoaConfigurationListParams.none()
        ): CompletableFuture<HttpResponseFor<LoaConfigurationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LoaConfigurationListResponse>> =
            list(LoaConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /porting/loa_configurations/{id}`, but is
         * otherwise the same as [LoaConfigurationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, LoaConfigurationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LoaConfigurationDeleteParams = LoaConfigurationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LoaConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LoaConfigurationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, LoaConfigurationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /porting/loa_configuration/preview`, but is
         * otherwise the same as [LoaConfigurationServiceAsync.preview0].
         */
        fun preview0(params: LoaConfigurationPreview0Params): CompletableFuture<HttpResponse> =
            preview0(params, RequestOptions.none())

        /** @see preview0 */
        fun preview0(
            params: LoaConfigurationPreview0Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /porting/loa_configurations/{id}/preview`, but is
         * otherwise the same as [LoaConfigurationServiceAsync.preview1].
         */
        fun preview1(id: String): CompletableFuture<HttpResponse> =
            preview1(id, LoaConfigurationPreview1Params.none())

        /** @see preview1 */
        fun preview1(
            id: String,
            params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            preview1(params.toBuilder().id(id).build(), requestOptions)

        /** @see preview1 */
        fun preview1(
            id: String,
            params: LoaConfigurationPreview1Params = LoaConfigurationPreview1Params.none(),
        ): CompletableFuture<HttpResponse> = preview1(id, params, RequestOptions.none())

        /** @see preview1 */
        fun preview1(
            params: LoaConfigurationPreview1Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see preview1 */
        fun preview1(params: LoaConfigurationPreview1Params): CompletableFuture<HttpResponse> =
            preview1(params, RequestOptions.none())

        /** @see preview1 */
        fun preview1(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            preview1(id, LoaConfigurationPreview1Params.none(), requestOptions)
    }
}
