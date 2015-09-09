module Asposetasksjava
  module AssignmentCost
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        resource_assignments = project.getResourceAssignments().toList()

        # Parse through all the collected resource assignments
        i = 0
        while i < resource_assignments.size()
          ra = resource_assignments.get(i)
          puts "COST: " + ra.get(Rjb::import('com.aspose.tasks.Asn').COST).to_string
          puts "ACWP: " + ra.get(Rjb::import('com.aspose.tasks.Asn').ACWP).to_string
          puts "BCWP: " + ra.get(Rjb::import('com.aspose.tasks.Asn').BCWP).to_string
          puts "BCWS: " + ra.get(Rjb::import('com.aspose.tasks.Asn').BCWS).to_string
          puts "--------------------------------------------------------"
          i +=1
        end    
    end
  end
end
