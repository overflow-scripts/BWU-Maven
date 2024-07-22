package org.example;

import net.botwithus.internal.scripts.ScriptDefinition;
import net.botwithus.rs3.script.LoopingScript;
import net.botwithus.rs3.script.config.ScriptConfig;
import org.example.api.APIExample;

public class ScriptExample extends LoopingScript {
    public ScriptExample(String s, ScriptConfig scriptConfig, ScriptDefinition scriptDefinition) {
        super(s, scriptConfig, scriptDefinition);
    }

    @Override
    public void onLoop() {
        APIExample.someFunction();
    }
}
