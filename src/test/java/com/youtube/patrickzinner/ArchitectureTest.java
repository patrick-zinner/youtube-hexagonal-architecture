package com.youtube.patrickzinner;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.Architectures;

@AnalyzeClasses(packages = "com.youtube.patrickzinner")
public class ArchitectureTest {

    private static final String BASE_PACKAGE = "com.youtube.patrickzinner";
    private static final String CORE_PACKAGE = BASE_PACKAGE + ".core";
    private static final String ADAPTER_PACKAGE = BASE_PACKAGE + ".adapter";
    private static final String BOOTSTRAP_PACKAGE = BASE_PACKAGE + ".bootstrap";

    @ArchTest
    public static ArchRule HEXAGONAL_ARCHITECTURE =
            Architectures.onionArchitecture()
                    .domainModels(CORE_PACKAGE + ".model..")
                    .domainServices(CORE_PACKAGE + ".service..", CORE_PACKAGE + ".port..")
                    .applicationServices(BOOTSTRAP_PACKAGE)
                    .adapter("Persistence", ADAPTER_PACKAGE + ".persistence..")
                    .adapter("Controller", ADAPTER_PACKAGE + ".controller..");
}
