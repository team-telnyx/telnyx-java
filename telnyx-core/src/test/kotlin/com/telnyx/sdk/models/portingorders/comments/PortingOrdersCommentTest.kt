// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrdersCommentTest {

    @Test
    fun create() {
        val portingOrdersComment =
            PortingOrdersComment.builder()
                .id("f1486bae-f067-460c-ad43-73a92848f902")
                .body("Great experience so far")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_comment")
                .userType(PortingOrdersComment.UserType.USER)
                .build()

        assertThat(portingOrdersComment.id()).contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingOrdersComment.body()).contains("Great experience so far")
        assertThat(portingOrdersComment.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(portingOrdersComment.portingOrderId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingOrdersComment.recordType()).contains("porting_comment")
        assertThat(portingOrdersComment.userType()).contains(PortingOrdersComment.UserType.USER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrdersComment =
            PortingOrdersComment.builder()
                .id("f1486bae-f067-460c-ad43-73a92848f902")
                .body("Great experience so far")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_comment")
                .userType(PortingOrdersComment.UserType.USER)
                .build()

        val roundtrippedPortingOrdersComment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrdersComment),
                jacksonTypeRef<PortingOrdersComment>(),
            )

        assertThat(roundtrippedPortingOrdersComment).isEqualTo(portingOrdersComment)
    }
}
