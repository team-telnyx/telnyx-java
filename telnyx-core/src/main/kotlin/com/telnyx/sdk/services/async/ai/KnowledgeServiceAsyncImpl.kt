// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.ai.knowledge.CollectionServiceAsync
import com.telnyx.sdk.services.async.ai.knowledge.CollectionServiceAsyncImpl
import java.util.function.Consumer

class KnowledgeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    KnowledgeServiceAsync {

    private val withRawResponse: KnowledgeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val collections: CollectionServiceAsync by lazy {
        CollectionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): KnowledgeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeServiceAsync =
        KnowledgeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    override fun collections(): CollectionServiceAsync = collections

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KnowledgeServiceAsync.WithRawResponse {

        private val collections: CollectionServiceAsync.WithRawResponse by lazy {
            CollectionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeServiceAsync.WithRawResponse =
            KnowledgeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        override fun collections(): CollectionServiceAsync.WithRawResponse = collections
    }
}
