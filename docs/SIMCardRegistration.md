

# SIMCardRegistration


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**simCardGroupId** | **UUID** | The group SIMCardGroup identification. This attribute can be &lt;code&gt;null&lt;/code&gt; when it&#39;s present in an associated resource. |  [optional]
**tags** | **List&lt;String&gt;** | Searchable tags associated with the SIM card |  [optional]
**registrationCodes** | **List&lt;String&gt;** |  | 
**status** | [**StatusEnum**](#StatusEnum) | Status on which the SIM card will be set after being successful registered. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;
STANDBY | &quot;standby&quot;



