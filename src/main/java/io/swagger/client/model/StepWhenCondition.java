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
import io.swagger.client.model.ParameterFieldString;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * StepWhenCondition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class StepWhenCondition {
  /**
   * Gets or Sets stageStatus
   */
  @JsonAdapter(StageStatusEnum.Adapter.class)
  public enum StageStatusEnum {
    SUCCESS("Success"),
    FAILURE("Failure"),
    ALL("All");

    private String value;

    StageStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StageStatusEnum fromValue(String input) {
      for (StageStatusEnum b : StageStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StageStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StageStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StageStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StageStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("stageStatus")
  private StageStatusEnum stageStatus = null;

  @SerializedName("condition")
  private ParameterFieldString condition = null;

  public StepWhenCondition stageStatus(StageStatusEnum stageStatus) {
    this.stageStatus = stageStatus;
    return this;
  }

   /**
   * Get stageStatus
   * @return stageStatus
  **/
  @Schema(required = true, description = "")
  public StageStatusEnum getStageStatus() {
    return stageStatus;
  }

  public void setStageStatus(StageStatusEnum stageStatus) {
    this.stageStatus = stageStatus;
  }

  public StepWhenCondition condition(ParameterFieldString condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @Schema(description = "")
  public ParameterFieldString getCondition() {
    return condition;
  }

  public void setCondition(ParameterFieldString condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepWhenCondition stepWhenCondition = (StepWhenCondition) o;
    return Objects.equals(this.stageStatus, stepWhenCondition.stageStatus) &&
        Objects.equals(this.condition, stepWhenCondition.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stageStatus, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepWhenCondition {\n");
    
    sb.append("    stageStatus: ").append(toIndentedString(stageStatus)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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