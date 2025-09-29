// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.portingorders

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementInitiateParams
import com.telnyx.api.models.portingorders.actionrequirements.ActionRequirementListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionRequirementServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionRequirementService = client.portingOrders().actionRequirements()

        val actionRequirements =
            actionRequirementService.list(
                ActionRequirementListParams.builder()
                    .portingOrderId("porting_order_id")
                    .filter(
                        ActionRequirementListParams.Filter.builder()
                            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .actionType(
                                ActionRequirementListParams.Filter.ActionType.AU_ID_VERIFICATION
                            )
                            .requirementTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .status(ActionRequirementListParams.Filter.Status.CREATED)
                            .build()
                    )
                    .page(ActionRequirementListParams.Page.builder().number(1L).size(1L).build())
                    .sort(
                        ActionRequirementListParams.Sort.builder()
                            .value(ActionRequirementListParams.Sort.Value.CREATED_AT)
                            .build()
                    )
                    .build()
            )

        actionRequirements.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun initiate() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionRequirementService = client.portingOrders().actionRequirements()

        val response =
            actionRequirementService.initiate(
                ActionRequirementInitiateParams.builder()
                    .portingOrderId("porting_order_id")
                    .id("id")
                    .params(
                        ActionRequirementInitiateParams.Params.builder()
                            .firstName("John")
                            .lastName("Doe")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
