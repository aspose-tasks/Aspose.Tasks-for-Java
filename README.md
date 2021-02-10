![GitHub all releases](https://img.shields.io/github/downloads/aspose-tasks/Aspose.tasks-for-Java/total) ![GitHub](https://img.shields.io/github/license/aspose-tasks/Aspose.tasks-for-java)

# Microsoft Project File Manipulation API

[Aspose.Tasks](https://products.aspose.com/tasks/java) a Java Project Management API to manipulate Microsoft Project files. Developers can define a project’s main and default properties as well as calendar information. API also provides the ability to specify weekdays and calendar exceptions while making it easy to add & recalculate tasks, resources and other data without user intervention.

<p align="center">

  <a title="Download complete Aspose.Tasks for Java source code" href="https://github.com/asposetasks/Aspose_Tasks_Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

Directory | Description
--------- | -----------
[Examples](Examples)  | A collection of Java examples that help you learn how to product features.
[Plugins](Plugins)  | Plugins that will demonstrate more features of Aspose.Tasks for Java.

## Microsoft Project File Processing

- Read, change and write Microsoft Project® documents.
- Read MPP and XML project formats. 
- Create, update and write projects in an XML project format. 
- Read MPP project files, update summary information and write in original MPP format.
- Read MPP project files and convert them to XML format.
- Change main project settings like schedule type, start and finish dates.
- Change default project settings like default standard rate, default overtime rate, default task type, default fixed cost accrual, etc.
- Manage extended attributes.
- Define weekdays for the project as well as for calendars and calendar exceptions.
- Read and write calendars for tasks and resources.
- Manage task baseline scheduling & duration.
- Handle constraints on tasks.
- Create and manage links between tasks.
- Read, change and create tasks, milestone, estimated critical or effort driven tasks.
- Manage resources costs and variances.
- Access assignment costs and budget.
- Resource prefix implementation for nested resources

## Read & Write Project Formats

MPP, XML, MPT, MPX

## Save Project Files As

XLSX, HTML, TXT, PDF, XER, PrimaveraP6XML\
TIF, SVG, PNG, JPEG


## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 7.0 (1.7)` or above

## Get Started with Aspose.Tasks for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-tasks). You can easily use Aspose.Tasks for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.Tasks for Java from Maven Repository](https://docs.aspose.com/tasks/java/installation/) documentation page.

## Read Project Data from Microsoft Project Database

```java
String url = "jdbc:sqlserver://";
String serverName = "192.168.56.2\\MSSQLSERVER";
String portNumber = "1433";
String databaseName = "ProjectServer_Published";
String userName = "sa";
String password = "***";
MspDbSettings settings = new MspDbSettings(url+serverName+":"+portNumber+";databaseName="+databaseName+
         ";user=" + userName + ";password=" + password, UUID.fromString("E6426C44-D6CB-4B9C-AF16-48910ACE0F54"));
 
addJDBCDriver(new File("sqljdbc4.jar"));
 
Project project = new Project(settings);
project.save(dir + "output.xml", SaveFileFormat.XML);
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/tasks/java) | [Docs](https://docs.aspose.com/tasks/java/) | [Demos](https://products.aspose.app/tasks/family) | [API Reference](https://apireference.aspose.com/tasks/java) | [Examples](https://github.com/aspose-tasks/Aspose.Tasks-for-Java) | [Blog](https://blog.aspose.com/category/tasks/) | [Free Support](https://forum.aspose.com/c/tasks) | [Temporary License](https://purchase.aspose.com/temporary-license)
