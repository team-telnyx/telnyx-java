

# MdrDetailResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **OffsetDateTime** | Message sent time |  [optional]
**profileName** | **String** | Configured profile name. New profiles can be created and configured on Telnyx portal |  [optional]
**direction** | **String** | Direction of message - inbound or outbound. |  [optional]
**parts** | **BigDecimal** | Number of parts this message has. Max number of character is 160. If message contains more characters then that it will be broken down in multiple parts |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Message status |  [optional]
**cld** | **String** | The destination number for a call, or the callee |  [optional]
**cli** | **String** | The number associated with the person initiating the call, or the caller |  [optional]
**rate** | **String** | Rate applied to the message |  [optional]
**cost** | **String** | Final cost. Cost is calculated as rate * parts |  [optional]
**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency of the rate and cost |  [optional]
**id** | **String** | Id of message detail record |  [optional]
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Type of message |  [optional]
**recordType** | **String** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
GW_TIMEOUT | &quot;GW_TIMEOUT&quot;
DELIVERED | &quot;DELIVERED&quot;
DLR_UNCONFIRMED | &quot;DLR_UNCONFIRMED&quot;
DLR_TIMEOUT | &quot;DLR_TIMEOUT&quot;
RECEIVED | &quot;RECEIVED&quot;
GW_REJECT | &quot;GW_REJECT&quot;
FAILED | &quot;FAILED&quot;



## Enum: CurrencyEnum

Name | Value
---- | -----
AUD | &quot;AUD&quot;
CAD | &quot;CAD&quot;
EUR | &quot;EUR&quot;
GBP | &quot;GBP&quot;
USD | &quot;USD&quot;



## Enum: MessageTypeEnum

Name | Value
---- | -----
SMS | &quot;SMS&quot;
MMS | &quot;MMS&quot;



