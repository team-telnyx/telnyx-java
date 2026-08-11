// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs.agents

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceCreateParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceDeleteParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceListParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceResponse
import java.util.function.Consumer

/** Manage RCS agent registration, testing, verification, and launch. */
interface TestDeviceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestDeviceService

    /**
     * Adds an RCS-capable test number after provider agent creation. Repeating the request for a
     * number already attached to the agent returns the existing test device.
     */
    fun create(id: String, params: TestDeviceCreateParams): TestDeviceResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: TestDeviceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestDeviceResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: TestDeviceCreateParams): TestDeviceResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TestDeviceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TestDeviceResponse

    /** Lists test devices attached to an RCS agent. */
    fun list(id: String): List<TestDeviceResponse> = list(id, TestDeviceListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: TestDeviceListParams = TestDeviceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TestDeviceResponse> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: TestDeviceListParams = TestDeviceListParams.none(),
    ): List<TestDeviceResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TestDeviceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TestDeviceResponse>

    /** @see list */
    fun list(params: TestDeviceListParams): List<TestDeviceResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): List<TestDeviceResponse> =
        list(id, TestDeviceListParams.none(), requestOptions)

    /** Removes a test device from an RCS agent and its provider registration. */
    fun delete(testDeviceId: String, params: TestDeviceDeleteParams) =
        delete(testDeviceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        testDeviceId: String,
        params: TestDeviceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().testDeviceId(testDeviceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TestDeviceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TestDeviceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [TestDeviceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TestDeviceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rcs/agents/{id}/test_devices`, but is otherwise
         * the same as [TestDeviceService.create].
         */
        @MustBeClosed
        fun create(
            id: String,
            params: TestDeviceCreateParams,
        ): HttpResponseFor<TestDeviceResponse> = create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: TestDeviceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestDeviceResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TestDeviceCreateParams): HttpResponseFor<TestDeviceResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TestDeviceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TestDeviceResponse>

        /**
         * Returns a raw HTTP response for `get /rcs/agents/{id}/test_devices`, but is otherwise the
         * same as [TestDeviceService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<List<TestDeviceResponse>> =
            list(id, TestDeviceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: TestDeviceListParams = TestDeviceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TestDeviceResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: TestDeviceListParams = TestDeviceListParams.none(),
        ): HttpResponseFor<List<TestDeviceResponse>> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TestDeviceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TestDeviceResponse>>

        /** @see list */
        @MustBeClosed
        fun list(params: TestDeviceListParams): HttpResponseFor<List<TestDeviceResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TestDeviceResponse>> =
            list(id, TestDeviceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /rcs/agents/{id}/test_devices/{test_device_id}`,
         * but is otherwise the same as [TestDeviceService.delete].
         */
        @MustBeClosed
        fun delete(testDeviceId: String, params: TestDeviceDeleteParams): HttpResponse =
            delete(testDeviceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            testDeviceId: String,
            params: TestDeviceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().testDeviceId(testDeviceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TestDeviceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TestDeviceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
