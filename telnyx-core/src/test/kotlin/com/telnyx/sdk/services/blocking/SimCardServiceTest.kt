// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.SimCardStatus
import com.telnyx.sdk.models.simcards.SimCard
import com.telnyx.sdk.models.simcards.SimCardDeleteParams
import com.telnyx.sdk.models.simcards.SimCardRetrieveParams
import com.telnyx.sdk.models.simcards.SimCardUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val simCard =
            simCardService.retrieve(
                SimCardRetrieveParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .includePinPukCodes(true)
                    .includeSimCardGroup(true)
                    .build()
            )

        simCard.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val simCard =
            simCardService.update(
                SimCardUpdateParams.builder()
                    .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .simCard(
                        SimCard.builder()
                            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .actionsInProgress(true)
                            .authorizedImeis(
                                listOf("106516771852751", "534051870479563", "508821468377961")
                            )
                            .createdAt("2018-02-02T22:25:27.521Z")
                            .currentBillingPeriodConsumedData(
                                SimCard.CurrentBillingPeriodConsumedData.builder()
                                    .amount("2049.0")
                                    .unit("MB")
                                    .build()
                            )
                            .currentDeviceLocation(
                                SimCard.CurrentDeviceLocation.builder()
                                    .accuracy(1250L)
                                    .accuracyUnit("m")
                                    .latitude("41.143")
                                    .longitude("-8.605")
                                    .build()
                            )
                            .currentImei("457032284023794")
                            .currentMcc("410")
                            .currentMnc("260")
                            .dataLimit(
                                SimCard.DataLimit.builder()
                                    .amount("2048.1")
                                    .unit(SimCard.DataLimit.Unit.MB)
                                    .build()
                            )
                            .eid(null)
                            .esimInstallationStatus(SimCard.EsimInstallationStatus.RELEASED)
                            .iccid("89310410106543789301")
                            .imsi("081932214823362973")
                            .ipv4("192.168.0.0")
                            .ipv6("2001:cdba:0000:0000:0000:0000:3257:9652")
                            .liveDataSession(SimCard.LiveDataSession.CONNECTED)
                            .msisdn("+13109976224")
                            .pinPukCodes(
                                SimCard.PinPukCodes.builder()
                                    .pin1("1234")
                                    .pin2("5678")
                                    .puk1("12345678")
                                    .puk2("87654321")
                                    .build()
                            )
                            .recordType("sim_card")
                            .addResourcesWithInProgressAction(
                                SimCard.ResourcesWithInProgressAction.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .status(
                                SimCardStatus.builder()
                                    .reason(
                                        "The SIM card is active, ready to connect to networks and consume data."
                                    )
                                    .value(SimCardStatus.SimCardStatusValue.ENABLED)
                                    .build()
                            )
                            .tags(listOf("personal", "customers", "active-customers"))
                            .type(SimCard.Type.PHYSICAL)
                            .updatedAt("2018-02-02T22:25:27.521Z")
                            .version("4.3")
                            .build()
                    )
                    .build()
            )

        simCard.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val page = simCardService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val simCard =
            simCardService.delete(
                SimCardDeleteParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .reportLost(true)
                    .build()
            )

        simCard.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getActivationCode() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val response = simCardService.getActivationCode("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDeviceDetails() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val response = simCardService.getDeviceDetails("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getPublicIp() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val response = simCardService.getPublicIp("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listWirelessConnectivityLogs() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardService = client.simCards()

        val page =
            simCardService.listWirelessConnectivityLogs("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        page.response().validate()
    }
}
