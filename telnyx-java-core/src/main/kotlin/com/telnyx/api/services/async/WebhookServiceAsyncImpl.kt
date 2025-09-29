// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.errors.TelnyxInvalidDataException
import com.telnyx.api.models.webhooks.UnwrapWebhookEvent
import com.telnyx.api.services.blocking.WebhookServiceImpl
import java.util.function.Consumer

class WebhookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val withRawResponse: WebhookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WebhookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync =
        WebhookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws TelnyxInvalidDataException if the body could not be parsed.
     */
    override fun unwrap(body: String): UnwrapWebhookEvent =
        WebhookServiceImpl(clientOptions).unwrap(body)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WebhookServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse =
            WebhookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
