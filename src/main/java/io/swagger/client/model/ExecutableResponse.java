/*
 * CD NextGen API Reference
 * This is the Open Api Spec 3 for the NextGen Manager. This is under active development. Beware of the breaking change with respect to the generated code stub  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 3.0
 * Contact: contact@harness.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.AsyncExecutableResponse;
import io.swagger.client.model.AsyncExecutableResponseOrBuilder;
import io.swagger.client.model.ChildChainExecutableResponse;
import io.swagger.client.model.ChildChainExecutableResponseOrBuilder;
import io.swagger.client.model.ChildExecutableResponse;
import io.swagger.client.model.ChildExecutableResponseOrBuilder;
import io.swagger.client.model.ChildrenExecutableResponse;
import io.swagger.client.model.ChildrenExecutableResponseOrBuilder;
import io.swagger.client.model.Descriptor;
import io.swagger.client.model.ExecutableResponse;
import io.swagger.client.model.ParserExecutableResponse;
import io.swagger.client.model.SkipTaskExecutableResponse;
import io.swagger.client.model.SkipTaskExecutableResponseOrBuilder;
import io.swagger.client.model.SyncExecutableResponse;
import io.swagger.client.model.SyncExecutableResponseOrBuilder;
import io.swagger.client.model.TaskChainExecutableResponse;
import io.swagger.client.model.TaskChainExecutableResponseOrBuilder;
import io.swagger.client.model.TaskExecutableResponse;
import io.swagger.client.model.TaskExecutableResponseOrBuilder;
import io.swagger.client.model.UnknownFieldSet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ExecutableResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ExecutableResponse {
  @SerializedName("unknownFields")
  private UnknownFieldSet unknownFields = null;

  @SerializedName("async")
  private AsyncExecutableResponse async = null;

  @SerializedName("initialized")
  private Boolean initialized = null;

  @SerializedName("children")
  private ChildrenExecutableResponse children = null;

  @SerializedName("task")
  private TaskExecutableResponse task = null;

  @SerializedName("child")
  private ChildExecutableResponse child = null;

  /**
   * Gets or Sets responseCase
   */
  @JsonAdapter(ResponseCaseEnum.Adapter.class)
  public enum ResponseCaseEnum {
    ASYNC("ASYNC"),
    CHILD("CHILD"),
    CHILDREN("CHILDREN"),
    CHILDCHAIN("CHILDCHAIN"),
    TASK("TASK"),
    TASKCHAIN("TASKCHAIN"),
    SYNC("SYNC"),
    SKIPTASK("SKIPTASK"),
    RESPONSE_NOT_SET("RESPONSE_NOT_SET");

    private String value;

    ResponseCaseEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ResponseCaseEnum fromValue(String input) {
      for (ResponseCaseEnum b : ResponseCaseEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ResponseCaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResponseCaseEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ResponseCaseEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ResponseCaseEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("responseCase")
  private ResponseCaseEnum responseCase = null;

  @SerializedName("asyncOrBuilder")
  private AsyncExecutableResponseOrBuilder asyncOrBuilder = null;

  @SerializedName("childOrBuilder")
  private ChildExecutableResponseOrBuilder childOrBuilder = null;

  @SerializedName("childrenOrBuilder")
  private ChildrenExecutableResponseOrBuilder childrenOrBuilder = null;

  @SerializedName("childChain")
  private ChildChainExecutableResponse childChain = null;

  @SerializedName("childChainOrBuilder")
  private ChildChainExecutableResponseOrBuilder childChainOrBuilder = null;

  @SerializedName("taskOrBuilder")
  private TaskExecutableResponseOrBuilder taskOrBuilder = null;

  @SerializedName("taskChain")
  private TaskChainExecutableResponse taskChain = null;

  @SerializedName("taskChainOrBuilder")
  private TaskChainExecutableResponseOrBuilder taskChainOrBuilder = null;

  @SerializedName("syncOrBuilder")
  private SyncExecutableResponseOrBuilder syncOrBuilder = null;

  @SerializedName("skipTask")
  private SkipTaskExecutableResponse skipTask = null;

  @SerializedName("skipTaskOrBuilder")
  private SkipTaskExecutableResponseOrBuilder skipTaskOrBuilder = null;

  @SerializedName("sync")
  private SyncExecutableResponse sync = null;

  @SerializedName("serializedSize")
  private Integer serializedSize = null;

  @SerializedName("parserForType")
  private ParserExecutableResponse parserForType = null;

  @SerializedName("defaultInstanceForType")
  private ExecutableResponse defaultInstanceForType = null;

  @SerializedName("allFields")
  private Map<String, Object> allFields = null;

  @SerializedName("initializationErrorString")
  private String initializationErrorString = null;

  @SerializedName("descriptorForType")
  private Descriptor descriptorForType = null;

  @SerializedName("memoizedSerializedSize")
  private Integer memoizedSerializedSize = null;

  public ExecutableResponse unknownFields(UnknownFieldSet unknownFields) {
    this.unknownFields = unknownFields;
    return this;
  }

   /**
   * Get unknownFields
   * @return unknownFields
  **/
  @Schema(description = "")
  public UnknownFieldSet getUnknownFields() {
    return unknownFields;
  }

  public void setUnknownFields(UnknownFieldSet unknownFields) {
    this.unknownFields = unknownFields;
  }

  public ExecutableResponse async(AsyncExecutableResponse async) {
    this.async = async;
    return this;
  }

   /**
   * Get async
   * @return async
  **/
  @Schema(description = "")
  public AsyncExecutableResponse getAsync() {
    return async;
  }

  public void setAsync(AsyncExecutableResponse async) {
    this.async = async;
  }

  public ExecutableResponse initialized(Boolean initialized) {
    this.initialized = initialized;
    return this;
  }

   /**
   * Get initialized
   * @return initialized
  **/
  @Schema(description = "")
  public Boolean isInitialized() {
    return initialized;
  }

  public void setInitialized(Boolean initialized) {
    this.initialized = initialized;
  }

  public ExecutableResponse children(ChildrenExecutableResponse children) {
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(description = "")
  public ChildrenExecutableResponse getChildren() {
    return children;
  }

  public void setChildren(ChildrenExecutableResponse children) {
    this.children = children;
  }

  public ExecutableResponse task(TaskExecutableResponse task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @Schema(description = "")
  public TaskExecutableResponse getTask() {
    return task;
  }

  public void setTask(TaskExecutableResponse task) {
    this.task = task;
  }

  public ExecutableResponse child(ChildExecutableResponse child) {
    this.child = child;
    return this;
  }

   /**
   * Get child
   * @return child
  **/
  @Schema(description = "")
  public ChildExecutableResponse getChild() {
    return child;
  }

  public void setChild(ChildExecutableResponse child) {
    this.child = child;
  }

  public ExecutableResponse responseCase(ResponseCaseEnum responseCase) {
    this.responseCase = responseCase;
    return this;
  }

   /**
   * Get responseCase
   * @return responseCase
  **/
  @Schema(description = "")
  public ResponseCaseEnum getResponseCase() {
    return responseCase;
  }

  public void setResponseCase(ResponseCaseEnum responseCase) {
    this.responseCase = responseCase;
  }

  public ExecutableResponse asyncOrBuilder(AsyncExecutableResponseOrBuilder asyncOrBuilder) {
    this.asyncOrBuilder = asyncOrBuilder;
    return this;
  }

   /**
   * Get asyncOrBuilder
   * @return asyncOrBuilder
  **/
  @Schema(description = "")
  public AsyncExecutableResponseOrBuilder getAsyncOrBuilder() {
    return asyncOrBuilder;
  }

  public void setAsyncOrBuilder(AsyncExecutableResponseOrBuilder asyncOrBuilder) {
    this.asyncOrBuilder = asyncOrBuilder;
  }

  public ExecutableResponse childOrBuilder(ChildExecutableResponseOrBuilder childOrBuilder) {
    this.childOrBuilder = childOrBuilder;
    return this;
  }

   /**
   * Get childOrBuilder
   * @return childOrBuilder
  **/
  @Schema(description = "")
  public ChildExecutableResponseOrBuilder getChildOrBuilder() {
    return childOrBuilder;
  }

  public void setChildOrBuilder(ChildExecutableResponseOrBuilder childOrBuilder) {
    this.childOrBuilder = childOrBuilder;
  }

  public ExecutableResponse childrenOrBuilder(ChildrenExecutableResponseOrBuilder childrenOrBuilder) {
    this.childrenOrBuilder = childrenOrBuilder;
    return this;
  }

   /**
   * Get childrenOrBuilder
   * @return childrenOrBuilder
  **/
  @Schema(description = "")
  public ChildrenExecutableResponseOrBuilder getChildrenOrBuilder() {
    return childrenOrBuilder;
  }

  public void setChildrenOrBuilder(ChildrenExecutableResponseOrBuilder childrenOrBuilder) {
    this.childrenOrBuilder = childrenOrBuilder;
  }

  public ExecutableResponse childChain(ChildChainExecutableResponse childChain) {
    this.childChain = childChain;
    return this;
  }

   /**
   * Get childChain
   * @return childChain
  **/
  @Schema(description = "")
  public ChildChainExecutableResponse getChildChain() {
    return childChain;
  }

  public void setChildChain(ChildChainExecutableResponse childChain) {
    this.childChain = childChain;
  }

  public ExecutableResponse childChainOrBuilder(ChildChainExecutableResponseOrBuilder childChainOrBuilder) {
    this.childChainOrBuilder = childChainOrBuilder;
    return this;
  }

   /**
   * Get childChainOrBuilder
   * @return childChainOrBuilder
  **/
  @Schema(description = "")
  public ChildChainExecutableResponseOrBuilder getChildChainOrBuilder() {
    return childChainOrBuilder;
  }

  public void setChildChainOrBuilder(ChildChainExecutableResponseOrBuilder childChainOrBuilder) {
    this.childChainOrBuilder = childChainOrBuilder;
  }

  public ExecutableResponse taskOrBuilder(TaskExecutableResponseOrBuilder taskOrBuilder) {
    this.taskOrBuilder = taskOrBuilder;
    return this;
  }

   /**
   * Get taskOrBuilder
   * @return taskOrBuilder
  **/
  @Schema(description = "")
  public TaskExecutableResponseOrBuilder getTaskOrBuilder() {
    return taskOrBuilder;
  }

  public void setTaskOrBuilder(TaskExecutableResponseOrBuilder taskOrBuilder) {
    this.taskOrBuilder = taskOrBuilder;
  }

  public ExecutableResponse taskChain(TaskChainExecutableResponse taskChain) {
    this.taskChain = taskChain;
    return this;
  }

   /**
   * Get taskChain
   * @return taskChain
  **/
  @Schema(description = "")
  public TaskChainExecutableResponse getTaskChain() {
    return taskChain;
  }

  public void setTaskChain(TaskChainExecutableResponse taskChain) {
    this.taskChain = taskChain;
  }

  public ExecutableResponse taskChainOrBuilder(TaskChainExecutableResponseOrBuilder taskChainOrBuilder) {
    this.taskChainOrBuilder = taskChainOrBuilder;
    return this;
  }

   /**
   * Get taskChainOrBuilder
   * @return taskChainOrBuilder
  **/
  @Schema(description = "")
  public TaskChainExecutableResponseOrBuilder getTaskChainOrBuilder() {
    return taskChainOrBuilder;
  }

  public void setTaskChainOrBuilder(TaskChainExecutableResponseOrBuilder taskChainOrBuilder) {
    this.taskChainOrBuilder = taskChainOrBuilder;
  }

  public ExecutableResponse syncOrBuilder(SyncExecutableResponseOrBuilder syncOrBuilder) {
    this.syncOrBuilder = syncOrBuilder;
    return this;
  }

   /**
   * Get syncOrBuilder
   * @return syncOrBuilder
  **/
  @Schema(description = "")
  public SyncExecutableResponseOrBuilder getSyncOrBuilder() {
    return syncOrBuilder;
  }

  public void setSyncOrBuilder(SyncExecutableResponseOrBuilder syncOrBuilder) {
    this.syncOrBuilder = syncOrBuilder;
  }

  public ExecutableResponse skipTask(SkipTaskExecutableResponse skipTask) {
    this.skipTask = skipTask;
    return this;
  }

   /**
   * Get skipTask
   * @return skipTask
  **/
  @Schema(description = "")
  public SkipTaskExecutableResponse getSkipTask() {
    return skipTask;
  }

  public void setSkipTask(SkipTaskExecutableResponse skipTask) {
    this.skipTask = skipTask;
  }

  public ExecutableResponse skipTaskOrBuilder(SkipTaskExecutableResponseOrBuilder skipTaskOrBuilder) {
    this.skipTaskOrBuilder = skipTaskOrBuilder;
    return this;
  }

   /**
   * Get skipTaskOrBuilder
   * @return skipTaskOrBuilder
  **/
  @Schema(description = "")
  public SkipTaskExecutableResponseOrBuilder getSkipTaskOrBuilder() {
    return skipTaskOrBuilder;
  }

  public void setSkipTaskOrBuilder(SkipTaskExecutableResponseOrBuilder skipTaskOrBuilder) {
    this.skipTaskOrBuilder = skipTaskOrBuilder;
  }

  public ExecutableResponse sync(SyncExecutableResponse sync) {
    this.sync = sync;
    return this;
  }

   /**
   * Get sync
   * @return sync
  **/
  @Schema(description = "")
  public SyncExecutableResponse getSync() {
    return sync;
  }

  public void setSync(SyncExecutableResponse sync) {
    this.sync = sync;
  }

  public ExecutableResponse serializedSize(Integer serializedSize) {
    this.serializedSize = serializedSize;
    return this;
  }

   /**
   * Get serializedSize
   * @return serializedSize
  **/
  @Schema(description = "")
  public Integer getSerializedSize() {
    return serializedSize;
  }

  public void setSerializedSize(Integer serializedSize) {
    this.serializedSize = serializedSize;
  }

  public ExecutableResponse parserForType(ParserExecutableResponse parserForType) {
    this.parserForType = parserForType;
    return this;
  }

   /**
   * Get parserForType
   * @return parserForType
  **/
  @Schema(description = "")
  public ParserExecutableResponse getParserForType() {
    return parserForType;
  }

  public void setParserForType(ParserExecutableResponse parserForType) {
    this.parserForType = parserForType;
  }

  public ExecutableResponse defaultInstanceForType(ExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
    return this;
  }

   /**
   * Get defaultInstanceForType
   * @return defaultInstanceForType
  **/
  @Schema(description = "")
  public ExecutableResponse getDefaultInstanceForType() {
    return defaultInstanceForType;
  }

  public void setDefaultInstanceForType(ExecutableResponse defaultInstanceForType) {
    this.defaultInstanceForType = defaultInstanceForType;
  }

  public ExecutableResponse allFields(Map<String, Object> allFields) {
    this.allFields = allFields;
    return this;
  }

  public ExecutableResponse putAllFieldsItem(String key, Object allFieldsItem) {
    if (this.allFields == null) {
      this.allFields = new HashMap<String, Object>();
    }
    this.allFields.put(key, allFieldsItem);
    return this;
  }

   /**
   * Get allFields
   * @return allFields
  **/
  @Schema(description = "")
  public Map<String, Object> getAllFields() {
    return allFields;
  }

  public void setAllFields(Map<String, Object> allFields) {
    this.allFields = allFields;
  }

  public ExecutableResponse initializationErrorString(String initializationErrorString) {
    this.initializationErrorString = initializationErrorString;
    return this;
  }

   /**
   * Get initializationErrorString
   * @return initializationErrorString
  **/
  @Schema(description = "")
  public String getInitializationErrorString() {
    return initializationErrorString;
  }

  public void setInitializationErrorString(String initializationErrorString) {
    this.initializationErrorString = initializationErrorString;
  }

  public ExecutableResponse descriptorForType(Descriptor descriptorForType) {
    this.descriptorForType = descriptorForType;
    return this;
  }

   /**
   * Get descriptorForType
   * @return descriptorForType
  **/
  @Schema(description = "")
  public Descriptor getDescriptorForType() {
    return descriptorForType;
  }

  public void setDescriptorForType(Descriptor descriptorForType) {
    this.descriptorForType = descriptorForType;
  }

  public ExecutableResponse memoizedSerializedSize(Integer memoizedSerializedSize) {
    this.memoizedSerializedSize = memoizedSerializedSize;
    return this;
  }

   /**
   * Get memoizedSerializedSize
   * @return memoizedSerializedSize
  **/
  @Schema(description = "")
  public Integer getMemoizedSerializedSize() {
    return memoizedSerializedSize;
  }

  public void setMemoizedSerializedSize(Integer memoizedSerializedSize) {
    this.memoizedSerializedSize = memoizedSerializedSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutableResponse executableResponse = (ExecutableResponse) o;
    return Objects.equals(this.unknownFields, executableResponse.unknownFields) &&
        Objects.equals(this.async, executableResponse.async) &&
        Objects.equals(this.initialized, executableResponse.initialized) &&
        Objects.equals(this.children, executableResponse.children) &&
        Objects.equals(this.task, executableResponse.task) &&
        Objects.equals(this.child, executableResponse.child) &&
        Objects.equals(this.responseCase, executableResponse.responseCase) &&
        Objects.equals(this.asyncOrBuilder, executableResponse.asyncOrBuilder) &&
        Objects.equals(this.childOrBuilder, executableResponse.childOrBuilder) &&
        Objects.equals(this.childrenOrBuilder, executableResponse.childrenOrBuilder) &&
        Objects.equals(this.childChain, executableResponse.childChain) &&
        Objects.equals(this.childChainOrBuilder, executableResponse.childChainOrBuilder) &&
        Objects.equals(this.taskOrBuilder, executableResponse.taskOrBuilder) &&
        Objects.equals(this.taskChain, executableResponse.taskChain) &&
        Objects.equals(this.taskChainOrBuilder, executableResponse.taskChainOrBuilder) &&
        Objects.equals(this.syncOrBuilder, executableResponse.syncOrBuilder) &&
        Objects.equals(this.skipTask, executableResponse.skipTask) &&
        Objects.equals(this.skipTaskOrBuilder, executableResponse.skipTaskOrBuilder) &&
        Objects.equals(this.sync, executableResponse.sync) &&
        Objects.equals(this.serializedSize, executableResponse.serializedSize) &&
        Objects.equals(this.parserForType, executableResponse.parserForType) &&
        Objects.equals(this.defaultInstanceForType, executableResponse.defaultInstanceForType) &&
        Objects.equals(this.allFields, executableResponse.allFields) &&
        Objects.equals(this.initializationErrorString, executableResponse.initializationErrorString) &&
        Objects.equals(this.descriptorForType, executableResponse.descriptorForType) &&
        Objects.equals(this.memoizedSerializedSize, executableResponse.memoizedSerializedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unknownFields, async, initialized, children, task, child, responseCase, asyncOrBuilder, childOrBuilder, childrenOrBuilder, childChain, childChainOrBuilder, taskOrBuilder, taskChain, taskChainOrBuilder, syncOrBuilder, skipTask, skipTaskOrBuilder, sync, serializedSize, parserForType, defaultInstanceForType, allFields, initializationErrorString, descriptorForType, memoizedSerializedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutableResponse {\n");
    
    sb.append("    unknownFields: ").append(toIndentedString(unknownFields)).append("\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    initialized: ").append(toIndentedString(initialized)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    responseCase: ").append(toIndentedString(responseCase)).append("\n");
    sb.append("    asyncOrBuilder: ").append(toIndentedString(asyncOrBuilder)).append("\n");
    sb.append("    childOrBuilder: ").append(toIndentedString(childOrBuilder)).append("\n");
    sb.append("    childrenOrBuilder: ").append(toIndentedString(childrenOrBuilder)).append("\n");
    sb.append("    childChain: ").append(toIndentedString(childChain)).append("\n");
    sb.append("    childChainOrBuilder: ").append(toIndentedString(childChainOrBuilder)).append("\n");
    sb.append("    taskOrBuilder: ").append(toIndentedString(taskOrBuilder)).append("\n");
    sb.append("    taskChain: ").append(toIndentedString(taskChain)).append("\n");
    sb.append("    taskChainOrBuilder: ").append(toIndentedString(taskChainOrBuilder)).append("\n");
    sb.append("    syncOrBuilder: ").append(toIndentedString(syncOrBuilder)).append("\n");
    sb.append("    skipTask: ").append(toIndentedString(skipTask)).append("\n");
    sb.append("    skipTaskOrBuilder: ").append(toIndentedString(skipTaskOrBuilder)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
    sb.append("    serializedSize: ").append(toIndentedString(serializedSize)).append("\n");
    sb.append("    parserForType: ").append(toIndentedString(parserForType)).append("\n");
    sb.append("    defaultInstanceForType: ").append(toIndentedString(defaultInstanceForType)).append("\n");
    sb.append("    allFields: ").append(toIndentedString(allFields)).append("\n");
    sb.append("    initializationErrorString: ").append(toIndentedString(initializationErrorString)).append("\n");
    sb.append("    descriptorForType: ").append(toIndentedString(descriptorForType)).append("\n");
    sb.append("    memoizedSerializedSize: ").append(toIndentedString(memoizedSerializedSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}