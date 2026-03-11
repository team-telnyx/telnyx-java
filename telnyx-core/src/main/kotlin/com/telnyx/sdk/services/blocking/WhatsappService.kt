// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.blocking.whatsapp.BusinessAccountService
import com.telnyx.sdk.services.blocking.whatsapp.MessageTemplateService
import com.telnyx.sdk.services.blocking.whatsapp.PhoneNumberService
import java.util.function.Consumer

interface WhatsappService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService

    /** Manage Whatsapp business accounts */
    fun businessAccounts(): BusinessAccountService

    /** Manage Whatsapp message templates */
    fun messageTemplates(): MessageTemplateService

    /** Manage Whatsapp phone numbers */
    fun phoneNumbers(): PhoneNumberService

    /** A view of [WhatsappService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappService.WithRawResponse

        /** Manage Whatsapp business accounts */
        fun businessAccounts(): BusinessAccountService.WithRawResponse

        /** Manage Whatsapp message templates */
        fun messageTemplates(): MessageTemplateService.WithRawResponse

        /** Manage Whatsapp phone numbers */
        fun phoneNumbers(): PhoneNumberService.WithRawResponse
    }
}
