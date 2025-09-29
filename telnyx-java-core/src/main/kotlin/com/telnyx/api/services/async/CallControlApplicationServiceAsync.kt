// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationCreateParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationCreateResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationDeleteParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationDeleteResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationListParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationListResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationRetrieveParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationRetrieveResponse
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationUpdateParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CallControlApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallControlApplicationServiceAsync

    /** Create a call control application. */
    fun create(
        params: CallControlApplicationCreateParams
    ): CompletableFuture<CallControlApplicationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallControlApplicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationCreateResponse>

    /** Retrieves the details of an existing call control application. */
    fun retrieve(id: String): CompletableFuture<CallControlApplicationRetrieveResponse> =
        retrieve(id, CallControlApplicationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CallControlApplicationRetrieveParams = CallControlApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CallControlApplicationRetrieveParams = CallControlApplicationRetrieveParams.none(),
    ): CompletableFuture<CallControlApplicationRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallControlApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: CallControlApplicationRetrieveParams
    ): CompletableFuture<CallControlApplicationRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallControlApplicationRetrieveResponse> =
        retrieve(id, CallControlApplicationRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing call control application. */
    fun update(
        id: String,
        params: CallControlApplicationUpdateParams,
    ): CompletableFuture<CallControlApplicationUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: CallControlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: CallControlApplicationUpdateParams
    ): CompletableFuture<CallControlApplicationUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallControlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationUpdateResponse>

    /** Return a list of call control applications. */
    fun list(): CompletableFuture<CallControlApplicationListResponse> =
        list(CallControlApplicationListParams.none())

    /** @see list */
    fun list(
        params: CallControlApplicationListParams = CallControlApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationListResponse>

    /** @see list */
    fun list(
        params: CallControlApplicationListParams = CallControlApplicationListParams.none()
    ): CompletableFuture<CallControlApplicationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CallControlApplicationListResponse> =
        list(CallControlApplicationListParams.none(), requestOptions)

    /** Deletes a call control application. */
    fun delete(id: String): CompletableFuture<CallControlApplicationDeleteResponse> =
        delete(id, CallControlApplicationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
    ): CompletableFuture<CallControlApplicationDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CallControlApplicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CallControlApplicationDeleteResponse>

    /** @see delete */
    fun delete(
        params: CallControlApplicationDeleteParams
    ): CompletableFuture<CallControlApplicationDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallControlApplicationDeleteResponse> =
        delete(id, CallControlApplicationDeleteParams.none(), requestOptions)

    /**
     * A view of [CallControlApplicationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallControlApplicationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /call_control_applications`, but is otherwise the
         * same as [CallControlApplicationServiceAsync.create].
         */
        fun create(
            params: CallControlApplicationCreateParams
        ): CompletableFuture<HttpResponseFor<CallControlApplicationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CallControlApplicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /call_control_applications/{id}`, but is otherwise
         * the same as [CallControlApplicationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<CallControlApplicationRetrieveResponse>> =
            retrieve(id, CallControlApplicationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CallControlApplicationRetrieveParams =
                CallControlApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CallControlApplicationRetrieveParams =
                CallControlApplicationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CallControlApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CallControlApplicationRetrieveParams
        ): CompletableFuture<HttpResponseFor<CallControlApplicationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationRetrieveResponse>> =
            retrieve(id, CallControlApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /call_control_applications/{id}`, but is otherwise
         * the same as [CallControlApplicationServiceAsync.update].
         */
        fun update(
            id: String,
            params: CallControlApplicationUpdateParams,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: CallControlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: CallControlApplicationUpdateParams
        ): CompletableFuture<HttpResponseFor<CallControlApplicationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CallControlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /call_control_applications`, but is otherwise the
         * same as [CallControlApplicationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CallControlApplicationListResponse>> =
            list(CallControlApplicationListParams.none())

        /** @see list */
        fun list(
            params: CallControlApplicationListParams = CallControlApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationListResponse>>

        /** @see list */
        fun list(
            params: CallControlApplicationListParams = CallControlApplicationListParams.none()
        ): CompletableFuture<HttpResponseFor<CallControlApplicationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CallControlApplicationListResponse>> =
            list(CallControlApplicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /call_control_applications/{id}`, but is
         * otherwise the same as [CallControlApplicationServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<CallControlApplicationDeleteResponse>> =
            delete(id, CallControlApplicationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CallControlApplicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CallControlApplicationDeleteResponse>>

        /** @see delete */
        fun delete(
            params: CallControlApplicationDeleteParams
        ): CompletableFuture<HttpResponseFor<CallControlApplicationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallControlApplicationDeleteResponse>> =
            delete(id, CallControlApplicationDeleteParams.none(), requestOptions)
    }
}
