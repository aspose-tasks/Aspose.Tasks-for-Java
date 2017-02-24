package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class AddTaskExtendedAttributes {
    public static void main(String[] args)
    {
        TaskExtendedAttributes();
    }

    static void TaskExtendedAttributes()
    {
        // ExStart:AddTaskExtendedAttributes
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddTaskExtendedAttributes.class);

        // Create new project
        Project project = new Project(dataDir + "project.mpp");

        //1.    Adding Plain Text Attribute

        //Create an Extended Attribute Definition of Text1 type
        ExtendedAttributeDefinition taskExtendedAttributeText1Definition = ExtendedAttributeDefinition.createTaskDefinition(CustomFieldType.Text, ExtendedAttributeTask.Text1, "Task City Name");

        //Add it to the project's Extended Attributes collection
        project.getExtendedAttributes().add(taskExtendedAttributeText1Definition);

        //Add a task to the project
        Task task = project.getRootTask().getChildren().add("Task 1");

        //Create an Extended Attribute from the Attribute Definition
        ExtendedAttribute taskExtendedAttributeText1 = taskExtendedAttributeText1Definition.createExtendedAttribute();

        //Assign a value to the generated Extended Attribute
        taskExtendedAttributeText1.setValue("London");

        //Add the Extended Attribute to task
        task.getExtendedAttributes().add(taskExtendedAttributeText1);

        project.save(dataDir + "PlainTextExtendedAttribute_out.mpp", SaveFileFormat.MPP);

        //2.    Adding Text Attribute with Lookup option
        Project project1 = new Project(dataDir + "project.mpp");

        //Create an Extended Attribute Definition of Text2 type
        ExtendedAttributeDefinition taskExtendedAttributeText2Definition = ExtendedAttributeDefinition.createLookupTaskDefinition(CustomFieldType.Text, ExtendedAttributeTask.Text2, "Task Towns Name");

        //Add lookup values for the extended attribute definition
        Value val = new Value();
        val.setId(1);
        val.setStringValue("Town1");
        val.setDescription("This is Town1");
        taskExtendedAttributeText2Definition.addLookupValue(val);

        val = new Value();
        val.setId(2);
        val.setStringValue("Town2");
        val.setDescription("This is Town2");
        taskExtendedAttributeText2Definition.addLookupValue(val);

        //Add it to the porject's Extended Attributes collection
        project1.getExtendedAttributes().add(taskExtendedAttributeText2Definition);

        //Add a task to the project
        Task task2 = project1.getRootTask().getChildren().add("Task 2");

        //Crate an Extended Attribute from the Text2 Lookup Definition for Id 1
        ExtendedAttribute taskExtendedAttributeText2 = taskExtendedAttributeText2Definition.createExtendedAttribute(taskExtendedAttributeText2Definition.getValueList().get(1));

        //Add the Extended Attribute to task
        task2.getExtendedAttributes().add(taskExtendedAttributeText2);

        project1.save(dataDir + "TextExtendedAttributeWithLookup_out.mpp", SaveFileFormat.MPP);

        //3.    Adding Duration Attribute with Lookup option

        Project project2 = new Project(dataDir + "project.mpp");

        //Create an Extended Attribute Definition of Duration2 type
        ExtendedAttributeDefinition taskExtendedAttributeDuration2Definition = ExtendedAttributeDefinition.createLookupTaskDefinition(CustomFieldType.Duration, ExtendedAttributeTask.Duration2, "Some duration");

        //Add lookup values for extended attribute definition
        val = new Value();
        val.setId(2);
        val.setDurationValue(4*60);
        val.setDescription("4 hours");
        taskExtendedAttributeDuration2Definition.addLookupValue(val);


        val = new Value();
        val.setId(3);
        val.setDurationValue(8*60);
        val.setDescription("1 day");
        taskExtendedAttributeDuration2Definition.addLookupValue(val);

        val = new Value();
        val.setId(4);
        val.setDurationValue(1*60);
        val.setDescription("1 hour");
        taskExtendedAttributeDuration2Definition.addLookupValue(val);

        val = new Value();
        val.setId(7);
        val.setDurationValue(10*8*60);
        val.setDescription("10 days");
        taskExtendedAttributeDuration2Definition.addLookupValue(val);

        //Add the definition to the project's Extended Attributes collection
        project2.getExtendedAttributes().add(taskExtendedAttributeDuration2Definition);

        //Add a task to the project
        Task task3 = project2.getRootTask().getChildren().add("Task 3");

        //Create an Extended Attribute from the Duration2 Lookup Definition for Id 3
        ExtendedAttribute taskExtendedAttributeDuration2 = taskExtendedAttributeDuration2Definition.createExtendedAttribute(taskExtendedAttributeDuration2Definition.getValueList().get(3));

        //Add the Extended Attribute to task
        task3.getExtendedAttributes().add(taskExtendedAttributeDuration2);

        project2.save(dataDir + "DurationExtendedAttributeWithLookup_out.mpp", SaveFileFormat.MPP);
        // ExEnd:AddTaskExtendedAttributes
    }

}
