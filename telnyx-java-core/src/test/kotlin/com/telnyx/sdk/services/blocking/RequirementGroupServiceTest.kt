// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.requirementgroups.RequirementGroupCreateParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupListParams
import com.telnyx.sdk.models.requirementgroups.RequirementGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RequirementGroupServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementGroupService = client.requirementGroups()

        val requirementGroup =
            requirementGroupService.create(
                RequirementGroupCreateParams.builder()
                    .action(RequirementGroupCreateParams.Action.ORDERING)
                    .countryCode("US")
                    .phoneNumberType(RequirementGroupCreateParams.PhoneNumberType.LOCAL)
                    .customerReference("My Requirement Group")
                    .addRegulatoryRequirement(
                        RequirementGroupCreateParams.RegulatoryRequirement.builder()
                            .fieldValue("field_value")
                            .requirementId("requirement_id")
                            .build()
                    )
                    .build()
            )

        requirementGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementGroupService = client.requirementGroups()

        val requirementGroup = requirementGroupService.retrieve("id")

        requirementGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementGroupService = client.requirementGroups()

        val requirementGroup =
            requirementGroupService.update(
                RequirementGroupUpdateParams.builder()
                    .id("id")
                    .customerReference("0002")
                    .addRegulatoryRequirement(
                        RequirementGroupUpdateParams.RegulatoryRequirement.builder()
                            .fieldValue("new requirement value")
                            .requirementId("53970723-fbff-4f46-a975-f62be6c1a585")
                            .build()
                    )
                    .build()
            )

        requirementGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementGroupService = client.requirementGroups()

        val requirementGroups =
            requirementGroupService.list(
                RequirementGroupListParams.builder()
                    .filter(
                        RequirementGroupListParams.Filter.builder()
                            .action(RequirementGroupListParams.Filter.Action.ORDERING)
                            .countryCode("country_code")
                            .customerReference("customer_reference")
                            .phoneNumberType(
                                RequirementGroupListParams.Filter.PhoneNumberType.LOCAL
                            )
                            .status(RequirementGroupListParams.Filter.Status.APPROVED)
                            .build()
                    )
                    .build()
            )

        requirementGroups.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementGroupService = client.requirementGroups()

        val requirementGroup = requirementGroupService.delete("id")

        requirementGroup.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun submitForApproval() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val requirementGroupService = client.requirementGroups()

        val requirementGroup = requirementGroupService.submitForApproval("id")

        requirementGroup.validate()
    }
}
