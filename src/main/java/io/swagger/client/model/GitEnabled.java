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
 * This contains details of connectivity mode and whether Git Sync is enabled
 */
@Schema(description = "This contains details of connectivity mode and whether Git Sync is enabled")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GitEnabled {
  @SerializedName("isGitSyncEnabled")
  private Boolean isGitSyncEnabled = null;

  /**
   * This is the Git Sync connectivity mode
   */
  @JsonAdapter(ConnectivityModeEnum.Adapter.class)
  public enum ConnectivityModeEnum {
    MANAGER("MANAGER"),
    DELEGATE("DELEGATE");

    private String value;

    ConnectivityModeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ConnectivityModeEnum fromValue(String input) {
      for (ConnectivityModeEnum b : ConnectivityModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ConnectivityModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConnectivityModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ConnectivityModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ConnectivityModeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("connectivityMode")
  private ConnectivityModeEnum connectivityMode = null;

  @SerializedName("gitSyncEnabled")
  private Boolean gitSyncEnabled = null;

  public GitEnabled isGitSyncEnabled(Boolean isGitSyncEnabled) {
    this.isGitSyncEnabled = isGitSyncEnabled;
    return this;
  }

   /**
   * This checks if Git Sync is enabled for a given scope
   * @return isGitSyncEnabled
  **/
  @Schema(description = "This checks if Git Sync is enabled for a given scope")
  public Boolean isIsGitSyncEnabled() {
    return isGitSyncEnabled;
  }

  public void setIsGitSyncEnabled(Boolean isGitSyncEnabled) {
    this.isGitSyncEnabled = isGitSyncEnabled;
  }

  public GitEnabled connectivityMode(ConnectivityModeEnum connectivityMode) {
    this.connectivityMode = connectivityMode;
    return this;
  }

   /**
   * This is the Git Sync connectivity mode
   * @return connectivityMode
  **/
  @Schema(description = "This is the Git Sync connectivity mode")
  public ConnectivityModeEnum getConnectivityMode() {
    return connectivityMode;
  }

  public void setConnectivityMode(ConnectivityModeEnum connectivityMode) {
    this.connectivityMode = connectivityMode;
  }

  public GitEnabled gitSyncEnabled(Boolean gitSyncEnabled) {
    this.gitSyncEnabled = gitSyncEnabled;
    return this;
  }

   /**
   * Get gitSyncEnabled
   * @return gitSyncEnabled
  **/
  @Schema(description = "")
  public Boolean isGitSyncEnabled() {
    return gitSyncEnabled;
  }

  public void setGitSyncEnabled(Boolean gitSyncEnabled) {
    this.gitSyncEnabled = gitSyncEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitEnabled gitEnabled = (GitEnabled) o;
    return Objects.equals(this.isGitSyncEnabled, gitEnabled.isGitSyncEnabled) &&
        Objects.equals(this.connectivityMode, gitEnabled.connectivityMode) &&
        Objects.equals(this.gitSyncEnabled, gitEnabled.gitSyncEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isGitSyncEnabled, connectivityMode, gitSyncEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitEnabled {\n");
    
    sb.append("    isGitSyncEnabled: ").append(toIndentedString(isGitSyncEnabled)).append("\n");
    sb.append("    connectivityMode: ").append(toIndentedString(connectivityMode)).append("\n");
    sb.append("    gitSyncEnabled: ").append(toIndentedString(gitSyncEnabled)).append("\n");
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