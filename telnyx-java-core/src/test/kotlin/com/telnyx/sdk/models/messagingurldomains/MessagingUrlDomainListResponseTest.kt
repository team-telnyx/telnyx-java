// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingurldomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingUrlDomainListResponseTest {

    @Test
    fun create() {
        val messagingUrlDomainListResponse =
            MessagingUrlDomainListResponse.builder()
                .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                .recordType("messaging_url_domain")
                .urlDomain("http://example.com")
                .useCase("test")
                .build()

        assertThat(messagingUrlDomainListResponse.id())
            .contains("464bd54e-a328-4b11-a131-28e6793cb6f2")
        assertThat(messagingUrlDomainListResponse.recordType()).contains("messaging_url_domain")
        assertThat(messagingUrlDomainListResponse.urlDomain()).contains("http://example.com")
        assertThat(messagingUrlDomainListResponse.useCase()).contains("test")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingUrlDomainListResponse =
            MessagingUrlDomainListResponse.builder()
                .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                .recordType("messaging_url_domain")
                .urlDomain("http://example.com")
                .useCase("test")
                .build()

        val roundtrippedMessagingUrlDomainListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingUrlDomainListResponse),
                jacksonTypeRef<MessagingUrlDomainListResponse>(),
            )

        assertThat(roundtrippedMessagingUrlDomainListResponse)
            .isEqualTo(messagingUrlDomainListResponse)
    }
}
