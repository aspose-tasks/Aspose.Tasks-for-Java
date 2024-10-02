/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;

public class SetResourceProperties {
    public static void main(String[] args) {
        Project project = new Project();
        Resource rsc = project.getResources().add("Rsc");
        // Resource properties are represented by static class Rsc

        // set resource properties
        rsc.set(Rsc.STANDARD_RATE, BigDecimal.valueOf(15));
        rsc.set(Rsc.OVERTIME_RATE, BigDecimal.valueOf(20));
    }
}




