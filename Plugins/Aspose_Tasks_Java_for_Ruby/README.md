# Aspose_Tasks_Java_for_Ruby
Aspose.Tasks Java for Ruby is a gem that demonstrates / provides the Aspose.Tasks for Java API usage examples in Ruby by using Rjb - Ruby Java Bridge.

## Installation

Execute following command.

    $ gem install asposetasksjava

To download Aspose.Tasks for Java API to be used with these examples through RJB, Please navigate to:

http://www.aspose.com/community/files/72/java-components/aspose.tasks-for-java/default.aspx

Note: Create jars folder at root of the gem folder and copy downloaded Aspose.Tasks for java component into it.

For most complete documentation of the project, check Aspose.Tasks Java for Ruby confluence wiki link:

http://www.aspose.com/docs/display/tasksjava/1.+Aspose.Tasks+Java+For+Ruby

## Usage

You can get project version using following example code.

```ruby
require File.dirname(File.dirname(File.dirname(__FILE__))) + '/lib/asposetasksjava'
include Asposetasksjava
include Asposetasksjava::ProjectVersion
initialize_aspose_tasks
```
Lets understand the above code
* The first line makes sure that the Aspose.Tasks is loaded and available 
* Include the files that are required to access the Aspose.Tasks
* Initialize the libraries. The aspose JAVA classes are loaded from the path provided in the aspose.yml file