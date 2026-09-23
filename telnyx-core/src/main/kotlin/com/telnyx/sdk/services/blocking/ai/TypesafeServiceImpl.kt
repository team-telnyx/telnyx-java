// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.typesafe.V1Service
import com.telnyx.sdk.services.blocking.ai.typesafe.V1ServiceImpl
import java.util.function.Consumer

class TypesafeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TypesafeService {

    private val withRawResponse: TypesafeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): TypesafeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TypesafeService =
        TypesafeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Beta API for evaluating shared context with typed questions and structured answers. Telnyx
     * manages model selection.
     */
    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TypesafeService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TypesafeService.WithRawResponse =
            TypesafeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Beta API for evaluating shared context with typed questions and structured answers.
         * Telnyx manages model selection.
         */
        override fun v1(): V1Service.WithRawResponse = v1
    }
}
