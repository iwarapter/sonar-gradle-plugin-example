package com.example;

import com.google.common.collect.ImmutableList;
import org.sonar.api.SonarPlugin;
import org.sonar.api.config.PropertyDefinition;
import org.sonar.api.resources.Qualifiers;

import java.util.List;

/**
 * Created by iwarapter
 */
public class ExamplePlugin extends SonarPlugin {

    public static final String FILE_SUFFIXES_KEY = "sonar.example.file.suffixes";

    public List getExtensions() {
        return ImmutableList.of(

                PropertyDefinition.builder(FILE_SUFFIXES_KEY)
                        .name("File Suffixes")
                        .description("Comma-separated list of suffixes of Example files to analyze.")
                        .category("Example")
                        .onQualifiers(Qualifiers.PROJECT)
                        .defaultValue("example")
                        .build());
    }
}