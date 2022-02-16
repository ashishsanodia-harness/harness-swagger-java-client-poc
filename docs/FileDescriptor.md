# FileDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proto** | [**FileDescriptorProto**](FileDescriptorProto.md) |  |  [optional]
**messageTypes** | [**List&lt;Descriptor&gt;**](Descriptor.md) |  |  [optional]
**enumTypes** | [**List&lt;EnumDescriptor&gt;**](EnumDescriptor.md) |  |  [optional]
**services** | [**List&lt;ServiceDescriptor&gt;**](ServiceDescriptor.md) |  |  [optional]
**extensions** | [**List&lt;FieldDescriptor&gt;**](FieldDescriptor.md) |  |  [optional]
**dependencies** | [**List&lt;FileDescriptor&gt;**](FileDescriptor.md) |  |  [optional]
**publicDependencies** | [**List&lt;FileDescriptor&gt;**](FileDescriptor.md) |  |  [optional]
**fullName** | **String** |  |  [optional]
**options** | [**FileOptions**](FileOptions.md) |  |  [optional]
**syntax** | [**SyntaxEnum**](#SyntaxEnum) |  |  [optional]
**name** | **String** |  |  [optional]
**_package** | **String** |  |  [optional]
**file** | [**FileDescriptor**](FileDescriptor.md) |  |  [optional]

<a name="SyntaxEnum"></a>
## Enum: SyntaxEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PROTO2 | &quot;PROTO2&quot;
PROTO3 | &quot;PROTO3&quot;
