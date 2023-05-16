package com.lisi4ka.validation;

import com.lisi4ka.utils.PackagedCommand;

public class ExitValid implements Validation{
    public PackagedCommand[] valid(String[] commandText){
        if (commandText.length == 1){
            return new PackagedCommand[] { new PackagedCommand(commandText[0], null)};
        }
        else {
            throw new IllegalArgumentException("Command \"exit\" takes no arguments!\n");
        }
    }
}
