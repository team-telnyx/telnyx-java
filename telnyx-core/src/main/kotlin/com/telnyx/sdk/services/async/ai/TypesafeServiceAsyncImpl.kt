// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.typesafe.V1ServiceAsync
import com.telnyx.sdk.services.async.ai.typesafe.V1ServiceAsyncImpl
import java.util.function.Consumer

class TypesafeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TypesafeServiceAsync {

    private val withRawResponse: TypesafeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TypesafeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypesafeServiceAsync =
        TypesafeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Beta API for evaluating shared context with typed questions and structured answers. Telnyx
     * manages model selection.
     */
    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TypesafeServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TypesafeServiceAsync.WithRawResponse =
            TypesafeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Beta API for evaluating shared context with typed questions and structured answers.
         * Telnyx manages model selection.
         */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
