// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.credentialconnections.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionCheckRegistrationStatusResponseTest {

    @Test
    fun create() {
        val actionCheckRegistrationStatusResponse =
            ActionCheckRegistrationStatusResponse.builder()
                .data(
                    ActionCheckRegistrationStatusResponse.Data.builder()
                        .ipAddress("190.106.106.121")
                        .lastRegistration("2018-02-02T22:25:27.521Z")
                        .port(37223L)
                        .recordType("registration_status")
                        .sipUsername("sip_username")
                        .status(ActionCheckRegistrationStatusResponse.Data.Status.NOT_APPLICABLE)
                        .transport("TCP")
                        .userAgent("Z 5.4.12 v2.10.13.2-mod")
                        .build()
                )
                .build()

        assertThat(actionCheckRegistrationStatusResponse.data())
            .contains(
                ActionCheckRegistrationStatusResponse.Data.builder()
                    .ipAddress("190.106.106.121")
                    .lastRegistration("2018-02-02T22:25:27.521Z")
                    .port(37223L)
                    .recordType("registration_status")
                    .sipUsername("sip_username")
                    .status(ActionCheckRegistrationStatusResponse.Data.Status.NOT_APPLICABLE)
                    .transport("TCP")
                    .userAgent("Z 5.4.12 v2.10.13.2-mod")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionCheckRegistrationStatusResponse =
            ActionCheckRegistrationStatusResponse.builder()
                .data(
                    ActionCheckRegistrationStatusResponse.Data.builder()
                        .ipAddress("190.106.106.121")
                        .lastRegistration("2018-02-02T22:25:27.521Z")
                        .port(37223L)
                        .recordType("registration_status")
                        .sipUsername("sip_username")
                        .status(ActionCheckRegistrationStatusResponse.Data.Status.NOT_APPLICABLE)
                        .transport("TCP")
                        .userAgent("Z 5.4.12 v2.10.13.2-mod")
                        .build()
                )
                .build()

        val roundtrippedActionCheckRegistrationStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionCheckRegistrationStatusResponse),
                jacksonTypeRef<ActionCheckRegistrationStatusResponse>(),
            )

        assertThat(roundtrippedActionCheckRegistrationStatusResponse)
            .isEqualTo(actionCheckRegistrationStatusResponse)
    }
}
