module Asposetasksjava
  module AssignmentPercentWorkComplete
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        resource_assignments = project.getResourceAssignments().toList()

        # Parse through all the collected resource assignments
        i = 0
        while i < resource_assignments.size()
          ra = resource_assignments.get(i)
          puts "Percentage of the Completed Work: " + ra.get(Rjb::import('com.aspose.tasks.Asn').PERCENT_WORK_COMPLETE).toString()
          puts "--------------------------------------------------------"
          i +=1
        end    
    end
  end
end
