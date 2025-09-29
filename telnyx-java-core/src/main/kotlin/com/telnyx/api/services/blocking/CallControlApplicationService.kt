// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface CallControlApplicationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallControlApplicationService

    /** Create a call control application. */
    fun create(params: CallControlApplicationCreateParams): CallControlApplicationCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CallControlApplicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationCreateResponse

    /** Retrieves the details of an existing call control application. */
    fun retrieve(id: String): CallControlApplicationRetrieveResponse =
        retrieve(id, CallControlApplicationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CallControlApplicationRetrieveParams = CallControlApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CallControlApplicationRetrieveParams = CallControlApplicationRetrieveParams.none(),
    ): CallControlApplicationRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CallControlApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: CallControlApplicationRetrieveParams
    ): CallControlApplicationRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CallControlApplicationRetrieveResponse =
        retrieve(id, CallControlApplicationRetrieveParams.none(), requestOptions)

    /** Updates settings of an existing call control application. */
    fun update(
        id: String,
        params: CallControlApplicationUpdateParams,
    ): CallControlApplicationUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: CallControlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: CallControlApplicationUpdateParams): CallControlApplicationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CallControlApplicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationUpdateResponse

    /** Return a list of call control applications. */
    fun list(): CallControlApplicationListResponse = list(CallControlApplicationListParams.none())

    /** @see list */
    fun list(
        params: CallControlApplicationListParams = CallControlApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationListResponse

    /** @see list */
    fun list(
        params: CallControlApplicationListParams = CallControlApplicationListParams.none()
    ): CallControlApplicationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CallControlApplicationListResponse =
        list(CallControlApplicationListParams.none(), requestOptions)

    /** Deletes a call control application. */
    fun delete(id: String): CallControlApplicationDeleteResponse =
        delete(id, CallControlApplicationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
    ): CallControlApplicationDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CallControlApplicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CallControlApplicationDeleteResponse

    /** @see delete */
    fun delete(params: CallControlApplicationDeleteParams): CallControlApplicationDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CallControlApplicationDeleteResponse =
        delete(id, CallControlApplicationDeleteParams.none(), requestOptions)

    /**
     * A view of [CallControlApplicationService] that provides access to raw HTTP responses for each
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
        ): CallControlApplicationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /call_control_applications`, but is otherwise the
         * same as [CallControlApplicationService.create].
         */
        @MustBeClosed
        fun create(
            params: CallControlApplicationCreateParams
        ): HttpResponseFor<CallControlApplicationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CallControlApplicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /call_control_applications/{id}`, but is otherwise
         * the same as [CallControlApplicationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CallControlApplicationRetrieveResponse> =
            retrieve(id, CallControlApplicationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CallControlApplicationRetrieveParams =
                CallControlApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CallControlApplicationRetrieveParams =
                CallControlApplicationRetrieveParams.none(),
        ): HttpResponseFor<CallControlApplicationRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CallControlApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CallControlApplicationRetrieveParams
        ): HttpResponseFor<CallControlApplicationRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallControlApplicationRetrieveResponse> =
            retrieve(id, CallControlApplicationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /call_control_applications/{id}`, but is otherwise
         * the same as [CallControlApplicationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CallControlApplicationUpdateParams,
        ): HttpResponseFor<CallControlApplicationUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CallControlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallControlApplicationUpdateParams
        ): HttpResponseFor<CallControlApplicationUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CallControlApplicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /call_control_applications`, but is otherwise the
         * same as [CallControlApplicationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CallControlApplicationListResponse> =
            list(CallControlApplicationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallControlApplicationListParams = CallControlApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CallControlApplicationListParams = CallControlApplicationListParams.none()
        ): HttpResponseFor<CallControlApplicationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CallControlApplicationListResponse> =
            list(CallControlApplicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /call_control_applications/{id}`, but is
         * otherwise the same as [CallControlApplicationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CallControlApplicationDeleteResponse> =
            delete(id, CallControlApplicationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CallControlApplicationDeleteParams = CallControlApplicationDeleteParams.none(),
        ): HttpResponseFor<CallControlApplicationDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CallControlApplicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CallControlApplicationDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CallControlApplicationDeleteParams
        ): HttpResponseFor<CallControlApplicationDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallControlApplicationDeleteResponse> =
            delete(id, CallControlApplicationDeleteParams.none(), requestOptions)
    }
}
