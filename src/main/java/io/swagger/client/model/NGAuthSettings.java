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
 * This has the details of Authentication Settings supported in NG.
 */
@Schema(description = "This has the details of Authentication Settings supported in NG.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")

public class NGAuthSettings {
  /**
   * Gets or Sets settingsType
   */
  @JsonAdapter(SettingsTypeEnum.Adapter.class)
  public enum SettingsTypeEnum {
    USER_PASSWORD("USER_PASSWORD"),
    SAML("SAML"),
    LDAP("LDAP"),
    OAUTH("OAUTH");

    private String value;

    SettingsTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SettingsTypeEnum fromValue(String input) {
      for (SettingsTypeEnum b : SettingsTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SettingsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SettingsTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SettingsTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SettingsTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("settingsType")
  private SettingsTypeEnum settingsType = null;

  public NGAuthSettings() {
    this.settingsType = this.getClass().getSimpleName();
  }
  public NGAuthSettings settingsType(SettingsTypeEnum settingsType) {
    this.settingsType = settingsType;
    return this;
  }

   /**
   * Get settingsType
   * @return settingsType
  **/
  @Schema(description = "")
  public SettingsTypeEnum getSettingsType() {
    return settingsType;
  }

  public void setSettingsType(SettingsTypeEnum settingsType) {
    this.settingsType = settingsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NGAuthSettings ngAuthSettings = (NGAuthSettings) o;
    return Objects.equals(this.settingsType, ngAuthSettings.settingsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingsType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NGAuthSettings {\n");
    
    sb.append("    settingsType: ").append(toIndentedString(settingsType)).append("\n");
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
