

# DocReqsRequirementTypeAcceptanceCriteria

Specifies objective criteria for acceptance

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timeLimit** | **String** | Specifies time-based acceptance criteria |  [optional] |
|**localityLimit** | **String** | Specifies geography-based acceptance criteria |  [optional] |
|**acceptableValues** | **List&lt;String&gt;** | Specifies the list of strictly possible values for the requirement. Ignored when empty |  [optional] |
|**maxLength** | **Integer** | Maximum length allowed for the value |  [optional] |
|**minLength** | **Integer** | Minimum length allowed for the value |  [optional] |
|**acceptableCharacters** | **String** | Specifies the allowed characters as a string |  [optional] |
|**caseSensitive** | **Boolean** | Specifies whether string matching should be case sensitive |  [optional] |
|**regex** | **String** | A regular expression pattern that the value must match |  [optional] |



