module Asposetasksjava
  module AssignmentOvertimeAndRemainingCosts
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        resource_assignments = project.getResourceAssignments().toList()

        # Parse through all the collected resource assignments
        i = 0
        while i < resource_assignments.size()
          ra = resource_assignments.get(i)
          puts "Overtime Cost: " + ra.get(Rjb::import('com.aspose.tasks.Asn').OVERTIME_COST).toString()
          puts "Overtime Work: " + ra.get(Rjb::import('com.aspose.tasks.Asn').OVERTIME_WORK).toString()
          puts "Remaining Cost: " + ra.get(Rjb::import('com.aspose.tasks.Asn').REMAINING_COST).toString()
          puts "Remaining Overtime Cost: " + ra.get(Rjb::import('com.aspose.tasks.Asn').REMAINING_OVERTIME_COST).toString()
          puts "Remaining Overtime Work: " + ra.get(Rjb::import('com.aspose.tasks.Asn').REMAINING_OVERTIME_WORK).toString()
          puts "--------------------------------------------------------"
          i +=1
        end    
    end
  end
end
