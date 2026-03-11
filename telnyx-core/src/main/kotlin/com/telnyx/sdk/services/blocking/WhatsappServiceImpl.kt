// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.whatsapp.BusinessAccountService
import com.telnyx.sdk.services.blocking.whatsapp.BusinessAccountServiceImpl
import com.telnyx.sdk.services.blocking.whatsapp.MessageTemplateService
import com.telnyx.sdk.services.blocking.whatsapp.MessageTemplateServiceImpl
import com.telnyx.sdk.services.blocking.whatsapp.PhoneNumberService
import com.telnyx.sdk.services.blocking.whatsapp.PhoneNumberServiceImpl
import java.util.function.Consumer

class WhatsappServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WhatsappService {

    private val withRawResponse: WhatsappService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val businessAccounts: BusinessAccountService by lazy {
        BusinessAccountServiceImpl(clientOptions)
    }

    private val messageTemplates: MessageTemplateService by lazy {
        MessageTemplateServiceImpl(clientOptions)
    }

    private val phoneNumbers: PhoneNumberService by lazy { PhoneNumberServiceImpl(clientOptions) }

    override fun withRawResponse(): WhatsappService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService =
        WhatsappServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Manage Whatsapp business accounts */
    override fun businessAccounts(): BusinessAccountService = businessAccounts

    /** Manage Whatsapp message templates */
    override fun messageTemplates(): MessageTemplateService = messageTemplates

    /** Manage Whatsapp phone numbers */
    override fun phoneNumbers(): PhoneNumberService = phoneNumbers

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WhatsappService.WithRawResponse {

        private val businessAccounts: BusinessAccountService.WithRawResponse by lazy {
            BusinessAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messageTemplates: MessageTemplateService.WithRawResponse by lazy {
            MessageTemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val phoneNumbers: PhoneNumberService.WithRawResponse by lazy {
            PhoneNumberServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappService.WithRawResponse =
            WhatsappServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Manage Whatsapp business accounts */
        override fun businessAccounts(): BusinessAccountService.WithRawResponse = businessAccounts

        /** Manage Whatsapp message templates */
        override fun messageTemplates(): MessageTemplateService.WithRawResponse = messageTemplates

        /** Manage Whatsapp phone numbers */
        override fun phoneNumbers(): PhoneNumberService.WithRawResponse = phoneNumbers
    }
}
