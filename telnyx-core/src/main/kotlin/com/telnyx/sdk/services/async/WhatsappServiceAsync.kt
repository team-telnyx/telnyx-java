// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.services.async.whatsapp.BusinessAccountServiceAsync
import com.telnyx.sdk.services.async.whatsapp.PhoneNumberServiceAsync
import com.telnyx.sdk.services.async.whatsapp.TemplateServiceAsync
import java.util.function.Consumer

interface WhatsappServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WhatsappServiceAsync

    /** Manage Whatsapp business accounts */
    fun businessAccounts(): BusinessAccountServiceAsync

    /** Manage Whatsapp message templates */
    fun templates(): TemplateServiceAsync

    /** Manage Whatsapp phone numbers */
    fun phoneNumbers(): PhoneNumberServiceAsync

    /**
     * A view of [WhatsappServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WhatsappServiceAsync.WithRawResponse

        /** Manage Whatsapp business accounts */
        fun businessAccounts(): BusinessAccountServiceAsync.WithRawResponse

        /** Manage Whatsapp message templates */
        fun templates(): TemplateServiceAsync.WithRawResponse

        /** Manage Whatsapp phone numbers */
        fun phoneNumbers(): PhoneNumberServiceAsync.WithRawResponse
    }
}
