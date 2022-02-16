# Feature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **Boolean** | Indicates if the flag has been archived and is no longer used | 
**createdAt** | **Long** | The date the flag was created in milliseconds | 
**defaultOffVariation** | **String** | The default value returned when a flag is off | 
**defaultOnVariation** | **String** | The default value returned when a flag is on | 
**description** | **String** | A description for this flag |  [optional]
**envProperties** | [**FeatureEnvProperties**](FeatureEnvProperties.md) |  |  [optional]
**evaluation** | **String** | The value that the flag will return for the current user |  [optional]
**evaluationIdentifier** | **String** | The identifier for the returned evaluation |  [optional]
**identifier** | **String** | The Feature Flag identifier | 
**kind** | [**KindEnum**](#KindEnum) | The type of Feature flag | 
**modifiedAt** | **Long** | The date the flag was last modified in milliseconds | 
**name** | **String** | The name of the Feature Flag | 
**owner** | **List&lt;String&gt;** | The user who created the flag |  [optional]
**permanent** | **Boolean** | Indicates if this is a permanent flag, or one that should expire | 
**prerequisites** | [**List&lt;Prerequisite&gt;**](Prerequisite.md) |  |  [optional]
**project** | **String** | The project this Feature belongs to | 
**results** | [**List&lt;Results&gt;**](Results.md) | The results shows which variations have been evaluated, and how many times each of these have been evaluated. |  [optional]
**status** | [**FeatureStatus**](FeatureStatus.md) |  |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | A list of tags for this Feature Flag |  [optional]
**variations** | [**List&lt;Variation&gt;**](Variation.md) | The variations that can be returned for this flag | 

<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
BOOLEAN | &quot;boolean&quot;
INT | &quot;int&quot;
STRING | &quot;string&quot;
JSON | &quot;json&quot;
