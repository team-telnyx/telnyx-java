

# CredentialOutbound


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callParkingEnabled** | **Boolean** | Forces all SIP calls originated on this connection to be \&quot;parked\&quot; instead of \&quot;bridged\&quot; to the destination specified on the URI. Parked calls will return ringback to the caller and will await for a Call Control command to define which action will be taken next. |  [optional] |
|**aniOverride** | **String** | Set a phone number as the ani_override value to override caller id number on outbound calls. |  [optional] |
|**aniOverrideType** | [**AniOverrideTypeEnum**](#AniOverrideTypeEnum) | Specifies when we apply your ani_override setting. Only applies when ani_override is not blank. |  [optional] |
|**channelLimit** | **Integer** | When set, this will limit the total number of outbound calls to phone numbers associated with this connection. |  [optional] |
|**instantRingbackEnabled** | **Boolean** | When set, ringback will not wait for indication before sending ringback tone to calling party. |  [optional] |
|**generateRingbackTone** | **Boolean** | Generate ringback tone through 183 session progress message with early media. |  [optional] |
|**localization** | **String** | A 2-character country code specifying the country whose national dialing rules should be used. For example, if set to &#x60;US&#x60; then any US number can be dialed without preprending +1 to the number. When left blank, Telnyx will try US and GB dialing rules, in that order, by default. |  [optional] |
|**t38ReinviteSource** | [**T38ReinviteSourceEnum**](#T38ReinviteSourceEnum) | This setting only affects connections with Fax-type Outbound Voice Profiles. The setting dictates whether or not Telnyx sends a t.38 reinvite.&lt;br/&gt;&lt;br/&gt; By default, Telnyx will send the re-invite. If set to &#x60;customer&#x60;, the caller is expected to send the t.38 reinvite. |  [optional] |
|**outboundVoiceProfileId** | **String** | Identifies the associated outbound voice profile. |  [optional] |



## Enum: AniOverrideTypeEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;always&quot; |
| NORMAL | &quot;normal&quot; |
| EMERGENCY | &quot;emergency&quot; |



## Enum: T38ReinviteSourceEnum

| Name | Value |
|---- | -----|
| TELNYX | &quot;telnyx&quot; |
| CUSTOMER | &quot;customer&quot; |
| DISABLED | &quot;disabled&quot; |
| PASSTHRU | &quot;passthru&quot; |
| CALLER_PASSTHRU | &quot;caller-passthru&quot; |
| CALLEE_PASSTHRU | &quot;callee-passthru&quot; |



