// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionShareResponseTest {

    @Test
    fun create() {
        val actionShareResponse =
            ActionShareResponse.builder()
                .data(
                    ActionShareResponse.Data.builder()
                        .id("0a4b78a0-d416-4761-94f7-46c72ec56547")
                        .token(
                            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODk4OTQ2NzcsImlzdCI6MTY4OTg5MTA3NywicGVybWlzc2lvbnMiOlsicG9ydGluZ19vcmRlci5kb2N1bWVudC5yZWFkIl0sInBvcnRpbmdfb3JkZXJfaWQiOiJmZDRiODZjOC00OTdkLTRjNmQtOTYwOS1hNzg5ZTRlMTRjZmUifQ.CT0HRF6OLj7VPZ8p5Y_0S8rOL8SEUznwJJkR-YReKwc"
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .expiresAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .expiresInSeconds(3600L)
                        .addPermission(
                            ActionShareResponse.Data.Permission.PORTING_ORDER_DOCUMENT_READ
                        )
                        .addPermission(
                            ActionShareResponse.Data.Permission.PORTING_ORDER_DOCUMENT_UPDATE
                        )
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_order_sharing_token")
                        .build()
                )
                .build()

        assertThat(actionShareResponse.data())
            .contains(
                ActionShareResponse.Data.builder()
                    .id("0a4b78a0-d416-4761-94f7-46c72ec56547")
                    .token(
                        "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODk4OTQ2NzcsImlzdCI6MTY4OTg5MTA3NywicGVybWlzc2lvbnMiOlsicG9ydGluZ19vcmRlci5kb2N1bWVudC5yZWFkIl0sInBvcnRpbmdfb3JkZXJfaWQiOiJmZDRiODZjOC00OTdkLTRjNmQtOTYwOS1hNzg5ZTRlMTRjZmUifQ.CT0HRF6OLj7VPZ8p5Y_0S8rOL8SEUznwJJkR-YReKwc"
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .expiresAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .expiresInSeconds(3600L)
                    .addPermission(ActionShareResponse.Data.Permission.PORTING_ORDER_DOCUMENT_READ)
                    .addPermission(
                        ActionShareResponse.Data.Permission.PORTING_ORDER_DOCUMENT_UPDATE
                    )
                    .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                    .recordType("porting_order_sharing_token")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionShareResponse =
            ActionShareResponse.builder()
                .data(
                    ActionShareResponse.Data.builder()
                        .id("0a4b78a0-d416-4761-94f7-46c72ec56547")
                        .token(
                            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2ODk4OTQ2NzcsImlzdCI6MTY4OTg5MTA3NywicGVybWlzc2lvbnMiOlsicG9ydGluZ19vcmRlci5kb2N1bWVudC5yZWFkIl0sInBvcnRpbmdfb3JkZXJfaWQiOiJmZDRiODZjOC00OTdkLTRjNmQtOTYwOS1hNzg5ZTRlMTRjZmUifQ.CT0HRF6OLj7VPZ8p5Y_0S8rOL8SEUznwJJkR-YReKwc"
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .expiresAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .expiresInSeconds(3600L)
                        .addPermission(
                            ActionShareResponse.Data.Permission.PORTING_ORDER_DOCUMENT_READ
                        )
                        .addPermission(
                            ActionShareResponse.Data.Permission.PORTING_ORDER_DOCUMENT_UPDATE
                        )
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_order_sharing_token")
                        .build()
                )
                .build()

        val roundtrippedActionShareResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionShareResponse),
                jacksonTypeRef<ActionShareResponse>(),
            )

        assertThat(roundtrippedActionShareResponse).isEqualTo(actionShareResponse)
    }
}
