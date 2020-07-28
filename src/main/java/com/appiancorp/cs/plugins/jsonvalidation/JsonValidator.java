package com.appiancorp.cs.plugins.jsonvalidation;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.appiancorp.suiteapi.expression.annotations.Category;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;

public class JsonValidator {

  final static Logger logger = Logger.getLogger(JsonValidator.class);

  @Category("category.name.LogicalFunctions")

  @Function
  public static String validateJson(@Parameter String schemaUsed, @Parameter String jsonData) throws IOException, ProcessingException {

    logger.info("Validate JSON Called");

    if (ValidationUtils.isJsonValid(schemaUsed, jsonData)) {
      logger.info("JSON is valid");
      return "Valid";
    } else {
      logger.info("JSON is invalid");
      return "Invalid";
    }
  }

}
