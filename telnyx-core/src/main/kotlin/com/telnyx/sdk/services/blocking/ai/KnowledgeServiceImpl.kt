// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.ai.knowledge.CollectionService
import com.telnyx.sdk.services.blocking.ai.knowledge.CollectionServiceImpl
import java.util.function.Consumer

class KnowledgeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    KnowledgeService {

    private val withRawResponse: KnowledgeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val collections: CollectionService by lazy { CollectionServiceImpl(clientOptions) }

    override fun withRawResponse(): KnowledgeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KnowledgeService =
        KnowledgeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create and manage logical collections of your Telnyx data, tune retrieval settings, manage
     * sources, and run collection-scoped semantic search.
     */
    override fun collections(): CollectionService = collections

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KnowledgeService.WithRawResponse {

        private val collections: CollectionService.WithRawResponse by lazy {
            CollectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KnowledgeService.WithRawResponse =
            KnowledgeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create and manage logical collections of your Telnyx data, tune retrieval settings,
         * manage sources, and run collection-scoped semantic search.
         */
        override fun collections(): CollectionService.WithRawResponse = collections
    }
}
