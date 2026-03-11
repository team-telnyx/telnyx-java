// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.whatsapp.BusinessAccountServiceAsync
import com.telnyx.sdk.services.async.whatsapp.BusinessAccountServiceAsyncImpl
import com.telnyx.sdk.services.async.whatsapp.MessageTemplateServiceAsync
import com.telnyx.sdk.services.async.whatsapp.MessageTemplateServiceAsyncImpl
import com.telnyx.sdk.services.async.whatsapp.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.whatsapp.PhoneNumberServiceAsyncImpl
import java.util.function.Consumer

class WhatsappServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappServiceAsync {

    private val withRawResponse: WhatsappServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val businessAccounts: BusinessAccountServiceAsync by lazy {
        BusinessAccountServiceAsyncImpl(clientOptions)
    }

    private val messageTemplates: MessageTemplateServiceAsync by lazy {
        MessageTemplateServiceAsyncImpl(clientOptions)
    }

    private val phoneNumbers: PhoneNumberServiceAsync by lazy {
        PhoneNumberServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): WhatsappServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappServiceAsync =
        WhatsappServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage Whatsapp business accounts */
    override fun businessAccounts(): BusinessAccountServiceAsync = businessAccounts

    /** Manage Whatsapp message templates */
    override fun messageTemplates(): MessageTemplateServiceAsync = messageTemplates

    /** Manage Whatsapp phone numbers */
    override fun phoneNumbers(): PhoneNumberServiceAsync = phoneNumbers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappServiceAsync.WithRawResponse {

        private val businessAccounts: BusinessAccountServiceAsync.WithRawResponse by lazy {
            BusinessAccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messageTemplates: MessageTemplateServiceAsync.WithRawResponse by lazy {
            MessageTemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberServiceAsync.WithRawResponse by lazy {
            PhoneNumberServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappServiceAsync.WithRawResponse =
            WhatsappServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage Whatsapp business accounts */
        override fun businessAccounts(): BusinessAccountServiceAsync.WithRawResponse =
            businessAccounts

        /** Manage Whatsapp message templates */
        override fun messageTemplates(): MessageTemplateServiceAsync.WithRawResponse =
            messageTemplates

        /** Manage Whatsapp phone numbers */
        override fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse = phoneNumbers
    }
}
