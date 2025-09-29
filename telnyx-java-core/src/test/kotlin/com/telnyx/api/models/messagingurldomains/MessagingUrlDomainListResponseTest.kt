// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingurldomains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingUrlDomainListResponseTest {

    @Test
    fun create() {
        val messagingUrlDomainListResponse =
            MessagingUrlDomainListResponse.builder()
                .addData(
                    MessagingUrlDomainListResponse.Data.builder()
                        .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                        .recordType("messaging_url_domain")
                        .urlDomain("http://example.com")
                        .useCase("test")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(messagingUrlDomainListResponse.data().getOrNull())
            .containsExactly(
                MessagingUrlDomainListResponse.Data.builder()
                    .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                    .recordType("messaging_url_domain")
                    .urlDomain("http://example.com")
                    .useCase("test")
                    .build()
            )
        assertThat(messagingUrlDomainListResponse.meta())
            .contains(
                PaginationMeta.builder()
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
        val messagingUrlDomainListResponse =
            MessagingUrlDomainListResponse.builder()
                .addData(
                    MessagingUrlDomainListResponse.Data.builder()
                        .id("464bd54e-a328-4b11-a131-28e6793cb6f2")
                        .recordType("messaging_url_domain")
                        .urlDomain("http://example.com")
                        .useCase("test")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
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
