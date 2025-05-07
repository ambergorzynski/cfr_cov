package org.benf.cfr.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.benf.cfr.test.DecompilationTestImplementation.FuzzerClassFileTestDataSource;

public class DecompilationTest {

    @ParameterizedTest(name = "[{index}] {0}")
    @FuzzerClassFileTestDataSource("fuzzer_classes.xml")
    public void decompile(Path classFilePath) {
        DecompilationTestImplementation.performDecompilation(classFilePath);
        Assertions.assertTrue(true);
    }
}
