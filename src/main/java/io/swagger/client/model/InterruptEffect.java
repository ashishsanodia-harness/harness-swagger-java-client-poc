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
import io.swagger.client.model.InterruptConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InterruptEffect
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class InterruptEffect {
  @SerializedName("interruptId")
  private String interruptId = null;

  @SerializedName("tookEffectAt")
  private Long tookEffectAt = null;

  /**
   * Gets or Sets interruptType
   */
  @JsonAdapter(InterruptTypeEnum.Adapter.class)
  public enum InterruptTypeEnum {
    UNKNOWN("UNKNOWN"),
    ABORT("ABORT"),
    ABORT_ALL("ABORT_ALL"),
    PAUSE("PAUSE"),
    PAUSE_ALL("PAUSE_ALL"),
    RESUME("RESUME"),
    RESUME_ALL("RESUME_ALL"),
    RETRY("RETRY"),
    IGNORE("IGNORE"),
    WAITING_FOR_MANUAL_INTERVENTION("WAITING_FOR_MANUAL_INTERVENTION"),
    MARK_FAILED("MARK_FAILED"),
    MARK_SUCCESS("MARK_SUCCESS"),
    NEXT_STEP("NEXT_STEP"),
    END_EXECUTION("END_EXECUTION"),
    MARK_EXPIRED("MARK_EXPIRED"),
    CUSTOM_FAILURE("CUSTOM_FAILURE"),
    EXPIRE_ALL("EXPIRE_ALL"),
    UNRECOGNIZED("UNRECOGNIZED");

    private String value;

    InterruptTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InterruptTypeEnum fromValue(String input) {
      for (InterruptTypeEnum b : InterruptTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InterruptTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterruptTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public InterruptTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return InterruptTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("interruptType")
  private InterruptTypeEnum interruptType = null;

  @SerializedName("interruptConfig")
  private InterruptConfig interruptConfig = null;

  public InterruptEffect interruptId(String interruptId) {
    this.interruptId = interruptId;
    return this;
  }

   /**
   * Get interruptId
   * @return interruptId
  **/
  @Schema(required = true, description = "")
  public String getInterruptId() {
    return interruptId;
  }

  public void setInterruptId(String interruptId) {
    this.interruptId = interruptId;
  }

  public InterruptEffect tookEffectAt(Long tookEffectAt) {
    this.tookEffectAt = tookEffectAt;
    return this;
  }

   /**
   * Get tookEffectAt
   * @return tookEffectAt
  **/
  @Schema(required = true, description = "")
  public Long getTookEffectAt() {
    return tookEffectAt;
  }

  public void setTookEffectAt(Long tookEffectAt) {
    this.tookEffectAt = tookEffectAt;
  }

  public InterruptEffect interruptType(InterruptTypeEnum interruptType) {
    this.interruptType = interruptType;
    return this;
  }

   /**
   * Get interruptType
   * @return interruptType
  **/
  @Schema(required = true, description = "")
  public InterruptTypeEnum getInterruptType() {
    return interruptType;
  }

  public void setInterruptType(InterruptTypeEnum interruptType) {
    this.interruptType = interruptType;
  }

  public InterruptEffect interruptConfig(InterruptConfig interruptConfig) {
    this.interruptConfig = interruptConfig;
    return this;
  }

   /**
   * Get interruptConfig
   * @return interruptConfig
  **/
  @Schema(required = true, description = "")
  public InterruptConfig getInterruptConfig() {
    return interruptConfig;
  }

  public void setInterruptConfig(InterruptConfig interruptConfig) {
    this.interruptConfig = interruptConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterruptEffect interruptEffect = (InterruptEffect) o;
    return Objects.equals(this.interruptId, interruptEffect.interruptId) &&
        Objects.equals(this.tookEffectAt, interruptEffect.tookEffectAt) &&
        Objects.equals(this.interruptType, interruptEffect.interruptType) &&
        Objects.equals(this.interruptConfig, interruptEffect.interruptConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interruptId, tookEffectAt, interruptType, interruptConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterruptEffect {\n");
    
    sb.append("    interruptId: ").append(toIndentedString(interruptId)).append("\n");
    sb.append("    tookEffectAt: ").append(toIndentedString(tookEffectAt)).append("\n");
    sb.append("    interruptType: ").append(toIndentedString(interruptType)).append("\n");
    sb.append("    interruptConfig: ").append(toIndentedString(interruptConfig)).append("\n");
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
