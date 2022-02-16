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
 * ResponseMessageExceptionStackTrace
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ResponseMessageExceptionStackTrace {
  @SerializedName("methodName")
  private String methodName = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("lineNumber")
  private Integer lineNumber = null;

  @SerializedName("className")
  private String className = null;

  @SerializedName("nativeMethod")
  private Boolean nativeMethod = null;

  public ResponseMessageExceptionStackTrace methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

   /**
   * Get methodName
   * @return methodName
  **/
  @Schema(description = "")
  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public ResponseMessageExceptionStackTrace fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public ResponseMessageExceptionStackTrace lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @Schema(description = "")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public ResponseMessageExceptionStackTrace className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @Schema(description = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public ResponseMessageExceptionStackTrace nativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
    return this;
  }

   /**
   * Get nativeMethod
   * @return nativeMethod
  **/
  @Schema(description = "")
  public Boolean isNativeMethod() {
    return nativeMethod;
  }

  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMessageExceptionStackTrace responseMessageExceptionStackTrace = (ResponseMessageExceptionStackTrace) o;
    return Objects.equals(this.methodName, responseMessageExceptionStackTrace.methodName) &&
        Objects.equals(this.fileName, responseMessageExceptionStackTrace.fileName) &&
        Objects.equals(this.lineNumber, responseMessageExceptionStackTrace.lineNumber) &&
        Objects.equals(this.className, responseMessageExceptionStackTrace.className) &&
        Objects.equals(this.nativeMethod, responseMessageExceptionStackTrace.nativeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodName, fileName, lineNumber, className, nativeMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMessageExceptionStackTrace {\n");
    
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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