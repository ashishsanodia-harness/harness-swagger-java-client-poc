# Segment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **Long** | The data and time in milliseconds when the group was created |  [optional]
**environment** | **String** | The environment this target group belongs to |  [optional]
**excluded** | [**List&lt;Target&gt;**](Target.md) | A list of Targets who are excluded from this target group |  [optional]
**identifier** | **String** | Unique identifier for the target group. | 
**included** | [**List&lt;Target&gt;**](Target.md) | A list of Targets who belong to this target group |  [optional]
**modifiedAt** | **Long** | The data and time in milliseconds when the group was last modified |  [optional]
**name** | **String** | Name of the target group. | 
**rules** | [**List&lt;Clause&gt;**](Clause.md) | An array of rules that can cause a user to be included in this segment. |  [optional]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | Tags for this target group |  [optional]
**version** | **Long** | The version of this group.  Each time it is modified the version is incremented |  [optional]
