// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messagingprofiles

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutoRespConfigCreate
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigCreateParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigDeleteParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigListParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigRetrieveParams
import com.telnyx.sdk.models.messagingprofiles.autorespconfigs.AutorespConfigUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutorespConfigServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val autorespConfigService = client.messagingProfiles().autorespConfigs()

        val autoRespConfigResponse =
            autorespConfigService.create(
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

        autoRespConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val autorespConfigService = client.messagingProfiles().autorespConfigs()

        val autoRespConfigResponse =
            autorespConfigService.retrieve(
                AutorespConfigRetrieveParams.builder()
                    .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        autoRespConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val autorespConfigService = client.messagingProfiles().autorespConfigs()

        val autoRespConfigResponse =
            autorespConfigService.update(
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

        autoRespConfigResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val autorespConfigService = client.messagingProfiles().autorespConfigs()

        val autorespConfigs =
            autorespConfigService.list(
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

        autorespConfigs.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val autorespConfigService = client.messagingProfiles().autorespConfigs()

        autorespConfigService.delete(
            AutorespConfigDeleteParams.builder()
                .profileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autorespCfgId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
