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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains details of the Start Trial object defined in Harness
 */
@Schema(description = "This contains details of the Start Trial object defined in Harness")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class StartTrial {
  /**
   * Gets or Sets moduleType
   */
  @JsonAdapter(ModuleTypeEnum.Adapter.class)
  public enum ModuleTypeEnum {
    CD("CD"),
    CI("CI"),
    CV("CV"),
    CF("CF"),
    CE("CE"),
    CORE("CORE"),
    PMS("PMS"),
    TEMPLATESERVICE("TEMPLATESERVICE");

    private String value;

    ModuleTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ModuleTypeEnum fromValue(String input) {
      for (ModuleTypeEnum b : ModuleTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ModuleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModuleTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ModuleTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ModuleTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("moduleType")
  private ModuleTypeEnum moduleType = null;

  /**
   * Gets or Sets edition
   */
  @JsonAdapter(EditionEnum.Adapter.class)
  public enum EditionEnum {
    COMMUNITY("COMMUNITY"),
    FREE("FREE"),
    TEAM("TEAM"),
    ENTERPRISE("ENTERPRISE");

    private String value;

    EditionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EditionEnum fromValue(String input) {
      for (EditionEnum b : EditionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EditionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EditionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EditionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("edition")
  private EditionEnum edition = null;

  public StartTrial moduleType(ModuleTypeEnum moduleType) {
    this.moduleType = moduleType;
    return this;
  }

   /**
   * Get moduleType
   * @return moduleType
  **/
  @Schema(required = true, description = "")
  public ModuleTypeEnum getModuleType() {
    return moduleType;
  }

  public void setModuleType(ModuleTypeEnum moduleType) {
    this.moduleType = moduleType;
  }

  public StartTrial edition(EditionEnum edition) {
    this.edition = edition;
    return this;
  }

   /**
   * Get edition
   * @return edition
  **/
  @Schema(required = true, description = "")
  public EditionEnum getEdition() {
    return edition;
  }

  public void setEdition(EditionEnum edition) {
    this.edition = edition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartTrial startTrial = (StartTrial) o;
    return Objects.equals(this.moduleType, startTrial.moduleType) &&
        Objects.equals(this.edition, startTrial.edition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moduleType, edition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartTrial {\n");
    
    sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
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
