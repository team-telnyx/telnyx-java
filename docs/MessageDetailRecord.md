

# MessageDetailRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Message id |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Message sent time |  [optional]
**outboundProfileName** | **String** | Configured profile name. New profiles can be created and configured on Telnyx portal |  [optional]
**outboundProfileId** | **String** | Configured profile id. New profiles can be created and configured on Telnyx portal |  [optional]
**direction** | [**Direction**](Direction.md) |  |  [optional]
**parts** | **Integer** | Number of parts this message has. Max number of character is 160. If message contains more characters then that it will be broken down in multiple parts |  [optional]
**status** | [**MessageStatus**](MessageStatus.md) |  |  [optional]
**cld** | **String** | The destination number for a call, or the callee |  [optional]
**cli** | **String** | The number associated with the person initiating the call, or the caller |  [optional]
**rate** | [**MessageRate**](MessageRate.md) |  |  [optional]
**cost** | [**MessageCost**](MessageCost.md) |  |  [optional]
**countryIso** | **String** | Cld number ISO country code. |  [optional]
**messageType** | [**MessageType**](MessageType.md) |  |  [optional]
**errors** | **List&lt;String&gt;** | Error returned by the gateway in case sending of message failed. |  [optional]
**normalizedCarrier** | **String** | Cld carrier. |  [optional]
**passThroughFee** | [**PassThroughFee**](PassThroughFee.md) |  |  [optional]
**tags** | **String** | User tag. |  [optional]
**mcc** | **String** | Mobile country code. |  [optional]
**mnc** | **String** | Mobile network code. |  [optional]
**product** | [**Product**](Product.md) |  |  [optional]
**recordType** | **String** |  | 
**userId** | **String** | User id |  [optional]



