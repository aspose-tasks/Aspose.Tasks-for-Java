module Asposetasksjava
  module AssignmentVariance
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        resource_assignments = project.getResourceAssignments().toList()

        # Parse through all the collected resource assignments
        i = 0
        while i < resource_assignments.size()
          ra = resource_assignments.get(i)
          puts "Work Variance: " + ra.get(Rjb::import('com.aspose.tasks.Asn').WORK_VARIANCE).toString()
          puts "Cost Variance: " + ra.get(Rjb::import('com.aspose.tasks.Asn').COST_VARIANCE).toString()
          puts "Start Variance: " + ra.get(Rjb::import('com.aspose.tasks.Asn').START_VARIANCE).toString()
          puts "Finish Variance: " + ra.get(Rjb::import('com.aspose.tasks.Asn').FINISH_VARIANCE).toString()
          puts "--------------------------------------------------------"
          i +=1
        end    
    end
  end
end
