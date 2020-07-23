# TransferCallRequestAnsweringMachineDetectionConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**totalAnalysisTimeMillis** | **Integer** | Maximum timeout threshold for overall detection. |  [optional]
**afterGreetingSilenceMillis** | **Integer** | Silence duration threshold after a greeting message or voice for it be considered human. |  [optional]
**betweenWordsSilenceMillis** | **Integer** | Maximum threshold for silence between words. |  [optional]
**greetingDurationMillis** | **Integer** | Maximum threshold of a human greeting. If greeting longer than this value, considered machine. |  [optional]
**initialSilenceMillis** | **Integer** | If initial silence duration is greater than this value, consider it a machine. |  [optional]
**maximumNumberOfWords** | **Integer** | If number of detected words is greater than this value, consder it a machine. |  [optional]
**maximumWordLengthMillis** | **Integer** | If a single word lasts longer than this threshold, consider it a machine. |  [optional]
**silenceThreshold** | **Integer** | Minimum noise threshold for any analysis. |  [optional]
**greetingTotalAnalysisTimeMillis** | **Integer** | If machine already detected, maximum timeout threshold to determine the end of the machine greeting. |  [optional]
**greetingSilenceDurationMillis** | **Integer** | If machine already detected, maximum threshold for silence between words. If exceeded, the greeting is considered ended. |  [optional]
