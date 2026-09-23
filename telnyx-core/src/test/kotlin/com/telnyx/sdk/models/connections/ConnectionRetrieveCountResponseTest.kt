// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.connections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionRetrieveCountResponseTest {

    @Test
    fun create() {
        val connectionRetrieveCountResponse =
            ConnectionRetrieveCountResponse.builder()
                .data(
                    ConnectionRetrieveCountResponse.Data.builder()
                        .counts(
                            ConnectionRetrieveCountResponse.Data.Counts.builder()
                                .callControlApplications(0L)
                                .credentialConnections(0L)
                                .externalConnections(0L)
                                .faxConnections(0L)
                                .fqdnConnections(0L)
                                .ipConnections(0L)
                                .microsoftTeamsSbcConnections(0L)
                                .mobileVoiceConnections(0L)
                                .operatorConnectConnections(0L)
                                .texmlApplications(0L)
                                .thirdPartyProviderConnections(0L)
                                .uacConnections(0L)
                                .zoomSbcConnections(0L)
                                .build()
                        )
                        .limits(
                            ConnectionRetrieveCountResponse.Data.Limits.GlobalConnectionLimit
                                .builder()
                                .globalLimit(10000L)
                                .build()
                        )
                        .recordType("connections_count")
                        .build()
                )
                .build()

        assertThat(connectionRetrieveCountResponse.data())
            .isEqualTo(
                ConnectionRetrieveCountResponse.Data.builder()
                    .counts(
                        ConnectionRetrieveCountResponse.Data.Counts.builder()
                            .callControlApplications(0L)
                            .credentialConnections(0L)
                            .externalConnections(0L)
                            .faxConnections(0L)
                            .fqdnConnections(0L)
                            .ipConnections(0L)
                            .microsoftTeamsSbcConnections(0L)
                            .mobileVoiceConnections(0L)
                            .operatorConnectConnections(0L)
                            .texmlApplications(0L)
                            .thirdPartyProviderConnections(0L)
                            .uacConnections(0L)
                            .zoomSbcConnections(0L)
                            .build()
                    )
                    .limits(
                        ConnectionRetrieveCountResponse.Data.Limits.GlobalConnectionLimit.builder()
                            .globalLimit(10000L)
                            .build()
                    )
                    .recordType("connections_count")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionRetrieveCountResponse =
            ConnectionRetrieveCountResponse.builder()
                .data(
                    ConnectionRetrieveCountResponse.Data.builder()
                        .counts(
                            ConnectionRetrieveCountResponse.Data.Counts.builder()
                                .callControlApplications(0L)
                                .credentialConnections(0L)
                                .externalConnections(0L)
                                .faxConnections(0L)
                                .fqdnConnections(0L)
                                .ipConnections(0L)
                                .microsoftTeamsSbcConnections(0L)
                                .mobileVoiceConnections(0L)
                                .operatorConnectConnections(0L)
                                .texmlApplications(0L)
                                .thirdPartyProviderConnections(0L)
                                .uacConnections(0L)
                                .zoomSbcConnections(0L)
                                .build()
                        )
                        .limits(
                            ConnectionRetrieveCountResponse.Data.Limits.GlobalConnectionLimit
                                .builder()
                                .globalLimit(10000L)
                                .build()
                        )
                        .recordType("connections_count")
                        .build()
                )
                .build()

        val roundtrippedConnectionRetrieveCountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionRetrieveCountResponse),
                jacksonTypeRef<ConnectionRetrieveCountResponse>(),
            )

        assertThat(roundtrippedConnectionRetrieveCountResponse)
            .isEqualTo(connectionRetrieveCountResponse)
    }
}
