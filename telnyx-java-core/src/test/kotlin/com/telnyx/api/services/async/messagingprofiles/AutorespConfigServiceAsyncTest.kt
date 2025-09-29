// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.messagingprofiles

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutoRespConfigCreate
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigCreateParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigDeleteParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigListParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigRetrieveParams
import com.telnyx.api.models.messagingprofiles.autorespconfigs.AutorespConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutorespConfigServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autorespConfigServiceAsync = client.messagingProfiles().autorespConfigs()

        val autoRespConfigResponseFuture =
            autorespConfigServiceAsync.create(
                AutorespConfigCreateParams.builder()
                    .profileId("profile_id")
                    .autoRespConfigCreate(
                        AutoRespConfigCreate.builder()
                            .countryCode("US")
                            .addKeyword("keyword1")
                            .addKeyword("keyword2")
                            .op(AutoRespConfigCreate.Op.START)
                            .respText("Thank you for your message")
                            .build()
                    )
                    .build()
            )

        val autoRespConfigResponse = autoRespConfigResponseFuture.get()
        autoRespConfigResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autorespConfigServiceAsync = client.messagingProfiles().autorespConfigs()

        val autoRespConfigResponseFuture =
            autorespConfigServiceAsync.retrieve(
                AutorespConfigRetrieveParams.builder()
                    .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val autoRespConfigResponse = autoRespConfigResponseFuture.get()
        autoRespConfigResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autorespConfigServiceAsync = client.messagingProfiles().autorespConfigs()

        val autoRespConfigResponseFuture =
            autorespConfigServiceAsync.update(
                AutorespConfigUpdateParams.builder()
                    .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .autoRespConfigCreate(
                        AutoRespConfigCreate.builder()
                            .countryCode("US")
                            .addKeyword("keyword1")
                            .addKeyword("keyword2")
                            .op(AutoRespConfigCreate.Op.START)
                            .respText("Thank you for your message")
                            .build()
                    )
                    .build()
            )

        val autoRespConfigResponse = autoRespConfigResponseFuture.get()
        autoRespConfigResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autorespConfigServiceAsync = client.messagingProfiles().autorespConfigs()

        val autorespConfigsFuture =
            autorespConfigServiceAsync.list(
                AutorespConfigListParams.builder()
                    .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .countryCode("country_code")
                    .createdAt(
                        AutorespConfigListParams.CreatedAt.builder().gte("gte").lte("lte").build()
                    )
                    .updatedAt(
                        AutorespConfigListParams.UpdatedAt.builder().gte("gte").lte("lte").build()
                    )
                    .build()
            )

        val autorespConfigs = autorespConfigsFuture.get()
        autorespConfigs.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val autorespConfigServiceAsync = client.messagingProfiles().autorespConfigs()

        val autorespConfigFuture =
            autorespConfigServiceAsync.delete(
                AutorespConfigDeleteParams.builder()
                    .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val autorespConfig = autorespConfigFuture.get()
        autorespConfig.validate()
    }
}
