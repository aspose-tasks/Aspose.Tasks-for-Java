module Asposetasksjava
  module StopAndResumeAssignment
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        resource_assignments = project.getResourceAssignments().toList()

        # Parse through all the collected resource assignments
        i = 0
        while i < resource_assignments.size()
          ra = resource_assignments.get(i)
          if ra.get(Rjb::import('com.aspose.tasks.Asn').STOP).toString() == "1/1/2000"
            puts "NA"
          else
             puts ra.get(Rjb::import('com.aspose.tasks.Asn').STOP).toString()
          end

          if ra.get(Rjb::import('com.aspose.tasks.Asn').RESUME).toString() == "1/1/2000"
            puts "NA"
          else
            puts ra.get(Rjb::import('com.aspose.tasks.Asn').RESUME).toString()
          end
          i +=1
        end    
    end
  end
end
