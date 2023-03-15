package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.Tsk;

public class Notes {
    public static void main(String[] args) {
        getSetNotesRtf();

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void getSetNotesRtf()
    {
        // Shows how to read/write Tsk.NotesRTF property.
        Project project = new Project();

        Task task = project.getRootTask().getChildren().add("Task");

        final String rtf = "{\\rtf1\\ansi\\ansicpg1252\\deff0\\deflang1033{\\fonttbl{\\f0\\fnil\\fcharset134 SimSun;}{\\f1\\fnil\\fcharset0 Calibri;}}\r\n"
        + "{\\*\\generator Msftedit 5.41.21.2510;}\\viewkind4\\uc1\\pard\\sa200\\sl276\\slmult1\\lang9\\f0\\fs22\\'d4\\'e7\\'c9\\'cf\\'ba\\'c3\\f1\\par\r\n"
        + "}\r\n"
        + "; // 早上好";

         task.set(Tsk.NOTES_RTF, rtf);

        System.out.println("Notes RTF: " + task.get(Tsk.NOTES_RTF));
}

}
