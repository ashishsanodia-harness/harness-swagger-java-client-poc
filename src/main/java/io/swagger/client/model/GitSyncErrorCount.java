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
 * This is the total number of Git sync and connectivity errors
 */
@Schema(description = "This is the total number of Git sync and connectivity errors")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GitSyncErrorCount {
  @SerializedName("gitToHarnessErrorCount")
  private Long gitToHarnessErrorCount = null;

  @SerializedName("connectivityErrorCount")
  private Long connectivityErrorCount = null;

  public GitSyncErrorCount gitToHarnessErrorCount(Long gitToHarnessErrorCount) {
    this.gitToHarnessErrorCount = gitToHarnessErrorCount;
    return this;
  }

   /**
   * This is the number of Git to Harness errors
   * @return gitToHarnessErrorCount
  **/
  @Schema(description = "This is the number of Git to Harness errors")
  public Long getGitToHarnessErrorCount() {
    return gitToHarnessErrorCount;
  }

  public void setGitToHarnessErrorCount(Long gitToHarnessErrorCount) {
    this.gitToHarnessErrorCount = gitToHarnessErrorCount;
  }

  public GitSyncErrorCount connectivityErrorCount(Long connectivityErrorCount) {
    this.connectivityErrorCount = connectivityErrorCount;
    return this;
  }

   /**
   * This is the number of connectivity errors
   * @return connectivityErrorCount
  **/
  @Schema(description = "This is the number of connectivity errors")
  public Long getConnectivityErrorCount() {
    return connectivityErrorCount;
  }

  public void setConnectivityErrorCount(Long connectivityErrorCount) {
    this.connectivityErrorCount = connectivityErrorCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitSyncErrorCount gitSyncErrorCount = (GitSyncErrorCount) o;
    return Objects.equals(this.gitToHarnessErrorCount, gitSyncErrorCount.gitToHarnessErrorCount) &&
        Objects.equals(this.connectivityErrorCount, gitSyncErrorCount.connectivityErrorCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitToHarnessErrorCount, connectivityErrorCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitSyncErrorCount {\n");
    
    sb.append("    gitToHarnessErrorCount: ").append(toIndentedString(gitToHarnessErrorCount)).append("\n");
    sb.append("    connectivityErrorCount: ").append(toIndentedString(connectivityErrorCount)).append("\n");
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
