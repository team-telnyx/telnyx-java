

# WhatsappBusinessAccountWhatsappSettings

The Facebook settings associated with the business account

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique ID of the business account in Facebook |  [optional]
**name** | **String** | The name of the business account in Facebook |  [optional]
**accountReviewStatus** | [**AccountReviewStatusEnum**](#AccountReviewStatusEnum) | The review status of the account in Facebook.&lt;/br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;PENDING&lt;/code&gt;The account is waiting for review by the WhatsApp team. At this stage, the account is allowed only to send messages using the pre-approved messaging templates, from a single verified phone-number.&lt;/li&gt;&lt;li&gt;&lt;code&gt;APPROVED&lt;/code&gt;The WhatsApp team demeed the account as valid and now it has access to all capabilities that the WhatsApp integration offers.&lt;/li&gt;&lt;li&gt;&lt;code&gt;REJECTED&lt;/code&gt;The account was rejected by the WhatsApp team. It will need to re-submit its business information to resume the approval process.&lt;/li&gt;&lt;/ul&gt; |  [optional]
**ownerBusinessId** | **String** | The unique ID of the business that owns the account in Facebook |  [optional]
**ownerBusinessName** | **String** | The name of the business that owns the account in Facebook |  [optional]
**messageTemplateNamespace** | **String** | The account&#39;s message template namespace provideded by Facebook |  [optional]
**banState** | [**BanStateEnum**](#BanStateEnum) | The ban state of the account in Facebook. |  [optional]
**banDate** | **LocalDate** | The date the account was banned in Facebook. |  [optional]



## Enum: AccountReviewStatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;



## Enum: BanStateEnum

Name | Value
---- | -----
SCHEDULE_FOR_DISABLE | &quot;SCHEDULE_FOR_DISABLE&quot;
DISABLE | &quot;DISABLE&quot;
REINSTATE | &quot;REINSTATE&quot;



