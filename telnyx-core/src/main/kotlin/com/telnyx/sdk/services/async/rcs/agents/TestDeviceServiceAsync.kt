// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rcs.agents

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceCreateParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceDeleteParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceListParams
import com.telnyx.sdk.models.rcs.agents.testdevices.TestDeviceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage RCS agent registration, testing, verification, and launch. */
interface TestDeviceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TestDeviceServiceAsync

    /**
     * Adds an RCS-capable test number after provider agent creation. Repeating the request for a
     * number already attached to the agent returns the existing test device.
     */
    fun create(id: String, params: TestDeviceCreateParams): CompletableFuture<TestDeviceResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: TestDeviceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestDeviceResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: TestDeviceCreateParams): CompletableFuture<TestDeviceResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TestDeviceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TestDeviceResponse>

    /** Lists test devices attached to an RCS agent. */
    fun list(id: String): CompletableFuture<List<TestDeviceResponse>> =
        list(id, TestDeviceListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: TestDeviceListParams = TestDeviceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TestDeviceResponse>> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: TestDeviceListParams = TestDeviceListParams.none(),
    ): CompletableFuture<List<TestDeviceResponse>> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TestDeviceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TestDeviceResponse>>

    /** @see list */
    fun list(params: TestDeviceListParams): CompletableFuture<List<TestDeviceResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<TestDeviceResponse>> =
        list(id, TestDeviceListParams.none(), requestOptions)

    /** Removes a test device from an RCS agent and its provider registration. */
    fun delete(testDeviceId: String, params: TestDeviceDeleteParams): CompletableFuture<Void?> =
        delete(testDeviceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        testDeviceId: String,
        params: TestDeviceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().testDeviceId(testDeviceId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TestDeviceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TestDeviceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TestDeviceServiceAsync] that provides access to raw HTTP responses for each
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
        ): TestDeviceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rcs/agents/{id}/test_devices`, but is otherwise
         * the same as [TestDeviceServiceAsync.create].
         */
        fun create(
            id: String,
            params: TestDeviceCreateParams,
        ): CompletableFuture<HttpResponseFor<TestDeviceResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: TestDeviceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestDeviceResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: TestDeviceCreateParams
        ): CompletableFuture<HttpResponseFor<TestDeviceResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TestDeviceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TestDeviceResponse>>

        /**
         * Returns a raw HTTP response for `get /rcs/agents/{id}/test_devices`, but is otherwise the
         * same as [TestDeviceServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<List<TestDeviceResponse>>> =
            list(id, TestDeviceListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: TestDeviceListParams = TestDeviceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TestDeviceResponse>>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: TestDeviceListParams = TestDeviceListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<TestDeviceResponse>>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TestDeviceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TestDeviceResponse>>>

        /** @see list */
        fun list(
            params: TestDeviceListParams
        ): CompletableFuture<HttpResponseFor<List<TestDeviceResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<TestDeviceResponse>>> =
            list(id, TestDeviceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /rcs/agents/{id}/test_devices/{test_device_id}`,
         * but is otherwise the same as [TestDeviceServiceAsync.delete].
         */
        fun delete(
            testDeviceId: String,
            params: TestDeviceDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(testDeviceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            testDeviceId: String,
            params: TestDeviceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().testDeviceId(testDeviceId).build(), requestOptions)

        /** @see delete */
        fun delete(params: TestDeviceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TestDeviceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
