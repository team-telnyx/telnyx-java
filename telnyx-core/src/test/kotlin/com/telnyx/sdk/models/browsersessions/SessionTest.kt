// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.browsersessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionTest {

    @Test
    fun create() {
        val session =
            Session.builder()
                .id("bsess_3b108e10-906a-486e-9132-196726ba7979")
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .lastActivityAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limits(Session.Limits.builder().idleTimeoutS(0L).lifetimeS(0L).build())
                .metadata(
                    Session.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .policy(Session.Policy.builder().addAllowedDomain("string").build())
                .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Session.Status.PROVISIONING)
                .build()

        assertThat(session.id()).isEqualTo("bsess_3b108e10-906a-486e-9132-196726ba7979")
        assertThat(session.closedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.failureReason()).contains("failure_reason")
        assertThat(session.lastActivityAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.limits())
            .isEqualTo(Session.Limits.builder().idleTimeoutS(0L).lifetimeS(0L).build())
        assertThat(session.metadata())
            .isEqualTo(
                Session.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(session.policy())
            .isEqualTo(Session.Policy.builder().addAllowedDomain("string").build())
        assertThat(session.readyAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.status()).isEqualTo(Session.Status.PROVISIONING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val session =
            Session.builder()
                .id("bsess_3b108e10-906a-486e-9132-196726ba7979")
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .failureReason("failure_reason")
                .lastActivityAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limits(Session.Limits.builder().idleTimeoutS(0L).lifetimeS(0L).build())
                .metadata(
                    Session.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .policy(Session.Policy.builder().addAllowedDomain("string").build())
                .readyAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(Session.Status.PROVISIONING)
                .build()

        val roundtrippedSession =
            jsonMapper.readValue(jsonMapper.writeValueAsString(session), jacksonTypeRef<Session>())

        assertThat(roundtrippedSession).isEqualTo(session)
    }
}
