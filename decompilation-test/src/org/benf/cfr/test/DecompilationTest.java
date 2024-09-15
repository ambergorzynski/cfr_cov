package org.benf.cfr.test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DecompilationTest {

    @Test
    public void shouldAnswerWithTrue() {
        Assertions.assertTrue(true);
    }

    @Test
    public void decompile() {
        Path classFilePath = Paths.get("/data/work/AggressiveCollapseTest.class");
        DecompilationTestImplementation.performDecompilation(classFilePath);
        Assertions.assertTrue(true);
    }
}
