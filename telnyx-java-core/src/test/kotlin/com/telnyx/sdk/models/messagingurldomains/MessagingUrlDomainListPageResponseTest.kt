// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingurldomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.MessagingPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingUrlDomainListPageResponseTest {

    @Test
    fun create() {
        val messagingUrlDomainListPageResponse =
            MessagingUrlDomainListPageResponse.builder()
                .addData(
                    MessagingUrlDomainListResponse.builder()
                        .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                        .recordType("messaging_url_domain")
                        .urlDomain("http://example.com")
                        .useCase("test")
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingUrlDomainListPageResponse.data().getOrNull())
            .containsExactly(
                MessagingUrlDomainListResponse.builder()
                    .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                    .recordType("messaging_url_domain")
                    .urlDomain("http://example.com")
                    .useCase("test")
                    .build()
            )
        assertThat(messagingUrlDomainListPageResponse.meta())
            .contains(
                MessagingPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingUrlDomainListPageResponse =
            MessagingUrlDomainListPageResponse.builder()
                .addData(
                    MessagingUrlDomainListResponse.builder()
                        .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                        .recordType("messaging_url_domain")
                        .urlDomain("http://example.com")
                        .useCase("test")
                        .build()
                )
                .meta(
                    MessagingPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedMessagingUrlDomainListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingUrlDomainListPageResponse),
                jacksonTypeRef<MessagingUrlDomainListPageResponse>(),
            )

        assertThat(roundtrippedMessagingUrlDomainListPageResponse)
            .isEqualTo(messagingUrlDomainListPageResponse)
    }
}
